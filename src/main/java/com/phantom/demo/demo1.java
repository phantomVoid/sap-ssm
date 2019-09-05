package com.phantom.demo;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringEscapeUtils;

import java.util.Iterator;

public class demo1 {
    public static void main(String[] args) {
        String json = "{\"chkLog\":\"false\",\"Message\":\"nested exception is org.apache.ibatis.exceptions.PersistenceException: \n" +
                "### Error querying database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Could not get JDBC Connection; nested exception is org.apache.commons.dbcp.SQLNestedException: Cannot create PoolableConnectionFactory (无法从套接字读取更多的数据)\n" +
                "### The error may exist in file [E:\\eclipse-space\\sks-wss-ssm\\target\\sks-wss-ssm\\WEB-INF\\classes\\mapping\\TProjectSapLogDetailDao.xml]\n" +
                "### The error may involve com.phantom.dao.TProjectSapLogDetailDao.selectByExample\n" +
                "### The error occurred while executing a query\n" +
                "### Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Could not get JDBC Connection; nested exception is org.apache.commons.dbcp.SQLNestedException: Cannot create PoolableConnectionFactory (无法从套接字读取更多的数据)\",\"Content\":[]}";
        JSONArray jsonArray = JSON.parseArray(json.toUpperCase());
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);
        String result = StringEscapeUtils.unescapeJava(JSON.toJSONString(jsonObject.get("RESULT")));
        System.out.println(result);
        String regex = "^" + "\"" + "*|" + "\"" + "*$";
        String regex1 = "\"\\[";
        String regex2 = "]\"";

        result = result.replaceAll(regex,"");
        result = result.replace("\"{", "{").replace("}\"","}");
        result = result.replaceAll(regex1,"[").replaceAll(regex2,"]");
//        result = "["+result.replace("\"货物移动\"", "货物移动")+"]";
        JSONArray jsonArray1 = JSON.parseArray(result);

        String sflag = null;
        String messagge = null;

        for (Iterator iterator = jsonArray1.iterator(); iterator.hasNext();) {
            JSONObject jo = (JSONObject) iterator.next();
            sflag = jo.get("SFLAG").toString();
            if (("N".equalsIgnoreCase(sflag)) && sflag == "N") {
                break;
            }
        }
        System.out.println(sflag);

    }
}
