package com.phantom.comm;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 *
 * @author:phantomsaber
 * @version:2019/8/4 0:51
 * @email:phantomsaber@foxmail.com
 **/
public class DateUtils {
    public static Date getCurDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(sdf.format(new Date()));
            return date;
        } catch (Exception e) {
            e.printStackTrace();
            return (new Date());
        }
    }

    public static String getCurDateStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }

    public static Date getCurDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse(sdf.format(new Date()));
            return date;
        } catch (Exception e) {
            e.printStackTrace();
            return (new Date());
        }
    }

    public static String getCurDateTimeStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

    public static Date formatDateTime(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date parse = sdf.parse(dateStr);
            return parse;
        } catch (Exception e) {
            return (new Date());
        }
    }

    public static String getCurTimeStr(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new Date());
    }

    public static Date formatDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        try {
            Date parse = sdf.parse(dateStr);
            return parse;
        } catch (Exception e) {
            return null;
        }
    }
}
