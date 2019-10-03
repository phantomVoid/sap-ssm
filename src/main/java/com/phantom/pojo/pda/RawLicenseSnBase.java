package com.phantom.pojo.pda;

import java.math.BigDecimal;

/**
 * 工单BOM清单 POJO
 * @author:phantomsaber
 * @version:2019/10/2 21:22
 * @email:phantomsaber@foxmail.com
 **/
public class RawLicenseSnBase {

    //1.物料编码
    public String ITEM_CODE;

    //2.存货代码
    public String STOCK_CODE;

    //3.批次号
    public String LOT_NUMBER;

    //4.重量
    public BigDecimal WEIGHT_NUM;

    public RawLicenseSnBase() {
    }

    public String getITEM_CODE() {
        return ITEM_CODE;
    }

    public void setITEM_CODE(String ITEM_CODE) {
        this.ITEM_CODE = ITEM_CODE;
    }

    public String getSTOCK_CODE() {
        return STOCK_CODE;
    }

    public void setSTOCK_CODE(String STOCK_CODE) {
        this.STOCK_CODE = STOCK_CODE;
    }

    public String getLOT_NUMBER() {
        return LOT_NUMBER;
    }

    public void setLOT_NUMBER(String LOT_NUMBER) {
        this.LOT_NUMBER = LOT_NUMBER;
    }

    public BigDecimal getWEIGHT_NUM() {
        return WEIGHT_NUM;
    }

    public void setWEIGHT_NUM(BigDecimal WEIGHT_NUM) {
        this.WEIGHT_NUM = WEIGHT_NUM;
    }
}
