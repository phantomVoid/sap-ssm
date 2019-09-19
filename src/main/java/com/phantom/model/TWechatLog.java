package com.phantom.model;

import java.io.Serializable;
import java.util.Date;

/**
 * T_WECHAT_LOG
 * @author 
 */
public class TWechatLog implements Serializable {
    /**
     * uuid
     */
    private String ID;

    /**
     * 部门ID
     */
    private String DEPT_ID;

    /**
     * 创建用户
     */
    private String CREATE_USER;

    /**
     * 创建时间
     */
    private Date CREATE_TIME;

    /**
     * 修改用户
     */
    private String EDIT_USER;

    /**
     * 修改时间
     */
    private Date EDIT_TIME;

    /**
     * 组织机构
     */
    private String DATA_AUTH;

    /**
     * 微信用户代码(发送参数)
     */
    private String USER_CODE;

    /**
     * 文本链接地址(发送参数)
     */
    private String LINK_URL;

    /**
     * 用户手机号(发送参数)
     */
    private String PHONE;

    /**
     * 微信推送内容(发送参数)
     */
    private String CONTENT;



    /**
     * 发送时间(接收参数)
     */
    private Date SEND_TIME;

    /**
     * 发送类型(接收参数)
     * wechat-text 微信文本
     * wechat-text-card 微信文本卡片
     * sms 短信
     */
    private String SEND_TYPE;

    /**
     * 消息文本(接收参数)
     */
    private String MESSAGE;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDEPT_ID() {
        return DEPT_ID;
    }

    public void setDEPT_ID(String DEPT_ID) {
        this.DEPT_ID = DEPT_ID;
    }

    public String getCREATE_USER() {
        return CREATE_USER;
    }

    public void setCREATE_USER(String CREATE_USER) {
        this.CREATE_USER = CREATE_USER;
    }

    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public String getEDIT_USER() {
        return EDIT_USER;
    }

    public void setEDIT_USER(String EDIT_USER) {
        this.EDIT_USER = EDIT_USER;
    }

    public Date getEDIT_TIME() {
        return EDIT_TIME;
    }

    public void setEDIT_TIME(Date EDIT_TIME) {
        this.EDIT_TIME = EDIT_TIME;
    }

    public String getDATA_AUTH() {
        return DATA_AUTH;
    }

    public void setDATA_AUTH(String DATA_AUTH) {
        this.DATA_AUTH = DATA_AUTH;
    }

    public String getUSER_CODE() {
        return USER_CODE;
    }

    public void setUSER_CODE(String USER_CODE) {
        this.USER_CODE = USER_CODE;
    }

    public String getLINK_URL() {
        return LINK_URL;
    }

    public void setLINK_URL(String LINK_URL) {
        this.LINK_URL = LINK_URL;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public Date getSEND_TIME() {
        return SEND_TIME;
    }

    public void setSEND_TIME(Date SEND_TIME) {
        this.SEND_TIME = SEND_TIME;
    }

    public String getSEND_TYPE() {
        return SEND_TYPE;
    }

    public void setSEND_TYPE(String SEND_TYPE) {
        this.SEND_TYPE = SEND_TYPE;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TWechatLog other = (TWechatLog) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getUSER_CODE() == null ? other.getUSER_CODE() == null : this.getUSER_CODE().equals(other.getUSER_CODE()))
            && (this.getLINK_URL() == null ? other.getLINK_URL() == null : this.getLINK_URL().equals(other.getLINK_URL()))
            && (this.getPHONE() == null ? other.getPHONE() == null : this.getPHONE().equals(other.getPHONE()))
            && (this.getSEND_TIME() == null ? other.getSEND_TIME() == null : this.getSEND_TIME().equals(other.getSEND_TIME()))
            && (this.getSEND_TYPE() == null ? other.getSEND_TYPE() == null : this.getSEND_TYPE().equals(other.getSEND_TYPE()))
            && (this.getMESSAGE() == null ? other.getMESSAGE() == null : this.getMESSAGE().equals(other.getMESSAGE()))
            && (this.getCONTENT() == null ? other.getCONTENT() == null : this.getCONTENT().equals(other.getCONTENT()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getDEPT_ID() == null) ? 0 : getDEPT_ID().hashCode());
        result = prime * result + ((getCREATE_USER() == null) ? 0 : getCREATE_USER().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getEDIT_USER() == null) ? 0 : getEDIT_USER().hashCode());
        result = prime * result + ((getEDIT_TIME() == null) ? 0 : getEDIT_TIME().hashCode());
        result = prime * result + ((getDATA_AUTH() == null) ? 0 : getDATA_AUTH().hashCode());
        result = prime * result + ((getUSER_CODE() == null) ? 0 : getUSER_CODE().hashCode());
        result = prime * result + ((getLINK_URL() == null) ? 0 : getLINK_URL().hashCode());
        result = prime * result + ((getPHONE() == null) ? 0 : getPHONE().hashCode());
        result = prime * result + ((getSEND_TIME() == null) ? 0 : getSEND_TIME().hashCode());
        result = prime * result + ((getSEND_TYPE() == null) ? 0 : getSEND_TYPE().hashCode());
        result = prime * result + ((getMESSAGE() == null) ? 0 : getMESSAGE().hashCode());
        result = prime * result + ((getCONTENT() == null) ? 0 : getCONTENT().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", DEPT_ID=").append(DEPT_ID);
        sb.append(", CREATE_USER=").append(CREATE_USER);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", EDIT_USER=").append(EDIT_USER);
        sb.append(", EDIT_TIME=").append(EDIT_TIME);
        sb.append(", DATA_AUTH=").append(DATA_AUTH);
        sb.append(", USER_CODE=").append(USER_CODE);
        sb.append(", LINK_URL=").append(LINK_URL);
        sb.append(", PHONE=").append(PHONE);
        sb.append(", SEND_TIME=").append(SEND_TIME);
        sb.append(", SEND_TYPE=").append(SEND_TYPE);
        sb.append(", MESSAGE=").append(MESSAGE);
        sb.append(", CONTENT=").append(CONTENT);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}