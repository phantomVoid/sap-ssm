package com.phantom.model;

import java.io.Serializable;
import java.util.Date;

/**
 * T_PM_PROJECT_REL
 * @author 
 */
public class TPmProjectRel implements Serializable {
    private String ID;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    private String PROJECT_ID;

    private String REL_PROJECT_ID;

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

    public String getREL_PROJECT_ID() {
        return REL_PROJECT_ID;
    }

    public void setREL_PROJECT_ID(String REL_PROJECT_ID) {
        this.REL_PROJECT_ID = REL_PROJECT_ID;
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
        TPmProjectRel other = (TPmProjectRel) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getPROJECT_ID() == null ? other.getPROJECT_ID() == null : this.getPROJECT_ID().equals(other.getPROJECT_ID()))
            && (this.getREL_PROJECT_ID() == null ? other.getREL_PROJECT_ID() == null : this.getREL_PROJECT_ID().equals(other.getREL_PROJECT_ID()));
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
        result = prime * result + ((getREL_PROJECT_ID() == null) ? 0 : getREL_PROJECT_ID().hashCode());
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
        sb.append(", REL_PROJECT_ID=").append(REL_PROJECT_ID);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}