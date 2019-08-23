package com.phantom.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * T_PM_PROJECT_BASE
 * @author 
 */
public class TPmProjectBase implements Serializable {
    private String ID;

    private String PROJECT_ID;

    private String PRODUCT_MATERIAL;

    private String PRODUCT_NAME;

    private String PRODUCT_STANDARD;

    private BigDecimal SCRAPPED_QTY;

    private String DESTROY_NO;

    private String CUST_CODE;

    private BigDecimal PRODUCT_COUNT;

    private BigDecimal FQC_COUNT;

    private BigDecimal FINISH_COUNT;

    private BigDecimal WORKING_SC;

    private String PROJECT_STATUS;

    private String PROJECT_TYPE;

    private Date PROLEPSIS_START_DATE;

    private Date PROLEPSIS_END_DATE;

    private Date TPPB_PLAN_DELIVERY_DATE;

    private String PM_MEMO;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String PRODUCT_LINE;

    private Date ACTUAL_START_DATE;

    private Date ACTUAL_END_DATE;

    private String PM_CLOSE_REASON;

    private String PROJECT_STEP;

    private BigDecimal FAI_NUM;

    private String DATA_AUTH;

    private String PROJECT_ERPTYPE;

    private String PROJECT_OFONESELF;

    private String LOT_NUMBER;

    private String PRODUCT_SN_START;

    private String PRODUCT_SN_END;

    private String PRODUCT_SN_PREFIX;

    private String PRODUCT_PACK_SEQ;

    private BigDecimal PM_CHANGE_TIMES;

    private String PRODUCT_MATERIAL_VER;

    private String PRODUCT_CONFIGURE;

    private String PROJECT_FLAG;

    private String IS_REL;

    private BigDecimal REL_NUM;

    private BigDecimal PROJECT_SORT;

    private BigDecimal PM_CHECK_STUST;

    private String CHECK_MON;

    private String CHECK_USER;

    private String WORK_SPACE;

    private String BASE_UNIT;

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

    public String getPRODUCT_MATERIAL() {
        return PRODUCT_MATERIAL;
    }

    public void setPRODUCT_MATERIAL(String PRODUCT_MATERIAL) {
        this.PRODUCT_MATERIAL = PRODUCT_MATERIAL;
    }

    public String getPRODUCT_NAME() {
        return PRODUCT_NAME;
    }

    public void setPRODUCT_NAME(String PRODUCT_NAME) {
        this.PRODUCT_NAME = PRODUCT_NAME;
    }

    public String getPRODUCT_STANDARD() {
        return PRODUCT_STANDARD;
    }

    public void setPRODUCT_STANDARD(String PRODUCT_STANDARD) {
        this.PRODUCT_STANDARD = PRODUCT_STANDARD;
    }

    public BigDecimal getSCRAPPED_QTY() {
        return SCRAPPED_QTY;
    }

    public void setSCRAPPED_QTY(BigDecimal SCRAPPED_QTY) {
        this.SCRAPPED_QTY = SCRAPPED_QTY;
    }

    public String getDESTROY_NO() {
        return DESTROY_NO;
    }

    public void setDESTROY_NO(String DESTROY_NO) {
        this.DESTROY_NO = DESTROY_NO;
    }

    public String getCUST_CODE() {
        return CUST_CODE;
    }

    public void setCUST_CODE(String CUST_CODE) {
        this.CUST_CODE = CUST_CODE;
    }

    public BigDecimal getPRODUCT_COUNT() {
        return PRODUCT_COUNT;
    }

    public void setPRODUCT_COUNT(BigDecimal PRODUCT_COUNT) {
        this.PRODUCT_COUNT = PRODUCT_COUNT;
    }

    public BigDecimal getFQC_COUNT() {
        return FQC_COUNT;
    }

    public void setFQC_COUNT(BigDecimal FQC_COUNT) {
        this.FQC_COUNT = FQC_COUNT;
    }

    public BigDecimal getFINISH_COUNT() {
        return FINISH_COUNT;
    }

    public void setFINISH_COUNT(BigDecimal FINISH_COUNT) {
        this.FINISH_COUNT = FINISH_COUNT;
    }

    public BigDecimal getWORKING_SC() {
        return WORKING_SC;
    }

    public void setWORKING_SC(BigDecimal WORKING_SC) {
        this.WORKING_SC = WORKING_SC;
    }

    public String getPROJECT_STATUS() {
        return PROJECT_STATUS;
    }

    public void setPROJECT_STATUS(String PROJECT_STATUS) {
        this.PROJECT_STATUS = PROJECT_STATUS;
    }

    public String getPROJECT_TYPE() {
        return PROJECT_TYPE;
    }

    public void setPROJECT_TYPE(String PROJECT_TYPE) {
        this.PROJECT_TYPE = PROJECT_TYPE;
    }

    public Date getPROLEPSIS_START_DATE() {
        return PROLEPSIS_START_DATE;
    }

    public void setPROLEPSIS_START_DATE(Date PROLEPSIS_START_DATE) {
        this.PROLEPSIS_START_DATE = PROLEPSIS_START_DATE;
    }

    public Date getPROLEPSIS_END_DATE() {
        return PROLEPSIS_END_DATE;
    }

    public void setPROLEPSIS_END_DATE(Date PROLEPSIS_END_DATE) {
        this.PROLEPSIS_END_DATE = PROLEPSIS_END_DATE;
    }

    public Date getTPPB_PLAN_DELIVERY_DATE() {
        return TPPB_PLAN_DELIVERY_DATE;
    }

    public void setTPPB_PLAN_DELIVERY_DATE(Date TPPB_PLAN_DELIVERY_DATE) {
        this.TPPB_PLAN_DELIVERY_DATE = TPPB_PLAN_DELIVERY_DATE;
    }

    public String getPM_MEMO() {
        return PM_MEMO;
    }

    public void setPM_MEMO(String PM_MEMO) {
        this.PM_MEMO = PM_MEMO;
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

    public String getPRODUCT_LINE() {
        return PRODUCT_LINE;
    }

    public void setPRODUCT_LINE(String PRODUCT_LINE) {
        this.PRODUCT_LINE = PRODUCT_LINE;
    }

    public Date getACTUAL_START_DATE() {
        return ACTUAL_START_DATE;
    }

    public void setACTUAL_START_DATE(Date ACTUAL_START_DATE) {
        this.ACTUAL_START_DATE = ACTUAL_START_DATE;
    }

    public Date getACTUAL_END_DATE() {
        return ACTUAL_END_DATE;
    }

    public void setACTUAL_END_DATE(Date ACTUAL_END_DATE) {
        this.ACTUAL_END_DATE = ACTUAL_END_DATE;
    }

    public String getPM_CLOSE_REASON() {
        return PM_CLOSE_REASON;
    }

    public void setPM_CLOSE_REASON(String PM_CLOSE_REASON) {
        this.PM_CLOSE_REASON = PM_CLOSE_REASON;
    }

    public String getPROJECT_STEP() {
        return PROJECT_STEP;
    }

    public void setPROJECT_STEP(String PROJECT_STEP) {
        this.PROJECT_STEP = PROJECT_STEP;
    }

    public BigDecimal getFAI_NUM() {
        return FAI_NUM;
    }

    public void setFAI_NUM(BigDecimal FAI_NUM) {
        this.FAI_NUM = FAI_NUM;
    }

    public String getDATA_AUTH() {
        return DATA_AUTH;
    }

    public void setDATA_AUTH(String DATA_AUTH) {
        this.DATA_AUTH = DATA_AUTH;
    }

    public String getPROJECT_ERPTYPE() {
        return PROJECT_ERPTYPE;
    }

    public void setPROJECT_ERPTYPE(String PROJECT_ERPTYPE) {
        this.PROJECT_ERPTYPE = PROJECT_ERPTYPE;
    }

    public String getPROJECT_OFONESELF() {
        return PROJECT_OFONESELF;
    }

    public void setPROJECT_OFONESELF(String PROJECT_OFONESELF) {
        this.PROJECT_OFONESELF = PROJECT_OFONESELF;
    }

    public String getLOT_NUMBER() {
        return LOT_NUMBER;
    }

    public void setLOT_NUMBER(String LOT_NUMBER) {
        this.LOT_NUMBER = LOT_NUMBER;
    }

    public String getPRODUCT_SN_START() {
        return PRODUCT_SN_START;
    }

    public void setPRODUCT_SN_START(String PRODUCT_SN_START) {
        this.PRODUCT_SN_START = PRODUCT_SN_START;
    }

    public String getPRODUCT_SN_END() {
        return PRODUCT_SN_END;
    }

    public void setPRODUCT_SN_END(String PRODUCT_SN_END) {
        this.PRODUCT_SN_END = PRODUCT_SN_END;
    }

    public String getPRODUCT_SN_PREFIX() {
        return PRODUCT_SN_PREFIX;
    }

    public void setPRODUCT_SN_PREFIX(String PRODUCT_SN_PREFIX) {
        this.PRODUCT_SN_PREFIX = PRODUCT_SN_PREFIX;
    }

    public String getPRODUCT_PACK_SEQ() {
        return PRODUCT_PACK_SEQ;
    }

    public void setPRODUCT_PACK_SEQ(String PRODUCT_PACK_SEQ) {
        this.PRODUCT_PACK_SEQ = PRODUCT_PACK_SEQ;
    }

    public BigDecimal getPM_CHANGE_TIMES() {
        return PM_CHANGE_TIMES;
    }

    public void setPM_CHANGE_TIMES(BigDecimal PM_CHANGE_TIMES) {
        this.PM_CHANGE_TIMES = PM_CHANGE_TIMES;
    }

    public String getPRODUCT_MATERIAL_VER() {
        return PRODUCT_MATERIAL_VER;
    }

    public void setPRODUCT_MATERIAL_VER(String PRODUCT_MATERIAL_VER) {
        this.PRODUCT_MATERIAL_VER = PRODUCT_MATERIAL_VER;
    }

    public String getPRODUCT_CONFIGURE() {
        return PRODUCT_CONFIGURE;
    }

    public void setPRODUCT_CONFIGURE(String PRODUCT_CONFIGURE) {
        this.PRODUCT_CONFIGURE = PRODUCT_CONFIGURE;
    }

    public String getPROJECT_FLAG() {
        return PROJECT_FLAG;
    }

    public void setPROJECT_FLAG(String PROJECT_FLAG) {
        this.PROJECT_FLAG = PROJECT_FLAG;
    }

    public String getIS_REL() {
        return IS_REL;
    }

    public void setIS_REL(String IS_REL) {
        this.IS_REL = IS_REL;
    }

    public BigDecimal getREL_NUM() {
        return REL_NUM;
    }

    public void setREL_NUM(BigDecimal REL_NUM) {
        this.REL_NUM = REL_NUM;
    }

    public BigDecimal getPROJECT_SORT() {
        return PROJECT_SORT;
    }

    public void setPROJECT_SORT(BigDecimal PROJECT_SORT) {
        this.PROJECT_SORT = PROJECT_SORT;
    }

    public BigDecimal getPM_CHECK_STUST() {
        return PM_CHECK_STUST;
    }

    public void setPM_CHECK_STUST(BigDecimal PM_CHECK_STUST) {
        this.PM_CHECK_STUST = PM_CHECK_STUST;
    }

    public String getCHECK_MON() {
        return CHECK_MON;
    }

    public void setCHECK_MON(String CHECK_MON) {
        this.CHECK_MON = CHECK_MON;
    }

    public String getCHECK_USER() {
        return CHECK_USER;
    }

    public void setCHECK_USER(String CHECK_USER) {
        this.CHECK_USER = CHECK_USER;
    }

    public String getWORK_SPACE() {
        return WORK_SPACE;
    }

    public void setWORK_SPACE(String WORK_SPACE) {
        this.WORK_SPACE = WORK_SPACE;
    }

    public String getBASE_UNIT() {
        return BASE_UNIT;
    }

    public void setBASE_UNIT(String BASE_UNIT) {
        this.BASE_UNIT = BASE_UNIT;
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
        TPmProjectBase other = (TPmProjectBase) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getPROJECT_ID() == null ? other.getPROJECT_ID() == null : this.getPROJECT_ID().equals(other.getPROJECT_ID()))
            && (this.getPRODUCT_MATERIAL() == null ? other.getPRODUCT_MATERIAL() == null : this.getPRODUCT_MATERIAL().equals(other.getPRODUCT_MATERIAL()))
            && (this.getPRODUCT_NAME() == null ? other.getPRODUCT_NAME() == null : this.getPRODUCT_NAME().equals(other.getPRODUCT_NAME()))
            && (this.getPRODUCT_STANDARD() == null ? other.getPRODUCT_STANDARD() == null : this.getPRODUCT_STANDARD().equals(other.getPRODUCT_STANDARD()))
            && (this.getSCRAPPED_QTY() == null ? other.getSCRAPPED_QTY() == null : this.getSCRAPPED_QTY().equals(other.getSCRAPPED_QTY()))
            && (this.getDESTROY_NO() == null ? other.getDESTROY_NO() == null : this.getDESTROY_NO().equals(other.getDESTROY_NO()))
            && (this.getCUST_CODE() == null ? other.getCUST_CODE() == null : this.getCUST_CODE().equals(other.getCUST_CODE()))
            && (this.getPRODUCT_COUNT() == null ? other.getPRODUCT_COUNT() == null : this.getPRODUCT_COUNT().equals(other.getPRODUCT_COUNT()))
            && (this.getFQC_COUNT() == null ? other.getFQC_COUNT() == null : this.getFQC_COUNT().equals(other.getFQC_COUNT()))
            && (this.getFINISH_COUNT() == null ? other.getFINISH_COUNT() == null : this.getFINISH_COUNT().equals(other.getFINISH_COUNT()))
            && (this.getWORKING_SC() == null ? other.getWORKING_SC() == null : this.getWORKING_SC().equals(other.getWORKING_SC()))
            && (this.getPROJECT_STATUS() == null ? other.getPROJECT_STATUS() == null : this.getPROJECT_STATUS().equals(other.getPROJECT_STATUS()))
            && (this.getPROJECT_TYPE() == null ? other.getPROJECT_TYPE() == null : this.getPROJECT_TYPE().equals(other.getPROJECT_TYPE()))
            && (this.getPROLEPSIS_START_DATE() == null ? other.getPROLEPSIS_START_DATE() == null : this.getPROLEPSIS_START_DATE().equals(other.getPROLEPSIS_START_DATE()))
            && (this.getPROLEPSIS_END_DATE() == null ? other.getPROLEPSIS_END_DATE() == null : this.getPROLEPSIS_END_DATE().equals(other.getPROLEPSIS_END_DATE()))
            && (this.getTPPB_PLAN_DELIVERY_DATE() == null ? other.getTPPB_PLAN_DELIVERY_DATE() == null : this.getTPPB_PLAN_DELIVERY_DATE().equals(other.getTPPB_PLAN_DELIVERY_DATE()))
            && (this.getPM_MEMO() == null ? other.getPM_MEMO() == null : this.getPM_MEMO().equals(other.getPM_MEMO()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getPRODUCT_LINE() == null ? other.getPRODUCT_LINE() == null : this.getPRODUCT_LINE().equals(other.getPRODUCT_LINE()))
            && (this.getACTUAL_START_DATE() == null ? other.getACTUAL_START_DATE() == null : this.getACTUAL_START_DATE().equals(other.getACTUAL_START_DATE()))
            && (this.getACTUAL_END_DATE() == null ? other.getACTUAL_END_DATE() == null : this.getACTUAL_END_DATE().equals(other.getACTUAL_END_DATE()))
            && (this.getPM_CLOSE_REASON() == null ? other.getPM_CLOSE_REASON() == null : this.getPM_CLOSE_REASON().equals(other.getPM_CLOSE_REASON()))
            && (this.getPROJECT_STEP() == null ? other.getPROJECT_STEP() == null : this.getPROJECT_STEP().equals(other.getPROJECT_STEP()))
            && (this.getFAI_NUM() == null ? other.getFAI_NUM() == null : this.getFAI_NUM().equals(other.getFAI_NUM()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getPROJECT_ERPTYPE() == null ? other.getPROJECT_ERPTYPE() == null : this.getPROJECT_ERPTYPE().equals(other.getPROJECT_ERPTYPE()))
            && (this.getPROJECT_OFONESELF() == null ? other.getPROJECT_OFONESELF() == null : this.getPROJECT_OFONESELF().equals(other.getPROJECT_OFONESELF()))
            && (this.getLOT_NUMBER() == null ? other.getLOT_NUMBER() == null : this.getLOT_NUMBER().equals(other.getLOT_NUMBER()))
            && (this.getPRODUCT_SN_START() == null ? other.getPRODUCT_SN_START() == null : this.getPRODUCT_SN_START().equals(other.getPRODUCT_SN_START()))
            && (this.getPRODUCT_SN_END() == null ? other.getPRODUCT_SN_END() == null : this.getPRODUCT_SN_END().equals(other.getPRODUCT_SN_END()))
            && (this.getPRODUCT_SN_PREFIX() == null ? other.getPRODUCT_SN_PREFIX() == null : this.getPRODUCT_SN_PREFIX().equals(other.getPRODUCT_SN_PREFIX()))
            && (this.getPRODUCT_PACK_SEQ() == null ? other.getPRODUCT_PACK_SEQ() == null : this.getPRODUCT_PACK_SEQ().equals(other.getPRODUCT_PACK_SEQ()))
            && (this.getPM_CHANGE_TIMES() == null ? other.getPM_CHANGE_TIMES() == null : this.getPM_CHANGE_TIMES().equals(other.getPM_CHANGE_TIMES()))
            && (this.getPRODUCT_MATERIAL_VER() == null ? other.getPRODUCT_MATERIAL_VER() == null : this.getPRODUCT_MATERIAL_VER().equals(other.getPRODUCT_MATERIAL_VER()))
            && (this.getPRODUCT_CONFIGURE() == null ? other.getPRODUCT_CONFIGURE() == null : this.getPRODUCT_CONFIGURE().equals(other.getPRODUCT_CONFIGURE()))
            && (this.getPROJECT_FLAG() == null ? other.getPROJECT_FLAG() == null : this.getPROJECT_FLAG().equals(other.getPROJECT_FLAG()))
            && (this.getIS_REL() == null ? other.getIS_REL() == null : this.getIS_REL().equals(other.getIS_REL()))
            && (this.getREL_NUM() == null ? other.getREL_NUM() == null : this.getREL_NUM().equals(other.getREL_NUM()))
            && (this.getPROJECT_SORT() == null ? other.getPROJECT_SORT() == null : this.getPROJECT_SORT().equals(other.getPROJECT_SORT()))
            && (this.getPM_CHECK_STUST() == null ? other.getPM_CHECK_STUST() == null : this.getPM_CHECK_STUST().equals(other.getPM_CHECK_STUST()))
            && (this.getCHECK_MON() == null ? other.getCHECK_MON() == null : this.getCHECK_MON().equals(other.getCHECK_MON()))
            && (this.getCHECK_USER() == null ? other.getCHECK_USER() == null : this.getCHECK_USER().equals(other.getCHECK_USER()))
            && (this.getWORK_SPACE() == null ? other.getWORK_SPACE() == null : this.getWORK_SPACE().equals(other.getWORK_SPACE()))
            && (this.getBASE_UNIT() == null ? other.getBASE_UNIT() == null : this.getBASE_UNIT().equals(other.getBASE_UNIT()))
            && (this.getWARE_HOUSE() == null ? other.getWARE_HOUSE() == null : this.getWARE_HOUSE().equals(other.getWARE_HOUSE()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getPROJECT_ID() == null) ? 0 : getPROJECT_ID().hashCode());
        result = prime * result + ((getPRODUCT_MATERIAL() == null) ? 0 : getPRODUCT_MATERIAL().hashCode());
        result = prime * result + ((getPRODUCT_NAME() == null) ? 0 : getPRODUCT_NAME().hashCode());
        result = prime * result + ((getPRODUCT_STANDARD() == null) ? 0 : getPRODUCT_STANDARD().hashCode());
        result = prime * result + ((getSCRAPPED_QTY() == null) ? 0 : getSCRAPPED_QTY().hashCode());
        result = prime * result + ((getDESTROY_NO() == null) ? 0 : getDESTROY_NO().hashCode());
        result = prime * result + ((getCUST_CODE() == null) ? 0 : getCUST_CODE().hashCode());
        result = prime * result + ((getPRODUCT_COUNT() == null) ? 0 : getPRODUCT_COUNT().hashCode());
        result = prime * result + ((getFQC_COUNT() == null) ? 0 : getFQC_COUNT().hashCode());
        result = prime * result + ((getFINISH_COUNT() == null) ? 0 : getFINISH_COUNT().hashCode());
        result = prime * result + ((getWORKING_SC() == null) ? 0 : getWORKING_SC().hashCode());
        result = prime * result + ((getPROJECT_STATUS() == null) ? 0 : getPROJECT_STATUS().hashCode());
        result = prime * result + ((getPROJECT_TYPE() == null) ? 0 : getPROJECT_TYPE().hashCode());
        result = prime * result + ((getPROLEPSIS_START_DATE() == null) ? 0 : getPROLEPSIS_START_DATE().hashCode());
        result = prime * result + ((getPROLEPSIS_END_DATE() == null) ? 0 : getPROLEPSIS_END_DATE().hashCode());
        result = prime * result + ((getTPPB_PLAN_DELIVERY_DATE() == null) ? 0 : getTPPB_PLAN_DELIVERY_DATE().hashCode());
        result = prime * result + ((getPM_MEMO() == null) ? 0 : getPM_MEMO().hashCode());
        result = prime * result + ((getDEPT_ID() == null) ? 0 : getDEPT_ID().hashCode());
        result = prime * result + ((getCREATE_USER() == null) ? 0 : getCREATE_USER().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getEDIT_USER() == null) ? 0 : getEDIT_USER().hashCode());
        result = prime * result + ((getEDIT_TIME() == null) ? 0 : getEDIT_TIME().hashCode());
        result = prime * result + ((getPRODUCT_LINE() == null) ? 0 : getPRODUCT_LINE().hashCode());
        result = prime * result + ((getACTUAL_START_DATE() == null) ? 0 : getACTUAL_START_DATE().hashCode());
        result = prime * result + ((getACTUAL_END_DATE() == null) ? 0 : getACTUAL_END_DATE().hashCode());
        result = prime * result + ((getPM_CLOSE_REASON() == null) ? 0 : getPM_CLOSE_REASON().hashCode());
        result = prime * result + ((getPROJECT_STEP() == null) ? 0 : getPROJECT_STEP().hashCode());
        result = prime * result + ((getFAI_NUM() == null) ? 0 : getFAI_NUM().hashCode());
        result = prime * result + ((getDATA_AUTH() == null) ? 0 : getDATA_AUTH().hashCode());
        result = prime * result + ((getPROJECT_ERPTYPE() == null) ? 0 : getPROJECT_ERPTYPE().hashCode());
        result = prime * result + ((getPROJECT_OFONESELF() == null) ? 0 : getPROJECT_OFONESELF().hashCode());
        result = prime * result + ((getLOT_NUMBER() == null) ? 0 : getLOT_NUMBER().hashCode());
        result = prime * result + ((getPRODUCT_SN_START() == null) ? 0 : getPRODUCT_SN_START().hashCode());
        result = prime * result + ((getPRODUCT_SN_END() == null) ? 0 : getPRODUCT_SN_END().hashCode());
        result = prime * result + ((getPRODUCT_SN_PREFIX() == null) ? 0 : getPRODUCT_SN_PREFIX().hashCode());
        result = prime * result + ((getPRODUCT_PACK_SEQ() == null) ? 0 : getPRODUCT_PACK_SEQ().hashCode());
        result = prime * result + ((getPM_CHANGE_TIMES() == null) ? 0 : getPM_CHANGE_TIMES().hashCode());
        result = prime * result + ((getPRODUCT_MATERIAL_VER() == null) ? 0 : getPRODUCT_MATERIAL_VER().hashCode());
        result = prime * result + ((getPRODUCT_CONFIGURE() == null) ? 0 : getPRODUCT_CONFIGURE().hashCode());
        result = prime * result + ((getPROJECT_FLAG() == null) ? 0 : getPROJECT_FLAG().hashCode());
        result = prime * result + ((getIS_REL() == null) ? 0 : getIS_REL().hashCode());
        result = prime * result + ((getREL_NUM() == null) ? 0 : getREL_NUM().hashCode());
        result = prime * result + ((getPROJECT_SORT() == null) ? 0 : getPROJECT_SORT().hashCode());
        result = prime * result + ((getPM_CHECK_STUST() == null) ? 0 : getPM_CHECK_STUST().hashCode());
        result = prime * result + ((getCHECK_MON() == null) ? 0 : getCHECK_MON().hashCode());
        result = prime * result + ((getCHECK_USER() == null) ? 0 : getCHECK_USER().hashCode());
        result = prime * result + ((getWORK_SPACE() == null) ? 0 : getWORK_SPACE().hashCode());
        result = prime * result + ((getBASE_UNIT() == null) ? 0 : getBASE_UNIT().hashCode());
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
        sb.append(", PRODUCT_MATERIAL=").append(PRODUCT_MATERIAL);
        sb.append(", PRODUCT_NAME=").append(PRODUCT_NAME);
        sb.append(", PRODUCT_STANDARD=").append(PRODUCT_STANDARD);
        sb.append(", SCRAPPED_QTY=").append(SCRAPPED_QTY);
        sb.append(", DESTROY_NO=").append(DESTROY_NO);
        sb.append(", CUST_CODE=").append(CUST_CODE);
        sb.append(", PRODUCT_COUNT=").append(PRODUCT_COUNT);
        sb.append(", FQC_COUNT=").append(FQC_COUNT);
        sb.append(", FINISH_COUNT=").append(FINISH_COUNT);
        sb.append(", WORKING_SC=").append(WORKING_SC);
        sb.append(", PROJECT_STATUS=").append(PROJECT_STATUS);
        sb.append(", PROJECT_TYPE=").append(PROJECT_TYPE);
        sb.append(", PROLEPSIS_START_DATE=").append(PROLEPSIS_START_DATE);
        sb.append(", PROLEPSIS_END_DATE=").append(PROLEPSIS_END_DATE);
        sb.append(", TPPB_PLAN_DELIVERY_DATE=").append(TPPB_PLAN_DELIVERY_DATE);
        sb.append(", PM_MEMO=").append(PM_MEMO);
        sb.append(", DEPT_ID=").append(DEPT_ID);
        sb.append(", CREATE_USER=").append(CREATE_USER);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", EDIT_USER=").append(EDIT_USER);
        sb.append(", EDIT_TIME=").append(EDIT_TIME);
        sb.append(", PRODUCT_LINE=").append(PRODUCT_LINE);
        sb.append(", ACTUAL_START_DATE=").append(ACTUAL_START_DATE);
        sb.append(", ACTUAL_END_DATE=").append(ACTUAL_END_DATE);
        sb.append(", PM_CLOSE_REASON=").append(PM_CLOSE_REASON);
        sb.append(", PROJECT_STEP=").append(PROJECT_STEP);
        sb.append(", FAI_NUM=").append(FAI_NUM);
        sb.append(", DATA_AUTH=").append(DATA_AUTH);
        sb.append(", PROJECT_ERPTYPE=").append(PROJECT_ERPTYPE);
        sb.append(", PROJECT_OFONESELF=").append(PROJECT_OFONESELF);
        sb.append(", LOT_NUMBER=").append(LOT_NUMBER);
        sb.append(", PRODUCT_SN_START=").append(PRODUCT_SN_START);
        sb.append(", PRODUCT_SN_END=").append(PRODUCT_SN_END);
        sb.append(", PRODUCT_SN_PREFIX=").append(PRODUCT_SN_PREFIX);
        sb.append(", PRODUCT_PACK_SEQ=").append(PRODUCT_PACK_SEQ);
        sb.append(", PM_CHANGE_TIMES=").append(PM_CHANGE_TIMES);
        sb.append(", PRODUCT_MATERIAL_VER=").append(PRODUCT_MATERIAL_VER);
        sb.append(", PRODUCT_CONFIGURE=").append(PRODUCT_CONFIGURE);
        sb.append(", PROJECT_FLAG=").append(PROJECT_FLAG);
        sb.append(", IS_REL=").append(IS_REL);
        sb.append(", REL_NUM=").append(REL_NUM);
        sb.append(", PROJECT_SORT=").append(PROJECT_SORT);
        sb.append(", PM_CHECK_STUST=").append(PM_CHECK_STUST);
        sb.append(", CHECK_MON=").append(CHECK_MON);
        sb.append(", CHECK_USER=").append(CHECK_USER);
        sb.append(", WORK_SPACE=").append(WORK_SPACE);
        sb.append(", BASE_UNIT=").append(BASE_UNIT);
        sb.append(", WARE_HOUSE=").append(WARE_HOUSE);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}