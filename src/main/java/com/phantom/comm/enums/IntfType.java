package com.phantom.comm.enums;

/**
 * 接口类型
 * @author:phantomsaber
 * @version:2019/8/21 3:15
 * @email:phantomsaber@foxmail.com
 **/
public enum IntfType {
//    物料同步
    itemAdd("物料同步", "1"),

//    产品层级
    levelAdd("产品层级","2"),

//    工单下达
    projectAdd("工单下达", "3"),

//    工单修改
    projectEdit("工单修改", "4"),

//    制造单投料
    projectFeed("制造单投料", "5"),

//    包装单投料
    packFeed("包装单投料", "6"),

//    工单缴库
    projectPost("工单缴库", "7"),

//    工单报工
    projectReport("工单报工", "8"),

//    账目同步
    accountSync("账目同步", "9"),

//    SAP日志同步
    logSync("SAP日志同步", "10");


    /**
     * projectSort 描述
     */
    private String desc;

    /**
     * projectSort 代码
     */
    private String code;

    IntfType(String desc, String code) {
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
