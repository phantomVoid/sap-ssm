package com.phantom.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * T_PROJECT_PACK_FEED
 * @author 
 */
public class TProjectPackFeed implements Serializable {
    private String ID;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    private String PROJECT_ID;

    private String ITEM_CODE;

    private BigDecimal RECEIVE_COUNT;

    private BigDecimal PACK_NUM;

    private String ITEM_MANE;

    private String ITEM_SPEC;

    private BigDecimal ITEM_NUM;

    private String MESSAGE;

    private String SFLAG;

    private String WORK_SPACE;

    private String WARE_HOUSE;

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

    public BigDecimal getRECEIVE_COUNT() {
        return RECEIVE_COUNT;
    }

    public void setRECEIVE_COUNT(BigDecimal RECEIVE_COUNT) {
        this.RECEIVE_COUNT = RECEIVE_COUNT;
    }

    public BigDecimal getPACK_NUM() {
        return PACK_NUM;
    }

    public void setPACK_NUM(BigDecimal PACK_NUM) {
        this.PACK_NUM = PACK_NUM;
    }

    public String getITEM_MANE() {
        return ITEM_MANE;
    }

    public void setITEM_MANE(String ITEM_MANE) {
        this.ITEM_MANE = ITEM_MANE;
    }

    public String getITEM_SPEC() {
        return ITEM_SPEC;
    }

    public void setITEM_SPEC(String ITEM_SPEC) {
        this.ITEM_SPEC = ITEM_SPEC;
    }

    public BigDecimal getITEM_NUM() {
        return ITEM_NUM;
    }

    public void setITEM_NUM(BigDecimal ITEM_NUM) {
        this.ITEM_NUM = ITEM_NUM;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public String getSFLAG() {
        return SFLAG;
    }

    public void setSFLAG(String SFLAG) {
        this.SFLAG = SFLAG;
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
        TProjectPackFeed other = (TProjectPackFeed) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getPROJECT_ID() == null ? other.getPROJECT_ID() == null : this.getPROJECT_ID().equals(other.getPROJECT_ID()))
            && (this.getITEM_CODE() == null ? other.getITEM_CODE() == null : this.getITEM_CODE().equals(other.getITEM_CODE()))
            && (this.getRECEIVE_COUNT() == null ? other.getRECEIVE_COUNT() == null : this.getRECEIVE_COUNT().equals(other.getRECEIVE_COUNT()))
            && (this.getPACK_NUM() == null ? other.getPACK_NUM() == null : this.getPACK_NUM().equals(other.getPACK_NUM()))
            && (this.getITEM_MANE() == null ? other.getITEM_MANE() == null : this.getITEM_MANE().equals(other.getITEM_MANE()))
            && (this.getITEM_SPEC() == null ? other.getITEM_SPEC() == null : this.getITEM_SPEC().equals(other.getITEM_SPEC()))
            && (this.getITEM_NUM() == null ? other.getITEM_NUM() == null : this.getITEM_NUM().equals(other.getITEM_NUM()))
            && (this.getMESSAGE() == null ? other.getMESSAGE() == null : this.getMESSAGE().equals(other.getMESSAGE()))
            && (this.getSFLAG() == null ? other.getSFLAG() == null : this.getSFLAG().equals(other.getSFLAG()))
            && (this.getWORK_SPACE() == null ? other.getWORK_SPACE() == null : this.getWORK_SPACE().equals(other.getWORK_SPACE()))
            && (this.getWARE_HOUSE() == null ? other.getWARE_HOUSE() == null : this.getWARE_HOUSE().equals(other.getWARE_HOUSE()));
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
        result = prime * result + ((getRECEIVE_COUNT() == null) ? 0 : getRECEIVE_COUNT().hashCode());
        result = prime * result + ((getPACK_NUM() == null) ? 0 : getPACK_NUM().hashCode());
        result = prime * result + ((getITEM_MANE() == null) ? 0 : getITEM_MANE().hashCode());
        result = prime * result + ((getITEM_SPEC() == null) ? 0 : getITEM_SPEC().hashCode());
        result = prime * result + ((getITEM_NUM() == null) ? 0 : getITEM_NUM().hashCode());
        result = prime * result + ((getMESSAGE() == null) ? 0 : getMESSAGE().hashCode());
        result = prime * result + ((getSFLAG() == null) ? 0 : getSFLAG().hashCode());
        result = prime * result + ((getWORK_SPACE() == null) ? 0 : getWORK_SPACE().hashCode());
        result = prime * result + ((getWARE_HOUSE() == null) ? 0 : getWARE_HOUSE().hashCode());
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
        sb.append(", RECEIVE_COUNT=").append(RECEIVE_COUNT);
        sb.append(", PACK_NUM=").append(PACK_NUM);
        sb.append(", ITEM_MANE=").append(ITEM_MANE);
        sb.append(", ITEM_SPEC=").append(ITEM_SPEC);
        sb.append(", ITEM_NUM=").append(ITEM_NUM);
        sb.append(", MESSAGE=").append(MESSAGE);
        sb.append(", SFLAG=").append(SFLAG);
        sb.append(", WORK_SPACE=").append(WORK_SPACE);
        sb.append(", WARE_HOUSE=").append(WARE_HOUSE);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}