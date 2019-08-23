package com.phantom.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

/**
 * 物料信息
 *
 * @author:phantomsaber
 * @version:2019/8/4 0:52
 * @email:phantomsaber@foxmail.com
 **/
@XmlRootElement
public class SapItem implements Serializable {
    @XmlElement
    public String SIGN;

    @XmlElement
    public String OPTION;

    @XmlElement
    public String LOW;

    @XmlElement
    public String HEIGH;

    public SapItem() {
    }

    @XmlTransient
    public String getSIGN() {
        return SIGN;
    }

    public void setSIGN(String SIGN) {
        this.SIGN = SIGN;
    }

    @XmlTransient
    public String getOPTION() {
        return OPTION;
    }

    public void setOPTION(String OPTION) {
        this.OPTION = OPTION;
    }

    @XmlTransient
    public String getLOW() {
        return LOW;
    }

    public void setLOW(String LOW) {
        this.LOW = LOW;
    }

    @XmlTransient
    public String getHEIGH() {
        return HEIGH;
    }

    public void setHEIGH(String HEIGH) {
        this.HEIGH = HEIGH;
    }

    @Override
    public String toString() {
        return "SapItem{" +
                "SIGN='" + SIGN + '\'' +
                ", OPTION='" + OPTION + '\'' +
                ", LOW='" + LOW + '\'' +
                ", HEIGH='" + HEIGH + '\'' +
                '}';
    }
}
