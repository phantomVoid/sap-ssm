package com.phantom.comm.enums;
/**
 * SAP传输标识
 * @author:phantomsaber
 * @version:2019/8/3 22:50
 * @email:phantomsaber@foxmail.com
 **/
public enum Flag {
    /**
     * 成功
     */
    Y("成功"),

    /**
     * 失败
     */
    N("失败");

    /**
     * 字段描述
     */
    private String desc;

    Flag(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
