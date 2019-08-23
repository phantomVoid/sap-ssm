package com.phantom.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

/**
 * SAP 返回信息
 * @author:phantomsaber
 * @version:2019/8/2 16:19
 * @email:phantomsaber@foxmail.com
 **/
@XmlRootElement
public class SapOrderRes implements Serializable {
    @XmlElement
    public String SFLAG;

    @XmlElement
    public String MESSAGE;

    public SapOrderRes() {
    }

    public SapOrderRes(String SFLAG, String MESSAGE) {
        this.SFLAG = SFLAG;
        this.MESSAGE = MESSAGE;
    }

    @XmlTransient
    public String getSFLAG() {
        return SFLAG;
    }

    public void setSFLAG(String SFLAG) {
        this.SFLAG = SFLAG;
    }

    @XmlTransient
    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    @Override
    public String toString() {
        return "SapOrderRes{" +
                "SFLAG='" + SFLAG + '\'' +
                ", MESSAGE='" + MESSAGE + '\'' +
                '}';
    }
}
