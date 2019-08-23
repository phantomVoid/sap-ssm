package com.phantom.comm;

import java.math.BigDecimal;

/**
 * 数字工具类
 *
 * @author:phantomsaber
 * @version:2019/8/4 0:51
 * @email:phantomsaber@foxmail.com
 **/
public class NumUtils {
    public static BigDecimal formatBigDecimal(String str) {
        try {
            str = str.trim();
            BigDecimal ret = new BigDecimal(str);
            return ret;
        } catch (Exception e) {
            BigDecimal ret = new BigDecimal(0);
            return ret;
        }
    }
}
