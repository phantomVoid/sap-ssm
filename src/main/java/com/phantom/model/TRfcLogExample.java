package com.phantom.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TRfcLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRfcLogExample() {
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

        public Criteria andRL_FUNC_NAMEIsNull() {
            addCriterion("RL_FUNC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMEIsNotNull() {
            addCriterion("RL_FUNC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMEEqualTo(String value) {
            addCriterion("RL_FUNC_NAME =", value, "RL_FUNC_NAME");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMENotEqualTo(String value) {
            addCriterion("RL_FUNC_NAME <>", value, "RL_FUNC_NAME");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMEGreaterThan(String value) {
            addCriterion("RL_FUNC_NAME >", value, "RL_FUNC_NAME");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("RL_FUNC_NAME >=", value, "RL_FUNC_NAME");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMELessThan(String value) {
            addCriterion("RL_FUNC_NAME <", value, "RL_FUNC_NAME");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMELessThanOrEqualTo(String value) {
            addCriterion("RL_FUNC_NAME <=", value, "RL_FUNC_NAME");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMELike(String value) {
            addCriterion("RL_FUNC_NAME like", value, "RL_FUNC_NAME");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMENotLike(String value) {
            addCriterion("RL_FUNC_NAME not like", value, "RL_FUNC_NAME");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMEIn(List<String> values) {
            addCriterion("RL_FUNC_NAME in", values, "RL_FUNC_NAME");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMENotIn(List<String> values) {
            addCriterion("RL_FUNC_NAME not in", values, "RL_FUNC_NAME");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMEBetween(String value1, String value2) {
            addCriterion("RL_FUNC_NAME between", value1, value2, "RL_FUNC_NAME");
            return (Criteria) this;
        }

        public Criteria andRL_FUNC_NAMENotBetween(String value1, String value2) {
            addCriterion("RL_FUNC_NAME not between", value1, value2, "RL_FUNC_NAME");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGIsNull() {
            addCriterion("RL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGIsNotNull() {
            addCriterion("RL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGEqualTo(String value) {
            addCriterion("RL_FLAG =", value, "RL_FLAG");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGNotEqualTo(String value) {
            addCriterion("RL_FLAG <>", value, "RL_FLAG");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGGreaterThan(String value) {
            addCriterion("RL_FLAG >", value, "RL_FLAG");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("RL_FLAG >=", value, "RL_FLAG");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGLessThan(String value) {
            addCriterion("RL_FLAG <", value, "RL_FLAG");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGLessThanOrEqualTo(String value) {
            addCriterion("RL_FLAG <=", value, "RL_FLAG");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGLike(String value) {
            addCriterion("RL_FLAG like", value, "RL_FLAG");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGNotLike(String value) {
            addCriterion("RL_FLAG not like", value, "RL_FLAG");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGIn(List<String> values) {
            addCriterion("RL_FLAG in", values, "RL_FLAG");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGNotIn(List<String> values) {
            addCriterion("RL_FLAG not in", values, "RL_FLAG");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGBetween(String value1, String value2) {
            addCriterion("RL_FLAG between", value1, value2, "RL_FLAG");
            return (Criteria) this;
        }

        public Criteria andRL_FLAGNotBetween(String value1, String value2) {
            addCriterion("RL_FLAG not between", value1, value2, "RL_FLAG");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGEIsNull() {
            addCriterion("RL_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGEIsNotNull() {
            addCriterion("RL_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGEEqualTo(String value) {
            addCriterion("RL_MESSAGE =", value, "RL_MESSAGE");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGENotEqualTo(String value) {
            addCriterion("RL_MESSAGE <>", value, "RL_MESSAGE");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGEGreaterThan(String value) {
            addCriterion("RL_MESSAGE >", value, "RL_MESSAGE");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGEGreaterThanOrEqualTo(String value) {
            addCriterion("RL_MESSAGE >=", value, "RL_MESSAGE");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGELessThan(String value) {
            addCriterion("RL_MESSAGE <", value, "RL_MESSAGE");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGELessThanOrEqualTo(String value) {
            addCriterion("RL_MESSAGE <=", value, "RL_MESSAGE");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGELike(String value) {
            addCriterion("RL_MESSAGE like", value, "RL_MESSAGE");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGENotLike(String value) {
            addCriterion("RL_MESSAGE not like", value, "RL_MESSAGE");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGEIn(List<String> values) {
            addCriterion("RL_MESSAGE in", values, "RL_MESSAGE");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGENotIn(List<String> values) {
            addCriterion("RL_MESSAGE not in", values, "RL_MESSAGE");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGEBetween(String value1, String value2) {
            addCriterion("RL_MESSAGE between", value1, value2, "RL_MESSAGE");
            return (Criteria) this;
        }

        public Criteria andRL_MESSAGENotBetween(String value1, String value2) {
            addCriterion("RL_MESSAGE not between", value1, value2, "RL_MESSAGE");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTIsNull() {
            addCriterion("RL_IMPORT is null");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTIsNotNull() {
            addCriterion("RL_IMPORT is not null");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTEqualTo(String value) {
            addCriterion("RL_IMPORT =", value, "RL_IMPORT");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTNotEqualTo(String value) {
            addCriterion("RL_IMPORT <>", value, "RL_IMPORT");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTGreaterThan(String value) {
            addCriterion("RL_IMPORT >", value, "RL_IMPORT");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTGreaterThanOrEqualTo(String value) {
            addCriterion("RL_IMPORT >=", value, "RL_IMPORT");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTLessThan(String value) {
            addCriterion("RL_IMPORT <", value, "RL_IMPORT");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTLessThanOrEqualTo(String value) {
            addCriterion("RL_IMPORT <=", value, "RL_IMPORT");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTLike(String value) {
            addCriterion("RL_IMPORT like", value, "RL_IMPORT");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTNotLike(String value) {
            addCriterion("RL_IMPORT not like", value, "RL_IMPORT");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTIn(List<String> values) {
            addCriterion("RL_IMPORT in", values, "RL_IMPORT");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTNotIn(List<String> values) {
            addCriterion("RL_IMPORT not in", values, "RL_IMPORT");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTBetween(String value1, String value2) {
            addCriterion("RL_IMPORT between", value1, value2, "RL_IMPORT");
            return (Criteria) this;
        }

        public Criteria andRL_IMPORTNotBetween(String value1, String value2) {
            addCriterion("RL_IMPORT not between", value1, value2, "RL_IMPORT");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTIsNull() {
            addCriterion("RL_EXPORT is null");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTIsNotNull() {
            addCriterion("RL_EXPORT is not null");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTEqualTo(String value) {
            addCriterion("RL_EXPORT =", value, "RL_EXPORT");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTNotEqualTo(String value) {
            addCriterion("RL_EXPORT <>", value, "RL_EXPORT");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTGreaterThan(String value) {
            addCriterion("RL_EXPORT >", value, "RL_EXPORT");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTGreaterThanOrEqualTo(String value) {
            addCriterion("RL_EXPORT >=", value, "RL_EXPORT");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTLessThan(String value) {
            addCriterion("RL_EXPORT <", value, "RL_EXPORT");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTLessThanOrEqualTo(String value) {
            addCriterion("RL_EXPORT <=", value, "RL_EXPORT");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTLike(String value) {
            addCriterion("RL_EXPORT like", value, "RL_EXPORT");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTNotLike(String value) {
            addCriterion("RL_EXPORT not like", value, "RL_EXPORT");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTIn(List<String> values) {
            addCriterion("RL_EXPORT in", values, "RL_EXPORT");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTNotIn(List<String> values) {
            addCriterion("RL_EXPORT not in", values, "RL_EXPORT");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTBetween(String value1, String value2) {
            addCriterion("RL_EXPORT between", value1, value2, "RL_EXPORT");
            return (Criteria) this;
        }

        public Criteria andRL_EXPORTNotBetween(String value1, String value2) {
            addCriterion("RL_EXPORT not between", value1, value2, "RL_EXPORT");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGIsNull() {
            addCriterion("RL_CHANGING is null");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGIsNotNull() {
            addCriterion("RL_CHANGING is not null");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGEqualTo(String value) {
            addCriterion("RL_CHANGING =", value, "RL_CHANGING");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGNotEqualTo(String value) {
            addCriterion("RL_CHANGING <>", value, "RL_CHANGING");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGGreaterThan(String value) {
            addCriterion("RL_CHANGING >", value, "RL_CHANGING");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGGreaterThanOrEqualTo(String value) {
            addCriterion("RL_CHANGING >=", value, "RL_CHANGING");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGLessThan(String value) {
            addCriterion("RL_CHANGING <", value, "RL_CHANGING");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGLessThanOrEqualTo(String value) {
            addCriterion("RL_CHANGING <=", value, "RL_CHANGING");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGLike(String value) {
            addCriterion("RL_CHANGING like", value, "RL_CHANGING");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGNotLike(String value) {
            addCriterion("RL_CHANGING not like", value, "RL_CHANGING");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGIn(List<String> values) {
            addCriterion("RL_CHANGING in", values, "RL_CHANGING");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGNotIn(List<String> values) {
            addCriterion("RL_CHANGING not in", values, "RL_CHANGING");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGBetween(String value1, String value2) {
            addCriterion("RL_CHANGING between", value1, value2, "RL_CHANGING");
            return (Criteria) this;
        }

        public Criteria andRL_CHANGINGNotBetween(String value1, String value2) {
            addCriterion("RL_CHANGING not between", value1, value2, "RL_CHANGING");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESIsNull() {
            addCriterion("RL_TABLES is null");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESIsNotNull() {
            addCriterion("RL_TABLES is not null");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESEqualTo(String value) {
            addCriterion("RL_TABLES =", value, "RL_TABLES");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESNotEqualTo(String value) {
            addCriterion("RL_TABLES <>", value, "RL_TABLES");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESGreaterThan(String value) {
            addCriterion("RL_TABLES >", value, "RL_TABLES");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESGreaterThanOrEqualTo(String value) {
            addCriterion("RL_TABLES >=", value, "RL_TABLES");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESLessThan(String value) {
            addCriterion("RL_TABLES <", value, "RL_TABLES");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESLessThanOrEqualTo(String value) {
            addCriterion("RL_TABLES <=", value, "RL_TABLES");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESLike(String value) {
            addCriterion("RL_TABLES like", value, "RL_TABLES");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESNotLike(String value) {
            addCriterion("RL_TABLES not like", value, "RL_TABLES");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESIn(List<String> values) {
            addCriterion("RL_TABLES in", values, "RL_TABLES");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESNotIn(List<String> values) {
            addCriterion("RL_TABLES not in", values, "RL_TABLES");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESBetween(String value1, String value2) {
            addCriterion("RL_TABLES between", value1, value2, "RL_TABLES");
            return (Criteria) this;
        }

        public Criteria andRL_TABLESNotBetween(String value1, String value2) {
            addCriterion("RL_TABLES not between", value1, value2, "RL_TABLES");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSIsNull() {
            addCriterion("RL_EXCEPTIONS is null");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSIsNotNull() {
            addCriterion("RL_EXCEPTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSEqualTo(String value) {
            addCriterion("RL_EXCEPTIONS =", value, "RL_EXCEPTIONS");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSNotEqualTo(String value) {
            addCriterion("RL_EXCEPTIONS <>", value, "RL_EXCEPTIONS");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSGreaterThan(String value) {
            addCriterion("RL_EXCEPTIONS >", value, "RL_EXCEPTIONS");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSGreaterThanOrEqualTo(String value) {
            addCriterion("RL_EXCEPTIONS >=", value, "RL_EXCEPTIONS");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSLessThan(String value) {
            addCriterion("RL_EXCEPTIONS <", value, "RL_EXCEPTIONS");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSLessThanOrEqualTo(String value) {
            addCriterion("RL_EXCEPTIONS <=", value, "RL_EXCEPTIONS");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSLike(String value) {
            addCriterion("RL_EXCEPTIONS like", value, "RL_EXCEPTIONS");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSNotLike(String value) {
            addCriterion("RL_EXCEPTIONS not like", value, "RL_EXCEPTIONS");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSIn(List<String> values) {
            addCriterion("RL_EXCEPTIONS in", values, "RL_EXCEPTIONS");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSNotIn(List<String> values) {
            addCriterion("RL_EXCEPTIONS not in", values, "RL_EXCEPTIONS");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSBetween(String value1, String value2) {
            addCriterion("RL_EXCEPTIONS between", value1, value2, "RL_EXCEPTIONS");
            return (Criteria) this;
        }

        public Criteria andRL_EXCEPTIONSNotBetween(String value1, String value2) {
            addCriterion("RL_EXCEPTIONS not between", value1, value2, "RL_EXCEPTIONS");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORIsNull() {
            addCriterion("RL_SY_ERROR is null");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORIsNotNull() {
            addCriterion("RL_SY_ERROR is not null");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERROREqualTo(String value) {
            addCriterion("RL_SY_ERROR =", value, "RL_SY_ERROR");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORNotEqualTo(String value) {
            addCriterion("RL_SY_ERROR <>", value, "RL_SY_ERROR");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORGreaterThan(String value) {
            addCriterion("RL_SY_ERROR >", value, "RL_SY_ERROR");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORGreaterThanOrEqualTo(String value) {
            addCriterion("RL_SY_ERROR >=", value, "RL_SY_ERROR");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORLessThan(String value) {
            addCriterion("RL_SY_ERROR <", value, "RL_SY_ERROR");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORLessThanOrEqualTo(String value) {
            addCriterion("RL_SY_ERROR <=", value, "RL_SY_ERROR");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORLike(String value) {
            addCriterion("RL_SY_ERROR like", value, "RL_SY_ERROR");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORNotLike(String value) {
            addCriterion("RL_SY_ERROR not like", value, "RL_SY_ERROR");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORIn(List<String> values) {
            addCriterion("RL_SY_ERROR in", values, "RL_SY_ERROR");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORNotIn(List<String> values) {
            addCriterion("RL_SY_ERROR not in", values, "RL_SY_ERROR");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORBetween(String value1, String value2) {
            addCriterion("RL_SY_ERROR between", value1, value2, "RL_SY_ERROR");
            return (Criteria) this;
        }

        public Criteria andRL_SY_ERRORNotBetween(String value1, String value2) {
            addCriterion("RL_SY_ERROR not between", value1, value2, "RL_SY_ERROR");
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