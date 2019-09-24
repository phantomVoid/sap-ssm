package com.phantom.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * sap 接口传输结果封装
 * @author:phantomsaber
 * @version:2019/8/20 17:07
 * @email:phantomsaber@foxmail.com
 **/
@XmlRootElement
public class SapAccountCheck {
    /**
     * 工单号
     */
    @XmlElement
    public String projectId;

    /**
     * 工厂
     */
    @XmlElement
    public String workSpace;

    @XmlTransient
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @XmlTransient
    public String getWorkSpace() {
        return workSpace;
    }

    public void setWorkSpace(String workSpace) {
        this.workSpace = workSpace;
    }

    @Override
    public String toString() {
        return "SapAccountCheck{" +
                "projectId='" + projectId + '\'' +
                ", workSpace='" + workSpace + '\'' +
                '}';
    }
}
