package com.phantom.pojo;

/**
 * sap 接口传输结果封装
 * @author:phantomsaber
 * @version:2019/8/20 17:07
 * @email:phantomsaber@foxmail.com
 **/
public class SapRes {
    /**
     * 工单号
     */
    public String projectId;

    /**
     * 传输结果
     */
    public String sflag;

    /**
     * 消息文本
     */
    public String message;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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

    @Override
    public String toString() {
        return "SapRes{" +
                "projectId='" + projectId + '\'' +
                ", sflag='" + sflag + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
