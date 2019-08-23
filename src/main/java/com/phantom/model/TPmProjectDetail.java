package com.phantom.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * T_PM_PROJECT_DETAIL
 * @author 
 */
public class TPmProjectDetail implements Serializable {
    /**
     * ID
     */
    private String ID;

    /**
     * 工单ID
     */
    private String PROJECT_ID;

    /**
     * 子物料编码
     */
    private String CBD_ITEM_CODE;

    /**
     * 子物料用量
     */
    private BigDecimal CBD_ITEM_NUM;

    /**
     * 阶别
     */
    private BigDecimal CBD_SEQUENCE;

    /**
     * 点位
     */
    private String CBD_POINT;

    /**
     * 单位
     */
    private String CBD_UNITS;

    /**
     * 物料类型(1:PCB，0：物料)
     */
    private String CBD_ITEM_TYPE;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    /**
     * BIN段
     */
    private String PROJECT_BIN;

    /**
     * 工序序号
     */
    private String WORKCENTER_SEQ;

    /**
     * 工序编码
     */
    private String WORKCENTER_NO;

    /**
     * 工序描述
     */
    private String WORKCENTER;

    /**
     * 产出率（0.1=10%）(1-产出率=耗损率)
     */
    private BigDecimal OUTPUT_RATE;

    /**
     * 备注
     */
    private String MEMO;

    /**
     * 工厂
     */
    private String WORK_SPACE;

    /**
     * 仓库
     */
    private String WARE_HOUSE;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPROJECT_ID() {
        return PROJECT_ID;
    }

    public void setPROJECT_ID(String PROJECT_ID) {
        this.PROJECT_ID = PROJECT_ID;
    }

    public String getCBD_ITEM_CODE() {
        return CBD_ITEM_CODE;
    }

    public void setCBD_ITEM_CODE(String CBD_ITEM_CODE) {
        this.CBD_ITEM_CODE = CBD_ITEM_CODE;
    }

    public BigDecimal getCBD_ITEM_NUM() {
        return CBD_ITEM_NUM;
    }

    public void setCBD_ITEM_NUM(BigDecimal CBD_ITEM_NUM) {
        this.CBD_ITEM_NUM = CBD_ITEM_NUM;
    }

    public BigDecimal getCBD_SEQUENCE() {
        return CBD_SEQUENCE;
    }

    public void setCBD_SEQUENCE(BigDecimal CBD_SEQUENCE) {
        this.CBD_SEQUENCE = CBD_SEQUENCE;
    }

    public String getCBD_POINT() {
        return CBD_POINT;
    }

    public void setCBD_POINT(String CBD_POINT) {
        this.CBD_POINT = CBD_POINT;
    }

    public String getCBD_UNITS() {
        return CBD_UNITS;
    }

    public void setCBD_UNITS(String CBD_UNITS) {
        this.CBD_UNITS = CBD_UNITS;
    }

    public String getCBD_ITEM_TYPE() {
        return CBD_ITEM_TYPE;
    }

    public void setCBD_ITEM_TYPE(String CBD_ITEM_TYPE) {
        this.CBD_ITEM_TYPE = CBD_ITEM_TYPE;
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

    public String getPROJECT_BIN() {
        return PROJECT_BIN;
    }

    public void setPROJECT_BIN(String PROJECT_BIN) {
        this.PROJECT_BIN = PROJECT_BIN;
    }

    public String getWORKCENTER_SEQ() {
        return WORKCENTER_SEQ;
    }

    public void setWORKCENTER_SEQ(String WORKCENTER_SEQ) {
        this.WORKCENTER_SEQ = WORKCENTER_SEQ;
    }

    public String getWORKCENTER_NO() {
        return WORKCENTER_NO;
    }

    public void setWORKCENTER_NO(String WORKCENTER_NO) {
        this.WORKCENTER_NO = WORKCENTER_NO;
    }

    public String getWORKCENTER() {
        return WORKCENTER;
    }

    public void setWORKCENTER(String WORKCENTER) {
        this.WORKCENTER = WORKCENTER;
    }

    public BigDecimal getOUTPUT_RATE() {
        return OUTPUT_RATE;
    }

    public void setOUTPUT_RATE(BigDecimal OUTPUT_RATE) {
        this.OUTPUT_RATE = OUTPUT_RATE;
    }

    public String getMEMO() {
        return MEMO;
    }

    public void setMEMO(String MEMO) {
        this.MEMO = MEMO;
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
        TPmProjectDetail other = (TPmProjectDetail) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getPROJECT_ID() == null ? other.getPROJECT_ID() == null : this.getPROJECT_ID().equals(other.getPROJECT_ID()))
            && (this.getCBD_ITEM_CODE() == null ? other.getCBD_ITEM_CODE() == null : this.getCBD_ITEM_CODE().equals(other.getCBD_ITEM_CODE()))
            && (this.getCBD_ITEM_NUM() == null ? other.getCBD_ITEM_NUM() == null : this.getCBD_ITEM_NUM().equals(other.getCBD_ITEM_NUM()))
            && (this.getCBD_SEQUENCE() == null ? other.getCBD_SEQUENCE() == null : this.getCBD_SEQUENCE().equals(other.getCBD_SEQUENCE()))
            && (this.getCBD_POINT() == null ? other.getCBD_POINT() == null : this.getCBD_POINT().equals(other.getCBD_POINT()))
            && (this.getCBD_UNITS() == null ? other.getCBD_UNITS() == null : this.getCBD_UNITS().equals(other.getCBD_UNITS()))
            && (this.getCBD_ITEM_TYPE() == null ? other.getCBD_ITEM_TYPE() == null : this.getCBD_ITEM_TYPE().equals(other.getCBD_ITEM_TYPE()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getPROJECT_BIN() == null ? other.getPROJECT_BIN() == null : this.getPROJECT_BIN().equals(other.getPROJECT_BIN()))
            && (this.getWORKCENTER_SEQ() == null ? other.getWORKCENTER_SEQ() == null : this.getWORKCENTER_SEQ().equals(other.getWORKCENTER_SEQ()))
            && (this.getWORKCENTER_NO() == null ? other.getWORKCENTER_NO() == null : this.getWORKCENTER_NO().equals(other.getWORKCENTER_NO()))
            && (this.getWORKCENTER() == null ? other.getWORKCENTER() == null : this.getWORKCENTER().equals(other.getWORKCENTER()))
            && (this.getOUTPUT_RATE() == null ? other.getOUTPUT_RATE() == null : this.getOUTPUT_RATE().equals(other.getOUTPUT_RATE()))
            && (this.getMEMO() == null ? other.getMEMO() == null : this.getMEMO().equals(other.getMEMO()))
            && (this.getWORK_SPACE() == null ? other.getWORK_SPACE() == null : this.getWORK_SPACE().equals(other.getWORK_SPACE()))
            && (this.getWARE_HOUSE() == null ? other.getWARE_HOUSE() == null : this.getWARE_HOUSE().equals(other.getWARE_HOUSE()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getPROJECT_ID() == null) ? 0 : getPROJECT_ID().hashCode());
        result = prime * result + ((getCBD_ITEM_CODE() == null) ? 0 : getCBD_ITEM_CODE().hashCode());
        result = prime * result + ((getCBD_ITEM_NUM() == null) ? 0 : getCBD_ITEM_NUM().hashCode());
        result = prime * result + ((getCBD_SEQUENCE() == null) ? 0 : getCBD_SEQUENCE().hashCode());
        result = prime * result + ((getCBD_POINT() == null) ? 0 : getCBD_POINT().hashCode());
        result = prime * result + ((getCBD_UNITS() == null) ? 0 : getCBD_UNITS().hashCode());
        result = prime * result + ((getCBD_ITEM_TYPE() == null) ? 0 : getCBD_ITEM_TYPE().hashCode());
        result = prime * result + ((getDEPT_ID() == null) ? 0 : getDEPT_ID().hashCode());
        result = prime * result + ((getCREATE_USER() == null) ? 0 : getCREATE_USER().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getEDIT_USER() == null) ? 0 : getEDIT_USER().hashCode());
        result = prime * result + ((getEDIT_TIME() == null) ? 0 : getEDIT_TIME().hashCode());
        result = prime * result + ((getDATA_AUTH() == null) ? 0 : getDATA_AUTH().hashCode());
        result = prime * result + ((getPROJECT_BIN() == null) ? 0 : getPROJECT_BIN().hashCode());
        result = prime * result + ((getWORKCENTER_SEQ() == null) ? 0 : getWORKCENTER_SEQ().hashCode());
        result = prime * result + ((getWORKCENTER_NO() == null) ? 0 : getWORKCENTER_NO().hashCode());
        result = prime * result + ((getWORKCENTER() == null) ? 0 : getWORKCENTER().hashCode());
        result = prime * result + ((getOUTPUT_RATE() == null) ? 0 : getOUTPUT_RATE().hashCode());
        result = prime * result + ((getMEMO() == null) ? 0 : getMEMO().hashCode());
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
        sb.append(", PROJECT_ID=").append(PROJECT_ID);
        sb.append(", CBD_ITEM_CODE=").append(CBD_ITEM_CODE);
        sb.append(", CBD_ITEM_NUM=").append(CBD_ITEM_NUM);
        sb.append(", CBD_SEQUENCE=").append(CBD_SEQUENCE);
        sb.append(", CBD_POINT=").append(CBD_POINT);
        sb.append(", CBD_UNITS=").append(CBD_UNITS);
        sb.append(", CBD_ITEM_TYPE=").append(CBD_ITEM_TYPE);
        sb.append(", DEPT_ID=").append(DEPT_ID);
        sb.append(", CREATE_USER=").append(CREATE_USER);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", EDIT_USER=").append(EDIT_USER);
        sb.append(", EDIT_TIME=").append(EDIT_TIME);
        sb.append(", DATA_AUTH=").append(DATA_AUTH);
        sb.append(", PROJECT_BIN=").append(PROJECT_BIN);
        sb.append(", WORKCENTER_SEQ=").append(WORKCENTER_SEQ);
        sb.append(", WORKCENTER_NO=").append(WORKCENTER_NO);
        sb.append(", WORKCENTER=").append(WORKCENTER);
        sb.append(", OUTPUT_RATE=").append(OUTPUT_RATE);
        sb.append(", MEMO=").append(MEMO);
        sb.append(", WORK_SPACE=").append(WORK_SPACE);
        sb.append(", WARE_HOUSE=").append(WARE_HOUSE);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}