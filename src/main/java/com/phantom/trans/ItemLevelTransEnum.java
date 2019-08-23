package com.phantom.trans;

public enum ItemLevelTransEnum {

    /**
     * levelCode 产品层次 PRODH
     */
    levelCode("产品层次", "PRODH"),

    /**
     * levelNo 产品层次中的层号 STUFE
     */
    levelNo("产品层次中的层号", "STUFE"),

    /**
     * levelDesc 描述 VTEXT
     */
    levelDesc("描述", "VTEXT"),

    /**
     * levelEnd 是否最末级(1:最末级;0:非最末级) ENDH
     */
    levelEnd("是否最末级", "ENDH"),

    /**
     * levelDataOpt 数据处理方式(A-新增;M-修改;D-删除) METHOD
     */
    levelDataOpt("数据处理方式", "METHOD");

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

    ItemLevelTransEnum(String desc, String sapParam) {
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
