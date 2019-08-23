package com.phantom.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * T_PM_PROJECT_FEED_DETAIL
 * @author 
 */
public class TPmProjectFeedDetail implements Serializable {
    private String ID;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    private String PROJECT_ID;

    private String ITEM_CODE;

    private String MODEL_CODE;

    private BigDecimal ITEM_NUM;

    private BigDecimal FEED_NUM;

    private String PROCESS_ORDER;

    private String RAW_LOTNUMBER;

    private String STOCK_CODE;

    private String WORK_SPACE;

    private String WAREHOUSE;

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

    public String getPROJECT_ID() {
        return PROJECT_ID;
    }

    public void setPROJECT_ID(String PROJECT_ID) {
        this.PROJECT_ID = PROJECT_ID;
    }

    public String getITEM_CODE() {
        return ITEM_CODE;
    }

    public void setITEM_CODE(String ITEM_CODE) {
        this.ITEM_CODE = ITEM_CODE;
    }

    public String getMODEL_CODE() {
        return MODEL_CODE;
    }

    public void setMODEL_CODE(String MODEL_CODE) {
        this.MODEL_CODE = MODEL_CODE;
    }

    public BigDecimal getITEM_NUM() {
        return ITEM_NUM;
    }

    public void setITEM_NUM(BigDecimal ITEM_NUM) {
        this.ITEM_NUM = ITEM_NUM;
    }

    public BigDecimal getFEED_NUM() {
        return FEED_NUM;
    }

    public void setFEED_NUM(BigDecimal FEED_NUM) {
        this.FEED_NUM = FEED_NUM;
    }

    public String getPROCESS_ORDER() {
        return PROCESS_ORDER;
    }

    public void setPROCESS_ORDER(String PROCESS_ORDER) {
        this.PROCESS_ORDER = PROCESS_ORDER;
    }

    public String getRAW_LOTNUMBER() {
        return RAW_LOTNUMBER;
    }

    public void setRAW_LOTNUMBER(String RAW_LOTNUMBER) {
        this.RAW_LOTNUMBER = RAW_LOTNUMBER;
    }

    public String getSTOCK_CODE() {
        return STOCK_CODE;
    }

    public void setSTOCK_CODE(String STOCK_CODE) {
        this.STOCK_CODE = STOCK_CODE;
    }

    public String getWORK_SPACE() {
        return WORK_SPACE;
    }

    public void setWORK_SPACE(String WORK_SPACE) {
        this.WORK_SPACE = WORK_SPACE;
    }

    public String getWAREHOUSE() {
        return WAREHOUSE;
    }

    public void setWAREHOUSE(String WAREHOUSE) {
        this.WAREHOUSE = WAREHOUSE;
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
        TPmProjectFeedDetail other = (TPmProjectFeedDetail) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getPROJECT_ID() == null ? other.getPROJECT_ID() == null : this.getPROJECT_ID().equals(other.getPROJECT_ID()))
            && (this.getITEM_CODE() == null ? other.getITEM_CODE() == null : this.getITEM_CODE().equals(other.getITEM_CODE()))
            && (this.getMODEL_CODE() == null ? other.getMODEL_CODE() == null : this.getMODEL_CODE().equals(other.getMODEL_CODE()))
            && (this.getITEM_NUM() == null ? other.getITEM_NUM() == null : this.getITEM_NUM().equals(other.getITEM_NUM()))
            && (this.getFEED_NUM() == null ? other.getFEED_NUM() == null : this.getFEED_NUM().equals(other.getFEED_NUM()))
            && (this.getPROCESS_ORDER() == null ? other.getPROCESS_ORDER() == null : this.getPROCESS_ORDER().equals(other.getPROCESS_ORDER()))
            && (this.getRAW_LOTNUMBER() == null ? other.getRAW_LOTNUMBER() == null : this.getRAW_LOTNUMBER().equals(other.getRAW_LOTNUMBER()))
            && (this.getSTOCK_CODE() == null ? other.getSTOCK_CODE() == null : this.getSTOCK_CODE().equals(other.getSTOCK_CODE()))
            && (this.getWORK_SPACE() == null ? other.getWORK_SPACE() == null : this.getWORK_SPACE().equals(other.getWORK_SPACE()))
            && (this.getWAREHOUSE() == null ? other.getWAREHOUSE() == null : this.getWAREHOUSE().equals(other.getWAREHOUSE()));
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
        result = prime * result + ((getPROJECT_ID() == null) ? 0 : getPROJECT_ID().hashCode());
        result = prime * result + ((getITEM_CODE() == null) ? 0 : getITEM_CODE().hashCode());
        result = prime * result + ((getMODEL_CODE() == null) ? 0 : getMODEL_CODE().hashCode());
        result = prime * result + ((getITEM_NUM() == null) ? 0 : getITEM_NUM().hashCode());
        result = prime * result + ((getFEED_NUM() == null) ? 0 : getFEED_NUM().hashCode());
        result = prime * result + ((getPROCESS_ORDER() == null) ? 0 : getPROCESS_ORDER().hashCode());
        result = prime * result + ((getRAW_LOTNUMBER() == null) ? 0 : getRAW_LOTNUMBER().hashCode());
        result = prime * result + ((getSTOCK_CODE() == null) ? 0 : getSTOCK_CODE().hashCode());
        result = prime * result + ((getWORK_SPACE() == null) ? 0 : getWORK_SPACE().hashCode());
        result = prime * result + ((getWAREHOUSE() == null) ? 0 : getWAREHOUSE().hashCode());
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
        sb.append(", PROJECT_ID=").append(PROJECT_ID);
        sb.append(", ITEM_CODE=").append(ITEM_CODE);
        sb.append(", MODEL_CODE=").append(MODEL_CODE);
        sb.append(", ITEM_NUM=").append(ITEM_NUM);
        sb.append(", FEED_NUM=").append(FEED_NUM);
        sb.append(", PROCESS_ORDER=").append(PROCESS_ORDER);
        sb.append(", RAW_LOTNUMBER=").append(RAW_LOTNUMBER);
        sb.append(", STOCK_CODE=").append(STOCK_CODE);
        sb.append(", WORK_SPACE=").append(WORK_SPACE);
        sb.append(", WAREHOUSE=").append(WAREHOUSE);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}