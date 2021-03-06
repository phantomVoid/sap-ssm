package com.phantom.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TPmProjectFeedDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPmProjectFeedDetailExample() {
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

        public Criteria andITEM_CODEIsNull() {
            addCriterion("ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andITEM_CODEIsNotNull() {
            addCriterion("ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andITEM_CODEEqualTo(String value) {
            addCriterion("ITEM_CODE =", value, "ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andITEM_CODENotEqualTo(String value) {
            addCriterion("ITEM_CODE <>", value, "ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andITEM_CODEGreaterThan(String value) {
            addCriterion("ITEM_CODE >", value, "ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andITEM_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE >=", value, "ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andITEM_CODELessThan(String value) {
            addCriterion("ITEM_CODE <", value, "ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andITEM_CODELessThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE <=", value, "ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andITEM_CODELike(String value) {
            addCriterion("ITEM_CODE like", value, "ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andITEM_CODENotLike(String value) {
            addCriterion("ITEM_CODE not like", value, "ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andITEM_CODEIn(List<String> values) {
            addCriterion("ITEM_CODE in", values, "ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andITEM_CODENotIn(List<String> values) {
            addCriterion("ITEM_CODE not in", values, "ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andITEM_CODEBetween(String value1, String value2) {
            addCriterion("ITEM_CODE between", value1, value2, "ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andITEM_CODENotBetween(String value1, String value2) {
            addCriterion("ITEM_CODE not between", value1, value2, "ITEM_CODE");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODEIsNull() {
            addCriterion("MODEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODEIsNotNull() {
            addCriterion("MODEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODEEqualTo(String value) {
            addCriterion("MODEL_CODE =", value, "MODEL_CODE");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODENotEqualTo(String value) {
            addCriterion("MODEL_CODE <>", value, "MODEL_CODE");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODEGreaterThan(String value) {
            addCriterion("MODEL_CODE >", value, "MODEL_CODE");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_CODE >=", value, "MODEL_CODE");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODELessThan(String value) {
            addCriterion("MODEL_CODE <", value, "MODEL_CODE");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODELessThanOrEqualTo(String value) {
            addCriterion("MODEL_CODE <=", value, "MODEL_CODE");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODELike(String value) {
            addCriterion("MODEL_CODE like", value, "MODEL_CODE");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODENotLike(String value) {
            addCriterion("MODEL_CODE not like", value, "MODEL_CODE");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODEIn(List<String> values) {
            addCriterion("MODEL_CODE in", values, "MODEL_CODE");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODENotIn(List<String> values) {
            addCriterion("MODEL_CODE not in", values, "MODEL_CODE");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODEBetween(String value1, String value2) {
            addCriterion("MODEL_CODE between", value1, value2, "MODEL_CODE");
            return (Criteria) this;
        }

        public Criteria andMODEL_CODENotBetween(String value1, String value2) {
            addCriterion("MODEL_CODE not between", value1, value2, "MODEL_CODE");
            return (Criteria) this;
        }

        public Criteria andITEM_NUMIsNull() {
            addCriterion("ITEM_NUM is null");
            return (Criteria) this;
        }

        public Criteria andITEM_NUMIsNotNull() {
            addCriterion("ITEM_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andITEM_NUMEqualTo(BigDecimal value) {
            addCriterion("ITEM_NUM =", value, "ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andITEM_NUMNotEqualTo(BigDecimal value) {
            addCriterion("ITEM_NUM <>", value, "ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andITEM_NUMGreaterThan(BigDecimal value) {
            addCriterion("ITEM_NUM >", value, "ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andITEM_NUMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_NUM >=", value, "ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andITEM_NUMLessThan(BigDecimal value) {
            addCriterion("ITEM_NUM <", value, "ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andITEM_NUMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_NUM <=", value, "ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andITEM_NUMIn(List<BigDecimal> values) {
            addCriterion("ITEM_NUM in", values, "ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andITEM_NUMNotIn(List<BigDecimal> values) {
            addCriterion("ITEM_NUM not in", values, "ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andITEM_NUMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_NUM between", value1, value2, "ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andITEM_NUMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_NUM not between", value1, value2, "ITEM_NUM");
            return (Criteria) this;
        }

        public Criteria andFEED_NUMIsNull() {
            addCriterion("FEED_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFEED_NUMIsNotNull() {
            addCriterion("FEED_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFEED_NUMEqualTo(BigDecimal value) {
            addCriterion("FEED_NUM =", value, "FEED_NUM");
            return (Criteria) this;
        }

        public Criteria andFEED_NUMNotEqualTo(BigDecimal value) {
            addCriterion("FEED_NUM <>", value, "FEED_NUM");
            return (Criteria) this;
        }

        public Criteria andFEED_NUMGreaterThan(BigDecimal value) {
            addCriterion("FEED_NUM >", value, "FEED_NUM");
            return (Criteria) this;
        }

        public Criteria andFEED_NUMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEED_NUM >=", value, "FEED_NUM");
            return (Criteria) this;
        }

        public Criteria andFEED_NUMLessThan(BigDecimal value) {
            addCriterion("FEED_NUM <", value, "FEED_NUM");
            return (Criteria) this;
        }

        public Criteria andFEED_NUMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEED_NUM <=", value, "FEED_NUM");
            return (Criteria) this;
        }

        public Criteria andFEED_NUMIn(List<BigDecimal> values) {
            addCriterion("FEED_NUM in", values, "FEED_NUM");
            return (Criteria) this;
        }

        public Criteria andFEED_NUMNotIn(List<BigDecimal> values) {
            addCriterion("FEED_NUM not in", values, "FEED_NUM");
            return (Criteria) this;
        }

        public Criteria andFEED_NUMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEED_NUM between", value1, value2, "FEED_NUM");
            return (Criteria) this;
        }

        public Criteria andFEED_NUMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEED_NUM not between", value1, value2, "FEED_NUM");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERIsNull() {
            addCriterion("PROCESS_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERIsNotNull() {
            addCriterion("PROCESS_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDEREqualTo(String value) {
            addCriterion("PROCESS_ORDER =", value, "PROCESS_ORDER");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERNotEqualTo(String value) {
            addCriterion("PROCESS_ORDER <>", value, "PROCESS_ORDER");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERGreaterThan(String value) {
            addCriterion("PROCESS_ORDER >", value, "PROCESS_ORDER");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_ORDER >=", value, "PROCESS_ORDER");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERLessThan(String value) {
            addCriterion("PROCESS_ORDER <", value, "PROCESS_ORDER");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_ORDER <=", value, "PROCESS_ORDER");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERLike(String value) {
            addCriterion("PROCESS_ORDER like", value, "PROCESS_ORDER");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERNotLike(String value) {
            addCriterion("PROCESS_ORDER not like", value, "PROCESS_ORDER");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERIn(List<String> values) {
            addCriterion("PROCESS_ORDER in", values, "PROCESS_ORDER");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERNotIn(List<String> values) {
            addCriterion("PROCESS_ORDER not in", values, "PROCESS_ORDER");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERBetween(String value1, String value2) {
            addCriterion("PROCESS_ORDER between", value1, value2, "PROCESS_ORDER");
            return (Criteria) this;
        }

        public Criteria andPROCESS_ORDERNotBetween(String value1, String value2) {
            addCriterion("PROCESS_ORDER not between", value1, value2, "PROCESS_ORDER");
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

        public Criteria andWAREHOUSEIsNull() {
            addCriterion("WAREHOUSE is null");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSEIsNotNull() {
            addCriterion("WAREHOUSE is not null");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSEEqualTo(String value) {
            addCriterion("WAREHOUSE =", value, "WAREHOUSE");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSENotEqualTo(String value) {
            addCriterion("WAREHOUSE <>", value, "WAREHOUSE");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSEGreaterThan(String value) {
            addCriterion("WAREHOUSE >", value, "WAREHOUSE");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSEGreaterThanOrEqualTo(String value) {
            addCriterion("WAREHOUSE >=", value, "WAREHOUSE");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSELessThan(String value) {
            addCriterion("WAREHOUSE <", value, "WAREHOUSE");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSELessThanOrEqualTo(String value) {
            addCriterion("WAREHOUSE <=", value, "WAREHOUSE");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSELike(String value) {
            addCriterion("WAREHOUSE like", value, "WAREHOUSE");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSENotLike(String value) {
            addCriterion("WAREHOUSE not like", value, "WAREHOUSE");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSEIn(List<String> values) {
            addCriterion("WAREHOUSE in", values, "WAREHOUSE");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSENotIn(List<String> values) {
            addCriterion("WAREHOUSE not in", values, "WAREHOUSE");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSEBetween(String value1, String value2) {
            addCriterion("WAREHOUSE between", value1, value2, "WAREHOUSE");
            return (Criteria) this;
        }

        public Criteria andWAREHOUSENotBetween(String value1, String value2) {
            addCriterion("WAREHOUSE not between", value1, value2, "WAREHOUSE");
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