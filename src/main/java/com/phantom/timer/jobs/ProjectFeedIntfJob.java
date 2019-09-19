package com.phantom.timer.jobs;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.phantom.comm.DateUtils;
import com.phantom.comm.NumUtils;
import com.phantom.comm.StringUtils;
import com.phantom.comm.enums.IntfType;
import com.phantom.dao.*;
import com.phantom.model.*;
import com.phantom.sap.comm.RfcManager;
import com.phantom.sap.intf.comm.impl.SapCommIntfImpl;
import com.phantom.trans.ProjectFeedTransEnum;
import com.phantom.wss.quartz.QuartzProjectFeedIntf;
import com.phantom.wss.quartz.impl.QuartzProjectFeedIntfImpl;
import com.sap.conn.jco.JCoField;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoStructure;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 制造单投料定时任务
 * @author:phantomsaber
 * @version:2019/9/19 9:16
 * @email:phantomsaber@foxmail.com
 **/
@Component("ProjectFeedIntfJob")
public class ProjectFeedIntfJob extends SapCommIntfImpl {
    final Logger log = Logger.getLogger(this.getClass());

    final String funcName = "ZFM_MES_005";

    @Resource
    TPmProjectFeedDetailDao feedDetailDao;

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

    @Resource
    TQuartzLogDao quartzLogDao;

    public void execute() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("2: >>> Quartz的任务调度-制造单投料接口[ProjectFeedIntfJob]" + format.format(new Date()));

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

            List<TPmProjectPost> projectPostList = postDao.selectByExample(postExample);

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
     * do ajaxExecByIds
     * @param idsJson id jsonArrayStr
     * @return
     */
    public String ajaxExecByIds(String idsJson) {
        TPmProjectFeedDetailExample feedDetailExample = new TPmProjectFeedDetailExample();
        TPmProjectFeedDetailExample.Criteria feedDetailCriteria = feedDetailExample.createCriteria();
        List<String> postList = JSONObject.parseArray(idsJson, String.class);

        TPmProjectPostExample postExample = new TPmProjectPostExample();
        postExample.createCriteria().andIDIn(postList);
        List<TPmProjectPost> projectPostList = postDao.selectByExample(postExample);

        List<String> dataList = new ArrayList<>();
        for (TPmProjectPost tPmProjectPost : projectPostList) {
            dataList.add(tPmProjectPost.getPROJECT_ID());
        }

        feedDetailCriteria.andPROJECT_IDIn(dataList);
        List<TPmProjectFeedDetail> feedDetailList = feedDetailDao.selectByExample(feedDetailExample);

        TRfcLog rfcLog = new TRfcLog();
        rfcLog.setRL_FUNC_NAME(funcName+"-工单投料(制造单)");
        rfcLog.setRL_IMPORT(JSON.toJSONString(feedDetailList));

        List<TProjectSapLogDetail> logDetailList = new ArrayList<>();
        List<TProjectSapLog> sapLogList = new ArrayList<>();

        for (TPmProjectFeedDetail feedDetail : feedDetailList) {

            TPmProjectBase projectBase = projectBaseDao.selectByProjectId(feedDetail.getPROJECT_ID());
            feedDetail.setMODEL_CODE(projectBase.getPRODUCT_MATERIAL());

            TProjectSapLogDetail sapLogDetail = doExec(feedDetail, funcName);

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
     * 接口执行方法
     * @param feedDetail
     * @param funcName
     * @return
     */
    public TProjectSapLogDetail doExec(TPmProjectFeedDetail feedDetail, String funcName){
        JCoParameterList outPut = null;
        try {
            JCoFunction function = getFunction(funcName);
            JCoParameterList inPut = function.getImportParameterList();
            JCoStructure inPutParam = getInPutParam(function, feedDetail);
            inPut.setValue("W_INPUT",inPutParam);
            Map<String, String> inParamMap = new HashMap<>(getInitialCapacity());
            for (JCoField jCoField : inPutParam) {
                inParamMap.put(jCoField.getName(), jCoField.getValue().toString());
            }
            RfcManager.execute(function);
            outPut = function.getExportParameterList();
            return getSapDetailLog(feedDetail, outPut);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * SAP工单同步日志明细
     * @param feedDetail
     * @param outPut
     * @return
     */
    private TProjectSapLogDetail getSapDetailLog(TPmProjectFeedDetail feedDetail,JCoParameterList outPut){
        TProjectSapLogDetail sapLogDetail = new TProjectSapLogDetail();
        Map<String, String> outPutMap = new HashMap<>(getInitialCapacity());
        try {
            for (JCoField jCoField : outPut) {
                outPutMap.put(jCoField.getName(), jCoField.getValue().toString());
            }

            String sflag = outPut.getString("SFLAG");
            String message = outPut.getString("MESSAGE");
            String sapInfo = StringUtils.getJsonStr(outPutMap);

            sapLogDetail.setPROJECT_ID(feedDetail.getPROJECT_ID());
            sapLogDetail.setITEM_SN(feedDetail.getMODEL_CODE());
            sapLogDetail.setITEM_CODE(feedDetail.getITEM_CODE());
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
        sapLogDetail.setINTF_TYPE(IntfType.projectFeed.getCode());
        sapLogDetail.setINTF_NAME(IntfType.projectFeed.getFuncName());

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
        sapLog.setINTF_TYPE(IntfType.projectFeed.getCode());
        sapLog.setINTF_NAME(IntfType.projectFeed.getFuncName());
        return sapLog;
    }


    /**
     * 获取接口参数
     * @param function
     * @param feedDetail
     * @return
     */
    private JCoStructure getInPutParam(JCoFunction function, TPmProjectFeedDetail feedDetail){
        JCoStructure inPutParam = function.getImportParameterList().getStructure("W_INPUT");
        inPutParam.setValue(ProjectFeedTransEnum.zguid.getSapParam(),feedDetail.getID());
        inPutParam.setValue(ProjectFeedTransEnum.projectId.getSapParam(),feedDetail.getPROJECT_ID());
        inPutParam.setValue(ProjectFeedTransEnum.curDate.getSapParam(),DateUtils.getCurDateStr());
        inPutParam.setValue(ProjectFeedTransEnum.curDateTime.getSapParam(), DateUtils.getCurTimeStr());
        inPutParam.setValue(ProjectFeedTransEnum.feedIndex.getSapParam(), feedDetail.getPROCESS_ORDER());
        inPutParam.setValue(ProjectFeedTransEnum.sysUserName.getSapParam(), "1");
        inPutParam.setValue(ProjectFeedTransEnum.itemCodeSn.getSapParam(), feedDetail.getMODEL_CODE());
        inPutParam.setValue(ProjectFeedTransEnum.postDate.getSapParam(), DateUtils.getCurDateStr());
        inPutParam.setValue(ProjectFeedTransEnum.workSpace.getSapParam(), feedDetail.getWORK_SPACE());
        inPutParam.setValue(ProjectFeedTransEnum.itemCode.getSapParam(), feedDetail.getITEM_CODE());
        inPutParam.setValue(ProjectFeedTransEnum.feedNum.getSapParam(), NumUtils.formatBigDecimal(feedDetail.getFEED_NUM().toString()));
        inPutParam.setValue(ProjectFeedTransEnum.lot.getSapParam(), feedDetail.getRAW_LOTNUMBER());

        if(StringUtils.isEmpty(feedDetail.getWAREHOUSE())){
            inPutParam.setValue(ProjectFeedTransEnum.feedWarehouse.getSapParam(), "3107");
        }else{
            inPutParam.setValue(ProjectFeedTransEnum.feedWarehouse.getSapParam(), feedDetail.getWAREHOUSE());
        }

        inPutParam.setValue(ProjectFeedTransEnum.reverse.getSapParam(), "1");
        inPutParam.setValue(ProjectFeedTransEnum.sflag.getSapParam(), "N");
        inPutParam.setValue(ProjectFeedTransEnum.message.getSapParam(), "TEST");
        return inPutParam;
    }
}
