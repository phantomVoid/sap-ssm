package com.phantom.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCoItemLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCoItemLevelExample() {
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

        public Criteria andLEVEL_CODEIsNull() {
            addCriterion("LEVEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODEIsNotNull() {
            addCriterion("LEVEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODEEqualTo(String value) {
            addCriterion("LEVEL_CODE =", value, "LEVEL_CODE");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODENotEqualTo(String value) {
            addCriterion("LEVEL_CODE <>", value, "LEVEL_CODE");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODEGreaterThan(String value) {
            addCriterion("LEVEL_CODE >", value, "LEVEL_CODE");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL_CODE >=", value, "LEVEL_CODE");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODELessThan(String value) {
            addCriterion("LEVEL_CODE <", value, "LEVEL_CODE");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODELessThanOrEqualTo(String value) {
            addCriterion("LEVEL_CODE <=", value, "LEVEL_CODE");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODELike(String value) {
            addCriterion("LEVEL_CODE like", value, "LEVEL_CODE");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODENotLike(String value) {
            addCriterion("LEVEL_CODE not like", value, "LEVEL_CODE");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODEIn(List<String> values) {
            addCriterion("LEVEL_CODE in", values, "LEVEL_CODE");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODENotIn(List<String> values) {
            addCriterion("LEVEL_CODE not in", values, "LEVEL_CODE");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODEBetween(String value1, String value2) {
            addCriterion("LEVEL_CODE between", value1, value2, "LEVEL_CODE");
            return (Criteria) this;
        }

        public Criteria andLEVEL_CODENotBetween(String value1, String value2) {
            addCriterion("LEVEL_CODE not between", value1, value2, "LEVEL_CODE");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NOIsNull() {
            addCriterion("LEVEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NOIsNotNull() {
            addCriterion("LEVEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NOEqualTo(String value) {
            addCriterion("LEVEL_NO =", value, "LEVEL_NO");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NONotEqualTo(String value) {
            addCriterion("LEVEL_NO <>", value, "LEVEL_NO");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NOGreaterThan(String value) {
            addCriterion("LEVEL_NO >", value, "LEVEL_NO");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NOGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL_NO >=", value, "LEVEL_NO");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NOLessThan(String value) {
            addCriterion("LEVEL_NO <", value, "LEVEL_NO");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NOLessThanOrEqualTo(String value) {
            addCriterion("LEVEL_NO <=", value, "LEVEL_NO");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NOLike(String value) {
            addCriterion("LEVEL_NO like", value, "LEVEL_NO");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NONotLike(String value) {
            addCriterion("LEVEL_NO not like", value, "LEVEL_NO");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NOIn(List<String> values) {
            addCriterion("LEVEL_NO in", values, "LEVEL_NO");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NONotIn(List<String> values) {
            addCriterion("LEVEL_NO not in", values, "LEVEL_NO");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NOBetween(String value1, String value2) {
            addCriterion("LEVEL_NO between", value1, value2, "LEVEL_NO");
            return (Criteria) this;
        }

        public Criteria andLEVEL_NONotBetween(String value1, String value2) {
            addCriterion("LEVEL_NO not between", value1, value2, "LEVEL_NO");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCIsNull() {
            addCriterion("LEVEL_DESC is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCIsNotNull() {
            addCriterion("LEVEL_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCEqualTo(String value) {
            addCriterion("LEVEL_DESC =", value, "LEVEL_DESC");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCNotEqualTo(String value) {
            addCriterion("LEVEL_DESC <>", value, "LEVEL_DESC");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCGreaterThan(String value) {
            addCriterion("LEVEL_DESC >", value, "LEVEL_DESC");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL_DESC >=", value, "LEVEL_DESC");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCLessThan(String value) {
            addCriterion("LEVEL_DESC <", value, "LEVEL_DESC");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCLessThanOrEqualTo(String value) {
            addCriterion("LEVEL_DESC <=", value, "LEVEL_DESC");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCLike(String value) {
            addCriterion("LEVEL_DESC like", value, "LEVEL_DESC");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCNotLike(String value) {
            addCriterion("LEVEL_DESC not like", value, "LEVEL_DESC");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCIn(List<String> values) {
            addCriterion("LEVEL_DESC in", values, "LEVEL_DESC");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCNotIn(List<String> values) {
            addCriterion("LEVEL_DESC not in", values, "LEVEL_DESC");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCBetween(String value1, String value2) {
            addCriterion("LEVEL_DESC between", value1, value2, "LEVEL_DESC");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DESCNotBetween(String value1, String value2) {
            addCriterion("LEVEL_DESC not between", value1, value2, "LEVEL_DESC");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDIsNull() {
            addCriterion("LEVEL_END is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDIsNotNull() {
            addCriterion("LEVEL_END is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDEqualTo(String value) {
            addCriterion("LEVEL_END =", value, "LEVEL_END");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDNotEqualTo(String value) {
            addCriterion("LEVEL_END <>", value, "LEVEL_END");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDGreaterThan(String value) {
            addCriterion("LEVEL_END >", value, "LEVEL_END");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL_END >=", value, "LEVEL_END");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDLessThan(String value) {
            addCriterion("LEVEL_END <", value, "LEVEL_END");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDLessThanOrEqualTo(String value) {
            addCriterion("LEVEL_END <=", value, "LEVEL_END");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDLike(String value) {
            addCriterion("LEVEL_END like", value, "LEVEL_END");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDNotLike(String value) {
            addCriterion("LEVEL_END not like", value, "LEVEL_END");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDIn(List<String> values) {
            addCriterion("LEVEL_END in", values, "LEVEL_END");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDNotIn(List<String> values) {
            addCriterion("LEVEL_END not in", values, "LEVEL_END");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDBetween(String value1, String value2) {
            addCriterion("LEVEL_END between", value1, value2, "LEVEL_END");
            return (Criteria) this;
        }

        public Criteria andLEVEL_ENDNotBetween(String value1, String value2) {
            addCriterion("LEVEL_END not between", value1, value2, "LEVEL_END");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTIsNull() {
            addCriterion("LEVEL_DATA_OPT is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTIsNotNull() {
            addCriterion("LEVEL_DATA_OPT is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTEqualTo(String value) {
            addCriterion("LEVEL_DATA_OPT =", value, "LEVEL_DATA_OPT");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTNotEqualTo(String value) {
            addCriterion("LEVEL_DATA_OPT <>", value, "LEVEL_DATA_OPT");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTGreaterThan(String value) {
            addCriterion("LEVEL_DATA_OPT >", value, "LEVEL_DATA_OPT");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL_DATA_OPT >=", value, "LEVEL_DATA_OPT");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTLessThan(String value) {
            addCriterion("LEVEL_DATA_OPT <", value, "LEVEL_DATA_OPT");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTLessThanOrEqualTo(String value) {
            addCriterion("LEVEL_DATA_OPT <=", value, "LEVEL_DATA_OPT");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTLike(String value) {
            addCriterion("LEVEL_DATA_OPT like", value, "LEVEL_DATA_OPT");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTNotLike(String value) {
            addCriterion("LEVEL_DATA_OPT not like", value, "LEVEL_DATA_OPT");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTIn(List<String> values) {
            addCriterion("LEVEL_DATA_OPT in", values, "LEVEL_DATA_OPT");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTNotIn(List<String> values) {
            addCriterion("LEVEL_DATA_OPT not in", values, "LEVEL_DATA_OPT");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTBetween(String value1, String value2) {
            addCriterion("LEVEL_DATA_OPT between", value1, value2, "LEVEL_DATA_OPT");
            return (Criteria) this;
        }

        public Criteria andLEVEL_DATA_OPTNotBetween(String value1, String value2) {
            addCriterion("LEVEL_DATA_OPT not between", value1, value2, "LEVEL_DATA_OPT");
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