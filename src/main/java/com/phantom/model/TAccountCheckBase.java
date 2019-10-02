package com.phantom.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * T_ACCOUNT_CHECK_BASE
 * @author 
 */
public class TAccountCheckBase implements Serializable {
    private String ID;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    private String PROJECT_ID;

    private BigDecimal MES_ROWS;

    private BigDecimal MES_ITEM_SUM;

    private BigDecimal MES_FINISH_SUM;

    private BigDecimal SAP_ROWS;

    private BigDecimal SAP_ITEM_SUM;

    private BigDecimal SAP_FINISH_SUM;

    private String CHECK_FLAG;

    private String CHECK_DESC;

    private String MOVE_TYPE;

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

    public String getPROJECT_ID() {
        return PROJECT_ID;
    }

    public void setPROJECT_ID(String PROJECT_ID) {
        this.PROJECT_ID = PROJECT_ID;
    }

    public BigDecimal getMES_ROWS() {
        return MES_ROWS;
    }

    public void setMES_ROWS(BigDecimal MES_ROWS) {
        this.MES_ROWS = MES_ROWS;
    }

    public BigDecimal getMES_ITEM_SUM() {
        return MES_ITEM_SUM;
    }

    public void setMES_ITEM_SUM(BigDecimal MES_ITEM_SUM) {
        this.MES_ITEM_SUM = MES_ITEM_SUM;
    }

    public BigDecimal getMES_FINISH_SUM() {
        return MES_FINISH_SUM;
    }

    public void setMES_FINISH_SUM(BigDecimal MES_FINISH_SUM) {
        this.MES_FINISH_SUM = MES_FINISH_SUM;
    }

    public BigDecimal getSAP_ROWS() {
        return SAP_ROWS;
    }

    public void setSAP_ROWS(BigDecimal SAP_ROWS) {
        this.SAP_ROWS = SAP_ROWS;
    }

    public BigDecimal getSAP_ITEM_SUM() {
        return SAP_ITEM_SUM;
    }

    public void setSAP_ITEM_SUM(BigDecimal SAP_ITEM_SUM) {
        this.SAP_ITEM_SUM = SAP_ITEM_SUM;
    }

    public BigDecimal getSAP_FINISH_SUM() {
        return SAP_FINISH_SUM;
    }

    public void setSAP_FINISH_SUM(BigDecimal SAP_FINISH_SUM) {
        this.SAP_FINISH_SUM = SAP_FINISH_SUM;
    }

    public String getCHECK_FLAG() {
        return CHECK_FLAG;
    }

    public void setCHECK_FLAG(String CHECK_FLAG) {
        this.CHECK_FLAG = CHECK_FLAG;
    }

    public String getCHECK_DESC() {
        return CHECK_DESC;
    }

    public void setCHECK_DESC(String CHECK_DESC) {
        this.CHECK_DESC = CHECK_DESC;
    }

    public String getMOVE_TYPE() {
        return MOVE_TYPE;
    }

    public void setMOVE_TYPE(String MOVE_TYPE) {
        this.MOVE_TYPE = MOVE_TYPE;
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
        TAccountCheckBase other = (TAccountCheckBase) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getPROJECT_ID() == null ? other.getPROJECT_ID() == null : this.getPROJECT_ID().equals(other.getPROJECT_ID()))
            && (this.getMES_ROWS() == null ? other.getMES_ROWS() == null : this.getMES_ROWS().equals(other.getMES_ROWS()))
            && (this.getMES_ITEM_SUM() == null ? other.getMES_ITEM_SUM() == null : this.getMES_ITEM_SUM().equals(other.getMES_ITEM_SUM()))
            && (this.getMES_FINISH_SUM() == null ? other.getMES_FINISH_SUM() == null : this.getMES_FINISH_SUM().equals(other.getMES_FINISH_SUM()))
            && (this.getSAP_ROWS() == null ? other.getSAP_ROWS() == null : this.getSAP_ROWS().equals(other.getSAP_ROWS()))
            && (this.getSAP_ITEM_SUM() == null ? other.getSAP_ITEM_SUM() == null : this.getSAP_ITEM_SUM().equals(other.getSAP_ITEM_SUM()))
            && (this.getSAP_FINISH_SUM() == null ? other.getSAP_FINISH_SUM() == null : this.getSAP_FINISH_SUM().equals(other.getSAP_FINISH_SUM()))
            && (this.getCHECK_FLAG() == null ? other.getCHECK_FLAG() == null : this.getCHECK_FLAG().equals(other.getCHECK_FLAG()))
            && (this.getCHECK_DESC() == null ? other.getCHECK_DESC() == null : this.getCHECK_DESC().equals(other.getCHECK_DESC()))
            && (this.getMOVE_TYPE() == null ? other.getMOVE_TYPE() == null : this.getMOVE_TYPE().equals(other.getMOVE_TYPE()))
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
        result = prime * result + ((getPROJECT_ID() == null) ? 0 : getPROJECT_ID().hashCode());
        result = prime * result + ((getMES_ROWS() == null) ? 0 : getMES_ROWS().hashCode());
        result = prime * result + ((getMES_ITEM_SUM() == null) ? 0 : getMES_ITEM_SUM().hashCode());
        result = prime * result + ((getMES_FINISH_SUM() == null) ? 0 : getMES_FINISH_SUM().hashCode());
        result = prime * result + ((getSAP_ROWS() == null) ? 0 : getSAP_ROWS().hashCode());
        result = prime * result + ((getSAP_ITEM_SUM() == null) ? 0 : getSAP_ITEM_SUM().hashCode());
        result = prime * result + ((getSAP_FINISH_SUM() == null) ? 0 : getSAP_FINISH_SUM().hashCode());
        result = prime * result + ((getCHECK_FLAG() == null) ? 0 : getCHECK_FLAG().hashCode());
        result = prime * result + ((getCHECK_DESC() == null) ? 0 : getCHECK_DESC().hashCode());
        result = prime * result + ((getMOVE_TYPE() == null) ? 0 : getMOVE_TYPE().hashCode());
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
        sb.append(", PROJECT_ID=").append(PROJECT_ID);
        sb.append(", MES_ROWS=").append(MES_ROWS);
        sb.append(", MES_ITEM_SUM=").append(MES_ITEM_SUM);
        sb.append(", MES_FINISH_SUM=").append(MES_FINISH_SUM);
        sb.append(", SAP_ROWS=").append(SAP_ROWS);
        sb.append(", SAP_ITEM_SUM=").append(SAP_ITEM_SUM);
        sb.append(", SAP_FINISH_SUM=").append(SAP_FINISH_SUM);
        sb.append(", CHECK_FLAG=").append(CHECK_FLAG);
        sb.append(", CHECK_DESC=").append(CHECK_DESC);
        sb.append(", MOVE_TYPE=").append(MOVE_TYPE);
        sb.append(", REL_ID=").append(REL_ID);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}