package com.phantom.wss.impl;

import com.alibaba.fastjson.JSON;
import com.phantom.comm.DateUtils;
import com.phantom.comm.NumUtils;
import com.phantom.comm.StringUtils;
import com.phantom.comm.enums.Flag;
import com.phantom.dao.TCoItemLevelDao;
import com.phantom.dao.TRfcLogDao;
import com.phantom.model.TCoItemLevel;
import com.phantom.model.TCoItemLevelExample;
import com.phantom.model.TPmProjectFeedDetail;
import com.phantom.model.TRfcLog;
import com.phantom.sap.comm.RfcManager;
import com.phantom.wss.ItemLevelIntf;
import com.phantom.sap.intf.comm.impl.SapCommIntfImpl;
import com.phantom.trans.ItemLevelTransEnum;
import com.phantom.trans.ProjectFeedTransEnum;
import com.sap.conn.jco.JCoField;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoStructure;
import com.sap.conn.jco.JCoTable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 物料层级接口实现类
 *
 * @author:phantomsaber
 * @version:2019/7/26 15:55
 * @email:phantomsaber@foxmail.com
 **/
@Component
@WebService(endpointInterface = "com.phantom.wss.ItemLevelIntf", serviceName = "ItemLevelIntf", targetNamespace = "http://cxf.temptation.cn/")
public class ItemLevelIntfImpl extends SapCommIntfImpl implements ItemLevelIntf {
    @Resource
    TCoItemLevelDao levelDao;

    @Resource
    TRfcLogDao rfcLogDao;

    private final String funcName = "ZFM_MES_002";

    @Override
    public String exec() {
        TRfcLog rfcLog = new TRfcLog();
        List<TRfcLog> logList = new ArrayList<>();
        rfcLog.setRL_FUNC_NAME(funcName + "-物料层级信息同步");

        try {
            /*-- version:2019/7/26 17:20 | desc:执行同步接口 --*/
            JCoFunction function = getFunction(funcName);
            RfcManager.execute(function);

            /*-- version:2019/7/26 17:20 | desc:接收接口返回参数 --*/
            JCoTable itOut = getTables("IT_OUT", function);

            Map<String, String> outPutMap = new HashMap<>(getInitialCapacity());
            for (JCoField jCoField : itOut) {
                outPutMap.put(jCoField.getName(), jCoField.getValue().toString());
            }
            rfcLog.setRL_EXPORT(StringUtils.getJsonStr(outPutMap));

            /*-- version:2019/7/26 17:20 | desc:保存 --*/
            for (int i = 0; i < itOut.getNumRows(); i++) {
                itOut.setRow(i);
                Boolean sflag = saveItemLevel(getOutMap(itOut));
                if(sflag){
                    rfcLog.setRL_FLAG(Flag.Y.toString());
                    rfcLog.setRL_MESSAGE(Flag.Y.getDesc());
                }else{
                    rfcLog.setRL_FLAG(Flag.N.toString());
                    rfcLog.setRL_MESSAGE(Flag.N.getDesc());
                }
            }
        } catch (Exception e) {
            rfcLog.setRL_FLAG(Flag.N.toString());
            rfcLog.setRL_MESSAGE(e.getMessage());
        }
        rfcLogDao.insert(rfcLog);
        return StringUtils.getJsonStr(JSON.toJSONString(rfcLog));
    }

    private Map<String, String> getOutMap(JCoTable itOut) {
        Map<String, String> outMap = new HashMap<>(getInitialCapacity());
        outMap.put(ItemLevelTransEnum.levelCode.getSapParam(), itOut.getString(ItemLevelTransEnum.levelCode.getSapParam()));
        outMap.put(ItemLevelTransEnum.levelNo.getSapParam(), itOut.getString(ItemLevelTransEnum.levelNo.getSapParam()));
        outMap.put(ItemLevelTransEnum.levelDesc.getSapParam(), itOut.getString(ItemLevelTransEnum.levelDesc.getSapParam()));
        outMap.put(ItemLevelTransEnum.levelEnd.getSapParam(), itOut.getString(ItemLevelTransEnum.levelEnd.getSapParam()));
        outMap.put(ItemLevelTransEnum.levelDataOpt.getSapParam(), itOut.getString(ItemLevelTransEnum.levelDataOpt.getSapParam()));
        return outMap;
    }

    private Boolean saveItemLevel(Map<String, String> paraMap) {
        Boolean flag = true;
        TCoItemLevel itemLevel = new TCoItemLevel();
        itemLevel.setID(StringUtils.getUUID());
        itemLevel.setDEPT_ID(StringUtils.getDefaultDeptId());
        itemLevel.setDATA_AUTH(StringUtils.getDefaultDataAuth());
        itemLevel.setCREATE_TIME(DateUtils.getCurDateTime());
        itemLevel.setCREATE_USER(StringUtils.getDefaultUserId());

        itemLevel.setLEVEL_CODE(paraMap.get(ItemLevelTransEnum.levelCode.getSapParam()));
        itemLevel.setLEVEL_NO(paraMap.get(ItemLevelTransEnum.levelNo.getSapParam()));
        itemLevel.setLEVEL_DESC(paraMap.get(ItemLevelTransEnum.levelDesc.getSapParam()));
        itemLevel.setLEVEL_END(paraMap.get(ItemLevelTransEnum.levelEnd.getSapParam()));
        itemLevel.setLEVEL_DATA_OPT(paraMap.get(ItemLevelTransEnum.levelDataOpt.getSapParam()));

        if (levelCodeNotExist(itemLevel.getLEVEL_CODE())) {
            levelDao.insert(itemLevel);
        } else {
            TCoItemLevelExample levelExample = new TCoItemLevelExample();
            TCoItemLevelExample.Criteria levelExampleCriteria = levelExample.createCriteria();
            levelExampleCriteria.andLEVEL_CODEEqualTo(itemLevel.getLEVEL_CODE());
            levelDao.updateByExample(itemLevel, levelExample);
        }

        return flag;
    }

    public Boolean levelCodeNotExist(String code) {
        Boolean flag = false;

        TCoItemLevelExample levelExample = new TCoItemLevelExample();
        TCoItemLevelExample.Criteria criteria = levelExample.createCriteria();
        criteria.andLEVEL_CODEEqualTo((code));

        try {
            List<TCoItemLevel> tCoItemLevels = levelDao.selectByExample(levelExample);
            if (tCoItemLevels.size() > 0) {
                flag = false;
            } else {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }

    /**
     * 获取接口参数
     *
     * @param function
     * @param feedDetail
     * @return
     */
    private JCoStructure getInPutParam(JCoFunction function, TPmProjectFeedDetail feedDetail) {
        JCoStructure inPutParam = function.getImportParameterList().getStructure("W_INPUT");
        inPutParam.setValue(ProjectFeedTransEnum.uuid.getSapParam(), feedDetail.getID());
        inPutParam.setValue(ProjectFeedTransEnum.projectId.getSapParam(), feedDetail.getPROJECT_ID());
        inPutParam.setValue(ProjectFeedTransEnum.curDate.getSapParam(), DateUtils.getCurDateStr());
        inPutParam.setValue(ProjectFeedTransEnum.curDateTime.getSapParam(), DateUtils.getCurTimeStr());
        inPutParam.setValue(ProjectFeedTransEnum.feedIndex.getSapParam(), feedDetail.getPROCESS_ORDER());
        inPutParam.setValue(ProjectFeedTransEnum.sysUserName.getSapParam(), "1");
        inPutParam.setValue(ProjectFeedTransEnum.itemCodeSn.getSapParam(), feedDetail.getMODEL_CODE());
        inPutParam.setValue(ProjectFeedTransEnum.postDate.getSapParam(), DateUtils.getCurDateStr());
        inPutParam.setValue(ProjectFeedTransEnum.workSpace.getSapParam(), feedDetail.getWORK_SPACE());
        inPutParam.setValue(ProjectFeedTransEnum.itemCode.getSapParam(), feedDetail.getITEM_CODE());
        inPutParam.setValue(ProjectFeedTransEnum.feedNum.getSapParam(), NumUtils.formatBigDecimal(feedDetail.getFEED_NUM().toString()));
        inPutParam.setValue(ProjectFeedTransEnum.lot.getSapParam(), feedDetail.getRAW_LOTNUMBER());

        if (feedDetail.getWAREHOUSE() != null) {
            inPutParam.setValue(ProjectFeedTransEnum.feedWarehouse.getSapParam(), feedDetail.getWAREHOUSE());
        } else {
            inPutParam.setValue(ProjectFeedTransEnum.feedWarehouse.getSapParam(), "3102");
        }

        inPutParam.setValue(ProjectFeedTransEnum.reverse.getSapParam(), "1");
        inPutParam.setValue(ProjectFeedTransEnum.sflag.getSapParam(), "N");
        inPutParam.setValue(ProjectFeedTransEnum.message.getSapParam(), "TEST");
        return inPutParam;
    }
}
