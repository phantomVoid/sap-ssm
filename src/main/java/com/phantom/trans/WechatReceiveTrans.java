package com.phantom.trans;

import java.io.Serializable;

/**
 * 微信推送接收POJO
 * @author
 */
public class WechatReceiveTrans implements Serializable {

    private String sendTime;

    private String sendType;

    private String message;

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public WechatReceiveTrans() {
    }
}