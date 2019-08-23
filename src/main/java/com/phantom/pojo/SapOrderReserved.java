package com.phantom.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

/**
 * 工单下达同步-预留信息
 *
 * @author:phantomsaber
 * @version:2019/8/2 16:19
 * @email:phantomsaber@foxmail.com
 **/
@XmlRootElement
public class SapOrderReserved implements Serializable {
    /**
     * 订单号
     */
    @XmlElement
    public String AUFNR;

    /**
     * 项目号
     */
    @XmlElement
    public String POSNR;

    /**
     * 项目类型
     */
    @XmlElement
    public String POSTP;

    /**
     * 组件
     */
    @XmlElement
    public String MATNR;

    /**
     * 数量
     */
    @XmlElement
    public String NOMNG;

    /**
     * 单位
     */
    @XmlElement
    public String MEINS;

    /**
     * 工厂
     */
    @XmlElement
    public String WERKS;

    /**
     * 库存地点
     */
    @XmlElement
    public String LGORT;

    /**
     * 排序字符串
     */
    @XmlElement
    public String SORTF;

    @XmlTransient
    public String getAUFNR() {
        return AUFNR;
    }

    @XmlTransient
    public String getPOSNR() {
        return POSNR;
    }

    @XmlTransient
    public String getPOSTP() {
        return POSTP;
    }

    @XmlTransient
    public String getMATNR() {
        return MATNR;
    }

    @XmlTransient
    public String getNOMNG() {
        return NOMNG;
    }

    @XmlTransient
    public String getMEINS() {
        return MEINS;
    }

    @XmlTransient
    public String getWERKS() {
        return WERKS;
    }

    @XmlTransient
    public String getLGORT() {
        return LGORT;
    }

    @XmlTransient
    public String getSORTF() {
        return SORTF;
    }

    public void setAUFNR(String AUFNR) {
        this.AUFNR = AUFNR;
    }

    public void setPOSNR(String POSNR) {
        this.POSNR = POSNR;
    }

    public void setPOSTP(String POSTP) {
        this.POSTP = POSTP;
    }

    public void setMATNR(String MATNR) {
        this.MATNR = MATNR;
    }

    public void setNOMNG(String NOMNG) {
        this.NOMNG = NOMNG;
    }

    public void setMEINS(String MEINS) {
        this.MEINS = MEINS;
    }

    public void setWERKS(String WERKS) {
        this.WERKS = WERKS;
    }

    public void setLGORT(String LGORT) {
        this.LGORT = LGORT;
    }

    public void setSORTF(String SORTF) {
        this.SORTF = SORTF;
    }

    @Override
    public String toString() {
        return "SapOrderReserved{" +
                "AUFNR='" + AUFNR + '\'' +
                ", POSNR='" + POSNR + '\'' +
                ", POSTP='" + POSTP + '\'' +
                ", MATNR='" + MATNR + '\'' +
                ", NOMNG='" + NOMNG + '\'' +
                ", MEINS='" + MEINS + '\'' +
                ", WERKS='" + WERKS + '\'' +
                ", LGORT='" + LGORT + '\'' +
                ", SORTF='" + SORTF + '\'' +
                '}';
    }
}
