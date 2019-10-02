package com.phantom.wss.impl;

import com.phantom.comm.DateUtils;
import com.phantom.comm.NumUtils;
import com.phantom.comm.StringUtils;
import com.phantom.comm.enums.Flag;
import com.phantom.comm.enums.IntfType;
import com.phantom.dao.*;
import com.phantom.model.*;
import com.phantom.pojo.SapAccountCheck;
import com.phantom.pojo.SapRes;
import com.phantom.sap.comm.RfcManager;
import com.phantom.sap.intf.comm.impl.SapCommIntfImpl;
import com.phantom.trans.ProjectAccountCheckTransEnum;
import com.phantom.wss.ProjectAccountCheckIntf;
import com.sap.conn.jco.JCoField;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoTable;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工单修改同步
 *
 * @author:phantomsaber
 * @version:2019/8/5 16:22
 * @email:phantomsaber@foxmail.com
 **/
@Component
@WebService(endpointInterface = "com.phantom.wss.ProjectAccountCheckIntf", serviceName = "ProjectAccountCheckIntf", targetNamespace = "http://cxf.temptation.cn/")
public class ProjectAccountCheckIntfImpl extends SapCommIntfImpl implements ProjectAccountCheckIntf {
    final Logger log = Logger.getLogger(this.getClass());

    private final String funcName = "ZFM_MES_008";

    @Resource
    TAccountCheckInfoDao checkInfoDao;

    @Resource
    TProjectSapLogDao sapLogDao;

    @Resource
    TProjectSapLogDetailDao sapLogDetailDao;

    @Resource
    TPmProjectFeedDetailDao feedDetailDao;

    @Resource
    TProjectPackFeedDao packFeedDao;

    @Resource
    TAccountCheckBaseDao checkBaseDao;

    @Resource
    TPmProjectBaseDao projectBaseDao;

    @Override
    public String syncByProjectId(String projectId) {
        TPmProjectBaseExample baseExample = new TPmProjectBaseExample();
        TPmProjectBaseExample.Criteria baseExampleCri = baseExample.createCriteria();
        baseExampleCri.andPROJECT_IDEqualTo(projectId);

        List<SapAccountCheck> checkList = new ArrayList<>();
        List<TPmProjectBase> projectBaseList = projectBaseDao.selectByExample(baseExample);
        for (TPmProjectBase projectBase : projectBaseList) {
            String curProjectId = projectBase.getPROJECT_ID();
            String workSpace = projectBase.getWORK_SPACE();

            SapAccountCheck accountCheck = new SapAccountCheck();
            accountCheck.setProjectId(curProjectId);
            accountCheck.setWorkSpace(workSpace);

            checkList.add(accountCheck);
        }
        String syncRes = sync(checkList, null, null);

        return syncRes;
    }

    @Override
    public String sync(List<SapAccountCheck> projectList, String startDay, String endDay) {
        JCoFunction function = getFunction(funcName);

        JCoParameterList jcoImport = function.getImportParameterList();
        JCoParameterList jcoTables = function.getTableParameterList();
        JCoParameterList jcoExport = function.getExportParameterList();

        List<TProjectSapLogDetail> sapLogDetailList = new ArrayList<>();
        List<TProjectSapLog> sapLogList = new ArrayList<>();
        String retJson = null;

        for (SapAccountCheck accountCheck : projectList) {
            String projectId = accountCheck.getProjectId();
            String workSpace = accountCheck.getWorkSpace();

            jcoImport.setValue("IV_AUFNR", StringUtils.parseWithZero(12, projectId));
            jcoImport.setValue("IV_WERKS", workSpace);

            JCoTable itOut = jcoTables.getTable("IT_OUT");
            JCoTable itGltrp = jcoTables.getTable("IT_GLTRP");

            RfcManager.execute(function);

            BigDecimal sapRows = BigDecimal.ZERO;
            BigDecimal sapItemSum = BigDecimal.ZERO;
            BigDecimal sapFinishSum = BigDecimal.ZERO;

            if (itOut.getNumRows() > 0) {
                for (int i = 0; i < itOut.getNumRows(); i++) {
                    itOut.setRow(i);

                    String curProjectId = StringUtils.formatZero(itOut.getString(ProjectAccountCheckTransEnum.projectId.getSapParam()));
                    String certSn = itOut.getString(ProjectAccountCheckTransEnum.itemCertSn.getSapParam());
                    String moveType = itOut.getString(ProjectAccountCheckTransEnum.moveType.getSapParam());
                    String itemCode = itOut.getString(ProjectAccountCheckTransEnum.itemCode.getSapParam());
                    itemCode = StringUtils.formatZero(itemCode);

                    TAccountCheckInfo checkInfo = getCheckInfo(itOut);
                    if("101".equals(moveType)){
                        sapItemSum =checkInfo.getITEM_NUM();
                    }else if("261".equals(moveType)){
                        sapItemSum = sapItemSum.add(checkInfo.getITEM_NUM());
                    }

                    sapFinishSum = checkInfo.getCONFIRM_OUTPUT();

                    TAccountCheckInfoExample checkInfoExample = new TAccountCheckInfoExample();
                    TAccountCheckInfoExample.Criteria checkCri = checkInfoExample.createCriteria();
                    checkCri.andPROJECT_IDEqualTo(curProjectId);
                    checkCri.andCERT_SNEqualTo(certSn);
                    checkCri.andMOVE_TYPEEqualTo(moveType);
                    checkCri.andITEM_CODEEqualTo(itemCode);

                    List<TAccountCheckInfo> checkInfoList = checkInfoDao.selectByExample(checkInfoExample);
                    int countCheck = checkInfoList.size();

                    if (countCheck > 0) {
                        checkInfoDao.updateByExample(checkInfo, checkInfoExample);
                    } else {
                        checkInfo.setEDIT_TIME(DateUtils.getCurDateTime());
                        checkInfo.setCREATE_USER(StringUtils.getDefaultUserId());
                        checkInfoDao.insert(checkInfo);
                    }

                    String sflag = jcoExport.getString("SFLAG");
                    String message = jcoExport.getString("MESSAGE");

                    sapRows.add(BigDecimal.valueOf(i));

                    TAccountCheckBase checkBase = getCheckBase(projectId, moveType,sapRows, sapItemSum, sapFinishSum);
                    TAccountCheckBaseExample checkBaseExp = new TAccountCheckBaseExample();
                    TAccountCheckBaseExample.Criteria baseExpCri = checkBaseExp.createCriteria();
                    baseExpCri.andPROJECT_IDEqualTo(projectId);
                    baseExpCri.andMOVE_TYPEEqualTo(moveType);

                    List<TAccountCheckBase> checkBaseList = checkBaseDao.selectByExample(checkBaseExp);
                    if (checkBaseList.size() > 0) {
                        checkBase.setEDIT_TIME(DateUtils.getCurDateTime());
                        checkBase.setEDIT_USER(StringUtils.getDefaultUserId());
                        checkBaseDao.updateByExample(checkBase, checkBaseExp);
                    } else {
                        checkBaseDao.insert(checkBase);
                    }

                    TProjectSapLogDetail sapDetailLog = getSapDetailLog(checkInfo, itOut, sflag, message);
                    sapLogDetailList.add(sapDetailLog);

                    TProjectSapLog projectSapLog = getSapLog(checkInfo, StringUtils.getJsonStr(sapDetailLog), sflag, message);
                    if (sapLogList.size() > 0) {
                        for (TProjectSapLog sapLog : sapLogList) {
                            if (sapLog.getPROJECT_ID() != projectSapLog.getPROJECT_ID() && !(sapLog.getPROJECT_ID()).equalsIgnoreCase(projectSapLog.getPROJECT_ID())) {
                                sapLogList.add(sapLog);
                            }
                        }
                    } else {
                        sapLogList.add(projectSapLog);
                    }
                }

                for (TProjectSapLogDetail logDetail : sapLogDetailList) {
                    sapLogDetailDao.insert(logDetail);
                }

                for (TProjectSapLog sapLog : sapLogList) {
                    sapLogDao.insert(sapLog);
                }

                retJson = StringUtils.getJsonStr(sapLogDetailList);
            } else {
                SapRes sapRes = new SapRes();
                sapRes.setProjectId(projectId);
                sapRes.setSflag(Flag.N.toString());
                sapRes.setMessage("无数据");
                retJson = StringUtils.getJsonStr(sapRes);
            }
        }

        return retJson;
    }

    /**
     * 获取SAP工单同步日志
     *
     * @param checkInfo
     * @param sapInfo
     * @return
     */
    private TProjectSapLog getSapLog(TAccountCheckInfo checkInfo, String sapInfo, String sflag, String message) {
        TProjectSapLog sapLog = new TProjectSapLog();
        sapLog.setPROJECT_ID(checkInfo.getPROJECT_ID());
        sapLog.setITEM_SN(checkInfo.getCERT_SN());
        sapLog.setSFLAG(sflag);
        sapLog.setMESSAGE(message);
        sapLog.setSAP_INFO(sapInfo);

        sapLog.setID(StringUtils.getUUID());
        sapLog.setCREATE_USER(StringUtils.getDefaultUserId());
        sapLog.setDEPT_ID(StringUtils.getDefaultDeptId());
        sapLog.setDATA_AUTH(StringUtils.getDefaultDataAuth());
        sapLog.setCREATE_TIME(DateUtils.getCurDateTime());
        sapLog.setINTF_TYPE(IntfType.accountSync.getCode());
        sapLog.setINTF_NAME(IntfType.accountSync.getFuncName());
        return sapLog;
    }

    /**
     * SAP工单同步日志明细
     *
     * @param checkInfo
     * @param outPut
     * @return
     */
    private TProjectSapLogDetail getSapDetailLog(TAccountCheckInfo checkInfo, JCoTable outPut, String sflag, String message) {
        TProjectSapLogDetail sapLogDetail = new TProjectSapLogDetail();
        Map<String, String> outPutMap = new HashMap<>(getInitialCapacity());
        try {
            for (JCoField jCoField : outPut) {
                outPutMap.put(jCoField.getName(), jCoField.getValue().toString());
            }

            String sapInfo = StringUtils.getJsonStr(outPutMap);

            sapLogDetail.setPROJECT_ID(checkInfo.getPROJECT_ID());
            sapLogDetail.setITEM_SN(checkInfo.getCERT_SN());
            sapLogDetail.setITEM_CODE(StringUtils.formatZero(checkInfo.getITEM_CODE()));
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
        sapLogDetail.setINTF_TYPE(IntfType.accountSync.getCode());
        sapLogDetail.setINTF_NAME(IntfType.accountSync.getFuncName());

        return sapLogDetail;
    }

    private TAccountCheckInfo getCheckInfo(JCoTable itOut) {
        String projectId = StringUtils.formatZero(itOut.getString(ProjectAccountCheckTransEnum.projectId.getSapParam()));
        String moveType = itOut.getString(ProjectAccountCheckTransEnum.moveType.getSapParam());

        TAccountCheckInfo checkInfo = new TAccountCheckInfo();
        checkInfo.setID(StringUtils.getUUID());
        checkInfo.setDEPT_ID(StringUtils.getDefaultDeptId());
        checkInfo.setCREATE_USER(StringUtils.getDefaultUserId());
        checkInfo.setCREATE_TIME(DateUtils.getCurDateTime());
        checkInfo.setDATA_AUTH(StringUtils.getDefaultDataAuth());

        checkInfo.setCERT_SN(itOut.getString(ProjectAccountCheckTransEnum.itemCertSn.getSapParam()));
        checkInfo.setCERT_YEAR(itOut.getString(ProjectAccountCheckTransEnum.itemCertYear.getSapParam()));
        checkInfo.setCERT_THING(itOut.getString(ProjectAccountCheckTransEnum.itemCertThing.getSapParam()));
        checkInfo.setMOVE_TYPE(itOut.getString(ProjectAccountCheckTransEnum.moveType.getSapParam()));
        checkInfo.setITEM_CODE(StringUtils.formatZero(itOut.getString(StringUtils.formatZero(ProjectAccountCheckTransEnum.itemCode.getSapParam()))));
        checkInfo.setWORK_SPACE(itOut.getString(ProjectAccountCheckTransEnum.workSpace.getSapParam()));
        checkInfo.setWARE_HOUSE(itOut.getString(ProjectAccountCheckTransEnum.wareHouse.getSapParam()));
        checkInfo.setLOT(itOut.getString(ProjectAccountCheckTransEnum.lot.getSapParam()));
        checkInfo.setITEM_NUM(NumUtils.formatBigDecimal(itOut.getString(ProjectAccountCheckTransEnum.itemNum.getSapParam())));
        checkInfo.setBASE_UNIT(itOut.getString(ProjectAccountCheckTransEnum.baseUnit.getSapParam()));
        checkInfo.setPROJECT_ID(StringUtils.formatZero(itOut.getString(ProjectAccountCheckTransEnum.projectId.getSapParam())));
        checkInfo.setPOST_DATE(DateUtils.formatDate(itOut.getString(ProjectAccountCheckTransEnum.postDate.getSapParam())));
        checkInfo.setCERT_DATE(DateUtils.formatDate(itOut.getString(ProjectAccountCheckTransEnum.certDate.getSapParam())));
        checkInfo.setCONFIRM_OUTPUT(NumUtils.formatBigDecimal(itOut.getString(ProjectAccountCheckTransEnum.confirmOutPut.getSapParam())));

        checkInfo.setREL_ID(projectId+"_"+moveType);
        return checkInfo;
    }

    private TAccountCheckBase getCheckBase(String projectId, String moveType,
                                           BigDecimal sapRows, BigDecimal sapItemSum, BigDecimal sapFinishSum) {
        BigDecimal mesRows = BigDecimal.ZERO;
        BigDecimal mesItemSum = BigDecimal.ZERO;
        BigDecimal mesFinishSum = BigDecimal.ZERO;

        TPmProjectFeedDetailExample feedDetailExp = new TPmProjectFeedDetailExample();
        TPmProjectFeedDetailExample.Criteria feedDetailExpCri = feedDetailExp.createCriteria();
        feedDetailExpCri.andPROJECT_IDEqualTo(projectId);

        List<TPmProjectFeedDetail> feedDetailList = feedDetailDao.selectByExample(feedDetailExp);

        mesRows = BigDecimal.valueOf(feedDetailList.size());

        for (TPmProjectFeedDetail feedDetail : feedDetailList) {
            BigDecimal feedNum = feedDetail.getFEED_NUM();
            mesItemSum = mesItemSum.add(feedNum);
        }

        TProjectPackFeedExample packFeedExp = new TProjectPackFeedExample();
        TProjectPackFeedExample.Criteria packFeedExpCri = packFeedExp.createCriteria();
        packFeedExpCri.andPROJECT_IDEqualTo(projectId);

        List<TProjectPackFeed> packFeedList = packFeedDao.selectByExample(packFeedExp);
        for (TProjectPackFeed packFeed : packFeedList) {
            BigDecimal packNum = packFeed.getPACK_NUM();
            mesFinishSum = mesFinishSum.add(packNum);
        }

        TAccountCheckBase checkBase = new TAccountCheckBase();
        checkBase.setID(StringUtils.getUUID());
        checkBase.setDEPT_ID(StringUtils.getDefaultDeptId());
        checkBase.setDATA_AUTH(StringUtils.getDefaultDataAuth());
        checkBase.setCREATE_TIME(DateUtils.getCurDateTime());
        checkBase.setCREATE_USER(StringUtils.getDefaultUserId());

        checkBase.setPROJECT_ID(projectId);
        checkBase.setMES_ROWS(NumUtils.setBigDecimal(mesRows));
        checkBase.setMES_ITEM_SUM(NumUtils.setBigDecimal(mesItemSum));
        checkBase.setMES_FINISH_SUM(NumUtils.setBigDecimal(mesFinishSum));

        checkBase.setSAP_ROWS(NumUtils.setBigDecimal(sapRows));
        checkBase.setSAP_ITEM_SUM(NumUtils.setBigDecimal(sapItemSum));
        checkBase.setSAP_FINISH_SUM(NumUtils.setBigDecimal(sapFinishSum));

        checkBase.setMOVE_TYPE(moveType);

        checkBase.setREL_ID(projectId+"_"+moveType);

        checkBase.setCHECK_FLAG(null);
        checkBase.setCHECK_DESC(null);
        return checkBase;
    }
}
