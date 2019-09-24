package com.phantom.wss.impl;

import com.phantom.comm.DateUtils;
import com.phantom.comm.NumUtils;
import com.phantom.comm.StringUtils;
import com.phantom.comm.enums.IntfType;
import com.phantom.dao.TAccountCheckInfoDao;
import com.phantom.dao.TProjectSapLogDao;
import com.phantom.dao.TProjectSapLogDetailDao;
import com.phantom.model.*;
import com.phantom.pojo.SapAccountCheck;
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

    @Override
    public String sync(List<SapAccountCheck> projectList, String startDay, String endDay) {
        JCoFunction function = getFunction(funcName);

        JCoParameterList jcoImport = function.getImportParameterList();
        JCoParameterList jcoTables = function.getTableParameterList();
        JCoParameterList jcoExport = function.getExportParameterList();

        List<TProjectSapLogDetail> sapLogDetailList = new ArrayList<>();
        List<TProjectSapLog> sapLogList = new ArrayList<>();

        for (SapAccountCheck accountCheck : projectList) {
            String projectId = accountCheck.getProjectId();
            String workSpace = accountCheck.getWorkSpace();

            jcoImport.setValue("IV_AUFNR", StringUtils.parseWithZero(12,projectId));
            jcoImport.setValue("IV_WERKS", workSpace);

            JCoTable itOut = jcoTables.getTable("IT_OUT");
            JCoTable itGltrp = jcoTables.getTable("IT_GLTRP");

//            itGltrp.appendRow();
//            itGltrp.setValue("SIGN", "I");
//            itGltrp.setValue("OPTION", "BT");
//            itGltrp.setValue("LOW", startDay);
//            itGltrp.setValue("HIGH", endDay);
//            jcoTables.setValue("IT_GLTRP", itGltrp);

            RfcManager.execute(function);

            int numRows = itOut.getNumRows();

            for (int i = 0; i < itOut.getNumRows(); i++) {
                itOut.setRow(i);
                TAccountCheckInfo checkInfo = new TAccountCheckInfo();

                String curProjectId = StringUtils.formatZero(itOut.getString(ProjectAccountCheckTransEnum.projectId.getSapParam()));
                String curWorkSpace = itOut.getString(ProjectAccountCheckTransEnum.workSpace.getSapParam());
                String certSn = itOut.getString(ProjectAccountCheckTransEnum.itemCertSn.getSapParam());
                String moveType = itOut.getString(ProjectAccountCheckTransEnum.moveType.getSapParam());
                String itemCode = itOut.getString(ProjectAccountCheckTransEnum.itemCode.getSapParam());

                checkInfo.setID(StringUtils.getUUID());
                checkInfo.setDEPT_ID(StringUtils.getDefaultDeptId());
                checkInfo.setCREATE_USER(StringUtils.getDefaultUserId());
                checkInfo.setCREATE_TIME(DateUtils.getCurDateTime());
                checkInfo.setDATA_AUTH(StringUtils.getDefaultDataAuth());

                checkInfo.setCERT_SN(itOut.getString(ProjectAccountCheckTransEnum.itemCertSn.getSapParam()));
                checkInfo.setCERT_YEAR(itOut.getString(ProjectAccountCheckTransEnum.itemCertYear.getSapParam()));
                checkInfo.setCERT_THING(itOut.getString(ProjectAccountCheckTransEnum.itemCertThing.getSapParam()));
                checkInfo.setMOVE_TYPE(itOut.getString(ProjectAccountCheckTransEnum.moveType.getSapParam()));
                checkInfo.setITEM_CODE(itOut.getString(StringUtils.formatZero(ProjectAccountCheckTransEnum.itemCode.getSapParam())));
                checkInfo.setWORK_SPACE(curWorkSpace);
                checkInfo.setWARE_HOUSE(itOut.getString(ProjectAccountCheckTransEnum.wareHouse.getSapParam()));
                checkInfo.setLOT(itOut.getString(ProjectAccountCheckTransEnum.lot.getSapParam()));
                checkInfo.setITEM_NUM(NumUtils.formatBigDecimal(itOut.getString(ProjectAccountCheckTransEnum.itemNum.getSapParam())));
                checkInfo.setBASE_UNIT(itOut.getString(ProjectAccountCheckTransEnum.baseUnit.getSapParam()));
                checkInfo.setPROJECT_ID(curProjectId);
                checkInfo.setPOST_DATE(DateUtils.formatDate(itOut.getString(ProjectAccountCheckTransEnum.postDate.getSapParam())));
                checkInfo.setCERT_DATE(DateUtils.formatDate(itOut.getString(ProjectAccountCheckTransEnum.certDate.getSapParam())));
                checkInfo.setCONFIRM_OUTPUT(NumUtils.formatBigDecimal(itOut.getString(ProjectAccountCheckTransEnum.confirmOutPut.getSapParam())));

                TAccountCheckInfoExample checkInfoExample = new TAccountCheckInfoExample();
                TAccountCheckInfoExample.Criteria checkCri = checkInfoExample.createCriteria();
                checkCri.andPROJECT_IDEqualTo(curProjectId);
                checkCri.andCERT_SNEqualTo(certSn);
                checkCri.andMOVE_TYPEEqualTo(moveType);
                checkCri.andITEM_CODEEqualTo(itemCode);

                List<TAccountCheckInfo> accountCheckInfos = checkInfoDao.selectByExample(checkInfoExample);
                int countCheck = accountCheckInfos.size();

                if (countCheck > 0){
                    checkInfoDao.updateByExample(checkInfo, checkInfoExample);
                }else{
                    checkInfo.setEDIT_TIME(DateUtils.getCurDateTime());
                    checkInfo.setCREATE_USER(StringUtils.getDefaultUserId());
                    checkInfoDao.insert(checkInfo);
                }

                String sflag = jcoExport.getString("SFLAG");
                String message = jcoExport.getString("MESSAGE");

                TProjectSapLogDetail sapDetailLog = getSapDetailLog(checkInfo, itOut,sflag,message);
                sapLogDetailList.add(sapDetailLog);

                TProjectSapLog projectSapLog = getSapLog(checkInfo, StringUtils.getJsonStr(sapDetailLog),sflag,message);
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

        for (TProjectSapLogDetail logDetail : sapLogDetailList) {
            sapLogDetailDao.insert(logDetail);
        }

        for (TProjectSapLog sapLog : sapLogList) {
            sapLogDao.insert(sapLog);
        }
        return StringUtils.getJsonStr(sapLogDetailList);
    }

    /**
     * 获取SAP工单同步日志
     * @param checkInfo
     * @param sapInfo
     * @return
     */
    private TProjectSapLog getSapLog(TAccountCheckInfo checkInfo,String sapInfo,String sflag,String message){
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
     * @param checkInfo
     * @param outPut
     * @return
     */
    private TProjectSapLogDetail getSapDetailLog(TAccountCheckInfo checkInfo, JCoTable outPut,String sflag,String message){
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
}
