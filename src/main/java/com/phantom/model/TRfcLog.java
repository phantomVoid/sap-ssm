package com.phantom.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.phantom.comm.DateUtils;
import com.phantom.comm.StringUtils;
import java.io.Serializable;
import java.util.Date;

/**
 * T_RFC_LOG
 * @author 
 */
public class TRfcLog implements Serializable {

    @TableId(value = "ID",type = IdType.INPUT)
    private String ID;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    private String RL_FUNC_NAME;

    private String RL_FLAG;

    private String RL_MESSAGE;

    private String RL_IMPORT;

    private String RL_EXPORT;

    private String RL_CHANGING;

    private String RL_TABLES;

    private String RL_EXCEPTIONS;

    private String RL_SY_ERROR;

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

    public String getRL_FUNC_NAME() {
        return RL_FUNC_NAME;
    }

    public void setRL_FUNC_NAME(String RL_FUNC_NAME) {
        this.RL_FUNC_NAME = RL_FUNC_NAME;
    }

    public String getRL_FLAG() {
        return RL_FLAG;
    }

    public void setRL_FLAG(String RL_FLAG) {
        this.RL_FLAG = RL_FLAG;
    }

    public String getRL_MESSAGE() {
        return RL_MESSAGE;
    }

    public void setRL_MESSAGE(String RL_MESSAGE) {
        this.RL_MESSAGE = RL_MESSAGE;
    }

    public String getRL_IMPORT() {
        return RL_IMPORT;
    }

    public void setRL_IMPORT(String RL_IMPORT) {
        this.RL_IMPORT = RL_IMPORT;
    }

    public String getRL_EXPORT() {
        return RL_EXPORT;
    }

    public void setRL_EXPORT(String RL_EXPORT) {
        this.RL_EXPORT = RL_EXPORT;
    }

    public String getRL_CHANGING() {
        return RL_CHANGING;
    }

    public void setRL_CHANGING(String RL_CHANGING) {
        this.RL_CHANGING = RL_CHANGING;
    }

    public String getRL_TABLES() {
        return RL_TABLES;
    }

    public void setRL_TABLES(String RL_TABLES) {
        this.RL_TABLES = RL_TABLES;
    }

    public String getRL_EXCEPTIONS() {
        return RL_EXCEPTIONS;
    }

    public void setRL_EXCEPTIONS(String RL_EXCEPTIONS) {
        this.RL_EXCEPTIONS = RL_EXCEPTIONS;
    }

    public String getRL_SY_ERROR() {
        return RL_SY_ERROR;
    }

    public void setRL_SY_ERROR(String RL_SY_ERROR) {
        this.RL_SY_ERROR = RL_SY_ERROR;
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
        TRfcLog other = (TRfcLog) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getRL_FUNC_NAME() == null ? other.getRL_FUNC_NAME() == null : this.getRL_FUNC_NAME().equals(other.getRL_FUNC_NAME()))
            && (this.getRL_FLAG() == null ? other.getRL_FLAG() == null : this.getRL_FLAG().equals(other.getRL_FLAG()))
            && (this.getRL_MESSAGE() == null ? other.getRL_MESSAGE() == null : this.getRL_MESSAGE().equals(other.getRL_MESSAGE()))
            && (this.getRL_IMPORT() == null ? other.getRL_IMPORT() == null : this.getRL_IMPORT().equals(other.getRL_IMPORT()))
            && (this.getRL_EXPORT() == null ? other.getRL_EXPORT() == null : this.getRL_EXPORT().equals(other.getRL_EXPORT()))
            && (this.getRL_CHANGING() == null ? other.getRL_CHANGING() == null : this.getRL_CHANGING().equals(other.getRL_CHANGING()))
            && (this.getRL_TABLES() == null ? other.getRL_TABLES() == null : this.getRL_TABLES().equals(other.getRL_TABLES()))
            && (this.getRL_EXCEPTIONS() == null ? other.getRL_EXCEPTIONS() == null : this.getRL_EXCEPTIONS().equals(other.getRL_EXCEPTIONS()))
            && (this.getRL_SY_ERROR() == null ? other.getRL_SY_ERROR() == null : this.getRL_SY_ERROR().equals(other.getRL_SY_ERROR()));
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
        result = prime * result + ((getRL_FUNC_NAME() == null) ? 0 : getRL_FUNC_NAME().hashCode());
        result = prime * result + ((getRL_FLAG() == null) ? 0 : getRL_FLAG().hashCode());
        result = prime * result + ((getRL_MESSAGE() == null) ? 0 : getRL_MESSAGE().hashCode());
        result = prime * result + ((getRL_IMPORT() == null) ? 0 : getRL_IMPORT().hashCode());
        result = prime * result + ((getRL_EXPORT() == null) ? 0 : getRL_EXPORT().hashCode());
        result = prime * result + ((getRL_CHANGING() == null) ? 0 : getRL_CHANGING().hashCode());
        result = prime * result + ((getRL_TABLES() == null) ? 0 : getRL_TABLES().hashCode());
        result = prime * result + ((getRL_EXCEPTIONS() == null) ? 0 : getRL_EXCEPTIONS().hashCode());
        result = prime * result + ((getRL_SY_ERROR() == null) ? 0 : getRL_SY_ERROR().hashCode());
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
        sb.append(", RL_FUNC_NAME=").append(RL_FUNC_NAME);
        sb.append(", RL_FLAG=").append(RL_FLAG);
        sb.append(", RL_MESSAGE=").append(RL_MESSAGE);
        sb.append(", RL_IMPORT=").append(RL_IMPORT);
        sb.append(", RL_EXPORT=").append(RL_EXPORT);
        sb.append(", RL_CHANGING=").append(RL_CHANGING);
        sb.append(", RL_TABLES=").append(RL_TABLES);
        sb.append(", RL_EXCEPTIONS=").append(RL_EXCEPTIONS);
        sb.append(", RL_SY_ERROR=").append(RL_SY_ERROR);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public TRfcLog() {
        this.ID = StringUtils.getUUID();
        this.DEPT_ID = "1";
        this.CREATE_USER = StringUtils.getDefaultUserId();
        this.CREATE_TIME = DateUtils.getCurDateTime();
        this.EDIT_USER = "";
        this.EDIT_TIME = EDIT_TIME;
        this.DATA_AUTH = StringUtils.getDefaultDataAuth();
        this.RL_FUNC_NAME = RL_FUNC_NAME;
        this.RL_FLAG = "Y";
        this.RL_MESSAGE = "Y";
        this.RL_IMPORT = "";
        this.RL_EXPORT = "";
        this.RL_CHANGING = "";
        this.RL_TABLES = "";
        this.RL_EXCEPTIONS = "";
        this.RL_SY_ERROR = "";
    }

    public TRfcLog(String flag,String message) {
        this.ID = StringUtils.getUUID();
        this.DEPT_ID = "1";
        this.CREATE_USER = StringUtils.getDefaultUserId();
        this.CREATE_TIME = DateUtils.getCurDateTime();
        this.EDIT_USER = "";
        this.EDIT_TIME = EDIT_TIME;
        this.DATA_AUTH = StringUtils.getDefaultDataAuth();
        this.RL_FUNC_NAME = RL_FUNC_NAME;
        this.RL_FLAG = flag;
        this.RL_MESSAGE = message;
        this.RL_IMPORT = RL_IMPORT;
        this.RL_EXPORT = RL_EXPORT;
        this.RL_CHANGING = RL_CHANGING;
        this.RL_TABLES = RL_TABLES;
        this.RL_EXCEPTIONS = RL_EXCEPTIONS;
        this.RL_SY_ERROR = RL_SY_ERROR;
    }

    public TRfcLog(String flag,String message,String error) {
        this.ID = StringUtils.getUUID();
        this.DEPT_ID = "1";
        this.CREATE_USER = StringUtils.getDefaultUserId();
        this.CREATE_TIME = DateUtils.getCurDateTime();
        this.EDIT_USER = "";
        this.EDIT_TIME = EDIT_TIME;
        this.DATA_AUTH = StringUtils.getDefaultDataAuth();
        this.RL_FUNC_NAME = RL_FUNC_NAME;
        this.RL_FLAG = flag;
        this.RL_MESSAGE = message;
        this.RL_IMPORT = RL_IMPORT;
        this.RL_EXPORT = RL_EXPORT;
        this.RL_CHANGING = RL_CHANGING;
        this.RL_TABLES = RL_TABLES;
        this.RL_EXCEPTIONS = RL_EXCEPTIONS;
        this.RL_SY_ERROR = error;
    }
}