package com.phantom.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * SY_USER
 * @author 
 */
public class SyUser implements Serializable {
    private String ID;

    private String LOGIN_NAME;

    private String NAME;

    private String PW;

    private String ENABLE;

    private String DEPT_ID;

    private String PHONE;

    private String MOBILE;

    private String WEIXIN;

    private String EMAIL;

    private String USER_TYPE;

    private String FINGERPRINT;

    private Date EDIT_PW_TIME;

    private String PHOTO_NAME;

    private String ENGLISH_NAME;

    private String EMP_SUP_CODE;

    private String EMP_CUST_CODE;

    private String US_TIME_ZONE;

    private String WX_USER_ID;

    private String DING_USER_ID;

    private String INIT_LOGIN;

    private String DATA_AUTH;

    private byte[] PHOTO;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLOGIN_NAME() {
        return LOGIN_NAME;
    }

    public void setLOGIN_NAME(String LOGIN_NAME) {
        this.LOGIN_NAME = LOGIN_NAME;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPW() {
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public String getENABLE() {
        return ENABLE;
    }

    public void setENABLE(String ENABLE) {
        this.ENABLE = ENABLE;
    }

    public String getDEPT_ID() {
        return DEPT_ID;
    }

    public void setDEPT_ID(String DEPT_ID) {
        this.DEPT_ID = DEPT_ID;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getWEIXIN() {
        return WEIXIN;
    }

    public void setWEIXIN(String WEIXIN) {
        this.WEIXIN = WEIXIN;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getUSER_TYPE() {
        return USER_TYPE;
    }

    public void setUSER_TYPE(String USER_TYPE) {
        this.USER_TYPE = USER_TYPE;
    }

    public String getFINGERPRINT() {
        return FINGERPRINT;
    }

    public void setFINGERPRINT(String FINGERPRINT) {
        this.FINGERPRINT = FINGERPRINT;
    }

    public Date getEDIT_PW_TIME() {
        return EDIT_PW_TIME;
    }

    public void setEDIT_PW_TIME(Date EDIT_PW_TIME) {
        this.EDIT_PW_TIME = EDIT_PW_TIME;
    }

    public String getPHOTO_NAME() {
        return PHOTO_NAME;
    }

    public void setPHOTO_NAME(String PHOTO_NAME) {
        this.PHOTO_NAME = PHOTO_NAME;
    }

    public String getENGLISH_NAME() {
        return ENGLISH_NAME;
    }

    public void setENGLISH_NAME(String ENGLISH_NAME) {
        this.ENGLISH_NAME = ENGLISH_NAME;
    }

    public String getEMP_SUP_CODE() {
        return EMP_SUP_CODE;
    }

    public void setEMP_SUP_CODE(String EMP_SUP_CODE) {
        this.EMP_SUP_CODE = EMP_SUP_CODE;
    }

    public String getEMP_CUST_CODE() {
        return EMP_CUST_CODE;
    }

    public void setEMP_CUST_CODE(String EMP_CUST_CODE) {
        this.EMP_CUST_CODE = EMP_CUST_CODE;
    }

    public String getUS_TIME_ZONE() {
        return US_TIME_ZONE;
    }

    public void setUS_TIME_ZONE(String US_TIME_ZONE) {
        this.US_TIME_ZONE = US_TIME_ZONE;
    }

    public String getWX_USER_ID() {
        return WX_USER_ID;
    }

    public void setWX_USER_ID(String WX_USER_ID) {
        this.WX_USER_ID = WX_USER_ID;
    }

    public String getDING_USER_ID() {
        return DING_USER_ID;
    }

    public void setDING_USER_ID(String DING_USER_ID) {
        this.DING_USER_ID = DING_USER_ID;
    }

    public String getINIT_LOGIN() {
        return INIT_LOGIN;
    }

    public void setINIT_LOGIN(String INIT_LOGIN) {
        this.INIT_LOGIN = INIT_LOGIN;
    }

    public String getDATA_AUTH() {
        return DATA_AUTH;
    }

    public void setDATA_AUTH(String DATA_AUTH) {
        this.DATA_AUTH = DATA_AUTH;
    }

    public byte[] getPHOTO() {
        return PHOTO;
    }

    public void setPHOTO(byte[] PHOTO) {
        this.PHOTO = PHOTO;
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
        SyUser other = (SyUser) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getLOGIN_NAME() == null ? other.getLOGIN_NAME() == null : this.getLOGIN_NAME().equals(other.getLOGIN_NAME()))
            && (this.getNAME() == null ? other.getNAME() == null : this.getNAME().equals(other.getNAME()))
            && (this.getPW() == null ? other.getPW() == null : this.getPW().equals(other.getPW()))
            && (this.getENABLE() == null ? other.getENABLE() == null : this.getENABLE().equals(other.getENABLE()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getPHONE() == null ? other.getPHONE() == null : this.getPHONE().equals(other.getPHONE()))
            && (this.getMOBILE() == null ? other.getMOBILE() == null : this.getMOBILE().equals(other.getMOBILE()))
            && (this.getWEIXIN() == null ? other.getWEIXIN() == null : this.getWEIXIN().equals(other.getWEIXIN()))
            && (this.getEMAIL() == null ? other.getEMAIL() == null : this.getEMAIL().equals(other.getEMAIL()))
            && (this.getUSER_TYPE() == null ? other.getUSER_TYPE() == null : this.getUSER_TYPE().equals(other.getUSER_TYPE()))
            && (this.getFINGERPRINT() == null ? other.getFINGERPRINT() == null : this.getFINGERPRINT().equals(other.getFINGERPRINT()))
            && (this.getEDIT_PW_TIME() == null ? other.getEDIT_PW_TIME() == null : this.getEDIT_PW_TIME().equals(other.getEDIT_PW_TIME()))
            && (this.getPHOTO_NAME() == null ? other.getPHOTO_NAME() == null : this.getPHOTO_NAME().equals(other.getPHOTO_NAME()))
            && (this.getENGLISH_NAME() == null ? other.getENGLISH_NAME() == null : this.getENGLISH_NAME().equals(other.getENGLISH_NAME()))
            && (this.getEMP_SUP_CODE() == null ? other.getEMP_SUP_CODE() == null : this.getEMP_SUP_CODE().equals(other.getEMP_SUP_CODE()))
            && (this.getEMP_CUST_CODE() == null ? other.getEMP_CUST_CODE() == null : this.getEMP_CUST_CODE().equals(other.getEMP_CUST_CODE()))
            && (this.getUS_TIME_ZONE() == null ? other.getUS_TIME_ZONE() == null : this.getUS_TIME_ZONE().equals(other.getUS_TIME_ZONE()))
            && (this.getWX_USER_ID() == null ? other.getWX_USER_ID() == null : this.getWX_USER_ID().equals(other.getWX_USER_ID()))
            && (this.getDING_USER_ID() == null ? other.getDING_USER_ID() == null : this.getDING_USER_ID().equals(other.getDING_USER_ID()))
            && (this.getINIT_LOGIN() == null ? other.getINIT_LOGIN() == null : this.getINIT_LOGIN().equals(other.getINIT_LOGIN()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (Arrays.equals(this.getPHOTO(), other.getPHOTO()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getLOGIN_NAME() == null) ? 0 : getLOGIN_NAME().hashCode());
        result = prime * result + ((getNAME() == null) ? 0 : getNAME().hashCode());
        result = prime * result + ((getPW() == null) ? 0 : getPW().hashCode());
        result = prime * result + ((getENABLE() == null) ? 0 : getENABLE().hashCode());
        result = prime * result + ((getDEPT_ID() == null) ? 0 : getDEPT_ID().hashCode());
        result = prime * result + ((getPHONE() == null) ? 0 : getPHONE().hashCode());
        result = prime * result + ((getMOBILE() == null) ? 0 : getMOBILE().hashCode());
        result = prime * result + ((getWEIXIN() == null) ? 0 : getWEIXIN().hashCode());
        result = prime * result + ((getEMAIL() == null) ? 0 : getEMAIL().hashCode());
        result = prime * result + ((getUSER_TYPE() == null) ? 0 : getUSER_TYPE().hashCode());
        result = prime * result + ((getFINGERPRINT() == null) ? 0 : getFINGERPRINT().hashCode());
        result = prime * result + ((getEDIT_PW_TIME() == null) ? 0 : getEDIT_PW_TIME().hashCode());
        result = prime * result + ((getPHOTO_NAME() == null) ? 0 : getPHOTO_NAME().hashCode());
        result = prime * result + ((getENGLISH_NAME() == null) ? 0 : getENGLISH_NAME().hashCode());
        result = prime * result + ((getEMP_SUP_CODE() == null) ? 0 : getEMP_SUP_CODE().hashCode());
        result = prime * result + ((getEMP_CUST_CODE() == null) ? 0 : getEMP_CUST_CODE().hashCode());
        result = prime * result + ((getUS_TIME_ZONE() == null) ? 0 : getUS_TIME_ZONE().hashCode());
        result = prime * result + ((getWX_USER_ID() == null) ? 0 : getWX_USER_ID().hashCode());
        result = prime * result + ((getDING_USER_ID() == null) ? 0 : getDING_USER_ID().hashCode());
        result = prime * result + ((getINIT_LOGIN() == null) ? 0 : getINIT_LOGIN().hashCode());
        result = prime * result + ((getDATA_AUTH() == null) ? 0 : getDATA_AUTH().hashCode());
        result = prime * result + (Arrays.hashCode(getPHOTO()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", LOGIN_NAME=").append(LOGIN_NAME);
        sb.append(", NAME=").append(NAME);
        sb.append(", PW=").append(PW);
        sb.append(", ENABLE=").append(ENABLE);
        sb.append(", DEPT_ID=").append(DEPT_ID);
        sb.append(", PHONE=").append(PHONE);
        sb.append(", MOBILE=").append(MOBILE);
        sb.append(", WEIXIN=").append(WEIXIN);
        sb.append(", EMAIL=").append(EMAIL);
        sb.append(", USER_TYPE=").append(USER_TYPE);
        sb.append(", FINGERPRINT=").append(FINGERPRINT);
        sb.append(", EDIT_PW_TIME=").append(EDIT_PW_TIME);
        sb.append(", PHOTO_NAME=").append(PHOTO_NAME);
        sb.append(", ENGLISH_NAME=").append(ENGLISH_NAME);
        sb.append(", EMP_SUP_CODE=").append(EMP_SUP_CODE);
        sb.append(", EMP_CUST_CODE=").append(EMP_CUST_CODE);
        sb.append(", US_TIME_ZONE=").append(US_TIME_ZONE);
        sb.append(", WX_USER_ID=").append(WX_USER_ID);
        sb.append(", DING_USER_ID=").append(DING_USER_ID);
        sb.append(", INIT_LOGIN=").append(INIT_LOGIN);
        sb.append(", DATA_AUTH=").append(DATA_AUTH);
        sb.append(", PHOTO=").append(PHOTO);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}