package com.phantom.pojo;

import javax.jws.WebParam;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

/**
 * 工单下达同步-工单基础信息
 * @author:phantomsaber
 * @version:2019/8/2 16:18
 * @email:phantomsaber@foxmail.com
 **/
@XmlRootElement
public class SapOrderBase implements Serializable {
    /**
     * 订单号
     */
    @XmlElement
    public String AUFNR;

    /**
     * 订单类型 AUART=ZP01/ZP02 TYPE=2 包装单;其它订单类型,TYPE=1 制造单
     */
    @XmlElement
    public String AUART;

    /**
     * 物品编码
     */
    @XmlElement
    public String PLNBEZ;

    /**
     * 生产数量
     */
    @XmlElement
    public String GAMNG;

    /**
     * 生产批次
     */
    @XmlElement
    public String CHARG;

    /**
     * 计划开始时间
     */
    @XmlElement
    public String GSTRP;

    /**
     * 计划结束时间
     */
    @XmlElement
    public String GLTRP;

    /**
     * 实际开始时间
     */
    @XmlElement
    public String FTRMI;

    /**
     * 制造单/包装单 1:制造单;2:包装单
     */
    @XmlElement
    public String TYPE;

    /**
     * 基本计量单位
     */
    @XmlElement
    public String GMEIN;

    /**
     * 仓库
     */
    @XmlElement
    public String LGORT;

    /**
     * 工厂
     */
    @XmlElement
    public String WERKS;

    /**
     * BOM文本
     */
    @XmlElement
    public String ZTEXT;

    public SapOrderBase() {
    }

    @XmlTransient
    public String getAUFNR() {
        return AUFNR;
    }

    @XmlTransient
    public String getAUART() {
        return AUART;
    }

    @XmlTransient
    public String getPLNBEZ() {
        return PLNBEZ;
    }

    @XmlTransient
    public String getGAMNG() {
        return GAMNG;
    }

    @XmlTransient
    public String getCHARG() {
        return CHARG;
    }

    @XmlTransient
    public String getGSTRP() {
        return GSTRP;
    }

    @XmlTransient
    public String getGLTRP() {
        return GLTRP;
    }

    @XmlTransient
    public String getFTRMI() {
        return FTRMI;
    }

    @XmlTransient
    public String getTYPE() {
        return TYPE;
    }

    @XmlTransient
    public String getGMEIN() {
        return GMEIN;
    }

    @XmlTransient
    public String getLGORT() {
        return LGORT;
    }

    @XmlTransient
    public String getWERKS() {
        return WERKS;
    }

    @XmlTransient
    public String getZTEXT() {
        return ZTEXT;
    }

    public void setZTEXT(String ZTEXT) {
        this.ZTEXT = ZTEXT;
    }

    public void setWERKS(String WERKS) {
        this.WERKS = WERKS;
    }

    public void setAUFNR(String AUFNR) {
        this.AUFNR = AUFNR;
    }

    public void setAUART(String AUART) {
        this.AUART = AUART;
    }

    public void setPLNBEZ(String PLNBEZ) {
        this.PLNBEZ = PLNBEZ;
    }

    public void setGAMNG(String GAMNG) {
        this.GAMNG = GAMNG;
    }

    public void setCHARG(String CHARG) {
        this.CHARG = CHARG;
    }

    public void setGSTRP(String GSTRP) {
        this.GSTRP = GSTRP;
    }

    public void setGLTRP(String GLTRP) {
        this.GLTRP = GLTRP;
    }

    public void setFTRMI(String FTRMI) {
        this.FTRMI = FTRMI;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public void setGMEIN(String GMEIN) {
        this.GMEIN = GMEIN;
    }

    public void setLGORT(String LGORT) {
        this.LGORT = LGORT;
    }

    @Override
    public String toString() {
        return "SapOrderBase{" +
                "AUFNR='" + AUFNR + '\'' +
                ", AUART='" + AUART + '\'' +
                ", PLNBEZ='" + PLNBEZ + '\'' +
                ", GAMNG='" + GAMNG + '\'' +
                ", CHARG='" + CHARG + '\'' +
                ", GSTRP='" + GSTRP + '\'' +
                ", GLTRP='" + GLTRP + '\'' +
                ", FTRMI='" + FTRMI + '\'' +
                ", TYPE='" + TYPE + '\'' +
                ", GMEIN='" + GMEIN + '\'' +
                ", LGORT='" + LGORT + '\'' +
                '}';
    }
}
