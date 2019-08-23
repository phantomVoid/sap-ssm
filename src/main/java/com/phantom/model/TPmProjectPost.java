package com.phantom.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * T_PM_PROJECT_POST
 * @author 
 */
public class TPmProjectPost implements Serializable {
    private String ID;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    private String ITEM_SN;

    private String PROJECT_ID;

    private String WORK_SPACE;

    private String ITEM_CODE;

    private BigDecimal ITEM_NUM;

    private String BASE_UNIT;

    private String LOT;

    private String WARE_HOUSE;

    private String REVERSE;

    private String SFLAG;

    private String MESSAGE;

    private String PROJECT_SORT;

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

    public String getITEM_SN() {
        return ITEM_SN;
    }

    public void setITEM_SN(String ITEM_SN) {
        this.ITEM_SN = ITEM_SN;
    }

    public String getPROJECT_ID() {
        return PROJECT_ID;
    }

    public void setPROJECT_ID(String PROJECT_ID) {
        this.PROJECT_ID = PROJECT_ID;
    }

    public String getWORK_SPACE() {
        return WORK_SPACE;
    }

    public void setWORK_SPACE(String WORK_SPACE) {
        this.WORK_SPACE = WORK_SPACE;
    }

    public String getITEM_CODE() {
        return ITEM_CODE;
    }

    public void setITEM_CODE(String ITEM_CODE) {
        this.ITEM_CODE = ITEM_CODE;
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

    public String getLOT() {
        return LOT;
    }

    public void setLOT(String LOT) {
        this.LOT = LOT;
    }

    public String getWARE_HOUSE() {
        return WARE_HOUSE;
    }

    public void setWARE_HOUSE(String WARE_HOUSE) {
        this.WARE_HOUSE = WARE_HOUSE;
    }

    public String getREVERSE() {
        return REVERSE;
    }

    public void setREVERSE(String REVERSE) {
        this.REVERSE = REVERSE;
    }

    public String getSFLAG() {
        return SFLAG;
    }

    public void setSFLAG(String SFLAG) {
        this.SFLAG = SFLAG;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public String getPROJECT_SORT() {
        return PROJECT_SORT;
    }

    public void setPROJECT_SORT(String PROJECT_SORT) {
        this.PROJECT_SORT = PROJECT_SORT;
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
        TPmProjectPost other = (TPmProjectPost) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getITEM_SN() == null ? other.getITEM_SN() == null : this.getITEM_SN().equals(other.getITEM_SN()))
            && (this.getPROJECT_ID() == null ? other.getPROJECT_ID() == null : this.getPROJECT_ID().equals(other.getPROJECT_ID()))
            && (this.getWORK_SPACE() == null ? other.getWORK_SPACE() == null : this.getWORK_SPACE().equals(other.getWORK_SPACE()))
            && (this.getITEM_CODE() == null ? other.getITEM_CODE() == null : this.getITEM_CODE().equals(other.getITEM_CODE()))
            && (this.getITEM_NUM() == null ? other.getITEM_NUM() == null : this.getITEM_NUM().equals(other.getITEM_NUM()))
            && (this.getBASE_UNIT() == null ? other.getBASE_UNIT() == null : this.getBASE_UNIT().equals(other.getBASE_UNIT()))
            && (this.getLOT() == null ? other.getLOT() == null : this.getLOT().equals(other.getLOT()))
            && (this.getWARE_HOUSE() == null ? other.getWARE_HOUSE() == null : this.getWARE_HOUSE().equals(other.getWARE_HOUSE()))
            && (this.getREVERSE() == null ? other.getREVERSE() == null : this.getREVERSE().equals(other.getREVERSE()))
            && (this.getSFLAG() == null ? other.getSFLAG() == null : this.getSFLAG().equals(other.getSFLAG()))
            && (this.getMESSAGE() == null ? other.getMESSAGE() == null : this.getMESSAGE().equals(other.getMESSAGE()))
            && (this.getPROJECT_SORT() == null ? other.getPROJECT_SORT() == null : this.getPROJECT_SORT().equals(other.getPROJECT_SORT()));
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
        result = prime * result + ((getITEM_SN() == null) ? 0 : getITEM_SN().hashCode());
        result = prime * result + ((getPROJECT_ID() == null) ? 0 : getPROJECT_ID().hashCode());
        result = prime * result + ((getWORK_SPACE() == null) ? 0 : getWORK_SPACE().hashCode());
        result = prime * result + ((getITEM_CODE() == null) ? 0 : getITEM_CODE().hashCode());
        result = prime * result + ((getITEM_NUM() == null) ? 0 : getITEM_NUM().hashCode());
        result = prime * result + ((getBASE_UNIT() == null) ? 0 : getBASE_UNIT().hashCode());
        result = prime * result + ((getLOT() == null) ? 0 : getLOT().hashCode());
        result = prime * result + ((getWARE_HOUSE() == null) ? 0 : getWARE_HOUSE().hashCode());
        result = prime * result + ((getREVERSE() == null) ? 0 : getREVERSE().hashCode());
        result = prime * result + ((getSFLAG() == null) ? 0 : getSFLAG().hashCode());
        result = prime * result + ((getMESSAGE() == null) ? 0 : getMESSAGE().hashCode());
        result = prime * result + ((getPROJECT_SORT() == null) ? 0 : getPROJECT_SORT().hashCode());
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
        sb.append(", ITEM_SN=").append(ITEM_SN);
        sb.append(", PROJECT_ID=").append(PROJECT_ID);
        sb.append(", WORK_SPACE=").append(WORK_SPACE);
        sb.append(", ITEM_CODE=").append(ITEM_CODE);
        sb.append(", ITEM_NUM=").append(ITEM_NUM);
        sb.append(", BASE_UNIT=").append(BASE_UNIT);
        sb.append(", LOT=").append(LOT);
        sb.append(", WARE_HOUSE=").append(WARE_HOUSE);
        sb.append(", REVERSE=").append(REVERSE);
        sb.append(", SFLAG=").append(SFLAG);
        sb.append(", MESSAGE=").append(MESSAGE);
        sb.append(", PROJECT_SORT=").append(PROJECT_SORT);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}