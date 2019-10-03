package com.phantom.pojo;

import com.alibaba.fastjson.JSONObject;

/**
 * pda接口封装类
 *
 * @author:phantomsaber
 * @version:2019/9/30 23:16
 * @email:phantomsaber@foxmail.com
 **/
public class PdaJsonBase {
    /**
     * 传输标识
     */
    public String sflag;

    /**
     * 消息文本
     */
    public String message;

    /**
     * json消息体
     */
    public JSONObject json;

    public PdaJsonBase() {
    }

    public String getSflag() {
        return sflag;
    }

    public void setSflag(String sflag) {
        this.sflag = sflag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JSONObject getJson() {
        return json;
    }

    public void setJson(JSONObject json) {
        this.json = json;
    }
}
