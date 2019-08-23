package com.phantom.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * T_CO_ITEM
 *
 * @author
 */
public class TCoItem implements Serializable {
    private String ID;

    /**
     * itemCode 物料号 MATNR
     */
    private String CI_ITEM_CODE;

    /**
     * itemName 物料描述 MAKTX
     */
    private String CI_ITEM_NAME;

    /**
     * 物料规格
     */
    private String CI_ITEM_SPEC;

    /**
     * 原材批次
     */
    private String RAW_LOTNUMBER;

    /**
     * 存货代码
     */
    private String STOCK_CODE;

    /**
     * 重量单位
     */
    private String SAP_WEIGHT_UNIT;

    /**
     * 是否删除
     */
    private String SAP_IS_DEL;

    /**
     * 基本单位
     */
    private String SAP_BASE_UNIT;

    /**
     * 调试号码
     */
    private String SAP_COLOR_CODE;

    /**
     * 产品层级
     */
    private String SAP_LEVEL_GROUP;

    /**
     * 毛重
     */
    private String SAP_GROSS_WEIGHT;

    /**
     * 净重
     */
    private String SAP_NET_WEIGHT;

    /**
     * 物料是否可配置
     */
    private String SAP_IS_CONFIG;


    /**
     * 备注
     */
    private String CI_MEMO;

    /**
     * 部门
     */
    private String DEPT_ID;

    /**
     * 创建人
     */
    private String CREATE_USER;

    /**
     * 创建时间
     */
    private Date CREATE_TIME;

    /**
     * 修改人
     */
    private String EDIT_USER;

    /**
     * 修改时间
     */
    private Date EDIT_TIME;

    /**
     * 组织机构
     */
    private String DATA_AUTH;


//--------------------------------------------------------------


    /**
     * 自制/采购
     */
    private String CI_ITEM_SOURCE;

    /**
     * 物料组
     */
    private String CI_GROUP_ID;

    /**
     * 物料类别（电容/电阻/电感）
     */
    private String CI_ITEM_GENRE;

    /**
     * 物料类型（原料/半成品/成品）
     */
    private String CI_ITEM_TYPE;

    /**
     * 供应商代码
     */
    private String CI_SUPPLIER_CODE;

    /**
     * 客户代码
     */
    private String CI_CUST_CODE;

    /**
     * 最小包装量
     */
    private BigDecimal CI_MIN_PACK;

    /**
     * 单位
     */
    private String CI_UNIT;

    /**
     * 联板数
     */
    private BigDecimal CI_LINK_NUM;

    /**
     * 条码拼板数
     */
    private BigDecimal CI_JIGSAW_NUM;

    /**
     * 供料器尺寸
     */
    private String CI_FEEDER_SIZE;

    /**
     * 封装类型
     */
    private String CI_PACK_TYPE;

    /**
     * 喷码标准工时
     */
    private BigDecimal CI_PRINT_TIME;

    /**
     * 标准上料角度
     */
    private BigDecimal CI_FEED_ANGLE;

    /**
     * 质保期
     */
    private BigDecimal CI_STOCK_CYCLE;

    /**
     * 过期提醒时间
     */
    private BigDecimal CI_CYCLE_REMIND;

    /**
     * 送检批量
     */
    private BigDecimal CI_FQC_QTY;

    /**
     * 自动送检FQC(Y/N)
     */
    private String CI_AUTO_FQC;

    /**
     * 是否免检(Y/N)
     */
    private String CI_IQC_FREE;

    /**
     * 不良直接报废标志(Y/N)
     */
    private String CI_SCRAP_FLAG;

    /**
     * 最小安全库存
     */
    private BigDecimal CI_MIN_STOCK;

    /**
     * 最大安全库存
     */
    private BigDecimal CI_MAX_STOCK;

    /**
     * 产标标准重量
     */
    private BigDecimal CI_STANDARD_WEIGHTS;

    /**
     * 满箱重量
     */
    private BigDecimal CI_FULL_WEIGHTS;

    /**
     * 封样测试标志(Y/N)
     */
    private String CI_TEST_FALG;

    /**
     * 封样测试单位
     */
    private String CI_TEST_UNIT;

    /**
     * 阻容上限
     */
    private BigDecimal CI_TEST_MAX;

    /**
     * 阻容下限
     */
    private BigDecimal CI_TEST_MIN;

    /**
     * MSD管控标志(Y/N)
     */
    private String CI_MSD_FLAG;

    /**
     * MSD规则ID
     */
    private String CI_MSD_ID;

    /**
     * RoHS标志
     */
    private String CI_ROHS_FLAG;

    /**
     * 客户料号
     */
    private String CI_CUST_ITEM;

    /**
     * PCB标志
     */
    private String CI_PCB_FLAG;

    /**
     * 大板条码规则
     */
    private String CI_SN_RULE_B;

    /**
     * 小板条码规则
     */
    private String CI_SN_RULE_S;

    /**
     * 体积
     */
    private BigDecimal CI_SIZE;

    /**
     * 维修上限次数
     */
    private BigDecimal CI_REPAIR_MAX;

    /**
     * 管控类型(0个体,1批次)
     */
    private String CI_CONTRAL_TYPE;

    /**
     * 复检周期
     */
    private BigDecimal CI_RECHECK_DAYS;

    /**
     * 复检提醒天数
     */
    private BigDecimal CI_REMIND_DAYS;

    /**
     * 超收标志(Y/N)
     */
    private String CI_EXCESS_RECEIVE;

    /**
     * 超发标志(Y/N)
     */
    private String CI_EXCESS_PICK;

    /**
     * 老化时间
     */
    private BigDecimal CI_AGING_TIME;

    /**
     * 呆滞周期
     */
    private BigDecimal CI_SLUGGISH_CYCLE;

    /**
     * 料盘尺寸
     */
    private String CI_ITEM_SIZE;

    /**
     * 存储期
     */
    private BigDecimal CI_STOCK_PERIOD;

    /**
     * 继续存储期
     */
    private BigDecimal CI_STOCK_PERIOD_KEEP;

    /**
     * 超收比率
     */
    private BigDecimal CI_OVERRATE;

    /**
     * 制造商
     */
    private String CI_MANUFACTURER;

    /**
     * 制造商型号
     */
    private String CI_MANUFACTURER_MODEL;

    /**
     * 3C标志
     */
    private String CI_3C_FLAG;

    /**
     * 样品承认书编码
     */
    private String SAMPLE_CODE;

    /**
     * 物料A/B/C类
     */
    private String ABC_TYPE;

    /**
     * 是否代管
     */
    private String CI_IS_ESCROW;

    /**
     * 产品条码规则
     */
    private String CI_SN_RULE;

    private static final long serialVersionUID = 1L;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCI_ITEM_CODE() {
        return CI_ITEM_CODE;
    }

    public void setCI_ITEM_CODE(String CI_ITEM_CODE) {
        this.CI_ITEM_CODE = CI_ITEM_CODE;
    }

    public String getCI_ITEM_NAME() {
        return CI_ITEM_NAME;
    }

    public void setCI_ITEM_NAME(String CI_ITEM_NAME) {
        this.CI_ITEM_NAME = CI_ITEM_NAME;
    }

    public String getCI_ITEM_SPEC() {
        return CI_ITEM_SPEC;
    }

    public void setCI_ITEM_SPEC(String CI_ITEM_SPEC) {
        this.CI_ITEM_SPEC = CI_ITEM_SPEC;
    }

    public String getCI_ITEM_SOURCE() {
        return CI_ITEM_SOURCE;
    }

    public void setCI_ITEM_SOURCE(String CI_ITEM_SOURCE) {
        this.CI_ITEM_SOURCE = CI_ITEM_SOURCE;
    }

    public String getCI_GROUP_ID() {
        return CI_GROUP_ID;
    }

    public void setCI_GROUP_ID(String CI_GROUP_ID) {
        this.CI_GROUP_ID = CI_GROUP_ID;
    }

    public String getCI_ITEM_GENRE() {
        return CI_ITEM_GENRE;
    }

    public void setCI_ITEM_GENRE(String CI_ITEM_GENRE) {
        this.CI_ITEM_GENRE = CI_ITEM_GENRE;
    }

    public String getCI_ITEM_TYPE() {
        return CI_ITEM_TYPE;
    }

    public void setCI_ITEM_TYPE(String CI_ITEM_TYPE) {
        this.CI_ITEM_TYPE = CI_ITEM_TYPE;
    }

    public String getCI_SUPPLIER_CODE() {
        return CI_SUPPLIER_CODE;
    }

    public void setCI_SUPPLIER_CODE(String CI_SUPPLIER_CODE) {
        this.CI_SUPPLIER_CODE = CI_SUPPLIER_CODE;
    }

    public String getCI_CUST_CODE() {
        return CI_CUST_CODE;
    }

    public void setCI_CUST_CODE(String CI_CUST_CODE) {
        this.CI_CUST_CODE = CI_CUST_CODE;
    }

    public BigDecimal getCI_MIN_PACK() {
        return CI_MIN_PACK;
    }

    public void setCI_MIN_PACK(BigDecimal CI_MIN_PACK) {
        this.CI_MIN_PACK = CI_MIN_PACK;
    }

    public String getCI_UNIT() {
        return CI_UNIT;
    }

    public void setCI_UNIT(String CI_UNIT) {
        this.CI_UNIT = CI_UNIT;
    }

    public BigDecimal getCI_LINK_NUM() {
        return CI_LINK_NUM;
    }

    public void setCI_LINK_NUM(BigDecimal CI_LINK_NUM) {
        this.CI_LINK_NUM = CI_LINK_NUM;
    }

    public BigDecimal getCI_JIGSAW_NUM() {
        return CI_JIGSAW_NUM;
    }

    public void setCI_JIGSAW_NUM(BigDecimal CI_JIGSAW_NUM) {
        this.CI_JIGSAW_NUM = CI_JIGSAW_NUM;
    }

    public String getCI_FEEDER_SIZE() {
        return CI_FEEDER_SIZE;
    }

    public void setCI_FEEDER_SIZE(String CI_FEEDER_SIZE) {
        this.CI_FEEDER_SIZE = CI_FEEDER_SIZE;
    }

    public String getCI_PACK_TYPE() {
        return CI_PACK_TYPE;
    }

    public void setCI_PACK_TYPE(String CI_PACK_TYPE) {
        this.CI_PACK_TYPE = CI_PACK_TYPE;
    }

    public BigDecimal getCI_PRINT_TIME() {
        return CI_PRINT_TIME;
    }

    public void setCI_PRINT_TIME(BigDecimal CI_PRINT_TIME) {
        this.CI_PRINT_TIME = CI_PRINT_TIME;
    }

    public BigDecimal getCI_FEED_ANGLE() {
        return CI_FEED_ANGLE;
    }

    public void setCI_FEED_ANGLE(BigDecimal CI_FEED_ANGLE) {
        this.CI_FEED_ANGLE = CI_FEED_ANGLE;
    }

    public BigDecimal getCI_STOCK_CYCLE() {
        return CI_STOCK_CYCLE;
    }

    public void setCI_STOCK_CYCLE(BigDecimal CI_STOCK_CYCLE) {
        this.CI_STOCK_CYCLE = CI_STOCK_CYCLE;
    }

    public BigDecimal getCI_CYCLE_REMIND() {
        return CI_CYCLE_REMIND;
    }

    public void setCI_CYCLE_REMIND(BigDecimal CI_CYCLE_REMIND) {
        this.CI_CYCLE_REMIND = CI_CYCLE_REMIND;
    }

    public BigDecimal getCI_FQC_QTY() {
        return CI_FQC_QTY;
    }

    public void setCI_FQC_QTY(BigDecimal CI_FQC_QTY) {
        this.CI_FQC_QTY = CI_FQC_QTY;
    }

    public String getCI_AUTO_FQC() {
        return CI_AUTO_FQC;
    }

    public void setCI_AUTO_FQC(String CI_AUTO_FQC) {
        this.CI_AUTO_FQC = CI_AUTO_FQC;
    }

    public String getCI_IQC_FREE() {
        return CI_IQC_FREE;
    }

    public void setCI_IQC_FREE(String CI_IQC_FREE) {
        this.CI_IQC_FREE = CI_IQC_FREE;
    }

    public String getCI_SCRAP_FLAG() {
        return CI_SCRAP_FLAG;
    }

    public void setCI_SCRAP_FLAG(String CI_SCRAP_FLAG) {
        this.CI_SCRAP_FLAG = CI_SCRAP_FLAG;
    }

    public BigDecimal getCI_MIN_STOCK() {
        return CI_MIN_STOCK;
    }

    public void setCI_MIN_STOCK(BigDecimal CI_MIN_STOCK) {
        this.CI_MIN_STOCK = CI_MIN_STOCK;
    }

    public BigDecimal getCI_MAX_STOCK() {
        return CI_MAX_STOCK;
    }

    public void setCI_MAX_STOCK(BigDecimal CI_MAX_STOCK) {
        this.CI_MAX_STOCK = CI_MAX_STOCK;
    }

    public BigDecimal getCI_STANDARD_WEIGHTS() {
        return CI_STANDARD_WEIGHTS;
    }

    public void setCI_STANDARD_WEIGHTS(BigDecimal CI_STANDARD_WEIGHTS) {
        this.CI_STANDARD_WEIGHTS = CI_STANDARD_WEIGHTS;
    }

    public BigDecimal getCI_FULL_WEIGHTS() {
        return CI_FULL_WEIGHTS;
    }

    public void setCI_FULL_WEIGHTS(BigDecimal CI_FULL_WEIGHTS) {
        this.CI_FULL_WEIGHTS = CI_FULL_WEIGHTS;
    }

    public String getCI_TEST_FALG() {
        return CI_TEST_FALG;
    }

    public void setCI_TEST_FALG(String CI_TEST_FALG) {
        this.CI_TEST_FALG = CI_TEST_FALG;
    }

    public String getCI_TEST_UNIT() {
        return CI_TEST_UNIT;
    }

    public void setCI_TEST_UNIT(String CI_TEST_UNIT) {
        this.CI_TEST_UNIT = CI_TEST_UNIT;
    }

    public BigDecimal getCI_TEST_MAX() {
        return CI_TEST_MAX;
    }

    public void setCI_TEST_MAX(BigDecimal CI_TEST_MAX) {
        this.CI_TEST_MAX = CI_TEST_MAX;
    }

    public BigDecimal getCI_TEST_MIN() {
        return CI_TEST_MIN;
    }

    public void setCI_TEST_MIN(BigDecimal CI_TEST_MIN) {
        this.CI_TEST_MIN = CI_TEST_MIN;
    }

    public String getCI_MSD_FLAG() {
        return CI_MSD_FLAG;
    }

    public void setCI_MSD_FLAG(String CI_MSD_FLAG) {
        this.CI_MSD_FLAG = CI_MSD_FLAG;
    }

    public String getCI_MSD_ID() {
        return CI_MSD_ID;
    }

    public void setCI_MSD_ID(String CI_MSD_ID) {
        this.CI_MSD_ID = CI_MSD_ID;
    }

    public String getCI_ROHS_FLAG() {
        return CI_ROHS_FLAG;
    }

    public void setCI_ROHS_FLAG(String CI_ROHS_FLAG) {
        this.CI_ROHS_FLAG = CI_ROHS_FLAG;
    }

    public String getCI_CUST_ITEM() {
        return CI_CUST_ITEM;
    }

    public void setCI_CUST_ITEM(String CI_CUST_ITEM) {
        this.CI_CUST_ITEM = CI_CUST_ITEM;
    }

    public String getCI_PCB_FLAG() {
        return CI_PCB_FLAG;
    }

    public void setCI_PCB_FLAG(String CI_PCB_FLAG) {
        this.CI_PCB_FLAG = CI_PCB_FLAG;
    }

    public String getCI_MEMO() {
        return CI_MEMO;
    }

    public void setCI_MEMO(String CI_MEMO) {
        this.CI_MEMO = CI_MEMO;
    }

    public String getDEPT_ID() {
        return DEPT_ID;
    }

    public void setDEPT_ID(String DEPT_ID) {
        this.DEPT_ID = DEPT_ID;
    }

    public String getCREATE_USER() {
        return CREATE_USER;
    }

    public void setCREATE_USER(String CREATE_USER) {
        this.CREATE_USER = CREATE_USER;
    }

    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public String getEDIT_USER() {
        return EDIT_USER;
    }

    public void setEDIT_USER(String EDIT_USER) {
        this.EDIT_USER = EDIT_USER;
    }

    public Date getEDIT_TIME() {
        return EDIT_TIME;
    }

    public void setEDIT_TIME(Date EDIT_TIME) {
        this.EDIT_TIME = EDIT_TIME;
    }

    public String getCI_SN_RULE_B() {
        return CI_SN_RULE_B;
    }

    public void setCI_SN_RULE_B(String CI_SN_RULE_B) {
        this.CI_SN_RULE_B = CI_SN_RULE_B;
    }

    public String getCI_SN_RULE_S() {
        return CI_SN_RULE_S;
    }

    public void setCI_SN_RULE_S(String CI_SN_RULE_S) {
        this.CI_SN_RULE_S = CI_SN_RULE_S;
    }

    public BigDecimal getCI_SIZE() {
        return CI_SIZE;
    }

    public void setCI_SIZE(BigDecimal CI_SIZE) {
        this.CI_SIZE = CI_SIZE;
    }

    public BigDecimal getCI_REPAIR_MAX() {
        return CI_REPAIR_MAX;
    }

    public void setCI_REPAIR_MAX(BigDecimal CI_REPAIR_MAX) {
        this.CI_REPAIR_MAX = CI_REPAIR_MAX;
    }

    public String getCI_CONTRAL_TYPE() {
        return CI_CONTRAL_TYPE;
    }

    public void setCI_CONTRAL_TYPE(String CI_CONTRAL_TYPE) {
        this.CI_CONTRAL_TYPE = CI_CONTRAL_TYPE;
    }

    public String getDATA_AUTH() {
        return DATA_AUTH;
    }

    public void setDATA_AUTH(String DATA_AUTH) {
        this.DATA_AUTH = DATA_AUTH;
    }

    public BigDecimal getCI_RECHECK_DAYS() {
        return CI_RECHECK_DAYS;
    }

    public void setCI_RECHECK_DAYS(BigDecimal CI_RECHECK_DAYS) {
        this.CI_RECHECK_DAYS = CI_RECHECK_DAYS;
    }

    public BigDecimal getCI_REMIND_DAYS() {
        return CI_REMIND_DAYS;
    }

    public void setCI_REMIND_DAYS(BigDecimal CI_REMIND_DAYS) {
        this.CI_REMIND_DAYS = CI_REMIND_DAYS;
    }

    public String getCI_EXCESS_RECEIVE() {
        return CI_EXCESS_RECEIVE;
    }

    public void setCI_EXCESS_RECEIVE(String CI_EXCESS_RECEIVE) {
        this.CI_EXCESS_RECEIVE = CI_EXCESS_RECEIVE;
    }

    public String getCI_EXCESS_PICK() {
        return CI_EXCESS_PICK;
    }

    public void setCI_EXCESS_PICK(String CI_EXCESS_PICK) {
        this.CI_EXCESS_PICK = CI_EXCESS_PICK;
    }

    public BigDecimal getCI_AGING_TIME() {
        return CI_AGING_TIME;
    }

    public void setCI_AGING_TIME(BigDecimal CI_AGING_TIME) {
        this.CI_AGING_TIME = CI_AGING_TIME;
    }

    public BigDecimal getCI_SLUGGISH_CYCLE() {
        return CI_SLUGGISH_CYCLE;
    }

    public void setCI_SLUGGISH_CYCLE(BigDecimal CI_SLUGGISH_CYCLE) {
        this.CI_SLUGGISH_CYCLE = CI_SLUGGISH_CYCLE;
    }

    public String getCI_ITEM_SIZE() {
        return CI_ITEM_SIZE;
    }

    public void setCI_ITEM_SIZE(String CI_ITEM_SIZE) {
        this.CI_ITEM_SIZE = CI_ITEM_SIZE;
    }

    public BigDecimal getCI_STOCK_PERIOD() {
        return CI_STOCK_PERIOD;
    }

    public void setCI_STOCK_PERIOD(BigDecimal CI_STOCK_PERIOD) {
        this.CI_STOCK_PERIOD = CI_STOCK_PERIOD;
    }

    public BigDecimal getCI_STOCK_PERIOD_KEEP() {
        return CI_STOCK_PERIOD_KEEP;
    }

    public void setCI_STOCK_PERIOD_KEEP(BigDecimal CI_STOCK_PERIOD_KEEP) {
        this.CI_STOCK_PERIOD_KEEP = CI_STOCK_PERIOD_KEEP;
    }

    public BigDecimal getCI_OVERRATE() {
        return CI_OVERRATE;
    }

    public void setCI_OVERRATE(BigDecimal CI_OVERRATE) {
        this.CI_OVERRATE = CI_OVERRATE;
    }

    public String getCI_MANUFACTURER() {
        return CI_MANUFACTURER;
    }

    public void setCI_MANUFACTURER(String CI_MANUFACTURER) {
        this.CI_MANUFACTURER = CI_MANUFACTURER;
    }

    public String getCI_MANUFACTURER_MODEL() {
        return CI_MANUFACTURER_MODEL;
    }

    public void setCI_MANUFACTURER_MODEL(String CI_MANUFACTURER_MODEL) {
        this.CI_MANUFACTURER_MODEL = CI_MANUFACTURER_MODEL;
    }

    public String getCI_3C_FLAG() {
        return CI_3C_FLAG;
    }

    public void setCI_3C_FLAG(String CI_3C_FLAG) {
        this.CI_3C_FLAG = CI_3C_FLAG;
    }

    public String getSAMPLE_CODE() {
        return SAMPLE_CODE;
    }

    public void setSAMPLE_CODE(String SAMPLE_CODE) {
        this.SAMPLE_CODE = SAMPLE_CODE;
    }

    public String getABC_TYPE() {
        return ABC_TYPE;
    }

    public void setABC_TYPE(String ABC_TYPE) {
        this.ABC_TYPE = ABC_TYPE;
    }

    public String getCI_IS_ESCROW() {
        return CI_IS_ESCROW;
    }

    public void setCI_IS_ESCROW(String CI_IS_ESCROW) {
        this.CI_IS_ESCROW = CI_IS_ESCROW;
    }

    public String getCI_SN_RULE() {
        return CI_SN_RULE;
    }

    public void setCI_SN_RULE(String CI_SN_RULE) {
        this.CI_SN_RULE = CI_SN_RULE;
    }

    public String getRAW_LOTNUMBER() {
        return RAW_LOTNUMBER;
    }

    public void setRAW_LOTNUMBER(String RAW_LOTNUMBER) {
        this.RAW_LOTNUMBER = RAW_LOTNUMBER;
    }

    public String getSTOCK_CODE() {
        return STOCK_CODE;
    }

    public void setSTOCK_CODE(String STOCK_CODE) {
        this.STOCK_CODE = STOCK_CODE;
    }

    public String getSAP_WEIGHT_UNIT() {
        return SAP_WEIGHT_UNIT;
    }

    public void setSAP_WEIGHT_UNIT(String SAP_WEIGHT_UNIT) {
        this.SAP_WEIGHT_UNIT = SAP_WEIGHT_UNIT;
    }

    public String getSAP_IS_DEL() {
        return SAP_IS_DEL;
    }

    public void setSAP_IS_DEL(String SAP_IS_DEL) {
        this.SAP_IS_DEL = SAP_IS_DEL;
    }

    public String getSAP_BASE_UNIT() {
        return SAP_BASE_UNIT;
    }

    public void setSAP_BASE_UNIT(String SAP_BASE_UNIT) {
        this.SAP_BASE_UNIT = SAP_BASE_UNIT;
    }

    public String getSAP_COLOR_CODE() {
        return SAP_COLOR_CODE;
    }

    public void setSAP_COLOR_CODE(String SAP_COLOR_CODE) {
        this.SAP_COLOR_CODE = SAP_COLOR_CODE;
    }

    public String getSAP_LEVEL_GROUP() {
        return SAP_LEVEL_GROUP;
    }

    public void setSAP_LEVEL_GROUP(String SAP_LEVEL_GROUP) {
        this.SAP_LEVEL_GROUP = SAP_LEVEL_GROUP;
    }

    public String getSAP_GROSS_WEIGHT() {
        return SAP_GROSS_WEIGHT;
    }

    public void setSAP_GROSS_WEIGHT(String SAP_GROSS_WEIGHT) {
        this.SAP_GROSS_WEIGHT = SAP_GROSS_WEIGHT;
    }

    public String getSAP_NET_WEIGHT() {
        return SAP_NET_WEIGHT;
    }

    public void setSAP_NET_WEIGHT(String SAP_NET_WEIGHT) {
        this.SAP_NET_WEIGHT = SAP_NET_WEIGHT;
    }

    public String getSAP_IS_CONFIG() {
        return SAP_IS_CONFIG;
    }

    public void setSAP_IS_CONFIG(String SAP_IS_CONFIG) {
        this.SAP_IS_CONFIG = SAP_IS_CONFIG;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TCoItem other = (TCoItem) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
                && (this.getCI_ITEM_CODE() == null ? other.getCI_ITEM_CODE() == null : this.getCI_ITEM_CODE().equals(other.getCI_ITEM_CODE()))
                && (this.getCI_ITEM_NAME() == null ? other.getCI_ITEM_NAME() == null : this.getCI_ITEM_NAME().equals(other.getCI_ITEM_NAME()))
                && (this.getCI_ITEM_SPEC() == null ? other.getCI_ITEM_SPEC() == null : this.getCI_ITEM_SPEC().equals(other.getCI_ITEM_SPEC()))
                && (this.getCI_ITEM_SOURCE() == null ? other.getCI_ITEM_SOURCE() == null : this.getCI_ITEM_SOURCE().equals(other.getCI_ITEM_SOURCE()))
                && (this.getCI_GROUP_ID() == null ? other.getCI_GROUP_ID() == null : this.getCI_GROUP_ID().equals(other.getCI_GROUP_ID()))
                && (this.getCI_ITEM_GENRE() == null ? other.getCI_ITEM_GENRE() == null : this.getCI_ITEM_GENRE().equals(other.getCI_ITEM_GENRE()))
                && (this.getCI_ITEM_TYPE() == null ? other.getCI_ITEM_TYPE() == null : this.getCI_ITEM_TYPE().equals(other.getCI_ITEM_TYPE()))
                && (this.getCI_SUPPLIER_CODE() == null ? other.getCI_SUPPLIER_CODE() == null : this.getCI_SUPPLIER_CODE().equals(other.getCI_SUPPLIER_CODE()))
                && (this.getCI_CUST_CODE() == null ? other.getCI_CUST_CODE() == null : this.getCI_CUST_CODE().equals(other.getCI_CUST_CODE()))
                && (this.getCI_MIN_PACK() == null ? other.getCI_MIN_PACK() == null : this.getCI_MIN_PACK().equals(other.getCI_MIN_PACK()))
                && (this.getCI_UNIT() == null ? other.getCI_UNIT() == null : this.getCI_UNIT().equals(other.getCI_UNIT()))
                && (this.getCI_LINK_NUM() == null ? other.getCI_LINK_NUM() == null : this.getCI_LINK_NUM().equals(other.getCI_LINK_NUM()))
                && (this.getCI_JIGSAW_NUM() == null ? other.getCI_JIGSAW_NUM() == null : this.getCI_JIGSAW_NUM().equals(other.getCI_JIGSAW_NUM()))
                && (this.getCI_FEEDER_SIZE() == null ? other.getCI_FEEDER_SIZE() == null : this.getCI_FEEDER_SIZE().equals(other.getCI_FEEDER_SIZE()))
                && (this.getCI_PACK_TYPE() == null ? other.getCI_PACK_TYPE() == null : this.getCI_PACK_TYPE().equals(other.getCI_PACK_TYPE()))
                && (this.getCI_PRINT_TIME() == null ? other.getCI_PRINT_TIME() == null : this.getCI_PRINT_TIME().equals(other.getCI_PRINT_TIME()))
                && (this.getCI_FEED_ANGLE() == null ? other.getCI_FEED_ANGLE() == null : this.getCI_FEED_ANGLE().equals(other.getCI_FEED_ANGLE()))
                && (this.getCI_STOCK_CYCLE() == null ? other.getCI_STOCK_CYCLE() == null : this.getCI_STOCK_CYCLE().equals(other.getCI_STOCK_CYCLE()))
                && (this.getCI_CYCLE_REMIND() == null ? other.getCI_CYCLE_REMIND() == null : this.getCI_CYCLE_REMIND().equals(other.getCI_CYCLE_REMIND()))
                && (this.getCI_FQC_QTY() == null ? other.getCI_FQC_QTY() == null : this.getCI_FQC_QTY().equals(other.getCI_FQC_QTY()))
                && (this.getCI_AUTO_FQC() == null ? other.getCI_AUTO_FQC() == null : this.getCI_AUTO_FQC().equals(other.getCI_AUTO_FQC()))
                && (this.getCI_IQC_FREE() == null ? other.getCI_IQC_FREE() == null : this.getCI_IQC_FREE().equals(other.getCI_IQC_FREE()))
                && (this.getCI_SCRAP_FLAG() == null ? other.getCI_SCRAP_FLAG() == null : this.getCI_SCRAP_FLAG().equals(other.getCI_SCRAP_FLAG()))
                && (this.getCI_MIN_STOCK() == null ? other.getCI_MIN_STOCK() == null : this.getCI_MIN_STOCK().equals(other.getCI_MIN_STOCK()))
                && (this.getCI_MAX_STOCK() == null ? other.getCI_MAX_STOCK() == null : this.getCI_MAX_STOCK().equals(other.getCI_MAX_STOCK()))
                && (this.getCI_STANDARD_WEIGHTS() == null ? other.getCI_STANDARD_WEIGHTS() == null : this.getCI_STANDARD_WEIGHTS().equals(other.getCI_STANDARD_WEIGHTS()))
                && (this.getCI_FULL_WEIGHTS() == null ? other.getCI_FULL_WEIGHTS() == null : this.getCI_FULL_WEIGHTS().equals(other.getCI_FULL_WEIGHTS()))
                && (this.getCI_TEST_FALG() == null ? other.getCI_TEST_FALG() == null : this.getCI_TEST_FALG().equals(other.getCI_TEST_FALG()))
                && (this.getCI_TEST_UNIT() == null ? other.getCI_TEST_UNIT() == null : this.getCI_TEST_UNIT().equals(other.getCI_TEST_UNIT()))
                && (this.getCI_TEST_MAX() == null ? other.getCI_TEST_MAX() == null : this.getCI_TEST_MAX().equals(other.getCI_TEST_MAX()))
                && (this.getCI_TEST_MIN() == null ? other.getCI_TEST_MIN() == null : this.getCI_TEST_MIN().equals(other.getCI_TEST_MIN()))
                && (this.getCI_MSD_FLAG() == null ? other.getCI_MSD_FLAG() == null : this.getCI_MSD_FLAG().equals(other.getCI_MSD_FLAG()))
                && (this.getCI_MSD_ID() == null ? other.getCI_MSD_ID() == null : this.getCI_MSD_ID().equals(other.getCI_MSD_ID()))
                && (this.getCI_ROHS_FLAG() == null ? other.getCI_ROHS_FLAG() == null : this.getCI_ROHS_FLAG().equals(other.getCI_ROHS_FLAG()))
                && (this.getCI_CUST_ITEM() == null ? other.getCI_CUST_ITEM() == null : this.getCI_CUST_ITEM().equals(other.getCI_CUST_ITEM()))
                && (this.getCI_PCB_FLAG() == null ? other.getCI_PCB_FLAG() == null : this.getCI_PCB_FLAG().equals(other.getCI_PCB_FLAG()))
                && (this.getCI_MEMO() == null ? other.getCI_MEMO() == null : this.getCI_MEMO().equals(other.getCI_MEMO()))
                && (this.getDEPT_ID() == null ? other.getDEPT_ID() == null : this.getDEPT_ID().equals(other.getDEPT_ID()))
                && (this.getCREATE_USER() == null ? other.getCREATE_USER() == null : this.getCREATE_USER().equals(other.getCREATE_USER()))
                && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
                && (this.getEDIT_USER() == null ? other.getEDIT_USER() == null : this.getEDIT_USER().equals(other.getEDIT_USER()))
                && (this.getEDIT_TIME() == null ? other.getEDIT_TIME() == null : this.getEDIT_TIME().equals(other.getEDIT_TIME()))
                && (this.getCI_SN_RULE_B() == null ? other.getCI_SN_RULE_B() == null : this.getCI_SN_RULE_B().equals(other.getCI_SN_RULE_B()))
                && (this.getCI_SN_RULE_S() == null ? other.getCI_SN_RULE_S() == null : this.getCI_SN_RULE_S().equals(other.getCI_SN_RULE_S()))
                && (this.getCI_SIZE() == null ? other.getCI_SIZE() == null : this.getCI_SIZE().equals(other.getCI_SIZE()))
                && (this.getCI_REPAIR_MAX() == null ? other.getCI_REPAIR_MAX() == null : this.getCI_REPAIR_MAX().equals(other.getCI_REPAIR_MAX()))
                && (this.getCI_CONTRAL_TYPE() == null ? other.getCI_CONTRAL_TYPE() == null : this.getCI_CONTRAL_TYPE().equals(other.getCI_CONTRAL_TYPE()))
                && (this.getDATA_AUTH() == null ? other.getDATA_AUTH() == null : this.getDATA_AUTH().equals(other.getDATA_AUTH()))
                && (this.getCI_RECHECK_DAYS() == null ? other.getCI_RECHECK_DAYS() == null : this.getCI_RECHECK_DAYS().equals(other.getCI_RECHECK_DAYS()))
                && (this.getCI_REMIND_DAYS() == null ? other.getCI_REMIND_DAYS() == null : this.getCI_REMIND_DAYS().equals(other.getCI_REMIND_DAYS()))
                && (this.getCI_EXCESS_RECEIVE() == null ? other.getCI_EXCESS_RECEIVE() == null : this.getCI_EXCESS_RECEIVE().equals(other.getCI_EXCESS_RECEIVE()))
                && (this.getCI_EXCESS_PICK() == null ? other.getCI_EXCESS_PICK() == null : this.getCI_EXCESS_PICK().equals(other.getCI_EXCESS_PICK()))
                && (this.getCI_AGING_TIME() == null ? other.getCI_AGING_TIME() == null : this.getCI_AGING_TIME().equals(other.getCI_AGING_TIME()))
                && (this.getCI_SLUGGISH_CYCLE() == null ? other.getCI_SLUGGISH_CYCLE() == null : this.getCI_SLUGGISH_CYCLE().equals(other.getCI_SLUGGISH_CYCLE()))
                && (this.getCI_ITEM_SIZE() == null ? other.getCI_ITEM_SIZE() == null : this.getCI_ITEM_SIZE().equals(other.getCI_ITEM_SIZE()))
                && (this.getCI_STOCK_PERIOD() == null ? other.getCI_STOCK_PERIOD() == null : this.getCI_STOCK_PERIOD().equals(other.getCI_STOCK_PERIOD()))
                && (this.getCI_STOCK_PERIOD_KEEP() == null ? other.getCI_STOCK_PERIOD_KEEP() == null : this.getCI_STOCK_PERIOD_KEEP().equals(other.getCI_STOCK_PERIOD_KEEP()))
                && (this.getCI_OVERRATE() == null ? other.getCI_OVERRATE() == null : this.getCI_OVERRATE().equals(other.getCI_OVERRATE()))
                && (this.getCI_MANUFACTURER() == null ? other.getCI_MANUFACTURER() == null : this.getCI_MANUFACTURER().equals(other.getCI_MANUFACTURER()))
                && (this.getCI_MANUFACTURER_MODEL() == null ? other.getCI_MANUFACTURER_MODEL() == null : this.getCI_MANUFACTURER_MODEL().equals(other.getCI_MANUFACTURER_MODEL()))
                && (this.getCI_3C_FLAG() == null ? other.getCI_3C_FLAG() == null : this.getCI_3C_FLAG().equals(other.getCI_3C_FLAG()))
                && (this.getSAMPLE_CODE() == null ? other.getSAMPLE_CODE() == null : this.getSAMPLE_CODE().equals(other.getSAMPLE_CODE()))
                && (this.getABC_TYPE() == null ? other.getABC_TYPE() == null : this.getABC_TYPE().equals(other.getABC_TYPE()))
                && (this.getCI_IS_ESCROW() == null ? other.getCI_IS_ESCROW() == null : this.getCI_IS_ESCROW().equals(other.getCI_IS_ESCROW()))
                && (this.getCI_SN_RULE() == null ? other.getCI_SN_RULE() == null : this.getCI_SN_RULE().equals(other.getCI_SN_RULE()))
                && (this.getRAW_LOTNUMBER() == null ? other.getRAW_LOTNUMBER() == null : this.getRAW_LOTNUMBER().equals(other.getRAW_LOTNUMBER()))
                && (this.getSTOCK_CODE() == null ? other.getSTOCK_CODE() == null : this.getSTOCK_CODE().equals(other.getSTOCK_CODE()))
                && (this.getSAP_WEIGHT_UNIT() == null ? other.getSAP_WEIGHT_UNIT() == null : this.getSAP_WEIGHT_UNIT().equals(other.getSAP_WEIGHT_UNIT()))
                && (this.getSAP_IS_DEL() == null ? other.getSAP_IS_DEL() == null : this.getSAP_IS_DEL().equals(other.getSAP_IS_DEL()))
                && (this.getSAP_BASE_UNIT() == null ? other.getSAP_BASE_UNIT() == null : this.getSAP_BASE_UNIT().equals(other.getSAP_BASE_UNIT()))
                && (this.getSAP_COLOR_CODE() == null ? other.getSAP_COLOR_CODE() == null : this.getSAP_COLOR_CODE().equals(other.getSAP_COLOR_CODE()))
                && (this.getSAP_LEVEL_GROUP() == null ? other.getSAP_LEVEL_GROUP() == null : this.getSAP_LEVEL_GROUP().equals(other.getSAP_LEVEL_GROUP()))
                && (this.getSAP_GROSS_WEIGHT() == null ? other.getSAP_GROSS_WEIGHT() == null : this.getSAP_GROSS_WEIGHT().equals(other.getSAP_GROSS_WEIGHT()))
                && (this.getSAP_NET_WEIGHT() == null ? other.getSAP_NET_WEIGHT() == null : this.getSAP_NET_WEIGHT().equals(other.getSAP_NET_WEIGHT()))
                && (this.getSAP_IS_CONFIG() == null ? other.getSAP_IS_CONFIG() == null : this.getSAP_IS_CONFIG().equals(other.getSAP_IS_CONFIG()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getCI_ITEM_CODE() == null) ? 0 : getCI_ITEM_CODE().hashCode());
        result = prime * result + ((getCI_ITEM_NAME() == null) ? 0 : getCI_ITEM_NAME().hashCode());
        result = prime * result + ((getCI_ITEM_SPEC() == null) ? 0 : getCI_ITEM_SPEC().hashCode());
        result = prime * result + ((getCI_ITEM_SOURCE() == null) ? 0 : getCI_ITEM_SOURCE().hashCode());
        result = prime * result + ((getCI_GROUP_ID() == null) ? 0 : getCI_GROUP_ID().hashCode());
        result = prime * result + ((getCI_ITEM_GENRE() == null) ? 0 : getCI_ITEM_GENRE().hashCode());
        result = prime * result + ((getCI_ITEM_TYPE() == null) ? 0 : getCI_ITEM_TYPE().hashCode());
        result = prime * result + ((getCI_SUPPLIER_CODE() == null) ? 0 : getCI_SUPPLIER_CODE().hashCode());
        result = prime * result + ((getCI_CUST_CODE() == null) ? 0 : getCI_CUST_CODE().hashCode());
        result = prime * result + ((getCI_MIN_PACK() == null) ? 0 : getCI_MIN_PACK().hashCode());
        result = prime * result + ((getCI_UNIT() == null) ? 0 : getCI_UNIT().hashCode());
        result = prime * result + ((getCI_LINK_NUM() == null) ? 0 : getCI_LINK_NUM().hashCode());
        result = prime * result + ((getCI_JIGSAW_NUM() == null) ? 0 : getCI_JIGSAW_NUM().hashCode());
        result = prime * result + ((getCI_FEEDER_SIZE() == null) ? 0 : getCI_FEEDER_SIZE().hashCode());
        result = prime * result + ((getCI_PACK_TYPE() == null) ? 0 : getCI_PACK_TYPE().hashCode());
        result = prime * result + ((getCI_PRINT_TIME() == null) ? 0 : getCI_PRINT_TIME().hashCode());
        result = prime * result + ((getCI_FEED_ANGLE() == null) ? 0 : getCI_FEED_ANGLE().hashCode());
        result = prime * result + ((getCI_STOCK_CYCLE() == null) ? 0 : getCI_STOCK_CYCLE().hashCode());
        result = prime * result + ((getCI_CYCLE_REMIND() == null) ? 0 : getCI_CYCLE_REMIND().hashCode());
        result = prime * result + ((getCI_FQC_QTY() == null) ? 0 : getCI_FQC_QTY().hashCode());
        result = prime * result + ((getCI_AUTO_FQC() == null) ? 0 : getCI_AUTO_FQC().hashCode());
        result = prime * result + ((getCI_IQC_FREE() == null) ? 0 : getCI_IQC_FREE().hashCode());
        result = prime * result + ((getCI_SCRAP_FLAG() == null) ? 0 : getCI_SCRAP_FLAG().hashCode());
        result = prime * result + ((getCI_MIN_STOCK() == null) ? 0 : getCI_MIN_STOCK().hashCode());
        result = prime * result + ((getCI_MAX_STOCK() == null) ? 0 : getCI_MAX_STOCK().hashCode());
        result = prime * result + ((getCI_STANDARD_WEIGHTS() == null) ? 0 : getCI_STANDARD_WEIGHTS().hashCode());
        result = prime * result + ((getCI_FULL_WEIGHTS() == null) ? 0 : getCI_FULL_WEIGHTS().hashCode());
        result = prime * result + ((getCI_TEST_FALG() == null) ? 0 : getCI_TEST_FALG().hashCode());
        result = prime * result + ((getCI_TEST_UNIT() == null) ? 0 : getCI_TEST_UNIT().hashCode());
        result = prime * result + ((getCI_TEST_MAX() == null) ? 0 : getCI_TEST_MAX().hashCode());
        result = prime * result + ((getCI_TEST_MIN() == null) ? 0 : getCI_TEST_MIN().hashCode());
        result = prime * result + ((getCI_MSD_FLAG() == null) ? 0 : getCI_MSD_FLAG().hashCode());
        result = prime * result + ((getCI_MSD_ID() == null) ? 0 : getCI_MSD_ID().hashCode());
        result = prime * result + ((getCI_ROHS_FLAG() == null) ? 0 : getCI_ROHS_FLAG().hashCode());
        result = prime * result + ((getCI_CUST_ITEM() == null) ? 0 : getCI_CUST_ITEM().hashCode());
        result = prime * result + ((getCI_PCB_FLAG() == null) ? 0 : getCI_PCB_FLAG().hashCode());
        result = prime * result + ((getCI_MEMO() == null) ? 0 : getCI_MEMO().hashCode());
        result = prime * result + ((getDEPT_ID() == null) ? 0 : getDEPT_ID().hashCode());
        result = prime * result + ((getCREATE_USER() == null) ? 0 : getCREATE_USER().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getEDIT_USER() == null) ? 0 : getEDIT_USER().hashCode());
        result = prime * result + ((getEDIT_TIME() == null) ? 0 : getEDIT_TIME().hashCode());
        result = prime * result + ((getCI_SN_RULE_B() == null) ? 0 : getCI_SN_RULE_B().hashCode());
        result = prime * result + ((getCI_SN_RULE_S() == null) ? 0 : getCI_SN_RULE_S().hashCode());
        result = prime * result + ((getCI_SIZE() == null) ? 0 : getCI_SIZE().hashCode());
        result = prime * result + ((getCI_REPAIR_MAX() == null) ? 0 : getCI_REPAIR_MAX().hashCode());
        result = prime * result + ((getCI_CONTRAL_TYPE() == null) ? 0 : getCI_CONTRAL_TYPE().hashCode());
        result = prime * result + ((getDATA_AUTH() == null) ? 0 : getDATA_AUTH().hashCode());
        result = prime * result + ((getCI_RECHECK_DAYS() == null) ? 0 : getCI_RECHECK_DAYS().hashCode());
        result = prime * result + ((getCI_REMIND_DAYS() == null) ? 0 : getCI_REMIND_DAYS().hashCode());
        result = prime * result + ((getCI_EXCESS_RECEIVE() == null) ? 0 : getCI_EXCESS_RECEIVE().hashCode());
        result = prime * result + ((getCI_EXCESS_PICK() == null) ? 0 : getCI_EXCESS_PICK().hashCode());
        result = prime * result + ((getCI_AGING_TIME() == null) ? 0 : getCI_AGING_TIME().hashCode());
        result = prime * result + ((getCI_SLUGGISH_CYCLE() == null) ? 0 : getCI_SLUGGISH_CYCLE().hashCode());
        result = prime * result + ((getCI_ITEM_SIZE() == null) ? 0 : getCI_ITEM_SIZE().hashCode());
        result = prime * result + ((getCI_STOCK_PERIOD() == null) ? 0 : getCI_STOCK_PERIOD().hashCode());
        result = prime * result + ((getCI_STOCK_PERIOD_KEEP() == null) ? 0 : getCI_STOCK_PERIOD_KEEP().hashCode());
        result = prime * result + ((getCI_OVERRATE() == null) ? 0 : getCI_OVERRATE().hashCode());
        result = prime * result + ((getCI_MANUFACTURER() == null) ? 0 : getCI_MANUFACTURER().hashCode());
        result = prime * result + ((getCI_MANUFACTURER_MODEL() == null) ? 0 : getCI_MANUFACTURER_MODEL().hashCode());
        result = prime * result + ((getCI_3C_FLAG() == null) ? 0 : getCI_3C_FLAG().hashCode());
        result = prime * result + ((getSAMPLE_CODE() == null) ? 0 : getSAMPLE_CODE().hashCode());
        result = prime * result + ((getABC_TYPE() == null) ? 0 : getABC_TYPE().hashCode());
        result = prime * result + ((getCI_IS_ESCROW() == null) ? 0 : getCI_IS_ESCROW().hashCode());
        result = prime * result + ((getCI_SN_RULE() == null) ? 0 : getCI_SN_RULE().hashCode());
        result = prime * result + ((getRAW_LOTNUMBER() == null) ? 0 : getRAW_LOTNUMBER().hashCode());
        result = prime * result + ((getSTOCK_CODE() == null) ? 0 : getSTOCK_CODE().hashCode());
        result = prime * result + ((getSAP_WEIGHT_UNIT() == null) ? 0 : getSAP_WEIGHT_UNIT().hashCode());
        result = prime * result + ((getSAP_IS_DEL() == null) ? 0 : getSAP_IS_DEL().hashCode());
        result = prime * result + ((getSAP_BASE_UNIT() == null) ? 0 : getSAP_BASE_UNIT().hashCode());
        result = prime * result + ((getSAP_COLOR_CODE() == null) ? 0 : getSAP_COLOR_CODE().hashCode());
        result = prime * result + ((getSAP_LEVEL_GROUP() == null) ? 0 : getSAP_LEVEL_GROUP().hashCode());
        result = prime * result + ((getSAP_GROSS_WEIGHT() == null) ? 0 : getSAP_GROSS_WEIGHT().hashCode());
        result = prime * result + ((getSAP_NET_WEIGHT() == null) ? 0 : getSAP_NET_WEIGHT().hashCode());
        result = prime * result + ((getSAP_IS_CONFIG() == null) ? 0 : getSAP_IS_CONFIG().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", CI_ITEM_CODE=").append(CI_ITEM_CODE);
        sb.append(", CI_ITEM_NAME=").append(CI_ITEM_NAME);
        sb.append(", CI_ITEM_SPEC=").append(CI_ITEM_SPEC);
        sb.append(", CI_ITEM_SOURCE=").append(CI_ITEM_SOURCE);
        sb.append(", CI_GROUP_ID=").append(CI_GROUP_ID);
        sb.append(", CI_ITEM_GENRE=").append(CI_ITEM_GENRE);
        sb.append(", CI_ITEM_TYPE=").append(CI_ITEM_TYPE);
        sb.append(", CI_SUPPLIER_CODE=").append(CI_SUPPLIER_CODE);
        sb.append(", CI_CUST_CODE=").append(CI_CUST_CODE);
        sb.append(", CI_MIN_PACK=").append(CI_MIN_PACK);
        sb.append(", CI_UNIT=").append(CI_UNIT);
        sb.append(", CI_LINK_NUM=").append(CI_LINK_NUM);
        sb.append(", CI_JIGSAW_NUM=").append(CI_JIGSAW_NUM);
        sb.append(", CI_FEEDER_SIZE=").append(CI_FEEDER_SIZE);
        sb.append(", CI_PACK_TYPE=").append(CI_PACK_TYPE);
        sb.append(", CI_PRINT_TIME=").append(CI_PRINT_TIME);
        sb.append(", CI_FEED_ANGLE=").append(CI_FEED_ANGLE);
        sb.append(", CI_STOCK_CYCLE=").append(CI_STOCK_CYCLE);
        sb.append(", CI_CYCLE_REMIND=").append(CI_CYCLE_REMIND);
        sb.append(", CI_FQC_QTY=").append(CI_FQC_QTY);
        sb.append(", CI_AUTO_FQC=").append(CI_AUTO_FQC);
        sb.append(", CI_IQC_FREE=").append(CI_IQC_FREE);
        sb.append(", CI_SCRAP_FLAG=").append(CI_SCRAP_FLAG);
        sb.append(", CI_MIN_STOCK=").append(CI_MIN_STOCK);
        sb.append(", CI_MAX_STOCK=").append(CI_MAX_STOCK);
        sb.append(", CI_STANDARD_WEIGHTS=").append(CI_STANDARD_WEIGHTS);
        sb.append(", CI_FULL_WEIGHTS=").append(CI_FULL_WEIGHTS);
        sb.append(", CI_TEST_FALG=").append(CI_TEST_FALG);
        sb.append(", CI_TEST_UNIT=").append(CI_TEST_UNIT);
        sb.append(", CI_TEST_MAX=").append(CI_TEST_MAX);
        sb.append(", CI_TEST_MIN=").append(CI_TEST_MIN);
        sb.append(", CI_MSD_FLAG=").append(CI_MSD_FLAG);
        sb.append(", CI_MSD_ID=").append(CI_MSD_ID);
        sb.append(", CI_ROHS_FLAG=").append(CI_ROHS_FLAG);
        sb.append(", CI_CUST_ITEM=").append(CI_CUST_ITEM);
        sb.append(", CI_PCB_FLAG=").append(CI_PCB_FLAG);
        sb.append(", CI_MEMO=").append(CI_MEMO);
        sb.append(", DEPT_ID=").append(DEPT_ID);
        sb.append(", CREATE_USER=").append(CREATE_USER);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", EDIT_USER=").append(EDIT_USER);
        sb.append(", EDIT_TIME=").append(EDIT_TIME);
        sb.append(", CI_SN_RULE_B=").append(CI_SN_RULE_B);
        sb.append(", CI_SN_RULE_S=").append(CI_SN_RULE_S);
        sb.append(", CI_SIZE=").append(CI_SIZE);
        sb.append(", CI_REPAIR_MAX=").append(CI_REPAIR_MAX);
        sb.append(", CI_CONTRAL_TYPE=").append(CI_CONTRAL_TYPE);
        sb.append(", DATA_AUTH=").append(DATA_AUTH);
        sb.append(", CI_RECHECK_DAYS=").append(CI_RECHECK_DAYS);
        sb.append(", CI_REMIND_DAYS=").append(CI_REMIND_DAYS);
        sb.append(", CI_EXCESS_RECEIVE=").append(CI_EXCESS_RECEIVE);
        sb.append(", CI_EXCESS_PICK=").append(CI_EXCESS_PICK);
        sb.append(", CI_AGING_TIME=").append(CI_AGING_TIME);
        sb.append(", CI_SLUGGISH_CYCLE=").append(CI_SLUGGISH_CYCLE);
        sb.append(", CI_ITEM_SIZE=").append(CI_ITEM_SIZE);
        sb.append(", CI_STOCK_PERIOD=").append(CI_STOCK_PERIOD);
        sb.append(", CI_STOCK_PERIOD_KEEP=").append(CI_STOCK_PERIOD_KEEP);
        sb.append(", CI_OVERRATE=").append(CI_OVERRATE);
        sb.append(", CI_MANUFACTURER=").append(CI_MANUFACTURER);
        sb.append(", CI_MANUFACTURER_MODEL=").append(CI_MANUFACTURER_MODEL);
        sb.append(", CI_3C_FLAG=").append(CI_3C_FLAG);
        sb.append(", SAMPLE_CODE=").append(SAMPLE_CODE);
        sb.append(", ABC_TYPE=").append(ABC_TYPE);
        sb.append(", CI_IS_ESCROW=").append(CI_IS_ESCROW);
        sb.append(", CI_SN_RULE=").append(CI_SN_RULE);
        sb.append(", RAW_LOTNUMBER=").append(RAW_LOTNUMBER);
        sb.append(", STOCK_CODE=").append(STOCK_CODE);
        sb.append(", SAP_WEIGHT_UNIT=").append(SAP_WEIGHT_UNIT);
        sb.append(", SAP_IS_DEL=").append(SAP_IS_DEL);
        sb.append(", SAP_BASE_UNIT=").append(SAP_BASE_UNIT);
        sb.append(", SAP_COLOR_CODE=").append(SAP_COLOR_CODE);
        sb.append(", SAP_LEVEL_GROUP=").append(SAP_LEVEL_GROUP);
        sb.append(", SAP_GROSS_WEIGHT=").append(SAP_GROSS_WEIGHT);
        sb.append(", SAP_NET_WEIGHT=").append(SAP_NET_WEIGHT);
        sb.append(", SAP_IS_CONFIG=").append(SAP_IS_CONFIG);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}