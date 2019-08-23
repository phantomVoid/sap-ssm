package com.phantom.trans;

public enum ProjectFeedTransEnum {

    /**
     * ZGUID
     */
    uuid("uuid","ZGUID"),

    /**
     * 工单号
      */
    projectId("工单号","AUFNR"),

    /**
     * 过账日期
     */
    postDate("过站日期","BUDAT"),

    /**
     * 料号
     */
    itemCode("料号","MATNR"),

    /**
     * 基本计量单位
     */
    baseUnit("基本计量单位", "MEINS"),

    /**
     * 反向标识
     */
    reverse("反向标识", "REVERSE"),

    /**
     * 数量
     */
    feedNum("数量", "MENGE"),

    /**
     * 仓库
     */
    feedWarehouse("仓库", "LGORT1"),

    /**
     * 批次号
     */
    lot("批次号", "CHARG"),

    /**
     * 服务器日期
     */
    curDate("服务器日期", "DATUM"),

    /**
     * 服务器时间
     */
    curDateTime("服务器时间","UZEIT"),

    /**
     * 记录创建序号
     */
    feedIndex("记录创建序号", "NUMB"),

    /**
     * 系统登录用户名
     */
    sysUserName("系统登录用户名", "UNAME"),

    /**
     * 物料凭证编码
     */
    itemCodeSn("物料凭证编码", "MBLNR"),

    /**
     * 工厂
     */
    workSpace("工厂","WERKS"),

    /**
     * 同步结果
     */
    sflag("同步结果","SFLAG"),

    /**
     * 消息文本
     */
    message("消息文本","MESSAGE");

    /**
     * 字段描述
     */
    private String desc;

    /**
     * SAP字段名
     */
    private String sapParam;

    @Override
    public String toString() {
        return super.toString();
    }

    ProjectFeedTransEnum(String desc,String sapParam) {
        this.sapParam = sapParam;
        this.desc = desc;
    }

    public String getSapParam() {
        return sapParam;
    }

    public String getDesc() {
        return desc;
    }
}
