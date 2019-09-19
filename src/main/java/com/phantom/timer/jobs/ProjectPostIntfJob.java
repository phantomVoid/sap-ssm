package com.phantom.timer.jobs;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.phantom.comm.DateUtils;
import com.phantom.comm.StringUtils;
import com.phantom.comm.enums.IntfType;
import com.phantom.dao.*;
import com.phantom.model.*;
import com.phantom.sap.comm.RfcManager;
import com.phantom.sap.intf.comm.impl.SapCommIntfImpl;
import com.phantom.trans.ProjectPostTransEnum;
import com.phantom.wss.quartz.QuartzProjectFeedIntf;
import com.phantom.wss.quartz.impl.QuartzProjectFeedIntfImpl;
import com.sap.conn.jco.JCoField;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoStructure;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 工单缴库定时任务
 * @author:phantomsaber
 * @version:2019/9/19 9:16
 * @email:phantomsaber@foxmail.com
 **/
@Component("ProjectPostIntfJob")
public class ProjectPostIntfJob extends SapCommIntfImpl {
    final Logger log = Logger.getLogger(this.getClass());

    final String funcName = "ZFM_MES_006";

    @Resource
    TRfcLogDao rfcLogDao;

    @Resource
    TPmProjectPostDao projectPostDao;

    @Resource
    TPmProjectBaseDao projectBaseDao;

    @Resource
    TProjectSapLogDao sapLogDao;

    @Resource
    TProjectSapLogDetailDao sapLogDetailDao;

    @Resource
    TQuartzLogDao quartzLogDao;

    public void execute() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("4: >>> Quartz的任务调度-工单缴库接口[ProjectPostIntfJob]" + format.format(new Date()));

        try {
            String result = quartzExec();
            log.info("result: >>> " + result);
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }

    public String quartzExec() {
        String result = null;
        try {
            TPmProjectPostExample postExample = new TPmProjectPostExample();
            TPmProjectPostExample.Criteria postExampleCriteria = postExample.createCriteria();
            List<String> sflagList = new ArrayList<>();
            sflagList.add("NULL");
            sflagList.add("");
            sflagList.add("0");
            postExampleCriteria.andSFLAGIn(sflagList);

            List<TPmProjectPost> projectPostList = projectPostDao.selectByExample(postExample);

            for (TPmProjectPost projectPost : projectPostList) {
                result = ajaxExecByIds(StringUtils.toJsonArrStr(projectPost.getID()));

                TQuartzLog quartzLog = new TQuartzLog();
                quartzLog.setID(StringUtils.getUUID());
                quartzLog.setCREATE_TIME(DateUtils.getCurDateTime());
                quartzLog.setCREATE_USER(StringUtils.getDefaultUserId());
                quartzLog.setDATA_AUTH(StringUtils.getDefaultDataAuth());
                quartzLog.setDEPT_ID(StringUtils.getDefaultDeptId());

                quartzLog.setINTF_TYPE(IntfType.projectPost.getCode());
                quartzLog.setINTF_NAME(IntfType.projectPost.getFuncName());
                quartzLog.setPROJECT_ID(projectPost.getID());
                quartzLog.setITEM_CODE(projectPost.getITEM_SN());
                quartzLog.setITEM_CODE(projectPost.getITEM_CODE());
                quartzLog.setLOG_INFO(result);
                quartzLog.setSFLAG("Y");
                quartzLog.setMESSAGE("quartz");

                quartzLogDao.insert(quartzLog);

                log.info("projectId:"+projectPost.getPROJECT_ID()+"|result:"+result);
            }
        } catch (Exception e) {
            log.info(e.getMessage());
        }
        return result;
    }


    /**
     * exec ajaxExecByIds
     * @param idsJson id jsonArrayStr
     * @return
     */
    public String ajaxExecByIds(String idsJson) {
        TPmProjectPostExample postExample = new TPmProjectPostExample();
        TPmProjectPostExample.Criteria postCriteria = postExample.createCriteria();
        List<String> dataList = JSONObject.parseArray(idsJson, String.class);
        postCriteria.andIDIn(dataList);
        List<TPmProjectPost> projectPostList = projectPostDao.selectByExample(postExample);

        TRfcLog rfcLog = new TRfcLog();
        rfcLog.setRL_FUNC_NAME(funcName + "-工单缴库接口");
        rfcLog.setRL_IMPORT(StringUtils.getJsonStr(JSON.toJSONString(projectPostList)));

        List<TProjectSapLogDetail> logDetailList = new ArrayList<>();
        List<TProjectSapLog> sapLogList = new ArrayList<>();

        for (TPmProjectPost projectPost : projectPostList) {
            TPmProjectBase projectBase = projectBaseDao.selectByProjectId(projectPost.getPROJECT_ID());
            String productMaterial = projectBase.getPRODUCT_MATERIAL();
            int index = projectPostList.indexOf(projectPost);

            TProjectSapLogDetail sapLogDetail = doExec(projectPost, funcName,String.valueOf(index),productMaterial);

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
            }
        }


        TProjectSapLogDetailExample sapLogDetailExp = new TProjectSapLogDetailExample();
        TProjectSapLogExample sapLogExp = new TProjectSapLogExample();

        TProjectSapLogExample.Criteria sapLogCriteria = sapLogExp.createCriteria();
        TProjectSapLogDetailExample.Criteria sapLogDetailCriteria = sapLogDetailExp.createCriteria();

        for (TProjectSapLogDetail logDetail : logDetailList) {
            sapLogDetailCriteria.andPROJECT_IDEqualTo(logDetail.getPROJECT_ID());
            sapLogDetailCriteria.andITEM_SNEqualTo(logDetail.getITEM_SN());
            sapLogDetailCriteria.andITEM_CODEEqualTo(logDetail.getITEM_CODE());
            sapLogDetailCriteria.andINTF_NAMEEqualTo(funcName);

            List<TProjectSapLogDetail> curSapLogDetailList = sapLogDetailDao.selectByExample(sapLogDetailExp);

            if(curSapLogDetailList.size() > 0){
                logDetail.setEDIT_USER(StringUtils.getDefaultUserId());
                logDetail.setEDIT_TIME(DateUtils.getCurDateTime());
                sapLogDetailDao.updateByExample(logDetail, sapLogDetailExp);
            }else{
                sapLogDetailDao.insert(logDetail);
            }
        }

        for (TProjectSapLog sapLog : sapLogList) {
            sapLogCriteria.andPROJECT_IDEqualTo(sapLog.getPROJECT_ID());
            sapLogCriteria.andITEM_SNEqualTo(sapLog.getITEM_SN());
            sapLogCriteria.andINTF_NAMEEqualTo(funcName);

            List<TProjectSapLog> projectSapLogList = sapLogDao.selectByExample(sapLogExp);
            if(projectSapLogList.size() > 0){
                sapLog.setEDIT_USER(StringUtils.getDefaultUserId());
                sapLog.setEDIT_TIME(DateUtils.getCurDateTime());
                sapLogDao.updateByExample(sapLog, sapLogExp);
            }else{
                sapLogDao.insert(sapLog);
            }
        }

        rfcLog.setRL_EXPORT(StringUtils.getJsonStr(sapLogList));
        rfcLogDao.insert(rfcLog);

        return StringUtils.getJsonStr(sapLogList);
    }


    private TProjectSapLogDetail doExec(TPmProjectPost projectPost, String funcName,String index,String productMaterial){
        JCoParameterList outPut = null;
        try {
            JCoFunction function = getFunction(funcName);
            JCoParameterList inPut = function.getImportParameterList();
            JCoStructure inPutParam = getInPutParam(function, projectPost,index);
            inPut.setValue("W_INPUT",inPutParam);
            Map<String, String> inParamMap = new HashMap<>(getInitialCapacity());
            for (JCoField jCoField : inPutParam) {
                inParamMap.put(jCoField.getName(), jCoField.getValue().toString());
            }
            RfcManager.execute(function);
            outPut = function.getExportParameterList();
            return getSapDetailLog(projectPost, outPut,productMaterial);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * SAP工单同步日志明细
     * @param projectPost
     * @param outPut
     * @return
     */
    private TProjectSapLogDetail getSapDetailLog(TPmProjectPost projectPost,JCoParameterList outPut,String productMaterial){
        TProjectSapLogDetail sapLogDetail = new TProjectSapLogDetail();
        Map<String, String> outPutMap = new HashMap<>(getInitialCapacity());
        try {
            for (JCoField jCoField : outPut) {
                outPutMap.put(jCoField.getName(), jCoField.getValue().toString());
            }

            String sflag = outPut.getString("SFLAG");
            String message = outPut.getString("MESSAGE");
            String sapInfo = StringUtils.getJsonStr(outPutMap);

            sapLogDetail.setPROJECT_ID(projectPost.getPROJECT_ID());
            sapLogDetail.setITEM_SN(productMaterial);
            sapLogDetail.setITEM_CODE(projectPost.getITEM_CODE());
            sapLogDetail.setSFLAG(sflag);
            sapLogDetail.setMESSAGE(message);
            sapLogDetail.setSAP_INFO(sapInfo);

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
        sapLogDetail.setINTF_TYPE(IntfType.projectPost.getCode());
        sapLogDetail.setINTF_NAME(IntfType.projectPost.getFuncName());

        return sapLogDetail;
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
        sapLog.setINTF_TYPE(IntfType.projectPost.getCode());
        sapLog.setINTF_NAME(IntfType.projectPost.getFuncName());
        return sapLog;
    }

    /**
     * 获取SAP JCoStructure参数
     *
     * @param function
     * @param projectPost
     * @param index
     * @return
     */
    private JCoStructure getInPutParam(JCoFunction function, TPmProjectPost projectPost, String index) {
        JCoStructure inPutParam = function.getImportParameterList().getStructure("W_INPUT");
        inPutParam.setValue(ProjectPostTransEnum.zguid.getSapParam(), projectPost.getID());
        inPutParam.setValue(ProjectPostTransEnum.curDate.getSapParam(), DateUtils.getCurDateStr());
        inPutParam.setValue(ProjectPostTransEnum.curDateTime.getSapParam(), DateUtils.getCurTimeStr());
        inPutParam.setValue(ProjectPostTransEnum.Index.getSapParam(), index);
        inPutParam.setValue(ProjectPostTransEnum.sysUserName.getSapParam(), "1");
        inPutParam.setValue(ProjectPostTransEnum.itemCodeSn.getSapParam(), projectPost.getITEM_CODE());
        inPutParam.setValue(ProjectPostTransEnum.projectId.getSapParam(), projectPost.getPROJECT_ID());
        inPutParam.setValue(ProjectPostTransEnum.postDate.getSapParam(), DateUtils.getCurDateStr());
        inPutParam.setValue(ProjectPostTransEnum.workSpace.getSapParam(), projectPost.getWORK_SPACE());
        inPutParam.setValue(ProjectPostTransEnum.itemCode.getSapParam(), projectPost.getITEM_CODE());
        inPutParam.setValue(ProjectPostTransEnum.Num.getSapParam(), projectPost.getITEM_NUM());
        inPutParam.setValue(ProjectPostTransEnum.baseUnit.getSapParam(), projectPost.getBASE_UNIT());
        inPutParam.setValue(ProjectPostTransEnum.lot.getSapParam(), projectPost.getLOT());
        inPutParam.setValue(ProjectPostTransEnum.Warehouse.getSapParam(), projectPost.getWARE_HOUSE());
        inPutParam.setValue(ProjectPostTransEnum.reverse.getSapParam(), projectPost.getREVERSE());
        return inPutParam;
    }
}
