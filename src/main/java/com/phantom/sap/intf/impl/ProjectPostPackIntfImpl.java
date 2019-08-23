package com.phantom.sap.intf.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.phantom.comm.DateUtils;
import com.phantom.comm.StringUtils;
import com.phantom.comm.enums.IntfType;
import com.phantom.dao.*;
import com.phantom.model.*;
import com.phantom.sap.comm.RfcManager;
import com.phantom.sap.intf.ProjectPostPackIntf;
import com.phantom.sap.intf.comm.impl.SapCommIntfImpl;
import com.phantom.trans.ProjectPostTransEnum;
import com.sap.conn.jco.JCoField;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoStructure;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工单缴库接口
 *
 * @author:phantomsaber
 * @version:2019/8/18 5:47
 * @email:phantomsaber@foxmail.com
 **/
@Component
@WebService(endpointInterface = "com.phantom.sap.intf.ProjectPostPackIntf", serviceName = "ProjectPostPackIntf", targetNamespace = "http://cxf.temptation.cn/")
public class ProjectPostPackIntfImpl extends SapCommIntfImpl implements ProjectPostPackIntf {
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

    /**
     * exec ajaxExecByIds
     * @param idsJson id jsonArrayStr
     * @return
     */
    @Override
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

    /**
     * exec ajaxExecByProjectIds
     * @param projecrIdsJson projectIds jsonArrayStr
     * @return
     */
    @Override
    public String ajaxExecByPorjectIds(String projecrIdsJson) {
        return null;
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
        sapLogDetail.setINTF_NAME(IntfType.projectPost.getDesc());

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
        sapLog.setINTF_NAME(IntfType.projectPost.getDesc());
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
        inPutParam.setValue(ProjectPostTransEnum.uuid.getSapParam(), projectPost.getID());
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
//        inPutParam.setValue(ProjectPostTransEnum.sflag.getSapParam(), "Y");
//        inPutParam.setValue(ProjectPostTransEnum.message.getSapParam(), "TEST");
        return inPutParam;
    }
}

