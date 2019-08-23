package com.phantom.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TPmProjectBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPmProjectBaseExample() {
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

        public Criteria andPRODUCT_MATERIALIsNull() {
            addCriterion("PRODUCT_MATERIAL is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALIsNotNull() {
            addCriterion("PRODUCT_MATERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALEqualTo(String value) {
            addCriterion("PRODUCT_MATERIAL =", value, "PRODUCT_MATERIAL");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALNotEqualTo(String value) {
            addCriterion("PRODUCT_MATERIAL <>", value, "PRODUCT_MATERIAL");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALGreaterThan(String value) {
            addCriterion("PRODUCT_MATERIAL >", value, "PRODUCT_MATERIAL");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MATERIAL >=", value, "PRODUCT_MATERIAL");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALLessThan(String value) {
            addCriterion("PRODUCT_MATERIAL <", value, "PRODUCT_MATERIAL");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MATERIAL <=", value, "PRODUCT_MATERIAL");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALLike(String value) {
            addCriterion("PRODUCT_MATERIAL like", value, "PRODUCT_MATERIAL");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALNotLike(String value) {
            addCriterion("PRODUCT_MATERIAL not like", value, "PRODUCT_MATERIAL");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALIn(List<String> values) {
            addCriterion("PRODUCT_MATERIAL in", values, "PRODUCT_MATERIAL");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALNotIn(List<String> values) {
            addCriterion("PRODUCT_MATERIAL not in", values, "PRODUCT_MATERIAL");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALBetween(String value1, String value2) {
            addCriterion("PRODUCT_MATERIAL between", value1, value2, "PRODUCT_MATERIAL");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIALNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_MATERIAL not between", value1, value2, "PRODUCT_MATERIAL");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMENotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMELessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMELessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMELike(String value) {
            addCriterion("PRODUCT_NAME like", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMENotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMENotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMENotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDIsNull() {
            addCriterion("PRODUCT_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDIsNotNull() {
            addCriterion("PRODUCT_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDEqualTo(String value) {
            addCriterion("PRODUCT_STANDARD =", value, "PRODUCT_STANDARD");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDNotEqualTo(String value) {
            addCriterion("PRODUCT_STANDARD <>", value, "PRODUCT_STANDARD");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDGreaterThan(String value) {
            addCriterion("PRODUCT_STANDARD >", value, "PRODUCT_STANDARD");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STANDARD >=", value, "PRODUCT_STANDARD");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDLessThan(String value) {
            addCriterion("PRODUCT_STANDARD <", value, "PRODUCT_STANDARD");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STANDARD <=", value, "PRODUCT_STANDARD");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDLike(String value) {
            addCriterion("PRODUCT_STANDARD like", value, "PRODUCT_STANDARD");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDNotLike(String value) {
            addCriterion("PRODUCT_STANDARD not like", value, "PRODUCT_STANDARD");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDIn(List<String> values) {
            addCriterion("PRODUCT_STANDARD in", values, "PRODUCT_STANDARD");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDNotIn(List<String> values) {
            addCriterion("PRODUCT_STANDARD not in", values, "PRODUCT_STANDARD");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDBetween(String value1, String value2) {
            addCriterion("PRODUCT_STANDARD between", value1, value2, "PRODUCT_STANDARD");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_STANDARDNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_STANDARD not between", value1, value2, "PRODUCT_STANDARD");
            return (Criteria) this;
        }

        public Criteria andSCRAPPED_QTYIsNull() {
            addCriterion("SCRAPPED_QTY is null");
            return (Criteria) this;
        }

        public Criteria andSCRAPPED_QTYIsNotNull() {
            addCriterion("SCRAPPED_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andSCRAPPED_QTYEqualTo(BigDecimal value) {
            addCriterion("SCRAPPED_QTY =", value, "SCRAPPED_QTY");
            return (Criteria) this;
        }

        public Criteria andSCRAPPED_QTYNotEqualTo(BigDecimal value) {
            addCriterion("SCRAPPED_QTY <>", value, "SCRAPPED_QTY");
            return (Criteria) this;
        }

        public Criteria andSCRAPPED_QTYGreaterThan(BigDecimal value) {
            addCriterion("SCRAPPED_QTY >", value, "SCRAPPED_QTY");
            return (Criteria) this;
        }

        public Criteria andSCRAPPED_QTYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCRAPPED_QTY >=", value, "SCRAPPED_QTY");
            return (Criteria) this;
        }

        public Criteria andSCRAPPED_QTYLessThan(BigDecimal value) {
            addCriterion("SCRAPPED_QTY <", value, "SCRAPPED_QTY");
            return (Criteria) this;
        }

        public Criteria andSCRAPPED_QTYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCRAPPED_QTY <=", value, "SCRAPPED_QTY");
            return (Criteria) this;
        }

        public Criteria andSCRAPPED_QTYIn(List<BigDecimal> values) {
            addCriterion("SCRAPPED_QTY in", values, "SCRAPPED_QTY");
            return (Criteria) this;
        }

        public Criteria andSCRAPPED_QTYNotIn(List<BigDecimal> values) {
            addCriterion("SCRAPPED_QTY not in", values, "SCRAPPED_QTY");
            return (Criteria) this;
        }

        public Criteria andSCRAPPED_QTYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCRAPPED_QTY between", value1, value2, "SCRAPPED_QTY");
            return (Criteria) this;
        }

        public Criteria andSCRAPPED_QTYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCRAPPED_QTY not between", value1, value2, "SCRAPPED_QTY");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NOIsNull() {
            addCriterion("DESTROY_NO is null");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NOIsNotNull() {
            addCriterion("DESTROY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NOEqualTo(String value) {
            addCriterion("DESTROY_NO =", value, "DESTROY_NO");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NONotEqualTo(String value) {
            addCriterion("DESTROY_NO <>", value, "DESTROY_NO");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NOGreaterThan(String value) {
            addCriterion("DESTROY_NO >", value, "DESTROY_NO");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NOGreaterThanOrEqualTo(String value) {
            addCriterion("DESTROY_NO >=", value, "DESTROY_NO");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NOLessThan(String value) {
            addCriterion("DESTROY_NO <", value, "DESTROY_NO");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NOLessThanOrEqualTo(String value) {
            addCriterion("DESTROY_NO <=", value, "DESTROY_NO");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NOLike(String value) {
            addCriterion("DESTROY_NO like", value, "DESTROY_NO");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NONotLike(String value) {
            addCriterion("DESTROY_NO not like", value, "DESTROY_NO");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NOIn(List<String> values) {
            addCriterion("DESTROY_NO in", values, "DESTROY_NO");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NONotIn(List<String> values) {
            addCriterion("DESTROY_NO not in", values, "DESTROY_NO");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NOBetween(String value1, String value2) {
            addCriterion("DESTROY_NO between", value1, value2, "DESTROY_NO");
            return (Criteria) this;
        }

        public Criteria andDESTROY_NONotBetween(String value1, String value2) {
            addCriterion("DESTROY_NO not between", value1, value2, "DESTROY_NO");
            return (Criteria) this;
        }

        public Criteria andCUST_CODEIsNull() {
            addCriterion("CUST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCUST_CODEIsNotNull() {
            addCriterion("CUST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCUST_CODEEqualTo(String value) {
            addCriterion("CUST_CODE =", value, "CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCUST_CODENotEqualTo(String value) {
            addCriterion("CUST_CODE <>", value, "CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCUST_CODEGreaterThan(String value) {
            addCriterion("CUST_CODE >", value, "CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCUST_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_CODE >=", value, "CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCUST_CODELessThan(String value) {
            addCriterion("CUST_CODE <", value, "CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCUST_CODELessThanOrEqualTo(String value) {
            addCriterion("CUST_CODE <=", value, "CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCUST_CODELike(String value) {
            addCriterion("CUST_CODE like", value, "CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCUST_CODENotLike(String value) {
            addCriterion("CUST_CODE not like", value, "CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCUST_CODEIn(List<String> values) {
            addCriterion("CUST_CODE in", values, "CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCUST_CODENotIn(List<String> values) {
            addCriterion("CUST_CODE not in", values, "CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCUST_CODEBetween(String value1, String value2) {
            addCriterion("CUST_CODE between", value1, value2, "CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andCUST_CODENotBetween(String value1, String value2) {
            addCriterion("CUST_CODE not between", value1, value2, "CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COUNTIsNull() {
            addCriterion("PRODUCT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COUNTIsNotNull() {
            addCriterion("PRODUCT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COUNTEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_COUNT =", value, "PRODUCT_COUNT");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COUNTNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_COUNT <>", value, "PRODUCT_COUNT");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COUNTGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_COUNT >", value, "PRODUCT_COUNT");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COUNTGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_COUNT >=", value, "PRODUCT_COUNT");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COUNTLessThan(BigDecimal value) {
            addCriterion("PRODUCT_COUNT <", value, "PRODUCT_COUNT");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COUNTLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_COUNT <=", value, "PRODUCT_COUNT");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COUNTIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_COUNT in", values, "PRODUCT_COUNT");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COUNTNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_COUNT not in", values, "PRODUCT_COUNT");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COUNTBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_COUNT between", value1, value2, "PRODUCT_COUNT");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COUNTNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_COUNT not between", value1, value2, "PRODUCT_COUNT");
            return (Criteria) this;
        }

        public Criteria andFQC_COUNTIsNull() {
            addCriterion("FQC_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andFQC_COUNTIsNotNull() {
            addCriterion("FQC_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFQC_COUNTEqualTo(BigDecimal value) {
            addCriterion("FQC_COUNT =", value, "FQC_COUNT");
            return (Criteria) this;
        }

        public Criteria andFQC_COUNTNotEqualTo(BigDecimal value) {
            addCriterion("FQC_COUNT <>", value, "FQC_COUNT");
            return (Criteria) this;
        }

        public Criteria andFQC_COUNTGreaterThan(BigDecimal value) {
            addCriterion("FQC_COUNT >", value, "FQC_COUNT");
            return (Criteria) this;
        }

        public Criteria andFQC_COUNTGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FQC_COUNT >=", value, "FQC_COUNT");
            return (Criteria) this;
        }

        public Criteria andFQC_COUNTLessThan(BigDecimal value) {
            addCriterion("FQC_COUNT <", value, "FQC_COUNT");
            return (Criteria) this;
        }

        public Criteria andFQC_COUNTLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FQC_COUNT <=", value, "FQC_COUNT");
            return (Criteria) this;
        }

        public Criteria andFQC_COUNTIn(List<BigDecimal> values) {
            addCriterion("FQC_COUNT in", values, "FQC_COUNT");
            return (Criteria) this;
        }

        public Criteria andFQC_COUNTNotIn(List<BigDecimal> values) {
            addCriterion("FQC_COUNT not in", values, "FQC_COUNT");
            return (Criteria) this;
        }

        public Criteria andFQC_COUNTBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FQC_COUNT between", value1, value2, "FQC_COUNT");
            return (Criteria) this;
        }

        public Criteria andFQC_COUNTNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FQC_COUNT not between", value1, value2, "FQC_COUNT");
            return (Criteria) this;
        }

        public Criteria andFINISH_COUNTIsNull() {
            addCriterion("FINISH_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andFINISH_COUNTIsNotNull() {
            addCriterion("FINISH_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFINISH_COUNTEqualTo(BigDecimal value) {
            addCriterion("FINISH_COUNT =", value, "FINISH_COUNT");
            return (Criteria) this;
        }

        public Criteria andFINISH_COUNTNotEqualTo(BigDecimal value) {
            addCriterion("FINISH_COUNT <>", value, "FINISH_COUNT");
            return (Criteria) this;
        }

        public Criteria andFINISH_COUNTGreaterThan(BigDecimal value) {
            addCriterion("FINISH_COUNT >", value, "FINISH_COUNT");
            return (Criteria) this;
        }

        public Criteria andFINISH_COUNTGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FINISH_COUNT >=", value, "FINISH_COUNT");
            return (Criteria) this;
        }

        public Criteria andFINISH_COUNTLessThan(BigDecimal value) {
            addCriterion("FINISH_COUNT <", value, "FINISH_COUNT");
            return (Criteria) this;
        }

        public Criteria andFINISH_COUNTLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FINISH_COUNT <=", value, "FINISH_COUNT");
            return (Criteria) this;
        }

        public Criteria andFINISH_COUNTIn(List<BigDecimal> values) {
            addCriterion("FINISH_COUNT in", values, "FINISH_COUNT");
            return (Criteria) this;
        }

        public Criteria andFINISH_COUNTNotIn(List<BigDecimal> values) {
            addCriterion("FINISH_COUNT not in", values, "FINISH_COUNT");
            return (Criteria) this;
        }

        public Criteria andFINISH_COUNTBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINISH_COUNT between", value1, value2, "FINISH_COUNT");
            return (Criteria) this;
        }

        public Criteria andFINISH_COUNTNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINISH_COUNT not between", value1, value2, "FINISH_COUNT");
            return (Criteria) this;
        }

        public Criteria andWORKING_SCIsNull() {
            addCriterion("WORKING_SC is null");
            return (Criteria) this;
        }

        public Criteria andWORKING_SCIsNotNull() {
            addCriterion("WORKING_SC is not null");
            return (Criteria) this;
        }

        public Criteria andWORKING_SCEqualTo(BigDecimal value) {
            addCriterion("WORKING_SC =", value, "WORKING_SC");
            return (Criteria) this;
        }

        public Criteria andWORKING_SCNotEqualTo(BigDecimal value) {
            addCriterion("WORKING_SC <>", value, "WORKING_SC");
            return (Criteria) this;
        }

        public Criteria andWORKING_SCGreaterThan(BigDecimal value) {
            addCriterion("WORKING_SC >", value, "WORKING_SC");
            return (Criteria) this;
        }

        public Criteria andWORKING_SCGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKING_SC >=", value, "WORKING_SC");
            return (Criteria) this;
        }

        public Criteria andWORKING_SCLessThan(BigDecimal value) {
            addCriterion("WORKING_SC <", value, "WORKING_SC");
            return (Criteria) this;
        }

        public Criteria andWORKING_SCLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKING_SC <=", value, "WORKING_SC");
            return (Criteria) this;
        }

        public Criteria andWORKING_SCIn(List<BigDecimal> values) {
            addCriterion("WORKING_SC in", values, "WORKING_SC");
            return (Criteria) this;
        }

        public Criteria andWORKING_SCNotIn(List<BigDecimal> values) {
            addCriterion("WORKING_SC not in", values, "WORKING_SC");
            return (Criteria) this;
        }

        public Criteria andWORKING_SCBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKING_SC between", value1, value2, "WORKING_SC");
            return (Criteria) this;
        }

        public Criteria andWORKING_SCNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKING_SC not between", value1, value2, "WORKING_SC");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSIsNull() {
            addCriterion("PROJECT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSIsNotNull() {
            addCriterion("PROJECT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSEqualTo(String value) {
            addCriterion("PROJECT_STATUS =", value, "PROJECT_STATUS");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSNotEqualTo(String value) {
            addCriterion("PROJECT_STATUS <>", value, "PROJECT_STATUS");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSGreaterThan(String value) {
            addCriterion("PROJECT_STATUS >", value, "PROJECT_STATUS");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_STATUS >=", value, "PROJECT_STATUS");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSLessThan(String value) {
            addCriterion("PROJECT_STATUS <", value, "PROJECT_STATUS");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_STATUS <=", value, "PROJECT_STATUS");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSLike(String value) {
            addCriterion("PROJECT_STATUS like", value, "PROJECT_STATUS");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSNotLike(String value) {
            addCriterion("PROJECT_STATUS not like", value, "PROJECT_STATUS");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSIn(List<String> values) {
            addCriterion("PROJECT_STATUS in", values, "PROJECT_STATUS");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSNotIn(List<String> values) {
            addCriterion("PROJECT_STATUS not in", values, "PROJECT_STATUS");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSBetween(String value1, String value2) {
            addCriterion("PROJECT_STATUS between", value1, value2, "PROJECT_STATUS");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STATUSNotBetween(String value1, String value2) {
            addCriterion("PROJECT_STATUS not between", value1, value2, "PROJECT_STATUS");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPEIsNull() {
            addCriterion("PROJECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPEIsNotNull() {
            addCriterion("PROJECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPEEqualTo(String value) {
            addCriterion("PROJECT_TYPE =", value, "PROJECT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPENotEqualTo(String value) {
            addCriterion("PROJECT_TYPE <>", value, "PROJECT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPEGreaterThan(String value) {
            addCriterion("PROJECT_TYPE >", value, "PROJECT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_TYPE >=", value, "PROJECT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPELessThan(String value) {
            addCriterion("PROJECT_TYPE <", value, "PROJECT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPELessThanOrEqualTo(String value) {
            addCriterion("PROJECT_TYPE <=", value, "PROJECT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPELike(String value) {
            addCriterion("PROJECT_TYPE like", value, "PROJECT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPENotLike(String value) {
            addCriterion("PROJECT_TYPE not like", value, "PROJECT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPEIn(List<String> values) {
            addCriterion("PROJECT_TYPE in", values, "PROJECT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPENotIn(List<String> values) {
            addCriterion("PROJECT_TYPE not in", values, "PROJECT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPEBetween(String value1, String value2) {
            addCriterion("PROJECT_TYPE between", value1, value2, "PROJECT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_TYPENotBetween(String value1, String value2) {
            addCriterion("PROJECT_TYPE not between", value1, value2, "PROJECT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_START_DATEIsNull() {
            addCriterion("PROLEPSIS_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_START_DATEIsNotNull() {
            addCriterion("PROLEPSIS_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_START_DATEEqualTo(Date value) {
            addCriterionForJDBCDate("PROLEPSIS_START_DATE =", value, "PROLEPSIS_START_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_START_DATENotEqualTo(Date value) {
            addCriterionForJDBCDate("PROLEPSIS_START_DATE <>", value, "PROLEPSIS_START_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_START_DATEGreaterThan(Date value) {
            addCriterionForJDBCDate("PROLEPSIS_START_DATE >", value, "PROLEPSIS_START_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_START_DATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PROLEPSIS_START_DATE >=", value, "PROLEPSIS_START_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_START_DATELessThan(Date value) {
            addCriterionForJDBCDate("PROLEPSIS_START_DATE <", value, "PROLEPSIS_START_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_START_DATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PROLEPSIS_START_DATE <=", value, "PROLEPSIS_START_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_START_DATEIn(List<Date> values) {
            addCriterionForJDBCDate("PROLEPSIS_START_DATE in", values, "PROLEPSIS_START_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_START_DATENotIn(List<Date> values) {
            addCriterionForJDBCDate("PROLEPSIS_START_DATE not in", values, "PROLEPSIS_START_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_START_DATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PROLEPSIS_START_DATE between", value1, value2, "PROLEPSIS_START_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_START_DATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PROLEPSIS_START_DATE not between", value1, value2, "PROLEPSIS_START_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_END_DATEIsNull() {
            addCriterion("PROLEPSIS_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_END_DATEIsNotNull() {
            addCriterion("PROLEPSIS_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_END_DATEEqualTo(Date value) {
            addCriterionForJDBCDate("PROLEPSIS_END_DATE =", value, "PROLEPSIS_END_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_END_DATENotEqualTo(Date value) {
            addCriterionForJDBCDate("PROLEPSIS_END_DATE <>", value, "PROLEPSIS_END_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_END_DATEGreaterThan(Date value) {
            addCriterionForJDBCDate("PROLEPSIS_END_DATE >", value, "PROLEPSIS_END_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_END_DATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PROLEPSIS_END_DATE >=", value, "PROLEPSIS_END_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_END_DATELessThan(Date value) {
            addCriterionForJDBCDate("PROLEPSIS_END_DATE <", value, "PROLEPSIS_END_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_END_DATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PROLEPSIS_END_DATE <=", value, "PROLEPSIS_END_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_END_DATEIn(List<Date> values) {
            addCriterionForJDBCDate("PROLEPSIS_END_DATE in", values, "PROLEPSIS_END_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_END_DATENotIn(List<Date> values) {
            addCriterionForJDBCDate("PROLEPSIS_END_DATE not in", values, "PROLEPSIS_END_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_END_DATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PROLEPSIS_END_DATE between", value1, value2, "PROLEPSIS_END_DATE");
            return (Criteria) this;
        }

        public Criteria andPROLEPSIS_END_DATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PROLEPSIS_END_DATE not between", value1, value2, "PROLEPSIS_END_DATE");
            return (Criteria) this;
        }

        public Criteria andTPPB_PLAN_DELIVERY_DATEIsNull() {
            addCriterion("TPPB_PLAN_DELIVERY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTPPB_PLAN_DELIVERY_DATEIsNotNull() {
            addCriterion("TPPB_PLAN_DELIVERY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTPPB_PLAN_DELIVERY_DATEEqualTo(Date value) {
            addCriterionForJDBCDate("TPPB_PLAN_DELIVERY_DATE =", value, "TPPB_PLAN_DELIVERY_DATE");
            return (Criteria) this;
        }

        public Criteria andTPPB_PLAN_DELIVERY_DATENotEqualTo(Date value) {
            addCriterionForJDBCDate("TPPB_PLAN_DELIVERY_DATE <>", value, "TPPB_PLAN_DELIVERY_DATE");
            return (Criteria) this;
        }

        public Criteria andTPPB_PLAN_DELIVERY_DATEGreaterThan(Date value) {
            addCriterionForJDBCDate("TPPB_PLAN_DELIVERY_DATE >", value, "TPPB_PLAN_DELIVERY_DATE");
            return (Criteria) this;
        }

        public Criteria andTPPB_PLAN_DELIVERY_DATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TPPB_PLAN_DELIVERY_DATE >=", value, "TPPB_PLAN_DELIVERY_DATE");
            return (Criteria) this;
        }

        public Criteria andTPPB_PLAN_DELIVERY_DATELessThan(Date value) {
            addCriterionForJDBCDate("TPPB_PLAN_DELIVERY_DATE <", value, "TPPB_PLAN_DELIVERY_DATE");
            return (Criteria) this;
        }

        public Criteria andTPPB_PLAN_DELIVERY_DATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TPPB_PLAN_DELIVERY_DATE <=", value, "TPPB_PLAN_DELIVERY_DATE");
            return (Criteria) this;
        }

        public Criteria andTPPB_PLAN_DELIVERY_DATEIn(List<Date> values) {
            addCriterionForJDBCDate("TPPB_PLAN_DELIVERY_DATE in", values, "TPPB_PLAN_DELIVERY_DATE");
            return (Criteria) this;
        }

        public Criteria andTPPB_PLAN_DELIVERY_DATENotIn(List<Date> values) {
            addCriterionForJDBCDate("TPPB_PLAN_DELIVERY_DATE not in", values, "TPPB_PLAN_DELIVERY_DATE");
            return (Criteria) this;
        }

        public Criteria andTPPB_PLAN_DELIVERY_DATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TPPB_PLAN_DELIVERY_DATE between", value1, value2, "TPPB_PLAN_DELIVERY_DATE");
            return (Criteria) this;
        }

        public Criteria andTPPB_PLAN_DELIVERY_DATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TPPB_PLAN_DELIVERY_DATE not between", value1, value2, "TPPB_PLAN_DELIVERY_DATE");
            return (Criteria) this;
        }

        public Criteria andPM_MEMOIsNull() {
            addCriterion("PM_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andPM_MEMOIsNotNull() {
            addCriterion("PM_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andPM_MEMOEqualTo(String value) {
            addCriterion("PM_MEMO =", value, "PM_MEMO");
            return (Criteria) this;
        }

        public Criteria andPM_MEMONotEqualTo(String value) {
            addCriterion("PM_MEMO <>", value, "PM_MEMO");
            return (Criteria) this;
        }

        public Criteria andPM_MEMOGreaterThan(String value) {
            addCriterion("PM_MEMO >", value, "PM_MEMO");
            return (Criteria) this;
        }

        public Criteria andPM_MEMOGreaterThanOrEqualTo(String value) {
            addCriterion("PM_MEMO >=", value, "PM_MEMO");
            return (Criteria) this;
        }

        public Criteria andPM_MEMOLessThan(String value) {
            addCriterion("PM_MEMO <", value, "PM_MEMO");
            return (Criteria) this;
        }

        public Criteria andPM_MEMOLessThanOrEqualTo(String value) {
            addCriterion("PM_MEMO <=", value, "PM_MEMO");
            return (Criteria) this;
        }

        public Criteria andPM_MEMOLike(String value) {
            addCriterion("PM_MEMO like", value, "PM_MEMO");
            return (Criteria) this;
        }

        public Criteria andPM_MEMONotLike(String value) {
            addCriterion("PM_MEMO not like", value, "PM_MEMO");
            return (Criteria) this;
        }

        public Criteria andPM_MEMOIn(List<String> values) {
            addCriterion("PM_MEMO in", values, "PM_MEMO");
            return (Criteria) this;
        }

        public Criteria andPM_MEMONotIn(List<String> values) {
            addCriterion("PM_MEMO not in", values, "PM_MEMO");
            return (Criteria) this;
        }

        public Criteria andPM_MEMOBetween(String value1, String value2) {
            addCriterion("PM_MEMO between", value1, value2, "PM_MEMO");
            return (Criteria) this;
        }

        public Criteria andPM_MEMONotBetween(String value1, String value2) {
            addCriterion("PM_MEMO not between", value1, value2, "PM_MEMO");
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

        public Criteria andPRODUCT_LINEIsNull() {
            addCriterion("PRODUCT_LINE is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINEIsNotNull() {
            addCriterion("PRODUCT_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINEEqualTo(String value) {
            addCriterion("PRODUCT_LINE =", value, "PRODUCT_LINE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINENotEqualTo(String value) {
            addCriterion("PRODUCT_LINE <>", value, "PRODUCT_LINE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINEGreaterThan(String value) {
            addCriterion("PRODUCT_LINE >", value, "PRODUCT_LINE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINEGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_LINE >=", value, "PRODUCT_LINE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINELessThan(String value) {
            addCriterion("PRODUCT_LINE <", value, "PRODUCT_LINE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINELessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_LINE <=", value, "PRODUCT_LINE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINELike(String value) {
            addCriterion("PRODUCT_LINE like", value, "PRODUCT_LINE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINENotLike(String value) {
            addCriterion("PRODUCT_LINE not like", value, "PRODUCT_LINE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINEIn(List<String> values) {
            addCriterion("PRODUCT_LINE in", values, "PRODUCT_LINE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINENotIn(List<String> values) {
            addCriterion("PRODUCT_LINE not in", values, "PRODUCT_LINE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINEBetween(String value1, String value2) {
            addCriterion("PRODUCT_LINE between", value1, value2, "PRODUCT_LINE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_LINENotBetween(String value1, String value2) {
            addCriterion("PRODUCT_LINE not between", value1, value2, "PRODUCT_LINE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_START_DATEIsNull() {
            addCriterion("ACTUAL_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andACTUAL_START_DATEIsNotNull() {
            addCriterion("ACTUAL_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andACTUAL_START_DATEEqualTo(Date value) {
            addCriterionForJDBCDate("ACTUAL_START_DATE =", value, "ACTUAL_START_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_START_DATENotEqualTo(Date value) {
            addCriterionForJDBCDate("ACTUAL_START_DATE <>", value, "ACTUAL_START_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_START_DATEGreaterThan(Date value) {
            addCriterionForJDBCDate("ACTUAL_START_DATE >", value, "ACTUAL_START_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_START_DATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTUAL_START_DATE >=", value, "ACTUAL_START_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_START_DATELessThan(Date value) {
            addCriterionForJDBCDate("ACTUAL_START_DATE <", value, "ACTUAL_START_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_START_DATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTUAL_START_DATE <=", value, "ACTUAL_START_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_START_DATEIn(List<Date> values) {
            addCriterionForJDBCDate("ACTUAL_START_DATE in", values, "ACTUAL_START_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_START_DATENotIn(List<Date> values) {
            addCriterionForJDBCDate("ACTUAL_START_DATE not in", values, "ACTUAL_START_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_START_DATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTUAL_START_DATE between", value1, value2, "ACTUAL_START_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_START_DATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTUAL_START_DATE not between", value1, value2, "ACTUAL_START_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_END_DATEIsNull() {
            addCriterion("ACTUAL_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andACTUAL_END_DATEIsNotNull() {
            addCriterion("ACTUAL_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andACTUAL_END_DATEEqualTo(Date value) {
            addCriterionForJDBCDate("ACTUAL_END_DATE =", value, "ACTUAL_END_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_END_DATENotEqualTo(Date value) {
            addCriterionForJDBCDate("ACTUAL_END_DATE <>", value, "ACTUAL_END_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_END_DATEGreaterThan(Date value) {
            addCriterionForJDBCDate("ACTUAL_END_DATE >", value, "ACTUAL_END_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_END_DATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTUAL_END_DATE >=", value, "ACTUAL_END_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_END_DATELessThan(Date value) {
            addCriterionForJDBCDate("ACTUAL_END_DATE <", value, "ACTUAL_END_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_END_DATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTUAL_END_DATE <=", value, "ACTUAL_END_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_END_DATEIn(List<Date> values) {
            addCriterionForJDBCDate("ACTUAL_END_DATE in", values, "ACTUAL_END_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_END_DATENotIn(List<Date> values) {
            addCriterionForJDBCDate("ACTUAL_END_DATE not in", values, "ACTUAL_END_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_END_DATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTUAL_END_DATE between", value1, value2, "ACTUAL_END_DATE");
            return (Criteria) this;
        }

        public Criteria andACTUAL_END_DATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTUAL_END_DATE not between", value1, value2, "ACTUAL_END_DATE");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONIsNull() {
            addCriterion("PM_CLOSE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONIsNotNull() {
            addCriterion("PM_CLOSE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONEqualTo(String value) {
            addCriterion("PM_CLOSE_REASON =", value, "PM_CLOSE_REASON");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONNotEqualTo(String value) {
            addCriterion("PM_CLOSE_REASON <>", value, "PM_CLOSE_REASON");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONGreaterThan(String value) {
            addCriterion("PM_CLOSE_REASON >", value, "PM_CLOSE_REASON");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONGreaterThanOrEqualTo(String value) {
            addCriterion("PM_CLOSE_REASON >=", value, "PM_CLOSE_REASON");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONLessThan(String value) {
            addCriterion("PM_CLOSE_REASON <", value, "PM_CLOSE_REASON");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONLessThanOrEqualTo(String value) {
            addCriterion("PM_CLOSE_REASON <=", value, "PM_CLOSE_REASON");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONLike(String value) {
            addCriterion("PM_CLOSE_REASON like", value, "PM_CLOSE_REASON");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONNotLike(String value) {
            addCriterion("PM_CLOSE_REASON not like", value, "PM_CLOSE_REASON");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONIn(List<String> values) {
            addCriterion("PM_CLOSE_REASON in", values, "PM_CLOSE_REASON");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONNotIn(List<String> values) {
            addCriterion("PM_CLOSE_REASON not in", values, "PM_CLOSE_REASON");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONBetween(String value1, String value2) {
            addCriterion("PM_CLOSE_REASON between", value1, value2, "PM_CLOSE_REASON");
            return (Criteria) this;
        }

        public Criteria andPM_CLOSE_REASONNotBetween(String value1, String value2) {
            addCriterion("PM_CLOSE_REASON not between", value1, value2, "PM_CLOSE_REASON");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPIsNull() {
            addCriterion("PROJECT_STEP is null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPIsNotNull() {
            addCriterion("PROJECT_STEP is not null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPEqualTo(String value) {
            addCriterion("PROJECT_STEP =", value, "PROJECT_STEP");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPNotEqualTo(String value) {
            addCriterion("PROJECT_STEP <>", value, "PROJECT_STEP");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPGreaterThan(String value) {
            addCriterion("PROJECT_STEP >", value, "PROJECT_STEP");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_STEP >=", value, "PROJECT_STEP");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPLessThan(String value) {
            addCriterion("PROJECT_STEP <", value, "PROJECT_STEP");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_STEP <=", value, "PROJECT_STEP");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPLike(String value) {
            addCriterion("PROJECT_STEP like", value, "PROJECT_STEP");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPNotLike(String value) {
            addCriterion("PROJECT_STEP not like", value, "PROJECT_STEP");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPIn(List<String> values) {
            addCriterion("PROJECT_STEP in", values, "PROJECT_STEP");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPNotIn(List<String> values) {
            addCriterion("PROJECT_STEP not in", values, "PROJECT_STEP");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPBetween(String value1, String value2) {
            addCriterion("PROJECT_STEP between", value1, value2, "PROJECT_STEP");
            return (Criteria) this;
        }

        public Criteria andPROJECT_STEPNotBetween(String value1, String value2) {
            addCriterion("PROJECT_STEP not between", value1, value2, "PROJECT_STEP");
            return (Criteria) this;
        }

        public Criteria andFAI_NUMIsNull() {
            addCriterion("FAI_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFAI_NUMIsNotNull() {
            addCriterion("FAI_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFAI_NUMEqualTo(BigDecimal value) {
            addCriterion("FAI_NUM =", value, "FAI_NUM");
            return (Criteria) this;
        }

        public Criteria andFAI_NUMNotEqualTo(BigDecimal value) {
            addCriterion("FAI_NUM <>", value, "FAI_NUM");
            return (Criteria) this;
        }

        public Criteria andFAI_NUMGreaterThan(BigDecimal value) {
            addCriterion("FAI_NUM >", value, "FAI_NUM");
            return (Criteria) this;
        }

        public Criteria andFAI_NUMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAI_NUM >=", value, "FAI_NUM");
            return (Criteria) this;
        }

        public Criteria andFAI_NUMLessThan(BigDecimal value) {
            addCriterion("FAI_NUM <", value, "FAI_NUM");
            return (Criteria) this;
        }

        public Criteria andFAI_NUMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAI_NUM <=", value, "FAI_NUM");
            return (Criteria) this;
        }

        public Criteria andFAI_NUMIn(List<BigDecimal> values) {
            addCriterion("FAI_NUM in", values, "FAI_NUM");
            return (Criteria) this;
        }

        public Criteria andFAI_NUMNotIn(List<BigDecimal> values) {
            addCriterion("FAI_NUM not in", values, "FAI_NUM");
            return (Criteria) this;
        }

        public Criteria andFAI_NUMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAI_NUM between", value1, value2, "FAI_NUM");
            return (Criteria) this;
        }

        public Criteria andFAI_NUMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAI_NUM not between", value1, value2, "FAI_NUM");
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

        public Criteria andPROJECT_ERPTYPEIsNull() {
            addCriterion("PROJECT_ERPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPEIsNotNull() {
            addCriterion("PROJECT_ERPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPEEqualTo(String value) {
            addCriterion("PROJECT_ERPTYPE =", value, "PROJECT_ERPTYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPENotEqualTo(String value) {
            addCriterion("PROJECT_ERPTYPE <>", value, "PROJECT_ERPTYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPEGreaterThan(String value) {
            addCriterion("PROJECT_ERPTYPE >", value, "PROJECT_ERPTYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_ERPTYPE >=", value, "PROJECT_ERPTYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPELessThan(String value) {
            addCriterion("PROJECT_ERPTYPE <", value, "PROJECT_ERPTYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPELessThanOrEqualTo(String value) {
            addCriterion("PROJECT_ERPTYPE <=", value, "PROJECT_ERPTYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPELike(String value) {
            addCriterion("PROJECT_ERPTYPE like", value, "PROJECT_ERPTYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPENotLike(String value) {
            addCriterion("PROJECT_ERPTYPE not like", value, "PROJECT_ERPTYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPEIn(List<String> values) {
            addCriterion("PROJECT_ERPTYPE in", values, "PROJECT_ERPTYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPENotIn(List<String> values) {
            addCriterion("PROJECT_ERPTYPE not in", values, "PROJECT_ERPTYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPEBetween(String value1, String value2) {
            addCriterion("PROJECT_ERPTYPE between", value1, value2, "PROJECT_ERPTYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_ERPTYPENotBetween(String value1, String value2) {
            addCriterion("PROJECT_ERPTYPE not between", value1, value2, "PROJECT_ERPTYPE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFIsNull() {
            addCriterion("PROJECT_OFONESELF is null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFIsNotNull() {
            addCriterion("PROJECT_OFONESELF is not null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFEqualTo(String value) {
            addCriterion("PROJECT_OFONESELF =", value, "PROJECT_OFONESELF");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFNotEqualTo(String value) {
            addCriterion("PROJECT_OFONESELF <>", value, "PROJECT_OFONESELF");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFGreaterThan(String value) {
            addCriterion("PROJECT_OFONESELF >", value, "PROJECT_OFONESELF");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_OFONESELF >=", value, "PROJECT_OFONESELF");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFLessThan(String value) {
            addCriterion("PROJECT_OFONESELF <", value, "PROJECT_OFONESELF");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_OFONESELF <=", value, "PROJECT_OFONESELF");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFLike(String value) {
            addCriterion("PROJECT_OFONESELF like", value, "PROJECT_OFONESELF");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFNotLike(String value) {
            addCriterion("PROJECT_OFONESELF not like", value, "PROJECT_OFONESELF");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFIn(List<String> values) {
            addCriterion("PROJECT_OFONESELF in", values, "PROJECT_OFONESELF");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFNotIn(List<String> values) {
            addCriterion("PROJECT_OFONESELF not in", values, "PROJECT_OFONESELF");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFBetween(String value1, String value2) {
            addCriterion("PROJECT_OFONESELF between", value1, value2, "PROJECT_OFONESELF");
            return (Criteria) this;
        }

        public Criteria andPROJECT_OFONESELFNotBetween(String value1, String value2) {
            addCriterion("PROJECT_OFONESELF not between", value1, value2, "PROJECT_OFONESELF");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERIsNull() {
            addCriterion("LOT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERIsNotNull() {
            addCriterion("LOT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBEREqualTo(String value) {
            addCriterion("LOT_NUMBER =", value, "LOT_NUMBER");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERNotEqualTo(String value) {
            addCriterion("LOT_NUMBER <>", value, "LOT_NUMBER");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERGreaterThan(String value) {
            addCriterion("LOT_NUMBER >", value, "LOT_NUMBER");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERGreaterThanOrEqualTo(String value) {
            addCriterion("LOT_NUMBER >=", value, "LOT_NUMBER");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERLessThan(String value) {
            addCriterion("LOT_NUMBER <", value, "LOT_NUMBER");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERLessThanOrEqualTo(String value) {
            addCriterion("LOT_NUMBER <=", value, "LOT_NUMBER");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERLike(String value) {
            addCriterion("LOT_NUMBER like", value, "LOT_NUMBER");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERNotLike(String value) {
            addCriterion("LOT_NUMBER not like", value, "LOT_NUMBER");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERIn(List<String> values) {
            addCriterion("LOT_NUMBER in", values, "LOT_NUMBER");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERNotIn(List<String> values) {
            addCriterion("LOT_NUMBER not in", values, "LOT_NUMBER");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERBetween(String value1, String value2) {
            addCriterion("LOT_NUMBER between", value1, value2, "LOT_NUMBER");
            return (Criteria) this;
        }

        public Criteria andLOT_NUMBERNotBetween(String value1, String value2) {
            addCriterion("LOT_NUMBER not between", value1, value2, "LOT_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTIsNull() {
            addCriterion("PRODUCT_SN_START is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTIsNotNull() {
            addCriterion("PRODUCT_SN_START is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTEqualTo(String value) {
            addCriterion("PRODUCT_SN_START =", value, "PRODUCT_SN_START");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTNotEqualTo(String value) {
            addCriterion("PRODUCT_SN_START <>", value, "PRODUCT_SN_START");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTGreaterThan(String value) {
            addCriterion("PRODUCT_SN_START >", value, "PRODUCT_SN_START");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SN_START >=", value, "PRODUCT_SN_START");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTLessThan(String value) {
            addCriterion("PRODUCT_SN_START <", value, "PRODUCT_SN_START");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SN_START <=", value, "PRODUCT_SN_START");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTLike(String value) {
            addCriterion("PRODUCT_SN_START like", value, "PRODUCT_SN_START");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTNotLike(String value) {
            addCriterion("PRODUCT_SN_START not like", value, "PRODUCT_SN_START");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTIn(List<String> values) {
            addCriterion("PRODUCT_SN_START in", values, "PRODUCT_SN_START");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTNotIn(List<String> values) {
            addCriterion("PRODUCT_SN_START not in", values, "PRODUCT_SN_START");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTBetween(String value1, String value2) {
            addCriterion("PRODUCT_SN_START between", value1, value2, "PRODUCT_SN_START");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_STARTNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SN_START not between", value1, value2, "PRODUCT_SN_START");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDIsNull() {
            addCriterion("PRODUCT_SN_END is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDIsNotNull() {
            addCriterion("PRODUCT_SN_END is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDEqualTo(String value) {
            addCriterion("PRODUCT_SN_END =", value, "PRODUCT_SN_END");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDNotEqualTo(String value) {
            addCriterion("PRODUCT_SN_END <>", value, "PRODUCT_SN_END");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDGreaterThan(String value) {
            addCriterion("PRODUCT_SN_END >", value, "PRODUCT_SN_END");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SN_END >=", value, "PRODUCT_SN_END");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDLessThan(String value) {
            addCriterion("PRODUCT_SN_END <", value, "PRODUCT_SN_END");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SN_END <=", value, "PRODUCT_SN_END");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDLike(String value) {
            addCriterion("PRODUCT_SN_END like", value, "PRODUCT_SN_END");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDNotLike(String value) {
            addCriterion("PRODUCT_SN_END not like", value, "PRODUCT_SN_END");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDIn(List<String> values) {
            addCriterion("PRODUCT_SN_END in", values, "PRODUCT_SN_END");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDNotIn(List<String> values) {
            addCriterion("PRODUCT_SN_END not in", values, "PRODUCT_SN_END");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDBetween(String value1, String value2) {
            addCriterion("PRODUCT_SN_END between", value1, value2, "PRODUCT_SN_END");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_ENDNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SN_END not between", value1, value2, "PRODUCT_SN_END");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXIsNull() {
            addCriterion("PRODUCT_SN_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXIsNotNull() {
            addCriterion("PRODUCT_SN_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXEqualTo(String value) {
            addCriterion("PRODUCT_SN_PREFIX =", value, "PRODUCT_SN_PREFIX");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXNotEqualTo(String value) {
            addCriterion("PRODUCT_SN_PREFIX <>", value, "PRODUCT_SN_PREFIX");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXGreaterThan(String value) {
            addCriterion("PRODUCT_SN_PREFIX >", value, "PRODUCT_SN_PREFIX");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SN_PREFIX >=", value, "PRODUCT_SN_PREFIX");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXLessThan(String value) {
            addCriterion("PRODUCT_SN_PREFIX <", value, "PRODUCT_SN_PREFIX");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SN_PREFIX <=", value, "PRODUCT_SN_PREFIX");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXLike(String value) {
            addCriterion("PRODUCT_SN_PREFIX like", value, "PRODUCT_SN_PREFIX");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXNotLike(String value) {
            addCriterion("PRODUCT_SN_PREFIX not like", value, "PRODUCT_SN_PREFIX");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXIn(List<String> values) {
            addCriterion("PRODUCT_SN_PREFIX in", values, "PRODUCT_SN_PREFIX");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXNotIn(List<String> values) {
            addCriterion("PRODUCT_SN_PREFIX not in", values, "PRODUCT_SN_PREFIX");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXBetween(String value1, String value2) {
            addCriterion("PRODUCT_SN_PREFIX between", value1, value2, "PRODUCT_SN_PREFIX");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_SN_PREFIXNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SN_PREFIX not between", value1, value2, "PRODUCT_SN_PREFIX");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQIsNull() {
            addCriterion("PRODUCT_PACK_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQIsNotNull() {
            addCriterion("PRODUCT_PACK_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQEqualTo(String value) {
            addCriterion("PRODUCT_PACK_SEQ =", value, "PRODUCT_PACK_SEQ");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQNotEqualTo(String value) {
            addCriterion("PRODUCT_PACK_SEQ <>", value, "PRODUCT_PACK_SEQ");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQGreaterThan(String value) {
            addCriterion("PRODUCT_PACK_SEQ >", value, "PRODUCT_PACK_SEQ");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PACK_SEQ >=", value, "PRODUCT_PACK_SEQ");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQLessThan(String value) {
            addCriterion("PRODUCT_PACK_SEQ <", value, "PRODUCT_PACK_SEQ");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PACK_SEQ <=", value, "PRODUCT_PACK_SEQ");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQLike(String value) {
            addCriterion("PRODUCT_PACK_SEQ like", value, "PRODUCT_PACK_SEQ");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQNotLike(String value) {
            addCriterion("PRODUCT_PACK_SEQ not like", value, "PRODUCT_PACK_SEQ");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQIn(List<String> values) {
            addCriterion("PRODUCT_PACK_SEQ in", values, "PRODUCT_PACK_SEQ");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQNotIn(List<String> values) {
            addCriterion("PRODUCT_PACK_SEQ not in", values, "PRODUCT_PACK_SEQ");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQBetween(String value1, String value2) {
            addCriterion("PRODUCT_PACK_SEQ between", value1, value2, "PRODUCT_PACK_SEQ");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PACK_SEQNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PACK_SEQ not between", value1, value2, "PRODUCT_PACK_SEQ");
            return (Criteria) this;
        }

        public Criteria andPM_CHANGE_TIMESIsNull() {
            addCriterion("PM_CHANGE_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andPM_CHANGE_TIMESIsNotNull() {
            addCriterion("PM_CHANGE_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andPM_CHANGE_TIMESEqualTo(BigDecimal value) {
            addCriterion("PM_CHANGE_TIMES =", value, "PM_CHANGE_TIMES");
            return (Criteria) this;
        }

        public Criteria andPM_CHANGE_TIMESNotEqualTo(BigDecimal value) {
            addCriterion("PM_CHANGE_TIMES <>", value, "PM_CHANGE_TIMES");
            return (Criteria) this;
        }

        public Criteria andPM_CHANGE_TIMESGreaterThan(BigDecimal value) {
            addCriterion("PM_CHANGE_TIMES >", value, "PM_CHANGE_TIMES");
            return (Criteria) this;
        }

        public Criteria andPM_CHANGE_TIMESGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PM_CHANGE_TIMES >=", value, "PM_CHANGE_TIMES");
            return (Criteria) this;
        }

        public Criteria andPM_CHANGE_TIMESLessThan(BigDecimal value) {
            addCriterion("PM_CHANGE_TIMES <", value, "PM_CHANGE_TIMES");
            return (Criteria) this;
        }

        public Criteria andPM_CHANGE_TIMESLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PM_CHANGE_TIMES <=", value, "PM_CHANGE_TIMES");
            return (Criteria) this;
        }

        public Criteria andPM_CHANGE_TIMESIn(List<BigDecimal> values) {
            addCriterion("PM_CHANGE_TIMES in", values, "PM_CHANGE_TIMES");
            return (Criteria) this;
        }

        public Criteria andPM_CHANGE_TIMESNotIn(List<BigDecimal> values) {
            addCriterion("PM_CHANGE_TIMES not in", values, "PM_CHANGE_TIMES");
            return (Criteria) this;
        }

        public Criteria andPM_CHANGE_TIMESBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PM_CHANGE_TIMES between", value1, value2, "PM_CHANGE_TIMES");
            return (Criteria) this;
        }

        public Criteria andPM_CHANGE_TIMESNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PM_CHANGE_TIMES not between", value1, value2, "PM_CHANGE_TIMES");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERIsNull() {
            addCriterion("PRODUCT_MATERIAL_VER is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERIsNotNull() {
            addCriterion("PRODUCT_MATERIAL_VER is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VEREqualTo(String value) {
            addCriterion("PRODUCT_MATERIAL_VER =", value, "PRODUCT_MATERIAL_VER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERNotEqualTo(String value) {
            addCriterion("PRODUCT_MATERIAL_VER <>", value, "PRODUCT_MATERIAL_VER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERGreaterThan(String value) {
            addCriterion("PRODUCT_MATERIAL_VER >", value, "PRODUCT_MATERIAL_VER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MATERIAL_VER >=", value, "PRODUCT_MATERIAL_VER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERLessThan(String value) {
            addCriterion("PRODUCT_MATERIAL_VER <", value, "PRODUCT_MATERIAL_VER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MATERIAL_VER <=", value, "PRODUCT_MATERIAL_VER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERLike(String value) {
            addCriterion("PRODUCT_MATERIAL_VER like", value, "PRODUCT_MATERIAL_VER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERNotLike(String value) {
            addCriterion("PRODUCT_MATERIAL_VER not like", value, "PRODUCT_MATERIAL_VER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERIn(List<String> values) {
            addCriterion("PRODUCT_MATERIAL_VER in", values, "PRODUCT_MATERIAL_VER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERNotIn(List<String> values) {
            addCriterion("PRODUCT_MATERIAL_VER not in", values, "PRODUCT_MATERIAL_VER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERBetween(String value1, String value2) {
            addCriterion("PRODUCT_MATERIAL_VER between", value1, value2, "PRODUCT_MATERIAL_VER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_MATERIAL_VERNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_MATERIAL_VER not between", value1, value2, "PRODUCT_MATERIAL_VER");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGUREIsNull() {
            addCriterion("PRODUCT_CONFIGURE is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGUREIsNotNull() {
            addCriterion("PRODUCT_CONFIGURE is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGUREEqualTo(String value) {
            addCriterion("PRODUCT_CONFIGURE =", value, "PRODUCT_CONFIGURE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGURENotEqualTo(String value) {
            addCriterion("PRODUCT_CONFIGURE <>", value, "PRODUCT_CONFIGURE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGUREGreaterThan(String value) {
            addCriterion("PRODUCT_CONFIGURE >", value, "PRODUCT_CONFIGURE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGUREGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CONFIGURE >=", value, "PRODUCT_CONFIGURE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGURELessThan(String value) {
            addCriterion("PRODUCT_CONFIGURE <", value, "PRODUCT_CONFIGURE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGURELessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CONFIGURE <=", value, "PRODUCT_CONFIGURE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGURELike(String value) {
            addCriterion("PRODUCT_CONFIGURE like", value, "PRODUCT_CONFIGURE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGURENotLike(String value) {
            addCriterion("PRODUCT_CONFIGURE not like", value, "PRODUCT_CONFIGURE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGUREIn(List<String> values) {
            addCriterion("PRODUCT_CONFIGURE in", values, "PRODUCT_CONFIGURE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGURENotIn(List<String> values) {
            addCriterion("PRODUCT_CONFIGURE not in", values, "PRODUCT_CONFIGURE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGUREBetween(String value1, String value2) {
            addCriterion("PRODUCT_CONFIGURE between", value1, value2, "PRODUCT_CONFIGURE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CONFIGURENotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CONFIGURE not between", value1, value2, "PRODUCT_CONFIGURE");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGIsNull() {
            addCriterion("PROJECT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGIsNotNull() {
            addCriterion("PROJECT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGEqualTo(String value) {
            addCriterion("PROJECT_FLAG =", value, "PROJECT_FLAG");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGNotEqualTo(String value) {
            addCriterion("PROJECT_FLAG <>", value, "PROJECT_FLAG");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGGreaterThan(String value) {
            addCriterion("PROJECT_FLAG >", value, "PROJECT_FLAG");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_FLAG >=", value, "PROJECT_FLAG");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGLessThan(String value) {
            addCriterion("PROJECT_FLAG <", value, "PROJECT_FLAG");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_FLAG <=", value, "PROJECT_FLAG");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGLike(String value) {
            addCriterion("PROJECT_FLAG like", value, "PROJECT_FLAG");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGNotLike(String value) {
            addCriterion("PROJECT_FLAG not like", value, "PROJECT_FLAG");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGIn(List<String> values) {
            addCriterion("PROJECT_FLAG in", values, "PROJECT_FLAG");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGNotIn(List<String> values) {
            addCriterion("PROJECT_FLAG not in", values, "PROJECT_FLAG");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGBetween(String value1, String value2) {
            addCriterion("PROJECT_FLAG between", value1, value2, "PROJECT_FLAG");
            return (Criteria) this;
        }

        public Criteria andPROJECT_FLAGNotBetween(String value1, String value2) {
            addCriterion("PROJECT_FLAG not between", value1, value2, "PROJECT_FLAG");
            return (Criteria) this;
        }

        public Criteria andIS_RELIsNull() {
            addCriterion("IS_REL is null");
            return (Criteria) this;
        }

        public Criteria andIS_RELIsNotNull() {
            addCriterion("IS_REL is not null");
            return (Criteria) this;
        }

        public Criteria andIS_RELEqualTo(String value) {
            addCriterion("IS_REL =", value, "IS_REL");
            return (Criteria) this;
        }

        public Criteria andIS_RELNotEqualTo(String value) {
            addCriterion("IS_REL <>", value, "IS_REL");
            return (Criteria) this;
        }

        public Criteria andIS_RELGreaterThan(String value) {
            addCriterion("IS_REL >", value, "IS_REL");
            return (Criteria) this;
        }

        public Criteria andIS_RELGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REL >=", value, "IS_REL");
            return (Criteria) this;
        }

        public Criteria andIS_RELLessThan(String value) {
            addCriterion("IS_REL <", value, "IS_REL");
            return (Criteria) this;
        }

        public Criteria andIS_RELLessThanOrEqualTo(String value) {
            addCriterion("IS_REL <=", value, "IS_REL");
            return (Criteria) this;
        }

        public Criteria andIS_RELLike(String value) {
            addCriterion("IS_REL like", value, "IS_REL");
            return (Criteria) this;
        }

        public Criteria andIS_RELNotLike(String value) {
            addCriterion("IS_REL not like", value, "IS_REL");
            return (Criteria) this;
        }

        public Criteria andIS_RELIn(List<String> values) {
            addCriterion("IS_REL in", values, "IS_REL");
            return (Criteria) this;
        }

        public Criteria andIS_RELNotIn(List<String> values) {
            addCriterion("IS_REL not in", values, "IS_REL");
            return (Criteria) this;
        }

        public Criteria andIS_RELBetween(String value1, String value2) {
            addCriterion("IS_REL between", value1, value2, "IS_REL");
            return (Criteria) this;
        }

        public Criteria andIS_RELNotBetween(String value1, String value2) {
            addCriterion("IS_REL not between", value1, value2, "IS_REL");
            return (Criteria) this;
        }

        public Criteria andREL_NUMIsNull() {
            addCriterion("REL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andREL_NUMIsNotNull() {
            addCriterion("REL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andREL_NUMEqualTo(BigDecimal value) {
            addCriterion("REL_NUM =", value, "REL_NUM");
            return (Criteria) this;
        }

        public Criteria andREL_NUMNotEqualTo(BigDecimal value) {
            addCriterion("REL_NUM <>", value, "REL_NUM");
            return (Criteria) this;
        }

        public Criteria andREL_NUMGreaterThan(BigDecimal value) {
            addCriterion("REL_NUM >", value, "REL_NUM");
            return (Criteria) this;
        }

        public Criteria andREL_NUMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REL_NUM >=", value, "REL_NUM");
            return (Criteria) this;
        }

        public Criteria andREL_NUMLessThan(BigDecimal value) {
            addCriterion("REL_NUM <", value, "REL_NUM");
            return (Criteria) this;
        }

        public Criteria andREL_NUMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REL_NUM <=", value, "REL_NUM");
            return (Criteria) this;
        }

        public Criteria andREL_NUMIn(List<BigDecimal> values) {
            addCriterion("REL_NUM in", values, "REL_NUM");
            return (Criteria) this;
        }

        public Criteria andREL_NUMNotIn(List<BigDecimal> values) {
            addCriterion("REL_NUM not in", values, "REL_NUM");
            return (Criteria) this;
        }

        public Criteria andREL_NUMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REL_NUM between", value1, value2, "REL_NUM");
            return (Criteria) this;
        }

        public Criteria andREL_NUMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REL_NUM not between", value1, value2, "REL_NUM");
            return (Criteria) this;
        }

        public Criteria andPROJECT_SORTIsNull() {
            addCriterion("PROJECT_SORT is null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_SORTIsNotNull() {
            addCriterion("PROJECT_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_SORTEqualTo(BigDecimal value) {
            addCriterion("PROJECT_SORT =", value, "PROJECT_SORT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_SORTNotEqualTo(BigDecimal value) {
            addCriterion("PROJECT_SORT <>", value, "PROJECT_SORT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_SORTGreaterThan(BigDecimal value) {
            addCriterion("PROJECT_SORT >", value, "PROJECT_SORT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_SORTGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECT_SORT >=", value, "PROJECT_SORT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_SORTLessThan(BigDecimal value) {
            addCriterion("PROJECT_SORT <", value, "PROJECT_SORT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_SORTLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECT_SORT <=", value, "PROJECT_SORT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_SORTIn(List<BigDecimal> values) {
            addCriterion("PROJECT_SORT in", values, "PROJECT_SORT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_SORTNotIn(List<BigDecimal> values) {
            addCriterion("PROJECT_SORT not in", values, "PROJECT_SORT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_SORTBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECT_SORT between", value1, value2, "PROJECT_SORT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_SORTNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECT_SORT not between", value1, value2, "PROJECT_SORT");
            return (Criteria) this;
        }

        public Criteria andPM_CHECK_STUSTIsNull() {
            addCriterion("PM_CHECK_STUST is null");
            return (Criteria) this;
        }

        public Criteria andPM_CHECK_STUSTIsNotNull() {
            addCriterion("PM_CHECK_STUST is not null");
            return (Criteria) this;
        }

        public Criteria andPM_CHECK_STUSTEqualTo(BigDecimal value) {
            addCriterion("PM_CHECK_STUST =", value, "PM_CHECK_STUST");
            return (Criteria) this;
        }

        public Criteria andPM_CHECK_STUSTNotEqualTo(BigDecimal value) {
            addCriterion("PM_CHECK_STUST <>", value, "PM_CHECK_STUST");
            return (Criteria) this;
        }

        public Criteria andPM_CHECK_STUSTGreaterThan(BigDecimal value) {
            addCriterion("PM_CHECK_STUST >", value, "PM_CHECK_STUST");
            return (Criteria) this;
        }

        public Criteria andPM_CHECK_STUSTGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PM_CHECK_STUST >=", value, "PM_CHECK_STUST");
            return (Criteria) this;
        }

        public Criteria andPM_CHECK_STUSTLessThan(BigDecimal value) {
            addCriterion("PM_CHECK_STUST <", value, "PM_CHECK_STUST");
            return (Criteria) this;
        }

        public Criteria andPM_CHECK_STUSTLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PM_CHECK_STUST <=", value, "PM_CHECK_STUST");
            return (Criteria) this;
        }

        public Criteria andPM_CHECK_STUSTIn(List<BigDecimal> values) {
            addCriterion("PM_CHECK_STUST in", values, "PM_CHECK_STUST");
            return (Criteria) this;
        }

        public Criteria andPM_CHECK_STUSTNotIn(List<BigDecimal> values) {
            addCriterion("PM_CHECK_STUST not in", values, "PM_CHECK_STUST");
            return (Criteria) this;
        }

        public Criteria andPM_CHECK_STUSTBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PM_CHECK_STUST between", value1, value2, "PM_CHECK_STUST");
            return (Criteria) this;
        }

        public Criteria andPM_CHECK_STUSTNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PM_CHECK_STUST not between", value1, value2, "PM_CHECK_STUST");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONIsNull() {
            addCriterion("CHECK_MON is null");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONIsNotNull() {
            addCriterion("CHECK_MON is not null");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONEqualTo(String value) {
            addCriterion("CHECK_MON =", value, "CHECK_MON");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONNotEqualTo(String value) {
            addCriterion("CHECK_MON <>", value, "CHECK_MON");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONGreaterThan(String value) {
            addCriterion("CHECK_MON >", value, "CHECK_MON");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_MON >=", value, "CHECK_MON");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONLessThan(String value) {
            addCriterion("CHECK_MON <", value, "CHECK_MON");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONLessThanOrEqualTo(String value) {
            addCriterion("CHECK_MON <=", value, "CHECK_MON");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONLike(String value) {
            addCriterion("CHECK_MON like", value, "CHECK_MON");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONNotLike(String value) {
            addCriterion("CHECK_MON not like", value, "CHECK_MON");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONIn(List<String> values) {
            addCriterion("CHECK_MON in", values, "CHECK_MON");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONNotIn(List<String> values) {
            addCriterion("CHECK_MON not in", values, "CHECK_MON");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONBetween(String value1, String value2) {
            addCriterion("CHECK_MON between", value1, value2, "CHECK_MON");
            return (Criteria) this;
        }

        public Criteria andCHECK_MONNotBetween(String value1, String value2) {
            addCriterion("CHECK_MON not between", value1, value2, "CHECK_MON");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERIsNull() {
            addCriterion("CHECK_USER is null");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERIsNotNull() {
            addCriterion("CHECK_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCHECK_USEREqualTo(String value) {
            addCriterion("CHECK_USER =", value, "CHECK_USER");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERNotEqualTo(String value) {
            addCriterion("CHECK_USER <>", value, "CHECK_USER");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERGreaterThan(String value) {
            addCriterion("CHECK_USER >", value, "CHECK_USER");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_USER >=", value, "CHECK_USER");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERLessThan(String value) {
            addCriterion("CHECK_USER <", value, "CHECK_USER");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERLessThanOrEqualTo(String value) {
            addCriterion("CHECK_USER <=", value, "CHECK_USER");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERLike(String value) {
            addCriterion("CHECK_USER like", value, "CHECK_USER");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERNotLike(String value) {
            addCriterion("CHECK_USER not like", value, "CHECK_USER");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERIn(List<String> values) {
            addCriterion("CHECK_USER in", values, "CHECK_USER");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERNotIn(List<String> values) {
            addCriterion("CHECK_USER not in", values, "CHECK_USER");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERBetween(String value1, String value2) {
            addCriterion("CHECK_USER between", value1, value2, "CHECK_USER");
            return (Criteria) this;
        }

        public Criteria andCHECK_USERNotBetween(String value1, String value2) {
            addCriterion("CHECK_USER not between", value1, value2, "CHECK_USER");
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

        public Criteria andBASE_UNITIsNull() {
            addCriterion("BASE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITIsNotNull() {
            addCriterion("BASE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITEqualTo(String value) {
            addCriterion("BASE_UNIT =", value, "BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITNotEqualTo(String value) {
            addCriterion("BASE_UNIT <>", value, "BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITGreaterThan(String value) {
            addCriterion("BASE_UNIT >", value, "BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITGreaterThanOrEqualTo(String value) {
            addCriterion("BASE_UNIT >=", value, "BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITLessThan(String value) {
            addCriterion("BASE_UNIT <", value, "BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITLessThanOrEqualTo(String value) {
            addCriterion("BASE_UNIT <=", value, "BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITLike(String value) {
            addCriterion("BASE_UNIT like", value, "BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITNotLike(String value) {
            addCriterion("BASE_UNIT not like", value, "BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITIn(List<String> values) {
            addCriterion("BASE_UNIT in", values, "BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITNotIn(List<String> values) {
            addCriterion("BASE_UNIT not in", values, "BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITBetween(String value1, String value2) {
            addCriterion("BASE_UNIT between", value1, value2, "BASE_UNIT");
            return (Criteria) this;
        }

        public Criteria andBASE_UNITNotBetween(String value1, String value2) {
            addCriterion("BASE_UNIT not between", value1, value2, "BASE_UNIT");
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