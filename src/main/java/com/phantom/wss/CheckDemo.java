package com.phantom.wss;

import com.phantom.sap.comm.RfcManager;
import com.phantom.trans.ProjectAccountCheckTransEnum;
import com.sap.conn.jco.*;

public class CheckDemo {
    public static void main(String[] args) {
        String funcName = "ZFM_MES_008";

        JCoFunction function = RfcManager.getFunction(funcName);
        JCoParameterList importParameterList = function.getImportParameterList();
        JCoParameterList tableParameterList = function.getTableParameterList();
        JCoParameterList exportParameterList = function.getExportParameterList();

        importParameterList.setValue("IV_AUFNR", "000400811837");
        importParameterList.setValue("IV_WERKS", "1101");

        JCoTable itOut = tableParameterList.getTable("IT_OUT");
        JCoTable itGltrp = tableParameterList.getTable("IT_GLTRP");

//        itGltrp.appendRow();
//        itGltrp.setValue("SIGN", "I");
//        itGltrp.setValue("OPTION", "BT");
//        itGltrp.setValue("LOW", "20190901");
//        itGltrp.setValue("HIGH", "20190901");
//        tableParameterList.setValue("IT_GLTRP", itGltrp);

        RfcManager.execute(function);

        int numRows = itOut.getNumRows();
        System.out.println("numRows: >>> " + numRows);

        for (int i = 0; i < itOut.getNumRows(); i++) {
            itOut.setRow(i);
            for (JCoField fld : itOut) {
                System.out.print(String.format("%s\t", fld.getName()));

                System.out.print(String.format("%s\t", fld.getValue()));
            }
            System.out.println();
        }

        String sflag = exportParameterList.getString("SFLAG");
        String message = exportParameterList.getString("MESSAGE");
        System.out.println("sflag: >>> " + sflag);
        System.out.println("message: >>> " + message);
    }
}
