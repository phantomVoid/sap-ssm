package com.phantom.timer.jobs;

import com.phantom.comm.DateUtils;
import com.phantom.comm.StringUtils;
import com.phantom.dao.*;
import com.phantom.model.*;
import com.phantom.sap.comm.RfcManager;
import com.phantom.sap.intf.comm.impl.SapCommIntfImpl;
import com.phantom.trans.ItemTransEnum;
import com.sap.conn.jco.JCoField;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoTable;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

@Component("ItemIntfJob")
public class ItemIntfJob extends SapCommIntfImpl {
    final Logger log = Logger.getLogger(this.getClass());

    private final String funcName = "ZFM_MES_001";

    @Resource
    TCoItemDao itemDao;

    @Resource
    TRfcLogDao logDao;

    @Resource
    TProjectSapLogDao sapLogDao;

    @Resource
    TProjectSapLogDetailDao sapLogDetailDao;

    @Resource
    TPmProjectBaseDao projectBaseDao;

    public void execute() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("1: >>> Quartz的任务调度-物料同步接口[ItemIntfJob]" + format.format(new Date()));

        List<String> productNameList = new ArrayList<>();
        productNameList.add("NULL");
        productNameList.add("");
        try {
            TPmProjectBaseExample projectBaseExample = new TPmProjectBaseExample();
            TPmProjectBaseExample.Criteria baseExampleCriteria = projectBaseExample.createCriteria();
            baseExampleCriteria.andPRODUCT_NAMEIn(productNameList);

            List<TPmProjectBase> projectBaseList = projectBaseDao.selectByExample(projectBaseExample);

            for (TPmProjectBase projectBase : projectBaseList) {
                String itemSn = projectBase.getPRODUCT_MATERIAL();

                itemSn = "000000000" + itemSn;
                String result = ajaxExec(itemSn, itemSn);

                log.info("result: >>> " + result);
            }
        } catch (Exception e) {
            log.info(e.getMessage());
        }

    }

    public String ajaxExec(String low, String hight) {
        TRfcLog rfcLog = new TRfcLog();
        List<TRfcLog> logList = new ArrayList<>();
        rfcLog.setRL_FUNC_NAME(funcName + "-物料主数据同步");
        JCoFunction function = getFunction(funcName);
        JCoParameterList importParameterList = getImport(function);
        importParameterList.setValue("IV_DATE", DateUtils.getCurDateTimeStr());
        importParameterList.setValue("IV_TIME", DateUtils.getCurTimeStr());

        JCoParameterList tableParameterList = function.getTableParameterList();

        JCoTable itOut = tableParameterList.getTable("IT_OUT");
        JCoTable itMatnr = tableParameterList.getTable("IT_MATNR");

        itMatnr.appendRow();
        itMatnr.setValue("SIGN", "I");
        itMatnr.setValue("OPTION", "BT");
        itMatnr.setValue("LOW", low);
        itMatnr.setValue("HIGH", hight);

        tableParameterList.setValue("IT_MATNR", itMatnr);
        RfcManager.execute(function);

        JCoParameterList outPut = getExport(function);

        Map<String, String> itMatnrMap = new HashMap<>();
        for (JCoField jCoField : itMatnr) {
            itMatnrMap.put(jCoField.getName(), jCoField.getValue().toString());
        }
        rfcLog.setRL_IMPORT(StringUtils.getJsonStr(itMatnrMap));

        for (int i = 0; i < itOut.getNumRows(); i++) {
            itOut.setRow(i);
            String itemCode = StringUtils.formatZero(itOut.getString(ItemTransEnum.itemCode.getSapParam()));

            TCoItemExample itemExample = new TCoItemExample();
            TCoItemExample.Criteria itemExampleCriteria = itemExample.createCriteria();
            itemExampleCriteria.andCI_ITEM_CODEEqualTo(itemCode);

            List<TCoItem> itemList = itemDao.selectByExample(itemExample);
            TCoItem item = new TCoItem();
            if (itemList.size() > 0) {
                item = itemList.get(0);
                item.setEDIT_USER(StringUtils.getDefaultUserId());
                item.setEDIT_TIME(DateUtils.getCurDateTime());
                itemDao.updateByExample(item, itemExample);
            } else {
                item.setID(StringUtils.getUUID());
                item.setCREATE_TIME(DateUtils.getCurDateTime());
                item.setCREATE_USER(StringUtils.getDefaultUserId());
                item.setDATA_AUTH(StringUtils.getDefaultDataAuth());

                item.setCI_ITEM_CODE(itemCode);
                item.setCI_ITEM_NAME(itOut.getString(ItemTransEnum.itemName.getSapParam()));
                item.setCI_ITEM_SPEC(itOut.getString(ItemTransEnum.itemSpec.getSapParam()));
                item.setCI_GROUP_ID(itOut.getString(StringUtils.formatZero(ItemTransEnum.levelGroup.getSapParam())));
                item.setSTOCK_CODE(itOut.getString(ItemTransEnum.stockCode.getSapParam()));
                item.setSAP_COLOR_CODE(itOut.getString(ItemTransEnum.colorCode.getSapParam()));
                item.setSAP_LEVEL_GROUP(itOut.getString(ItemTransEnum.levelGroup.getSapParam()));
                item.setSAP_GROSS_WEIGHT(itOut.getString(ItemTransEnum.grossWeight.getSapParam()));
                item.setSAP_NET_WEIGHT(itOut.getString(ItemTransEnum.netWeight.getSapParam()));
                item.setSAP_WEIGHT_UNIT(itOut.getString(ItemTransEnum.weightUnit.getSapParam()));

                item.setCI_UNIT(itOut.getString(ItemTransEnum.baseUnit.getSapParam()));
                item.setSAP_BASE_UNIT(itOut.getString(ItemTransEnum.baseUnit.getSapParam()));
                item.setSAP_IS_DEL(itOut.getString(ItemTransEnum.isDel.getSapParam()));
                item.setSAP_IS_CONFIG(itOut.getString(ItemTransEnum.isConfigurable.getSapParam()));
                itemDao.insert(item);
            }
            logList.add(getLog(itOut, itMatnr, outPut));
        }

        rfcLog.setRL_EXPORT(StringUtils.getJsonStr(logList));
        logDao.insert(rfcLog);

        return StringUtils.getJsonStr(rfcLog);
    }
}
