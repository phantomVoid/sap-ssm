package com.phantom.model;

import java.io.Serializable;
import java.util.Date;

/**
 * T_CO_ITEM_LEVEL
 * @author 
 */
public class TCoItemLevel implements Serializable {
    /**
     * ID
     */
    private String ID;

    /**
     * 部门
     */
    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    /**
     * 物料层级代码
     */
    private String LEVEL_CODE;

    /**
     * 物料层级号
     */
    private String LEVEL_NO;

    /**
     * 物料层级描述
     */
    private String LEVEL_DESC;

    /**
     * 是否最末级
     */
    private String LEVEL_END;

    /**
     * 物料层级数据操作标识
     */
    private String LEVEL_DATA_OPT;

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

    public String getLEVEL_CODE() {
        return LEVEL_CODE;
    }

    public void setLEVEL_CODE(String LEVEL_CODE) {
        this.LEVEL_CODE = LEVEL_CODE;
    }

    public String getLEVEL_NO() {
        return LEVEL_NO;
    }

    public void setLEVEL_NO(String LEVEL_NO) {
        this.LEVEL_NO = LEVEL_NO;
    }

    public String getLEVEL_DESC() {
        return LEVEL_DESC;
    }

    public void setLEVEL_DESC(String LEVEL_DESC) {
        this.LEVEL_DESC = LEVEL_DESC;
    }

    public String getLEVEL_END() {
        return LEVEL_END;
    }

    public void setLEVEL_END(String LEVEL_END) {
        this.LEVEL_END = LEVEL_END;
    }

    public String getLEVEL_DATA_OPT() {
        return LEVEL_DATA_OPT;
    }

    public void setLEVEL_DATA_OPT(String LEVEL_DATA_OPT) {
        this.LEVEL_DATA_OPT = LEVEL_DATA_OPT;
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
        TCoItemLevel other = (TCoItemLevel) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getLEVEL_CODE() == null ? other.getLEVEL_CODE() == null : this.getLEVEL_CODE().equals(other.getLEVEL_CODE()))
            && (this.getLEVEL_NO() == null ? other.getLEVEL_NO() == null : this.getLEVEL_NO().equals(other.getLEVEL_NO()))
            && (this.getLEVEL_DESC() == null ? other.getLEVEL_DESC() == null : this.getLEVEL_DESC().equals(other.getLEVEL_DESC()))
            && (this.getLEVEL_END() == null ? other.getLEVEL_END() == null : this.getLEVEL_END().equals(other.getLEVEL_END()))
            && (this.getLEVEL_DATA_OPT() == null ? other.getLEVEL_DATA_OPT() == null : this.getLEVEL_DATA_OPT().equals(other.getLEVEL_DATA_OPT()));
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
        result = prime * result + ((getLEVEL_CODE() == null) ? 0 : getLEVEL_CODE().hashCode());
        result = prime * result + ((getLEVEL_NO() == null) ? 0 : getLEVEL_NO().hashCode());
        result = prime * result + ((getLEVEL_DESC() == null) ? 0 : getLEVEL_DESC().hashCode());
        result = prime * result + ((getLEVEL_END() == null) ? 0 : getLEVEL_END().hashCode());
        result = prime * result + ((getLEVEL_DATA_OPT() == null) ? 0 : getLEVEL_DATA_OPT().hashCode());
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
        sb.append(", LEVEL_CODE=").append(LEVEL_CODE);
        sb.append(", LEVEL_NO=").append(LEVEL_NO);
        sb.append(", LEVEL_DESC=").append(LEVEL_DESC);
        sb.append(", LEVEL_END=").append(LEVEL_END);
        sb.append(", LEVEL_DATA_OPT=").append(LEVEL_DATA_OPT);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}