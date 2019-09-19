package com.phantom.comm;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringEscapeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 字符串工具类
 *
 * @author:phantomsaber
 * @version:2019/8/4 0:52
 * @email:phantomsaber@foxmail.com
 **/
public class StringUtils {
    /**
     * 获取32位uuid
     *
     * @return
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

    public static String getDefaultUserId() {
        return "2a60fc3ebc344a7eae9dea50bfcfc528";
    }

    public static String getDefaultDeptId() {
        return "1";
    }

    public static String getDefaultDataAuth() {
        return "FA174AFF136D496A87B65443D22357E3";
    }

    public static String formatZero(String str) {
        String ret = null;
        try {
            ret = str.replaceAll("^(0+)", "");
        } catch (Exception e) {
            ret = "";
        }
        return ret;
    }

    public static String formatEmpty(String str) {
        String ret = "";
        try {
            if (str.isEmpty()) {
                if ((str.trim()).length() > 0) {
                    ret = str;
                }
            } else {
                ret = str;
            }
        } catch (Exception e) {
            ret = "";
        }
        return ret;
    }

    public static String getJsonStr(Object obj) {
        String unescapeJava = StringEscapeUtils.unescapeJava(JSON.toJSONString(obj));
//        unescapeJava = unescapeJava.replace("[\"", "[").replace("\"]", "]");
        return unescapeJava;
    }

    public static String toJsonArrStr(String str) {
        List<String> idList = new ArrayList<>();
        idList.add(str);
        return JSON.toJSONString(idList);
    }

    public static Boolean isEmpty(String str) {
        Boolean ret = true;
        try {
            if (str.isEmpty()) {
                if ((str.trim()).length() > 0) {
                    ret = false;
                } else {
                    ret = true;
                }
            } else {
                ret = false;
            }
        } catch (Exception e) {
            ret = true;
        }
        return ret;
    }
}
