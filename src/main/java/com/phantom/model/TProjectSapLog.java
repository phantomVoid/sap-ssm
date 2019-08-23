package com.phantom.model;

import java.io.Serializable;
import java.util.Date;

/**
 * T_PROJECT_SAP_LOG
 * @author 
 */
public class TProjectSapLog implements Serializable {
    private String ID;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    private String PROJECT_ID;

    private String ITEM_SN;

    private String SFLAG;

    private String MESSAGE;

    private String INTF_TYPE;

    private String INTF_NAME;

    private String SAP_INFO;

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

    public String getITEM_SN() {
        return ITEM_SN;
    }

    public void setITEM_SN(String ITEM_SN) {
        this.ITEM_SN = ITEM_SN;
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

    public String getINTF_TYPE() {
        return INTF_TYPE;
    }

    public void setINTF_TYPE(String INTF_TYPE) {
        this.INTF_TYPE = INTF_TYPE;
    }

    public String getINTF_NAME() {
        return INTF_NAME;
    }

    public void setINTF_NAME(String INTF_NAME) {
        this.INTF_NAME = INTF_NAME;
    }

    public String getSAP_INFO() {
        return SAP_INFO;
    }

    public void setSAP_INFO(String SAP_INFO) {
        this.SAP_INFO = SAP_INFO;
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
        TProjectSapLog other = (TProjectSapLog) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getPROJECT_ID() == null ? other.getPROJECT_ID() == null : this.getPROJECT_ID().equals(other.getPROJECT_ID()))
            && (this.getITEM_SN() == null ? other.getITEM_SN() == null : this.getITEM_SN().equals(other.getITEM_SN()))
            && (this.getSFLAG() == null ? other.getSFLAG() == null : this.getSFLAG().equals(other.getSFLAG()))
            && (this.getMESSAGE() == null ? other.getMESSAGE() == null : this.getMESSAGE().equals(other.getMESSAGE()))
            && (this.getINTF_TYPE() == null ? other.getINTF_TYPE() == null : this.getINTF_TYPE().equals(other.getINTF_TYPE()))
            && (this.getINTF_NAME() == null ? other.getINTF_NAME() == null : this.getINTF_NAME().equals(other.getINTF_NAME()))
            && (this.getSAP_INFO() == null ? other.getSAP_INFO() == null : this.getSAP_INFO().equals(other.getSAP_INFO()));
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
        result = prime * result + ((getITEM_SN() == null) ? 0 : getITEM_SN().hashCode());
        result = prime * result + ((getSFLAG() == null) ? 0 : getSFLAG().hashCode());
        result = prime * result + ((getMESSAGE() == null) ? 0 : getMESSAGE().hashCode());
        result = prime * result + ((getINTF_TYPE() == null) ? 0 : getINTF_TYPE().hashCode());
        result = prime * result + ((getINTF_NAME() == null) ? 0 : getINTF_NAME().hashCode());
        result = prime * result + ((getSAP_INFO() == null) ? 0 : getSAP_INFO().hashCode());
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
        sb.append(", ITEM_SN=").append(ITEM_SN);
        sb.append(", SFLAG=").append(SFLAG);
        sb.append(", MESSAGE=").append(MESSAGE);
        sb.append(", INTF_TYPE=").append(INTF_TYPE);
        sb.append(", INTF_NAME=").append(INTF_NAME);
        sb.append(", SAP_INFO=").append(SAP_INFO);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}