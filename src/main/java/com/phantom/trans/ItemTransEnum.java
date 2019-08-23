package com.phantom.trans;

public enum ItemTransEnum {

    /**
     * itemCode 物料号 MATNR
     */
    itemCode("物料号","MATNR"),

    /**
     * 物料名称 MAKTX
     */
    itemName("物料名称","MAKTX"),

    /**
     * 规格 ZRES2
     */
    itemSpec("规格","ZSPEC"),

    /**
     * stockCode 存货代码 ZSTOR
     */
    stockCode("存货代码","ZSTOR"),

    /**
     * colorCode 调色号码 ZTONE
     */
    colorCode("调色号码","ZTONE"),

    /**
     * levelGroup 产品层级 PRDHA
     */
    levelGroup("产品层级","PRDHA"),

    /**
     * undefined2 预留2 ZRES2
     */
    undefined2("预留2","ZRES2"),

    /**
     * grossWeight 毛重 BRGEW
     */
    grossWeight("毛重","BRGEW"),

    /**
     * netWeight 净重 NTGEW
     */
    netWeight("净重","NTGEW"),

    /**
     * weightUnit 重量单位 GEWEI
     */
    weightUnit("重量单位","GEWEI"),

    /**
     * baseUnit 基本单位 MEINS
     */
    baseUnit("基本单位","MEINS"),

    /**
     * isDel X表示删除 LVORM
     */
    isDel("X表示删除","LVORM"),

    /**
     * isConfigurable 物料是否可配置 KZKFG
     */
    isConfigurable("物料是否可配置","KZKFG"),

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

    ItemTransEnum(String desc, String sapParam) {
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
