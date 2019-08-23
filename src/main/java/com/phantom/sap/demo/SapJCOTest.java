package com.phantom.sap.demo;

import com.phantom.sap.comm.RfcManager;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * JCO SAP连接测试
 * @author:phantomsaber
 * @version:2019/7/11 14:31
 * @email:phantomsaber@foxmail.com
 **/
public class SapJCOTest {
	private final Log log = LogFactory.getLog(this.getClass());

	public static void main(String[] args) {

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sysDate = sdf1.format(new Date());
		Time sysTime = new Time((new Date()).getTime());

		JCoFunction function = RfcManager.getFunction("ZFM_MES_005");

		JCoParameterList inPut = function.getImportParameterList();

		inPut.setValue("W_INPUT","");
		RfcManager.execute(function);

		JCoParameterList outPut = function.getExportParameterList();

		String sflag = outPut.getString("SFLAG");
		String message = outPut.getString("MESSAGE");

		System.out.println("sflag: >>> "+sflag);
		System.out.println("message: >>> "+message);

		System.out.println("outPut: >>> "+outPut);
	}
}