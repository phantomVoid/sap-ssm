package com.phantom.trans;

/**
 * 账务核对
 * @author:phantomsaber
 * @version:2019/9/19 15:38
 * @email:phantomsaber@foxmail.com
 **/
public enum ProjectAccountCheckTransEnum {
    //物料凭证编号
    itemCertSn("物料凭证编号", "MBLNR"),

    itemCertYear("物料凭证年度", "MJAHR"),

    itemCertThing("物料凭证中的项目", "ZEILE"),

    moveType("移动类型", "BWART"),

    itemCode("物料号", "MATNR"),

    workSpace("工厂", "WERKS"),

    wareHouse("库存地点", "LGORT"),

    lot("批次号", "CHARG"),

    itemNum("数量", "MENGE"),

    baseUnit("基本计量单位", "MEINS"),

    projectId("订单号", "AUFNR"),

    postDate("凭证中的过帐日期", "BUDAT"),

    certDate("凭证中的凭证日期", "BLDAT"),

    confirmOutPut("按订单计量单位已确认的产量", "GMNGA");

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

    ProjectAccountCheckTransEnum(String desc, String sapParam) {
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
