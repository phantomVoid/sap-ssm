package com.phantom.pojo.pda;

import com.alibaba.fastjson.annotation.JSONField;
import com.phantom.pojo.pda.inner.PdaBomListInner;

import java.math.BigDecimal;
import java.util.List;

/**
 * 工单BOM清单 POJO
 * @author:phantomsaber
 * @version:2019/10/2 21:22
 * @email:phantomsaber@foxmail.com
 **/
public class PdaBomListBase {

    //1.车间编码
    public String PRODUCT_LINE;

    //2.工单号
    public String PROJECT_ID;

    //3.产品编码
    public String PRODUCT_MATERIAL;

    //4.产品名称
    public String PRODUCT_NAME;

    //5.批次号
    public String LOT_NUMBER;

    //6.计划数量
    public BigDecimal PRODUCT_COUNT;

    //7.产出数量
    public BigDecimal FINISH_COUNT;

    //8.物料列表
    public List<PdaBomListInner> ITEM_LIST;

    public PdaBomListBase() {
    }

    @JSONField(name = "PRODUCT_LINE")
    public String getPRODUCT_LINE() {
        return PRODUCT_LINE;
    }

    @JSONField(name = "PROJECT_ID")
    public String getPROJECT_ID() {
        return PROJECT_ID;
    }

    @JSONField(name = "PRODUCT_MATERIAL")
    public String getPRODUCT_MATERIAL() {
        return PRODUCT_MATERIAL;
    }

    @JSONField(name = "PRODUCT_NAME")
    public String getPRODUCT_NAME() {
        return PRODUCT_NAME;
    }

    @JSONField(name = "LOT_NUMBER")
    public String getLOT_NUMBER() {
        return LOT_NUMBER;
    }

    @JSONField(name = "PRODUCT_COUNT")
    public BigDecimal getPRODUCT_COUNT() {
        return PRODUCT_COUNT;
    }

    @JSONField(name = "FINISH_COUNT")
    public BigDecimal getFINISH_COUNT() {
        return FINISH_COUNT;
    }

    @JSONField(name = "ITEM_LIST")
    public List<PdaBomListInner> getITEM_LIST() {
        return ITEM_LIST;
    }

    public void setPRODUCT_LINE(String PRODUCT_LINE) {
        this.PRODUCT_LINE = PRODUCT_LINE;
    }

    public void setPROJECT_ID(String PROJECT_ID) {
        this.PROJECT_ID = PROJECT_ID;
    }

    public void setPRODUCT_MATERIAL(String PRODUCT_MATERIAL) {
        this.PRODUCT_MATERIAL = PRODUCT_MATERIAL;
    }

    public void setPRODUCT_NAME(String PRODUCT_NAME) {
        this.PRODUCT_NAME = PRODUCT_NAME;
    }

    public void setLOT_NUMBER(String LOT_NUMBER) {
        this.LOT_NUMBER = LOT_NUMBER;
    }

    public void setPRODUCT_COUNT(BigDecimal PRODUCT_COUNT) {
        this.PRODUCT_COUNT = PRODUCT_COUNT;
    }

    public void setFINISH_COUNT(BigDecimal FINISH_COUNT) {
        this.FINISH_COUNT = FINISH_COUNT;
    }

    public void setITEM_LIST(List<PdaBomListInner> ITEM_LIST) {
        this.ITEM_LIST = ITEM_LIST;
    }
}
