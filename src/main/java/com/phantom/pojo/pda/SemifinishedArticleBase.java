package com.phantom.pojo.pda;

import java.math.BigDecimal;

/**
 * 半成品标签 POJO
 *
 * @author:phantomsaber
 * @version:2019/10/4 17:04
 * @email:phantomsaber@foxmail.com
 **/
public class SemifinishedArticleBase {


    //1.存货代码
    public String STOCK_CODE;

    //2.日期
    public String DATE;

    //3.批次号
    public String LOT_NUMBER;

    //4.物料编码
    public String ITEM_CODE;

    //5.产品名称
    public String PRODUCT_NAME;

    //6.计划数量
    public BigDecimal PRODUCT_COUNT;


    public SemifinishedArticleBase() {
    }

    public String getSTOCK_CODE() {
        return STOCK_CODE;
    }

    public void setSTOCK_CODE(String STOCK_CODE) {
        this.STOCK_CODE = STOCK_CODE;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getLOT_NUMBER() {
        return LOT_NUMBER;
    }

    public void setLOT_NUMBER(String LOT_NUMBER) {
        this.LOT_NUMBER = LOT_NUMBER;
    }

    public String getITEM_CODE() {
        return ITEM_CODE;
    }

    public void setITEM_CODE(String ITEM_CODE) {
        this.ITEM_CODE = ITEM_CODE;
    }

    public String getPRODUCT_NAME() {
        return PRODUCT_NAME;
    }

    public void setPRODUCT_NAME(String PRODUCT_NAME) {
        this.PRODUCT_NAME = PRODUCT_NAME;
    }

    public BigDecimal getPRODUCT_COUNT() {
        return PRODUCT_COUNT;
    }

    public void setPRODUCT_COUNT(BigDecimal PRODUCT_COUNT) {
        this.PRODUCT_COUNT = PRODUCT_COUNT;
    }
}
