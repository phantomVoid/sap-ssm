package com.phantom.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TPmProjectReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPmProjectReportExample() {
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

        public Criteria andREP_NUMIsNull() {
            addCriterion("REP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andREP_NUMIsNotNull() {
            addCriterion("REP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andREP_NUMEqualTo(BigDecimal value) {
            addCriterion("REP_NUM =", value, "REP_NUM");
            return (Criteria) this;
        }

        public Criteria andREP_NUMNotEqualTo(BigDecimal value) {
            addCriterion("REP_NUM <>", value, "REP_NUM");
            return (Criteria) this;
        }

        public Criteria andREP_NUMGreaterThan(BigDecimal value) {
            addCriterion("REP_NUM >", value, "REP_NUM");
            return (Criteria) this;
        }

        public Criteria andREP_NUMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REP_NUM >=", value, "REP_NUM");
            return (Criteria) this;
        }

        public Criteria andREP_NUMLessThan(BigDecimal value) {
            addCriterion("REP_NUM <", value, "REP_NUM");
            return (Criteria) this;
        }

        public Criteria andREP_NUMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REP_NUM <=", value, "REP_NUM");
            return (Criteria) this;
        }

        public Criteria andREP_NUMIn(List<BigDecimal> values) {
            addCriterion("REP_NUM in", values, "REP_NUM");
            return (Criteria) this;
        }

        public Criteria andREP_NUMNotIn(List<BigDecimal> values) {
            addCriterion("REP_NUM not in", values, "REP_NUM");
            return (Criteria) this;
        }

        public Criteria andREP_NUMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REP_NUM between", value1, value2, "REP_NUM");
            return (Criteria) this;
        }

        public Criteria andREP_NUMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REP_NUM not between", value1, value2, "REP_NUM");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITIsNull() {
            addCriterion("PROJECT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITIsNotNull() {
            addCriterion("PROJECT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITEqualTo(String value) {
            addCriterion("PROJECT_UNIT =", value, "PROJECT_UNIT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITNotEqualTo(String value) {
            addCriterion("PROJECT_UNIT <>", value, "PROJECT_UNIT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITGreaterThan(String value) {
            addCriterion("PROJECT_UNIT >", value, "PROJECT_UNIT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_UNIT >=", value, "PROJECT_UNIT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITLessThan(String value) {
            addCriterion("PROJECT_UNIT <", value, "PROJECT_UNIT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_UNIT <=", value, "PROJECT_UNIT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITLike(String value) {
            addCriterion("PROJECT_UNIT like", value, "PROJECT_UNIT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITNotLike(String value) {
            addCriterion("PROJECT_UNIT not like", value, "PROJECT_UNIT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITIn(List<String> values) {
            addCriterion("PROJECT_UNIT in", values, "PROJECT_UNIT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITNotIn(List<String> values) {
            addCriterion("PROJECT_UNIT not in", values, "PROJECT_UNIT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITBetween(String value1, String value2) {
            addCriterion("PROJECT_UNIT between", value1, value2, "PROJECT_UNIT");
            return (Criteria) this;
        }

        public Criteria andPROJECT_UNITNotBetween(String value1, String value2) {
            addCriterion("PROJECT_UNIT not between", value1, value2, "PROJECT_UNIT");
            return (Criteria) this;
        }

        public Criteria andPREPARE_TIMEIsNull() {
            addCriterion("PREPARE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPREPARE_TIMEIsNotNull() {
            addCriterion("PREPARE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPREPARE_TIMEEqualTo(BigDecimal value) {
            addCriterion("PREPARE_TIME =", value, "PREPARE_TIME");
            return (Criteria) this;
        }

        public Criteria andPREPARE_TIMENotEqualTo(BigDecimal value) {
            addCriterion("PREPARE_TIME <>", value, "PREPARE_TIME");
            return (Criteria) this;
        }

        public Criteria andPREPARE_TIMEGreaterThan(BigDecimal value) {
            addCriterion("PREPARE_TIME >", value, "PREPARE_TIME");
            return (Criteria) this;
        }

        public Criteria andPREPARE_TIMEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PREPARE_TIME >=", value, "PREPARE_TIME");
            return (Criteria) this;
        }

        public Criteria andPREPARE_TIMELessThan(BigDecimal value) {
            addCriterion("PREPARE_TIME <", value, "PREPARE_TIME");
            return (Criteria) this;
        }

        public Criteria andPREPARE_TIMELessThanOrEqualTo(BigDecimal value) {
            addCriterion("PREPARE_TIME <=", value, "PREPARE_TIME");
            return (Criteria) this;
        }

        public Criteria andPREPARE_TIMEIn(List<BigDecimal> values) {
            addCriterion("PREPARE_TIME in", values, "PREPARE_TIME");
            return (Criteria) this;
        }

        public Criteria andPREPARE_TIMENotIn(List<BigDecimal> values) {
            addCriterion("PREPARE_TIME not in", values, "PREPARE_TIME");
            return (Criteria) this;
        }

        public Criteria andPREPARE_TIMEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREPARE_TIME between", value1, value2, "PREPARE_TIME");
            return (Criteria) this;
        }

        public Criteria andPREPARE_TIMENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREPARE_TIME not between", value1, value2, "PREPARE_TIME");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1IsNull() {
            addCriterion("MEASURE_UNIT1 is null");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1IsNotNull() {
            addCriterion("MEASURE_UNIT1 is not null");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1EqualTo(String value) {
            addCriterion("MEASURE_UNIT1 =", value, "MEASURE_UNIT1");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1NotEqualTo(String value) {
            addCriterion("MEASURE_UNIT1 <>", value, "MEASURE_UNIT1");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1GreaterThan(String value) {
            addCriterion("MEASURE_UNIT1 >", value, "MEASURE_UNIT1");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1GreaterThanOrEqualTo(String value) {
            addCriterion("MEASURE_UNIT1 >=", value, "MEASURE_UNIT1");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1LessThan(String value) {
            addCriterion("MEASURE_UNIT1 <", value, "MEASURE_UNIT1");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1LessThanOrEqualTo(String value) {
            addCriterion("MEASURE_UNIT1 <=", value, "MEASURE_UNIT1");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1Like(String value) {
            addCriterion("MEASURE_UNIT1 like", value, "MEASURE_UNIT1");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1NotLike(String value) {
            addCriterion("MEASURE_UNIT1 not like", value, "MEASURE_UNIT1");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1In(List<String> values) {
            addCriterion("MEASURE_UNIT1 in", values, "MEASURE_UNIT1");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1NotIn(List<String> values) {
            addCriterion("MEASURE_UNIT1 not in", values, "MEASURE_UNIT1");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1Between(String value1, String value2) {
            addCriterion("MEASURE_UNIT1 between", value1, value2, "MEASURE_UNIT1");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT1NotBetween(String value1, String value2) {
            addCriterion("MEASURE_UNIT1 not between", value1, value2, "MEASURE_UNIT1");
            return (Criteria) this;
        }

        public Criteria andMACHINE_TIMEIsNull() {
            addCriterion("MACHINE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMACHINE_TIMEIsNotNull() {
            addCriterion("MACHINE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMACHINE_TIMEEqualTo(BigDecimal value) {
            addCriterion("MACHINE_TIME =", value, "MACHINE_TIME");
            return (Criteria) this;
        }

        public Criteria andMACHINE_TIMENotEqualTo(BigDecimal value) {
            addCriterion("MACHINE_TIME <>", value, "MACHINE_TIME");
            return (Criteria) this;
        }

        public Criteria andMACHINE_TIMEGreaterThan(BigDecimal value) {
            addCriterion("MACHINE_TIME >", value, "MACHINE_TIME");
            return (Criteria) this;
        }

        public Criteria andMACHINE_TIMEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MACHINE_TIME >=", value, "MACHINE_TIME");
            return (Criteria) this;
        }

        public Criteria andMACHINE_TIMELessThan(BigDecimal value) {
            addCriterion("MACHINE_TIME <", value, "MACHINE_TIME");
            return (Criteria) this;
        }

        public Criteria andMACHINE_TIMELessThanOrEqualTo(BigDecimal value) {
            addCriterion("MACHINE_TIME <=", value, "MACHINE_TIME");
            return (Criteria) this;
        }

        public Criteria andMACHINE_TIMEIn(List<BigDecimal> values) {
            addCriterion("MACHINE_TIME in", values, "MACHINE_TIME");
            return (Criteria) this;
        }

        public Criteria andMACHINE_TIMENotIn(List<BigDecimal> values) {
            addCriterion("MACHINE_TIME not in", values, "MACHINE_TIME");
            return (Criteria) this;
        }

        public Criteria andMACHINE_TIMEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MACHINE_TIME between", value1, value2, "MACHINE_TIME");
            return (Criteria) this;
        }

        public Criteria andMACHINE_TIMENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MACHINE_TIME not between", value1, value2, "MACHINE_TIME");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2IsNull() {
            addCriterion("MEASURE_UNIT2 is null");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2IsNotNull() {
            addCriterion("MEASURE_UNIT2 is not null");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2EqualTo(String value) {
            addCriterion("MEASURE_UNIT2 =", value, "MEASURE_UNIT2");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2NotEqualTo(String value) {
            addCriterion("MEASURE_UNIT2 <>", value, "MEASURE_UNIT2");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2GreaterThan(String value) {
            addCriterion("MEASURE_UNIT2 >", value, "MEASURE_UNIT2");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2GreaterThanOrEqualTo(String value) {
            addCriterion("MEASURE_UNIT2 >=", value, "MEASURE_UNIT2");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2LessThan(String value) {
            addCriterion("MEASURE_UNIT2 <", value, "MEASURE_UNIT2");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2LessThanOrEqualTo(String value) {
            addCriterion("MEASURE_UNIT2 <=", value, "MEASURE_UNIT2");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2Like(String value) {
            addCriterion("MEASURE_UNIT2 like", value, "MEASURE_UNIT2");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2NotLike(String value) {
            addCriterion("MEASURE_UNIT2 not like", value, "MEASURE_UNIT2");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2In(List<String> values) {
            addCriterion("MEASURE_UNIT2 in", values, "MEASURE_UNIT2");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2NotIn(List<String> values) {
            addCriterion("MEASURE_UNIT2 not in", values, "MEASURE_UNIT2");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2Between(String value1, String value2) {
            addCriterion("MEASURE_UNIT2 between", value1, value2, "MEASURE_UNIT2");
            return (Criteria) this;
        }

        public Criteria andMEASURE_UNIT2NotBetween(String value1, String value2) {
            addCriterion("MEASURE_UNIT2 not between", value1, value2, "MEASURE_UNIT2");
            return (Criteria) this;
        }

        public Criteria andPEOPLE_TIMEIsNull() {
            addCriterion("PEOPLE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPEOPLE_TIMEIsNotNull() {
            addCriterion("PEOPLE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPEOPLE_TIMEEqualTo(BigDecimal value) {
            addCriterion("PEOPLE_TIME =", value, "PEOPLE_TIME");
            return (Criteria) this;
        }

        public Criteria andPEOPLE_TIMENotEqualTo(BigDecimal value) {
            addCriterion("PEOPLE_TIME <>", value, "PEOPLE_TIME");
            return (Criteria) this;
        }

        public Criteria andPEOPLE_TIMEGreaterThan(BigDecimal value) {
            addCriterion("PEOPLE_TIME >", value, "PEOPLE_TIME");
            return (Criteria) this;
        }

        public Criteria andPEOPLE_TIMEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PEOPLE_TIME >=", value, "PEOPLE_TIME");
            return (Criteria) this;
        }

        public Criteria andPEOPLE_TIMELessThan(BigDecimal value) {
            addCriterion("PEOPLE_TIME <", value, "PEOPLE_TIME");
            return (Criteria) this;
        }

        public Criteria andPEOPLE_TIMELessThanOrEqualTo(BigDecimal value) {
            addCriterion("PEOPLE_TIME <=", value, "PEOPLE_TIME");
            return (Criteria) this;
        }

        public Criteria andPEOPLE_TIMEIn(List<BigDecimal> values) {
            addCriterion("PEOPLE_TIME in", values, "PEOPLE_TIME");
            return (Criteria) this;
        }

        public Criteria andPEOPLE_TIMENotIn(List<BigDecimal> values) {
            addCriterion("PEOPLE_TIME not in", values, "PEOPLE_TIME");
            return (Criteria) this;
        }

        public Criteria andPEOPLE_TIMEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEOPLE_TIME between", value1, value2, "PEOPLE_TIME");
            return (Criteria) this;
        }

        public Criteria andPEOPLE_TIMENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEOPLE_TIME not between", value1, value2, "PEOPLE_TIME");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3IsNull() {
            addCriterion("MEASURE_TIME3 is null");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3IsNotNull() {
            addCriterion("MEASURE_TIME3 is not null");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3EqualTo(String value) {
            addCriterion("MEASURE_TIME3 =", value, "MEASURE_TIME3");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3NotEqualTo(String value) {
            addCriterion("MEASURE_TIME3 <>", value, "MEASURE_TIME3");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3GreaterThan(String value) {
            addCriterion("MEASURE_TIME3 >", value, "MEASURE_TIME3");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3GreaterThanOrEqualTo(String value) {
            addCriterion("MEASURE_TIME3 >=", value, "MEASURE_TIME3");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3LessThan(String value) {
            addCriterion("MEASURE_TIME3 <", value, "MEASURE_TIME3");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3LessThanOrEqualTo(String value) {
            addCriterion("MEASURE_TIME3 <=", value, "MEASURE_TIME3");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3Like(String value) {
            addCriterion("MEASURE_TIME3 like", value, "MEASURE_TIME3");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3NotLike(String value) {
            addCriterion("MEASURE_TIME3 not like", value, "MEASURE_TIME3");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3In(List<String> values) {
            addCriterion("MEASURE_TIME3 in", values, "MEASURE_TIME3");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3NotIn(List<String> values) {
            addCriterion("MEASURE_TIME3 not in", values, "MEASURE_TIME3");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3Between(String value1, String value2) {
            addCriterion("MEASURE_TIME3 between", value1, value2, "MEASURE_TIME3");
            return (Criteria) this;
        }

        public Criteria andMEASURE_TIME3NotBetween(String value1, String value2) {
            addCriterion("MEASURE_TIME3 not between", value1, value2, "MEASURE_TIME3");
            return (Criteria) this;
        }

        public Criteria andFINISH_DATEIsNull() {
            addCriterion("FINISH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFINISH_DATEIsNotNull() {
            addCriterion("FINISH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFINISH_DATEEqualTo(Date value) {
            addCriterionForJDBCDate("FINISH_DATE =", value, "FINISH_DATE");
            return (Criteria) this;
        }

        public Criteria andFINISH_DATENotEqualTo(Date value) {
            addCriterionForJDBCDate("FINISH_DATE <>", value, "FINISH_DATE");
            return (Criteria) this;
        }

        public Criteria andFINISH_DATEGreaterThan(Date value) {
            addCriterionForJDBCDate("FINISH_DATE >", value, "FINISH_DATE");
            return (Criteria) this;
        }

        public Criteria andFINISH_DATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FINISH_DATE >=", value, "FINISH_DATE");
            return (Criteria) this;
        }

        public Criteria andFINISH_DATELessThan(Date value) {
            addCriterionForJDBCDate("FINISH_DATE <", value, "FINISH_DATE");
            return (Criteria) this;
        }

        public Criteria andFINISH_DATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FINISH_DATE <=", value, "FINISH_DATE");
            return (Criteria) this;
        }

        public Criteria andFINISH_DATEIn(List<Date> values) {
            addCriterionForJDBCDate("FINISH_DATE in", values, "FINISH_DATE");
            return (Criteria) this;
        }

        public Criteria andFINISH_DATENotIn(List<Date> values) {
            addCriterionForJDBCDate("FINISH_DATE not in", values, "FINISH_DATE");
            return (Criteria) this;
        }

        public Criteria andFINISH_DATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FINISH_DATE between", value1, value2, "FINISH_DATE");
            return (Criteria) this;
        }

        public Criteria andFINISH_DATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FINISH_DATE not between", value1, value2, "FINISH_DATE");
            return (Criteria) this;
        }

        public Criteria andREVERSE_FLAGIsNull() {
            addCriterion("REVERSE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andREVERSE_FLAGIsNotNull() {
            addCriterion("REVERSE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andREVERSE_FLAGEqualTo(BigDecimal value) {
            addCriterion("REVERSE_FLAG =", value, "REVERSE_FLAG");
            return (Criteria) this;
        }

        public Criteria andREVERSE_FLAGNotEqualTo(BigDecimal value) {
            addCriterion("REVERSE_FLAG <>", value, "REVERSE_FLAG");
            return (Criteria) this;
        }

        public Criteria andREVERSE_FLAGGreaterThan(BigDecimal value) {
            addCriterion("REVERSE_FLAG >", value, "REVERSE_FLAG");
            return (Criteria) this;
        }

        public Criteria andREVERSE_FLAGGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REVERSE_FLAG >=", value, "REVERSE_FLAG");
            return (Criteria) this;
        }

        public Criteria andREVERSE_FLAGLessThan(BigDecimal value) {
            addCriterion("REVERSE_FLAG <", value, "REVERSE_FLAG");
            return (Criteria) this;
        }

        public Criteria andREVERSE_FLAGLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REVERSE_FLAG <=", value, "REVERSE_FLAG");
            return (Criteria) this;
        }

        public Criteria andREVERSE_FLAGIn(List<BigDecimal> values) {
            addCriterion("REVERSE_FLAG in", values, "REVERSE_FLAG");
            return (Criteria) this;
        }

        public Criteria andREVERSE_FLAGNotIn(List<BigDecimal> values) {
            addCriterion("REVERSE_FLAG not in", values, "REVERSE_FLAG");
            return (Criteria) this;
        }

        public Criteria andREVERSE_FLAGBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVERSE_FLAG between", value1, value2, "REVERSE_FLAG");
            return (Criteria) this;
        }

        public Criteria andREVERSE_FLAGNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVERSE_FLAG not between", value1, value2, "REVERSE_FLAG");
            return (Criteria) this;
        }

        public Criteria andSFLAGIsNull() {
            addCriterion("SFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSFLAGIsNotNull() {
            addCriterion("SFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSFLAGEqualTo(String value) {
            addCriterion("SFLAG =", value, "SFLAG");
            return (Criteria) this;
        }

        public Criteria andSFLAGNotEqualTo(String value) {
            addCriterion("SFLAG <>", value, "SFLAG");
            return (Criteria) this;
        }

        public Criteria andSFLAGGreaterThan(String value) {
            addCriterion("SFLAG >", value, "SFLAG");
            return (Criteria) this;
        }

        public Criteria andSFLAGGreaterThanOrEqualTo(String value) {
            addCriterion("SFLAG >=", value, "SFLAG");
            return (Criteria) this;
        }

        public Criteria andSFLAGLessThan(String value) {
            addCriterion("SFLAG <", value, "SFLAG");
            return (Criteria) this;
        }

        public Criteria andSFLAGLessThanOrEqualTo(String value) {
            addCriterion("SFLAG <=", value, "SFLAG");
            return (Criteria) this;
        }

        public Criteria andSFLAGLike(String value) {
            addCriterion("SFLAG like", value, "SFLAG");
            return (Criteria) this;
        }

        public Criteria andSFLAGNotLike(String value) {
            addCriterion("SFLAG not like", value, "SFLAG");
            return (Criteria) this;
        }

        public Criteria andSFLAGIn(List<String> values) {
            addCriterion("SFLAG in", values, "SFLAG");
            return (Criteria) this;
        }

        public Criteria andSFLAGNotIn(List<String> values) {
            addCriterion("SFLAG not in", values, "SFLAG");
            return (Criteria) this;
        }

        public Criteria andSFLAGBetween(String value1, String value2) {
            addCriterion("SFLAG between", value1, value2, "SFLAG");
            return (Criteria) this;
        }

        public Criteria andSFLAGNotBetween(String value1, String value2) {
            addCriterion("SFLAG not between", value1, value2, "SFLAG");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIsNull() {
            addCriterion("MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIsNotNull() {
            addCriterion("MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMESSAGEEqualTo(String value) {
            addCriterion("MESSAGE =", value, "MESSAGE");
            return (Criteria) this;
        }

        public Criteria andMESSAGENotEqualTo(String value) {
            addCriterion("MESSAGE <>", value, "MESSAGE");
            return (Criteria) this;
        }

        public Criteria andMESSAGEGreaterThan(String value) {
            addCriterion("MESSAGE >", value, "MESSAGE");
            return (Criteria) this;
        }

        public Criteria andMESSAGEGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE >=", value, "MESSAGE");
            return (Criteria) this;
        }

        public Criteria andMESSAGELessThan(String value) {
            addCriterion("MESSAGE <", value, "MESSAGE");
            return (Criteria) this;
        }

        public Criteria andMESSAGELessThanOrEqualTo(String value) {
            addCriterion("MESSAGE <=", value, "MESSAGE");
            return (Criteria) this;
        }

        public Criteria andMESSAGELike(String value) {
            addCriterion("MESSAGE like", value, "MESSAGE");
            return (Criteria) this;
        }

        public Criteria andMESSAGENotLike(String value) {
            addCriterion("MESSAGE not like", value, "MESSAGE");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIn(List<String> values) {
            addCriterion("MESSAGE in", values, "MESSAGE");
            return (Criteria) this;
        }

        public Criteria andMESSAGENotIn(List<String> values) {
            addCriterion("MESSAGE not in", values, "MESSAGE");
            return (Criteria) this;
        }

        public Criteria andMESSAGEBetween(String value1, String value2) {
            addCriterion("MESSAGE between", value1, value2, "MESSAGE");
            return (Criteria) this;
        }

        public Criteria andMESSAGENotBetween(String value1, String value2) {
            addCriterion("MESSAGE not between", value1, value2, "MESSAGE");
            return (Criteria) this;
        }

        public Criteria andBASE_NUMIsNull() {
            addCriterion("BASE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andBASE_NUMIsNotNull() {
            addCriterion("BASE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andBASE_NUMEqualTo(BigDecimal value) {
            addCriterion("BASE_NUM =", value, "BASE_NUM");
            return (Criteria) this;
        }

        public Criteria andBASE_NUMNotEqualTo(BigDecimal value) {
            addCriterion("BASE_NUM <>", value, "BASE_NUM");
            return (Criteria) this;
        }

        public Criteria andBASE_NUMGreaterThan(BigDecimal value) {
            addCriterion("BASE_NUM >", value, "BASE_NUM");
            return (Criteria) this;
        }

        public Criteria andBASE_NUMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_NUM >=", value, "BASE_NUM");
            return (Criteria) this;
        }

        public Criteria andBASE_NUMLessThan(BigDecimal value) {
            addCriterion("BASE_NUM <", value, "BASE_NUM");
            return (Criteria) this;
        }

        public Criteria andBASE_NUMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_NUM <=", value, "BASE_NUM");
            return (Criteria) this;
        }

        public Criteria andBASE_NUMIn(List<BigDecimal> values) {
            addCriterion("BASE_NUM in", values, "BASE_NUM");
            return (Criteria) this;
        }

        public Criteria andBASE_NUMNotIn(List<BigDecimal> values) {
            addCriterion("BASE_NUM not in", values, "BASE_NUM");
            return (Criteria) this;
        }

        public Criteria andBASE_NUMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_NUM between", value1, value2, "BASE_NUM");
            return (Criteria) this;
        }

        public Criteria andBASE_NUMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_NUM not between", value1, value2, "BASE_NUM");
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