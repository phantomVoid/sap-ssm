package com.phantom.demo;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.phantom.model.TProjectSapLogDetail;
import org.apache.commons.lang3.StringEscapeUtils;

import java.util.Iterator;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        String json = "[{\"result\":\"[{\\\"cREATE_TIME\\\":1567674901000,\\\"cREATE_USER\\\":\\\"2a60fc3ebc344a7eae9dea50bfcfc528\\\",\\\"dATA_AUTH\\\":\\\"FA174AFF136D496A87B65443D22357E3\\\",\\\"dEPT_ID\\\":\\\"1\\\",\\\"eDIT_TIME\\\":1567674901000,\\\"eDIT_USER\\\":\\\"2a60fc3ebc344a7eae9dea50bfcfc528\\\",\\\"iD\\\":\\\"cbdaf7fe71494cbf959260474b98b07d\\\",\\\"iNTF_NAME\\\":\\\"ZFG_MES_006\\\",\\\"iNTF_TYPE\\\":\\\"7\\\",\\\"iTEM_CODE\\\":\\\"500106716\\\",\\\"iTEM_SN\\\":\\\"500106716\\\",\\\"mESSAGE\\\":\\\"采购订单订货数量超过了20 PAI : 500106716 1100 3102 1\\\",\\\"pROJECT_ID\\\":\\\"100637579\\\",\\\"sAP_INFO\\\":\\\"{\\\"MESSAGE\\\":\\\"采购订单订货数量超过了20 PAI : 500106716 1100 3102 1\\\",\\\"SFLAG\\\":\\\"N\\\"}\\\",\\\"sFLAG\\\":\\\"N\\\"}]\"}]";
        JSONArray jsonArray = JSON.parseArray(json.toUpperCase());
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);
        String result = StringEscapeUtils.unescapeJava(JSON.toJSONString(jsonObject.get("RESULT")));
        System.out.println(result);
        String regex = "^" + "\"" + "*|" + "\"" + "*$";
        String regex1 = "\"\\[";
        String regex2 = "]\"";

        result = result.replaceAll(regex, "");
        result = result.replace("\"{", "{").replace("}\"", "}");
        result = result.replaceAll(regex1, "[").replaceAll(regex2, "]");

        JSONArray jsonArray1 = JSON.parseArray(result);

        String sflag = null;


        String js = JSONObject.toJSONString(jsonArray1, SerializerFeature.WriteClassName);

        List<TProjectSapLogDetail> collection = JSONObject.parseArray(js, TProjectSapLogDetail.class);//把字符串转换成集合

        for (Iterator iterator = jsonArray1.iterator(); iterator.hasNext(); ) {
            JSONObject jo = (JSONObject) iterator.next();
            sflag = jo.get("SFLAG").toString();
            if (("N".equalsIgnoreCase(sflag)) && sflag == "N") {
                break;
            }
        }
    }
}
