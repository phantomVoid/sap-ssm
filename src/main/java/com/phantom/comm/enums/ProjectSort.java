package com.phantom.comm.enums;

/**
 * 工单分类
 * @author:phantomsaber
 * @version:2019/8/5 15:04
 * @email:phantomsaber@foxmail.com
 **/
public enum ProjectSort {
    //未分类
    UNSORT("未分类", "0"),

    //制造单
    MANUFACTURE("制造单", "1"),

    //包装单
    PACK("包装单", "2"),

    //其他单据
    OTHER("其他单据", "3");

    /**
     * projectSort 描述
     */
    private String desc;

    /**
     * projectSort 代码
     */
    private String code;

    ProjectSort(String desc, String code) {
        this.desc = desc;
        this.code = code;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
