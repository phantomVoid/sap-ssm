package com.phantom.wss.impl;

import com.phantom.comm.DateUtils;
import com.phantom.comm.StringUtils;
import com.phantom.dao.TCoItemDao;
import com.phantom.dao.TRfcLogDao;
import com.phantom.model.TCoItem;
import com.phantom.model.TCoItemExample;
import com.phantom.model.TRfcLog;
import com.phantom.sap.comm.RfcManager;
import com.phantom.wss.ItemIntf;
import com.phantom.sap.intf.comm.impl.SapCommIntfImpl;
import com.phantom.trans.ItemTransEnum;
import com.sap.conn.jco.JCoField;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoTable;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 物料主数据接口实现类
 *
 * @author:phantomsaber
 * @version:2019/8/13 22:05
 * @email:phantomsaber@foxmail.com
 **/
@Component
@WebService(endpointInterface = "com.phantom.wss.ItemIntf", serviceName = "ItemIntf", targetNamespace = "http://cxf.temptation.cn/")
public class ItemIntfImpl extends SapCommIntfImpl implements ItemIntf {
    final Logger log = Logger.getLogger(this.getClass());

    @Resource
    TCoItemDao itemDao;

    @Resource
    TRfcLogDao logDao;

    private final String funcName = "ZFM_MES_001";

    private final String[] itemCodeArr = new String[]{"100000011","100000012","100000015","100000027","100000036","100000069","100000076","100000085","100000087","100000095","100000096","100000100","100000109","100000120","100000121","100000124","100000141","100000152","100000253","100000256","100000260","100000261","100000264","100000278","100000313","100000911","100001009","100001010","100001075","100001081","100001095","100001128","100001167","100001173","100001216","100001270","100001348","100001350","100001357","100001378","100001397","100001435","100001485","100001549","100001558","100001564","100001620","100001621","100001755","100001788","100001790","100001837","100001838","100002058","100002131","100002160","100002290","100002321","100002412","100002436","100002468","100002799","100002920","100002921","300000546","300005762","300005763","300005764","300005772","300018673","300018674","300041120","300052720","300061745","300062412","300063717","300069681","300069682","300078337","300078473","300079633","300082676","300082677","300082887","300089468","300093895","300100363","300102736","300109211","300112489","300115022","300115605","500040261","500048361","500054712","500065370","500065437","500066175","500066546","500068099","500068100","500068237","500072297","500075099","500078895","500080339","500084211","500086200","500087657","500088082"};

    @Override
    public String ajaxExec(String low, String hight) {
        TRfcLog rfcLog = new TRfcLog();
        List<TRfcLog> logList = new ArrayList<>();
        rfcLog.setRL_FUNC_NAME(funcName+"-物料主数据同步");
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
            if(itemList.size()>0){
                item = itemList.get(0);
                item.setEDIT_USER(StringUtils.getDefaultUserId());
                item.setEDIT_TIME(DateUtils.getCurDateTime());
                itemDao.updateByExample(item, itemExample);
            }else{
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
            logList.add(getLog(itOut,itMatnr, outPut));
        }

        rfcLog.setRL_EXPORT(StringUtils.getJsonStr(logList));
        logDao.insert(rfcLog);

        return StringUtils.getJsonStr(rfcLog);
    }

    @Override
    public String exec() {
        TRfcLog rfcLog = new TRfcLog();
        List<TRfcLog> logList = new ArrayList<>();
        rfcLog.setRL_FUNC_NAME(funcName+"-物料主数据同步");
        JCoFunction function = getFunction(funcName);
        JCoParameterList importParameterList = getImport(function);
        importParameterList.setValue("IV_DATE", DateUtils.getCurDateTimeStr());
        importParameterList.setValue("IV_TIME", DateUtils.getCurTimeStr());

        JCoParameterList tableParameterList = function.getTableParameterList();

        JCoTable itOut = tableParameterList.getTable("IT_OUT");
        JCoTable itMatnr = tableParameterList.getTable("IT_MATNR");

//        for (String curItem : itemCodeArr) {
//            itMatnr.appendRow();
//            itMatnr.setValue("SIGN", "I");
//            itMatnr.setValue("OPTION", "CP");
//            itMatnr.setValue("LOW", "*"+curItem+"*");
//            itMatnr.setValue("HIGH", "");
//        }

        itMatnr.appendRow();
        itMatnr.setValue("SIGN", "I");
        itMatnr.setValue("OPTION", "BT");
        itMatnr.setValue("LOW", "000000000500000001");
        itMatnr.setValue("HIGH", "000000000599999999");

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
            if(itemList.size()>0){
                item = itemList.get(0);
                item.setEDIT_USER(StringUtils.getDefaultUserId());
                item.setEDIT_TIME(DateUtils.getCurDateTime());
                itemDao.updateByExample(item, itemExample);
            }else{
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
            logList.add(getLog(itOut,itMatnr, outPut));
        }

        rfcLog.setRL_EXPORT(StringUtils.getJsonStr(logList));
        logDao.insert(rfcLog);

        return StringUtils.getJsonStr(rfcLog);
    }
}
