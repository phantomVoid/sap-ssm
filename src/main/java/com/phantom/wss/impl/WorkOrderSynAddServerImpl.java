package com.phantom.wss.impl;

import com.alibaba.fastjson.JSON;
import com.phantom.comm.ProjectUtils;
import com.phantom.comm.StringUtils;
import com.phantom.comm.enums.Flag;
import com.phantom.comm.enums.Message;
import com.phantom.dao.TPmProjectBaseDao;
import com.phantom.dao.TPmProjectDetailDao;
import com.phantom.dao.TPmProjectReportDao;
import com.phantom.dao.TRfcLogDao;
import com.phantom.model.TPmProjectBase;
import com.phantom.model.TPmProjectDetail;
import com.phantom.model.TPmProjectReport;
import com.phantom.model.TRfcLog;
import com.phantom.pojo.*;
import com.phantom.wss.WorkOrderSynAddService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.*;

/**
 * 工单信息同步
 *
 * @author:phantomsaber
 * @version:2019/8/3 23:05
 * @email:phantomsaber@foxmail.com
 **/
@Component
@WebService(endpointInterface = "com.phantom.wss.WorkOrderSynAddService", serviceName = "WorkOrderSynAddService", targetNamespace = "http://cxf.temptation.cn/")
public class WorkOrderSynAddServerImpl implements WorkOrderSynAddService {
    final Logger log = Logger.getLogger(this.getClass());

    @Resource
    private TRfcLogDao logDao;

    @Resource
    private TPmProjectBaseDao projectBaseDao;

    @Resource
    private TPmProjectDetailDao projectDetailDao;

    @Resource
    private TPmProjectReportDao reportDao;

    /**
     * 获取工单信息
     *
     * @param orderBaseList
     * @param orderProcessList
     * @param orderReservedList
     * @param orderSalesList
     * @return
     */
    @Override
    public SapOrderRes getOrderList(@WebParam(name = "orderBaseList") List<SapOrderBase> orderBaseList,
                                    @WebParam(name = "orderProcessList") List<SapOrderProcess> orderProcessList,
                                    @WebParam(name = "orderReservedList") List<SapOrderReserved> orderReservedList,
                                    @WebParam(name = "orderSalesList") List<SapOrderSales> orderSalesList) {
        String message = "";
        TRfcLog tLog = new TRfcLog();
        try {
            tLog.setRL_FUNC_NAME("ZFM_MES_003-工单下达");
            List<Object> list = new ArrayList<>();
            list.add(orderBaseList);
            list.add(orderProcessList);
            list.add(orderReservedList);
            list.add(orderSalesList);
            tLog.setRL_IMPORT(JSON.toJSONString(list));
        } catch (Exception e) {
            logDao.insert(new TRfcLog(Flag.N.toString(), Message.FAILURE.toString()));
            SapOrderRes res = new SapOrderRes(Flag.N.toString(), Message.FAILURE.toString());
            return res;
        }

        try {
            TRfcLog rfcLog = new TRfcLog();
            List<String> logList = new ArrayList<>();
            List<TPmProjectBase> projectList = ProjectUtils.getProjectBase(orderBaseList, orderProcessList, orderSalesList);
            List<TPmProjectDetail> detailList = ProjectUtils.getProjectDetail(orderReservedList, orderProcessList);
            List<TPmProjectReport> reportList = ProjectUtils.syncPorjectReport(orderBaseList, orderProcessList);

            if (projectList.size() > 0) {
                List<String> projectBaseLogs = ProjectUtils.saveProjectBase(rfcLog, projectBaseDao, projectList);
                ProjectUtils.saveProjectDetail(projectDetailDao, detailList);
                ProjectUtils.saveSyncPorjectReport(reportDao,reportList);

                if(projectBaseLogs.size()>0){
                    logList.add(StringUtils.getJsonStr(projectBaseLogs));
                }
            } else {
                message = "工单明细新增失败|" + projectList.size();
                throw new NullPointerException(message);
            }
            SapOrderRes res = new SapOrderRes(Flag.Y.toString(), "SUCCESS");
            res.setMESSAGE("SUCCESS");
            if(logList.size()>0){
                tLog.setRL_SY_ERROR(StringUtils.getJsonStr(logList));
            }
            logDao.insert(tLog);
            return res;
        } catch (Exception e) {
            message = e.toString();
            logDao.insert(new TRfcLog(Flag.N.toString(), message, e.toString()));
            SapOrderRes res = new SapOrderRes(Flag.N.toString(), e.getMessage());
            return res;
        }
    }
}
