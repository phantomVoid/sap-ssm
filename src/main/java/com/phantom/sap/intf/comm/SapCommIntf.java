package com.phantom.sap.intf.comm;
import com.alibaba.fastjson.JSON;
import com.phantom.comm.StringUtils;
import com.phantom.model.TRfcLog;
import com.sap.conn.jco.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Sap接口通用intf
 * @author:phantomsaber
 * @version:2019/7/25 11:05
 * @email:phantomsaber@foxmail.com
 **/
public interface SapCommIntf {

    /**
     * 接口执行方法
     */
    void exec(String funcName, String syncItemCode);

    /**
     * 保存接口日志
     * @param paraMap
     * @return
     */
    Boolean saveLog(Map<String, String> paraMap);

    /**
     * 获取 JCoFunction
     * @param funcName
     * @return
     */
    JCoFunction getFunction(String funcName);

    /**
     * 去除料号第一个非0字符前的0
     * @param itemCode 料号
     * @return
     */
    String getItemCodeFormatZero(String itemCode);

    /**
     * 获取 SAP tables JCoTable
     * @param tablesName table 参数名
     * @param function  JCoFunction
     * @return
     */
    JCoTable getTables(String tablesName, JCoFunction function);

    /**
     * 获取 SAP outPut
     * @param function
     * @return
     */
    JCoParameterList getImport(JCoFunction function);

    /**
     * 获取
     * @param function
     * @return
     */
    JCoParameterList getExport(JCoFunction function);

    /**
     * 获取日志
     * @param inPut
     * @param outPut
     * @return
     */
    TRfcLog getLog(JCoStructure inPut, JCoParameterList outPut);

    /**
     * 获取日志2
     * @param itMatnr
     * @param outPut
     * @return
     */
    TRfcLog getLog(JCoTable itOut,JCoTable itMatnr,JCoParameterList outPut);
}
