package com.phantom.model;

import java.io.Serializable;
import java.util.Date;

/**
 * T_CO_LABEL_DATASOURCE
 * @author 
 */
public class TCoLabelDatasource implements Serializable {
    private String CLD_LABEL_ID;

    private String ID;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    private String CLD_CODE_ALIAS;

    private String CLD_NUM_ALIAS;

    private String CLD_SQL;

    private static final long serialVersionUID = 1L;

    public String getCLD_LABEL_ID() {
        return CLD_LABEL_ID;
    }

    public void setCLD_LABEL_ID(String CLD_LABEL_ID) {
        this.CLD_LABEL_ID = CLD_LABEL_ID;
    }

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

    public String getCLD_CODE_ALIAS() {
        return CLD_CODE_ALIAS;
    }

    public void setCLD_CODE_ALIAS(String CLD_CODE_ALIAS) {
        this.CLD_CODE_ALIAS = CLD_CODE_ALIAS;
    }

    public String getCLD_NUM_ALIAS() {
        return CLD_NUM_ALIAS;
    }

    public void setCLD_NUM_ALIAS(String CLD_NUM_ALIAS) {
        this.CLD_NUM_ALIAS = CLD_NUM_ALIAS;
    }

    public String getCLD_SQL() {
        return CLD_SQL;
    }

    public void setCLD_SQL(String CLD_SQL) {
        this.CLD_SQL = CLD_SQL;
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
        TCoLabelDatasource other = (TCoLabelDatasource) that;
        return (this.getCLD_LABEL_ID() == null ? other.getCLD_LABEL_ID() == null : this.getCLD_LABEL_ID().equals(other.getCLD_LABEL_ID()))
            && (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getCLD_CODE_ALIAS() == null ? other.getCLD_CODE_ALIAS() == null : this.getCLD_CODE_ALIAS().equals(other.getCLD_CODE_ALIAS()))
            && (this.getCLD_NUM_ALIAS() == null ? other.getCLD_NUM_ALIAS() == null : this.getCLD_NUM_ALIAS().equals(other.getCLD_NUM_ALIAS()))
            && (this.getCLD_SQL() == null ? other.getCLD_SQL() == null : this.getCLD_SQL().equals(other.getCLD_SQL()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCLD_LABEL_ID() == null) ? 0 : getCLD_LABEL_ID().hashCode());
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getDEPT_ID() == null) ? 0 : getDEPT_ID().hashCode());
        result = prime * result + ((getCREATE_USER() == null) ? 0 : getCREATE_USER().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getEDIT_USER() == null) ? 0 : getEDIT_USER().hashCode());
        result = prime * result + ((getEDIT_TIME() == null) ? 0 : getEDIT_TIME().hashCode());
        result = prime * result + ((getDATA_AUTH() == null) ? 0 : getDATA_AUTH().hashCode());
        result = prime * result + ((getCLD_CODE_ALIAS() == null) ? 0 : getCLD_CODE_ALIAS().hashCode());
        result = prime * result + ((getCLD_NUM_ALIAS() == null) ? 0 : getCLD_NUM_ALIAS().hashCode());
        result = prime * result + ((getCLD_SQL() == null) ? 0 : getCLD_SQL().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", CLD_LABEL_ID=").append(CLD_LABEL_ID);
        sb.append(", ID=").append(ID);
        sb.append(", DEPT_ID=").append(DEPT_ID);
        sb.append(", CREATE_USER=").append(CREATE_USER);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", EDIT_USER=").append(EDIT_USER);
        sb.append(", EDIT_TIME=").append(EDIT_TIME);
        sb.append(", DATA_AUTH=").append(DATA_AUTH);
        sb.append(", CLD_CODE_ALIAS=").append(CLD_CODE_ALIAS);
        sb.append(", CLD_NUM_ALIAS=").append(CLD_NUM_ALIAS);
        sb.append(", CLD_SQL=").append(CLD_SQL);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}