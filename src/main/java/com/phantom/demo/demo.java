package com.phantom.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.ibatis.executor.ResultExtractor;

import java.util.Iterator;

public class demo {
    public static void main(String[] args) {
        String json = "[{\"result\":\"[{\\\"cREATE_TIME\\\":1566531135000,\\\"cREATE_USER\\\":\\\"2a60fc3ebc344a7eae9dea50bfcfc528\\\",\\\"dATA_AUTH\\\":\\\"FA174AFF136D496A87B65443D22357E3\\\",\\\"dEPT_ID\\\":\\\"1\\\",\\\"iD\\\":\\\"4a434636564542504b594c484a574648\\\",\\\"iNTF_NAME\\\":\\\"工单报工\\\",\\\"iNTF_TYPE\\\":\\\"8\\\",\\\"iTEM_SN\\\":\\\"300005762\\\",\\\"mESSAGE\\\":\\\"同步成功\\\",\\\"pROJECT_ID\\\":\\\"400643737\\\",\\\"sAP_INFO\\\":\\\"[{\\\"cREATE_TIME\\\":1566531135000,\\\"cREATE_USER\\\":\\\"2a60fc3ebc344a7eae9dea50bfcfc528\\\",\\\"dATA_AUTH\\\":\\\"FA174AFF136D496A87B65443D22357E3\\\",\\\"dEPT_ID\\\":\\\"1\\\",\\\"iD\\\":\\\"792a6f78f3254181bdb17b571749c3f9\\\",\\\"iNTF_NAME\\\":\\\"工单报工\\\",\\\"iNTF_TYPE\\\":\\\"8\\\",\\\"iTEM_SN\\\":\\\"300005762\\\",\\\"mESSAGE\\\":\\\"同步成功\\\",\\\"pROJECT_ID\\\":\\\"400643737\\\",\\\"sAP_INFO\\\":\\\"{\\\"MESSAGE\\\":\\\"同步成功\\\",\\\"SFLAG\\\":\\\"Y\\\"}\\\",\\\"sFLAG\\\":\\\"Y\\\"}]\\\",\\\"sFLAG\\\":\\\"Y\\\"}]\"}]";
//        String json = "[{\"result\":\"{\\\"cREATE_TIME\\\":1566363269000,\\\"cREATE_USER\\\":\\\"2a60fc3ebc344a7eae9dea50bfcfc528\\\",\\\"dATA_AUTH\\\":\\\"FA174AFF136D496A87B65443D22357E3\\\",\\\"dEPT_ID\\\":\\\"1\\\",\\\"iD\\\":\\\"4d484d4c3836575837384d3449533538\\\",\\\"iNTF_NAME\\\":\\\"制造单投料\\\",\\\"iNTF_TYPE\\\":\\\"5\\\",\\\"iTEM_SN\\\":\\\"300082677\\\",\\\"mESSAGE\\\":\\\"库存不足,当前库存0.000,需求量：100.000,差异量：100.000\\\",\\\"pROJECT_ID\\\":\\\"400643692\\\",\\\"sAP_INFO\\\":\\\"{\\\"cREATE_TIME\\\":1566363268000,\\\"cREATE_USER\\\":\\\"2a60fc3ebc344a7eae9dea50bfcfc528\\\",\\\"dATA_AUTH\\\":\\\"FA174AFF136D496A87B65443D22357E3\\\",\\\"dEPT_ID\\\":\\\"1\\\",\\\"iD\\\":\\\"624039e2fdd94f569360b5cd838009e6\\\",\\\"iNTF_NAME\\\":\\\"制造单投料\\\",\\\"iNTF_TYPE\\\":\\\"5\\\",\\\"iTEM_CODE\\\":\\\"300062412\\\",\\\"iTEM_SN\\\":\\\"300082677\\\",\\\"mESSAGE\\\":\\\"库存不足,当前库存0.000,需求量：100.000,差异量：100.000\\\",\\\"pROJECT_ID\\\":\\\"400643692\\\",\\\"sAP_INFO\\\":\\\"{\\\"MESSAGE\\\":\\\"库存不足,当前库存0.000,需求量：100.000,差异量：100.000\\\",\\\"SFLAG\\\":\\\"N\\\"}\\\",\\\"sFLAG\\\":\\\"N\\\"}\\\",\\\"sFLAG\\\":\\\"N\\\"}\"}]";
        JSONArray jsonArray = JSON.parseArray(json.toUpperCase());
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);

        String result = StringEscapeUtils.unescapeJava(JSON.toJSONString(jsonObject.get("RESULT")));

        String regex = "^" + "\"" + "*|" + "\"" + "*$";
        String regex1 = "\"\\[";
        String regex2 = "]\"";
        result = result.replaceAll(regex,"");

        result = result.replace("\"{", "{").replace("}\"","}");
        System.out.println(result);
        result = result.replaceAll(regex1,"[").replaceAll(regex2,"]");
        System.out.println(result);

        JSONArray jsonArray1 = JSON.parseArray(result);

//        JSONObject jsonObject1 = JSONObject.parseObject(result);
        String sflag = null;

        for (Iterator iterator = jsonArray1.iterator(); iterator.hasNext();) {
            JSONObject jo = (JSONObject) iterator.next();
            sflag = jo.get("SFLAG").toString();
            if (("N".equalsIgnoreCase(sflag)) && sflag == "N") {
                break;
            }
        }
    }
}
