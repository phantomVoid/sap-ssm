package com.phantom.comm.enums;

/**
 * 工单分类
 * @author:phantomsaber
 * @version:2019/8/5 15:04
 * @email:phantomsaber@foxmail.com
 **/
public enum SendType {
    //微信文本
    wechatText("微信文本", "wechat-text"),

    //微信文本卡片
    wechatTextCard("微信文本卡片", "wechat-text-card"),

    //短信
    sms("短信", "sms"),

    //其他类型
    other("其他","other");


    /**
     * projectSort 描述
     */
    private String desc;

    /**
     * projectSort 代码
     */
    private String code;

    SendType(String desc, String code) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return code;
    }
}
