package com.phantom.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * T_ACCOUNT_CHECK_INFO
 * @author 
 */
public class TAccountCheckInfo implements Serializable {
    private String ID;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    private String CERT_SN;

    private String CERT_YEAR;

    private String CERT_THING;

    private String MOVE_TYPE;

    private String ITEM_CODE;

    private String WORK_SPACE;

    private String WARE_HOUSE;

    private String LOT;

    private BigDecimal ITEM_NUM;

    private String BASE_UNIT;

    private String PROJECT_ID;

    private Date POST_DATE;

    private Date CERT_DATE;

    private BigDecimal CONFIRM_OUTPUT;

    private String REL_ID;

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

    public String getCERT_SN() {
        return CERT_SN;
    }

    public void setCERT_SN(String CERT_SN) {
        this.CERT_SN = CERT_SN;
    }

    public String getCERT_YEAR() {
        return CERT_YEAR;
    }

    public void setCERT_YEAR(String CERT_YEAR) {
        this.CERT_YEAR = CERT_YEAR;
    }

    public String getCERT_THING() {
        return CERT_THING;
    }

    public void setCERT_THING(String CERT_THING) {
        this.CERT_THING = CERT_THING;
    }

    public String getMOVE_TYPE() {
        return MOVE_TYPE;
    }

    public void setMOVE_TYPE(String MOVE_TYPE) {
        this.MOVE_TYPE = MOVE_TYPE;
    }

    public String getITEM_CODE() {
        return ITEM_CODE;
    }

    public void setITEM_CODE(String ITEM_CODE) {
        this.ITEM_CODE = ITEM_CODE;
    }

    public String getWORK_SPACE() {
        return WORK_SPACE;
    }

    public void setWORK_SPACE(String WORK_SPACE) {
        this.WORK_SPACE = WORK_SPACE;
    }

    public String getWARE_HOUSE() {
        return WARE_HOUSE;
    }

    public void setWARE_HOUSE(String WARE_HOUSE) {
        this.WARE_HOUSE = WARE_HOUSE;
    }

    public String getLOT() {
        return LOT;
    }

    public void setLOT(String LOT) {
        this.LOT = LOT;
    }

    public BigDecimal getITEM_NUM() {
        return ITEM_NUM;
    }

    public void setITEM_NUM(BigDecimal ITEM_NUM) {
        this.ITEM_NUM = ITEM_NUM;
    }

    public String getBASE_UNIT() {
        return BASE_UNIT;
    }

    public void setBASE_UNIT(String BASE_UNIT) {
        this.BASE_UNIT = BASE_UNIT;
    }

    public String getPROJECT_ID() {
        return PROJECT_ID;
    }

    public void setPROJECT_ID(String PROJECT_ID) {
        this.PROJECT_ID = PROJECT_ID;
    }

    public Date getPOST_DATE() {
        return POST_DATE;
    }

    public void setPOST_DATE(Date POST_DATE) {
        this.POST_DATE = POST_DATE;
    }

    public Date getCERT_DATE() {
        return CERT_DATE;
    }

    public void setCERT_DATE(Date CERT_DATE) {
        this.CERT_DATE = CERT_DATE;
    }

    public BigDecimal getCONFIRM_OUTPUT() {
        return CONFIRM_OUTPUT;
    }

    public void setCONFIRM_OUTPUT(BigDecimal CONFIRM_OUTPUT) {
        this.CONFIRM_OUTPUT = CONFIRM_OUTPUT;
    }

    public String getREL_ID() {
        return REL_ID;
    }

    public void setREL_ID(String REL_ID) {
        this.REL_ID = REL_ID;
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
        TAccountCheckInfo other = (TAccountCheckInfo) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getCERT_SN() == null ? other.getCERT_SN() == null : this.getCERT_SN().equals(other.getCERT_SN()))
            && (this.getCERT_YEAR() == null ? other.getCERT_YEAR() == null : this.getCERT_YEAR().equals(other.getCERT_YEAR()))
            && (this.getCERT_THING() == null ? other.getCERT_THING() == null : this.getCERT_THING().equals(other.getCERT_THING()))
            && (this.getMOVE_TYPE() == null ? other.getMOVE_TYPE() == null : this.getMOVE_TYPE().equals(other.getMOVE_TYPE()))
            && (this.getITEM_CODE() == null ? other.getITEM_CODE() == null : this.getITEM_CODE().equals(other.getITEM_CODE()))
            && (this.getWORK_SPACE() == null ? other.getWORK_SPACE() == null : this.getWORK_SPACE().equals(other.getWORK_SPACE()))
            && (this.getWARE_HOUSE() == null ? other.getWARE_HOUSE() == null : this.getWARE_HOUSE().equals(other.getWARE_HOUSE()))
            && (this.getLOT() == null ? other.getLOT() == null : this.getLOT().equals(other.getLOT()))
            && (this.getITEM_NUM() == null ? other.getITEM_NUM() == null : this.getITEM_NUM().equals(other.getITEM_NUM()))
            && (this.getBASE_UNIT() == null ? other.getBASE_UNIT() == null : this.getBASE_UNIT().equals(other.getBASE_UNIT()))
            && (this.getPROJECT_ID() == null ? other.getPROJECT_ID() == null : this.getPROJECT_ID().equals(other.getPROJECT_ID()))
            && (this.getPOST_DATE() == null ? other.getPOST_DATE() == null : this.getPOST_DATE().equals(other.getPOST_DATE()))
            && (this.getCERT_DATE() == null ? other.getCERT_DATE() == null : this.getCERT_DATE().equals(other.getCERT_DATE()))
            && (this.getCONFIRM_OUTPUT() == null ? other.getCONFIRM_OUTPUT() == null : this.getCONFIRM_OUTPUT().equals(other.getCONFIRM_OUTPUT()))
            && (this.getREL_ID() == null ? other.getREL_ID() == null : this.getREL_ID().equals(other.getREL_ID()));
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
        result = prime * result + ((getCERT_SN() == null) ? 0 : getCERT_SN().hashCode());
        result = prime * result + ((getCERT_YEAR() == null) ? 0 : getCERT_YEAR().hashCode());
        result = prime * result + ((getCERT_THING() == null) ? 0 : getCERT_THING().hashCode());
        result = prime * result + ((getMOVE_TYPE() == null) ? 0 : getMOVE_TYPE().hashCode());
        result = prime * result + ((getITEM_CODE() == null) ? 0 : getITEM_CODE().hashCode());
        result = prime * result + ((getWORK_SPACE() == null) ? 0 : getWORK_SPACE().hashCode());
        result = prime * result + ((getWARE_HOUSE() == null) ? 0 : getWARE_HOUSE().hashCode());
        result = prime * result + ((getLOT() == null) ? 0 : getLOT().hashCode());
        result = prime * result + ((getITEM_NUM() == null) ? 0 : getITEM_NUM().hashCode());
        result = prime * result + ((getBASE_UNIT() == null) ? 0 : getBASE_UNIT().hashCode());
        result = prime * result + ((getPROJECT_ID() == null) ? 0 : getPROJECT_ID().hashCode());
        result = prime * result + ((getPOST_DATE() == null) ? 0 : getPOST_DATE().hashCode());
        result = prime * result + ((getCERT_DATE() == null) ? 0 : getCERT_DATE().hashCode());
        result = prime * result + ((getCONFIRM_OUTPUT() == null) ? 0 : getCONFIRM_OUTPUT().hashCode());
        result = prime * result + ((getREL_ID() == null) ? 0 : getREL_ID().hashCode());
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
        sb.append(", CERT_SN=").append(CERT_SN);
        sb.append(", CERT_YEAR=").append(CERT_YEAR);
        sb.append(", CERT_THING=").append(CERT_THING);
        sb.append(", MOVE_TYPE=").append(MOVE_TYPE);
        sb.append(", ITEM_CODE=").append(ITEM_CODE);
        sb.append(", WORK_SPACE=").append(WORK_SPACE);
        sb.append(", WARE_HOUSE=").append(WARE_HOUSE);
        sb.append(", LOT=").append(LOT);
        sb.append(", ITEM_NUM=").append(ITEM_NUM);
        sb.append(", BASE_UNIT=").append(BASE_UNIT);
        sb.append(", PROJECT_ID=").append(PROJECT_ID);
        sb.append(", POST_DATE=").append(POST_DATE);
        sb.append(", CERT_DATE=").append(CERT_DATE);
        sb.append(", CONFIRM_OUTPUT=").append(CONFIRM_OUTPUT);
        sb.append(", REL_ID=").append(REL_ID);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}