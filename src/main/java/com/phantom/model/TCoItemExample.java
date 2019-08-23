package com.phantom.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCoItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCoItemExample() {
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

        public Criteria andCI_ITEM_CODEIsNull() {
            addCriterion("CI_ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODEIsNotNull() {
            addCriterion("CI_ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODEEqualTo(String value) {
            addCriterion("CI_ITEM_CODE =", value, "CI_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODENotEqualTo(String value) {
            addCriterion("CI_ITEM_CODE <>", value, "CI_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODEGreaterThan(String value) {
            addCriterion("CI_ITEM_CODE >", value, "CI_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_CODE >=", value, "CI_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODELessThan(String value) {
            addCriterion("CI_ITEM_CODE <", value, "CI_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODELessThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_CODE <=", value, "CI_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODELike(String value) {
            addCriterion("CI_ITEM_CODE like", value, "CI_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODENotLike(String value) {
            addCriterion("CI_ITEM_CODE not like", value, "CI_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODEIn(List<String> values) {
            addCriterion("CI_ITEM_CODE in", values, "CI_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODENotIn(List<String> values) {
            addCriterion("CI_ITEM_CODE not in", values, "CI_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODEBetween(String value1, String value2) {
            addCriterion("CI_ITEM_CODE between", value1, value2, "CI_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_CODENotBetween(String value1, String value2) {
            addCriterion("CI_ITEM_CODE not between", value1, value2, "CI_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMEIsNull() {
            addCriterion("CI_ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMEIsNotNull() {
            addCriterion("CI_ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMEEqualTo(String value) {
            addCriterion("CI_ITEM_NAME =", value, "CI_ITEM_NAME");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMENotEqualTo(String value) {
            addCriterion("CI_ITEM_NAME <>", value, "CI_ITEM_NAME");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMEGreaterThan(String value) {
            addCriterion("CI_ITEM_NAME >", value, "CI_ITEM_NAME");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_NAME >=", value, "CI_ITEM_NAME");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMELessThan(String value) {
            addCriterion("CI_ITEM_NAME <", value, "CI_ITEM_NAME");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMELessThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_NAME <=", value, "CI_ITEM_NAME");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMELike(String value) {
            addCriterion("CI_ITEM_NAME like", value, "CI_ITEM_NAME");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMENotLike(String value) {
            addCriterion("CI_ITEM_NAME not like", value, "CI_ITEM_NAME");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMEIn(List<String> values) {
            addCriterion("CI_ITEM_NAME in", values, "CI_ITEM_NAME");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMENotIn(List<String> values) {
            addCriterion("CI_ITEM_NAME not in", values, "CI_ITEM_NAME");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMEBetween(String value1, String value2) {
            addCriterion("CI_ITEM_NAME between", value1, value2, "CI_ITEM_NAME");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_NAMENotBetween(String value1, String value2) {
            addCriterion("CI_ITEM_NAME not between", value1, value2, "CI_ITEM_NAME");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECIsNull() {
            addCriterion("CI_ITEM_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECIsNotNull() {
            addCriterion("CI_ITEM_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECEqualTo(String value) {
            addCriterion("CI_ITEM_SPEC =", value, "CI_ITEM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECNotEqualTo(String value) {
            addCriterion("CI_ITEM_SPEC <>", value, "CI_ITEM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECGreaterThan(String value) {
            addCriterion("CI_ITEM_SPEC >", value, "CI_ITEM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECGreaterThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_SPEC >=", value, "CI_ITEM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECLessThan(String value) {
            addCriterion("CI_ITEM_SPEC <", value, "CI_ITEM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECLessThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_SPEC <=", value, "CI_ITEM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECLike(String value) {
            addCriterion("CI_ITEM_SPEC like", value, "CI_ITEM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECNotLike(String value) {
            addCriterion("CI_ITEM_SPEC not like", value, "CI_ITEM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECIn(List<String> values) {
            addCriterion("CI_ITEM_SPEC in", values, "CI_ITEM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECNotIn(List<String> values) {
            addCriterion("CI_ITEM_SPEC not in", values, "CI_ITEM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECBetween(String value1, String value2) {
            addCriterion("CI_ITEM_SPEC between", value1, value2, "CI_ITEM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SPECNotBetween(String value1, String value2) {
            addCriterion("CI_ITEM_SPEC not between", value1, value2, "CI_ITEM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCEIsNull() {
            addCriterion("CI_ITEM_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCEIsNotNull() {
            addCriterion("CI_ITEM_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCEEqualTo(String value) {
            addCriterion("CI_ITEM_SOURCE =", value, "CI_ITEM_SOURCE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCENotEqualTo(String value) {
            addCriterion("CI_ITEM_SOURCE <>", value, "CI_ITEM_SOURCE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCEGreaterThan(String value) {
            addCriterion("CI_ITEM_SOURCE >", value, "CI_ITEM_SOURCE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_SOURCE >=", value, "CI_ITEM_SOURCE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCELessThan(String value) {
            addCriterion("CI_ITEM_SOURCE <", value, "CI_ITEM_SOURCE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCELessThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_SOURCE <=", value, "CI_ITEM_SOURCE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCELike(String value) {
            addCriterion("CI_ITEM_SOURCE like", value, "CI_ITEM_SOURCE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCENotLike(String value) {
            addCriterion("CI_ITEM_SOURCE not like", value, "CI_ITEM_SOURCE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCEIn(List<String> values) {
            addCriterion("CI_ITEM_SOURCE in", values, "CI_ITEM_SOURCE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCENotIn(List<String> values) {
            addCriterion("CI_ITEM_SOURCE not in", values, "CI_ITEM_SOURCE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCEBetween(String value1, String value2) {
            addCriterion("CI_ITEM_SOURCE between", value1, value2, "CI_ITEM_SOURCE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SOURCENotBetween(String value1, String value2) {
            addCriterion("CI_ITEM_SOURCE not between", value1, value2, "CI_ITEM_SOURCE");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDIsNull() {
            addCriterion("CI_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDIsNotNull() {
            addCriterion("CI_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDEqualTo(String value) {
            addCriterion("CI_GROUP_ID =", value, "CI_GROUP_ID");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDNotEqualTo(String value) {
            addCriterion("CI_GROUP_ID <>", value, "CI_GROUP_ID");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDGreaterThan(String value) {
            addCriterion("CI_GROUP_ID >", value, "CI_GROUP_ID");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDGreaterThanOrEqualTo(String value) {
            addCriterion("CI_GROUP_ID >=", value, "CI_GROUP_ID");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDLessThan(String value) {
            addCriterion("CI_GROUP_ID <", value, "CI_GROUP_ID");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDLessThanOrEqualTo(String value) {
            addCriterion("CI_GROUP_ID <=", value, "CI_GROUP_ID");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDLike(String value) {
            addCriterion("CI_GROUP_ID like", value, "CI_GROUP_ID");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDNotLike(String value) {
            addCriterion("CI_GROUP_ID not like", value, "CI_GROUP_ID");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDIn(List<String> values) {
            addCriterion("CI_GROUP_ID in", values, "CI_GROUP_ID");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDNotIn(List<String> values) {
            addCriterion("CI_GROUP_ID not in", values, "CI_GROUP_ID");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDBetween(String value1, String value2) {
            addCriterion("CI_GROUP_ID between", value1, value2, "CI_GROUP_ID");
            return (Criteria) this;
        }

        public Criteria andCI_GROUP_IDNotBetween(String value1, String value2) {
            addCriterion("CI_GROUP_ID not between", value1, value2, "CI_GROUP_ID");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENREIsNull() {
            addCriterion("CI_ITEM_GENRE is null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENREIsNotNull() {
            addCriterion("CI_ITEM_GENRE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENREEqualTo(String value) {
            addCriterion("CI_ITEM_GENRE =", value, "CI_ITEM_GENRE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENRENotEqualTo(String value) {
            addCriterion("CI_ITEM_GENRE <>", value, "CI_ITEM_GENRE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENREGreaterThan(String value) {
            addCriterion("CI_ITEM_GENRE >", value, "CI_ITEM_GENRE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENREGreaterThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_GENRE >=", value, "CI_ITEM_GENRE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENRELessThan(String value) {
            addCriterion("CI_ITEM_GENRE <", value, "CI_ITEM_GENRE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENRELessThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_GENRE <=", value, "CI_ITEM_GENRE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENRELike(String value) {
            addCriterion("CI_ITEM_GENRE like", value, "CI_ITEM_GENRE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENRENotLike(String value) {
            addCriterion("CI_ITEM_GENRE not like", value, "CI_ITEM_GENRE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENREIn(List<String> values) {
            addCriterion("CI_ITEM_GENRE in", values, "CI_ITEM_GENRE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENRENotIn(List<String> values) {
            addCriterion("CI_ITEM_GENRE not in", values, "CI_ITEM_GENRE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENREBetween(String value1, String value2) {
            addCriterion("CI_ITEM_GENRE between", value1, value2, "CI_ITEM_GENRE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_GENRENotBetween(String value1, String value2) {
            addCriterion("CI_ITEM_GENRE not between", value1, value2, "CI_ITEM_GENRE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPEIsNull() {
            addCriterion("CI_ITEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPEIsNotNull() {
            addCriterion("CI_ITEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPEEqualTo(String value) {
            addCriterion("CI_ITEM_TYPE =", value, "CI_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPENotEqualTo(String value) {
            addCriterion("CI_ITEM_TYPE <>", value, "CI_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPEGreaterThan(String value) {
            addCriterion("CI_ITEM_TYPE >", value, "CI_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_TYPE >=", value, "CI_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPELessThan(String value) {
            addCriterion("CI_ITEM_TYPE <", value, "CI_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPELessThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_TYPE <=", value, "CI_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPELike(String value) {
            addCriterion("CI_ITEM_TYPE like", value, "CI_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPENotLike(String value) {
            addCriterion("CI_ITEM_TYPE not like", value, "CI_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPEIn(List<String> values) {
            addCriterion("CI_ITEM_TYPE in", values, "CI_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPENotIn(List<String> values) {
            addCriterion("CI_ITEM_TYPE not in", values, "CI_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPEBetween(String value1, String value2) {
            addCriterion("CI_ITEM_TYPE between", value1, value2, "CI_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_TYPENotBetween(String value1, String value2) {
            addCriterion("CI_ITEM_TYPE not between", value1, value2, "CI_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODEIsNull() {
            addCriterion("CI_SUPPLIER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODEIsNotNull() {
            addCriterion("CI_SUPPLIER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODEEqualTo(String value) {
            addCriterion("CI_SUPPLIER_CODE =", value, "CI_SUPPLIER_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODENotEqualTo(String value) {
            addCriterion("CI_SUPPLIER_CODE <>", value, "CI_SUPPLIER_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODEGreaterThan(String value) {
            addCriterion("CI_SUPPLIER_CODE >", value, "CI_SUPPLIER_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_SUPPLIER_CODE >=", value, "CI_SUPPLIER_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODELessThan(String value) {
            addCriterion("CI_SUPPLIER_CODE <", value, "CI_SUPPLIER_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODELessThanOrEqualTo(String value) {
            addCriterion("CI_SUPPLIER_CODE <=", value, "CI_SUPPLIER_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODELike(String value) {
            addCriterion("CI_SUPPLIER_CODE like", value, "CI_SUPPLIER_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODENotLike(String value) {
            addCriterion("CI_SUPPLIER_CODE not like", value, "CI_SUPPLIER_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODEIn(List<String> values) {
            addCriterion("CI_SUPPLIER_CODE in", values, "CI_SUPPLIER_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODENotIn(List<String> values) {
            addCriterion("CI_SUPPLIER_CODE not in", values, "CI_SUPPLIER_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODEBetween(String value1, String value2) {
            addCriterion("CI_SUPPLIER_CODE between", value1, value2, "CI_SUPPLIER_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_SUPPLIER_CODENotBetween(String value1, String value2) {
            addCriterion("CI_SUPPLIER_CODE not between", value1, value2, "CI_SUPPLIER_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODEIsNull() {
            addCriterion("CI_CUST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODEIsNotNull() {
            addCriterion("CI_CUST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODEEqualTo(String value) {
            addCriterion("CI_CUST_CODE =", value, "CI_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODENotEqualTo(String value) {
            addCriterion("CI_CUST_CODE <>", value, "CI_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODEGreaterThan(String value) {
            addCriterion("CI_CUST_CODE >", value, "CI_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_CUST_CODE >=", value, "CI_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODELessThan(String value) {
            addCriterion("CI_CUST_CODE <", value, "CI_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODELessThanOrEqualTo(String value) {
            addCriterion("CI_CUST_CODE <=", value, "CI_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODELike(String value) {
            addCriterion("CI_CUST_CODE like", value, "CI_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODENotLike(String value) {
            addCriterion("CI_CUST_CODE not like", value, "CI_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODEIn(List<String> values) {
            addCriterion("CI_CUST_CODE in", values, "CI_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODENotIn(List<String> values) {
            addCriterion("CI_CUST_CODE not in", values, "CI_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODEBetween(String value1, String value2) {
            addCriterion("CI_CUST_CODE between", value1, value2, "CI_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_CODENotBetween(String value1, String value2) {
            addCriterion("CI_CUST_CODE not between", value1, value2, "CI_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_PACKIsNull() {
            addCriterion("CI_MIN_PACK is null");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_PACKIsNotNull() {
            addCriterion("CI_MIN_PACK is not null");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_PACKEqualTo(BigDecimal value) {
            addCriterion("CI_MIN_PACK =", value, "CI_MIN_PACK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_PACKNotEqualTo(BigDecimal value) {
            addCriterion("CI_MIN_PACK <>", value, "CI_MIN_PACK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_PACKGreaterThan(BigDecimal value) {
            addCriterion("CI_MIN_PACK >", value, "CI_MIN_PACK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_PACKGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_MIN_PACK >=", value, "CI_MIN_PACK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_PACKLessThan(BigDecimal value) {
            addCriterion("CI_MIN_PACK <", value, "CI_MIN_PACK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_PACKLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_MIN_PACK <=", value, "CI_MIN_PACK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_PACKIn(List<BigDecimal> values) {
            addCriterion("CI_MIN_PACK in", values, "CI_MIN_PACK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_PACKNotIn(List<BigDecimal> values) {
            addCriterion("CI_MIN_PACK not in", values, "CI_MIN_PACK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_PACKBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_MIN_PACK between", value1, value2, "CI_MIN_PACK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_PACKNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_MIN_PACK not between", value1, value2, "CI_MIN_PACK");
            return (Criteria) this;
        }

        public Criteria andCI_UNITIsNull() {
            addCriterion("CI_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCI_UNITIsNotNull() {
            addCriterion("CI_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCI_UNITEqualTo(String value) {
            addCriterion("CI_UNIT =", value, "CI_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_UNITNotEqualTo(String value) {
            addCriterion("CI_UNIT <>", value, "CI_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_UNITGreaterThan(String value) {
            addCriterion("CI_UNIT >", value, "CI_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_UNITGreaterThanOrEqualTo(String value) {
            addCriterion("CI_UNIT >=", value, "CI_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_UNITLessThan(String value) {
            addCriterion("CI_UNIT <", value, "CI_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_UNITLessThanOrEqualTo(String value) {
            addCriterion("CI_UNIT <=", value, "CI_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_UNITLike(String value) {
            addCriterion("CI_UNIT like", value, "CI_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_UNITNotLike(String value) {
            addCriterion("CI_UNIT not like", value, "CI_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_UNITIn(List<String> values) {
            addCriterion("CI_UNIT in", values, "CI_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_UNITNotIn(List<String> values) {
            addCriterion("CI_UNIT not in", values, "CI_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_UNITBetween(String value1, String value2) {
            addCriterion("CI_UNIT between", value1, value2, "CI_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_UNITNotBetween(String value1, String value2) {
            addCriterion("CI_UNIT not between", value1, value2, "CI_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_LINK_NUMIsNull() {
            addCriterion("CI_LINK_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCI_LINK_NUMIsNotNull() {
            addCriterion("CI_LINK_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCI_LINK_NUMEqualTo(BigDecimal value) {
            addCriterion("CI_LINK_NUM =", value, "CI_LINK_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_LINK_NUMNotEqualTo(BigDecimal value) {
            addCriterion("CI_LINK_NUM <>", value, "CI_LINK_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_LINK_NUMGreaterThan(BigDecimal value) {
            addCriterion("CI_LINK_NUM >", value, "CI_LINK_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_LINK_NUMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_LINK_NUM >=", value, "CI_LINK_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_LINK_NUMLessThan(BigDecimal value) {
            addCriterion("CI_LINK_NUM <", value, "CI_LINK_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_LINK_NUMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_LINK_NUM <=", value, "CI_LINK_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_LINK_NUMIn(List<BigDecimal> values) {
            addCriterion("CI_LINK_NUM in", values, "CI_LINK_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_LINK_NUMNotIn(List<BigDecimal> values) {
            addCriterion("CI_LINK_NUM not in", values, "CI_LINK_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_LINK_NUMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_LINK_NUM between", value1, value2, "CI_LINK_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_LINK_NUMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_LINK_NUM not between", value1, value2, "CI_LINK_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_JIGSAW_NUMIsNull() {
            addCriterion("CI_JIGSAW_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCI_JIGSAW_NUMIsNotNull() {
            addCriterion("CI_JIGSAW_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCI_JIGSAW_NUMEqualTo(BigDecimal value) {
            addCriterion("CI_JIGSAW_NUM =", value, "CI_JIGSAW_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_JIGSAW_NUMNotEqualTo(BigDecimal value) {
            addCriterion("CI_JIGSAW_NUM <>", value, "CI_JIGSAW_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_JIGSAW_NUMGreaterThan(BigDecimal value) {
            addCriterion("CI_JIGSAW_NUM >", value, "CI_JIGSAW_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_JIGSAW_NUMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_JIGSAW_NUM >=", value, "CI_JIGSAW_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_JIGSAW_NUMLessThan(BigDecimal value) {
            addCriterion("CI_JIGSAW_NUM <", value, "CI_JIGSAW_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_JIGSAW_NUMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_JIGSAW_NUM <=", value, "CI_JIGSAW_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_JIGSAW_NUMIn(List<BigDecimal> values) {
            addCriterion("CI_JIGSAW_NUM in", values, "CI_JIGSAW_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_JIGSAW_NUMNotIn(List<BigDecimal> values) {
            addCriterion("CI_JIGSAW_NUM not in", values, "CI_JIGSAW_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_JIGSAW_NUMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_JIGSAW_NUM between", value1, value2, "CI_JIGSAW_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_JIGSAW_NUMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_JIGSAW_NUM not between", value1, value2, "CI_JIGSAW_NUM");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZEIsNull() {
            addCriterion("CI_FEEDER_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZEIsNotNull() {
            addCriterion("CI_FEEDER_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZEEqualTo(String value) {
            addCriterion("CI_FEEDER_SIZE =", value, "CI_FEEDER_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZENotEqualTo(String value) {
            addCriterion("CI_FEEDER_SIZE <>", value, "CI_FEEDER_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZEGreaterThan(String value) {
            addCriterion("CI_FEEDER_SIZE >", value, "CI_FEEDER_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_FEEDER_SIZE >=", value, "CI_FEEDER_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZELessThan(String value) {
            addCriterion("CI_FEEDER_SIZE <", value, "CI_FEEDER_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZELessThanOrEqualTo(String value) {
            addCriterion("CI_FEEDER_SIZE <=", value, "CI_FEEDER_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZELike(String value) {
            addCriterion("CI_FEEDER_SIZE like", value, "CI_FEEDER_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZENotLike(String value) {
            addCriterion("CI_FEEDER_SIZE not like", value, "CI_FEEDER_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZEIn(List<String> values) {
            addCriterion("CI_FEEDER_SIZE in", values, "CI_FEEDER_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZENotIn(List<String> values) {
            addCriterion("CI_FEEDER_SIZE not in", values, "CI_FEEDER_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZEBetween(String value1, String value2) {
            addCriterion("CI_FEEDER_SIZE between", value1, value2, "CI_FEEDER_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_FEEDER_SIZENotBetween(String value1, String value2) {
            addCriterion("CI_FEEDER_SIZE not between", value1, value2, "CI_FEEDER_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPEIsNull() {
            addCriterion("CI_PACK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPEIsNotNull() {
            addCriterion("CI_PACK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPEEqualTo(String value) {
            addCriterion("CI_PACK_TYPE =", value, "CI_PACK_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPENotEqualTo(String value) {
            addCriterion("CI_PACK_TYPE <>", value, "CI_PACK_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPEGreaterThan(String value) {
            addCriterion("CI_PACK_TYPE >", value, "CI_PACK_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_PACK_TYPE >=", value, "CI_PACK_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPELessThan(String value) {
            addCriterion("CI_PACK_TYPE <", value, "CI_PACK_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPELessThanOrEqualTo(String value) {
            addCriterion("CI_PACK_TYPE <=", value, "CI_PACK_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPELike(String value) {
            addCriterion("CI_PACK_TYPE like", value, "CI_PACK_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPENotLike(String value) {
            addCriterion("CI_PACK_TYPE not like", value, "CI_PACK_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPEIn(List<String> values) {
            addCriterion("CI_PACK_TYPE in", values, "CI_PACK_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPENotIn(List<String> values) {
            addCriterion("CI_PACK_TYPE not in", values, "CI_PACK_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPEBetween(String value1, String value2) {
            addCriterion("CI_PACK_TYPE between", value1, value2, "CI_PACK_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_PACK_TYPENotBetween(String value1, String value2) {
            addCriterion("CI_PACK_TYPE not between", value1, value2, "CI_PACK_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_PRINT_TIMEIsNull() {
            addCriterion("CI_PRINT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCI_PRINT_TIMEIsNotNull() {
            addCriterion("CI_PRINT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCI_PRINT_TIMEEqualTo(BigDecimal value) {
            addCriterion("CI_PRINT_TIME =", value, "CI_PRINT_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_PRINT_TIMENotEqualTo(BigDecimal value) {
            addCriterion("CI_PRINT_TIME <>", value, "CI_PRINT_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_PRINT_TIMEGreaterThan(BigDecimal value) {
            addCriterion("CI_PRINT_TIME >", value, "CI_PRINT_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_PRINT_TIMEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_PRINT_TIME >=", value, "CI_PRINT_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_PRINT_TIMELessThan(BigDecimal value) {
            addCriterion("CI_PRINT_TIME <", value, "CI_PRINT_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_PRINT_TIMELessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_PRINT_TIME <=", value, "CI_PRINT_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_PRINT_TIMEIn(List<BigDecimal> values) {
            addCriterion("CI_PRINT_TIME in", values, "CI_PRINT_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_PRINT_TIMENotIn(List<BigDecimal> values) {
            addCriterion("CI_PRINT_TIME not in", values, "CI_PRINT_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_PRINT_TIMEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_PRINT_TIME between", value1, value2, "CI_PRINT_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_PRINT_TIMENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_PRINT_TIME not between", value1, value2, "CI_PRINT_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_FEED_ANGLEIsNull() {
            addCriterion("CI_FEED_ANGLE is null");
            return (Criteria) this;
        }

        public Criteria andCI_FEED_ANGLEIsNotNull() {
            addCriterion("CI_FEED_ANGLE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_FEED_ANGLEEqualTo(BigDecimal value) {
            addCriterion("CI_FEED_ANGLE =", value, "CI_FEED_ANGLE");
            return (Criteria) this;
        }

        public Criteria andCI_FEED_ANGLENotEqualTo(BigDecimal value) {
            addCriterion("CI_FEED_ANGLE <>", value, "CI_FEED_ANGLE");
            return (Criteria) this;
        }

        public Criteria andCI_FEED_ANGLEGreaterThan(BigDecimal value) {
            addCriterion("CI_FEED_ANGLE >", value, "CI_FEED_ANGLE");
            return (Criteria) this;
        }

        public Criteria andCI_FEED_ANGLEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_FEED_ANGLE >=", value, "CI_FEED_ANGLE");
            return (Criteria) this;
        }

        public Criteria andCI_FEED_ANGLELessThan(BigDecimal value) {
            addCriterion("CI_FEED_ANGLE <", value, "CI_FEED_ANGLE");
            return (Criteria) this;
        }

        public Criteria andCI_FEED_ANGLELessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_FEED_ANGLE <=", value, "CI_FEED_ANGLE");
            return (Criteria) this;
        }

        public Criteria andCI_FEED_ANGLEIn(List<BigDecimal> values) {
            addCriterion("CI_FEED_ANGLE in", values, "CI_FEED_ANGLE");
            return (Criteria) this;
        }

        public Criteria andCI_FEED_ANGLENotIn(List<BigDecimal> values) {
            addCriterion("CI_FEED_ANGLE not in", values, "CI_FEED_ANGLE");
            return (Criteria) this;
        }

        public Criteria andCI_FEED_ANGLEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_FEED_ANGLE between", value1, value2, "CI_FEED_ANGLE");
            return (Criteria) this;
        }

        public Criteria andCI_FEED_ANGLENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_FEED_ANGLE not between", value1, value2, "CI_FEED_ANGLE");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_CYCLEIsNull() {
            addCriterion("CI_STOCK_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_CYCLEIsNotNull() {
            addCriterion("CI_STOCK_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_CYCLEEqualTo(BigDecimal value) {
            addCriterion("CI_STOCK_CYCLE =", value, "CI_STOCK_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_CYCLENotEqualTo(BigDecimal value) {
            addCriterion("CI_STOCK_CYCLE <>", value, "CI_STOCK_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_CYCLEGreaterThan(BigDecimal value) {
            addCriterion("CI_STOCK_CYCLE >", value, "CI_STOCK_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_CYCLEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_STOCK_CYCLE >=", value, "CI_STOCK_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_CYCLELessThan(BigDecimal value) {
            addCriterion("CI_STOCK_CYCLE <", value, "CI_STOCK_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_CYCLELessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_STOCK_CYCLE <=", value, "CI_STOCK_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_CYCLEIn(List<BigDecimal> values) {
            addCriterion("CI_STOCK_CYCLE in", values, "CI_STOCK_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_CYCLENotIn(List<BigDecimal> values) {
            addCriterion("CI_STOCK_CYCLE not in", values, "CI_STOCK_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_CYCLEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_STOCK_CYCLE between", value1, value2, "CI_STOCK_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_CYCLENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_STOCK_CYCLE not between", value1, value2, "CI_STOCK_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_CYCLE_REMINDIsNull() {
            addCriterion("CI_CYCLE_REMIND is null");
            return (Criteria) this;
        }

        public Criteria andCI_CYCLE_REMINDIsNotNull() {
            addCriterion("CI_CYCLE_REMIND is not null");
            return (Criteria) this;
        }

        public Criteria andCI_CYCLE_REMINDEqualTo(BigDecimal value) {
            addCriterion("CI_CYCLE_REMIND =", value, "CI_CYCLE_REMIND");
            return (Criteria) this;
        }

        public Criteria andCI_CYCLE_REMINDNotEqualTo(BigDecimal value) {
            addCriterion("CI_CYCLE_REMIND <>", value, "CI_CYCLE_REMIND");
            return (Criteria) this;
        }

        public Criteria andCI_CYCLE_REMINDGreaterThan(BigDecimal value) {
            addCriterion("CI_CYCLE_REMIND >", value, "CI_CYCLE_REMIND");
            return (Criteria) this;
        }

        public Criteria andCI_CYCLE_REMINDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_CYCLE_REMIND >=", value, "CI_CYCLE_REMIND");
            return (Criteria) this;
        }

        public Criteria andCI_CYCLE_REMINDLessThan(BigDecimal value) {
            addCriterion("CI_CYCLE_REMIND <", value, "CI_CYCLE_REMIND");
            return (Criteria) this;
        }

        public Criteria andCI_CYCLE_REMINDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_CYCLE_REMIND <=", value, "CI_CYCLE_REMIND");
            return (Criteria) this;
        }

        public Criteria andCI_CYCLE_REMINDIn(List<BigDecimal> values) {
            addCriterion("CI_CYCLE_REMIND in", values, "CI_CYCLE_REMIND");
            return (Criteria) this;
        }

        public Criteria andCI_CYCLE_REMINDNotIn(List<BigDecimal> values) {
            addCriterion("CI_CYCLE_REMIND not in", values, "CI_CYCLE_REMIND");
            return (Criteria) this;
        }

        public Criteria andCI_CYCLE_REMINDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_CYCLE_REMIND between", value1, value2, "CI_CYCLE_REMIND");
            return (Criteria) this;
        }

        public Criteria andCI_CYCLE_REMINDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_CYCLE_REMIND not between", value1, value2, "CI_CYCLE_REMIND");
            return (Criteria) this;
        }

        public Criteria andCI_FQC_QTYIsNull() {
            addCriterion("CI_FQC_QTY is null");
            return (Criteria) this;
        }

        public Criteria andCI_FQC_QTYIsNotNull() {
            addCriterion("CI_FQC_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andCI_FQC_QTYEqualTo(BigDecimal value) {
            addCriterion("CI_FQC_QTY =", value, "CI_FQC_QTY");
            return (Criteria) this;
        }

        public Criteria andCI_FQC_QTYNotEqualTo(BigDecimal value) {
            addCriterion("CI_FQC_QTY <>", value, "CI_FQC_QTY");
            return (Criteria) this;
        }

        public Criteria andCI_FQC_QTYGreaterThan(BigDecimal value) {
            addCriterion("CI_FQC_QTY >", value, "CI_FQC_QTY");
            return (Criteria) this;
        }

        public Criteria andCI_FQC_QTYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_FQC_QTY >=", value, "CI_FQC_QTY");
            return (Criteria) this;
        }

        public Criteria andCI_FQC_QTYLessThan(BigDecimal value) {
            addCriterion("CI_FQC_QTY <", value, "CI_FQC_QTY");
            return (Criteria) this;
        }

        public Criteria andCI_FQC_QTYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_FQC_QTY <=", value, "CI_FQC_QTY");
            return (Criteria) this;
        }

        public Criteria andCI_FQC_QTYIn(List<BigDecimal> values) {
            addCriterion("CI_FQC_QTY in", values, "CI_FQC_QTY");
            return (Criteria) this;
        }

        public Criteria andCI_FQC_QTYNotIn(List<BigDecimal> values) {
            addCriterion("CI_FQC_QTY not in", values, "CI_FQC_QTY");
            return (Criteria) this;
        }

        public Criteria andCI_FQC_QTYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_FQC_QTY between", value1, value2, "CI_FQC_QTY");
            return (Criteria) this;
        }

        public Criteria andCI_FQC_QTYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_FQC_QTY not between", value1, value2, "CI_FQC_QTY");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCIsNull() {
            addCriterion("CI_AUTO_FQC is null");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCIsNotNull() {
            addCriterion("CI_AUTO_FQC is not null");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCEqualTo(String value) {
            addCriterion("CI_AUTO_FQC =", value, "CI_AUTO_FQC");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCNotEqualTo(String value) {
            addCriterion("CI_AUTO_FQC <>", value, "CI_AUTO_FQC");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCGreaterThan(String value) {
            addCriterion("CI_AUTO_FQC >", value, "CI_AUTO_FQC");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCGreaterThanOrEqualTo(String value) {
            addCriterion("CI_AUTO_FQC >=", value, "CI_AUTO_FQC");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCLessThan(String value) {
            addCriterion("CI_AUTO_FQC <", value, "CI_AUTO_FQC");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCLessThanOrEqualTo(String value) {
            addCriterion("CI_AUTO_FQC <=", value, "CI_AUTO_FQC");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCLike(String value) {
            addCriterion("CI_AUTO_FQC like", value, "CI_AUTO_FQC");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCNotLike(String value) {
            addCriterion("CI_AUTO_FQC not like", value, "CI_AUTO_FQC");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCIn(List<String> values) {
            addCriterion("CI_AUTO_FQC in", values, "CI_AUTO_FQC");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCNotIn(List<String> values) {
            addCriterion("CI_AUTO_FQC not in", values, "CI_AUTO_FQC");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCBetween(String value1, String value2) {
            addCriterion("CI_AUTO_FQC between", value1, value2, "CI_AUTO_FQC");
            return (Criteria) this;
        }

        public Criteria andCI_AUTO_FQCNotBetween(String value1, String value2) {
            addCriterion("CI_AUTO_FQC not between", value1, value2, "CI_AUTO_FQC");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREEIsNull() {
            addCriterion("CI_IQC_FREE is null");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREEIsNotNull() {
            addCriterion("CI_IQC_FREE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREEEqualTo(String value) {
            addCriterion("CI_IQC_FREE =", value, "CI_IQC_FREE");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREENotEqualTo(String value) {
            addCriterion("CI_IQC_FREE <>", value, "CI_IQC_FREE");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREEGreaterThan(String value) {
            addCriterion("CI_IQC_FREE >", value, "CI_IQC_FREE");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_IQC_FREE >=", value, "CI_IQC_FREE");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREELessThan(String value) {
            addCriterion("CI_IQC_FREE <", value, "CI_IQC_FREE");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREELessThanOrEqualTo(String value) {
            addCriterion("CI_IQC_FREE <=", value, "CI_IQC_FREE");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREELike(String value) {
            addCriterion("CI_IQC_FREE like", value, "CI_IQC_FREE");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREENotLike(String value) {
            addCriterion("CI_IQC_FREE not like", value, "CI_IQC_FREE");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREEIn(List<String> values) {
            addCriterion("CI_IQC_FREE in", values, "CI_IQC_FREE");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREENotIn(List<String> values) {
            addCriterion("CI_IQC_FREE not in", values, "CI_IQC_FREE");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREEBetween(String value1, String value2) {
            addCriterion("CI_IQC_FREE between", value1, value2, "CI_IQC_FREE");
            return (Criteria) this;
        }

        public Criteria andCI_IQC_FREENotBetween(String value1, String value2) {
            addCriterion("CI_IQC_FREE not between", value1, value2, "CI_IQC_FREE");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGIsNull() {
            addCriterion("CI_SCRAP_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGIsNotNull() {
            addCriterion("CI_SCRAP_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGEqualTo(String value) {
            addCriterion("CI_SCRAP_FLAG =", value, "CI_SCRAP_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGNotEqualTo(String value) {
            addCriterion("CI_SCRAP_FLAG <>", value, "CI_SCRAP_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGGreaterThan(String value) {
            addCriterion("CI_SCRAP_FLAG >", value, "CI_SCRAP_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("CI_SCRAP_FLAG >=", value, "CI_SCRAP_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGLessThan(String value) {
            addCriterion("CI_SCRAP_FLAG <", value, "CI_SCRAP_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGLessThanOrEqualTo(String value) {
            addCriterion("CI_SCRAP_FLAG <=", value, "CI_SCRAP_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGLike(String value) {
            addCriterion("CI_SCRAP_FLAG like", value, "CI_SCRAP_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGNotLike(String value) {
            addCriterion("CI_SCRAP_FLAG not like", value, "CI_SCRAP_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGIn(List<String> values) {
            addCriterion("CI_SCRAP_FLAG in", values, "CI_SCRAP_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGNotIn(List<String> values) {
            addCriterion("CI_SCRAP_FLAG not in", values, "CI_SCRAP_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGBetween(String value1, String value2) {
            addCriterion("CI_SCRAP_FLAG between", value1, value2, "CI_SCRAP_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_SCRAP_FLAGNotBetween(String value1, String value2) {
            addCriterion("CI_SCRAP_FLAG not between", value1, value2, "CI_SCRAP_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_STOCKIsNull() {
            addCriterion("CI_MIN_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_STOCKIsNotNull() {
            addCriterion("CI_MIN_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_STOCKEqualTo(BigDecimal value) {
            addCriterion("CI_MIN_STOCK =", value, "CI_MIN_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_STOCKNotEqualTo(BigDecimal value) {
            addCriterion("CI_MIN_STOCK <>", value, "CI_MIN_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_STOCKGreaterThan(BigDecimal value) {
            addCriterion("CI_MIN_STOCK >", value, "CI_MIN_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_STOCKGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_MIN_STOCK >=", value, "CI_MIN_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_STOCKLessThan(BigDecimal value) {
            addCriterion("CI_MIN_STOCK <", value, "CI_MIN_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_STOCKLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_MIN_STOCK <=", value, "CI_MIN_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_STOCKIn(List<BigDecimal> values) {
            addCriterion("CI_MIN_STOCK in", values, "CI_MIN_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_STOCKNotIn(List<BigDecimal> values) {
            addCriterion("CI_MIN_STOCK not in", values, "CI_MIN_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_STOCKBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_MIN_STOCK between", value1, value2, "CI_MIN_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MIN_STOCKNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_MIN_STOCK not between", value1, value2, "CI_MIN_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MAX_STOCKIsNull() {
            addCriterion("CI_MAX_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andCI_MAX_STOCKIsNotNull() {
            addCriterion("CI_MAX_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andCI_MAX_STOCKEqualTo(BigDecimal value) {
            addCriterion("CI_MAX_STOCK =", value, "CI_MAX_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MAX_STOCKNotEqualTo(BigDecimal value) {
            addCriterion("CI_MAX_STOCK <>", value, "CI_MAX_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MAX_STOCKGreaterThan(BigDecimal value) {
            addCriterion("CI_MAX_STOCK >", value, "CI_MAX_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MAX_STOCKGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_MAX_STOCK >=", value, "CI_MAX_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MAX_STOCKLessThan(BigDecimal value) {
            addCriterion("CI_MAX_STOCK <", value, "CI_MAX_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MAX_STOCKLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_MAX_STOCK <=", value, "CI_MAX_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MAX_STOCKIn(List<BigDecimal> values) {
            addCriterion("CI_MAX_STOCK in", values, "CI_MAX_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MAX_STOCKNotIn(List<BigDecimal> values) {
            addCriterion("CI_MAX_STOCK not in", values, "CI_MAX_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MAX_STOCKBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_MAX_STOCK between", value1, value2, "CI_MAX_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_MAX_STOCKNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_MAX_STOCK not between", value1, value2, "CI_MAX_STOCK");
            return (Criteria) this;
        }

        public Criteria andCI_STANDARD_WEIGHTSIsNull() {
            addCriterion("CI_STANDARD_WEIGHTS is null");
            return (Criteria) this;
        }

        public Criteria andCI_STANDARD_WEIGHTSIsNotNull() {
            addCriterion("CI_STANDARD_WEIGHTS is not null");
            return (Criteria) this;
        }

        public Criteria andCI_STANDARD_WEIGHTSEqualTo(BigDecimal value) {
            addCriterion("CI_STANDARD_WEIGHTS =", value, "CI_STANDARD_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_STANDARD_WEIGHTSNotEqualTo(BigDecimal value) {
            addCriterion("CI_STANDARD_WEIGHTS <>", value, "CI_STANDARD_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_STANDARD_WEIGHTSGreaterThan(BigDecimal value) {
            addCriterion("CI_STANDARD_WEIGHTS >", value, "CI_STANDARD_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_STANDARD_WEIGHTSGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_STANDARD_WEIGHTS >=", value, "CI_STANDARD_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_STANDARD_WEIGHTSLessThan(BigDecimal value) {
            addCriterion("CI_STANDARD_WEIGHTS <", value, "CI_STANDARD_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_STANDARD_WEIGHTSLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_STANDARD_WEIGHTS <=", value, "CI_STANDARD_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_STANDARD_WEIGHTSIn(List<BigDecimal> values) {
            addCriterion("CI_STANDARD_WEIGHTS in", values, "CI_STANDARD_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_STANDARD_WEIGHTSNotIn(List<BigDecimal> values) {
            addCriterion("CI_STANDARD_WEIGHTS not in", values, "CI_STANDARD_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_STANDARD_WEIGHTSBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_STANDARD_WEIGHTS between", value1, value2, "CI_STANDARD_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_STANDARD_WEIGHTSNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_STANDARD_WEIGHTS not between", value1, value2, "CI_STANDARD_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_FULL_WEIGHTSIsNull() {
            addCriterion("CI_FULL_WEIGHTS is null");
            return (Criteria) this;
        }

        public Criteria andCI_FULL_WEIGHTSIsNotNull() {
            addCriterion("CI_FULL_WEIGHTS is not null");
            return (Criteria) this;
        }

        public Criteria andCI_FULL_WEIGHTSEqualTo(BigDecimal value) {
            addCriterion("CI_FULL_WEIGHTS =", value, "CI_FULL_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_FULL_WEIGHTSNotEqualTo(BigDecimal value) {
            addCriterion("CI_FULL_WEIGHTS <>", value, "CI_FULL_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_FULL_WEIGHTSGreaterThan(BigDecimal value) {
            addCriterion("CI_FULL_WEIGHTS >", value, "CI_FULL_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_FULL_WEIGHTSGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_FULL_WEIGHTS >=", value, "CI_FULL_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_FULL_WEIGHTSLessThan(BigDecimal value) {
            addCriterion("CI_FULL_WEIGHTS <", value, "CI_FULL_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_FULL_WEIGHTSLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_FULL_WEIGHTS <=", value, "CI_FULL_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_FULL_WEIGHTSIn(List<BigDecimal> values) {
            addCriterion("CI_FULL_WEIGHTS in", values, "CI_FULL_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_FULL_WEIGHTSNotIn(List<BigDecimal> values) {
            addCriterion("CI_FULL_WEIGHTS not in", values, "CI_FULL_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_FULL_WEIGHTSBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_FULL_WEIGHTS between", value1, value2, "CI_FULL_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_FULL_WEIGHTSNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_FULL_WEIGHTS not between", value1, value2, "CI_FULL_WEIGHTS");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGIsNull() {
            addCriterion("CI_TEST_FALG is null");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGIsNotNull() {
            addCriterion("CI_TEST_FALG is not null");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGEqualTo(String value) {
            addCriterion("CI_TEST_FALG =", value, "CI_TEST_FALG");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGNotEqualTo(String value) {
            addCriterion("CI_TEST_FALG <>", value, "CI_TEST_FALG");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGGreaterThan(String value) {
            addCriterion("CI_TEST_FALG >", value, "CI_TEST_FALG");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGGreaterThanOrEqualTo(String value) {
            addCriterion("CI_TEST_FALG >=", value, "CI_TEST_FALG");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGLessThan(String value) {
            addCriterion("CI_TEST_FALG <", value, "CI_TEST_FALG");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGLessThanOrEqualTo(String value) {
            addCriterion("CI_TEST_FALG <=", value, "CI_TEST_FALG");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGLike(String value) {
            addCriterion("CI_TEST_FALG like", value, "CI_TEST_FALG");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGNotLike(String value) {
            addCriterion("CI_TEST_FALG not like", value, "CI_TEST_FALG");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGIn(List<String> values) {
            addCriterion("CI_TEST_FALG in", values, "CI_TEST_FALG");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGNotIn(List<String> values) {
            addCriterion("CI_TEST_FALG not in", values, "CI_TEST_FALG");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGBetween(String value1, String value2) {
            addCriterion("CI_TEST_FALG between", value1, value2, "CI_TEST_FALG");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_FALGNotBetween(String value1, String value2) {
            addCriterion("CI_TEST_FALG not between", value1, value2, "CI_TEST_FALG");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITIsNull() {
            addCriterion("CI_TEST_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITIsNotNull() {
            addCriterion("CI_TEST_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITEqualTo(String value) {
            addCriterion("CI_TEST_UNIT =", value, "CI_TEST_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITNotEqualTo(String value) {
            addCriterion("CI_TEST_UNIT <>", value, "CI_TEST_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITGreaterThan(String value) {
            addCriterion("CI_TEST_UNIT >", value, "CI_TEST_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITGreaterThanOrEqualTo(String value) {
            addCriterion("CI_TEST_UNIT >=", value, "CI_TEST_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITLessThan(String value) {
            addCriterion("CI_TEST_UNIT <", value, "CI_TEST_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITLessThanOrEqualTo(String value) {
            addCriterion("CI_TEST_UNIT <=", value, "CI_TEST_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITLike(String value) {
            addCriterion("CI_TEST_UNIT like", value, "CI_TEST_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITNotLike(String value) {
            addCriterion("CI_TEST_UNIT not like", value, "CI_TEST_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITIn(List<String> values) {
            addCriterion("CI_TEST_UNIT in", values, "CI_TEST_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITNotIn(List<String> values) {
            addCriterion("CI_TEST_UNIT not in", values, "CI_TEST_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITBetween(String value1, String value2) {
            addCriterion("CI_TEST_UNIT between", value1, value2, "CI_TEST_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_UNITNotBetween(String value1, String value2) {
            addCriterion("CI_TEST_UNIT not between", value1, value2, "CI_TEST_UNIT");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MAXIsNull() {
            addCriterion("CI_TEST_MAX is null");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MAXIsNotNull() {
            addCriterion("CI_TEST_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MAXEqualTo(BigDecimal value) {
            addCriterion("CI_TEST_MAX =", value, "CI_TEST_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MAXNotEqualTo(BigDecimal value) {
            addCriterion("CI_TEST_MAX <>", value, "CI_TEST_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MAXGreaterThan(BigDecimal value) {
            addCriterion("CI_TEST_MAX >", value, "CI_TEST_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MAXGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_TEST_MAX >=", value, "CI_TEST_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MAXLessThan(BigDecimal value) {
            addCriterion("CI_TEST_MAX <", value, "CI_TEST_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MAXLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_TEST_MAX <=", value, "CI_TEST_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MAXIn(List<BigDecimal> values) {
            addCriterion("CI_TEST_MAX in", values, "CI_TEST_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MAXNotIn(List<BigDecimal> values) {
            addCriterion("CI_TEST_MAX not in", values, "CI_TEST_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MAXBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_TEST_MAX between", value1, value2, "CI_TEST_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MAXNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_TEST_MAX not between", value1, value2, "CI_TEST_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MINIsNull() {
            addCriterion("CI_TEST_MIN is null");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MINIsNotNull() {
            addCriterion("CI_TEST_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MINEqualTo(BigDecimal value) {
            addCriterion("CI_TEST_MIN =", value, "CI_TEST_MIN");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MINNotEqualTo(BigDecimal value) {
            addCriterion("CI_TEST_MIN <>", value, "CI_TEST_MIN");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MINGreaterThan(BigDecimal value) {
            addCriterion("CI_TEST_MIN >", value, "CI_TEST_MIN");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MINGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_TEST_MIN >=", value, "CI_TEST_MIN");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MINLessThan(BigDecimal value) {
            addCriterion("CI_TEST_MIN <", value, "CI_TEST_MIN");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MINLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_TEST_MIN <=", value, "CI_TEST_MIN");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MINIn(List<BigDecimal> values) {
            addCriterion("CI_TEST_MIN in", values, "CI_TEST_MIN");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MINNotIn(List<BigDecimal> values) {
            addCriterion("CI_TEST_MIN not in", values, "CI_TEST_MIN");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MINBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_TEST_MIN between", value1, value2, "CI_TEST_MIN");
            return (Criteria) this;
        }

        public Criteria andCI_TEST_MINNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_TEST_MIN not between", value1, value2, "CI_TEST_MIN");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGIsNull() {
            addCriterion("CI_MSD_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGIsNotNull() {
            addCriterion("CI_MSD_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGEqualTo(String value) {
            addCriterion("CI_MSD_FLAG =", value, "CI_MSD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGNotEqualTo(String value) {
            addCriterion("CI_MSD_FLAG <>", value, "CI_MSD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGGreaterThan(String value) {
            addCriterion("CI_MSD_FLAG >", value, "CI_MSD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("CI_MSD_FLAG >=", value, "CI_MSD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGLessThan(String value) {
            addCriterion("CI_MSD_FLAG <", value, "CI_MSD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGLessThanOrEqualTo(String value) {
            addCriterion("CI_MSD_FLAG <=", value, "CI_MSD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGLike(String value) {
            addCriterion("CI_MSD_FLAG like", value, "CI_MSD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGNotLike(String value) {
            addCriterion("CI_MSD_FLAG not like", value, "CI_MSD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGIn(List<String> values) {
            addCriterion("CI_MSD_FLAG in", values, "CI_MSD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGNotIn(List<String> values) {
            addCriterion("CI_MSD_FLAG not in", values, "CI_MSD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGBetween(String value1, String value2) {
            addCriterion("CI_MSD_FLAG between", value1, value2, "CI_MSD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_FLAGNotBetween(String value1, String value2) {
            addCriterion("CI_MSD_FLAG not between", value1, value2, "CI_MSD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDIsNull() {
            addCriterion("CI_MSD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDIsNotNull() {
            addCriterion("CI_MSD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDEqualTo(String value) {
            addCriterion("CI_MSD_ID =", value, "CI_MSD_ID");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDNotEqualTo(String value) {
            addCriterion("CI_MSD_ID <>", value, "CI_MSD_ID");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDGreaterThan(String value) {
            addCriterion("CI_MSD_ID >", value, "CI_MSD_ID");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDGreaterThanOrEqualTo(String value) {
            addCriterion("CI_MSD_ID >=", value, "CI_MSD_ID");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDLessThan(String value) {
            addCriterion("CI_MSD_ID <", value, "CI_MSD_ID");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDLessThanOrEqualTo(String value) {
            addCriterion("CI_MSD_ID <=", value, "CI_MSD_ID");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDLike(String value) {
            addCriterion("CI_MSD_ID like", value, "CI_MSD_ID");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDNotLike(String value) {
            addCriterion("CI_MSD_ID not like", value, "CI_MSD_ID");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDIn(List<String> values) {
            addCriterion("CI_MSD_ID in", values, "CI_MSD_ID");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDNotIn(List<String> values) {
            addCriterion("CI_MSD_ID not in", values, "CI_MSD_ID");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDBetween(String value1, String value2) {
            addCriterion("CI_MSD_ID between", value1, value2, "CI_MSD_ID");
            return (Criteria) this;
        }

        public Criteria andCI_MSD_IDNotBetween(String value1, String value2) {
            addCriterion("CI_MSD_ID not between", value1, value2, "CI_MSD_ID");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGIsNull() {
            addCriterion("CI_ROHS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGIsNotNull() {
            addCriterion("CI_ROHS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGEqualTo(String value) {
            addCriterion("CI_ROHS_FLAG =", value, "CI_ROHS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGNotEqualTo(String value) {
            addCriterion("CI_ROHS_FLAG <>", value, "CI_ROHS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGGreaterThan(String value) {
            addCriterion("CI_ROHS_FLAG >", value, "CI_ROHS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("CI_ROHS_FLAG >=", value, "CI_ROHS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGLessThan(String value) {
            addCriterion("CI_ROHS_FLAG <", value, "CI_ROHS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGLessThanOrEqualTo(String value) {
            addCriterion("CI_ROHS_FLAG <=", value, "CI_ROHS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGLike(String value) {
            addCriterion("CI_ROHS_FLAG like", value, "CI_ROHS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGNotLike(String value) {
            addCriterion("CI_ROHS_FLAG not like", value, "CI_ROHS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGIn(List<String> values) {
            addCriterion("CI_ROHS_FLAG in", values, "CI_ROHS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGNotIn(List<String> values) {
            addCriterion("CI_ROHS_FLAG not in", values, "CI_ROHS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGBetween(String value1, String value2) {
            addCriterion("CI_ROHS_FLAG between", value1, value2, "CI_ROHS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_ROHS_FLAGNotBetween(String value1, String value2) {
            addCriterion("CI_ROHS_FLAG not between", value1, value2, "CI_ROHS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMIsNull() {
            addCriterion("CI_CUST_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMIsNotNull() {
            addCriterion("CI_CUST_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMEqualTo(String value) {
            addCriterion("CI_CUST_ITEM =", value, "CI_CUST_ITEM");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMNotEqualTo(String value) {
            addCriterion("CI_CUST_ITEM <>", value, "CI_CUST_ITEM");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMGreaterThan(String value) {
            addCriterion("CI_CUST_ITEM >", value, "CI_CUST_ITEM");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMGreaterThanOrEqualTo(String value) {
            addCriterion("CI_CUST_ITEM >=", value, "CI_CUST_ITEM");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMLessThan(String value) {
            addCriterion("CI_CUST_ITEM <", value, "CI_CUST_ITEM");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMLessThanOrEqualTo(String value) {
            addCriterion("CI_CUST_ITEM <=", value, "CI_CUST_ITEM");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMLike(String value) {
            addCriterion("CI_CUST_ITEM like", value, "CI_CUST_ITEM");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMNotLike(String value) {
            addCriterion("CI_CUST_ITEM not like", value, "CI_CUST_ITEM");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMIn(List<String> values) {
            addCriterion("CI_CUST_ITEM in", values, "CI_CUST_ITEM");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMNotIn(List<String> values) {
            addCriterion("CI_CUST_ITEM not in", values, "CI_CUST_ITEM");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMBetween(String value1, String value2) {
            addCriterion("CI_CUST_ITEM between", value1, value2, "CI_CUST_ITEM");
            return (Criteria) this;
        }

        public Criteria andCI_CUST_ITEMNotBetween(String value1, String value2) {
            addCriterion("CI_CUST_ITEM not between", value1, value2, "CI_CUST_ITEM");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGIsNull() {
            addCriterion("CI_PCB_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGIsNotNull() {
            addCriterion("CI_PCB_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGEqualTo(String value) {
            addCriterion("CI_PCB_FLAG =", value, "CI_PCB_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGNotEqualTo(String value) {
            addCriterion("CI_PCB_FLAG <>", value, "CI_PCB_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGGreaterThan(String value) {
            addCriterion("CI_PCB_FLAG >", value, "CI_PCB_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("CI_PCB_FLAG >=", value, "CI_PCB_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGLessThan(String value) {
            addCriterion("CI_PCB_FLAG <", value, "CI_PCB_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGLessThanOrEqualTo(String value) {
            addCriterion("CI_PCB_FLAG <=", value, "CI_PCB_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGLike(String value) {
            addCriterion("CI_PCB_FLAG like", value, "CI_PCB_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGNotLike(String value) {
            addCriterion("CI_PCB_FLAG not like", value, "CI_PCB_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGIn(List<String> values) {
            addCriterion("CI_PCB_FLAG in", values, "CI_PCB_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGNotIn(List<String> values) {
            addCriterion("CI_PCB_FLAG not in", values, "CI_PCB_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGBetween(String value1, String value2) {
            addCriterion("CI_PCB_FLAG between", value1, value2, "CI_PCB_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_PCB_FLAGNotBetween(String value1, String value2) {
            addCriterion("CI_PCB_FLAG not between", value1, value2, "CI_PCB_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_MEMOIsNull() {
            addCriterion("CI_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andCI_MEMOIsNotNull() {
            addCriterion("CI_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andCI_MEMOEqualTo(String value) {
            addCriterion("CI_MEMO =", value, "CI_MEMO");
            return (Criteria) this;
        }

        public Criteria andCI_MEMONotEqualTo(String value) {
            addCriterion("CI_MEMO <>", value, "CI_MEMO");
            return (Criteria) this;
        }

        public Criteria andCI_MEMOGreaterThan(String value) {
            addCriterion("CI_MEMO >", value, "CI_MEMO");
            return (Criteria) this;
        }

        public Criteria andCI_MEMOGreaterThanOrEqualTo(String value) {
            addCriterion("CI_MEMO >=", value, "CI_MEMO");
            return (Criteria) this;
        }

        public Criteria andCI_MEMOLessThan(String value) {
            addCriterion("CI_MEMO <", value, "CI_MEMO");
            return (Criteria) this;
        }

        public Criteria andCI_MEMOLessThanOrEqualTo(String value) {
            addCriterion("CI_MEMO <=", value, "CI_MEMO");
            return (Criteria) this;
        }

        public Criteria andCI_MEMOLike(String value) {
            addCriterion("CI_MEMO like", value, "CI_MEMO");
            return (Criteria) this;
        }

        public Criteria andCI_MEMONotLike(String value) {
            addCriterion("CI_MEMO not like", value, "CI_MEMO");
            return (Criteria) this;
        }

        public Criteria andCI_MEMOIn(List<String> values) {
            addCriterion("CI_MEMO in", values, "CI_MEMO");
            return (Criteria) this;
        }

        public Criteria andCI_MEMONotIn(List<String> values) {
            addCriterion("CI_MEMO not in", values, "CI_MEMO");
            return (Criteria) this;
        }

        public Criteria andCI_MEMOBetween(String value1, String value2) {
            addCriterion("CI_MEMO between", value1, value2, "CI_MEMO");
            return (Criteria) this;
        }

        public Criteria andCI_MEMONotBetween(String value1, String value2) {
            addCriterion("CI_MEMO not between", value1, value2, "CI_MEMO");
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

        public Criteria andCI_SN_RULE_BIsNull() {
            addCriterion("CI_SN_RULE_B is null");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BIsNotNull() {
            addCriterion("CI_SN_RULE_B is not null");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BEqualTo(String value) {
            addCriterion("CI_SN_RULE_B =", value, "CI_SN_RULE_B");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BNotEqualTo(String value) {
            addCriterion("CI_SN_RULE_B <>", value, "CI_SN_RULE_B");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BGreaterThan(String value) {
            addCriterion("CI_SN_RULE_B >", value, "CI_SN_RULE_B");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BGreaterThanOrEqualTo(String value) {
            addCriterion("CI_SN_RULE_B >=", value, "CI_SN_RULE_B");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BLessThan(String value) {
            addCriterion("CI_SN_RULE_B <", value, "CI_SN_RULE_B");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BLessThanOrEqualTo(String value) {
            addCriterion("CI_SN_RULE_B <=", value, "CI_SN_RULE_B");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BLike(String value) {
            addCriterion("CI_SN_RULE_B like", value, "CI_SN_RULE_B");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BNotLike(String value) {
            addCriterion("CI_SN_RULE_B not like", value, "CI_SN_RULE_B");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BIn(List<String> values) {
            addCriterion("CI_SN_RULE_B in", values, "CI_SN_RULE_B");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BNotIn(List<String> values) {
            addCriterion("CI_SN_RULE_B not in", values, "CI_SN_RULE_B");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BBetween(String value1, String value2) {
            addCriterion("CI_SN_RULE_B between", value1, value2, "CI_SN_RULE_B");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_BNotBetween(String value1, String value2) {
            addCriterion("CI_SN_RULE_B not between", value1, value2, "CI_SN_RULE_B");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SIsNull() {
            addCriterion("CI_SN_RULE_S is null");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SIsNotNull() {
            addCriterion("CI_SN_RULE_S is not null");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SEqualTo(String value) {
            addCriterion("CI_SN_RULE_S =", value, "CI_SN_RULE_S");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SNotEqualTo(String value) {
            addCriterion("CI_SN_RULE_S <>", value, "CI_SN_RULE_S");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SGreaterThan(String value) {
            addCriterion("CI_SN_RULE_S >", value, "CI_SN_RULE_S");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SGreaterThanOrEqualTo(String value) {
            addCriterion("CI_SN_RULE_S >=", value, "CI_SN_RULE_S");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SLessThan(String value) {
            addCriterion("CI_SN_RULE_S <", value, "CI_SN_RULE_S");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SLessThanOrEqualTo(String value) {
            addCriterion("CI_SN_RULE_S <=", value, "CI_SN_RULE_S");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SLike(String value) {
            addCriterion("CI_SN_RULE_S like", value, "CI_SN_RULE_S");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SNotLike(String value) {
            addCriterion("CI_SN_RULE_S not like", value, "CI_SN_RULE_S");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SIn(List<String> values) {
            addCriterion("CI_SN_RULE_S in", values, "CI_SN_RULE_S");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SNotIn(List<String> values) {
            addCriterion("CI_SN_RULE_S not in", values, "CI_SN_RULE_S");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SBetween(String value1, String value2) {
            addCriterion("CI_SN_RULE_S between", value1, value2, "CI_SN_RULE_S");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULE_SNotBetween(String value1, String value2) {
            addCriterion("CI_SN_RULE_S not between", value1, value2, "CI_SN_RULE_S");
            return (Criteria) this;
        }

        public Criteria andCI_SIZEIsNull() {
            addCriterion("CI_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andCI_SIZEIsNotNull() {
            addCriterion("CI_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_SIZEEqualTo(BigDecimal value) {
            addCriterion("CI_SIZE =", value, "CI_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_SIZENotEqualTo(BigDecimal value) {
            addCriterion("CI_SIZE <>", value, "CI_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_SIZEGreaterThan(BigDecimal value) {
            addCriterion("CI_SIZE >", value, "CI_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_SIZEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_SIZE >=", value, "CI_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_SIZELessThan(BigDecimal value) {
            addCriterion("CI_SIZE <", value, "CI_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_SIZELessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_SIZE <=", value, "CI_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_SIZEIn(List<BigDecimal> values) {
            addCriterion("CI_SIZE in", values, "CI_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_SIZENotIn(List<BigDecimal> values) {
            addCriterion("CI_SIZE not in", values, "CI_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_SIZEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_SIZE between", value1, value2, "CI_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_SIZENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_SIZE not between", value1, value2, "CI_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_REPAIR_MAXIsNull() {
            addCriterion("CI_REPAIR_MAX is null");
            return (Criteria) this;
        }

        public Criteria andCI_REPAIR_MAXIsNotNull() {
            addCriterion("CI_REPAIR_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andCI_REPAIR_MAXEqualTo(BigDecimal value) {
            addCriterion("CI_REPAIR_MAX =", value, "CI_REPAIR_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_REPAIR_MAXNotEqualTo(BigDecimal value) {
            addCriterion("CI_REPAIR_MAX <>", value, "CI_REPAIR_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_REPAIR_MAXGreaterThan(BigDecimal value) {
            addCriterion("CI_REPAIR_MAX >", value, "CI_REPAIR_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_REPAIR_MAXGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_REPAIR_MAX >=", value, "CI_REPAIR_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_REPAIR_MAXLessThan(BigDecimal value) {
            addCriterion("CI_REPAIR_MAX <", value, "CI_REPAIR_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_REPAIR_MAXLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_REPAIR_MAX <=", value, "CI_REPAIR_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_REPAIR_MAXIn(List<BigDecimal> values) {
            addCriterion("CI_REPAIR_MAX in", values, "CI_REPAIR_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_REPAIR_MAXNotIn(List<BigDecimal> values) {
            addCriterion("CI_REPAIR_MAX not in", values, "CI_REPAIR_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_REPAIR_MAXBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_REPAIR_MAX between", value1, value2, "CI_REPAIR_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_REPAIR_MAXNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_REPAIR_MAX not between", value1, value2, "CI_REPAIR_MAX");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPEIsNull() {
            addCriterion("CI_CONTRAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPEIsNotNull() {
            addCriterion("CI_CONTRAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPEEqualTo(String value) {
            addCriterion("CI_CONTRAL_TYPE =", value, "CI_CONTRAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPENotEqualTo(String value) {
            addCriterion("CI_CONTRAL_TYPE <>", value, "CI_CONTRAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPEGreaterThan(String value) {
            addCriterion("CI_CONTRAL_TYPE >", value, "CI_CONTRAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_CONTRAL_TYPE >=", value, "CI_CONTRAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPELessThan(String value) {
            addCriterion("CI_CONTRAL_TYPE <", value, "CI_CONTRAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPELessThanOrEqualTo(String value) {
            addCriterion("CI_CONTRAL_TYPE <=", value, "CI_CONTRAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPELike(String value) {
            addCriterion("CI_CONTRAL_TYPE like", value, "CI_CONTRAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPENotLike(String value) {
            addCriterion("CI_CONTRAL_TYPE not like", value, "CI_CONTRAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPEIn(List<String> values) {
            addCriterion("CI_CONTRAL_TYPE in", values, "CI_CONTRAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPENotIn(List<String> values) {
            addCriterion("CI_CONTRAL_TYPE not in", values, "CI_CONTRAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPEBetween(String value1, String value2) {
            addCriterion("CI_CONTRAL_TYPE between", value1, value2, "CI_CONTRAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_CONTRAL_TYPENotBetween(String value1, String value2) {
            addCriterion("CI_CONTRAL_TYPE not between", value1, value2, "CI_CONTRAL_TYPE");
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

        public Criteria andCI_RECHECK_DAYSIsNull() {
            addCriterion("CI_RECHECK_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andCI_RECHECK_DAYSIsNotNull() {
            addCriterion("CI_RECHECK_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andCI_RECHECK_DAYSEqualTo(BigDecimal value) {
            addCriterion("CI_RECHECK_DAYS =", value, "CI_RECHECK_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_RECHECK_DAYSNotEqualTo(BigDecimal value) {
            addCriterion("CI_RECHECK_DAYS <>", value, "CI_RECHECK_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_RECHECK_DAYSGreaterThan(BigDecimal value) {
            addCriterion("CI_RECHECK_DAYS >", value, "CI_RECHECK_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_RECHECK_DAYSGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_RECHECK_DAYS >=", value, "CI_RECHECK_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_RECHECK_DAYSLessThan(BigDecimal value) {
            addCriterion("CI_RECHECK_DAYS <", value, "CI_RECHECK_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_RECHECK_DAYSLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_RECHECK_DAYS <=", value, "CI_RECHECK_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_RECHECK_DAYSIn(List<BigDecimal> values) {
            addCriterion("CI_RECHECK_DAYS in", values, "CI_RECHECK_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_RECHECK_DAYSNotIn(List<BigDecimal> values) {
            addCriterion("CI_RECHECK_DAYS not in", values, "CI_RECHECK_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_RECHECK_DAYSBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_RECHECK_DAYS between", value1, value2, "CI_RECHECK_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_RECHECK_DAYSNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_RECHECK_DAYS not between", value1, value2, "CI_RECHECK_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_REMIND_DAYSIsNull() {
            addCriterion("CI_REMIND_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andCI_REMIND_DAYSIsNotNull() {
            addCriterion("CI_REMIND_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andCI_REMIND_DAYSEqualTo(BigDecimal value) {
            addCriterion("CI_REMIND_DAYS =", value, "CI_REMIND_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_REMIND_DAYSNotEqualTo(BigDecimal value) {
            addCriterion("CI_REMIND_DAYS <>", value, "CI_REMIND_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_REMIND_DAYSGreaterThan(BigDecimal value) {
            addCriterion("CI_REMIND_DAYS >", value, "CI_REMIND_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_REMIND_DAYSGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_REMIND_DAYS >=", value, "CI_REMIND_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_REMIND_DAYSLessThan(BigDecimal value) {
            addCriterion("CI_REMIND_DAYS <", value, "CI_REMIND_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_REMIND_DAYSLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_REMIND_DAYS <=", value, "CI_REMIND_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_REMIND_DAYSIn(List<BigDecimal> values) {
            addCriterion("CI_REMIND_DAYS in", values, "CI_REMIND_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_REMIND_DAYSNotIn(List<BigDecimal> values) {
            addCriterion("CI_REMIND_DAYS not in", values, "CI_REMIND_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_REMIND_DAYSBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_REMIND_DAYS between", value1, value2, "CI_REMIND_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_REMIND_DAYSNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_REMIND_DAYS not between", value1, value2, "CI_REMIND_DAYS");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVEIsNull() {
            addCriterion("CI_EXCESS_RECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVEIsNotNull() {
            addCriterion("CI_EXCESS_RECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVEEqualTo(String value) {
            addCriterion("CI_EXCESS_RECEIVE =", value, "CI_EXCESS_RECEIVE");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVENotEqualTo(String value) {
            addCriterion("CI_EXCESS_RECEIVE <>", value, "CI_EXCESS_RECEIVE");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVEGreaterThan(String value) {
            addCriterion("CI_EXCESS_RECEIVE >", value, "CI_EXCESS_RECEIVE");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_EXCESS_RECEIVE >=", value, "CI_EXCESS_RECEIVE");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVELessThan(String value) {
            addCriterion("CI_EXCESS_RECEIVE <", value, "CI_EXCESS_RECEIVE");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVELessThanOrEqualTo(String value) {
            addCriterion("CI_EXCESS_RECEIVE <=", value, "CI_EXCESS_RECEIVE");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVELike(String value) {
            addCriterion("CI_EXCESS_RECEIVE like", value, "CI_EXCESS_RECEIVE");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVENotLike(String value) {
            addCriterion("CI_EXCESS_RECEIVE not like", value, "CI_EXCESS_RECEIVE");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVEIn(List<String> values) {
            addCriterion("CI_EXCESS_RECEIVE in", values, "CI_EXCESS_RECEIVE");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVENotIn(List<String> values) {
            addCriterion("CI_EXCESS_RECEIVE not in", values, "CI_EXCESS_RECEIVE");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVEBetween(String value1, String value2) {
            addCriterion("CI_EXCESS_RECEIVE between", value1, value2, "CI_EXCESS_RECEIVE");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_RECEIVENotBetween(String value1, String value2) {
            addCriterion("CI_EXCESS_RECEIVE not between", value1, value2, "CI_EXCESS_RECEIVE");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKIsNull() {
            addCriterion("CI_EXCESS_PICK is null");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKIsNotNull() {
            addCriterion("CI_EXCESS_PICK is not null");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKEqualTo(String value) {
            addCriterion("CI_EXCESS_PICK =", value, "CI_EXCESS_PICK");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKNotEqualTo(String value) {
            addCriterion("CI_EXCESS_PICK <>", value, "CI_EXCESS_PICK");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKGreaterThan(String value) {
            addCriterion("CI_EXCESS_PICK >", value, "CI_EXCESS_PICK");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKGreaterThanOrEqualTo(String value) {
            addCriterion("CI_EXCESS_PICK >=", value, "CI_EXCESS_PICK");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKLessThan(String value) {
            addCriterion("CI_EXCESS_PICK <", value, "CI_EXCESS_PICK");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKLessThanOrEqualTo(String value) {
            addCriterion("CI_EXCESS_PICK <=", value, "CI_EXCESS_PICK");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKLike(String value) {
            addCriterion("CI_EXCESS_PICK like", value, "CI_EXCESS_PICK");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKNotLike(String value) {
            addCriterion("CI_EXCESS_PICK not like", value, "CI_EXCESS_PICK");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKIn(List<String> values) {
            addCriterion("CI_EXCESS_PICK in", values, "CI_EXCESS_PICK");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKNotIn(List<String> values) {
            addCriterion("CI_EXCESS_PICK not in", values, "CI_EXCESS_PICK");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKBetween(String value1, String value2) {
            addCriterion("CI_EXCESS_PICK between", value1, value2, "CI_EXCESS_PICK");
            return (Criteria) this;
        }

        public Criteria andCI_EXCESS_PICKNotBetween(String value1, String value2) {
            addCriterion("CI_EXCESS_PICK not between", value1, value2, "CI_EXCESS_PICK");
            return (Criteria) this;
        }

        public Criteria andCI_AGING_TIMEIsNull() {
            addCriterion("CI_AGING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCI_AGING_TIMEIsNotNull() {
            addCriterion("CI_AGING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCI_AGING_TIMEEqualTo(BigDecimal value) {
            addCriterion("CI_AGING_TIME =", value, "CI_AGING_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_AGING_TIMENotEqualTo(BigDecimal value) {
            addCriterion("CI_AGING_TIME <>", value, "CI_AGING_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_AGING_TIMEGreaterThan(BigDecimal value) {
            addCriterion("CI_AGING_TIME >", value, "CI_AGING_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_AGING_TIMEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_AGING_TIME >=", value, "CI_AGING_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_AGING_TIMELessThan(BigDecimal value) {
            addCriterion("CI_AGING_TIME <", value, "CI_AGING_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_AGING_TIMELessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_AGING_TIME <=", value, "CI_AGING_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_AGING_TIMEIn(List<BigDecimal> values) {
            addCriterion("CI_AGING_TIME in", values, "CI_AGING_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_AGING_TIMENotIn(List<BigDecimal> values) {
            addCriterion("CI_AGING_TIME not in", values, "CI_AGING_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_AGING_TIMEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_AGING_TIME between", value1, value2, "CI_AGING_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_AGING_TIMENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_AGING_TIME not between", value1, value2, "CI_AGING_TIME");
            return (Criteria) this;
        }

        public Criteria andCI_SLUGGISH_CYCLEIsNull() {
            addCriterion("CI_SLUGGISH_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andCI_SLUGGISH_CYCLEIsNotNull() {
            addCriterion("CI_SLUGGISH_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_SLUGGISH_CYCLEEqualTo(BigDecimal value) {
            addCriterion("CI_SLUGGISH_CYCLE =", value, "CI_SLUGGISH_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_SLUGGISH_CYCLENotEqualTo(BigDecimal value) {
            addCriterion("CI_SLUGGISH_CYCLE <>", value, "CI_SLUGGISH_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_SLUGGISH_CYCLEGreaterThan(BigDecimal value) {
            addCriterion("CI_SLUGGISH_CYCLE >", value, "CI_SLUGGISH_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_SLUGGISH_CYCLEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_SLUGGISH_CYCLE >=", value, "CI_SLUGGISH_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_SLUGGISH_CYCLELessThan(BigDecimal value) {
            addCriterion("CI_SLUGGISH_CYCLE <", value, "CI_SLUGGISH_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_SLUGGISH_CYCLELessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_SLUGGISH_CYCLE <=", value, "CI_SLUGGISH_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_SLUGGISH_CYCLEIn(List<BigDecimal> values) {
            addCriterion("CI_SLUGGISH_CYCLE in", values, "CI_SLUGGISH_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_SLUGGISH_CYCLENotIn(List<BigDecimal> values) {
            addCriterion("CI_SLUGGISH_CYCLE not in", values, "CI_SLUGGISH_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_SLUGGISH_CYCLEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_SLUGGISH_CYCLE between", value1, value2, "CI_SLUGGISH_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_SLUGGISH_CYCLENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_SLUGGISH_CYCLE not between", value1, value2, "CI_SLUGGISH_CYCLE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZEIsNull() {
            addCriterion("CI_ITEM_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZEIsNotNull() {
            addCriterion("CI_ITEM_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZEEqualTo(String value) {
            addCriterion("CI_ITEM_SIZE =", value, "CI_ITEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZENotEqualTo(String value) {
            addCriterion("CI_ITEM_SIZE <>", value, "CI_ITEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZEGreaterThan(String value) {
            addCriterion("CI_ITEM_SIZE >", value, "CI_ITEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_SIZE >=", value, "CI_ITEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZELessThan(String value) {
            addCriterion("CI_ITEM_SIZE <", value, "CI_ITEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZELessThanOrEqualTo(String value) {
            addCriterion("CI_ITEM_SIZE <=", value, "CI_ITEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZELike(String value) {
            addCriterion("CI_ITEM_SIZE like", value, "CI_ITEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZENotLike(String value) {
            addCriterion("CI_ITEM_SIZE not like", value, "CI_ITEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZEIn(List<String> values) {
            addCriterion("CI_ITEM_SIZE in", values, "CI_ITEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZENotIn(List<String> values) {
            addCriterion("CI_ITEM_SIZE not in", values, "CI_ITEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZEBetween(String value1, String value2) {
            addCriterion("CI_ITEM_SIZE between", value1, value2, "CI_ITEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_ITEM_SIZENotBetween(String value1, String value2) {
            addCriterion("CI_ITEM_SIZE not between", value1, value2, "CI_ITEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIODIsNull() {
            addCriterion("CI_STOCK_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIODIsNotNull() {
            addCriterion("CI_STOCK_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIODEqualTo(BigDecimal value) {
            addCriterion("CI_STOCK_PERIOD =", value, "CI_STOCK_PERIOD");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIODNotEqualTo(BigDecimal value) {
            addCriterion("CI_STOCK_PERIOD <>", value, "CI_STOCK_PERIOD");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIODGreaterThan(BigDecimal value) {
            addCriterion("CI_STOCK_PERIOD >", value, "CI_STOCK_PERIOD");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIODGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_STOCK_PERIOD >=", value, "CI_STOCK_PERIOD");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIODLessThan(BigDecimal value) {
            addCriterion("CI_STOCK_PERIOD <", value, "CI_STOCK_PERIOD");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIODLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_STOCK_PERIOD <=", value, "CI_STOCK_PERIOD");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIODIn(List<BigDecimal> values) {
            addCriterion("CI_STOCK_PERIOD in", values, "CI_STOCK_PERIOD");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIODNotIn(List<BigDecimal> values) {
            addCriterion("CI_STOCK_PERIOD not in", values, "CI_STOCK_PERIOD");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIODBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_STOCK_PERIOD between", value1, value2, "CI_STOCK_PERIOD");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIODNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_STOCK_PERIOD not between", value1, value2, "CI_STOCK_PERIOD");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIOD_KEEPIsNull() {
            addCriterion("CI_STOCK_PERIOD_KEEP is null");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIOD_KEEPIsNotNull() {
            addCriterion("CI_STOCK_PERIOD_KEEP is not null");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIOD_KEEPEqualTo(BigDecimal value) {
            addCriterion("CI_STOCK_PERIOD_KEEP =", value, "CI_STOCK_PERIOD_KEEP");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIOD_KEEPNotEqualTo(BigDecimal value) {
            addCriterion("CI_STOCK_PERIOD_KEEP <>", value, "CI_STOCK_PERIOD_KEEP");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIOD_KEEPGreaterThan(BigDecimal value) {
            addCriterion("CI_STOCK_PERIOD_KEEP >", value, "CI_STOCK_PERIOD_KEEP");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIOD_KEEPGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_STOCK_PERIOD_KEEP >=", value, "CI_STOCK_PERIOD_KEEP");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIOD_KEEPLessThan(BigDecimal value) {
            addCriterion("CI_STOCK_PERIOD_KEEP <", value, "CI_STOCK_PERIOD_KEEP");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIOD_KEEPLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_STOCK_PERIOD_KEEP <=", value, "CI_STOCK_PERIOD_KEEP");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIOD_KEEPIn(List<BigDecimal> values) {
            addCriterion("CI_STOCK_PERIOD_KEEP in", values, "CI_STOCK_PERIOD_KEEP");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIOD_KEEPNotIn(List<BigDecimal> values) {
            addCriterion("CI_STOCK_PERIOD_KEEP not in", values, "CI_STOCK_PERIOD_KEEP");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIOD_KEEPBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_STOCK_PERIOD_KEEP between", value1, value2, "CI_STOCK_PERIOD_KEEP");
            return (Criteria) this;
        }

        public Criteria andCI_STOCK_PERIOD_KEEPNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_STOCK_PERIOD_KEEP not between", value1, value2, "CI_STOCK_PERIOD_KEEP");
            return (Criteria) this;
        }

        public Criteria andCI_OVERRATEIsNull() {
            addCriterion("CI_OVERRATE is null");
            return (Criteria) this;
        }

        public Criteria andCI_OVERRATEIsNotNull() {
            addCriterion("CI_OVERRATE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_OVERRATEEqualTo(BigDecimal value) {
            addCriterion("CI_OVERRATE =", value, "CI_OVERRATE");
            return (Criteria) this;
        }

        public Criteria andCI_OVERRATENotEqualTo(BigDecimal value) {
            addCriterion("CI_OVERRATE <>", value, "CI_OVERRATE");
            return (Criteria) this;
        }

        public Criteria andCI_OVERRATEGreaterThan(BigDecimal value) {
            addCriterion("CI_OVERRATE >", value, "CI_OVERRATE");
            return (Criteria) this;
        }

        public Criteria andCI_OVERRATEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_OVERRATE >=", value, "CI_OVERRATE");
            return (Criteria) this;
        }

        public Criteria andCI_OVERRATELessThan(BigDecimal value) {
            addCriterion("CI_OVERRATE <", value, "CI_OVERRATE");
            return (Criteria) this;
        }

        public Criteria andCI_OVERRATELessThanOrEqualTo(BigDecimal value) {
            addCriterion("CI_OVERRATE <=", value, "CI_OVERRATE");
            return (Criteria) this;
        }

        public Criteria andCI_OVERRATEIn(List<BigDecimal> values) {
            addCriterion("CI_OVERRATE in", values, "CI_OVERRATE");
            return (Criteria) this;
        }

        public Criteria andCI_OVERRATENotIn(List<BigDecimal> values) {
            addCriterion("CI_OVERRATE not in", values, "CI_OVERRATE");
            return (Criteria) this;
        }

        public Criteria andCI_OVERRATEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_OVERRATE between", value1, value2, "CI_OVERRATE");
            return (Criteria) this;
        }

        public Criteria andCI_OVERRATENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CI_OVERRATE not between", value1, value2, "CI_OVERRATE");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERIsNull() {
            addCriterion("CI_MANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERIsNotNull() {
            addCriterion("CI_MANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTUREREqualTo(String value) {
            addCriterion("CI_MANUFACTURER =", value, "CI_MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERNotEqualTo(String value) {
            addCriterion("CI_MANUFACTURER <>", value, "CI_MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERGreaterThan(String value) {
            addCriterion("CI_MANUFACTURER >", value, "CI_MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERGreaterThanOrEqualTo(String value) {
            addCriterion("CI_MANUFACTURER >=", value, "CI_MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERLessThan(String value) {
            addCriterion("CI_MANUFACTURER <", value, "CI_MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERLessThanOrEqualTo(String value) {
            addCriterion("CI_MANUFACTURER <=", value, "CI_MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERLike(String value) {
            addCriterion("CI_MANUFACTURER like", value, "CI_MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERNotLike(String value) {
            addCriterion("CI_MANUFACTURER not like", value, "CI_MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERIn(List<String> values) {
            addCriterion("CI_MANUFACTURER in", values, "CI_MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERNotIn(List<String> values) {
            addCriterion("CI_MANUFACTURER not in", values, "CI_MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERBetween(String value1, String value2) {
            addCriterion("CI_MANUFACTURER between", value1, value2, "CI_MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURERNotBetween(String value1, String value2) {
            addCriterion("CI_MANUFACTURER not between", value1, value2, "CI_MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELIsNull() {
            addCriterion("CI_MANUFACTURER_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELIsNotNull() {
            addCriterion("CI_MANUFACTURER_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELEqualTo(String value) {
            addCriterion("CI_MANUFACTURER_MODEL =", value, "CI_MANUFACTURER_MODEL");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELNotEqualTo(String value) {
            addCriterion("CI_MANUFACTURER_MODEL <>", value, "CI_MANUFACTURER_MODEL");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELGreaterThan(String value) {
            addCriterion("CI_MANUFACTURER_MODEL >", value, "CI_MANUFACTURER_MODEL");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELGreaterThanOrEqualTo(String value) {
            addCriterion("CI_MANUFACTURER_MODEL >=", value, "CI_MANUFACTURER_MODEL");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELLessThan(String value) {
            addCriterion("CI_MANUFACTURER_MODEL <", value, "CI_MANUFACTURER_MODEL");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELLessThanOrEqualTo(String value) {
            addCriterion("CI_MANUFACTURER_MODEL <=", value, "CI_MANUFACTURER_MODEL");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELLike(String value) {
            addCriterion("CI_MANUFACTURER_MODEL like", value, "CI_MANUFACTURER_MODEL");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELNotLike(String value) {
            addCriterion("CI_MANUFACTURER_MODEL not like", value, "CI_MANUFACTURER_MODEL");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELIn(List<String> values) {
            addCriterion("CI_MANUFACTURER_MODEL in", values, "CI_MANUFACTURER_MODEL");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELNotIn(List<String> values) {
            addCriterion("CI_MANUFACTURER_MODEL not in", values, "CI_MANUFACTURER_MODEL");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELBetween(String value1, String value2) {
            addCriterion("CI_MANUFACTURER_MODEL between", value1, value2, "CI_MANUFACTURER_MODEL");
            return (Criteria) this;
        }

        public Criteria andCI_MANUFACTURER_MODELNotBetween(String value1, String value2) {
            addCriterion("CI_MANUFACTURER_MODEL not between", value1, value2, "CI_MANUFACTURER_MODEL");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGIsNull() {
            addCriterion("CI_3C_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGIsNotNull() {
            addCriterion("CI_3C_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGEqualTo(String value) {
            addCriterion("CI_3C_FLAG =", value, "CI_3C_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGNotEqualTo(String value) {
            addCriterion("CI_3C_FLAG <>", value, "CI_3C_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGGreaterThan(String value) {
            addCriterion("CI_3C_FLAG >", value, "CI_3C_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("CI_3C_FLAG >=", value, "CI_3C_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGLessThan(String value) {
            addCriterion("CI_3C_FLAG <", value, "CI_3C_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGLessThanOrEqualTo(String value) {
            addCriterion("CI_3C_FLAG <=", value, "CI_3C_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGLike(String value) {
            addCriterion("CI_3C_FLAG like", value, "CI_3C_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGNotLike(String value) {
            addCriterion("CI_3C_FLAG not like", value, "CI_3C_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGIn(List<String> values) {
            addCriterion("CI_3C_FLAG in", values, "CI_3C_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGNotIn(List<String> values) {
            addCriterion("CI_3C_FLAG not in", values, "CI_3C_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGBetween(String value1, String value2) {
            addCriterion("CI_3C_FLAG between", value1, value2, "CI_3C_FLAG");
            return (Criteria) this;
        }

        public Criteria andCI_3C_FLAGNotBetween(String value1, String value2) {
            addCriterion("CI_3C_FLAG not between", value1, value2, "CI_3C_FLAG");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODEIsNull() {
            addCriterion("SAMPLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODEIsNotNull() {
            addCriterion("SAMPLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODEEqualTo(String value) {
            addCriterion("SAMPLE_CODE =", value, "SAMPLE_CODE");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODENotEqualTo(String value) {
            addCriterion("SAMPLE_CODE <>", value, "SAMPLE_CODE");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODEGreaterThan(String value) {
            addCriterion("SAMPLE_CODE >", value, "SAMPLE_CODE");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_CODE >=", value, "SAMPLE_CODE");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODELessThan(String value) {
            addCriterion("SAMPLE_CODE <", value, "SAMPLE_CODE");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODELessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_CODE <=", value, "SAMPLE_CODE");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODELike(String value) {
            addCriterion("SAMPLE_CODE like", value, "SAMPLE_CODE");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODENotLike(String value) {
            addCriterion("SAMPLE_CODE not like", value, "SAMPLE_CODE");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODEIn(List<String> values) {
            addCriterion("SAMPLE_CODE in", values, "SAMPLE_CODE");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODENotIn(List<String> values) {
            addCriterion("SAMPLE_CODE not in", values, "SAMPLE_CODE");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODEBetween(String value1, String value2) {
            addCriterion("SAMPLE_CODE between", value1, value2, "SAMPLE_CODE");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_CODENotBetween(String value1, String value2) {
            addCriterion("SAMPLE_CODE not between", value1, value2, "SAMPLE_CODE");
            return (Criteria) this;
        }

        public Criteria andABC_TYPEIsNull() {
            addCriterion("ABC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andABC_TYPEIsNotNull() {
            addCriterion("ABC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andABC_TYPEEqualTo(String value) {
            addCriterion("ABC_TYPE =", value, "ABC_TYPE");
            return (Criteria) this;
        }

        public Criteria andABC_TYPENotEqualTo(String value) {
            addCriterion("ABC_TYPE <>", value, "ABC_TYPE");
            return (Criteria) this;
        }

        public Criteria andABC_TYPEGreaterThan(String value) {
            addCriterion("ABC_TYPE >", value, "ABC_TYPE");
            return (Criteria) this;
        }

        public Criteria andABC_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("ABC_TYPE >=", value, "ABC_TYPE");
            return (Criteria) this;
        }

        public Criteria andABC_TYPELessThan(String value) {
            addCriterion("ABC_TYPE <", value, "ABC_TYPE");
            return (Criteria) this;
        }

        public Criteria andABC_TYPELessThanOrEqualTo(String value) {
            addCriterion("ABC_TYPE <=", value, "ABC_TYPE");
            return (Criteria) this;
        }

        public Criteria andABC_TYPELike(String value) {
            addCriterion("ABC_TYPE like", value, "ABC_TYPE");
            return (Criteria) this;
        }

        public Criteria andABC_TYPENotLike(String value) {
            addCriterion("ABC_TYPE not like", value, "ABC_TYPE");
            return (Criteria) this;
        }

        public Criteria andABC_TYPEIn(List<String> values) {
            addCriterion("ABC_TYPE in", values, "ABC_TYPE");
            return (Criteria) this;
        }

        public Criteria andABC_TYPENotIn(List<String> values) {
            addCriterion("ABC_TYPE not in", values, "ABC_TYPE");
            return (Criteria) this;
        }

        public Criteria andABC_TYPEBetween(String value1, String value2) {
            addCriterion("ABC_TYPE between", value1, value2, "ABC_TYPE");
            return (Criteria) this;
        }

        public Criteria andABC_TYPENotBetween(String value1, String value2) {
            addCriterion("ABC_TYPE not between", value1, value2, "ABC_TYPE");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWIsNull() {
            addCriterion("CI_IS_ESCROW is null");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWIsNotNull() {
            addCriterion("CI_IS_ESCROW is not null");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWEqualTo(String value) {
            addCriterion("CI_IS_ESCROW =", value, "CI_IS_ESCROW");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWNotEqualTo(String value) {
            addCriterion("CI_IS_ESCROW <>", value, "CI_IS_ESCROW");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWGreaterThan(String value) {
            addCriterion("CI_IS_ESCROW >", value, "CI_IS_ESCROW");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWGreaterThanOrEqualTo(String value) {
            addCriterion("CI_IS_ESCROW >=", value, "CI_IS_ESCROW");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWLessThan(String value) {
            addCriterion("CI_IS_ESCROW <", value, "CI_IS_ESCROW");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWLessThanOrEqualTo(String value) {
            addCriterion("CI_IS_ESCROW <=", value, "CI_IS_ESCROW");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWLike(String value) {
            addCriterion("CI_IS_ESCROW like", value, "CI_IS_ESCROW");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWNotLike(String value) {
            addCriterion("CI_IS_ESCROW not like", value, "CI_IS_ESCROW");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWIn(List<String> values) {
            addCriterion("CI_IS_ESCROW in", values, "CI_IS_ESCROW");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWNotIn(List<String> values) {
            addCriterion("CI_IS_ESCROW not in", values, "CI_IS_ESCROW");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWBetween(String value1, String value2) {
            addCriterion("CI_IS_ESCROW between", value1, value2, "CI_IS_ESCROW");
            return (Criteria) this;
        }

        public Criteria andCI_IS_ESCROWNotBetween(String value1, String value2) {
            addCriterion("CI_IS_ESCROW not between", value1, value2, "CI_IS_ESCROW");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULEIsNull() {
            addCriterion("CI_SN_RULE is null");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULEIsNotNull() {
            addCriterion("CI_SN_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULEEqualTo(String value) {
            addCriterion("CI_SN_RULE =", value, "CI_SN_RULE");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULENotEqualTo(String value) {
            addCriterion("CI_SN_RULE <>", value, "CI_SN_RULE");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULEGreaterThan(String value) {
            addCriterion("CI_SN_RULE >", value, "CI_SN_RULE");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULEGreaterThanOrEqualTo(String value) {
            addCriterion("CI_SN_RULE >=", value, "CI_SN_RULE");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULELessThan(String value) {
            addCriterion("CI_SN_RULE <", value, "CI_SN_RULE");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULELessThanOrEqualTo(String value) {
            addCriterion("CI_SN_RULE <=", value, "CI_SN_RULE");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULELike(String value) {
            addCriterion("CI_SN_RULE like", value, "CI_SN_RULE");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULENotLike(String value) {
            addCriterion("CI_SN_RULE not like", value, "CI_SN_RULE");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULEIn(List<String> values) {
            addCriterion("CI_SN_RULE in", values, "CI_SN_RULE");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULENotIn(List<String> values) {
            addCriterion("CI_SN_RULE not in", values, "CI_SN_RULE");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULEBetween(String value1, String value2) {
            addCriterion("CI_SN_RULE between", value1, value2, "CI_SN_RULE");
            return (Criteria) this;
        }

        public Criteria andCI_SN_RULENotBetween(String value1, String value2) {
            addCriterion("CI_SN_RULE not between", value1, value2, "CI_SN_RULE");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERIsNull() {
            addCriterion("RAW_LOTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERIsNotNull() {
            addCriterion("RAW_LOTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBEREqualTo(String value) {
            addCriterion("RAW_LOTNUMBER =", value, "RAW_LOTNUMBER");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERNotEqualTo(String value) {
            addCriterion("RAW_LOTNUMBER <>", value, "RAW_LOTNUMBER");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERGreaterThan(String value) {
            addCriterion("RAW_LOTNUMBER >", value, "RAW_LOTNUMBER");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERGreaterThanOrEqualTo(String value) {
            addCriterion("RAW_LOTNUMBER >=", value, "RAW_LOTNUMBER");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERLessThan(String value) {
            addCriterion("RAW_LOTNUMBER <", value, "RAW_LOTNUMBER");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERLessThanOrEqualTo(String value) {
            addCriterion("RAW_LOTNUMBER <=", value, "RAW_LOTNUMBER");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERLike(String value) {
            addCriterion("RAW_LOTNUMBER like", value, "RAW_LOTNUMBER");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERNotLike(String value) {
            addCriterion("RAW_LOTNUMBER not like", value, "RAW_LOTNUMBER");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERIn(List<String> values) {
            addCriterion("RAW_LOTNUMBER in", values, "RAW_LOTNUMBER");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERNotIn(List<String> values) {
            addCriterion("RAW_LOTNUMBER not in", values, "RAW_LOTNUMBER");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERBetween(String value1, String value2) {
            addCriterion("RAW_LOTNUMBER between", value1, value2, "RAW_LOTNUMBER");
            return (Criteria) this;
        }

        public Criteria andRAW_LOTNUMBERNotBetween(String value1, String value2) {
            addCriterion("RAW_LOTNUMBER not between", value1, value2, "RAW_LOTNUMBER");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODEIsNull() {
            addCriterion("STOCK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODEIsNotNull() {
            addCriterion("STOCK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODEEqualTo(String value) {
            addCriterion("STOCK_CODE =", value, "STOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODENotEqualTo(String value) {
            addCriterion("STOCK_CODE <>", value, "STOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODEGreaterThan(String value) {
            addCriterion("STOCK_CODE >", value, "STOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_CODE >=", value, "STOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODELessThan(String value) {
            addCriterion("STOCK_CODE <", value, "STOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODELessThanOrEqualTo(String value) {
            addCriterion("STOCK_CODE <=", value, "STOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODELike(String value) {
            addCriterion("STOCK_CODE like", value, "STOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODENotLike(String value) {
            addCriterion("STOCK_CODE not like", value, "STOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODEIn(List<String> values) {
            addCriterion("STOCK_CODE in", values, "STOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODENotIn(List<String> values) {
            addCriterion("STOCK_CODE not in", values, "STOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODEBetween(String value1, String value2) {
            addCriterion("STOCK_CODE between", value1, value2, "STOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andSTOCK_CODENotBetween(String value1, String value2) {
            addCriterion("STOCK_CODE not between", value1, value2, "STOCK_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITIsNull() {
            addCriterion("SAP_WEIGHT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITIsNotNull() {
            addCriterion("SAP_WEIGHT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITEqualTo(String value) {
            addCriterion("SAP_WEIGHT_UNIT =", value, "SAP_WEIGHT_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITNotEqualTo(String value) {
            addCriterion("SAP_WEIGHT_UNIT <>", value, "SAP_WEIGHT_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITGreaterThan(String value) {
            addCriterion("SAP_WEIGHT_UNIT >", value, "SAP_WEIGHT_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITGreaterThanOrEqualTo(String value) {
            addCriterion("SAP_WEIGHT_UNIT >=", value, "SAP_WEIGHT_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITLessThan(String value) {
            addCriterion("SAP_WEIGHT_UNIT <", value, "SAP_WEIGHT_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITLessThanOrEqualTo(String value) {
            addCriterion("SAP_WEIGHT_UNIT <=", value, "SAP_WEIGHT_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITLike(String value) {
            addCriterion("SAP_WEIGHT_UNIT like", value, "SAP_WEIGHT_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITNotLike(String value) {
            addCriterion("SAP_WEIGHT_UNIT not like", value, "SAP_WEIGHT_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITIn(List<String> values) {
            addCriterion("SAP_WEIGHT_UNIT in", values, "SAP_WEIGHT_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITNotIn(List<String> values) {
            addCriterion("SAP_WEIGHT_UNIT not in", values, "SAP_WEIGHT_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITBetween(String value1, String value2) {
            addCriterion("SAP_WEIGHT_UNIT between", value1, value2, "SAP_WEIGHT_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_WEIGHT_UNITNotBetween(String value1, String value2) {
            addCriterion("SAP_WEIGHT_UNIT not between", value1, value2, "SAP_WEIGHT_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELIsNull() {
            addCriterion("SAP_IS_DEL is null");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELIsNotNull() {
            addCriterion("SAP_IS_DEL is not null");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELEqualTo(String value) {
            addCriterion("SAP_IS_DEL =", value, "SAP_IS_DEL");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELNotEqualTo(String value) {
            addCriterion("SAP_IS_DEL <>", value, "SAP_IS_DEL");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELGreaterThan(String value) {
            addCriterion("SAP_IS_DEL >", value, "SAP_IS_DEL");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELGreaterThanOrEqualTo(String value) {
            addCriterion("SAP_IS_DEL >=", value, "SAP_IS_DEL");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELLessThan(String value) {
            addCriterion("SAP_IS_DEL <", value, "SAP_IS_DEL");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELLessThanOrEqualTo(String value) {
            addCriterion("SAP_IS_DEL <=", value, "SAP_IS_DEL");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELLike(String value) {
            addCriterion("SAP_IS_DEL like", value, "SAP_IS_DEL");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELNotLike(String value) {
            addCriterion("SAP_IS_DEL not like", value, "SAP_IS_DEL");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELIn(List<String> values) {
            addCriterion("SAP_IS_DEL in", values, "SAP_IS_DEL");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELNotIn(List<String> values) {
            addCriterion("SAP_IS_DEL not in", values, "SAP_IS_DEL");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELBetween(String value1, String value2) {
            addCriterion("SAP_IS_DEL between", value1, value2, "SAP_IS_DEL");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_DELNotBetween(String value1, String value2) {
            addCriterion("SAP_IS_DEL not between", value1, value2, "SAP_IS_DEL");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITIsNull() {
            addCriterion("SAP_BASE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITIsNotNull() {
            addCriterion("SAP_BASE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITEqualTo(String value) {
            addCriterion("SAP_BASE_UNIT =", value, "SAP_BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITNotEqualTo(String value) {
            addCriterion("SAP_BASE_UNIT <>", value, "SAP_BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITGreaterThan(String value) {
            addCriterion("SAP_BASE_UNIT >", value, "SAP_BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITGreaterThanOrEqualTo(String value) {
            addCriterion("SAP_BASE_UNIT >=", value, "SAP_BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITLessThan(String value) {
            addCriterion("SAP_BASE_UNIT <", value, "SAP_BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITLessThanOrEqualTo(String value) {
            addCriterion("SAP_BASE_UNIT <=", value, "SAP_BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITLike(String value) {
            addCriterion("SAP_BASE_UNIT like", value, "SAP_BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITNotLike(String value) {
            addCriterion("SAP_BASE_UNIT not like", value, "SAP_BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITIn(List<String> values) {
            addCriterion("SAP_BASE_UNIT in", values, "SAP_BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITNotIn(List<String> values) {
            addCriterion("SAP_BASE_UNIT not in", values, "SAP_BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITBetween(String value1, String value2) {
            addCriterion("SAP_BASE_UNIT between", value1, value2, "SAP_BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_BASE_UNITNotBetween(String value1, String value2) {
            addCriterion("SAP_BASE_UNIT not between", value1, value2, "SAP_BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODEIsNull() {
            addCriterion("SAP_COLOR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODEIsNotNull() {
            addCriterion("SAP_COLOR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODEEqualTo(String value) {
            addCriterion("SAP_COLOR_CODE =", value, "SAP_COLOR_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODENotEqualTo(String value) {
            addCriterion("SAP_COLOR_CODE <>", value, "SAP_COLOR_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODEGreaterThan(String value) {
            addCriterion("SAP_COLOR_CODE >", value, "SAP_COLOR_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("SAP_COLOR_CODE >=", value, "SAP_COLOR_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODELessThan(String value) {
            addCriterion("SAP_COLOR_CODE <", value, "SAP_COLOR_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODELessThanOrEqualTo(String value) {
            addCriterion("SAP_COLOR_CODE <=", value, "SAP_COLOR_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODELike(String value) {
            addCriterion("SAP_COLOR_CODE like", value, "SAP_COLOR_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODENotLike(String value) {
            addCriterion("SAP_COLOR_CODE not like", value, "SAP_COLOR_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODEIn(List<String> values) {
            addCriterion("SAP_COLOR_CODE in", values, "SAP_COLOR_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODENotIn(List<String> values) {
            addCriterion("SAP_COLOR_CODE not in", values, "SAP_COLOR_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODEBetween(String value1, String value2) {
            addCriterion("SAP_COLOR_CODE between", value1, value2, "SAP_COLOR_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_COLOR_CODENotBetween(String value1, String value2) {
            addCriterion("SAP_COLOR_CODE not between", value1, value2, "SAP_COLOR_CODE");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPIsNull() {
            addCriterion("SAP_LEVEL_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPIsNotNull() {
            addCriterion("SAP_LEVEL_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPEqualTo(String value) {
            addCriterion("SAP_LEVEL_GROUP =", value, "SAP_LEVEL_GROUP");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPNotEqualTo(String value) {
            addCriterion("SAP_LEVEL_GROUP <>", value, "SAP_LEVEL_GROUP");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPGreaterThan(String value) {
            addCriterion("SAP_LEVEL_GROUP >", value, "SAP_LEVEL_GROUP");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPGreaterThanOrEqualTo(String value) {
            addCriterion("SAP_LEVEL_GROUP >=", value, "SAP_LEVEL_GROUP");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPLessThan(String value) {
            addCriterion("SAP_LEVEL_GROUP <", value, "SAP_LEVEL_GROUP");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPLessThanOrEqualTo(String value) {
            addCriterion("SAP_LEVEL_GROUP <=", value, "SAP_LEVEL_GROUP");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPLike(String value) {
            addCriterion("SAP_LEVEL_GROUP like", value, "SAP_LEVEL_GROUP");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPNotLike(String value) {
            addCriterion("SAP_LEVEL_GROUP not like", value, "SAP_LEVEL_GROUP");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPIn(List<String> values) {
            addCriterion("SAP_LEVEL_GROUP in", values, "SAP_LEVEL_GROUP");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPNotIn(List<String> values) {
            addCriterion("SAP_LEVEL_GROUP not in", values, "SAP_LEVEL_GROUP");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPBetween(String value1, String value2) {
            addCriterion("SAP_LEVEL_GROUP between", value1, value2, "SAP_LEVEL_GROUP");
            return (Criteria) this;
        }

        public Criteria andSAP_LEVEL_GROUPNotBetween(String value1, String value2) {
            addCriterion("SAP_LEVEL_GROUP not between", value1, value2, "SAP_LEVEL_GROUP");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTIsNull() {
            addCriterion("SAP_GROSS_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTIsNotNull() {
            addCriterion("SAP_GROSS_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTEqualTo(String value) {
            addCriterion("SAP_GROSS_WEIGHT =", value, "SAP_GROSS_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTNotEqualTo(String value) {
            addCriterion("SAP_GROSS_WEIGHT <>", value, "SAP_GROSS_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTGreaterThan(String value) {
            addCriterion("SAP_GROSS_WEIGHT >", value, "SAP_GROSS_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTGreaterThanOrEqualTo(String value) {
            addCriterion("SAP_GROSS_WEIGHT >=", value, "SAP_GROSS_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTLessThan(String value) {
            addCriterion("SAP_GROSS_WEIGHT <", value, "SAP_GROSS_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTLessThanOrEqualTo(String value) {
            addCriterion("SAP_GROSS_WEIGHT <=", value, "SAP_GROSS_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTLike(String value) {
            addCriterion("SAP_GROSS_WEIGHT like", value, "SAP_GROSS_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTNotLike(String value) {
            addCriterion("SAP_GROSS_WEIGHT not like", value, "SAP_GROSS_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTIn(List<String> values) {
            addCriterion("SAP_GROSS_WEIGHT in", values, "SAP_GROSS_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTNotIn(List<String> values) {
            addCriterion("SAP_GROSS_WEIGHT not in", values, "SAP_GROSS_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTBetween(String value1, String value2) {
            addCriterion("SAP_GROSS_WEIGHT between", value1, value2, "SAP_GROSS_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_GROSS_WEIGHTNotBetween(String value1, String value2) {
            addCriterion("SAP_GROSS_WEIGHT not between", value1, value2, "SAP_GROSS_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTIsNull() {
            addCriterion("SAP_NET_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTIsNotNull() {
            addCriterion("SAP_NET_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTEqualTo(String value) {
            addCriterion("SAP_NET_WEIGHT =", value, "SAP_NET_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTNotEqualTo(String value) {
            addCriterion("SAP_NET_WEIGHT <>", value, "SAP_NET_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTGreaterThan(String value) {
            addCriterion("SAP_NET_WEIGHT >", value, "SAP_NET_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTGreaterThanOrEqualTo(String value) {
            addCriterion("SAP_NET_WEIGHT >=", value, "SAP_NET_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTLessThan(String value) {
            addCriterion("SAP_NET_WEIGHT <", value, "SAP_NET_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTLessThanOrEqualTo(String value) {
            addCriterion("SAP_NET_WEIGHT <=", value, "SAP_NET_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTLike(String value) {
            addCriterion("SAP_NET_WEIGHT like", value, "SAP_NET_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTNotLike(String value) {
            addCriterion("SAP_NET_WEIGHT not like", value, "SAP_NET_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTIn(List<String> values) {
            addCriterion("SAP_NET_WEIGHT in", values, "SAP_NET_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTNotIn(List<String> values) {
            addCriterion("SAP_NET_WEIGHT not in", values, "SAP_NET_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTBetween(String value1, String value2) {
            addCriterion("SAP_NET_WEIGHT between", value1, value2, "SAP_NET_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_NET_WEIGHTNotBetween(String value1, String value2) {
            addCriterion("SAP_NET_WEIGHT not between", value1, value2, "SAP_NET_WEIGHT");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGIsNull() {
            addCriterion("SAP_IS_CONFIG is null");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGIsNotNull() {
            addCriterion("SAP_IS_CONFIG is not null");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGEqualTo(String value) {
            addCriterion("SAP_IS_CONFIG =", value, "SAP_IS_CONFIG");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGNotEqualTo(String value) {
            addCriterion("SAP_IS_CONFIG <>", value, "SAP_IS_CONFIG");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGGreaterThan(String value) {
            addCriterion("SAP_IS_CONFIG >", value, "SAP_IS_CONFIG");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGGreaterThanOrEqualTo(String value) {
            addCriterion("SAP_IS_CONFIG >=", value, "SAP_IS_CONFIG");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGLessThan(String value) {
            addCriterion("SAP_IS_CONFIG <", value, "SAP_IS_CONFIG");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGLessThanOrEqualTo(String value) {
            addCriterion("SAP_IS_CONFIG <=", value, "SAP_IS_CONFIG");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGLike(String value) {
            addCriterion("SAP_IS_CONFIG like", value, "SAP_IS_CONFIG");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGNotLike(String value) {
            addCriterion("SAP_IS_CONFIG not like", value, "SAP_IS_CONFIG");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGIn(List<String> values) {
            addCriterion("SAP_IS_CONFIG in", values, "SAP_IS_CONFIG");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGNotIn(List<String> values) {
            addCriterion("SAP_IS_CONFIG not in", values, "SAP_IS_CONFIG");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGBetween(String value1, String value2) {
            addCriterion("SAP_IS_CONFIG between", value1, value2, "SAP_IS_CONFIG");
            return (Criteria) this;
        }

        public Criteria andSAP_IS_CONFIGNotBetween(String value1, String value2) {
            addCriterion("SAP_IS_CONFIG not between", value1, value2, "SAP_IS_CONFIG");
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