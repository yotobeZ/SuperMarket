package com.supermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserlogExample {
    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public UserlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
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

        public Criteria andLogIdIsNull() {
            addCriterion("LogId is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LogId is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("LogId =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("LogId <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("LogId >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LogId >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("LogId <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("LogId <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("LogId in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("LogId not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("LogId between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LogId not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNull() {
            addCriterion("LogName is null");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNotNull() {
            addCriterion("LogName is not null");
            return (Criteria) this;
        }

        public Criteria andLogNameEqualTo(String value) {
            addCriterion("LogName =", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotEqualTo(String value) {
            addCriterion("LogName <>", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThan(String value) {
            addCriterion("LogName >", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThanOrEqualTo(String value) {
            addCriterion("LogName >=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThan(String value) {
            addCriterion("LogName <", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThanOrEqualTo(String value) {
            addCriterion("LogName <=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLike(String value) {
            addCriterion("LogName like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotLike(String value) {
            addCriterion("LogName not like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameIn(List<String> values) {
            addCriterion("LogName in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotIn(List<String> values) {
            addCriterion("LogName not in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameBetween(String value1, String value2) {
            addCriterion("LogName between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotBetween(String value1, String value2) {
            addCriterion("LogName not between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogPasswordIsNull() {
            addCriterion("LogPassword is null");
            return (Criteria) this;
        }

        public Criteria andLogPasswordIsNotNull() {
            addCriterion("LogPassword is not null");
            return (Criteria) this;
        }

        public Criteria andLogPasswordEqualTo(String value) {
            addCriterion("LogPassword =", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotEqualTo(String value) {
            addCriterion("LogPassword <>", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordGreaterThan(String value) {
            addCriterion("LogPassword >", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("LogPassword >=", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLessThan(String value) {
            addCriterion("LogPassword <", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLessThanOrEqualTo(String value) {
            addCriterion("LogPassword <=", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLike(String value) {
            addCriterion("LogPassword like", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotLike(String value) {
            addCriterion("LogPassword not like", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordIn(List<String> values) {
            addCriterion("LogPassword in", values, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotIn(List<String> values) {
            addCriterion("LogPassword not in", values, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordBetween(String value1, String value2) {
            addCriterion("LogPassword between", value1, value2, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotBetween(String value1, String value2) {
            addCriterion("LogPassword not between", value1, value2, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogLimitIsNull() {
            addCriterion("LogLimit is null");
            return (Criteria) this;
        }

        public Criteria andLogLimitIsNotNull() {
            addCriterion("LogLimit is not null");
            return (Criteria) this;
        }

        public Criteria andLogLimitEqualTo(Integer value) {
            addCriterion("LogLimit =", value, "logLimit");
            return (Criteria) this;
        }

        public Criteria andLogLimitNotEqualTo(Integer value) {
            addCriterion("LogLimit <>", value, "logLimit");
            return (Criteria) this;
        }

        public Criteria andLogLimitGreaterThan(Integer value) {
            addCriterion("LogLimit >", value, "logLimit");
            return (Criteria) this;
        }

        public Criteria andLogLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("LogLimit >=", value, "logLimit");
            return (Criteria) this;
        }

        public Criteria andLogLimitLessThan(Integer value) {
            addCriterion("LogLimit <", value, "logLimit");
            return (Criteria) this;
        }

        public Criteria andLogLimitLessThanOrEqualTo(Integer value) {
            addCriterion("LogLimit <=", value, "logLimit");
            return (Criteria) this;
        }

        public Criteria andLogLimitIn(List<Integer> values) {
            addCriterion("LogLimit in", values, "logLimit");
            return (Criteria) this;
        }

        public Criteria andLogLimitNotIn(List<Integer> values) {
            addCriterion("LogLimit not in", values, "logLimit");
            return (Criteria) this;
        }

        public Criteria andLogLimitBetween(Integer value1, Integer value2) {
            addCriterion("LogLimit between", value1, value2, "logLimit");
            return (Criteria) this;
        }

        public Criteria andLogLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("LogLimit not between", value1, value2, "logLimit");
            return (Criteria) this;
        }

        public Criteria andLogNameLikeInsensitive(String value) {
            addCriterion("upper(LogName) like", value.toUpperCase(), "logName");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLikeInsensitive(String value) {
            addCriterion("upper(LogPassword) like", value.toUpperCase(), "logPassword");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 27 15:16:34 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
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