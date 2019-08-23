package com.phantom.sap.intf.comm.impl;

import com.alibaba.fastjson.JSON;
import com.phantom.comm.DateUtils;
import com.phantom.comm.StringUtils;
import com.phantom.dao.TRfcLogDao;
import com.phantom.model.TRfcLog;
import com.phantom.sap.comm.RfcManager;
import com.phantom.sap.intf.comm.SapCommIntf;
import com.sap.conn.jco.*;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.util.*;

/**
 * SAP通用接口父级实现类
 * @author:phantomsaber
 * @version:2019/7/26 16:37
 * @email:phantomsaber@foxmail.com
 **/
public class SapCommIntfImpl implements SapCommIntf {
    final Logger log = Logger.getLogger(this.getClass());

    @Resource
    private TRfcLogDao logDao;
    private Boolean flag = true;

    @Override
    public void exec(String funcName, String syncItemCode) {

    }

    /**
     * 获取 JCoFunction
     *
     * @param funcName
     * @return
     */
    @Override
    public JCoFunction getFunction(String funcName) {
        return RfcManager.getFunction(funcName);
    }

    /**
     * 去除料号第一个非0字符前的0
     *
     * @param itemCode 料号
     * @return
     */
    @Override
    public String getItemCodeFormatZero(String itemCode) {
        return itemCode.replaceAll("^(0+)", "");
    }

    /**
     * 保存接口日志
     *
     * @param paraMap{DATA_AUTH,RL_FUNC_NAME,RL_FLAG,RL_MESSAGE,RL_IMPORT,RL_EXPORT,RL_CHANGING,RL_CHANGING,RL_TABLES,RL_EXCEPTIONS,RL_SY_ERROR}
     * DATA_AUTH        --组织机构
     * RL_FUNC_NAME     --接口名称
     * RL_FLAG          --同步结果
     * RL_MESSAGE       --同步描述
     * RL_IMPORT        --SAP import 数据
     * RL_EXPORT        --SAP export 数据
     * RL_CHANGING      --SAP changing 数据
     * RL_TABLES        --SAP table 数据
     * RL_EXCEPTIONS    --SAP exceptions 数据
     * RL_SY_ERROR      --系统异常信息
     *
     */
    @Override
    public Boolean saveLog(Map<String, String> paraMap) {
        String dataAuth = paraMap.get("DATA_AUTH");
        String rlFuncName = paraMap.get("RL_FUNC_NAME");
        String rlFlag = paraMap.get("RL_FLAG");
        String rlMessage = paraMap.get("RL_MESSAGE");
        String rlImport = paraMap.get("RL_IMPORT");
        String rlExport = paraMap.get("RL_EXPORT");
        String rlChanging = paraMap.get("RL_CHANGING");
        String rlTables = paraMap.get("RL_TABLES");
        String rlExceptions = paraMap.get("RL_EXCEPTIONS");
        String rlSyError = paraMap.get("RL_SY_ERROR");

        try {
            TRfcLog tRfcLog = new TRfcLog();
            tRfcLog.setID(StringUtils.getUUID());
            tRfcLog.setDEPT_ID(StringUtils.getDefaultDeptId());
            tRfcLog.setCREATE_USER(StringUtils.getDefaultUserId());
            tRfcLog.setCREATE_TIME(DateUtils.getCurDate());
            tRfcLog.setDATA_AUTH(StringUtils.getDefaultDataAuth());
            tRfcLog.setRL_FUNC_NAME(rlFuncName);
            tRfcLog.setRL_FLAG(rlFlag);
            tRfcLog.setRL_MESSAGE(rlMessage);
            tRfcLog.setRL_IMPORT(rlImport);
            tRfcLog.setRL_EXCEPTIONS(rlExport);
            tRfcLog.setRL_CHANGING(rlChanging);
            tRfcLog.setRL_TABLES(rlTables);
            tRfcLog.setRL_EXCEPTIONS(rlExceptions);
            tRfcLog.setRL_SY_ERROR(rlSyError);
            logDao.insert(tRfcLog);
            flag = true;
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 获取 SAP tables JCoTable
     * @param tablesName table 参数名
     * @param function  JCoFunction
     * @return
     */
    @Override
    public JCoTable getTables(String tablesName, JCoFunction function) {
        return function.getTableParameterList().getTable(tablesName);
    }

    @Override
    public JCoParameterList getImport(JCoFunction function) {
        return function.getImportParameterList();
    }

    @Override
    public JCoParameterList getExport(JCoFunction function) {
        return function.getExportParameterList();
    }

    @Override
    public TRfcLog getLog(JCoStructure inPut, JCoParameterList outPut){
        Map<String, String> inPutMap = new HashMap<>(getInitialCapacity(0,false));
        Map<String, String> outPutMap = new HashMap<>(getInitialCapacity(0,false));

        for (JCoField jCoField : inPut) {
            inPutMap.put(jCoField.getName(), jCoField.getValue().toString());
        }

        for (JCoField jCoField : outPut) {
            outPutMap.put(jCoField.getName(), jCoField.getValue().toString());
        }

        log.info("input"+StringUtils.getJsonStr(inPutMap));
        log.info(StringUtils.getJsonStr(outPutMap));

        TRfcLog tLog = new TRfcLog();
        tLog.setRL_IMPORT(StringUtils.getJsonStr(inPutMap));
        tLog.setRL_EXPORT(JSON.toJSONString(outPutMap));
        tLog.setRL_FLAG(outPut.getString("SFLAG"));
        tLog.setRL_MESSAGE(outPut.getString("MESSAGE"));

        return tLog;
    }

    @Override
    public TRfcLog getLog(JCoTable itOut,JCoTable itMatnr, JCoParameterList outPut) {
        Map<String, String> itOutMap = new HashMap<>(getInitialCapacity(0,false));
        Map<String, String> itMatnrMap = new HashMap<>(getInitialCapacity(0,false));
        Map<String, String> outPutMap = new HashMap<>(getInitialCapacity(0,false));

        List<String> tableList = new ArrayList<>();


        for (JCoField jCoField : itOut) {
            itOutMap.put(jCoField.getName(), jCoField.getValue().toString());
        }

        for (JCoField jCoField : itMatnr) {
            itMatnrMap.put(jCoField.getName(), jCoField.getValue().toString());
        }

        for (JCoField jCoField : outPut) {
            outPutMap.put(jCoField.getName(), jCoField.getValue().toString());
        }
        log.info(StringUtils.getJsonStr(itOutMap));
        log.info(StringUtils.getJsonStr(itMatnrMap));
        log.info(StringUtils.getJsonStr(outPutMap));

        tableList.add(StringUtils.getJsonStr(itOutMap));
        tableList.add(StringUtils.getJsonStr(itMatnrMap));

        TRfcLog tLog = new TRfcLog();
        tLog.setRL_IMPORT(StringUtils.getJsonStr(itOutMap));
        tLog.setRL_EXPORT(StringUtils.getJsonStr(outPutMap));
        tLog.setRL_TABLES(StringUtils.getJsonStr(tableList));
        tLog.setRL_FLAG(outPut.getString("SFLAG"));
        tLog.setRL_MESSAGE(outPut.getString("MESSAGE"));

        return tLog;
    }

    /**
     * 初始化集合大小
     *
     * @param num  集合大小
     * @param sure 是否确认大小
     * @return
     */
    public static int getInitialCapacity(int num, Boolean sure) {
        int ret = 0;
        if (sure) {
            ret = (int) (num / 0.75 + 1);
        } else {
            ret = 16;
        }
        return ret;
    }

    public static int getInitialCapacity() {
        return 16;
    }
}
