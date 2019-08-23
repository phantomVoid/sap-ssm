package com.phantom.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * T_PM_PROJECT_REPORT
 * @author 
 */
public class TPmProjectReport implements Serializable {
    private String ID;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    private String PROJECT_ID;

    private BigDecimal REP_NUM;

    private String PROJECT_UNIT;

    private BigDecimal PREPARE_TIME;

    private String MEASURE_UNIT1;

    private BigDecimal MACHINE_TIME;

    private String MEASURE_UNIT2;

    private BigDecimal PEOPLE_TIME;

    private String MEASURE_TIME3;

    private Date FINISH_DATE;

    private BigDecimal REVERSE_FLAG;

    private String SFLAG;

    private String MESSAGE;

    private BigDecimal BASE_NUM;

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

    public BigDecimal getREP_NUM() {
        return REP_NUM;
    }

    public void setREP_NUM(BigDecimal REP_NUM) {
        this.REP_NUM = REP_NUM;
    }

    public String getPROJECT_UNIT() {
        return PROJECT_UNIT;
    }

    public void setPROJECT_UNIT(String PROJECT_UNIT) {
        this.PROJECT_UNIT = PROJECT_UNIT;
    }

    public BigDecimal getPREPARE_TIME() {
        return PREPARE_TIME;
    }

    public void setPREPARE_TIME(BigDecimal PREPARE_TIME) {
        this.PREPARE_TIME = PREPARE_TIME;
    }

    public String getMEASURE_UNIT1() {
        return MEASURE_UNIT1;
    }

    public void setMEASURE_UNIT1(String MEASURE_UNIT1) {
        this.MEASURE_UNIT1 = MEASURE_UNIT1;
    }

    public BigDecimal getMACHINE_TIME() {
        return MACHINE_TIME;
    }

    public void setMACHINE_TIME(BigDecimal MACHINE_TIME) {
        this.MACHINE_TIME = MACHINE_TIME;
    }

    public String getMEASURE_UNIT2() {
        return MEASURE_UNIT2;
    }

    public void setMEASURE_UNIT2(String MEASURE_UNIT2) {
        this.MEASURE_UNIT2 = MEASURE_UNIT2;
    }

    public BigDecimal getPEOPLE_TIME() {
        return PEOPLE_TIME;
    }

    public void setPEOPLE_TIME(BigDecimal PEOPLE_TIME) {
        this.PEOPLE_TIME = PEOPLE_TIME;
    }

    public String getMEASURE_TIME3() {
        return MEASURE_TIME3;
    }

    public void setMEASURE_TIME3(String MEASURE_TIME3) {
        this.MEASURE_TIME3 = MEASURE_TIME3;
    }

    public Date getFINISH_DATE() {
        return FINISH_DATE;
    }

    public void setFINISH_DATE(Date FINISH_DATE) {
        this.FINISH_DATE = FINISH_DATE;
    }

    public BigDecimal getREVERSE_FLAG() {
        return REVERSE_FLAG;
    }

    public void setREVERSE_FLAG(BigDecimal REVERSE_FLAG) {
        this.REVERSE_FLAG = REVERSE_FLAG;
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

    public BigDecimal getBASE_NUM() {
        return BASE_NUM;
    }

    public void setBASE_NUM(BigDecimal BASE_NUM) {
        this.BASE_NUM = BASE_NUM;
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
        TPmProjectReport other = (TPmProjectReport) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getPROJECT_ID() == null ? other.getPROJECT_ID() == null : this.getPROJECT_ID().equals(other.getPROJECT_ID()))
            && (this.getREP_NUM() == null ? other.getREP_NUM() == null : this.getREP_NUM().equals(other.getREP_NUM()))
            && (this.getPROJECT_UNIT() == null ? other.getPROJECT_UNIT() == null : this.getPROJECT_UNIT().equals(other.getPROJECT_UNIT()))
            && (this.getPREPARE_TIME() == null ? other.getPREPARE_TIME() == null : this.getPREPARE_TIME().equals(other.getPREPARE_TIME()))
            && (this.getMEASURE_UNIT1() == null ? other.getMEASURE_UNIT1() == null : this.getMEASURE_UNIT1().equals(other.getMEASURE_UNIT1()))
            && (this.getMACHINE_TIME() == null ? other.getMACHINE_TIME() == null : this.getMACHINE_TIME().equals(other.getMACHINE_TIME()))
            && (this.getMEASURE_UNIT2() == null ? other.getMEASURE_UNIT2() == null : this.getMEASURE_UNIT2().equals(other.getMEASURE_UNIT2()))
            && (this.getPEOPLE_TIME() == null ? other.getPEOPLE_TIME() == null : this.getPEOPLE_TIME().equals(other.getPEOPLE_TIME()))
            && (this.getMEASURE_TIME3() == null ? other.getMEASURE_TIME3() == null : this.getMEASURE_TIME3().equals(other.getMEASURE_TIME3()))
            && (this.getFINISH_DATE() == null ? other.getFINISH_DATE() == null : this.getFINISH_DATE().equals(other.getFINISH_DATE()))
            && (this.getREVERSE_FLAG() == null ? other.getREVERSE_FLAG() == null : this.getREVERSE_FLAG().equals(other.getREVERSE_FLAG()))
            && (this.getSFLAG() == null ? other.getSFLAG() == null : this.getSFLAG().equals(other.getSFLAG()))
            && (this.getMESSAGE() == null ? other.getMESSAGE() == null : this.getMESSAGE().equals(other.getMESSAGE()))
            && (this.getBASE_NUM() == null ? other.getBASE_NUM() == null : this.getBASE_NUM().equals(other.getBASE_NUM()));
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
        result = prime * result + ((getREP_NUM() == null) ? 0 : getREP_NUM().hashCode());
        result = prime * result + ((getPROJECT_UNIT() == null) ? 0 : getPROJECT_UNIT().hashCode());
        result = prime * result + ((getPREPARE_TIME() == null) ? 0 : getPREPARE_TIME().hashCode());
        result = prime * result + ((getMEASURE_UNIT1() == null) ? 0 : getMEASURE_UNIT1().hashCode());
        result = prime * result + ((getMACHINE_TIME() == null) ? 0 : getMACHINE_TIME().hashCode());
        result = prime * result + ((getMEASURE_UNIT2() == null) ? 0 : getMEASURE_UNIT2().hashCode());
        result = prime * result + ((getPEOPLE_TIME() == null) ? 0 : getPEOPLE_TIME().hashCode());
        result = prime * result + ((getMEASURE_TIME3() == null) ? 0 : getMEASURE_TIME3().hashCode());
        result = prime * result + ((getFINISH_DATE() == null) ? 0 : getFINISH_DATE().hashCode());
        result = prime * result + ((getREVERSE_FLAG() == null) ? 0 : getREVERSE_FLAG().hashCode());
        result = prime * result + ((getSFLAG() == null) ? 0 : getSFLAG().hashCode());
        result = prime * result + ((getMESSAGE() == null) ? 0 : getMESSAGE().hashCode());
        result = prime * result + ((getBASE_NUM() == null) ? 0 : getBASE_NUM().hashCode());
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
        sb.append(", REP_NUM=").append(REP_NUM);
        sb.append(", PROJECT_UNIT=").append(PROJECT_UNIT);
        sb.append(", PREPARE_TIME=").append(PREPARE_TIME);
        sb.append(", MEASURE_UNIT1=").append(MEASURE_UNIT1);
        sb.append(", MACHINE_TIME=").append(MACHINE_TIME);
        sb.append(", MEASURE_UNIT2=").append(MEASURE_UNIT2);
        sb.append(", PEOPLE_TIME=").append(PEOPLE_TIME);
        sb.append(", MEASURE_TIME3=").append(MEASURE_TIME3);
        sb.append(", FINISH_DATE=").append(FINISH_DATE);
        sb.append(", REVERSE_FLAG=").append(REVERSE_FLAG);
        sb.append(", SFLAG=").append(SFLAG);
        sb.append(", MESSAGE=").append(MESSAGE);
        sb.append(", BASE_NUM=").append(BASE_NUM);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}