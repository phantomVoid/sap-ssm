package com.phantom.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TPmProjectDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPmProjectDetailExample() {
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

        public Criteria andPROJECT_IDIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDEqualTo(String value) {
            addCriterion("PROJECT_ID =", value, "PROJECT_ID");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDNotEqualTo(String value) {
            addCriterion("PROJECT_ID <>", value, "PROJECT_ID");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDGreaterThan(String value) {
            addCriterion("PROJECT_ID >", value, "PROJECT_ID");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID >=", value, "PROJECT_ID");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDLessThan(String value) {
            addCriterion("PROJECT_ID <", value, "PROJECT_ID");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID <=", value, "PROJECT_ID");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDLike(String value) {
            addCriterion("PROJECT_ID like", value, "PROJECT_ID");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDNotLike(String value) {
            addCriterion("PROJECT_ID not like", value, "PROJECT_ID");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDIn(List<String> values) {
            addCriterion("PROJECT_ID in", values, "PROJECT_ID");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDNotIn(List<String> values) {
            addCriterion("PROJECT_ID not in", values, "PROJECT_ID");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDBetween(String value1, String value2) {
            addCriterion("PROJECT_ID between", value1, value2, "PROJECT_ID");
            return (Criteria) this;
        }

        public Criteria andPROJECT_IDNotBetween(String value1, String value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "PROJECT_ID");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODEIsNull() {
            addCriterion("CBD_ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODEIsNotNull() {
            addCriterion("CBD_ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODEEqualTo(String value) {
            addCriterion("CBD_ITEM_CODE =", value, "CBD_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODENotEqualTo(String value) {
            addCriterion("CBD_ITEM_CODE <>", value, "CBD_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODEGreaterThan(String value) {
            addCriterion("CBD_ITEM_CODE >", value, "CBD_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("CBD_ITEM_CODE >=", value, "CBD_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODELessThan(String value) {
            addCriterion("CBD_ITEM_CODE <", value, "CBD_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODELessThanOrEqualTo(String value) {
            addCriterion("CBD_ITEM_CODE <=", value, "CBD_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODELike(String value) {
            addCriterion("CBD_ITEM_CODE like", value, "CBD_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODENotLike(String value) {
            addCriterion("CBD_ITEM_CODE not like", value, "CBD_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODEIn(List<String> values) {
            addCriterion("CBD_ITEM_CODE in", values, "CBD_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODENotIn(List<String> values) {
            addCriterion("CBD_ITEM_CODE not in", values, "CBD_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODEBetween(String value1, String value2) {
            addCriterion("CBD_ITEM_CODE between", value1, value2, "CBD_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_CODENotBetween(String value1, String value2) {
            addCriterion("CBD_ITEM_CODE not between", value1, value2, "CBD_ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_NUMIsNull() {
            addCriterion("CBD_ITEM_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_NUMIsNotNull() {
            addCriterion("CBD_ITEM_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_NUMEqualTo(BigDecimal value) {
            addCriterion("CBD_ITEM_NUM =", value, "CBD_ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_NUMNotEqualTo(BigDecimal value) {
            addCriterion("CBD_ITEM_NUM <>", value, "CBD_ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_NUMGreaterThan(BigDecimal value) {
            addCriterion("CBD_ITEM_NUM >", value, "CBD_ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_NUMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CBD_ITEM_NUM >=", value, "CBD_ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_NUMLessThan(BigDecimal value) {
            addCriterion("CBD_ITEM_NUM <", value, "CBD_ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_NUMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CBD_ITEM_NUM <=", value, "CBD_ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_NUMIn(List<BigDecimal> values) {
            addCriterion("CBD_ITEM_NUM in", values, "CBD_ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_NUMNotIn(List<BigDecimal> values) {
            addCriterion("CBD_ITEM_NUM not in", values, "CBD_ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_NUMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CBD_ITEM_NUM between", value1, value2, "CBD_ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_NUMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CBD_ITEM_NUM not between", value1, value2, "CBD_ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andCBD_SEQUENCEIsNull() {
            addCriterion("CBD_SEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andCBD_SEQUENCEIsNotNull() {
            addCriterion("CBD_SEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andCBD_SEQUENCEEqualTo(BigDecimal value) {
            addCriterion("CBD_SEQUENCE =", value, "CBD_SEQUENCE");
            return (Criteria) this;
        }

        public Criteria andCBD_SEQUENCENotEqualTo(BigDecimal value) {
            addCriterion("CBD_SEQUENCE <>", value, "CBD_SEQUENCE");
            return (Criteria) this;
        }

        public Criteria andCBD_SEQUENCEGreaterThan(BigDecimal value) {
            addCriterion("CBD_SEQUENCE >", value, "CBD_SEQUENCE");
            return (Criteria) this;
        }

        public Criteria andCBD_SEQUENCEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CBD_SEQUENCE >=", value, "CBD_SEQUENCE");
            return (Criteria) this;
        }

        public Criteria andCBD_SEQUENCELessThan(BigDecimal value) {
            addCriterion("CBD_SEQUENCE <", value, "CBD_SEQUENCE");
            return (Criteria) this;
        }

        public Criteria andCBD_SEQUENCELessThanOrEqualTo(BigDecimal value) {
            addCriterion("CBD_SEQUENCE <=", value, "CBD_SEQUENCE");
            return (Criteria) this;
        }

        public Criteria andCBD_SEQUENCEIn(List<BigDecimal> values) {
            addCriterion("CBD_SEQUENCE in", values, "CBD_SEQUENCE");
            return (Criteria) this;
        }

        public Criteria andCBD_SEQUENCENotIn(List<BigDecimal> values) {
            addCriterion("CBD_SEQUENCE not in", values, "CBD_SEQUENCE");
            return (Criteria) this;
        }

        public Criteria andCBD_SEQUENCEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CBD_SEQUENCE between", value1, value2, "CBD_SEQUENCE");
            return (Criteria) this;
        }

        public Criteria andCBD_SEQUENCENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CBD_SEQUENCE not between", value1, value2, "CBD_SEQUENCE");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTIsNull() {
            addCriterion("CBD_POINT is null");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTIsNotNull() {
            addCriterion("CBD_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTEqualTo(String value) {
            addCriterion("CBD_POINT =", value, "CBD_POINT");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTNotEqualTo(String value) {
            addCriterion("CBD_POINT <>", value, "CBD_POINT");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTGreaterThan(String value) {
            addCriterion("CBD_POINT >", value, "CBD_POINT");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTGreaterThanOrEqualTo(String value) {
            addCriterion("CBD_POINT >=", value, "CBD_POINT");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTLessThan(String value) {
            addCriterion("CBD_POINT <", value, "CBD_POINT");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTLessThanOrEqualTo(String value) {
            addCriterion("CBD_POINT <=", value, "CBD_POINT");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTLike(String value) {
            addCriterion("CBD_POINT like", value, "CBD_POINT");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTNotLike(String value) {
            addCriterion("CBD_POINT not like", value, "CBD_POINT");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTIn(List<String> values) {
            addCriterion("CBD_POINT in", values, "CBD_POINT");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTNotIn(List<String> values) {
            addCriterion("CBD_POINT not in", values, "CBD_POINT");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTBetween(String value1, String value2) {
            addCriterion("CBD_POINT between", value1, value2, "CBD_POINT");
            return (Criteria) this;
        }

        public Criteria andCBD_POINTNotBetween(String value1, String value2) {
            addCriterion("CBD_POINT not between", value1, value2, "CBD_POINT");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSIsNull() {
            addCriterion("CBD_UNITS is null");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSIsNotNull() {
            addCriterion("CBD_UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSEqualTo(String value) {
            addCriterion("CBD_UNITS =", value, "CBD_UNITS");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSNotEqualTo(String value) {
            addCriterion("CBD_UNITS <>", value, "CBD_UNITS");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSGreaterThan(String value) {
            addCriterion("CBD_UNITS >", value, "CBD_UNITS");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSGreaterThanOrEqualTo(String value) {
            addCriterion("CBD_UNITS >=", value, "CBD_UNITS");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSLessThan(String value) {
            addCriterion("CBD_UNITS <", value, "CBD_UNITS");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSLessThanOrEqualTo(String value) {
            addCriterion("CBD_UNITS <=", value, "CBD_UNITS");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSLike(String value) {
            addCriterion("CBD_UNITS like", value, "CBD_UNITS");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSNotLike(String value) {
            addCriterion("CBD_UNITS not like", value, "CBD_UNITS");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSIn(List<String> values) {
            addCriterion("CBD_UNITS in", values, "CBD_UNITS");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSNotIn(List<String> values) {
            addCriterion("CBD_UNITS not in", values, "CBD_UNITS");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSBetween(String value1, String value2) {
            addCriterion("CBD_UNITS between", value1, value2, "CBD_UNITS");
            return (Criteria) this;
        }

        public Criteria andCBD_UNITSNotBetween(String value1, String value2) {
            addCriterion("CBD_UNITS not between", value1, value2, "CBD_UNITS");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPEIsNull() {
            addCriterion("CBD_ITEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPEIsNotNull() {
            addCriterion("CBD_ITEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPEEqualTo(String value) {
            addCriterion("CBD_ITEM_TYPE =", value, "CBD_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPENotEqualTo(String value) {
            addCriterion("CBD_ITEM_TYPE <>", value, "CBD_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPEGreaterThan(String value) {
            addCriterion("CBD_ITEM_TYPE >", value, "CBD_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("CBD_ITEM_TYPE >=", value, "CBD_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPELessThan(String value) {
            addCriterion("CBD_ITEM_TYPE <", value, "CBD_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPELessThanOrEqualTo(String value) {
            addCriterion("CBD_ITEM_TYPE <=", value, "CBD_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPELike(String value) {
            addCriterion("CBD_ITEM_TYPE like", value, "CBD_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPENotLike(String value) {
            addCriterion("CBD_ITEM_TYPE not like", value, "CBD_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPEIn(List<String> values) {
            addCriterion("CBD_ITEM_TYPE in", values, "CBD_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPENotIn(List<String> values) {
            addCriterion("CBD_ITEM_TYPE not in", values, "CBD_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPEBetween(String value1, String value2) {
            addCriterion("CBD_ITEM_TYPE between", value1, value2, "CBD_ITEM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCBD_ITEM_TYPENotBetween(String value1, String value2) {
            addCriterion("CBD_ITEM_TYPE not between", value1, value2, "CBD_ITEM_TYPE");
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

        public Criteria andPROJECT_BINIsNull() {
            addCriterion("PROJECT_BIN is null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINIsNotNull() {
            addCriterion("PROJECT_BIN is not null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINEqualTo(String value) {
            addCriterion("PROJECT_BIN =", value, "PROJECT_BIN");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINNotEqualTo(String value) {
            addCriterion("PROJECT_BIN <>", value, "PROJECT_BIN");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINGreaterThan(String value) {
            addCriterion("PROJECT_BIN >", value, "PROJECT_BIN");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_BIN >=", value, "PROJECT_BIN");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINLessThan(String value) {
            addCriterion("PROJECT_BIN <", value, "PROJECT_BIN");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_BIN <=", value, "PROJECT_BIN");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINLike(String value) {
            addCriterion("PROJECT_BIN like", value, "PROJECT_BIN");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINNotLike(String value) {
            addCriterion("PROJECT_BIN not like", value, "PROJECT_BIN");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINIn(List<String> values) {
            addCriterion("PROJECT_BIN in", values, "PROJECT_BIN");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINNotIn(List<String> values) {
            addCriterion("PROJECT_BIN not in", values, "PROJECT_BIN");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINBetween(String value1, String value2) {
            addCriterion("PROJECT_BIN between", value1, value2, "PROJECT_BIN");
            return (Criteria) this;
        }

        public Criteria andPROJECT_BINNotBetween(String value1, String value2) {
            addCriterion("PROJECT_BIN not between", value1, value2, "PROJECT_BIN");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQIsNull() {
            addCriterion("WORKCENTER_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQIsNotNull() {
            addCriterion("WORKCENTER_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQEqualTo(String value) {
            addCriterion("WORKCENTER_SEQ =", value, "WORKCENTER_SEQ");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQNotEqualTo(String value) {
            addCriterion("WORKCENTER_SEQ <>", value, "WORKCENTER_SEQ");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQGreaterThan(String value) {
            addCriterion("WORKCENTER_SEQ >", value, "WORKCENTER_SEQ");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQGreaterThanOrEqualTo(String value) {
            addCriterion("WORKCENTER_SEQ >=", value, "WORKCENTER_SEQ");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQLessThan(String value) {
            addCriterion("WORKCENTER_SEQ <", value, "WORKCENTER_SEQ");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQLessThanOrEqualTo(String value) {
            addCriterion("WORKCENTER_SEQ <=", value, "WORKCENTER_SEQ");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQLike(String value) {
            addCriterion("WORKCENTER_SEQ like", value, "WORKCENTER_SEQ");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQNotLike(String value) {
            addCriterion("WORKCENTER_SEQ not like", value, "WORKCENTER_SEQ");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQIn(List<String> values) {
            addCriterion("WORKCENTER_SEQ in", values, "WORKCENTER_SEQ");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQNotIn(List<String> values) {
            addCriterion("WORKCENTER_SEQ not in", values, "WORKCENTER_SEQ");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQBetween(String value1, String value2) {
            addCriterion("WORKCENTER_SEQ between", value1, value2, "WORKCENTER_SEQ");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_SEQNotBetween(String value1, String value2) {
            addCriterion("WORKCENTER_SEQ not between", value1, value2, "WORKCENTER_SEQ");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NOIsNull() {
            addCriterion("WORKCENTER_NO is null");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NOIsNotNull() {
            addCriterion("WORKCENTER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NOEqualTo(String value) {
            addCriterion("WORKCENTER_NO =", value, "WORKCENTER_NO");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NONotEqualTo(String value) {
            addCriterion("WORKCENTER_NO <>", value, "WORKCENTER_NO");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NOGreaterThan(String value) {
            addCriterion("WORKCENTER_NO >", value, "WORKCENTER_NO");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NOGreaterThanOrEqualTo(String value) {
            addCriterion("WORKCENTER_NO >=", value, "WORKCENTER_NO");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NOLessThan(String value) {
            addCriterion("WORKCENTER_NO <", value, "WORKCENTER_NO");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NOLessThanOrEqualTo(String value) {
            addCriterion("WORKCENTER_NO <=", value, "WORKCENTER_NO");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NOLike(String value) {
            addCriterion("WORKCENTER_NO like", value, "WORKCENTER_NO");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NONotLike(String value) {
            addCriterion("WORKCENTER_NO not like", value, "WORKCENTER_NO");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NOIn(List<String> values) {
            addCriterion("WORKCENTER_NO in", values, "WORKCENTER_NO");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NONotIn(List<String> values) {
            addCriterion("WORKCENTER_NO not in", values, "WORKCENTER_NO");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NOBetween(String value1, String value2) {
            addCriterion("WORKCENTER_NO between", value1, value2, "WORKCENTER_NO");
            return (Criteria) this;
        }

        public Criteria andWORKCENTER_NONotBetween(String value1, String value2) {
            addCriterion("WORKCENTER_NO not between", value1, value2, "WORKCENTER_NO");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERIsNull() {
            addCriterion("WORKCENTER is null");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERIsNotNull() {
            addCriterion("WORKCENTER is not null");
            return (Criteria) this;
        }

        public Criteria andWORKCENTEREqualTo(String value) {
            addCriterion("WORKCENTER =", value, "WORKCENTER");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERNotEqualTo(String value) {
            addCriterion("WORKCENTER <>", value, "WORKCENTER");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERGreaterThan(String value) {
            addCriterion("WORKCENTER >", value, "WORKCENTER");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERGreaterThanOrEqualTo(String value) {
            addCriterion("WORKCENTER >=", value, "WORKCENTER");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERLessThan(String value) {
            addCriterion("WORKCENTER <", value, "WORKCENTER");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERLessThanOrEqualTo(String value) {
            addCriterion("WORKCENTER <=", value, "WORKCENTER");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERLike(String value) {
            addCriterion("WORKCENTER like", value, "WORKCENTER");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERNotLike(String value) {
            addCriterion("WORKCENTER not like", value, "WORKCENTER");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERIn(List<String> values) {
            addCriterion("WORKCENTER in", values, "WORKCENTER");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERNotIn(List<String> values) {
            addCriterion("WORKCENTER not in", values, "WORKCENTER");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERBetween(String value1, String value2) {
            addCriterion("WORKCENTER between", value1, value2, "WORKCENTER");
            return (Criteria) this;
        }

        public Criteria andWORKCENTERNotBetween(String value1, String value2) {
            addCriterion("WORKCENTER not between", value1, value2, "WORKCENTER");
            return (Criteria) this;
        }

        public Criteria andOUTPUT_RATEIsNull() {
            addCriterion("OUTPUT_RATE is null");
            return (Criteria) this;
        }

        public Criteria andOUTPUT_RATEIsNotNull() {
            addCriterion("OUTPUT_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andOUTPUT_RATEEqualTo(BigDecimal value) {
            addCriterion("OUTPUT_RATE =", value, "OUTPUT_RATE");
            return (Criteria) this;
        }

        public Criteria andOUTPUT_RATENotEqualTo(BigDecimal value) {
            addCriterion("OUTPUT_RATE <>", value, "OUTPUT_RATE");
            return (Criteria) this;
        }

        public Criteria andOUTPUT_RATEGreaterThan(BigDecimal value) {
            addCriterion("OUTPUT_RATE >", value, "OUTPUT_RATE");
            return (Criteria) this;
        }

        public Criteria andOUTPUT_RATEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OUTPUT_RATE >=", value, "OUTPUT_RATE");
            return (Criteria) this;
        }

        public Criteria andOUTPUT_RATELessThan(BigDecimal value) {
            addCriterion("OUTPUT_RATE <", value, "OUTPUT_RATE");
            return (Criteria) this;
        }

        public Criteria andOUTPUT_RATELessThanOrEqualTo(BigDecimal value) {
            addCriterion("OUTPUT_RATE <=", value, "OUTPUT_RATE");
            return (Criteria) this;
        }

        public Criteria andOUTPUT_RATEIn(List<BigDecimal> values) {
            addCriterion("OUTPUT_RATE in", values, "OUTPUT_RATE");
            return (Criteria) this;
        }

        public Criteria andOUTPUT_RATENotIn(List<BigDecimal> values) {
            addCriterion("OUTPUT_RATE not in", values, "OUTPUT_RATE");
            return (Criteria) this;
        }

        public Criteria andOUTPUT_RATEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUTPUT_RATE between", value1, value2, "OUTPUT_RATE");
            return (Criteria) this;
        }

        public Criteria andOUTPUT_RATENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUTPUT_RATE not between", value1, value2, "OUTPUT_RATE");
            return (Criteria) this;
        }

        public Criteria andMEMOIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMEMOIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMEMOEqualTo(String value) {
            addCriterion("MEMO =", value, "MEMO");
            return (Criteria) this;
        }

        public Criteria andMEMONotEqualTo(String value) {
            addCriterion("MEMO <>", value, "MEMO");
            return (Criteria) this;
        }

        public Criteria andMEMOGreaterThan(String value) {
            addCriterion("MEMO >", value, "MEMO");
            return (Criteria) this;
        }

        public Criteria andMEMOGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "MEMO");
            return (Criteria) this;
        }

        public Criteria andMEMOLessThan(String value) {
            addCriterion("MEMO <", value, "MEMO");
            return (Criteria) this;
        }

        public Criteria andMEMOLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "MEMO");
            return (Criteria) this;
        }

        public Criteria andMEMOLike(String value) {
            addCriterion("MEMO like", value, "MEMO");
            return (Criteria) this;
        }

        public Criteria andMEMONotLike(String value) {
            addCriterion("MEMO not like", value, "MEMO");
            return (Criteria) this;
        }

        public Criteria andMEMOIn(List<String> values) {
            addCriterion("MEMO in", values, "MEMO");
            return (Criteria) this;
        }

        public Criteria andMEMONotIn(List<String> values) {
            addCriterion("MEMO not in", values, "MEMO");
            return (Criteria) this;
        }

        public Criteria andMEMOBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "MEMO");
            return (Criteria) this;
        }

        public Criteria andMEMONotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "MEMO");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACEIsNull() {
            addCriterion("WORK_SPACE is null");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACEIsNotNull() {
            addCriterion("WORK_SPACE is not null");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACEEqualTo(String value) {
            addCriterion("WORK_SPACE =", value, "WORK_SPACE");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACENotEqualTo(String value) {
            addCriterion("WORK_SPACE <>", value, "WORK_SPACE");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACEGreaterThan(String value) {
            addCriterion("WORK_SPACE >", value, "WORK_SPACE");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACEGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_SPACE >=", value, "WORK_SPACE");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACELessThan(String value) {
            addCriterion("WORK_SPACE <", value, "WORK_SPACE");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACELessThanOrEqualTo(String value) {
            addCriterion("WORK_SPACE <=", value, "WORK_SPACE");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACELike(String value) {
            addCriterion("WORK_SPACE like", value, "WORK_SPACE");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACENotLike(String value) {
            addCriterion("WORK_SPACE not like", value, "WORK_SPACE");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACEIn(List<String> values) {
            addCriterion("WORK_SPACE in", values, "WORK_SPACE");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACENotIn(List<String> values) {
            addCriterion("WORK_SPACE not in", values, "WORK_SPACE");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACEBetween(String value1, String value2) {
            addCriterion("WORK_SPACE between", value1, value2, "WORK_SPACE");
            return (Criteria) this;
        }

        public Criteria andWORK_SPACENotBetween(String value1, String value2) {
            addCriterion("WORK_SPACE not between", value1, value2, "WORK_SPACE");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSEIsNull() {
            addCriterion("WARE_HOUSE is null");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSEIsNotNull() {
            addCriterion("WARE_HOUSE is not null");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSEEqualTo(String value) {
            addCriterion("WARE_HOUSE =", value, "WARE_HOUSE");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSENotEqualTo(String value) {
            addCriterion("WARE_HOUSE <>", value, "WARE_HOUSE");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSEGreaterThan(String value) {
            addCriterion("WARE_HOUSE >", value, "WARE_HOUSE");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSEGreaterThanOrEqualTo(String value) {
            addCriterion("WARE_HOUSE >=", value, "WARE_HOUSE");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSELessThan(String value) {
            addCriterion("WARE_HOUSE <", value, "WARE_HOUSE");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSELessThanOrEqualTo(String value) {
            addCriterion("WARE_HOUSE <=", value, "WARE_HOUSE");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSELike(String value) {
            addCriterion("WARE_HOUSE like", value, "WARE_HOUSE");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSENotLike(String value) {
            addCriterion("WARE_HOUSE not like", value, "WARE_HOUSE");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSEIn(List<String> values) {
            addCriterion("WARE_HOUSE in", values, "WARE_HOUSE");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSENotIn(List<String> values) {
            addCriterion("WARE_HOUSE not in", values, "WARE_HOUSE");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSEBetween(String value1, String value2) {
            addCriterion("WARE_HOUSE between", value1, value2, "WARE_HOUSE");
            return (Criteria) this;
        }

        public Criteria andWARE_HOUSENotBetween(String value1, String value2) {
            addCriterion("WARE_HOUSE not between", value1, value2, "WARE_HOUSE");
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