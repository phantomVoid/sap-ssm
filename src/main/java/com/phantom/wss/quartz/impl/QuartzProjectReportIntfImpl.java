package com.phantom.wss.quartz.impl;

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
import com.phantom.trans.ProjectReportTransEnum;
import com.phantom.wss.ProjectReportIntf;
import com.phantom.wss.quartz.QuartzProjectReportIntf;
import com.sap.conn.jco.JCoField;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoStructure;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工时报工接口
 *
 * @author:phantomsaber
 * @version:2019/8/16 19:54
 * @email:phantomsaber@foxmail.com
 **/
@Component
public class QuartzProjectReportIntfImpl extends SapCommIntfImpl implements QuartzProjectReportIntf {
    final Logger log = Logger.getLogger(this.getClass());

    final String funcName = "ZFM_MES_007";

    @Resource
    TRfcLogDao rfcLogDao;

    @Resource
    TPmProjectReportDao projectReportDao;

    @Resource
    TPmProjectBaseDao projectBaseDao;

    @Resource
    TProjectSapLogDao sapLogDao;

    @Resource
    TProjectSapLogDetailDao sapLogDetailDao;

    @Resource
    TQuartzLogDao quartzLogDao;

    @Override
    public String quartzExec() {
        String result = null;
        try {
            TPmProjectReportExample reportExample = new TPmProjectReportExample();
            TPmProjectReportExample.Criteria reportExampleCriteria = reportExample.createCriteria();

            List<String> sflagList = new ArrayList<>();
            sflagList.add("NULL");
            sflagList.add("");
            sflagList.add("0");
            reportExampleCriteria.andSFLAGIn(sflagList);

            List<TPmProjectReport> reportList = projectReportDao.selectByExample(reportExample);

            for (TPmProjectReport projectReport : reportList) {
                result = ajaxExecByIds(StringUtils.toJsonArrStr(projectReport.getID()));

                TQuartzLog quartzLog = new TQuartzLog();
                quartzLog.setID(StringUtils.getUUID());
                quartzLog.setCREATE_TIME(DateUtils.getCurDateTime());
                quartzLog.setCREATE_USER(StringUtils.getDefaultUserId());
                quartzLog.setDATA_AUTH(StringUtils.getDefaultDataAuth());
                quartzLog.setDEPT_ID(StringUtils.getDefaultDeptId());

                quartzLog.setINTF_TYPE(IntfType.packFeed.getCode());
                quartzLog.setINTF_NAME(IntfType.packFeed.getFuncName());
                quartzLog.setPROJECT_ID(projectReport.getPROJECT_ID());
                quartzLog.setITEM_CODE("");
                quartzLog.setITEM_CODE("");
                quartzLog.setLOG_INFO(result);
                quartzLog.setSFLAG("Y");
                quartzLog.setMESSAGE("quartz");

                TQuartzLogExample quartzLogExample = new TQuartzLogExample();
                TQuartzLogExample.Criteria criteria = quartzLogExample.createCriteria();
                criteria.andPROJECT_IDEqualTo(projectReport.getPROJECT_ID());

                List<TQuartzLog> tQuartzLogs = quartzLogDao.selectByExample(quartzLogExample);

                if(tQuartzLogs.size() > 0){
                    quartzLog.setEDIT_TIME(DateUtils.getCurDateTime());
                    quartzLog.setEDIT_USER(StringUtils.getDefaultUserId());
                    quartzLogDao.updateByExample(quartzLog, quartzLogExample);
                }else{
                    quartzLogDao.insert(quartzLog);
                }

                log.info("projectId:"+projectReport.getPROJECT_ID()+"|result:"+result);
            }
        } catch (Exception e) {
            log.info(e.getMessage());
        }
        return result;
    }

    /**
     * 工单报工接口异常重发
     * @param logDetailIdsJson
     * @return
     */
    public String ajaxRedoBySapLogDetail(String logDetailIdsJson) {
        /**
         * 1-解析获取日志参数logDetailIdsJson
         */
        List<String> dataList = JSONObject.parseArray(logDetailIdsJson, String.class);
        TProjectSapLogDetailExample sapLogDetailExample = new TProjectSapLogDetailExample();
        TProjectSapLogDetailExample.Criteria sapDetailCri = sapLogDetailExample.createCriteria();
        sapDetailCri.andIDIn(dataList);

        /**
         * 2-获取传输异常记录logDetailList
         */
        List<TProjectSapLogDetail> logDetailList = sapLogDetailDao.selectByExample(sapLogDetailExample);
        List<TProjectSapLog> sapLogList = new ArrayList<>();
        List<TProjectSapLogDetail> resultLogDetailList = new ArrayList<>();
        List<TPmProjectReport> resultReportList = new ArrayList<>();

        TPmProjectReportExample reportExample = new TPmProjectReportExample();
        TPmProjectReportExample.Criteria reportCri = reportExample.createCriteria();

        /**
         * 3-获取工单报工数据reportList
         */
        for (TProjectSapLogDetail sapLogDetail : logDetailList) {
            reportCri.andPROJECT_IDEqualTo(sapLogDetail.getPROJECT_ID());
            List<TPmProjectReport> reportList = projectReportDao.selectByExample(reportExample);

            for (TPmProjectReport projectReport : reportList) {
                int indexOf = reportList.indexOf(projectReport);
                //执行SAP接口
                TProjectSapLogDetail projectSapLogDetail = doExec(projectReport, funcName, String.valueOf(indexOf), sapLogDetail.getITEM_SN());
                resultLogDetailList.add(projectSapLogDetail);
            }

            for (TPmProjectReport projectReport : reportList) {
                resultReportList.add(projectReport);
            }
        }

        /**
         * 4-更新日志传输明细记录
         */
        for (TProjectSapLogDetail sapLogDetail : resultLogDetailList) {
            sapLogDetail.setEDIT_TIME(DateUtils.getCurDateTime());
            sapLogDetail.setEDIT_USER(StringUtils.getDefaultUserId());
            sapDetailCri.andPROJECT_IDEqualTo(sapLogDetail.getPROJECT_ID());
            sapLogDetailDao.updateByExample(sapLogDetail, sapLogDetailExample);
        }

        /**
         * 5-更新工单报工记录
         */
        for (TPmProjectReport projectReport : resultReportList) {
            projectReport.setEDIT_TIME(DateUtils.getCurDateTime());
            projectReport.setEDIT_USER(StringUtils.getDefaultUserId());
            reportCri.andPROJECT_IDEqualTo(projectReport.getPROJECT_ID());
            projectReportDao.updateByExample(projectReport, reportExample);
        }

        return StringUtils.getJsonStr(resultReportList);
    }

    public String ajaxExecByIds(String idsJson) {
        TPmProjectReportExample reportExample = new TPmProjectReportExample();
        TPmProjectReportExample.Criteria reportCriteria = reportExample.createCriteria();
        List<String> dataList = JSONObject.parseArray(idsJson, String.class);
        reportCriteria.andIDIn(dataList);
        List<TPmProjectReport> projectReportList = projectReportDao.selectByExample(reportExample);

        TRfcLog rfcLog = new TRfcLog();
        rfcLog.setRL_FUNC_NAME(funcName + "-工单报工");
        rfcLog.setRL_IMPORT(StringUtils.getJsonStr(JSON.toJSONString(projectReportList)));

        List<TProjectSapLogDetail> logDetailList = new ArrayList<>();
        List<TProjectSapLog> sapLogList = new ArrayList<>();

        for (TPmProjectReport projectReport : projectReportList) {
            TPmProjectBase projectBase = projectBaseDao.selectByProjectId(projectReport.getPROJECT_ID());
            String productMaterial = projectBase.getPRODUCT_MATERIAL();
            int index = projectReportList.indexOf(projectReport);

            TProjectSapLogDetail sapLogDetail = doExec(projectReport, funcName,String.valueOf(index),productMaterial);

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

                if("Y" != sflag && !("Y").equalsIgnoreCase(sflag)){
                    break;
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

    public String ajaxExecByPorjectIds(String projecrIdsJson) {
        return null;
    }

    /**
     * 输入参数处理
     * @param function
     * @param projectReport
     * @param index
     * @return
     */
    private JCoStructure getInPutParam(JCoFunction function, TPmProjectReport projectReport, String index) {
        JCoStructure inPutParam = function.getImportParameterList().getStructure("W_INPUT");
        inPutParam.setValue(ProjectReportTransEnum.zguid.getSapParam(),projectReport.getID());
        inPutParam.setValue(ProjectReportTransEnum.curDate.getSapParam(), DateUtils.getCurDateStr());
        inPutParam.setValue(ProjectReportTransEnum.curDateTime.getSapParam(), DateUtils.getCurTimeStr());
        inPutParam.setValue(ProjectReportTransEnum.Index.getSapParam(), index);
        inPutParam.setValue(ProjectReportTransEnum.sysUserName.getSapParam(), "1");
        inPutParam.setValue(ProjectReportTransEnum.projectId.getSapParam(), projectReport.getPROJECT_ID());
        try {
            inPutParam.setValue(ProjectReportTransEnum.toConfirmOutPut.getSapParam(), NumUtils.formatBigDecimal(projectReport.getREP_NUM().toString()));
        } catch (Exception e) {
            inPutParam.setValue(ProjectReportTransEnum.toConfirmOutPut.getSapParam(), NumUtils.formatBigDecimal("0"));
        }

        inPutParam.setValue(ProjectReportTransEnum.baseUnit.getSapParam(), projectReport.getPROJECT_UNIT());
        inPutParam.setValue(ProjectReportTransEnum.curJob1.getSapParam(), projectReport.getPREPARE_TIME());
        inPutParam.setValue(ProjectReportTransEnum.curJob1Unit.getSapParam(), projectReport.getMEASURE_UNIT1());
        inPutParam.setValue(ProjectReportTransEnum.curJob2.getSapParam(), projectReport.getMACHINE_TIME());
        inPutParam.setValue(ProjectReportTransEnum.curJob2Unit.getSapParam(), projectReport.getMEASURE_UNIT2());
        inPutParam.setValue(ProjectReportTransEnum.curJob3.getSapParam(), projectReport.getPEOPLE_TIME());
        inPutParam.setValue(ProjectReportTransEnum.curJob3Unit.getSapParam(), projectReport.getMEASURE_TIME3());
        inPutParam.setValue(ProjectReportTransEnum.postDate.getSapParam(), projectReport.getFINISH_DATE());
        inPutParam.setValue(ProjectReportTransEnum.reverse.getSapParam(), String.valueOf(projectReport.getREVERSE_FLAG()));
        inPutParam.setValue(ProjectReportTransEnum.sflag.getSapParam(), "N");
        inPutParam.setValue(ProjectReportTransEnum.message.getSapParam(), "TEST");
        return inPutParam;
    }

    /**
     * Extracted doExecc function
     *
     * @param projectReport
     * @param funcName
     * @return
     */
    public TProjectSapLogDetail doExec(TPmProjectReport projectReport, String funcName, String index,String productMaterial) {
        try {
            JCoFunction function = getFunction(funcName);
            JCoParameterList inPut = function.getImportParameterList();
            JCoStructure inPutParam = getInPutParam(function, projectReport,index);
            inPut.setValue("W_INPUT",inPutParam);
            RfcManager.execute(function);
            JCoParameterList outPut = function.getExportParameterList();
            return getSapDetailLog(projectReport, outPut,productMaterial);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * SAP工单同步日志明细
     * @param projectReport
     * @param outPut
     * @return
     */
    private TProjectSapLogDetail getSapDetailLog(TPmProjectReport projectReport,JCoParameterList outPut,String productMaterial){
        TProjectSapLogDetail sapLogDetail = new TProjectSapLogDetail();
        Map<String, String> outPutMap = new HashMap<>(getInitialCapacity());
        try {
            for (JCoField jCoField : outPut) {
                outPutMap.put(jCoField.getName(), jCoField.getValue().toString());
            }

            String sflag = outPut.getString("SFLAG");
            String message = outPut.getString("MESSAGE");
            String sapInfo = StringUtils.getJsonStr(outPutMap);

            sapLogDetail.setPROJECT_ID(projectReport.getPROJECT_ID());
            sapLogDetail.setITEM_SN(productMaterial);
//            sapLogDetail.setITEM_CODE(projectReport.getITEM_CODE());
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
        sapLogDetail.setINTF_TYPE(IntfType.projectReport.getCode());
        sapLogDetail.setINTF_NAME(IntfType.projectReport.getFuncName());

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
        sapLog.setINTF_TYPE(IntfType.projectReport.getCode());
        sapLog.setINTF_NAME(IntfType.projectReport.getFuncName());
        return sapLog;
    }
}
