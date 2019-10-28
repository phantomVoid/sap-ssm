package com.phantom.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MlTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlTemplateExample() {
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

        public Criteria andLABEL_NAMEIsNull() {
            addCriterion("LABEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMEIsNotNull() {
            addCriterion("LABEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMEEqualTo(String value) {
            addCriterion("LABEL_NAME =", value, "LABEL_NAME");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMENotEqualTo(String value) {
            addCriterion("LABEL_NAME <>", value, "LABEL_NAME");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMEGreaterThan(String value) {
            addCriterion("LABEL_NAME >", value, "LABEL_NAME");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL_NAME >=", value, "LABEL_NAME");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMELessThan(String value) {
            addCriterion("LABEL_NAME <", value, "LABEL_NAME");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMELessThanOrEqualTo(String value) {
            addCriterion("LABEL_NAME <=", value, "LABEL_NAME");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMELike(String value) {
            addCriterion("LABEL_NAME like", value, "LABEL_NAME");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMENotLike(String value) {
            addCriterion("LABEL_NAME not like", value, "LABEL_NAME");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMEIn(List<String> values) {
            addCriterion("LABEL_NAME in", values, "LABEL_NAME");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMENotIn(List<String> values) {
            addCriterion("LABEL_NAME not in", values, "LABEL_NAME");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMEBetween(String value1, String value2) {
            addCriterion("LABEL_NAME between", value1, value2, "LABEL_NAME");
            return (Criteria) this;
        }

        public Criteria andLABEL_NAMENotBetween(String value1, String value2) {
            addCriterion("LABEL_NAME not between", value1, value2, "LABEL_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNull() {
            addCriterion("`STATUS` is null");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNotNull() {
            addCriterion("`STATUS` is not null");
            return (Criteria) this;
        }

        public Criteria andSTATUSEqualTo(String value) {
            addCriterion("`STATUS` =", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotEqualTo(String value) {
            addCriterion("`STATUS` <>", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThan(String value) {
            addCriterion("`STATUS` >", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThanOrEqualTo(String value) {
            addCriterion("`STATUS` >=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThan(String value) {
            addCriterion("`STATUS` <", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThanOrEqualTo(String value) {
            addCriterion("`STATUS` <=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLike(String value) {
            addCriterion("`STATUS` like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotLike(String value) {
            addCriterion("`STATUS` not like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSIn(List<String> values) {
            addCriterion("`STATUS` in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotIn(List<String> values) {
            addCriterion("`STATUS` not in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSBetween(String value1, String value2) {
            addCriterion("`STATUS` between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotBetween(String value1, String value2) {
            addCriterion("`STATUS` not between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPIsNull() {
            addCriterion("SAMPLE_MAP is null");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPIsNotNull() {
            addCriterion("SAMPLE_MAP is not null");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPEqualTo(String value) {
            addCriterion("SAMPLE_MAP =", value, "SAMPLE_MAP");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPNotEqualTo(String value) {
            addCriterion("SAMPLE_MAP <>", value, "SAMPLE_MAP");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPGreaterThan(String value) {
            addCriterion("SAMPLE_MAP >", value, "SAMPLE_MAP");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_MAP >=", value, "SAMPLE_MAP");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPLessThan(String value) {
            addCriterion("SAMPLE_MAP <", value, "SAMPLE_MAP");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_MAP <=", value, "SAMPLE_MAP");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPLike(String value) {
            addCriterion("SAMPLE_MAP like", value, "SAMPLE_MAP");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPNotLike(String value) {
            addCriterion("SAMPLE_MAP not like", value, "SAMPLE_MAP");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPIn(List<String> values) {
            addCriterion("SAMPLE_MAP in", values, "SAMPLE_MAP");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPNotIn(List<String> values) {
            addCriterion("SAMPLE_MAP not in", values, "SAMPLE_MAP");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPBetween(String value1, String value2) {
            addCriterion("SAMPLE_MAP between", value1, value2, "SAMPLE_MAP");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAPNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_MAP not between", value1, value2, "SAMPLE_MAP");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILEIsNull() {
            addCriterion("MODEL_FILE is null");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILEIsNotNull() {
            addCriterion("MODEL_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILEEqualTo(String value) {
            addCriterion("MODEL_FILE =", value, "MODEL_FILE");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILENotEqualTo(String value) {
            addCriterion("MODEL_FILE <>", value, "MODEL_FILE");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILEGreaterThan(String value) {
            addCriterion("MODEL_FILE >", value, "MODEL_FILE");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILEGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_FILE >=", value, "MODEL_FILE");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILELessThan(String value) {
            addCriterion("MODEL_FILE <", value, "MODEL_FILE");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILELessThanOrEqualTo(String value) {
            addCriterion("MODEL_FILE <=", value, "MODEL_FILE");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILELike(String value) {
            addCriterion("MODEL_FILE like", value, "MODEL_FILE");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILENotLike(String value) {
            addCriterion("MODEL_FILE not like", value, "MODEL_FILE");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILEIn(List<String> values) {
            addCriterion("MODEL_FILE in", values, "MODEL_FILE");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILENotIn(List<String> values) {
            addCriterion("MODEL_FILE not in", values, "MODEL_FILE");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILEBetween(String value1, String value2) {
            addCriterion("MODEL_FILE between", value1, value2, "MODEL_FILE");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILENotBetween(String value1, String value2) {
            addCriterion("MODEL_FILE not between", value1, value2, "MODEL_FILE");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNIsNull() {
            addCriterion("SHARE_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNIsNotNull() {
            addCriterion("SHARE_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNEqualTo(String value) {
            addCriterion("SHARE_SIGN =", value, "SHARE_SIGN");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNNotEqualTo(String value) {
            addCriterion("SHARE_SIGN <>", value, "SHARE_SIGN");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNGreaterThan(String value) {
            addCriterion("SHARE_SIGN >", value, "SHARE_SIGN");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNGreaterThanOrEqualTo(String value) {
            addCriterion("SHARE_SIGN >=", value, "SHARE_SIGN");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNLessThan(String value) {
            addCriterion("SHARE_SIGN <", value, "SHARE_SIGN");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNLessThanOrEqualTo(String value) {
            addCriterion("SHARE_SIGN <=", value, "SHARE_SIGN");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNLike(String value) {
            addCriterion("SHARE_SIGN like", value, "SHARE_SIGN");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNNotLike(String value) {
            addCriterion("SHARE_SIGN not like", value, "SHARE_SIGN");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNIn(List<String> values) {
            addCriterion("SHARE_SIGN in", values, "SHARE_SIGN");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNNotIn(List<String> values) {
            addCriterion("SHARE_SIGN not in", values, "SHARE_SIGN");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNBetween(String value1, String value2) {
            addCriterion("SHARE_SIGN between", value1, value2, "SHARE_SIGN");
            return (Criteria) this;
        }

        public Criteria andSHARE_SIGNNotBetween(String value1, String value2) {
            addCriterion("SHARE_SIGN not between", value1, value2, "SHARE_SIGN");
            return (Criteria) this;
        }

        public Criteria andPRINT_NUMIsNull() {
            addCriterion("PRINT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPRINT_NUMIsNotNull() {
            addCriterion("PRINT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPRINT_NUMEqualTo(BigDecimal value) {
            addCriterion("PRINT_NUM =", value, "PRINT_NUM");
            return (Criteria) this;
        }

        public Criteria andPRINT_NUMNotEqualTo(BigDecimal value) {
            addCriterion("PRINT_NUM <>", value, "PRINT_NUM");
            return (Criteria) this;
        }

        public Criteria andPRINT_NUMGreaterThan(BigDecimal value) {
            addCriterion("PRINT_NUM >", value, "PRINT_NUM");
            return (Criteria) this;
        }

        public Criteria andPRINT_NUMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRINT_NUM >=", value, "PRINT_NUM");
            return (Criteria) this;
        }

        public Criteria andPRINT_NUMLessThan(BigDecimal value) {
            addCriterion("PRINT_NUM <", value, "PRINT_NUM");
            return (Criteria) this;
        }

        public Criteria andPRINT_NUMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRINT_NUM <=", value, "PRINT_NUM");
            return (Criteria) this;
        }

        public Criteria andPRINT_NUMIn(List<BigDecimal> values) {
            addCriterion("PRINT_NUM in", values, "PRINT_NUM");
            return (Criteria) this;
        }

        public Criteria andPRINT_NUMNotIn(List<BigDecimal> values) {
            addCriterion("PRINT_NUM not in", values, "PRINT_NUM");
            return (Criteria) this;
        }

        public Criteria andPRINT_NUMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRINT_NUM between", value1, value2, "PRINT_NUM");
            return (Criteria) this;
        }

        public Criteria andPRINT_NUMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRINT_NUM not between", value1, value2, "PRINT_NUM");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SIsNull() {
            addCriterion("SAMPLE_MAP_S is null");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SIsNotNull() {
            addCriterion("SAMPLE_MAP_S is not null");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SEqualTo(String value) {
            addCriterion("SAMPLE_MAP_S =", value, "SAMPLE_MAP_S");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SNotEqualTo(String value) {
            addCriterion("SAMPLE_MAP_S <>", value, "SAMPLE_MAP_S");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SGreaterThan(String value) {
            addCriterion("SAMPLE_MAP_S >", value, "SAMPLE_MAP_S");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_MAP_S >=", value, "SAMPLE_MAP_S");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SLessThan(String value) {
            addCriterion("SAMPLE_MAP_S <", value, "SAMPLE_MAP_S");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_MAP_S <=", value, "SAMPLE_MAP_S");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SLike(String value) {
            addCriterion("SAMPLE_MAP_S like", value, "SAMPLE_MAP_S");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SNotLike(String value) {
            addCriterion("SAMPLE_MAP_S not like", value, "SAMPLE_MAP_S");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SIn(List<String> values) {
            addCriterion("SAMPLE_MAP_S in", values, "SAMPLE_MAP_S");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SNotIn(List<String> values) {
            addCriterion("SAMPLE_MAP_S not in", values, "SAMPLE_MAP_S");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SBetween(String value1, String value2) {
            addCriterion("SAMPLE_MAP_S between", value1, value2, "SAMPLE_MAP_S");
            return (Criteria) this;
        }

        public Criteria andSAMPLE_MAP_SNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_MAP_S not between", value1, value2, "SAMPLE_MAP_S");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SIsNull() {
            addCriterion("MODEL_FILE_S is null");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SIsNotNull() {
            addCriterion("MODEL_FILE_S is not null");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SEqualTo(String value) {
            addCriterion("MODEL_FILE_S =", value, "MODEL_FILE_S");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SNotEqualTo(String value) {
            addCriterion("MODEL_FILE_S <>", value, "MODEL_FILE_S");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SGreaterThan(String value) {
            addCriterion("MODEL_FILE_S >", value, "MODEL_FILE_S");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_FILE_S >=", value, "MODEL_FILE_S");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SLessThan(String value) {
            addCriterion("MODEL_FILE_S <", value, "MODEL_FILE_S");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SLessThanOrEqualTo(String value) {
            addCriterion("MODEL_FILE_S <=", value, "MODEL_FILE_S");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SLike(String value) {
            addCriterion("MODEL_FILE_S like", value, "MODEL_FILE_S");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SNotLike(String value) {
            addCriterion("MODEL_FILE_S not like", value, "MODEL_FILE_S");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SIn(List<String> values) {
            addCriterion("MODEL_FILE_S in", values, "MODEL_FILE_S");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SNotIn(List<String> values) {
            addCriterion("MODEL_FILE_S not in", values, "MODEL_FILE_S");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SBetween(String value1, String value2) {
            addCriterion("MODEL_FILE_S between", value1, value2, "MODEL_FILE_S");
            return (Criteria) this;
        }

        public Criteria andMODEL_FILE_SNotBetween(String value1, String value2) {
            addCriterion("MODEL_FILE_S not between", value1, value2, "MODEL_FILE_S");
            return (Criteria) this;
        }

        public Criteria andLABEL_LENGTHIsNull() {
            addCriterion("LABEL_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andLABEL_LENGTHIsNotNull() {
            addCriterion("LABEL_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andLABEL_LENGTHEqualTo(BigDecimal value) {
            addCriterion("LABEL_LENGTH =", value, "LABEL_LENGTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_LENGTHNotEqualTo(BigDecimal value) {
            addCriterion("LABEL_LENGTH <>", value, "LABEL_LENGTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_LENGTHGreaterThan(BigDecimal value) {
            addCriterion("LABEL_LENGTH >", value, "LABEL_LENGTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_LENGTHGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LABEL_LENGTH >=", value, "LABEL_LENGTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_LENGTHLessThan(BigDecimal value) {
            addCriterion("LABEL_LENGTH <", value, "LABEL_LENGTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_LENGTHLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LABEL_LENGTH <=", value, "LABEL_LENGTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_LENGTHIn(List<BigDecimal> values) {
            addCriterion("LABEL_LENGTH in", values, "LABEL_LENGTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_LENGTHNotIn(List<BigDecimal> values) {
            addCriterion("LABEL_LENGTH not in", values, "LABEL_LENGTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_LENGTHBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LABEL_LENGTH between", value1, value2, "LABEL_LENGTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_LENGTHNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LABEL_LENGTH not between", value1, value2, "LABEL_LENGTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_WIDTHIsNull() {
            addCriterion("LABEL_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andLABEL_WIDTHIsNotNull() {
            addCriterion("LABEL_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andLABEL_WIDTHEqualTo(BigDecimal value) {
            addCriterion("LABEL_WIDTH =", value, "LABEL_WIDTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_WIDTHNotEqualTo(BigDecimal value) {
            addCriterion("LABEL_WIDTH <>", value, "LABEL_WIDTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_WIDTHGreaterThan(BigDecimal value) {
            addCriterion("LABEL_WIDTH >", value, "LABEL_WIDTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_WIDTHGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LABEL_WIDTH >=", value, "LABEL_WIDTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_WIDTHLessThan(BigDecimal value) {
            addCriterion("LABEL_WIDTH <", value, "LABEL_WIDTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_WIDTHLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LABEL_WIDTH <=", value, "LABEL_WIDTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_WIDTHIn(List<BigDecimal> values) {
            addCriterion("LABEL_WIDTH in", values, "LABEL_WIDTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_WIDTHNotIn(List<BigDecimal> values) {
            addCriterion("LABEL_WIDTH not in", values, "LABEL_WIDTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_WIDTHBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LABEL_WIDTH between", value1, value2, "LABEL_WIDTH");
            return (Criteria) this;
        }

        public Criteria andLABEL_WIDTHNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LABEL_WIDTH not between", value1, value2, "LABEL_WIDTH");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITIsNull() {
            addCriterion("SIZE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITIsNotNull() {
            addCriterion("SIZE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITEqualTo(String value) {
            addCriterion("SIZE_UNIT =", value, "SIZE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITNotEqualTo(String value) {
            addCriterion("SIZE_UNIT <>", value, "SIZE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITGreaterThan(String value) {
            addCriterion("SIZE_UNIT >", value, "SIZE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITGreaterThanOrEqualTo(String value) {
            addCriterion("SIZE_UNIT >=", value, "SIZE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITLessThan(String value) {
            addCriterion("SIZE_UNIT <", value, "SIZE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITLessThanOrEqualTo(String value) {
            addCriterion("SIZE_UNIT <=", value, "SIZE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITLike(String value) {
            addCriterion("SIZE_UNIT like", value, "SIZE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITNotLike(String value) {
            addCriterion("SIZE_UNIT not like", value, "SIZE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITIn(List<String> values) {
            addCriterion("SIZE_UNIT in", values, "SIZE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITNotIn(List<String> values) {
            addCriterion("SIZE_UNIT not in", values, "SIZE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITBetween(String value1, String value2) {
            addCriterion("SIZE_UNIT between", value1, value2, "SIZE_UNIT");
            return (Criteria) this;
        }

        public Criteria andSIZE_UNITNotBetween(String value1, String value2) {
            addCriterion("SIZE_UNIT not between", value1, value2, "SIZE_UNIT");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGIsNull() {
            addCriterion("BOX_LABEL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGIsNotNull() {
            addCriterion("BOX_LABEL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGEqualTo(String value) {
            addCriterion("BOX_LABEL_FLAG =", value, "BOX_LABEL_FLAG");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGNotEqualTo(String value) {
            addCriterion("BOX_LABEL_FLAG <>", value, "BOX_LABEL_FLAG");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGGreaterThan(String value) {
            addCriterion("BOX_LABEL_FLAG >", value, "BOX_LABEL_FLAG");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("BOX_LABEL_FLAG >=", value, "BOX_LABEL_FLAG");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGLessThan(String value) {
            addCriterion("BOX_LABEL_FLAG <", value, "BOX_LABEL_FLAG");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGLessThanOrEqualTo(String value) {
            addCriterion("BOX_LABEL_FLAG <=", value, "BOX_LABEL_FLAG");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGLike(String value) {
            addCriterion("BOX_LABEL_FLAG like", value, "BOX_LABEL_FLAG");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGNotLike(String value) {
            addCriterion("BOX_LABEL_FLAG not like", value, "BOX_LABEL_FLAG");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGIn(List<String> values) {
            addCriterion("BOX_LABEL_FLAG in", values, "BOX_LABEL_FLAG");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGNotIn(List<String> values) {
            addCriterion("BOX_LABEL_FLAG not in", values, "BOX_LABEL_FLAG");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGBetween(String value1, String value2) {
            addCriterion("BOX_LABEL_FLAG between", value1, value2, "BOX_LABEL_FLAG");
            return (Criteria) this;
        }

        public Criteria andBOX_LABEL_FLAGNotBetween(String value1, String value2) {
            addCriterion("BOX_LABEL_FLAG not between", value1, value2, "BOX_LABEL_FLAG");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTIsNull() {
            addCriterion("ALLOW_REPRINT is null");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTIsNotNull() {
            addCriterion("ALLOW_REPRINT is not null");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTEqualTo(String value) {
            addCriterion("ALLOW_REPRINT =", value, "ALLOW_REPRINT");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTNotEqualTo(String value) {
            addCriterion("ALLOW_REPRINT <>", value, "ALLOW_REPRINT");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTGreaterThan(String value) {
            addCriterion("ALLOW_REPRINT >", value, "ALLOW_REPRINT");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_REPRINT >=", value, "ALLOW_REPRINT");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTLessThan(String value) {
            addCriterion("ALLOW_REPRINT <", value, "ALLOW_REPRINT");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_REPRINT <=", value, "ALLOW_REPRINT");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTLike(String value) {
            addCriterion("ALLOW_REPRINT like", value, "ALLOW_REPRINT");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTNotLike(String value) {
            addCriterion("ALLOW_REPRINT not like", value, "ALLOW_REPRINT");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTIn(List<String> values) {
            addCriterion("ALLOW_REPRINT in", values, "ALLOW_REPRINT");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTNotIn(List<String> values) {
            addCriterion("ALLOW_REPRINT not in", values, "ALLOW_REPRINT");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTBetween(String value1, String value2) {
            addCriterion("ALLOW_REPRINT between", value1, value2, "ALLOW_REPRINT");
            return (Criteria) this;
        }

        public Criteria andALLOW_REPRINTNotBetween(String value1, String value2) {
            addCriterion("ALLOW_REPRINT not between", value1, value2, "ALLOW_REPRINT");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESIsNull() {
            addCriterion("ALLOW_EDIT_COPIES is null");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESIsNotNull() {
            addCriterion("ALLOW_EDIT_COPIES is not null");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESEqualTo(String value) {
            addCriterion("ALLOW_EDIT_COPIES =", value, "ALLOW_EDIT_COPIES");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESNotEqualTo(String value) {
            addCriterion("ALLOW_EDIT_COPIES <>", value, "ALLOW_EDIT_COPIES");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESGreaterThan(String value) {
            addCriterion("ALLOW_EDIT_COPIES >", value, "ALLOW_EDIT_COPIES");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_EDIT_COPIES >=", value, "ALLOW_EDIT_COPIES");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESLessThan(String value) {
            addCriterion("ALLOW_EDIT_COPIES <", value, "ALLOW_EDIT_COPIES");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_EDIT_COPIES <=", value, "ALLOW_EDIT_COPIES");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESLike(String value) {
            addCriterion("ALLOW_EDIT_COPIES like", value, "ALLOW_EDIT_COPIES");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESNotLike(String value) {
            addCriterion("ALLOW_EDIT_COPIES not like", value, "ALLOW_EDIT_COPIES");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESIn(List<String> values) {
            addCriterion("ALLOW_EDIT_COPIES in", values, "ALLOW_EDIT_COPIES");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESNotIn(List<String> values) {
            addCriterion("ALLOW_EDIT_COPIES not in", values, "ALLOW_EDIT_COPIES");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESBetween(String value1, String value2) {
            addCriterion("ALLOW_EDIT_COPIES between", value1, value2, "ALLOW_EDIT_COPIES");
            return (Criteria) this;
        }

        public Criteria andALLOW_EDIT_COPIESNotBetween(String value1, String value2) {
            addCriterion("ALLOW_EDIT_COPIES not between", value1, value2, "ALLOW_EDIT_COPIES");
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