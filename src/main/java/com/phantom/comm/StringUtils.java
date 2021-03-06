package com.phantom.comm;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.phantom.comm.enums.ListFlag;
import com.phantom.model.TCoItem;
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
        //莆田三棵树
        return "69cfb4a5492449978fc7f24a145eafe9";
    }

    public static String getUrlString(String str){
        String res = null;
        try {
            res = new String(str.getBytes("ISO-8859-1"),"UTF-8");
        } catch (Exception e) {
            res = str;
        }
        return res;
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
        String unescapeJava = StringEscapeUtils.unescapeJava(JSON.toJSONString(obj,SerializerFeature.DisableCircularReferenceDetect));
//        unescapeJava = unescapeJava.replace("[\"", "[").replace("\"]", "]");
        return unescapeJava;
    }

    public static String toJsonArrStr(String str) {
        List<String> idList = new ArrayList<>();
        idList.add(str);
        return JSON.toJSONString(idList);
    }

    public static String parseWithZero(int size, String projectId) {
        String str = null;
        try {
            str = String.format("%" + size + "d", Integer.valueOf(projectId)).replace(" ", "0");
        } catch (NumberFormatException e) {
            str = addZeroForNum(projectId, size);
        }
        return str;
    }

    public static String addZeroForNum(String str, int strLength) {
        int strLen = str.length();
        if (strLen < strLength) {
            while (strLen < strLength) {
                StringBuffer sb = new StringBuffer();
                sb.append("0").append(str);//左补0
                // sb.append(str).append("0");//右补0
                str = sb.toString();
                strLen = str.length();
            }
        }
        return str;
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
