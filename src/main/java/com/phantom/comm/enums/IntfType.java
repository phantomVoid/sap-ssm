package com.phantom.comm.enums;

/**
 * 接口类型
 *
 * @author:phantomsaber
 * @version:2019/8/21 3:15
 * @email:phantomsaber@foxmail.com
 **/
public enum IntfType {
    //    物料同步
    itemAdd("物料同步", "1", "ZFG_MES_001"),

    //    产品层级
    levelAdd("产品层级", "2", "ZFG_MES_002"),

    //    工单下达
    projectAdd("工单下达", "3", "ZFG_MES_003"),

    //    工单修改
    projectEdit("工单修改", "4", "ZFG_MES_004"),

    //    制造单投料
    projectFeed("制造单投料", "5", "ZFG_MES_005"),

    //    包装单投料
    packFeed("包装单投料", "6", "ZFG_MES_006"),

    //    工单缴库
    projectPost("工单缴库", "7", "ZFG_MES_006"),

    //    工单报工
    projectReport("工单报工", "8", "ZFG_MES_007"),

    //    账目同步
    accountSync("账目同步", "9", "ZFG_MES_008"),

    //    SAP日志同步
    logSync("SAP日志同步", "10", "ZFG_MES_009");

    /**
     * projectSort 描述
     */
    private String desc;

    /**
     * projectSort 代码
     */
    private String code;

    /**
     * 接口方法名
     */
    private String funcName;

    IntfType(String desc, String code, String funcName) {
        this.desc = desc;
        this.code = code;
        this.funcName = funcName;
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

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }
}
