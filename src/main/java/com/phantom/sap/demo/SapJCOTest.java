package com.phantom.sap.demo;

import com.phantom.comm.DateUtils;
import com.phantom.model.TRfcLog;
import com.phantom.sap.comm.RfcManager;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoTable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * JCO SAP连接测试
 * @author:phantomsaber
 * @version:2019/7/11 14:31
 * @email:phantomsaber@foxmail.com
 **/
public class SapJCOTest {
	private final Log log = LogFactory.getLog(this.getClass());

	public static void main(String[] args) {
		String low = "";
		String hight = "";

		String funcName = "ZFM_MES_001";
		JCoFunction function = RfcManager.getFunction(funcName);

		JCoParameterList importParameterList = function.getImportParameterList();
		importParameterList.setValue("IV_DATE", DateUtils.getCurDateTimeStr());
		importParameterList.setValue("IV_TIME", DateUtils.getCurTimeStr());

		JCoParameterList tableParameterList = function.getTableParameterList();

		JCoTable itMatnr = tableParameterList.getTable("IT_MATNR");

		itMatnr.appendRow();
		itMatnr.setValue("SIGN", "I");
		itMatnr.setValue("OPTION", "BT");
		itMatnr.setValue("LOW", low);
		itMatnr.setValue("HIGH", hight);

		tableParameterList.setValue("IT_MATNR", itMatnr);
		RfcManager.execute(function);

		JCoParameterList outPut = function.getExportParameterList();

		String sflag = outPut.getString("SFLAG");
		String message = outPut.getString("MESSAGE");

		System.out.println("sflag: >>> "+sflag);
		System.out.println("message: >>> "+message);

		System.out.println("outPut: >>> "+outPut);
	}
}