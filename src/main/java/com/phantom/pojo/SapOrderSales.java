package com.phantom.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

/**
 * 工单下达同步-销售订单
 *
 * @author:phantomsaber
 * @version:2019/8/2 16:21
 * @email:phantomsaber@foxmail.com
 **/
@XmlRootElement
public class SapOrderSales implements Serializable {
    /**
     * 销售订单号
     */
    @XmlElement
    public String KDAUF;

    /**
     * 行项目
     */
    @XmlElement
    public String KDPOS;

    /**
     * 交货计划行
     */
    @XmlElement
    public String KDEIN;

    /**
     * 交货日期
     */
    @XmlElement
    public String VDATU;

    /**
     * 1交货日期
     */
    @XmlElement
    public String EDATU;

    /**
     * 订货方
     */
    @XmlElement
    public String KUNNR;

    /**
     * 订货方描述
     */
    @XmlElement
    public String NAME1;

    /**
     * 订货城市
     */
    @XmlElement
    public String ORT01;

    /**
     * BOM文本
     */
    @XmlElement
    public String ZTEXT;

    /**
     * 特性值
     */
    @XmlElement
    public String TX;

    @XmlTransient
    public String getKDAUF() {
        return KDAUF;
    }

    @XmlTransient
    public String getKDPOS() {
        return KDPOS;
    }

    @XmlTransient
    public String getKDEIN() {
        return KDEIN;
    }

    @XmlTransient
    public String getVDATU() {
        return VDATU;
    }

    @XmlTransient
    public String getEDATU() {
        return EDATU;
    }

    @XmlTransient
    public String getKUNNR() {
        return KUNNR;
    }

    @XmlTransient
    public String getNAME1() {
        return NAME1;
    }

    @XmlTransient
    public String getORT01() {
        return ORT01;
    }

    @XmlTransient
    public String getZTEXT() {
        return ZTEXT;
    }

    @XmlTransient
    public String getTX() {
        return TX;
    }

    public void setTX(String TX) {
        this.TX = TX;
    }

    public void setKDAUF(String KDAUF) {
        this.KDAUF = KDAUF;
    }

    public void setKDPOS(String KDPOS) {
        this.KDPOS = KDPOS;
    }

    public void setKDEIN(String KDEIN) {
        this.KDEIN = KDEIN;
    }

    public void setVDATU(String VDATU) {
        this.VDATU = VDATU;
    }

    public void setEDATU(String EDATU) {
        this.EDATU = EDATU;
    }

    public void setKUNNR(String KUNNR) {
        this.KUNNR = KUNNR;
    }

    public void setNAME1(String NAME1) {
        this.NAME1 = NAME1;
    }

    public void setORT01(String ORT01) {
        this.ORT01 = ORT01;
    }

    public void setZTEXT(String ZTEXT) {
        this.ZTEXT = ZTEXT;
    }

    @Override
    public String toString() {
        return "SapOrderSales{" +
                "KDAUF='" + KDAUF + '\'' +
                ", KDPOS='" + KDPOS + '\'' +
                ", KDEIN='" + KDEIN + '\'' +
                ", VDATU='" + VDATU + '\'' +
                ", EDATU='" + EDATU + '\'' +
                ", KUNNR='" + KUNNR + '\'' +
                ", NAME1='" + NAME1 + '\'' +
                ", ORT01='" + ORT01 + '\'' +
                ", ZTEXT='" + ZTEXT + '\'' +
                '}';
    }
}
