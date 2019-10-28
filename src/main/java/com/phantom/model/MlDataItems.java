package com.phantom.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ML_DATA_ITEMS
 * @author 
 */
public class MlDataItems implements Serializable {
    private String TEMPLATE_ID;

    private String DATA_ITEMS_NAME;

    private String DATA_ITEMS_ALIAS;

    private String BARCODE_ITEM;

    private String EMPTY_FLAG;

    private String ALLOW_EDIT;

    private String ALLOW_DISPLAY;

    private String MATCH_CODE;

    private String LABEL_COUNT;

    private String PICTURE_FLAG;

    private String PICTURE_PATH;

    private BigDecimal SEQ;

    private String TEST_DATA;

    private String PICTURE_NAME_S;

    private String COLUMN_TYPE;

    private String COLUMN_DATA;

    private String ID;

    private String DEPT_ID;

    private String CREATE_USER;

    private Date CREATE_TIME;

    private String EDIT_USER;

    private Date EDIT_TIME;

    private String DATA_AUTH;

    private String SUBLEVEL_QTY_FLAG;

    private String SOURCE_ITEM_ID;

    private String SOURCE_TEMPLATE_ID;

    private String EXTERNAL_SOURCE;

    private static final long serialVersionUID = 1L;

    public String getTEMPLATE_ID() {
        return TEMPLATE_ID;
    }

    public void setTEMPLATE_ID(String TEMPLATE_ID) {
        this.TEMPLATE_ID = TEMPLATE_ID;
    }

    public String getDATA_ITEMS_NAME() {
        return DATA_ITEMS_NAME;
    }

    public void setDATA_ITEMS_NAME(String DATA_ITEMS_NAME) {
        this.DATA_ITEMS_NAME = DATA_ITEMS_NAME;
    }

    public String getDATA_ITEMS_ALIAS() {
        return DATA_ITEMS_ALIAS;
    }

    public void setDATA_ITEMS_ALIAS(String DATA_ITEMS_ALIAS) {
        this.DATA_ITEMS_ALIAS = DATA_ITEMS_ALIAS;
    }

    public String getBARCODE_ITEM() {
        return BARCODE_ITEM;
    }

    public void setBARCODE_ITEM(String BARCODE_ITEM) {
        this.BARCODE_ITEM = BARCODE_ITEM;
    }

    public String getEMPTY_FLAG() {
        return EMPTY_FLAG;
    }

    public void setEMPTY_FLAG(String EMPTY_FLAG) {
        this.EMPTY_FLAG = EMPTY_FLAG;
    }

    public String getALLOW_EDIT() {
        return ALLOW_EDIT;
    }

    public void setALLOW_EDIT(String ALLOW_EDIT) {
        this.ALLOW_EDIT = ALLOW_EDIT;
    }

    public String getALLOW_DISPLAY() {
        return ALLOW_DISPLAY;
    }

    public void setALLOW_DISPLAY(String ALLOW_DISPLAY) {
        this.ALLOW_DISPLAY = ALLOW_DISPLAY;
    }

    public String getMATCH_CODE() {
        return MATCH_CODE;
    }

    public void setMATCH_CODE(String MATCH_CODE) {
        this.MATCH_CODE = MATCH_CODE;
    }

    public String getLABEL_COUNT() {
        return LABEL_COUNT;
    }

    public void setLABEL_COUNT(String LABEL_COUNT) {
        this.LABEL_COUNT = LABEL_COUNT;
    }

    public String getPICTURE_FLAG() {
        return PICTURE_FLAG;
    }

    public void setPICTURE_FLAG(String PICTURE_FLAG) {
        this.PICTURE_FLAG = PICTURE_FLAG;
    }

    public String getPICTURE_PATH() {
        return PICTURE_PATH;
    }

    public void setPICTURE_PATH(String PICTURE_PATH) {
        this.PICTURE_PATH = PICTURE_PATH;
    }

    public BigDecimal getSEQ() {
        return SEQ;
    }

    public void setSEQ(BigDecimal SEQ) {
        this.SEQ = SEQ;
    }

    public String getTEST_DATA() {
        return TEST_DATA;
    }

    public void setTEST_DATA(String TEST_DATA) {
        this.TEST_DATA = TEST_DATA;
    }

    public String getPICTURE_NAME_S() {
        return PICTURE_NAME_S;
    }

    public void setPICTURE_NAME_S(String PICTURE_NAME_S) {
        this.PICTURE_NAME_S = PICTURE_NAME_S;
    }

    public String getCOLUMN_TYPE() {
        return COLUMN_TYPE;
    }

    public void setCOLUMN_TYPE(String COLUMN_TYPE) {
        this.COLUMN_TYPE = COLUMN_TYPE;
    }

    public String getCOLUMN_DATA() {
        return COLUMN_DATA;
    }

    public void setCOLUMN_DATA(String COLUMN_DATA) {
        this.COLUMN_DATA = COLUMN_DATA;
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

    public String getSUBLEVEL_QTY_FLAG() {
        return SUBLEVEL_QTY_FLAG;
    }

    public void setSUBLEVEL_QTY_FLAG(String SUBLEVEL_QTY_FLAG) {
        this.SUBLEVEL_QTY_FLAG = SUBLEVEL_QTY_FLAG;
    }

    public String getSOURCE_ITEM_ID() {
        return SOURCE_ITEM_ID;
    }

    public void setSOURCE_ITEM_ID(String SOURCE_ITEM_ID) {
        this.SOURCE_ITEM_ID = SOURCE_ITEM_ID;
    }

    public String getSOURCE_TEMPLATE_ID() {
        return SOURCE_TEMPLATE_ID;
    }

    public void setSOURCE_TEMPLATE_ID(String SOURCE_TEMPLATE_ID) {
        this.SOURCE_TEMPLATE_ID = SOURCE_TEMPLATE_ID;
    }

    public String getEXTERNAL_SOURCE() {
        return EXTERNAL_SOURCE;
    }

    public void setEXTERNAL_SOURCE(String EXTERNAL_SOURCE) {
        this.EXTERNAL_SOURCE = EXTERNAL_SOURCE;
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
        MlDataItems other = (MlDataItems) that;
        return (this.getTEMPLATE_ID() == null ? other.getTEMPLATE_ID() == null : this.getTEMPLATE_ID().equals(other.getTEMPLATE_ID()))
            && (this.getDATA_ITEMS_NAME() == null ? other.getDATA_ITEMS_NAME() == null : this.getDATA_ITEMS_NAME().equals(other.getDATA_ITEMS_NAME()))
            && (this.getDATA_ITEMS_ALIAS() == null ? other.getDATA_ITEMS_ALIAS() == null : this.getDATA_ITEMS_ALIAS().equals(other.getDATA_ITEMS_ALIAS()))
            && (this.getBARCODE_ITEM() == null ? other.getBARCODE_ITEM() == null : this.getBARCODE_ITEM().equals(other.getBARCODE_ITEM()))
            && (this.getEMPTY_FLAG() == null ? other.getEMPTY_FLAG() == null : this.getEMPTY_FLAG().equals(other.getEMPTY_FLAG()))
            && (this.getALLOW_EDIT() == null ? other.getALLOW_EDIT() == null : this.getALLOW_EDIT().equals(other.getALLOW_EDIT()))
            && (this.getALLOW_DISPLAY() == null ? other.getALLOW_DISPLAY() == null : this.getALLOW_DISPLAY().equals(other.getALLOW_DISPLAY()))
            && (this.getMATCH_CODE() == null ? other.getMATCH_CODE() == null : this.getMATCH_CODE().equals(other.getMATCH_CODE()))
            && (this.getLABEL_COUNT() == null ? other.getLABEL_COUNT() == null : this.getLABEL_COUNT().equals(other.getLABEL_COUNT()))
            && (this.getPICTURE_FLAG() == null ? other.getPICTURE_FLAG() == null : this.getPICTURE_FLAG().equals(other.getPICTURE_FLAG()))
            && (this.getPICTURE_PATH() == null ? other.getPICTURE_PATH() == null : this.getPICTURE_PATH().equals(other.getPICTURE_PATH()))
            && (this.getSEQ() == null ? other.getSEQ() == null : this.getSEQ().equals(other.getSEQ()))
            && (this.getTEST_DATA() == null ? other.getTEST_DATA() == null : this.getTEST_DATA().equals(other.getTEST_DATA()))
            && (this.getPICTURE_NAME_S() == null ? other.getPICTURE_NAME_S() == null : this.getPICTURE_NAME_S().equals(other.getPICTURE_NAME_S()))
            && (this.getCOLUMN_TYPE() == null ? other.getCOLUMN_TYPE() == null : this.getCOLUMN_TYPE().equals(other.getCOLUMN_TYPE()))
            && (this.getCOLUMN_DATA() == null ? other.getCOLUMN_DATA() == null : this.getCOLUMN_DATA().equals(other.getCOLUMN_DATA()))
            && (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
            && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
            && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
            && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
            && (this.getSUBLEVEL_QTY_FLAG() == null ? other.getSUBLEVEL_QTY_FLAG() == null : this.getSUBLEVEL_QTY_FLAG().equals(other.getSUBLEVEL_QTY_FLAG()))
            && (this.getSOURCE_ITEM_ID() == null ? other.getSOURCE_ITEM_ID() == null : this.getSOURCE_ITEM_ID().equals(other.getSOURCE_ITEM_ID()))
            && (this.getSOURCE_TEMPLATE_ID() == null ? other.getSOURCE_TEMPLATE_ID() == null : this.getSOURCE_TEMPLATE_ID().equals(other.getSOURCE_TEMPLATE_ID()))
            && (this.getEXTERNAL_SOURCE() == null ? other.getEXTERNAL_SOURCE() == null : this.getEXTERNAL_SOURCE().equals(other.getEXTERNAL_SOURCE()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTEMPLATE_ID() == null) ? 0 : getTEMPLATE_ID().hashCode());
        result = prime * result + ((getDATA_ITEMS_NAME() == null) ? 0 : getDATA_ITEMS_NAME().hashCode());
        result = prime * result + ((getDATA_ITEMS_ALIAS() == null) ? 0 : getDATA_ITEMS_ALIAS().hashCode());
        result = prime * result + ((getBARCODE_ITEM() == null) ? 0 : getBARCODE_ITEM().hashCode());
        result = prime * result + ((getEMPTY_FLAG() == null) ? 0 : getEMPTY_FLAG().hashCode());
        result = prime * result + ((getALLOW_EDIT() == null) ? 0 : getALLOW_EDIT().hashCode());
        result = prime * result + ((getALLOW_DISPLAY() == null) ? 0 : getALLOW_DISPLAY().hashCode());
        result = prime * result + ((getMATCH_CODE() == null) ? 0 : getMATCH_CODE().hashCode());
        result = prime * result + ((getLABEL_COUNT() == null) ? 0 : getLABEL_COUNT().hashCode());
        result = prime * result + ((getPICTURE_FLAG() == null) ? 0 : getPICTURE_FLAG().hashCode());
        result = prime * result + ((getPICTURE_PATH() == null) ? 0 : getPICTURE_PATH().hashCode());
        result = prime * result + ((getSEQ() == null) ? 0 : getSEQ().hashCode());
        result = prime * result + ((getTEST_DATA() == null) ? 0 : getTEST_DATA().hashCode());
        result = prime * result + ((getPICTURE_NAME_S() == null) ? 0 : getPICTURE_NAME_S().hashCode());
        result = prime * result + ((getCOLUMN_TYPE() == null) ? 0 : getCOLUMN_TYPE().hashCode());
        result = prime * result + ((getCOLUMN_DATA() == null) ? 0 : getCOLUMN_DATA().hashCode());
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getDEPT_ID() == null) ? 0 : getDEPT_ID().hashCode());
        result = prime * result + ((getCREATE_USER() == null) ? 0 : getCREATE_USER().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getEDIT_USER() == null) ? 0 : getEDIT_USER().hashCode());
        result = prime * result + ((getEDIT_TIME() == null) ? 0 : getEDIT_TIME().hashCode());
        result = prime * result + ((getDATA_AUTH() == null) ? 0 : getDATA_AUTH().hashCode());
        result = prime * result + ((getSUBLEVEL_QTY_FLAG() == null) ? 0 : getSUBLEVEL_QTY_FLAG().hashCode());
        result = prime * result + ((getSOURCE_ITEM_ID() == null) ? 0 : getSOURCE_ITEM_ID().hashCode());
        result = prime * result + ((getSOURCE_TEMPLATE_ID() == null) ? 0 : getSOURCE_TEMPLATE_ID().hashCode());
        result = prime * result + ((getEXTERNAL_SOURCE() == null) ? 0 : getEXTERNAL_SOURCE().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", TEMPLATE_ID=").append(TEMPLATE_ID);
        sb.append(", DATA_ITEMS_NAME=").append(DATA_ITEMS_NAME);
        sb.append(", DATA_ITEMS_ALIAS=").append(DATA_ITEMS_ALIAS);
        sb.append(", BARCODE_ITEM=").append(BARCODE_ITEM);
        sb.append(", EMPTY_FLAG=").append(EMPTY_FLAG);
        sb.append(", ALLOW_EDIT=").append(ALLOW_EDIT);
        sb.append(", ALLOW_DISPLAY=").append(ALLOW_DISPLAY);
        sb.append(", MATCH_CODE=").append(MATCH_CODE);
        sb.append(", LABEL_COUNT=").append(LABEL_COUNT);
        sb.append(", PICTURE_FLAG=").append(PICTURE_FLAG);
        sb.append(", PICTURE_PATH=").append(PICTURE_PATH);
        sb.append(", SEQ=").append(SEQ);
        sb.append(", TEST_DATA=").append(TEST_DATA);
        sb.append(", PICTURE_NAME_S=").append(PICTURE_NAME_S);
        sb.append(", COLUMN_TYPE=").append(COLUMN_TYPE);
        sb.append(", COLUMN_DATA=").append(COLUMN_DATA);
        sb.append(", ID=").append(ID);
        sb.append(", DEPT_ID=").append(DEPT_ID);
        sb.append(", CREATE_USER=").append(CREATE_USER);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", EDIT_USER=").append(EDIT_USER);
        sb.append(", EDIT_TIME=").append(EDIT_TIME);
        sb.append(", DATA_AUTH=").append(DATA_AUTH);
        sb.append(", SUBLEVEL_QTY_FLAG=").append(SUBLEVEL_QTY_FLAG);
        sb.append(", SOURCE_ITEM_ID=").append(SOURCE_ITEM_ID);
        sb.append(", SOURCE_TEMPLATE_ID=").append(SOURCE_TEMPLATE_ID);
        sb.append(", EXTERNAL_SOURCE=").append(EXTERNAL_SOURCE);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}