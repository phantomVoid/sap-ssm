package com.phantom.trans;

public enum ProjectReportTransEnum {

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
    Index("记录创建序号", "NUMB"),

    /**
     * 系统登录用户名
     */
    sysUserName("系统登录用户名", "UNAME"),

    /**
     * 物料凭证编码
     */
    itemCodeSn("物料凭证编码", "MBLNR"),

    /**
     * 工单号
      */
    projectId("工单号","AUFNR"),

    /**
     * 基本计量单位
     */
    baseUnit("基本计量单位","GMEIN"),

    /**
     * 待确认产量
     */
    toConfirmOutPut("待确认产量","LMNGA"),

    /**
     * 当前需确认作业1
     */
    curJob1("当前需确认作业1", "ISM01"),

    /**
     * 当前作业计量单位
     */
    curJob1Unit("当前作业计量单位1","ILE01"),

    /**
     * 当前需确认作业2
     */
    curJob2("当前需确认作业2", "ISM02"),

    /**
     * 当前作业计量单位2
     */
    curJob2Unit("当前作业计量单位2","ILE02"),

    /**
     * 当前需确认作业3
     */
    curJob3("当前需确认作业3", "ISM03"),

    /**
     * 当前作业计量单位3
     */
    curJob3Unit("当前作业计量单位3","ILE03"),

    /**
     * 过账日期
     */
    postDate("过站日期","BUDAT"),

    /**
     * 反向标识
     */
    reverse("反向标识", "REVERSE"),

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

    ProjectReportTransEnum(String desc, String sapParam) {
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
