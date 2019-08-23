package com.phantom.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 工单下达同步-工序信息
 * @author:phantomsaber
 * @version:2019/8/2 16:17
 * @email:phantomsaber@foxmail.com
 **/
@XmlRootElement
public class SapOrderProcess {
    /**
     * 订单号
     */
    @XmlElement
    public String AUFNR;

    /**
     * 工序
     */
    @XmlElement
    public String VORNR;

    /**
     * 工作中心
     */
    @XmlElement
    public String ARBPL;

    /**
     * 工作中心描述
     */
    @XmlElement
    public String STEXT;

    /**
     * 基本数量
     */
    @XmlElement
    public String BMSCH;

    /**
     * 准备工时
     */
    @XmlElement
    public String VGW01;

    /**
     * 机器工时
     */
    @XmlElement
    public String VGW02;

    /**
     * 人工工时
     */
    @XmlElement
    public String VGW03;

    /**
     * 工时单位
     */
    @XmlElement
    public String VGE04;

    public SapOrderProcess() {
    }

    @XmlTransient
    public String getAUFNR() {
        return AUFNR;
    }

    @XmlTransient
    public String getVORNR() {
        return VORNR;
    }

    @XmlTransient
    public String getARBPL() {
        return ARBPL;
    }

    @XmlTransient
    public String getSTEXT() {
        return STEXT;
    }

    @XmlTransient
    public String getBMSCH() {
        return BMSCH;
    }

    @XmlTransient
    public String getVGW01() {
        return VGW01;
    }

    @XmlTransient
    public String getVGW02() {
        return VGW02;
    }

    @XmlTransient
    public String getVGW03() {
        return VGW03;
    }

    @XmlTransient
    public String getVGE04() {
        return VGE04;
    }

    public void setAUFNR(String AUFNR) {
        this.AUFNR = AUFNR;
    }

    public void setVORNR(String VORNR) {
        this.VORNR = VORNR;
    }

    public void setARBPL(String ARBPL) {
        this.ARBPL = ARBPL;
    }

    public void setSTEXT(String STEXT) {
        this.STEXT = STEXT;
    }

    public void setBMSCH(String BMSCH) {
        this.BMSCH = BMSCH;
    }

    public void setVGW01(String VGW01) {
        this.VGW01 = VGW01;
    }

    public void setVGW02(String VGW02) {
        this.VGW02 = VGW02;
    }

    public void setVGW03(String VGW03) {
        this.VGW03 = VGW03;
    }

    public void setVGE04(String VGE04) {
        this.VGE04 = VGE04;
    }

    @Override
    public String toString() {
        return "SapOrderProcess{" +
                "AUFNR='" + AUFNR + '\'' +
                ", VORNR='" + VORNR + '\'' +
                ", ARBPL='" + ARBPL + '\'' +
                ", STEXT='" + STEXT + '\'' +
                ", BMSCH='" + BMSCH + '\'' +
                ", VGW01='" + VGW01 + '\'' +
                ", VGW02='" + VGW02 + '\'' +
                ", VGW03='" + VGW03 + '\'' +
                ", VGE04='" + VGE04 + '\'' +
                '}';
    }
}
