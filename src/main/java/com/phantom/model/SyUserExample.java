package com.phantom.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyUserExample() {
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

        public Criteria andLOGIN_NAMEIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMENotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMELessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMELessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMELike(String value) {
            addCriterion("LOGIN_NAME like", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMENotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMENotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMENotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNull() {
            addCriterion("`NAME` is null");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNotNull() {
            addCriterion("`NAME` is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEEqualTo(String value) {
            addCriterion("`NAME` =", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotEqualTo(String value) {
            addCriterion("`NAME` <>", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThan(String value) {
            addCriterion("`NAME` >", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("`NAME` >=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThan(String value) {
            addCriterion("`NAME` <", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThanOrEqualTo(String value) {
            addCriterion("`NAME` <=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELike(String value) {
            addCriterion("`NAME` like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotLike(String value) {
            addCriterion("`NAME` not like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIn(List<String> values) {
            addCriterion("`NAME` in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotIn(List<String> values) {
            addCriterion("`NAME` not in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEBetween(String value1, String value2) {
            addCriterion("`NAME` between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotBetween(String value1, String value2) {
            addCriterion("`NAME` not between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andPWIsNull() {
            addCriterion("PW is null");
            return (Criteria) this;
        }

        public Criteria andPWIsNotNull() {
            addCriterion("PW is not null");
            return (Criteria) this;
        }

        public Criteria andPWEqualTo(String value) {
            addCriterion("PW =", value, "PW");
            return (Criteria) this;
        }

        public Criteria andPWNotEqualTo(String value) {
            addCriterion("PW <>", value, "PW");
            return (Criteria) this;
        }

        public Criteria andPWGreaterThan(String value) {
            addCriterion("PW >", value, "PW");
            return (Criteria) this;
        }

        public Criteria andPWGreaterThanOrEqualTo(String value) {
            addCriterion("PW >=", value, "PW");
            return (Criteria) this;
        }

        public Criteria andPWLessThan(String value) {
            addCriterion("PW <", value, "PW");
            return (Criteria) this;
        }

        public Criteria andPWLessThanOrEqualTo(String value) {
            addCriterion("PW <=", value, "PW");
            return (Criteria) this;
        }

        public Criteria andPWLike(String value) {
            addCriterion("PW like", value, "PW");
            return (Criteria) this;
        }

        public Criteria andPWNotLike(String value) {
            addCriterion("PW not like", value, "PW");
            return (Criteria) this;
        }

        public Criteria andPWIn(List<String> values) {
            addCriterion("PW in", values, "PW");
            return (Criteria) this;
        }

        public Criteria andPWNotIn(List<String> values) {
            addCriterion("PW not in", values, "PW");
            return (Criteria) this;
        }

        public Criteria andPWBetween(String value1, String value2) {
            addCriterion("PW between", value1, value2, "PW");
            return (Criteria) this;
        }

        public Criteria andPWNotBetween(String value1, String value2) {
            addCriterion("PW not between", value1, value2, "PW");
            return (Criteria) this;
        }

        public Criteria andENABLEIsNull() {
            addCriterion("`ENABLE` is null");
            return (Criteria) this;
        }

        public Criteria andENABLEIsNotNull() {
            addCriterion("`ENABLE` is not null");
            return (Criteria) this;
        }

        public Criteria andENABLEEqualTo(String value) {
            addCriterion("`ENABLE` =", value, "ENABLE");
            return (Criteria) this;
        }

        public Criteria andENABLENotEqualTo(String value) {
            addCriterion("`ENABLE` <>", value, "ENABLE");
            return (Criteria) this;
        }

        public Criteria andENABLEGreaterThan(String value) {
            addCriterion("`ENABLE` >", value, "ENABLE");
            return (Criteria) this;
        }

        public Criteria andENABLEGreaterThanOrEqualTo(String value) {
            addCriterion("`ENABLE` >=", value, "ENABLE");
            return (Criteria) this;
        }

        public Criteria andENABLELessThan(String value) {
            addCriterion("`ENABLE` <", value, "ENABLE");
            return (Criteria) this;
        }

        public Criteria andENABLELessThanOrEqualTo(String value) {
            addCriterion("`ENABLE` <=", value, "ENABLE");
            return (Criteria) this;
        }

        public Criteria andENABLELike(String value) {
            addCriterion("`ENABLE` like", value, "ENABLE");
            return (Criteria) this;
        }

        public Criteria andENABLENotLike(String value) {
            addCriterion("`ENABLE` not like", value, "ENABLE");
            return (Criteria) this;
        }

        public Criteria andENABLEIn(List<String> values) {
            addCriterion("`ENABLE` in", values, "ENABLE");
            return (Criteria) this;
        }

        public Criteria andENABLENotIn(List<String> values) {
            addCriterion("`ENABLE` not in", values, "ENABLE");
            return (Criteria) this;
        }

        public Criteria andENABLEBetween(String value1, String value2) {
            addCriterion("`ENABLE` between", value1, value2, "ENABLE");
            return (Criteria) this;
        }

        public Criteria andENABLENotBetween(String value1, String value2) {
            addCriterion("`ENABLE` not between", value1, value2, "ENABLE");
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

        public Criteria andPHONEIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPHONEIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPHONEEqualTo(String value) {
            addCriterion("PHONE =", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotEqualTo(String value) {
            addCriterion("PHONE <>", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEGreaterThan(String value) {
            addCriterion("PHONE >", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELessThan(String value) {
            addCriterion("PHONE <", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELike(String value) {
            addCriterion("PHONE like", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotLike(String value) {
            addCriterion("PHONE not like", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEIn(List<String> values) {
            addCriterion("PHONE in", values, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotIn(List<String> values) {
            addCriterion("PHONE not in", values, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "PHONE");
            return (Criteria) this;
        }

        public Criteria andMOBILEIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMOBILEIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMOBILEEqualTo(String value) {
            addCriterion("MOBILE =", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEGreaterThan(String value) {
            addCriterion("MOBILE >", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELessThan(String value) {
            addCriterion("MOBILE <", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELike(String value) {
            addCriterion("MOBILE like", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotLike(String value) {
            addCriterion("MOBILE not like", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEIn(List<String> values) {
            addCriterion("MOBILE in", values, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andWEIXINIsNull() {
            addCriterion("WEIXIN is null");
            return (Criteria) this;
        }

        public Criteria andWEIXINIsNotNull() {
            addCriterion("WEIXIN is not null");
            return (Criteria) this;
        }

        public Criteria andWEIXINEqualTo(String value) {
            addCriterion("WEIXIN =", value, "WEIXIN");
            return (Criteria) this;
        }

        public Criteria andWEIXINNotEqualTo(String value) {
            addCriterion("WEIXIN <>", value, "WEIXIN");
            return (Criteria) this;
        }

        public Criteria andWEIXINGreaterThan(String value) {
            addCriterion("WEIXIN >", value, "WEIXIN");
            return (Criteria) this;
        }

        public Criteria andWEIXINGreaterThanOrEqualTo(String value) {
            addCriterion("WEIXIN >=", value, "WEIXIN");
            return (Criteria) this;
        }

        public Criteria andWEIXINLessThan(String value) {
            addCriterion("WEIXIN <", value, "WEIXIN");
            return (Criteria) this;
        }

        public Criteria andWEIXINLessThanOrEqualTo(String value) {
            addCriterion("WEIXIN <=", value, "WEIXIN");
            return (Criteria) this;
        }

        public Criteria andWEIXINLike(String value) {
            addCriterion("WEIXIN like", value, "WEIXIN");
            return (Criteria) this;
        }

        public Criteria andWEIXINNotLike(String value) {
            addCriterion("WEIXIN not like", value, "WEIXIN");
            return (Criteria) this;
        }

        public Criteria andWEIXINIn(List<String> values) {
            addCriterion("WEIXIN in", values, "WEIXIN");
            return (Criteria) this;
        }

        public Criteria andWEIXINNotIn(List<String> values) {
            addCriterion("WEIXIN not in", values, "WEIXIN");
            return (Criteria) this;
        }

        public Criteria andWEIXINBetween(String value1, String value2) {
            addCriterion("WEIXIN between", value1, value2, "WEIXIN");
            return (Criteria) this;
        }

        public Criteria andWEIXINNotBetween(String value1, String value2) {
            addCriterion("WEIXIN not between", value1, value2, "WEIXIN");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMAILEqualTo(String value) {
            addCriterion("EMAIL =", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThan(String value) {
            addCriterion("EMAIL >", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThan(String value) {
            addCriterion("EMAIL <", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLike(String value) {
            addCriterion("EMAIL like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotLike(String value) {
            addCriterion("EMAIL not like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILIn(List<String> values) {
            addCriterion("EMAIL in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPENotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPELessThan(String value) {
            addCriterion("USER_TYPE <", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPELessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPELike(String value) {
            addCriterion("USER_TYPE like", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPENotLike(String value) {
            addCriterion("USER_TYPE not like", value, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPENotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPEBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andUSER_TYPENotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTIsNull() {
            addCriterion("FINGERPRINT is null");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTIsNotNull() {
            addCriterion("FINGERPRINT is not null");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTEqualTo(String value) {
            addCriterion("FINGERPRINT =", value, "FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTNotEqualTo(String value) {
            addCriterion("FINGERPRINT <>", value, "FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTGreaterThan(String value) {
            addCriterion("FINGERPRINT >", value, "FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTGreaterThanOrEqualTo(String value) {
            addCriterion("FINGERPRINT >=", value, "FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTLessThan(String value) {
            addCriterion("FINGERPRINT <", value, "FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTLessThanOrEqualTo(String value) {
            addCriterion("FINGERPRINT <=", value, "FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTLike(String value) {
            addCriterion("FINGERPRINT like", value, "FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTNotLike(String value) {
            addCriterion("FINGERPRINT not like", value, "FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTIn(List<String> values) {
            addCriterion("FINGERPRINT in", values, "FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTNotIn(List<String> values) {
            addCriterion("FINGERPRINT not in", values, "FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTBetween(String value1, String value2) {
            addCriterion("FINGERPRINT between", value1, value2, "FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andFINGERPRINTNotBetween(String value1, String value2) {
            addCriterion("FINGERPRINT not between", value1, value2, "FINGERPRINT");
            return (Criteria) this;
        }

        public Criteria andEDIT_PW_TIMEIsNull() {
            addCriterion("EDIT_PW_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEDIT_PW_TIMEIsNotNull() {
            addCriterion("EDIT_PW_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEDIT_PW_TIMEEqualTo(Date value) {
            addCriterionForJDBCDate("EDIT_PW_TIME =", value, "EDIT_PW_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_PW_TIMENotEqualTo(Date value) {
            addCriterionForJDBCDate("EDIT_PW_TIME <>", value, "EDIT_PW_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_PW_TIMEGreaterThan(Date value) {
            addCriterionForJDBCDate("EDIT_PW_TIME >", value, "EDIT_PW_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_PW_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EDIT_PW_TIME >=", value, "EDIT_PW_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_PW_TIMELessThan(Date value) {
            addCriterionForJDBCDate("EDIT_PW_TIME <", value, "EDIT_PW_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_PW_TIMELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EDIT_PW_TIME <=", value, "EDIT_PW_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_PW_TIMEIn(List<Date> values) {
            addCriterionForJDBCDate("EDIT_PW_TIME in", values, "EDIT_PW_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_PW_TIMENotIn(List<Date> values) {
            addCriterionForJDBCDate("EDIT_PW_TIME not in", values, "EDIT_PW_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_PW_TIMEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EDIT_PW_TIME between", value1, value2, "EDIT_PW_TIME");
            return (Criteria) this;
        }

        public Criteria andEDIT_PW_TIMENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EDIT_PW_TIME not between", value1, value2, "EDIT_PW_TIME");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMEIsNull() {
            addCriterion("PHOTO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMEIsNotNull() {
            addCriterion("PHOTO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMEEqualTo(String value) {
            addCriterion("PHOTO_NAME =", value, "PHOTO_NAME");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMENotEqualTo(String value) {
            addCriterion("PHOTO_NAME <>", value, "PHOTO_NAME");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMEGreaterThan(String value) {
            addCriterion("PHOTO_NAME >", value, "PHOTO_NAME");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO_NAME >=", value, "PHOTO_NAME");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMELessThan(String value) {
            addCriterion("PHOTO_NAME <", value, "PHOTO_NAME");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMELessThanOrEqualTo(String value) {
            addCriterion("PHOTO_NAME <=", value, "PHOTO_NAME");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMELike(String value) {
            addCriterion("PHOTO_NAME like", value, "PHOTO_NAME");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMENotLike(String value) {
            addCriterion("PHOTO_NAME not like", value, "PHOTO_NAME");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMEIn(List<String> values) {
            addCriterion("PHOTO_NAME in", values, "PHOTO_NAME");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMENotIn(List<String> values) {
            addCriterion("PHOTO_NAME not in", values, "PHOTO_NAME");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMEBetween(String value1, String value2) {
            addCriterion("PHOTO_NAME between", value1, value2, "PHOTO_NAME");
            return (Criteria) this;
        }

        public Criteria andPHOTO_NAMENotBetween(String value1, String value2) {
            addCriterion("PHOTO_NAME not between", value1, value2, "PHOTO_NAME");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMEIsNull() {
            addCriterion("ENGLISH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMEIsNotNull() {
            addCriterion("ENGLISH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMEEqualTo(String value) {
            addCriterion("ENGLISH_NAME =", value, "ENGLISH_NAME");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMENotEqualTo(String value) {
            addCriterion("ENGLISH_NAME <>", value, "ENGLISH_NAME");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMEGreaterThan(String value) {
            addCriterion("ENGLISH_NAME >", value, "ENGLISH_NAME");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("ENGLISH_NAME >=", value, "ENGLISH_NAME");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMELessThan(String value) {
            addCriterion("ENGLISH_NAME <", value, "ENGLISH_NAME");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMELessThanOrEqualTo(String value) {
            addCriterion("ENGLISH_NAME <=", value, "ENGLISH_NAME");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMELike(String value) {
            addCriterion("ENGLISH_NAME like", value, "ENGLISH_NAME");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMENotLike(String value) {
            addCriterion("ENGLISH_NAME not like", value, "ENGLISH_NAME");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMEIn(List<String> values) {
            addCriterion("ENGLISH_NAME in", values, "ENGLISH_NAME");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMENotIn(List<String> values) {
            addCriterion("ENGLISH_NAME not in", values, "ENGLISH_NAME");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMEBetween(String value1, String value2) {
            addCriterion("ENGLISH_NAME between", value1, value2, "ENGLISH_NAME");
            return (Criteria) this;
        }

        public Criteria andENGLISH_NAMENotBetween(String value1, String value2) {
            addCriterion("ENGLISH_NAME not between", value1, value2, "ENGLISH_NAME");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODEIsNull() {
            addCriterion("EMP_SUP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODEIsNotNull() {
            addCriterion("EMP_SUP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODEEqualTo(String value) {
            addCriterion("EMP_SUP_CODE =", value, "EMP_SUP_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODENotEqualTo(String value) {
            addCriterion("EMP_SUP_CODE <>", value, "EMP_SUP_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODEGreaterThan(String value) {
            addCriterion("EMP_SUP_CODE >", value, "EMP_SUP_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_SUP_CODE >=", value, "EMP_SUP_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODELessThan(String value) {
            addCriterion("EMP_SUP_CODE <", value, "EMP_SUP_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODELessThanOrEqualTo(String value) {
            addCriterion("EMP_SUP_CODE <=", value, "EMP_SUP_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODELike(String value) {
            addCriterion("EMP_SUP_CODE like", value, "EMP_SUP_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODENotLike(String value) {
            addCriterion("EMP_SUP_CODE not like", value, "EMP_SUP_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODEIn(List<String> values) {
            addCriterion("EMP_SUP_CODE in", values, "EMP_SUP_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODENotIn(List<String> values) {
            addCriterion("EMP_SUP_CODE not in", values, "EMP_SUP_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODEBetween(String value1, String value2) {
            addCriterion("EMP_SUP_CODE between", value1, value2, "EMP_SUP_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_SUP_CODENotBetween(String value1, String value2) {
            addCriterion("EMP_SUP_CODE not between", value1, value2, "EMP_SUP_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODEIsNull() {
            addCriterion("EMP_CUST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODEIsNotNull() {
            addCriterion("EMP_CUST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODEEqualTo(String value) {
            addCriterion("EMP_CUST_CODE =", value, "EMP_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODENotEqualTo(String value) {
            addCriterion("EMP_CUST_CODE <>", value, "EMP_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODEGreaterThan(String value) {
            addCriterion("EMP_CUST_CODE >", value, "EMP_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_CUST_CODE >=", value, "EMP_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODELessThan(String value) {
            addCriterion("EMP_CUST_CODE <", value, "EMP_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODELessThanOrEqualTo(String value) {
            addCriterion("EMP_CUST_CODE <=", value, "EMP_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODELike(String value) {
            addCriterion("EMP_CUST_CODE like", value, "EMP_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODENotLike(String value) {
            addCriterion("EMP_CUST_CODE not like", value, "EMP_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODEIn(List<String> values) {
            addCriterion("EMP_CUST_CODE in", values, "EMP_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODENotIn(List<String> values) {
            addCriterion("EMP_CUST_CODE not in", values, "EMP_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODEBetween(String value1, String value2) {
            addCriterion("EMP_CUST_CODE between", value1, value2, "EMP_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andEMP_CUST_CODENotBetween(String value1, String value2) {
            addCriterion("EMP_CUST_CODE not between", value1, value2, "EMP_CUST_CODE");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONEIsNull() {
            addCriterion("US_TIME_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONEIsNotNull() {
            addCriterion("US_TIME_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONEEqualTo(String value) {
            addCriterion("US_TIME_ZONE =", value, "US_TIME_ZONE");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONENotEqualTo(String value) {
            addCriterion("US_TIME_ZONE <>", value, "US_TIME_ZONE");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONEGreaterThan(String value) {
            addCriterion("US_TIME_ZONE >", value, "US_TIME_ZONE");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONEGreaterThanOrEqualTo(String value) {
            addCriterion("US_TIME_ZONE >=", value, "US_TIME_ZONE");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONELessThan(String value) {
            addCriterion("US_TIME_ZONE <", value, "US_TIME_ZONE");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONELessThanOrEqualTo(String value) {
            addCriterion("US_TIME_ZONE <=", value, "US_TIME_ZONE");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONELike(String value) {
            addCriterion("US_TIME_ZONE like", value, "US_TIME_ZONE");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONENotLike(String value) {
            addCriterion("US_TIME_ZONE not like", value, "US_TIME_ZONE");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONEIn(List<String> values) {
            addCriterion("US_TIME_ZONE in", values, "US_TIME_ZONE");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONENotIn(List<String> values) {
            addCriterion("US_TIME_ZONE not in", values, "US_TIME_ZONE");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONEBetween(String value1, String value2) {
            addCriterion("US_TIME_ZONE between", value1, value2, "US_TIME_ZONE");
            return (Criteria) this;
        }

        public Criteria andUS_TIME_ZONENotBetween(String value1, String value2) {
            addCriterion("US_TIME_ZONE not between", value1, value2, "US_TIME_ZONE");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDIsNull() {
            addCriterion("WX_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDIsNotNull() {
            addCriterion("WX_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDEqualTo(String value) {
            addCriterion("WX_USER_ID =", value, "WX_USER_ID");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDNotEqualTo(String value) {
            addCriterion("WX_USER_ID <>", value, "WX_USER_ID");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDGreaterThan(String value) {
            addCriterion("WX_USER_ID >", value, "WX_USER_ID");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDGreaterThanOrEqualTo(String value) {
            addCriterion("WX_USER_ID >=", value, "WX_USER_ID");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDLessThan(String value) {
            addCriterion("WX_USER_ID <", value, "WX_USER_ID");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDLessThanOrEqualTo(String value) {
            addCriterion("WX_USER_ID <=", value, "WX_USER_ID");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDLike(String value) {
            addCriterion("WX_USER_ID like", value, "WX_USER_ID");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDNotLike(String value) {
            addCriterion("WX_USER_ID not like", value, "WX_USER_ID");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDIn(List<String> values) {
            addCriterion("WX_USER_ID in", values, "WX_USER_ID");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDNotIn(List<String> values) {
            addCriterion("WX_USER_ID not in", values, "WX_USER_ID");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDBetween(String value1, String value2) {
            addCriterion("WX_USER_ID between", value1, value2, "WX_USER_ID");
            return (Criteria) this;
        }

        public Criteria andWX_USER_IDNotBetween(String value1, String value2) {
            addCriterion("WX_USER_ID not between", value1, value2, "WX_USER_ID");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDIsNull() {
            addCriterion("DING_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDIsNotNull() {
            addCriterion("DING_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDEqualTo(String value) {
            addCriterion("DING_USER_ID =", value, "DING_USER_ID");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDNotEqualTo(String value) {
            addCriterion("DING_USER_ID <>", value, "DING_USER_ID");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDGreaterThan(String value) {
            addCriterion("DING_USER_ID >", value, "DING_USER_ID");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDGreaterThanOrEqualTo(String value) {
            addCriterion("DING_USER_ID >=", value, "DING_USER_ID");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDLessThan(String value) {
            addCriterion("DING_USER_ID <", value, "DING_USER_ID");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDLessThanOrEqualTo(String value) {
            addCriterion("DING_USER_ID <=", value, "DING_USER_ID");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDLike(String value) {
            addCriterion("DING_USER_ID like", value, "DING_USER_ID");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDNotLike(String value) {
            addCriterion("DING_USER_ID not like", value, "DING_USER_ID");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDIn(List<String> values) {
            addCriterion("DING_USER_ID in", values, "DING_USER_ID");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDNotIn(List<String> values) {
            addCriterion("DING_USER_ID not in", values, "DING_USER_ID");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDBetween(String value1, String value2) {
            addCriterion("DING_USER_ID between", value1, value2, "DING_USER_ID");
            return (Criteria) this;
        }

        public Criteria andDING_USER_IDNotBetween(String value1, String value2) {
            addCriterion("DING_USER_ID not between", value1, value2, "DING_USER_ID");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINIsNull() {
            addCriterion("INIT_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINIsNotNull() {
            addCriterion("INIT_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINEqualTo(String value) {
            addCriterion("INIT_LOGIN =", value, "INIT_LOGIN");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINNotEqualTo(String value) {
            addCriterion("INIT_LOGIN <>", value, "INIT_LOGIN");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINGreaterThan(String value) {
            addCriterion("INIT_LOGIN >", value, "INIT_LOGIN");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINGreaterThanOrEqualTo(String value) {
            addCriterion("INIT_LOGIN >=", value, "INIT_LOGIN");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINLessThan(String value) {
            addCriterion("INIT_LOGIN <", value, "INIT_LOGIN");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINLessThanOrEqualTo(String value) {
            addCriterion("INIT_LOGIN <=", value, "INIT_LOGIN");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINLike(String value) {
            addCriterion("INIT_LOGIN like", value, "INIT_LOGIN");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINNotLike(String value) {
            addCriterion("INIT_LOGIN not like", value, "INIT_LOGIN");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINIn(List<String> values) {
            addCriterion("INIT_LOGIN in", values, "INIT_LOGIN");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINNotIn(List<String> values) {
            addCriterion("INIT_LOGIN not in", values, "INIT_LOGIN");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINBetween(String value1, String value2) {
            addCriterion("INIT_LOGIN between", value1, value2, "INIT_LOGIN");
            return (Criteria) this;
        }

        public Criteria andINIT_LOGINNotBetween(String value1, String value2) {
            addCriterion("INIT_LOGIN not between", value1, value2, "INIT_LOGIN");
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