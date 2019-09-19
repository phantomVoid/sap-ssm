package com.phantom.trans;

import com.phantom.model.TWechatLog;

import java.io.Serializable;

/**
 * 微信推送 POJO
 * @author 
 */
public class WechatPostTrans implements Serializable {

    private String userCode;

    private String linkUrl;

    private String phone;

    private String content;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WechatPostTrans() {
    }
}