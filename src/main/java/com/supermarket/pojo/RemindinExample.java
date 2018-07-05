package com.supermarket.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RemindinExample {
    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public RemindinExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
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
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
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

        public Criteria andProIdIsNull() {
            addCriterion("ProId is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("ProId is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("ProId =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("ProId <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("ProId >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProId >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("ProId <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("ProId <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("ProId in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("ProId not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("ProId between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ProId not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andInNumIsNull() {
            addCriterion("InNum is null");
            return (Criteria) this;
        }

        public Criteria andInNumIsNotNull() {
            addCriterion("InNum is not null");
            return (Criteria) this;
        }

        public Criteria andInNumEqualTo(Integer value) {
            addCriterion("InNum =", value, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumNotEqualTo(Integer value) {
            addCriterion("InNum <>", value, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumGreaterThan(Integer value) {
            addCriterion("InNum >", value, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("InNum >=", value, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumLessThan(Integer value) {
            addCriterion("InNum <", value, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumLessThanOrEqualTo(Integer value) {
            addCriterion("InNum <=", value, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumIn(List<Integer> values) {
            addCriterion("InNum in", values, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumNotIn(List<Integer> values) {
            addCriterion("InNum not in", values, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumBetween(Integer value1, Integer value2) {
            addCriterion("InNum between", value1, value2, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumNotBetween(Integer value1, Integer value2) {
            addCriterion("InNum not between", value1, value2, "inNum");
            return (Criteria) this;
        }

        public Criteria andRemDateIsNull() {
            addCriterion("RemDate is null");
            return (Criteria) this;
        }

        public Criteria andRemDateIsNotNull() {
            addCriterion("RemDate is not null");
            return (Criteria) this;
        }

        public Criteria andRemDateEqualTo(Date value) {
            addCriterionForJDBCDate("RemDate =", value, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RemDate <>", value, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateGreaterThan(Date value) {
            addCriterionForJDBCDate("RemDate >", value, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RemDate >=", value, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateLessThan(Date value) {
            addCriterionForJDBCDate("RemDate <", value, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RemDate <=", value, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateIn(List<Date> values) {
            addCriterionForJDBCDate("RemDate in", values, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RemDate not in", values, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RemDate between", value1, value2, "remDate");
            return (Criteria) this;
        }

        public Criteria andRemDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RemDate not between", value1, value2, "remDate");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Thu Jul 05 10:06:15 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
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