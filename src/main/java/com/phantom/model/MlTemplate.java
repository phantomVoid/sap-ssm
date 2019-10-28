package com.phantom.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ML_TEMPLATE
 * @author 
 */
public class MlTemplate implements Serializable {
    private String ID;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    private String LABEL_NAME;

    private String STATUS;

    private String SAMPLE_MAP;

    private String MODEL_FILE;

    private String SHARE_SIGN;

    private BigDecimal PRINT_NUM;

    private String SAMPLE_MAP_S;

    private String MODEL_FILE_S;

    private BigDecimal LABEL_LENGTH;

    private BigDecimal LABEL_WIDTH;

    private String SIZE_UNIT;

    private String BOX_LABEL_FLAG;

    private String ALLOW_REPRINT;

    private String ALLOW_EDIT_COPIES;

    private String LABELCSS;

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

    public String getLABEL_NAME() {
        return LABEL_NAME;
    }

    public void setLABEL_NAME(String LABEL_NAME) {
        this.LABEL_NAME = LABEL_NAME;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getSAMPLE_MAP() {
        return SAMPLE_MAP;
    }

    public void setSAMPLE_MAP(String SAMPLE_MAP) {
        this.SAMPLE_MAP = SAMPLE_MAP;
    }

    public String getMODEL_FILE() {
        return MODEL_FILE;
    }

    public void setMODEL_FILE(String MODEL_FILE) {
        this.MODEL_FILE = MODEL_FILE;
    }

    public String getSHARE_SIGN() {
        return SHARE_SIGN;
    }

    public void setSHARE_SIGN(String SHARE_SIGN) {
        this.SHARE_SIGN = SHARE_SIGN;
    }

    public BigDecimal getPRINT_NUM() {
        return PRINT_NUM;
    }

    public void setPRINT_NUM(BigDecimal PRINT_NUM) {
        this.PRINT_NUM = PRINT_NUM;
    }

    public String getSAMPLE_MAP_S() {
        return SAMPLE_MAP_S;
    }

    public void setSAMPLE_MAP_S(String SAMPLE_MAP_S) {
        this.SAMPLE_MAP_S = SAMPLE_MAP_S;
    }

    public String getMODEL_FILE_S() {
        return MODEL_FILE_S;
    }

    public void setMODEL_FILE_S(String MODEL_FILE_S) {
        this.MODEL_FILE_S = MODEL_FILE_S;
    }

    public BigDecimal getLABEL_LENGTH() {
        return LABEL_LENGTH;
    }

    public void setLABEL_LENGTH(BigDecimal LABEL_LENGTH) {
        this.LABEL_LENGTH = LABEL_LENGTH;
    }

    public BigDecimal getLABEL_WIDTH() {
        return LABEL_WIDTH;
    }

    public void setLABEL_WIDTH(BigDecimal LABEL_WIDTH) {
        this.LABEL_WIDTH = LABEL_WIDTH;
    }

    public String getSIZE_UNIT() {
        return SIZE_UNIT;
    }

    public void setSIZE_UNIT(String SIZE_UNIT) {
        this.SIZE_UNIT = SIZE_UNIT;
    }

    public String getBOX_LABEL_FLAG() {
        return BOX_LABEL_FLAG;
    }

    public void setBOX_LABEL_FLAG(String BOX_LABEL_FLAG) {
        this.BOX_LABEL_FLAG = BOX_LABEL_FLAG;
    }

    public String getALLOW_REPRINT() {
        return ALLOW_REPRINT;
    }

    public void setALLOW_REPRINT(String ALLOW_REPRINT) {
        this.ALLOW_REPRINT = ALLOW_REPRINT;
    }

    public String getALLOW_EDIT_COPIES() {
        return ALLOW_EDIT_COPIES;
    }

    public void setALLOW_EDIT_COPIES(String ALLOW_EDIT_COPIES) {
        this.ALLOW_EDIT_COPIES = ALLOW_EDIT_COPIES;
    }

    public String getLABELCSS() {
        return LABELCSS;
    }

    public void setLABELCSS(String LABELCSS) {
        this.LABELCSS = LABELCSS;
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
        MlTemplate other = (MlTemplate) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getLABEL_NAME() == null ? other.getLABEL_NAME() == null : this.getLABEL_NAME().equals(other.getLABEL_NAME()))
            && (this.getSTATUS() == null ? other.getSTATUS() == null : this.getSTATUS().equals(other.getSTATUS()))
            && (this.getSAMPLE_MAP() == null ? other.getSAMPLE_MAP() == null : this.getSAMPLE_MAP().equals(other.getSAMPLE_MAP()))
            && (this.getMODEL_FILE() == null ? other.getMODEL_FILE() == null : this.getMODEL_FILE().equals(other.getMODEL_FILE()))
            && (this.getSHARE_SIGN() == null ? other.getSHARE_SIGN() == null : this.getSHARE_SIGN().equals(other.getSHARE_SIGN()))
            && (this.getPRINT_NUM() == null ? other.getPRINT_NUM() == null : this.getPRINT_NUM().equals(other.getPRINT_NUM()))
            && (this.getSAMPLE_MAP_S() == null ? other.getSAMPLE_MAP_S() == null : this.getSAMPLE_MAP_S().equals(other.getSAMPLE_MAP_S()))
            && (this.getMODEL_FILE_S() == null ? other.getMODEL_FILE_S() == null : this.getMODEL_FILE_S().equals(other.getMODEL_FILE_S()))
            && (this.getLABEL_LENGTH() == null ? other.getLABEL_LENGTH() == null : this.getLABEL_LENGTH().equals(other.getLABEL_LENGTH()))
            && (this.getLABEL_WIDTH() == null ? other.getLABEL_WIDTH() == null : this.getLABEL_WIDTH().equals(other.getLABEL_WIDTH()))
            && (this.getSIZE_UNIT() == null ? other.getSIZE_UNIT() == null : this.getSIZE_UNIT().equals(other.getSIZE_UNIT()))
            && (this.getBOX_LABEL_FLAG() == null ? other.getBOX_LABEL_FLAG() == null : this.getBOX_LABEL_FLAG().equals(other.getBOX_LABEL_FLAG()))
            && (this.getALLOW_REPRINT() == null ? other.getALLOW_REPRINT() == null : this.getALLOW_REPRINT().equals(other.getALLOW_REPRINT()))
            && (this.getALLOW_EDIT_COPIES() == null ? other.getALLOW_EDIT_COPIES() == null : this.getALLOW_EDIT_COPIES().equals(other.getALLOW_EDIT_COPIES()))
            && (this.getLABELCSS() == null ? other.getLABELCSS() == null : this.getLABELCSS().equals(other.getLABELCSS()));
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
        result = prime * result + ((getLABEL_NAME() == null) ? 0 : getLABEL_NAME().hashCode());
        result = prime * result + ((getSTATUS() == null) ? 0 : getSTATUS().hashCode());
        result = prime * result + ((getSAMPLE_MAP() == null) ? 0 : getSAMPLE_MAP().hashCode());
        result = prime * result + ((getMODEL_FILE() == null) ? 0 : getMODEL_FILE().hashCode());
        result = prime * result + ((getSHARE_SIGN() == null) ? 0 : getSHARE_SIGN().hashCode());
        result = prime * result + ((getPRINT_NUM() == null) ? 0 : getPRINT_NUM().hashCode());
        result = prime * result + ((getSAMPLE_MAP_S() == null) ? 0 : getSAMPLE_MAP_S().hashCode());
        result = prime * result + ((getMODEL_FILE_S() == null) ? 0 : getMODEL_FILE_S().hashCode());
        result = prime * result + ((getLABEL_LENGTH() == null) ? 0 : getLABEL_LENGTH().hashCode());
        result = prime * result + ((getLABEL_WIDTH() == null) ? 0 : getLABEL_WIDTH().hashCode());
        result = prime * result + ((getSIZE_UNIT() == null) ? 0 : getSIZE_UNIT().hashCode());
        result = prime * result + ((getBOX_LABEL_FLAG() == null) ? 0 : getBOX_LABEL_FLAG().hashCode());
        result = prime * result + ((getALLOW_REPRINT() == null) ? 0 : getALLOW_REPRINT().hashCode());
        result = prime * result + ((getALLOW_EDIT_COPIES() == null) ? 0 : getALLOW_EDIT_COPIES().hashCode());
        result = prime * result + ((getLABELCSS() == null) ? 0 : getLABELCSS().hashCode());
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
        sb.append(", LABEL_NAME=").append(LABEL_NAME);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", SAMPLE_MAP=").append(SAMPLE_MAP);
        sb.append(", MODEL_FILE=").append(MODEL_FILE);
        sb.append(", SHARE_SIGN=").append(SHARE_SIGN);
        sb.append(", PRINT_NUM=").append(PRINT_NUM);
        sb.append(", SAMPLE_MAP_S=").append(SAMPLE_MAP_S);
        sb.append(", MODEL_FILE_S=").append(MODEL_FILE_S);
        sb.append(", LABEL_LENGTH=").append(LABEL_LENGTH);
        sb.append(", LABEL_WIDTH=").append(LABEL_WIDTH);
        sb.append(", SIZE_UNIT=").append(SIZE_UNIT);
        sb.append(", BOX_LABEL_FLAG=").append(BOX_LABEL_FLAG);
        sb.append(", ALLOW_REPRINT=").append(ALLOW_REPRINT);
        sb.append(", ALLOW_EDIT_COPIES=").append(ALLOW_EDIT_COPIES);
        sb.append(", LABELCSS=").append(LABELCSS);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}