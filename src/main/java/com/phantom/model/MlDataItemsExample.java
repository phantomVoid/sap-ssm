package com.phantom.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MlDataItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlDataItemsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTEMPLATE_IDIsNull() {
            addCriterion("TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDIsNotNull() {
            addCriterion("TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDEqualTo(String value) {
            addCriterion("TEMPLATE_ID =", value, "TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDNotEqualTo(String value) {
            addCriterion("TEMPLATE_ID <>", value, "TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDGreaterThan(String value) {
            addCriterion("TEMPLATE_ID >", value, "TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ID >=", value, "TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDLessThan(String value) {
            addCriterion("TEMPLATE_ID <", value, "TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ID <=", value, "TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDLike(String value) {
            addCriterion("TEMPLATE_ID like", value, "TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDNotLike(String value) {
            addCriterion("TEMPLATE_ID not like", value, "TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDIn(List<String> values) {
            addCriterion("TEMPLATE_ID in", values, "TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDNotIn(List<String> values) {
            addCriterion("TEMPLATE_ID not in", values, "TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ID between", value1, value2, "TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andTEMPLATE_IDNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ID not between", value1, value2, "TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMEIsNull() {
            addCriterion("DATA_ITEMS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMEIsNotNull() {
            addCriterion("DATA_ITEMS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMEEqualTo(String value) {
            addCriterion("DATA_ITEMS_NAME =", value, "DATA_ITEMS_NAME");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMENotEqualTo(String value) {
            addCriterion("DATA_ITEMS_NAME <>", value, "DATA_ITEMS_NAME");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMEGreaterThan(String value) {
            addCriterion("DATA_ITEMS_NAME >", value, "DATA_ITEMS_NAME");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_ITEMS_NAME >=", value, "DATA_ITEMS_NAME");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMELessThan(String value) {
            addCriterion("DATA_ITEMS_NAME <", value, "DATA_ITEMS_NAME");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMELessThanOrEqualTo(String value) {
            addCriterion("DATA_ITEMS_NAME <=", value, "DATA_ITEMS_NAME");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMELike(String value) {
            addCriterion("DATA_ITEMS_NAME like", value, "DATA_ITEMS_NAME");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMENotLike(String value) {
            addCriterion("DATA_ITEMS_NAME not like", value, "DATA_ITEMS_NAME");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMEIn(List<String> values) {
            addCriterion("DATA_ITEMS_NAME in", values, "DATA_ITEMS_NAME");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMENotIn(List<String> values) {
            addCriterion("DATA_ITEMS_NAME not in", values, "DATA_ITEMS_NAME");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMEBetween(String value1, String value2) {
            addCriterion("DATA_ITEMS_NAME between", value1, value2, "DATA_ITEMS_NAME");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_NAMENotBetween(String value1, String value2) {
            addCriterion("DATA_ITEMS_NAME not between", value1, value2, "DATA_ITEMS_NAME");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASIsNull() {
            addCriterion("DATA_ITEMS_ALIAS is null");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASIsNotNull() {
            addCriterion("DATA_ITEMS_ALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASEqualTo(String value) {
            addCriterion("DATA_ITEMS_ALIAS =", value, "DATA_ITEMS_ALIAS");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASNotEqualTo(String value) {
            addCriterion("DATA_ITEMS_ALIAS <>", value, "DATA_ITEMS_ALIAS");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASGreaterThan(String value) {
            addCriterion("DATA_ITEMS_ALIAS >", value, "DATA_ITEMS_ALIAS");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_ITEMS_ALIAS >=", value, "DATA_ITEMS_ALIAS");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASLessThan(String value) {
            addCriterion("DATA_ITEMS_ALIAS <", value, "DATA_ITEMS_ALIAS");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASLessThanOrEqualTo(String value) {
            addCriterion("DATA_ITEMS_ALIAS <=", value, "DATA_ITEMS_ALIAS");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASLike(String value) {
            addCriterion("DATA_ITEMS_ALIAS like", value, "DATA_ITEMS_ALIAS");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASNotLike(String value) {
            addCriterion("DATA_ITEMS_ALIAS not like", value, "DATA_ITEMS_ALIAS");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASIn(List<String> values) {
            addCriterion("DATA_ITEMS_ALIAS in", values, "DATA_ITEMS_ALIAS");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASNotIn(List<String> values) {
            addCriterion("DATA_ITEMS_ALIAS not in", values, "DATA_ITEMS_ALIAS");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASBetween(String value1, String value2) {
            addCriterion("DATA_ITEMS_ALIAS between", value1, value2, "DATA_ITEMS_ALIAS");
            return (Criteria) this;
        }

        public Criteria andDATA_ITEMS_ALIASNotBetween(String value1, String value2) {
            addCriterion("DATA_ITEMS_ALIAS not between", value1, value2, "DATA_ITEMS_ALIAS");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMIsNull() {
            addCriterion("BARCODE_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMIsNotNull() {
            addCriterion("BARCODE_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMEqualTo(String value) {
            addCriterion("BARCODE_ITEM =", value, "BARCODE_ITEM");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMNotEqualTo(String value) {
            addCriterion("BARCODE_ITEM <>", value, "BARCODE_ITEM");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMGreaterThan(String value) {
            addCriterion("BARCODE_ITEM >", value, "BARCODE_ITEM");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMGreaterThanOrEqualTo(String value) {
            addCriterion("BARCODE_ITEM >=", value, "BARCODE_ITEM");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMLessThan(String value) {
            addCriterion("BARCODE_ITEM <", value, "BARCODE_ITEM");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMLessThanOrEqualTo(String value) {
            addCriterion("BARCODE_ITEM <=", value, "BARCODE_ITEM");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMLike(String value) {
            addCriterion("BARCODE_ITEM like", value, "BARCODE_ITEM");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMNotLike(String value) {
            addCriterion("BARCODE_ITEM not like", value, "BARCODE_ITEM");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMIn(List<String> values) {
            addCriterion("BARCODE_ITEM in", values, "BARCODE_ITEM");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMNotIn(List<String> values) {
            addCriterion("BARCODE_ITEM not in", values, "BARCODE_ITEM");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMBetween(String value1, String value2) {
            addCriterion("BARCODE_ITEM between", value1, value2, "BARCODE_ITEM");
            return (Criteria) this;
        }

        public Criteria andBARCODE_ITEMNotBetween(String value1, String value2) {
            addCriterion("BARCODE_ITEM not between", value1, value2, "BARCODE_ITEM");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGIsNull() {
            addCriterion("EMPTY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGIsNotNull() {
            addCriterion("EMPTY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGEqualTo(String value) {
            addCriterion("EMPTY_FLAG =", value, "EMPTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGNotEqualTo(String value) {
            addCriterion("EMPTY_FLAG <>", value, "EMPTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGGreaterThan(String value) {
            addCriterion("EMPTY_FLAG >", value, "EMPTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("EMPTY_FLAG >=", value, "EMPTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGLessThan(String value) {
            addCriterion("EMPTY_FLAG <", value, "EMPTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGLessThanOrEqualTo(String value) {
            addCriterion("EMPTY_FLAG <=", value, "EMPTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGLike(String value) {
            addCriterion("EMPTY_FLAG like", value, "EMPTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGNotLike(String value) {
            addCriterion("EMPTY_FLAG not like", value, "EMPTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGIn(List<String> values) {
            addCriterion("EMPTY_FLAG in", values, "EMPTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGNotIn(List<String> values) {
            addCriterion("EMPTY_FLAG not in", values, "EMPTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGBetween(String value1, String value2) {
            addCriterion("EMPTY_FLAG between", value1, value2, "EMPTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andEMPTY_FLAGNotBetween(String value1, String value2) {
            addCriterion("EMPTY_FLAG not between", value1, value2, "EMPTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITIsNull() {
            addCriterion("ALLOW_EDIT is null");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITIsNotNull() {
            addCriterion("ALLOW_EDIT is not null");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITEqualTo(String value) {
            addCriterion("ALLOW_EDIT =", value, "ALLOW_EDIT");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITNotEqualTo(String value) {
            addCriterion("ALLOW_EDIT <>", value, "ALLOW_EDIT");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITGreaterThan(String value) {
            addCriterion("ALLOW_EDIT >", value, "ALLOW_EDIT");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_EDIT >=", value, "ALLOW_EDIT");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITLessThan(String value) {
            addCriterion("ALLOW_EDIT <", value, "ALLOW_EDIT");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_EDIT <=", value, "ALLOW_EDIT");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITLike(String value) {
            addCriterion("ALLOW_EDIT like", value, "ALLOW_EDIT");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITNotLike(String value) {
            addCriterion("ALLOW_EDIT not like", value, "ALLOW_EDIT");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITIn(List<String> values) {
            addCriterion("ALLOW_EDIT in", values, "ALLOW_EDIT");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITNotIn(List<String> values) {
            addCriterion("ALLOW_EDIT not in", values, "ALLOW_EDIT");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITBetween(String value1, String value2) {
            addCriterion("ALLOW_EDIT between", value1, value2, "ALLOW_EDIT");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDITNotBetween(String value1, String value2) {
            addCriterion("ALLOW_EDIT not between", value1, value2, "ALLOW_EDIT");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYIsNull() {
            addCriterion("ALLOW_DISPLAY is null");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYIsNotNull() {
            addCriterion("ALLOW_DISPLAY is not null");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYEqualTo(String value) {
            addCriterion("ALLOW_DISPLAY =", value, "ALLOW_DISPLAY");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYNotEqualTo(String value) {
            addCriterion("ALLOW_DISPLAY <>", value, "ALLOW_DISPLAY");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYGreaterThan(String value) {
            addCriterion("ALLOW_DISPLAY >", value, "ALLOW_DISPLAY");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_DISPLAY >=", value, "ALLOW_DISPLAY");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYLessThan(String value) {
            addCriterion("ALLOW_DISPLAY <", value, "ALLOW_DISPLAY");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_DISPLAY <=", value, "ALLOW_DISPLAY");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYLike(String value) {
            addCriterion("ALLOW_DISPLAY like", value, "ALLOW_DISPLAY");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYNotLike(String value) {
            addCriterion("ALLOW_DISPLAY not like", value, "ALLOW_DISPLAY");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYIn(List<String> values) {
            addCriterion("ALLOW_DISPLAY in", values, "ALLOW_DISPLAY");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYNotIn(List<String> values) {
            addCriterion("ALLOW_DISPLAY not in", values, "ALLOW_DISPLAY");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYBetween(String value1, String value2) {
            addCriterion("ALLOW_DISPLAY between", value1, value2, "ALLOW_DISPLAY");
            return (Criteria) this;
        }

        public Criteria andALLOW_DISPLAYNotBetween(String value1, String value2) {
            addCriterion("ALLOW_DISPLAY not between", value1, value2, "ALLOW_DISPLAY");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODEIsNull() {
            addCriterion("MATCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODEIsNotNull() {
            addCriterion("MATCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODEEqualTo(String value) {
            addCriterion("MATCH_CODE =", value, "MATCH_CODE");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODENotEqualTo(String value) {
            addCriterion("MATCH_CODE <>", value, "MATCH_CODE");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODEGreaterThan(String value) {
            addCriterion("MATCH_CODE >", value, "MATCH_CODE");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_CODE >=", value, "MATCH_CODE");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODELessThan(String value) {
            addCriterion("MATCH_CODE <", value, "MATCH_CODE");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODELessThanOrEqualTo(String value) {
            addCriterion("MATCH_CODE <=", value, "MATCH_CODE");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODELike(String value) {
            addCriterion("MATCH_CODE like", value, "MATCH_CODE");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODENotLike(String value) {
            addCriterion("MATCH_CODE not like", value, "MATCH_CODE");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODEIn(List<String> values) {
            addCriterion("MATCH_CODE in", values, "MATCH_CODE");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODENotIn(List<String> values) {
            addCriterion("MATCH_CODE not in", values, "MATCH_CODE");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODEBetween(String value1, String value2) {
            addCriterion("MATCH_CODE between", value1, value2, "MATCH_CODE");
            return (Criteria) this;
        }

        public Criteria andMATCH_CODENotBetween(String value1, String value2) {
            addCriterion("MATCH_CODE not between", value1, value2, "MATCH_CODE");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTIsNull() {
            addCriterion("LABEL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTIsNotNull() {
            addCriterion("LABEL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTEqualTo(String value) {
            addCriterion("LABEL_COUNT =", value, "LABEL_COUNT");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTNotEqualTo(String value) {
            addCriterion("LABEL_COUNT <>", value, "LABEL_COUNT");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTGreaterThan(String value) {
            addCriterion("LABEL_COUNT >", value, "LABEL_COUNT");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL_COUNT >=", value, "LABEL_COUNT");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTLessThan(String value) {
            addCriterion("LABEL_COUNT <", value, "LABEL_COUNT");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTLessThanOrEqualTo(String value) {
            addCriterion("LABEL_COUNT <=", value, "LABEL_COUNT");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTLike(String value) {
            addCriterion("LABEL_COUNT like", value, "LABEL_COUNT");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTNotLike(String value) {
            addCriterion("LABEL_COUNT not like", value, "LABEL_COUNT");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTIn(List<String> values) {
            addCriterion("LABEL_COUNT in", values, "LABEL_COUNT");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTNotIn(List<String> values) {
            addCriterion("LABEL_COUNT not in", values, "LABEL_COUNT");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTBetween(String value1, String value2) {
            addCriterion("LABEL_COUNT between", value1, value2, "LABEL_COUNT");
            return (Criteria) this;
        }

        public Criteria andLABEL_COUNTNotBetween(String value1, String value2) {
            addCriterion("LABEL_COUNT not between", value1, value2, "LABEL_COUNT");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGIsNull() {
            addCriterion("PICTURE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGIsNotNull() {
            addCriterion("PICTURE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGEqualTo(String value) {
            addCriterion("PICTURE_FLAG =", value, "PICTURE_FLAG");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGNotEqualTo(String value) {
            addCriterion("PICTURE_FLAG <>", value, "PICTURE_FLAG");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGGreaterThan(String value) {
            addCriterion("PICTURE_FLAG >", value, "PICTURE_FLAG");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("PICTURE_FLAG >=", value, "PICTURE_FLAG");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGLessThan(String value) {
            addCriterion("PICTURE_FLAG <", value, "PICTURE_FLAG");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGLessThanOrEqualTo(String value) {
            addCriterion("PICTURE_FLAG <=", value, "PICTURE_FLAG");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGLike(String value) {
            addCriterion("PICTURE_FLAG like", value, "PICTURE_FLAG");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGNotLike(String value) {
            addCriterion("PICTURE_FLAG not like", value, "PICTURE_FLAG");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGIn(List<String> values) {
            addCriterion("PICTURE_FLAG in", values, "PICTURE_FLAG");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGNotIn(List<String> values) {
            addCriterion("PICTURE_FLAG not in", values, "PICTURE_FLAG");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGBetween(String value1, String value2) {
            addCriterion("PICTURE_FLAG between", value1, value2, "PICTURE_FLAG");
            return (Criteria) this;
        }

        public Criteria andPICTURE_FLAGNotBetween(String value1, String value2) {
            addCriterion("PICTURE_FLAG not between", value1, value2, "PICTURE_FLAG");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHIsNull() {
            addCriterion("PICTURE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHIsNotNull() {
            addCriterion("PICTURE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHEqualTo(String value) {
            addCriterion("PICTURE_PATH =", value, "PICTURE_PATH");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHNotEqualTo(String value) {
            addCriterion("PICTURE_PATH <>", value, "PICTURE_PATH");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHGreaterThan(String value) {
            addCriterion("PICTURE_PATH >", value, "PICTURE_PATH");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHGreaterThanOrEqualTo(String value) {
            addCriterion("PICTURE_PATH >=", value, "PICTURE_PATH");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHLessThan(String value) {
            addCriterion("PICTURE_PATH <", value, "PICTURE_PATH");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHLessThanOrEqualTo(String value) {
            addCriterion("PICTURE_PATH <=", value, "PICTURE_PATH");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHLike(String value) {
            addCriterion("PICTURE_PATH like", value, "PICTURE_PATH");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHNotLike(String value) {
            addCriterion("PICTURE_PATH not like", value, "PICTURE_PATH");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHIn(List<String> values) {
            addCriterion("PICTURE_PATH in", values, "PICTURE_PATH");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHNotIn(List<String> values) {
            addCriterion("PICTURE_PATH not in", values, "PICTURE_PATH");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHBetween(String value1, String value2) {
            addCriterion("PICTURE_PATH between", value1, value2, "PICTURE_PATH");
            return (Criteria) this;
        }

        public Criteria andPICTURE_PATHNotBetween(String value1, String value2) {
            addCriterion("PICTURE_PATH not between", value1, value2, "PICTURE_PATH");
            return (Criteria) this;
        }

        public Criteria andSEQIsNull() {
            addCriterion("SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSEQIsNotNull() {
            addCriterion("SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSEQEqualTo(BigDecimal value) {
            addCriterion("SEQ =", value, "SEQ");
            return (Criteria) this;
        }

        public Criteria andSEQNotEqualTo(BigDecimal value) {
            addCriterion("SEQ <>", value, "SEQ");
            return (Criteria) this;
        }

        public Criteria andSEQGreaterThan(BigDecimal value) {
            addCriterion("SEQ >", value, "SEQ");
            return (Criteria) this;
        }

        public Criteria andSEQGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQ >=", value, "SEQ");
            return (Criteria) this;
        }

        public Criteria andSEQLessThan(BigDecimal value) {
            addCriterion("SEQ <", value, "SEQ");
            return (Criteria) this;
        }

        public Criteria andSEQLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQ <=", value, "SEQ");
            return (Criteria) this;
        }

        public Criteria andSEQIn(List<BigDecimal> values) {
            addCriterion("SEQ in", values, "SEQ");
            return (Criteria) this;
        }

        public Criteria andSEQNotIn(List<BigDecimal> values) {
            addCriterion("SEQ not in", values, "SEQ");
            return (Criteria) this;
        }

        public Criteria andSEQBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQ between", value1, value2, "SEQ");
            return (Criteria) this;
        }

        public Criteria andSEQNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQ not between", value1, value2, "SEQ");
            return (Criteria) this;
        }

        public Criteria andTEST_DATAIsNull() {
            addCriterion("TEST_DATA is null");
            return (Criteria) this;
        }

        public Criteria andTEST_DATAIsNotNull() {
            addCriterion("TEST_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andTEST_DATAEqualTo(String value) {
            addCriterion("TEST_DATA =", value, "TEST_DATA");
            return (Criteria) this;
        }

        public Criteria andTEST_DATANotEqualTo(String value) {
            addCriterion("TEST_DATA <>", value, "TEST_DATA");
            return (Criteria) this;
        }

        public Criteria andTEST_DATAGreaterThan(String value) {
            addCriterion("TEST_DATA >", value, "TEST_DATA");
            return (Criteria) this;
        }

        public Criteria andTEST_DATAGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_DATA >=", value, "TEST_DATA");
            return (Criteria) this;
        }

        public Criteria andTEST_DATALessThan(String value) {
            addCriterion("TEST_DATA <", value, "TEST_DATA");
            return (Criteria) this;
        }

        public Criteria andTEST_DATALessThanOrEqualTo(String value) {
            addCriterion("TEST_DATA <=", value, "TEST_DATA");
            return (Criteria) this;
        }

        public Criteria andTEST_DATALike(String value) {
            addCriterion("TEST_DATA like", value, "TEST_DATA");
            return (Criteria) this;
        }

        public Criteria andTEST_DATANotLike(String value) {
            addCriterion("TEST_DATA not like", value, "TEST_DATA");
            return (Criteria) this;
        }

        public Criteria andTEST_DATAIn(List<String> values) {
            addCriterion("TEST_DATA in", values, "TEST_DATA");
            return (Criteria) this;
        }

        public Criteria andTEST_DATANotIn(List<String> values) {
            addCriterion("TEST_DATA not in", values, "TEST_DATA");
            return (Criteria) this;
        }

        public Criteria andTEST_DATABetween(String value1, String value2) {
            addCriterion("TEST_DATA between", value1, value2, "TEST_DATA");
            return (Criteria) this;
        }

        public Criteria andTEST_DATANotBetween(String value1, String value2) {
            addCriterion("TEST_DATA not between", value1, value2, "TEST_DATA");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SIsNull() {
            addCriterion("PICTURE_NAME_S is null");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SIsNotNull() {
            addCriterion("PICTURE_NAME_S is not null");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SEqualTo(String value) {
            addCriterion("PICTURE_NAME_S =", value, "PICTURE_NAME_S");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SNotEqualTo(String value) {
            addCriterion("PICTURE_NAME_S <>", value, "PICTURE_NAME_S");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SGreaterThan(String value) {
            addCriterion("PICTURE_NAME_S >", value, "PICTURE_NAME_S");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SGreaterThanOrEqualTo(String value) {
            addCriterion("PICTURE_NAME_S >=", value, "PICTURE_NAME_S");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SLessThan(String value) {
            addCriterion("PICTURE_NAME_S <", value, "PICTURE_NAME_S");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SLessThanOrEqualTo(String value) {
            addCriterion("PICTURE_NAME_S <=", value, "PICTURE_NAME_S");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SLike(String value) {
            addCriterion("PICTURE_NAME_S like", value, "PICTURE_NAME_S");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SNotLike(String value) {
            addCriterion("PICTURE_NAME_S not like", value, "PICTURE_NAME_S");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SIn(List<String> values) {
            addCriterion("PICTURE_NAME_S in", values, "PICTURE_NAME_S");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SNotIn(List<String> values) {
            addCriterion("PICTURE_NAME_S not in", values, "PICTURE_NAME_S");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SBetween(String value1, String value2) {
            addCriterion("PICTURE_NAME_S between", value1, value2, "PICTURE_NAME_S");
            return (Criteria) this;
        }

        public Criteria andPICTURE_NAME_SNotBetween(String value1, String value2) {
            addCriterion("PICTURE_NAME_S not between", value1, value2, "PICTURE_NAME_S");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPEIsNull() {
            addCriterion("COLUMN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPEIsNotNull() {
            addCriterion("COLUMN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPEEqualTo(String value) {
            addCriterion("COLUMN_TYPE =", value, "COLUMN_TYPE");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPENotEqualTo(String value) {
            addCriterion("COLUMN_TYPE <>", value, "COLUMN_TYPE");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPEGreaterThan(String value) {
            addCriterion("COLUMN_TYPE >", value, "COLUMN_TYPE");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN_TYPE >=", value, "COLUMN_TYPE");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPELessThan(String value) {
            addCriterion("COLUMN_TYPE <", value, "COLUMN_TYPE");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPELessThanOrEqualTo(String value) {
            addCriterion("COLUMN_TYPE <=", value, "COLUMN_TYPE");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPELike(String value) {
            addCriterion("COLUMN_TYPE like", value, "COLUMN_TYPE");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPENotLike(String value) {
            addCriterion("COLUMN_TYPE not like", value, "COLUMN_TYPE");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPEIn(List<String> values) {
            addCriterion("COLUMN_TYPE in", values, "COLUMN_TYPE");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPENotIn(List<String> values) {
            addCriterion("COLUMN_TYPE not in", values, "COLUMN_TYPE");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPEBetween(String value1, String value2) {
            addCriterion("COLUMN_TYPE between", value1, value2, "COLUMN_TYPE");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_TYPENotBetween(String value1, String value2) {
            addCriterion("COLUMN_TYPE not between", value1, value2, "COLUMN_TYPE");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATAIsNull() {
            addCriterion("COLUMN_DATA is null");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATAIsNotNull() {
            addCriterion("COLUMN_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATAEqualTo(String value) {
            addCriterion("COLUMN_DATA =", value, "COLUMN_DATA");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATANotEqualTo(String value) {
            addCriterion("COLUMN_DATA <>", value, "COLUMN_DATA");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATAGreaterThan(String value) {
            addCriterion("COLUMN_DATA >", value, "COLUMN_DATA");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATAGreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN_DATA >=", value, "COLUMN_DATA");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATALessThan(String value) {
            addCriterion("COLUMN_DATA <", value, "COLUMN_DATA");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATALessThanOrEqualTo(String value) {
            addCriterion("COLUMN_DATA <=", value, "COLUMN_DATA");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATALike(String value) {
            addCriterion("COLUMN_DATA like", value, "COLUMN_DATA");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATANotLike(String value) {
            addCriterion("COLUMN_DATA not like", value, "COLUMN_DATA");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATAIn(List<String> values) {
            addCriterion("COLUMN_DATA in", values, "COLUMN_DATA");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATANotIn(List<String> values) {
            addCriterion("COLUMN_DATA not in", values, "COLUMN_DATA");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATABetween(String value1, String value2) {
            addCriterion("COLUMN_DATA between", value1, value2, "COLUMN_DATA");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_DATANotBetween(String value1, String value2) {
            addCriterion("COLUMN_DATA not between", value1, value2, "COLUMN_DATA");
            return (Criteria) this;
        }

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(String value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(String value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(String value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(String value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLike(String value) {
            addCriterion("ID like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotLike(String value) {
            addCriterion("ID not like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<String> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<String> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "DEPT_ID");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "DEPT_ID");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "DEPT_ID");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "DEPT_ID");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDLessThan(String value) {
            addCriterion("DEPT_ID <", value, "DEPT_ID");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "DEPT_ID");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDLike(String value) {
            addCriterion("DEPT_ID like", value, "DEPT_ID");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "DEPT_ID");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "DEPT_ID");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "DEPT_ID");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "DEPT_ID");
            return (Criteria) this;
        }

        public Criteria andDEPT_IDNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "DEPT_ID");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCREATE_USEREqualTo(String value) {
            addCriterion("CREATE_USER =", value, "CREATE_USER");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "CREATE_USER");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "CREATE_USER");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "CREATE_USER");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERLessThan(String value) {
            addCriterion("CREATE_USER <", value, "CREATE_USER");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "CREATE_USER");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERLike(String value) {
            addCriterion("CREATE_USER like", value, "CREATE_USER");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "CREATE_USER");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "CREATE_USER");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "CREATE_USER");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "CREATE_USER");
            return (Criteria) this;
        }

        public Criteria andCREATE_USERNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "CREATE_USER");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMENotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMELessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMENotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERIsNull() {
            addCriterion("EDIT_USER is null");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERIsNotNull() {
            addCriterion("EDIT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andEDIT_USEREqualTo(String value) {
            addCriterion("EDIT_USER =", value, "EDIT_USER");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERNotEqualTo(String value) {
            addCriterion("EDIT_USER <>", value, "EDIT_USER");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERGreaterThan(String value) {
            addCriterion("EDIT_USER >", value, "EDIT_USER");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERGreaterThanOrEqualTo(String value) {
            addCriterion("EDIT_USER >=", value, "EDIT_USER");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERLessThan(String value) {
            addCriterion("EDIT_USER <", value, "EDIT_USER");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERLessThanOrEqualTo(String value) {
            addCriterion("EDIT_USER <=", value, "EDIT_USER");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERLike(String value) {
            addCriterion("EDIT_USER like", value, "EDIT_USER");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERNotLike(String value) {
            addCriterion("EDIT_USER not like", value, "EDIT_USER");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERIn(List<String> values) {
            addCriterion("EDIT_USER in", values, "EDIT_USER");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERNotIn(List<String> values) {
            addCriterion("EDIT_USER not in", values, "EDIT_USER");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERBetween(String value1, String value2) {
            addCriterion("EDIT_USER between", value1, value2, "EDIT_USER");
            return (Criteria) this;
        }

        public Criteria andEDIT_USERNotBetween(String value1, String value2) {
            addCriterion("EDIT_USER not between", value1, value2, "EDIT_USER");
            return (Criteria) this;
        }

        public Criteria andEDIT_TIMEIsNull() {
            addCriterion("EDIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEDIT_TIMEIsNotNull() {
            addCriterion("EDIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEDIT_TIMEEqualTo(Date value) {
            addCriterionForJDBCDate("EDIT_TIME =", value, "EDIT_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_TIMENotEqualTo(Date value) {
            addCriterionForJDBCDate("EDIT_TIME <>", value, "EDIT_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_TIMEGreaterThan(Date value) {
            addCriterionForJDBCDate("EDIT_TIME >", value, "EDIT_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EDIT_TIME >=", value, "EDIT_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_TIMELessThan(Date value) {
            addCriterionForJDBCDate("EDIT_TIME <", value, "EDIT_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_TIMELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EDIT_TIME <=", value, "EDIT_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_TIMEIn(List<Date> values) {
            addCriterionForJDBCDate("EDIT_TIME in", values, "EDIT_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_TIMENotIn(List<Date> values) {
            addCriterionForJDBCDate("EDIT_TIME not in", values, "EDIT_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_TIMEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EDIT_TIME between", value1, value2, "EDIT_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_TIMENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EDIT_TIME not between", value1, value2, "EDIT_TIME");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHIsNull() {
            addCriterion("DATA_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHIsNotNull() {
            addCriterion("DATA_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHEqualTo(String value) {
            addCriterion("DATA_AUTH =", value, "DATA_AUTH");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHNotEqualTo(String value) {
            addCriterion("DATA_AUTH <>", value, "DATA_AUTH");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHGreaterThan(String value) {
            addCriterion("DATA_AUTH >", value, "DATA_AUTH");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_AUTH >=", value, "DATA_AUTH");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHLessThan(String value) {
            addCriterion("DATA_AUTH <", value, "DATA_AUTH");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHLessThanOrEqualTo(String value) {
            addCriterion("DATA_AUTH <=", value, "DATA_AUTH");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHLike(String value) {
            addCriterion("DATA_AUTH like", value, "DATA_AUTH");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHNotLike(String value) {
            addCriterion("DATA_AUTH not like", value, "DATA_AUTH");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHIn(List<String> values) {
            addCriterion("DATA_AUTH in", values, "DATA_AUTH");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHNotIn(List<String> values) {
            addCriterion("DATA_AUTH not in", values, "DATA_AUTH");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHBetween(String value1, String value2) {
            addCriterion("DATA_AUTH between", value1, value2, "DATA_AUTH");
            return (Criteria) this;
        }

        public Criteria andDATA_AUTHNotBetween(String value1, String value2) {
            addCriterion("DATA_AUTH not between", value1, value2, "DATA_AUTH");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGIsNull() {
            addCriterion("SUBLEVEL_QTY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGIsNotNull() {
            addCriterion("SUBLEVEL_QTY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGEqualTo(String value) {
            addCriterion("SUBLEVEL_QTY_FLAG =", value, "SUBLEVEL_QTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGNotEqualTo(String value) {
            addCriterion("SUBLEVEL_QTY_FLAG <>", value, "SUBLEVEL_QTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGGreaterThan(String value) {
            addCriterion("SUBLEVEL_QTY_FLAG >", value, "SUBLEVEL_QTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("SUBLEVEL_QTY_FLAG >=", value, "SUBLEVEL_QTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGLessThan(String value) {
            addCriterion("SUBLEVEL_QTY_FLAG <", value, "SUBLEVEL_QTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGLessThanOrEqualTo(String value) {
            addCriterion("SUBLEVEL_QTY_FLAG <=", value, "SUBLEVEL_QTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGLike(String value) {
            addCriterion("SUBLEVEL_QTY_FLAG like", value, "SUBLEVEL_QTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGNotLike(String value) {
            addCriterion("SUBLEVEL_QTY_FLAG not like", value, "SUBLEVEL_QTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGIn(List<String> values) {
            addCriterion("SUBLEVEL_QTY_FLAG in", values, "SUBLEVEL_QTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGNotIn(List<String> values) {
            addCriterion("SUBLEVEL_QTY_FLAG not in", values, "SUBLEVEL_QTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGBetween(String value1, String value2) {
            addCriterion("SUBLEVEL_QTY_FLAG between", value1, value2, "SUBLEVEL_QTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andSUBLEVEL_QTY_FLAGNotBetween(String value1, String value2) {
            addCriterion("SUBLEVEL_QTY_FLAG not between", value1, value2, "SUBLEVEL_QTY_FLAG");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDIsNull() {
            addCriterion("SOURCE_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDIsNotNull() {
            addCriterion("SOURCE_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDEqualTo(String value) {
            addCriterion("SOURCE_ITEM_ID =", value, "SOURCE_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDNotEqualTo(String value) {
            addCriterion("SOURCE_ITEM_ID <>", value, "SOURCE_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDGreaterThan(String value) {
            addCriterion("SOURCE_ITEM_ID >", value, "SOURCE_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_ITEM_ID >=", value, "SOURCE_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDLessThan(String value) {
            addCriterion("SOURCE_ITEM_ID <", value, "SOURCE_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_ITEM_ID <=", value, "SOURCE_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDLike(String value) {
            addCriterion("SOURCE_ITEM_ID like", value, "SOURCE_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDNotLike(String value) {
            addCriterion("SOURCE_ITEM_ID not like", value, "SOURCE_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDIn(List<String> values) {
            addCriterion("SOURCE_ITEM_ID in", values, "SOURCE_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDNotIn(List<String> values) {
            addCriterion("SOURCE_ITEM_ID not in", values, "SOURCE_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDBetween(String value1, String value2) {
            addCriterion("SOURCE_ITEM_ID between", value1, value2, "SOURCE_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_ITEM_IDNotBetween(String value1, String value2) {
            addCriterion("SOURCE_ITEM_ID not between", value1, value2, "SOURCE_ITEM_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDIsNull() {
            addCriterion("SOURCE_TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDIsNotNull() {
            addCriterion("SOURCE_TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDEqualTo(String value) {
            addCriterion("SOURCE_TEMPLATE_ID =", value, "SOURCE_TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDNotEqualTo(String value) {
            addCriterion("SOURCE_TEMPLATE_ID <>", value, "SOURCE_TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDGreaterThan(String value) {
            addCriterion("SOURCE_TEMPLATE_ID >", value, "SOURCE_TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_TEMPLATE_ID >=", value, "SOURCE_TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDLessThan(String value) {
            addCriterion("SOURCE_TEMPLATE_ID <", value, "SOURCE_TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_TEMPLATE_ID <=", value, "SOURCE_TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDLike(String value) {
            addCriterion("SOURCE_TEMPLATE_ID like", value, "SOURCE_TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDNotLike(String value) {
            addCriterion("SOURCE_TEMPLATE_ID not like", value, "SOURCE_TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDIn(List<String> values) {
            addCriterion("SOURCE_TEMPLATE_ID in", values, "SOURCE_TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDNotIn(List<String> values) {
            addCriterion("SOURCE_TEMPLATE_ID not in", values, "SOURCE_TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDBetween(String value1, String value2) {
            addCriterion("SOURCE_TEMPLATE_ID between", value1, value2, "SOURCE_TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andSOURCE_TEMPLATE_IDNotBetween(String value1, String value2) {
            addCriterion("SOURCE_TEMPLATE_ID not between", value1, value2, "SOURCE_TEMPLATE_ID");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCEIsNull() {
            addCriterion("EXTERNAL_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCEIsNotNull() {
            addCriterion("EXTERNAL_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCEEqualTo(String value) {
            addCriterion("EXTERNAL_SOURCE =", value, "EXTERNAL_SOURCE");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCENotEqualTo(String value) {
            addCriterion("EXTERNAL_SOURCE <>", value, "EXTERNAL_SOURCE");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCEGreaterThan(String value) {
            addCriterion("EXTERNAL_SOURCE >", value, "EXTERNAL_SOURCE");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCEGreaterThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_SOURCE >=", value, "EXTERNAL_SOURCE");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCELessThan(String value) {
            addCriterion("EXTERNAL_SOURCE <", value, "EXTERNAL_SOURCE");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCELessThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_SOURCE <=", value, "EXTERNAL_SOURCE");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCELike(String value) {
            addCriterion("EXTERNAL_SOURCE like", value, "EXTERNAL_SOURCE");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCENotLike(String value) {
            addCriterion("EXTERNAL_SOURCE not like", value, "EXTERNAL_SOURCE");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCEIn(List<String> values) {
            addCriterion("EXTERNAL_SOURCE in", values, "EXTERNAL_SOURCE");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCENotIn(List<String> values) {
            addCriterion("EXTERNAL_SOURCE not in", values, "EXTERNAL_SOURCE");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCEBetween(String value1, String value2) {
            addCriterion("EXTERNAL_SOURCE between", value1, value2, "EXTERNAL_SOURCE");
            return (Criteria) this;
        }

        public Criteria andEXTERNAL_SOURCENotBetween(String value1, String value2) {
            addCriterion("EXTERNAL_SOURCE not between", value1, value2, "EXTERNAL_SOURCE");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}