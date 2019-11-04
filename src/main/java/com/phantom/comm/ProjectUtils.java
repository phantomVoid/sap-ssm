package com.phantom.comm;

import com.phantom.comm.enums.ListFlag;
import com.phantom.comm.enums.ProjectSort;
import com.phantom.dao.TPmProjectBaseDao;
import com.phantom.dao.TPmProjectDetailDao;
import com.phantom.dao.TPmProjectRelDao;
import com.phantom.dao.TPmProjectReportDao;
import com.phantom.model.*;
import com.phantom.pojo.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户工具类
 *
 * @author:phantomsaber
 * @version:2019/8/4 0:52
 * @email:phantomsaber@foxmail.com
 **/
public class ProjectUtils {

    public static String pack = "5";
    public static String manufacture = "3";

    /**
     * 获取ProjectBaseList
     * @param baseDao
     * @param projectId 工单号
     * @return
     */
    public static List<TPmProjectBase> getBaseByProjectId(TPmProjectBaseDao baseDao,String projectId){
        List<TPmProjectBase> res = new ArrayList<>();
        try {
            TPmProjectBaseExample baseExp = new TPmProjectBaseExample();
            TPmProjectBaseExample.Criteria baseExpCriteria = baseExp.createCriteria();
            baseExpCriteria.andPROJECT_IDEqualTo(projectId);
            res = baseDao.selectByExample(baseExp);
        } catch (Exception e) {
            res = null;
        }
        return res;
    }

    public static TPmProjectBase getBaseByList(List<TPmProjectBase> baseList){
        return baseList.get(0);
    }

    /**
     * 获取projectSort
     *
     * @param itemCode
     * @return
     */
    public static String getProjectSort(String itemCode) {
        String retSort = null;
        if (itemCode.startsWith(pack)) {
            retSort = ProjectSort.PACK.getCode();
        } else if (itemCode.startsWith(manufacture)) {
            retSort = ProjectSort.MANUFACTURE.getCode();
        } else {
            retSort = ProjectSort.UNSORT.getCode();
        }
        return retSort;
    }

    /**
     * 解析工单数据
     *
     * @param orderBaseList
     * @param orderBaseList
     * @param projectBaseDao
     * @return
     */
    public static List<TPmProjectBase> getProjectBaseEdit(List<SapOrderBase> orderBaseList,TPmProjectBaseDao projectBaseDao) {
        List<TPmProjectBase> projectBaseList = new ArrayList<>();
        try {
            for (SapOrderBase orderBase : orderBaseList) {

                SapOrderSales orderSales = new SapOrderSales();
                SapOrderProcess orderProcess = new SapOrderProcess();

                int index = orderBaseList.indexOf(orderBase);

                String projectId = StringUtils.formatZero(orderBase.getAUFNR());
                TPmProjectBaseExample projectBaseExp = new TPmProjectBaseExample();
                TPmProjectBaseExample.Criteria baseExpCriteria = projectBaseExp.createCriteria();
                baseExpCriteria.andPROJECT_IDEqualTo(projectId);

                List<TPmProjectBase> baseList = projectBaseDao.selectByExample(projectBaseExp);
                if(baseList.size()>0){
                    for (TPmProjectBase projectBase : baseList) {
                        projectBase.setPRODUCT_COUNT(NumUtils.formatBigDecimal(orderBase.getGAMNG()));
                        projectBase.setPROJECT_TYPE(orderBase.getAUART());
                        projectBase.setTPPB_PLAN_DELIVERY_DATE(DateUtils.formatDate(orderSales.getKDAUF()));
                        projectBase.setDESTROY_NO(StringUtils.formatZero(orderSales.getKDAUF()));
                        projectBase.setPM_MEMO(StringUtils.formatZero(orderBase.getZTEXT()));
                        projectBase.setPRODUCT_LINE(orderProcess.getARBPL());
                        projectBase.setPROJECT_ERPTYPE(orderBase.getAUART());
                        projectBase.setPROJECT_SORT(NumUtils.formatBigDecimal(ProjectUtils.getProjectSort(StringUtils.formatZero(orderBase.getPLNBEZ()))));
                        projectBase.setWARE_HOUSE(StringUtils.formatEmpty(orderBase.getLGORT()));
                        projectBase.setBASE_UNIT(StringUtils.formatEmpty(orderBase.getGMEIN()));
                        projectBase.setLOT_NUMBER(orderBase.getCHARG());
                        projectBase.setPROLEPSIS_START_DATE(DateUtils.formatDate(orderBase.getGSTRP()));
                        projectBase.setPROLEPSIS_END_DATE(DateUtils.formatDate(orderBase.getGLTRP()));
                        projectBase.setEDIT_USER(StringUtils.getDefaultUserId());
                        projectBase.setEDIT_TIME(DateUtils.getCurDateTime());
                        projectBaseList.add(projectBase);
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return projectBaseList;
    }

    /**
     * 解析工单数据
     *
     * @param orderBaseList
     * @param orderProcessList
     * @param orderSalesList
     * @return
     */
    public static List<TPmProjectBase> getProjectBase(List<SapOrderBase> orderBaseList,
                                                      List<SapOrderProcess> orderProcessList,
                                                      List<SapOrderSales> orderSalesList,
                                                      TPmProjectBaseDao projectBaseDao) {
        List<TPmProjectBase> projectBaseList = new ArrayList<>();
        try {
            for (SapOrderBase orderBase : orderBaseList) {

                SapOrderSales orderSales = null;
                SapOrderProcess orderProcess = null;

                int index = orderBaseList.indexOf(orderBase);

                try {
                    orderProcess = orderProcessList.get(index);
                } catch (Exception e) {
                    orderProcess = new SapOrderProcess();
                }

                try {
                    orderSales = orderSalesList.get(index);
                } catch (Exception e) {
                    orderSales = new SapOrderSales();
                }

                String projectId = StringUtils.formatZero(orderBase.getAUFNR());
                TPmProjectBaseExample projectBaseExp = new TPmProjectBaseExample();
                TPmProjectBaseExample.Criteria baseExpCriteria = projectBaseExp.createCriteria();
                baseExpCriteria.andPROJECT_IDEqualTo(projectId);

                List<TPmProjectBase> baseList = projectBaseDao.selectByExample(projectBaseExp);
                if(baseList.size()>0){
                    for (TPmProjectBase projectBase : baseList) {
                        projectBase.setPRODUCT_COUNT(NumUtils.formatBigDecimal(orderBase.getGAMNG()));
                        projectBase.setPROJECT_TYPE(orderBase.getAUART());
                        projectBase.setTPPB_PLAN_DELIVERY_DATE(DateUtils.formatDate(orderSales.getKDAUF()));
                        projectBase.setDESTROY_NO(StringUtils.formatZero(orderSales.getKDAUF()));
                        projectBase.setPM_MEMO(StringUtils.formatZero(orderBase.getZTEXT()));
                        projectBase.setPRODUCT_LINE(orderProcess.getARBPL());
                        projectBase.setPROJECT_ERPTYPE(orderBase.getAUART());
                        projectBase.setPROJECT_SORT(NumUtils.formatBigDecimal(ProjectUtils.getProjectSort(StringUtils.formatZero(orderBase.getPLNBEZ()))));
                        projectBase.setWARE_HOUSE(StringUtils.formatEmpty(orderBase.getLGORT()));
                        projectBase.setBASE_UNIT(StringUtils.formatEmpty(orderBase.getGMEIN()));
                        projectBase.setLOT_NUMBER(orderBase.getCHARG());
                        projectBase.setPROLEPSIS_START_DATE(DateUtils.formatDate(orderBase.getGSTRP()));
                        projectBase.setPROLEPSIS_END_DATE(DateUtils.formatDate(orderBase.getGLTRP()));
                        projectBase.setEDIT_USER(StringUtils.getDefaultUserId());
                        projectBase.setEDIT_TIME(DateUtils.getCurDateTime());
                        projectBaseList.add(projectBase);
                    }
                }else{
                    TPmProjectBase projectBase = new TPmProjectBase();
                    projectBase.setID(StringUtils.getUUID());

                    /*-- version:2019/8/11 17:13 | desc:接收参数 --*/
                    projectBase.setPROJECT_ID(StringUtils.formatZero(orderBase.getAUFNR()));
                    projectBase.setPRODUCT_MATERIAL(StringUtils.formatZero(orderBase.getPLNBEZ()));
                    projectBase.setDESTROY_NO(StringUtils.formatZero(orderSales.getKDAUF()));
                    projectBase.setCUST_CODE(orderBase.getNAME1());
                    projectBase.setPRODUCT_COUNT(NumUtils.formatBigDecimal(orderBase.getGAMNG()));
                    projectBase.setFINISH_COUNT(BigDecimal.ZERO);
                    projectBase.setPROJECT_TYPE(orderBase.getAUART());
                    projectBase.setPROLEPSIS_START_DATE(DateUtils.formatDate(orderBase.getGSTRP()));
                    projectBase.setPROLEPSIS_END_DATE(DateUtils.formatDate(orderBase.getGLTRP()));
                    projectBase.setTPPB_PLAN_DELIVERY_DATE(DateUtils.formatDate(orderSales.getKDAUF()));
                    projectBase.setDESTROY_NO(StringUtils.formatZero(orderSales.getKDAUF()));
                    projectBase.setPM_MEMO(StringUtils.formatZero(orderBase.getZTEXT()));
                    projectBase.setPRODUCT_LINE(orderProcess.getARBPL());
                    projectBase.setPROJECT_ERPTYPE(orderBase.getAUART());
                    projectBase.setLOT_NUMBER(orderBase.getCHARG());

                    projectBase.setPROJECT_SORT(NumUtils.formatBigDecimal(ProjectUtils.getProjectSort(StringUtils.formatZero(orderBase.getPLNBEZ()))));

                    projectBase.setWORK_SPACE(StringUtils.formatEmpty(orderBase.getWERKS()));
                    projectBase.setWARE_HOUSE(StringUtils.formatEmpty(orderBase.getLGORT()));
                    projectBase.setBASE_UNIT(StringUtils.formatEmpty(orderBase.getGMEIN()));

                    /*-- version:2019/8/11 17:14 | desc:默认值 --*/
                    projectBase.setDEPT_ID(StringUtils.getDefaultDeptId());
                    projectBase.setCREATE_USER(StringUtils.getDefaultUserId());
                    projectBase.setCREATE_TIME(DateUtils.getCurDateTime());
                    projectBase.setACTUAL_START_DATE(DateUtils.formatDate(orderBase.getFTRMI()));
                    projectBase.setDATA_AUTH(StringUtils.getDefaultDataAuth());

                    /*-- version:2019/8/11 17:14 | desc:空 --*/
                    projectBase.setPRODUCT_NAME("");
                    projectBase.setPRODUCT_STANDARD("");
                    projectBase.setSCRAPPED_QTY(NumUtils.formatBigDecimal("0"));
                    projectBase.setFQC_COUNT(NumUtils.formatBigDecimal("0"));
                    projectBase.setPROJECT_STATUS("0");
                    projectBase.setWORKING_SC(null);
                    projectBase.setEDIT_USER(null);
                    projectBase.setEDIT_TIME(null);
                    projectBase.setACTUAL_END_DATE(null);
                    projectBase.setPM_CLOSE_REASON(null);
                    projectBase.setPROJECT_STEP(null);
                    projectBase.setFAI_NUM(NumUtils.formatBigDecimal("0"));
                    projectBase.setPROJECT_OFONESELF("N");
                    projectBase.setPRODUCT_SN_START("");
                    projectBase.setPRODUCT_SN_END("");
                    projectBase.setPRODUCT_SN_PREFIX("");
                    projectBase.setPRODUCT_PACK_SEQ("");
                    projectBase.setPM_CHANGE_TIMES(NumUtils.formatBigDecimal("0"));
                    projectBase.setPRODUCT_MATERIAL_VER("");
                    projectBase.setPROJECT_FLAG("N");
                    projectBase.setIS_REL("0");
                    projectBase.setREL_NUM(NumUtils.formatBigDecimal("0"));
                    projectBase.setPM_CHECK_STUST(null);
                    projectBase.setCHECK_MON(null);
                    projectBase.setCHECK_USER("");

                    projectBaseList.add(projectBase);
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return projectBaseList;
    }

    /**
     * 获取工单物料明细
     *
     * @param orderReservedList
     * @return
     */
    public static List<TPmProjectDetail> getProjectDetail(List<SapOrderReserved> orderReservedList, List<SapOrderProcess> orderProcessList) {
        List<TPmProjectDetail> projectDetailList = new ArrayList<>();
        try {
            for (SapOrderReserved orderReserved : orderReservedList) {
                TPmProjectDetail projectDetail = new TPmProjectDetail();

                SapOrderProcess orderProcess = null;
                try {
                    orderProcess = orderProcessList.get(projectDetailList.size());
                    orderProcess.setVORNR("0010");
                } catch (Exception e) {
                    orderProcess = new SapOrderProcess();
                    orderProcess.setVORNR("0010");
                }

                projectDetail.setID(StringUtils.getUUID());
                projectDetail.setPROJECT_ID(StringUtils.formatZero(orderReserved.getAUFNR()));
                projectDetail.setCBD_ITEM_CODE(StringUtils.formatZero(orderReserved.getMATNR()));
                projectDetail.setCBD_ITEM_NUM(NumUtils.formatBigDecimal(orderReserved.getNOMNG()));

                projectDetail.setCBD_UNITS(orderReserved.getMEINS());
                projectDetail.setCBD_ITEM_TYPE("0");
                projectDetail.setDEPT_ID(StringUtils.getDefaultDeptId());
                projectDetail.setCREATE_USER(StringUtils.getDefaultUserId());
                projectDetail.setCREATE_TIME(DateUtils.getCurDate());
                projectDetail.setDATA_AUTH(StringUtils.getDefaultDataAuth());
                projectDetail.setWORKCENTER_SEQ(orderProcess.getVORNR());
                projectDetail.setWORKCENTER_NO(orderReserved.getSORTF());
                projectDetail.setWARE_HOUSE(orderReserved.getLGORT());
                projectDetail.setWORK_SPACE(orderReserved.getWERKS());

                if (!StringUtils.isEmpty(orderProcess.getARBPL())) {
                    orderProcess.setARBPL("");
                }

                if (!StringUtils.isEmpty(orderProcess.getVORNR())) {
                    orderProcess.setVORNR("");
                }
                projectDetail.setWORKCENTER(orderProcess.getARBPL() + "-" + orderProcess.getVORNR());
                projectDetail.setMEMO(orderProcess.getSTEXT() + "-" + orderProcess.getVORNR());

                projectDetail.setEDIT_USER(null);
                projectDetail.setEDIT_TIME(null);
                projectDetail.setPROJECT_BIN(null);
                projectDetail.setOUTPUT_RATE(null);
                projectDetail.setCBD_SEQUENCE(null);
                projectDetail.setCBD_POINT(null);

                projectDetailList.add(projectDetail);
            }
        } catch (Exception e) {
            throw e;
        }
        return projectDetailList;
    }

    /**
     * projectBase add projectReport
     * @param orderBaseList
     * @param orderProcessList
     * @return
     */
    public static List<TPmProjectReport> syncPorjectReport(List<SapOrderBase> orderBaseList,List<SapOrderProcess> orderProcessList) {
        List<TPmProjectReport> projectReportList = new ArrayList<>();

        try {
            for (SapOrderProcess sapOrderProcess : orderProcessList) {
                TPmProjectReport projectReport = new TPmProjectReport();
                SapOrderBase orderBase = orderBaseList.get(orderProcessList.indexOf(sapOrderProcess));
                projectReport.setID(StringUtils.getUUID());
                projectReport.setDEPT_ID(StringUtils.getDefaultDeptId());
                projectReport.setCREATE_USER(StringUtils.getDefaultUserId());
                projectReport.setCREATE_TIME(DateUtils.getCurDate());
                projectReport.setDATA_AUTH(StringUtils.getDefaultDataAuth());
                projectReport.setEDIT_TIME(null);
                projectReport.setEDIT_USER(null);

                projectReport.setPROJECT_ID(StringUtils.formatZero(sapOrderProcess.getAUFNR()));
                projectReport.setBASE_NUM(NumUtils.formatBigDecimal(sapOrderProcess.getBMSCH()));
                projectReport.setPREPARE_TIME(NumUtils.formatBigDecimal(sapOrderProcess.getVGW01()));
                projectReport.setMACHINE_TIME(NumUtils.formatBigDecimal(sapOrderProcess.getVGW02()));
                projectReport.setPEOPLE_TIME(NumUtils.formatBigDecimal(sapOrderProcess.getVGW03()));

                projectReport.setPROJECT_UNIT(StringUtils.formatZero(orderBase.getGMEIN()));
                projectReport.setMEASURE_UNIT1(StringUtils.formatZero(sapOrderProcess.getVGE04()));
                projectReport.setMEASURE_UNIT2(StringUtils.formatZero(sapOrderProcess.getVGE04()));
                projectReport.setMEASURE_TIME3(StringUtils.formatZero(sapOrderProcess.getVGE04()));

                projectReport.setREVERSE_FLAG(NumUtils.formatBigDecimal("1"));

                projectReportList.add(projectReport);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return projectReportList;
    }

    /**
     * 保存projectReport
     * @param reportDao
     * @param projectReportList
     */
    public static void saveSyncPorjectReport(TPmProjectReportDao reportDao,List<TPmProjectReport> projectReportList){

        for (TPmProjectReport projectReport : projectReportList) {
            TPmProjectReportExample reportExample = new TPmProjectReportExample();
            TPmProjectReportExample.Criteria reportExampleCriteria = reportExample.createCriteria();
            reportExampleCriteria.andPROJECT_IDEqualTo(projectReport.getPROJECT_ID());
            List<TPmProjectReport> reportList = reportDao.selectByExample(reportExample);
            if (reportList.size() > 0){
                projectReport.setEDIT_USER(StringUtils.getDefaultUserId());
                projectReport.setEDIT_TIME(DateUtils.getCurDate());
                int update = reportDao.updateByExample(projectReport, reportExample);
                if (update < 1) {
                    break;
                }
            }else {
                projectReport.setSFLAG("0");
                int insert = reportDao.insert(projectReport);
                if (insert < 1) {
                    break;
                }
            }
            TRfcLog tRfcLog = new TRfcLog();
            tRfcLog.setRL_FUNC_NAME(projectReport.getPROJECT_ID());
        }
    }


    /**
     * save projectBase 保存工单基础
     *
     * @param projectList
     */
    public static List<String> saveProjectBase(TRfcLog tRfcLog, TPmProjectBaseDao projectBaseDao, List<TPmProjectBase> projectList) {
        List<String> logList = new ArrayList<>();
        for (TPmProjectBase projectBase : projectList) {
            TPmProjectBaseExample baseExample = new TPmProjectBaseExample();
            TPmProjectBaseExample.Criteria baseExampleCriteria = baseExample.createCriteria();
            baseExampleCriteria.andPROJECT_IDEqualTo(StringUtils.formatZero(projectBase.getPROJECT_ID()));
            List<TPmProjectBase> projectBaseList = projectBaseDao.selectByExample(baseExample);
            int countProjectId = projectBaseList.size();

            String projectStatus = projectBase.getPROJECT_STATUS();

            tRfcLog.setRL_FUNC_NAME(projectBase.getPROJECT_ID());

            if (countProjectId > 0) {
                projectBase.setEDIT_TIME(DateUtils.getCurDate());
                projectBase.setEDIT_USER(StringUtils.getDefaultUserId());
                int update = projectBaseDao.updateByExample(projectBase, baseExample);
                if (update < 1) {
                    break;
                }
            }else {
                int insert = projectBaseDao.insert(projectBase);
                if (insert < 1) {
                    break;
                }
            }

            if("0".equalsIgnoreCase(projectStatus)){
                if(!StringUtils.isEmpty(tRfcLog.getRL_SY_ERROR())){
                    logList.add(StringUtils.getJsonStr(tRfcLog));
                }
            }else{
                tRfcLog.setRL_EXCEPTIONS("工单:"+projectBase.getPROJECT_ID()+"|状态:"+projectStatus+"|res:更新成功,账目数据请在SAP端处理");
                logList.add(StringUtils.getJsonStr(tRfcLog));
            }
        }
        if(logList.size()>0){
            return logList;
        }else{
            return new ArrayList<>();
        }
    }

    /**
     * save projectDetail 保存工单明细
     *
     * @param detailList
     */
    public static void saveProjectDetail(TPmProjectDetailDao projectDetailDao, List<TPmProjectDetail> detailList) {
        for (TPmProjectDetail projectDetail : detailList) {
            TPmProjectDetailExample projectDetailExample = new TPmProjectDetailExample();
            TPmProjectDetailExample.Criteria criteria = projectDetailExample.createCriteria();
            criteria.andPROJECT_IDEqualTo(StringUtils.formatZero(projectDetail.getPROJECT_ID()));
            criteria.andCBD_ITEM_CODEEqualTo(StringUtils.formatZero(projectDetail.getCBD_ITEM_CODE()));
            List<TPmProjectDetail> projectDetailList = projectDetailDao.selectByExample(projectDetailExample);
            int countDetail = projectDetailList.size();
            if (countDetail > 0) {
                projectDetail.setEDIT_TIME(DateUtils.getCurDate());
                projectDetail.setEDIT_USER(StringUtils.getDefaultUserId());
                int update = projectDetailDao.updateByExample(projectDetail, projectDetailExample);
                if (update < 1) {
                    break;
                }
            } else {
                int insert = projectDetailDao.insert(projectDetail);
                if (insert < 1) {
                    break;
                }
            }

            TRfcLog tRfcLog = new TRfcLog();
            tRfcLog.setRL_FUNC_NAME(projectDetail.getCBD_ITEM_CODE());
        }
    }

    /**
     * 快速通道工单关联
     * @param baseDao
     * @param relDao
     * @param projectId
     * @param dataAuth
     * @param userId
     * @return
     */
    public static MapRes doQuickRel(TPmProjectBaseDao baseDao, TPmProjectRelDao relDao, String projectId, String dataAuth ,String userId){
        MapRes res = new MapRes();
        res.setFlag(true);
        res.setDesc("快速关联成功");
        try {
            TPmProjectBaseExample baseExp = new TPmProjectBaseExample();
            TPmProjectBaseExample.Criteria baseExpCri = baseExp.createCriteria();

            baseExpCri.andPROJECT_IDEqualTo(projectId);

            List<TPmProjectBase> baseList = baseDao.selectByExample(baseExp);

            if(baseList.size() < 1){
                res.setFlag(false);
                res.setDesc("该工单号不存在");
                throw new Exception(res.getDesc());
            }

            TPmProjectRelExample relExp = new TPmProjectRelExample();
            relExp.or().andPROJECT_IDEqualTo(projectId).andREL_PROJECT_IDEqualTo(projectId);
            List<TPmProjectRel> relList = relDao.selectByExample(relExp);

            if(relList.size() < 1){
                TPmProjectRel projectRel = new TPmProjectRel();
                for (TPmProjectBase projectBase : baseList) {
                    projectRel.setID(StringUtils.getUUID());
                    projectRel.setDEPT_ID(projectBase.getDEPT_ID());
                    projectRel.setCREATE_USER(projectBase.getCREATE_USER());
                    projectRel.setCREATE_TIME(DateUtils.getCurDateTime());
                    projectRel.setEDIT_TIME(null);
                    projectRel.setEDIT_USER(null);
                    projectRel.setDATA_AUTH(dataAuth);
                    projectRel.setPROJECT_ID(projectId);
                    projectRel.setREL_PROJECT_ID(projectId);

                    projectBase.setIS_REL("3");
                    projectBase.setREL_NUM(BigDecimal.valueOf(1));
                    projectBase.setDATA_AUTH(dataAuth);

                    baseDao.updateByExample(projectBase, baseExp);
                    relDao.insert(projectRel);
                }

                baseDao.updateProjectQuickRel(projectId, dataAuth, userId);

            }else{
                res.setFlag(false);
                res.setDesc("已存在对应关联关系");
                throw new Exception(res.getDesc());
            }
        } catch (Exception e) {
            res.setFlag(false);
            res.setDesc(e.getMessage());
            return res;
        }
        return res;
    }
}
