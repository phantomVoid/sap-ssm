package com.phantom.wss.impl;

import com.alibaba.fastjson.JSON;
import com.phantom.comm.ProjectUtils;
import com.phantom.comm.StringUtils;
import com.phantom.comm.enums.Flag;
import com.phantom.comm.enums.Message;
import com.phantom.dao.TPmProjectBaseDao;
import com.phantom.dao.TPmProjectPostDao;
import com.phantom.dao.TPmProjectReportDao;
import com.phantom.dao.TRfcLogDao;
import com.phantom.model.TPmProjectBase;
import com.phantom.model.TPmProjectBaseExample;
import com.phantom.model.TPmProjectReport;
import com.phantom.model.TRfcLog;
import com.phantom.pojo.*;
import com.phantom.wss.WorkOrderSynEditService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * 工单修改同步
 *
 * @author:phantomsaber
 * @version:2019/8/5 16:22
 * @email:phantomsaber@foxmail.com
 **/
@Component
@WebService(endpointInterface = "com.phantom.wss.WorkOrderSynEditService", serviceName = "WorkOrderSynEditService", targetNamespace = "http://cxf.temptation.cn/")
public class WorkOrderSynEditServiceImp implements WorkOrderSynEditService {
    final Logger log = Logger.getLogger(this.getClass());

    @Resource
    private TRfcLogDao logDao;

    @Resource
    private TPmProjectBaseDao projectBaseDao;

    @Resource
    private TPmProjectPostDao projectPostDao;

    @Resource
    private TPmProjectReportDao projectReportDao;

    /**
     * 获取工单信息
     *
     * @param orderBaseList
     * @return
     */
    @Override
    public SapOrderRes getEditOrderList(@WebParam(name = "orderBaseList") List<SapOrderBase> orderBaseList) {
         String message = "";
        TRfcLog tLog = new TRfcLog();
        try {
            tLog.setRL_FUNC_NAME("ZFM_MES_004-工单修改");
            List<Object> list = new ArrayList<>();
            list.add(orderBaseList);
            tLog.setRL_IMPORT(JSON.toJSONString(list));
            logDao.insert(tLog);
        } catch (Exception e) {
            logDao.insert(new TRfcLog(Flag.N.toString(), Message.FAILURE.toString()));
            SapOrderRes res = new SapOrderRes(Flag.N.toString(), Message.FAILURE.toString());
            return res;
        }

        try {
            TRfcLog rfcLog = new TRfcLog();
            List<String> logList = new ArrayList<>();
            List<TPmProjectBase> projectBaseList = ProjectUtils.getProjectBaseEdit(orderBaseList, projectBaseDao);

            List<String> orderIdList = new ArrayList<>();

            for (SapOrderBase orderBase : orderBaseList) {
                orderIdList.add(StringUtils.formatZero(orderBase.getAUFNR()));
            }

            List<String> projectIdList = new ArrayList<>();
            for (TPmProjectBase projectBase : projectBaseList) {
                projectIdList.add(projectBase.getPROJECT_ID());
            }

            List<String> diffList = new ArrayList<>();

            if (projectBaseList.size() > 0) {

                if(orderBaseList.size() == projectBaseList.size()){
                    List<String> projectBaseLogs = ProjectUtils.saveProjectBase(rfcLog,projectBaseDao, projectBaseList);
                    if(projectBaseLogs.size()>0){
                        logList.add(StringUtils.getJsonStr(projectBaseLogs));
                    }
                }
                // 差集 (orderIdList - projectIdList)
                diffList = orderIdList.stream().filter(item -> !projectIdList.contains(item)).collect(toList());
                if(diffList.size() > 0){
                    message = "工单尚未同步SMES,不允许修改|" + StringUtils.getJsonStr(diffList);
                }
            } else {
                message = "工单修改失败|" + projectBaseList.size();
            }

            SapOrderRes res = new SapOrderRes(Flag.Y.toString(), message);
            if(logList.size()>0){
                tLog.setRL_SY_ERROR(StringUtils.getJsonStr(logList));
            }

            logDao.insert(tLog);
            return res;
        } catch (Exception e) {
            message = e.toString();
            logDao.insert(new TRfcLog(Flag.N.toString(), message, e.toString()));
            SapOrderRes res = new SapOrderRes(Flag.Y.toString(), Flag.N.getDesc()+e.getMessage());
            return res;
        }
    }
}
