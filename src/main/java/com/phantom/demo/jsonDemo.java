package com.phantom.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringEscapeUtils;

import java.util.ArrayList;
import java.util.List;

public class jsonDemo {
    public static void main(String[] args) {
        String id = "4548444a5531475242494e4e4a465047";

        String[] ids = id.split(",");
        List<String> dataIdList = new ArrayList<>();
        for (String curId : ids) {
            dataIdList.add(curId);
        }
        String dataIdJson = StringEscapeUtils.unescapeJava(JSON.toJSONString(dataIdList));

        System.out.println(dataIdJson);

        List<String> dataList = JSONObject.parseArray(dataIdJson, String.class);
        System.out.println(JSON.toJSONString(dataList));
    }
}
