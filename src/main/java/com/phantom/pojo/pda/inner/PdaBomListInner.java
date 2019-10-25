package com.phantom.pojo.pda.inner;

import com.alibaba.fastjson.annotation.JSONField;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import java.math.BigDecimal;

/**
 * 工单BOM物料列表
 * @author:phantomsaber
 * @version:2019/10/2 21:24
 * @email:phantomsaber@foxmail.com
 **/
public class PdaBomListInner {
    //物料编码
    @XmlElement
    public String ITEM_CODE;

    //存货代码
    @XmlElement
    public String STOCK_CODE;

    //理论数量
    @XmlElement
    public BigDecimal ITEM_NUM;

    public PdaBomListInner() {
    }

    @XmlTransient
    @JSONField(name = "ITEM_CODE")
    public String getITEM_CODE() {
        return ITEM_CODE;
    }

    @XmlTransient
    @JSONField(name = "STOCK_CODE")
    public String getSTOCK_CODE() {
        return STOCK_CODE;
    }

    @XmlTransient
    @JSONField(name = "ITEM_NUM")
    public BigDecimal getITEM_NUM() {
        return ITEM_NUM;
    }

    public void setITEM_CODE(String ITEM_CODE) {
        this.ITEM_CODE = ITEM_CODE;
    }

    public void setSTOCK_CODE(String STOCK_CODE) {
        this.STOCK_CODE = STOCK_CODE;
    }

    public void setITEM_NUM(BigDecimal ITEM_NUM) {
        this.ITEM_NUM = ITEM_NUM;
    }
}
