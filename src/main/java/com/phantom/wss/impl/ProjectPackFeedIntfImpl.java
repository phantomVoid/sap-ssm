package com.phantom.wss.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.phantom.comm.DateUtils;
import com.phantom.comm.NumUtils;
import com.phantom.comm.StringUtils;
import com.phantom.comm.enums.IntfType;
import com.phantom.dao.*;
import com.phantom.model.*;
import com.phantom.sap.comm.RfcManager;
import com.phantom.wss.ProjectPackFeedIntf;
import com.phantom.sap.intf.comm.impl.SapCommIntfImpl;
import com.phantom.trans.ProjectFeedTransEnum;
import com.sap.conn.jco.JCoField;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoStructure;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工单投料接口实现类
 *
 * @author:phantomsaber
 * @version:2019/7/26 15:55
 * @email:phantomsaber@foxmail.com
 **/

@Component
@WebService(endpointInterface = "com.phantom.wss.ProjectPackFeedIntf", serviceName = "ProjectPackFeedIntf", targetNamespace = "http://cxf.temptation.cn/")
public class ProjectPackFeedIntfImpl extends SapCommIntfImpl implements ProjectPackFeedIntf {
    final Logger log = Logger.getLogger(this.getClass());

    final String funcName = "ZFM_MES_005";

    @Resource
    TProjectPackFeedDao packFeedDao;

    @Resource
    TPmProjectPostDao postDao;

    @Resource
    TRfcLogDao rfcLogDao;

    @Resource
    TProjectSapLogDao sapLogDao;

    @Resource
    TProjectSapLogDetailDao sapLogDetailDao;

    @Resource
    TPmProjectBaseDao projectBaseDao;

    @Override
    public String ajaxRedoBySapLogDetail(String logDetailIdsJson) {
        List<String> dataList = JSONObject.parseArray(logDetailIdsJson, String.class);
        TProjectSapLogDetailExample sapLogDetailExample = new TProjectSapLogDetailExample();
        TProjectSapLogDetailExample.Criteria sapDetailCri = sapLogDetailExample.createCriteria();
        sapDetailCri.andIDIn(dataList);

        /**
         * 获取log对象
         */
        List<TProjectSapLogDetail> logDetailList = sapLogDetailDao.selectByExample(sapLogDetailExample);
        List<TProjectSapLog> sapLogList = new ArrayList<>();

        List<String> projectIdList = new ArrayList<>();
        List<String> itemCodeList = new ArrayList<>();
        List<String> itemSnList = new ArrayList<>();

        for (TProjectSapLogDetail sapLogDetail : logDetailList) {
            if(logDetailList.indexOf(sapLogDetail.getPROJECT_ID())<1){
                projectIdList.add(sapLogDetail.getPROJECT_ID());
                itemCodeList.add(sapLogDetail.getITEM_CODE());
                itemSnList.add(sapLogDetail.getITEM_SN());
            }
        }

        TProjectPackFeedExample packFeedExample = new TProjectPackFeedExample();
        TProjectPackFeedExample.Criteria packFeedExampleCriteria = packFeedExample.createCriteria();

        packFeedExampleCriteria.andPROJECT_IDIn(projectIdList);
        packFeedExampleCriteria.andITEM_CODEIn(itemCodeList);
//        packFeedExampleCriteria.andSFLAGIsNull();

        JSONObject.parseArray(logDetailIdsJson, String.class);
        List<TProjectPackFeed> packFeedList = packFeedDao.selectByExample(packFeedExample);

        List<TProjectSapLogDetail> resultLogDetailList = new ArrayList<>();
        List<TPmProjectPost> resultPostList = new ArrayList<>();

        TRfcLog rfcLog = new TRfcLog();
        rfcLog.setRL_FUNC_NAME(funcName+"-工单投料(包装单)");
        rfcLog.setRL_IMPORT(JSON.toJSONString(packFeedList));

        for (TProjectPackFeed packFeed : packFeedList) {
            int index = packFeedList.indexOf(packFeed);
            TPmProjectBase projectBase = projectBaseDao.selectByProjectId(packFeed.getPROJECT_ID());
            String productMaterial = projectBase.getPRODUCT_MATERIAL();

            TProjectSapLogDetail sapLogDetail = doExec(packFeed, funcName,String.valueOf(index),productMaterial);
            resultLogDetailList.add(sapLogDetail);
        }

        for (TProjectSapLogDetail sapLogDetail : resultLogDetailList) {
            sapLogDetail.setEDIT_TIME(DateUtils.getCurDateTime());
            sapLogDetail.setEDIT_USER(StringUtils.getDefaultUserId());
            sapDetailCri.andPROJECT_IDEqualTo(sapLogDetail.getPROJECT_ID());
            sapLogDetailDao.updateByExample(sapLogDetail, sapLogDetailExample);
        }

        TPmProjectPostExample postExample = new TPmProjectPostExample();
        TPmProjectPostExample.Criteria postCri = postExample.createCriteria();
        postCri.andPROJECT_IDIn(projectIdList);
        postCri.andITEM_CODEIn(itemSnList);

        List<TPmProjectPost> projectPostList = postDao.selectByExample(postExample);

        for (TPmProjectPost projectPost : projectPostList) {
            projectPost.setEDIT_TIME(DateUtils.getCurDateTime());
            projectPost.setEDIT_USER(StringUtils.getDefaultUserId());
            postCri.andPROJECT_IDEqualTo(projectPost.getPROJECT_ID());
            postDao.updateByExample(projectPost, postExample);
        }
        return StringUtils.getJsonStr(resultLogDetailList);
    }

    @Transactional
    @Override
    public String ajaxExecByIds(String idsJson) {
        TPmProjectPostExample postExample = new TPmProjectPostExample();
        TPmProjectPostExample.Criteria postCriteria = postExample.createCriteria();
        List<String> postList = JSONObject.parseArray(idsJson, String.class);
        postCriteria.andIDIn(postList);
        List<TPmProjectPost> projectPostList = postDao.selectByExample(postExample);

        List<String> dataList = new ArrayList<>();

        for (TPmProjectPost projectPost : projectPostList) {
            dataList.add(projectPost.getPROJECT_ID());
        }

        TProjectPackFeedExample packFeedExample = new TProjectPackFeedExample();
        TProjectPackFeedExample.Criteria packFeedExampleCriteria = packFeedExample.createCriteria();

        packFeedExampleCriteria.andPROJECT_IDIn(dataList);
        packFeedExampleCriteria.andSFLAGIsNull();
        JSONObject.parseArray(idsJson, String.class);
        List<TProjectPackFeed> packFeedList = packFeedDao.selectByExample(packFeedExample);

        TRfcLog rfcLog = new TRfcLog();
        rfcLog.setRL_FUNC_NAME(funcName+"-工单投料(包装单)");
        rfcLog.setRL_IMPORT(JSON.toJSONString(packFeedList));

        List<TProjectSapLogDetail> logDetailList = new ArrayList<>();
        List<TProjectSapLog> sapLogList = new ArrayList<>();

        for (TProjectPackFeed packFeed : packFeedList) {

            TPmProjectBase projectBase = projectBaseDao.selectByProjectId(packFeed.getPROJECT_ID());
            String productMaterial = projectBase.getPRODUCT_MATERIAL();
            int index = packFeedList.indexOf(packFeed);

            TProjectSapLogDetail sapLogDetail = doExec(packFeed, funcName,String.valueOf(index),productMaterial);

            if(sapLogDetail!=null){
                String sflag = sapLogDetail.getSFLAG();

                rfcLog.setRL_FLAG(sflag);
                logDetailList.add(sapLogDetail);

                TProjectSapLog projectSapLog = getSapLog(sapLogDetail, StringUtils.getJsonStr(logDetailList));
                if(sapLogList.size() > 0){
                    for (TProjectSapLog sapLog : sapLogList) {
                        if (sapLog.getPROJECT_ID()!= projectSapLog.getPROJECT_ID() && !(sapLog.getPROJECT_ID()).equalsIgnoreCase(projectSapLog.getPROJECT_ID())) {
                            sapLogList.add(sapLog);
                        }
                    }
                }else{
                    sapLogList.add(projectSapLog);
                }
                /*
                if("Y" != sflag && !("Y").equalsIgnoreCase(sflag)){
                    break;
                }
                */
            }
        }

        for (TProjectSapLogDetail logDetail : logDetailList) {
            sapLogDetailDao.insert(logDetail);
        }

        for (TProjectSapLog sapLog : sapLogList) {
            sapLogDao.insert(sapLog);
        }

        rfcLog.setRL_EXPORT(StringUtils.getJsonStr(sapLogList));
        rfcLogDao.insert(rfcLog);

        return StringUtils.getJsonStr(sapLogList);
    }

    /**
     * 获取SAP工单同步日志
     * @param sapLogDetail
     * @param sapInfo
     * @return
     */
    private TProjectSapLog getSapLog(TProjectSapLogDetail sapLogDetail,String sapInfo){
        TProjectSapLog sapLog = new TProjectSapLog();
        sapLog.setPROJECT_ID(sapLogDetail.getPROJECT_ID());
        sapLog.setITEM_SN(sapLogDetail.getITEM_SN());
        sapLog.setSFLAG(sapLogDetail.getSFLAG());
        sapLog.setMESSAGE(sapLogDetail.getMESSAGE());
        sapLog.setSAP_INFO(sapInfo);

        sapLog.setID(StringUtils.getUUID());
        sapLog.setCREATE_USER(StringUtils.getDefaultUserId());
        sapLog.setDEPT_ID(StringUtils.getDefaultDeptId());
        sapLog.setDATA_AUTH(StringUtils.getDefaultDataAuth());
        sapLog.setCREATE_TIME(DateUtils.getCurDateTime());
        sapLog.setINTF_TYPE(IntfType.packFeed.getCode());
        sapLog.setINTF_NAME(IntfType.packFeed.getFuncName());
        return sapLog;
    }

    @Override
    public String ajaxExecByPorjectIds(String projecrIdsJson) {
        return null;
    }

    private TProjectSapLogDetail doExec(TProjectPackFeed packFeed, String funcName,String index,String productMaterial){
        JCoParameterList outPut = null;
        try {
            JCoFunction function = getFunction(funcName);
            JCoParameterList inPut = function.getImportParameterList();
            JCoStructure inPutParam = getInPutParam(function, packFeed,index);
            inPut.setValue("W_INPUT",inPutParam);
            Map<String, String> inParamMap = new HashMap<>(getInitialCapacity());
            for (JCoField jCoField : inPutParam) {
                inParamMap.put(jCoField.getName(), jCoField.getValue().toString());
            }
            RfcManager.execute(function);
            outPut = function.getExportParameterList();
            return getSapDetailLog(packFeed, outPut,productMaterial);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * SAP工单同步日志明细
     * @param packFeed
     * @param outPut
     * @return
     */
    private TProjectSapLogDetail getSapDetailLog(TProjectPackFeed packFeed,JCoParameterList outPut,String productMaterial){
        TProjectSapLogDetail sapLogDetail = new TProjectSapLogDetail();
        Map<String, String> outPutMap = new HashMap<>(getInitialCapacity());
        try {
            for (JCoField jCoField : outPut) {
                outPutMap.put(jCoField.getName(), jCoField.getValue().toString());
            }

            String sflag = outPut.getString("SFLAG");
            String message = outPut.getString("MESSAGE");
            String sapInfo = StringUtils.getJsonStr(outPutMap);

            sapLogDetail.setPROJECT_ID(packFeed.getPROJECT_ID());
            sapLogDetail.setITEM_SN(productMaterial);
            sapLogDetail.setITEM_CODE(packFeed.getITEM_CODE());
            sapLogDetail.setSFLAG(sflag);
            sapLogDetail.setMESSAGE(message);
            sapLogDetail.setSAP_INFO(sapInfo);

            TProjectPackFeedExample packFeedExample = new TProjectPackFeedExample();
            TProjectPackFeedExample.Criteria packFeedCriteria = packFeedExample.createCriteria();
//            packFeedCriteria.andIDEqualTo(packFeed.getID());
            packFeedCriteria.andPROJECT_IDEqualTo(packFeed.getPROJECT_ID());
            packFeedCriteria.andITEM_CODEEqualTo(packFeed.getITEM_CODE());

        } catch (Exception e) {
            sapLogDetail.setSFLAG("N");
            sapLogDetail.setMESSAGE(e.getMessage());
            sapLogDetail.setSAP_INFO(e.toString());
        }
        sapLogDetail.setID(StringUtils.getUUID());
        sapLogDetail.setCREATE_USER(StringUtils.getDefaultUserId());
        sapLogDetail.setDEPT_ID(StringUtils.getDefaultDeptId());
        sapLogDetail.setDATA_AUTH(StringUtils.getDefaultDataAuth());
        sapLogDetail.setCREATE_TIME(DateUtils.getCurDateTime());
        sapLogDetail.setINTF_TYPE(IntfType.packFeed.getCode());
        sapLogDetail.setINTF_NAME(IntfType.packFeed.getFuncName());

        return sapLogDetail;
    }

    private JCoStructure getInPutParam(JCoFunction function, TProjectPackFeed packFeed,String index){
        JCoStructure inPutParam = function.getImportParameterList().getStructure("W_INPUT");
        inPutParam.setValue(ProjectFeedTransEnum.zguid.getSapParam(),packFeed.getID());
        inPutParam.setValue(ProjectFeedTransEnum.projectId.getSapParam(),packFeed.getPROJECT_ID());
        inPutParam.setValue(ProjectFeedTransEnum.curDate.getSapParam(),DateUtils.getCurDateStr());
        inPutParam.setValue(ProjectFeedTransEnum.curDateTime.getSapParam(), DateUtils.getCurTimeStr());
        inPutParam.setValue(ProjectFeedTransEnum.feedIndex.getSapParam(), index);
        inPutParam.setValue(ProjectFeedTransEnum.sysUserName.getSapParam(), "1");
        inPutParam.setValue(ProjectFeedTransEnum.itemCodeSn.getSapParam(), packFeed.getITEM_CODE());
        inPutParam.setValue(ProjectFeedTransEnum.postDate.getSapParam(), DateUtils.getCurDateStr());
        inPutParam.setValue(ProjectFeedTransEnum.workSpace.getSapParam(), "");
        inPutParam.setValue(ProjectFeedTransEnum.itemCode.getSapParam(), packFeed.getITEM_CODE());
        inPutParam.setValue(ProjectFeedTransEnum.feedNum.getSapParam(), NumUtils.formatBigDecimal(packFeed.getPACK_NUM().toString()));
        inPutParam.setValue(ProjectFeedTransEnum.lot.getSapParam(), "");
//        inPutParam.setValue(ProjectFeedTransEnum.workSpace.getSapParam(), packFeed.getWORK_SPACE());
//        inPutParam.setValue(ProjectFeedTransEnum.lot.getSapParam(), feedDetail.getRAW_LOTNUMBER());
//        inPutParam.setValue(ProjectFeedTransEnum.feedWarehouse.getSapParam(), feedDetail.getWAREHOUSE());

        inPutParam.setValue(ProjectFeedTransEnum.workSpace.getSapParam(), packFeed.getWORK_SPACE());
        if(StringUtils.isEmpty(packFeed.getWARE_HOUSE())){
            inPutParam.setValue(ProjectFeedTransEnum.feedWarehouse.getSapParam(), "3107");
        }else{
            inPutParam.setValue(ProjectFeedTransEnum.feedWarehouse.getSapParam(), packFeed.getWARE_HOUSE());
        }

        inPutParam.setValue(ProjectFeedTransEnum.reverse.getSapParam(), "1");
        inPutParam.setValue(ProjectFeedTransEnum.sflag.getSapParam(), "N");
        inPutParam.setValue(ProjectFeedTransEnum.message.getSapParam(), "TEST");
        return inPutParam;
    }
}
