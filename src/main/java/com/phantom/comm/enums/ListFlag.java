package com.phantom.comm.enums;

/**
 * 列表枚举
 * @author:phantomsaber
 * @version:2019/10/4 17:57
 * @email:phantomsaber@foxmail.com
 **/
public enum ListFlag {

    //存在唯一记录
    Unique("存在唯一记录","unique"),

    //存在多条记录
    Multiple("存在多条记录","multiple"),

    //不存在记录
    None("不存在记录","none");

    /**
     * projectSort 描述
     */
    private String desc;

    /**
     * projectSort 代码
     */
    private String code;

    ListFlag(String desc, String code) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return code;
    }
}
