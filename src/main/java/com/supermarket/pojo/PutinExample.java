package com.supermarket.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PutinExample {
    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public PutinExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
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
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
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

        public Criteria andImpBillIsNull() {
            addCriterion("ImpBill is null");
            return (Criteria) this;
        }

        public Criteria andImpBillIsNotNull() {
            addCriterion("ImpBill is not null");
            return (Criteria) this;
        }

        public Criteria andImpBillEqualTo(Integer value) {
            addCriterion("ImpBill =", value, "impBill");
            return (Criteria) this;
        }

        public Criteria andImpBillNotEqualTo(Integer value) {
            addCriterion("ImpBill <>", value, "impBill");
            return (Criteria) this;
        }

        public Criteria andImpBillGreaterThan(Integer value) {
            addCriterion("ImpBill >", value, "impBill");
            return (Criteria) this;
        }

        public Criteria andImpBillGreaterThanOrEqualTo(Integer value) {
            addCriterion("ImpBill >=", value, "impBill");
            return (Criteria) this;
        }

        public Criteria andImpBillLessThan(Integer value) {
            addCriterion("ImpBill <", value, "impBill");
            return (Criteria) this;
        }

        public Criteria andImpBillLessThanOrEqualTo(Integer value) {
            addCriterion("ImpBill <=", value, "impBill");
            return (Criteria) this;
        }

        public Criteria andImpBillIn(List<Integer> values) {
            addCriterion("ImpBill in", values, "impBill");
            return (Criteria) this;
        }

        public Criteria andImpBillNotIn(List<Integer> values) {
            addCriterion("ImpBill not in", values, "impBill");
            return (Criteria) this;
        }

        public Criteria andImpBillBetween(Integer value1, Integer value2) {
            addCriterion("ImpBill between", value1, value2, "impBill");
            return (Criteria) this;
        }

        public Criteria andImpBillNotBetween(Integer value1, Integer value2) {
            addCriterion("ImpBill not between", value1, value2, "impBill");
            return (Criteria) this;
        }

        public Criteria andProvideIdIsNull() {
            addCriterion("ProvideId is null");
            return (Criteria) this;
        }

        public Criteria andProvideIdIsNotNull() {
            addCriterion("ProvideId is not null");
            return (Criteria) this;
        }

        public Criteria andProvideIdEqualTo(Integer value) {
            addCriterion("ProvideId =", value, "provideId");
            return (Criteria) this;
        }

        public Criteria andProvideIdNotEqualTo(Integer value) {
            addCriterion("ProvideId <>", value, "provideId");
            return (Criteria) this;
        }

        public Criteria andProvideIdGreaterThan(Integer value) {
            addCriterion("ProvideId >", value, "provideId");
            return (Criteria) this;
        }

        public Criteria andProvideIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProvideId >=", value, "provideId");
            return (Criteria) this;
        }

        public Criteria andProvideIdLessThan(Integer value) {
            addCriterion("ProvideId <", value, "provideId");
            return (Criteria) this;
        }

        public Criteria andProvideIdLessThanOrEqualTo(Integer value) {
            addCriterion("ProvideId <=", value, "provideId");
            return (Criteria) this;
        }

        public Criteria andProvideIdIn(List<Integer> values) {
            addCriterion("ProvideId in", values, "provideId");
            return (Criteria) this;
        }

        public Criteria andProvideIdNotIn(List<Integer> values) {
            addCriterion("ProvideId not in", values, "provideId");
            return (Criteria) this;
        }

        public Criteria andProvideIdBetween(Integer value1, Integer value2) {
            addCriterion("ProvideId between", value1, value2, "provideId");
            return (Criteria) this;
        }

        public Criteria andProvideIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ProvideId not between", value1, value2, "provideId");
            return (Criteria) this;
        }

        public Criteria andProDateIsNull() {
            addCriterion("ProDate is null");
            return (Criteria) this;
        }

        public Criteria andProDateIsNotNull() {
            addCriterion("ProDate is not null");
            return (Criteria) this;
        }

        public Criteria andProDateEqualTo(Date value) {
            addCriterionForJDBCDate("ProDate =", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ProDate <>", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ProDate >", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ProDate >=", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateLessThan(Date value) {
            addCriterionForJDBCDate("ProDate <", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ProDate <=", value, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateIn(List<Date> values) {
            addCriterionForJDBCDate("ProDate in", values, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ProDate not in", values, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ProDate between", value1, value2, "proDate");
            return (Criteria) this;
        }

        public Criteria andProDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ProDate not between", value1, value2, "proDate");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("Num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("Num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("Num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("Num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("Num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("Num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("Num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("Num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("Num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("Num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("Num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andImpPriceIsNull() {
            addCriterion("ImpPrice is null");
            return (Criteria) this;
        }

        public Criteria andImpPriceIsNotNull() {
            addCriterion("ImpPrice is not null");
            return (Criteria) this;
        }

        public Criteria andImpPriceEqualTo(BigDecimal value) {
            addCriterion("ImpPrice =", value, "impPrice");
            return (Criteria) this;
        }

        public Criteria andImpPriceNotEqualTo(BigDecimal value) {
            addCriterion("ImpPrice <>", value, "impPrice");
            return (Criteria) this;
        }

        public Criteria andImpPriceGreaterThan(BigDecimal value) {
            addCriterion("ImpPrice >", value, "impPrice");
            return (Criteria) this;
        }

        public Criteria andImpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ImpPrice >=", value, "impPrice");
            return (Criteria) this;
        }

        public Criteria andImpPriceLessThan(BigDecimal value) {
            addCriterion("ImpPrice <", value, "impPrice");
            return (Criteria) this;
        }

        public Criteria andImpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ImpPrice <=", value, "impPrice");
            return (Criteria) this;
        }

        public Criteria andImpPriceIn(List<BigDecimal> values) {
            addCriterion("ImpPrice in", values, "impPrice");
            return (Criteria) this;
        }

        public Criteria andImpPriceNotIn(List<BigDecimal> values) {
            addCriterion("ImpPrice not in", values, "impPrice");
            return (Criteria) this;
        }

        public Criteria andImpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ImpPrice between", value1, value2, "impPrice");
            return (Criteria) this;
        }

        public Criteria andImpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ImpPrice not between", value1, value2, "impPrice");
            return (Criteria) this;
        }

        public Criteria andImpDateIsNull() {
            addCriterion("ImpDate is null");
            return (Criteria) this;
        }

        public Criteria andImpDateIsNotNull() {
            addCriterion("ImpDate is not null");
            return (Criteria) this;
        }

        public Criteria andImpDateEqualTo(Date value) {
            addCriterionForJDBCDate("ImpDate =", value, "impDate");
            return (Criteria) this;
        }

        public Criteria andImpDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ImpDate <>", value, "impDate");
            return (Criteria) this;
        }

        public Criteria andImpDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ImpDate >", value, "impDate");
            return (Criteria) this;
        }

        public Criteria andImpDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ImpDate >=", value, "impDate");
            return (Criteria) this;
        }

        public Criteria andImpDateLessThan(Date value) {
            addCriterionForJDBCDate("ImpDate <", value, "impDate");
            return (Criteria) this;
        }

        public Criteria andImpDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ImpDate <=", value, "impDate");
            return (Criteria) this;
        }

        public Criteria andImpDateIn(List<Date> values) {
            addCriterionForJDBCDate("ImpDate in", values, "impDate");
            return (Criteria) this;
        }

        public Criteria andImpDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ImpDate not in", values, "impDate");
            return (Criteria) this;
        }

        public Criteria andImpDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ImpDate between", value1, value2, "impDate");
            return (Criteria) this;
        }

        public Criteria andImpDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ImpDate not between", value1, value2, "impDate");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNull() {
            addCriterion("ExpDate is null");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNotNull() {
            addCriterion("ExpDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpDateEqualTo(Date value) {
            addCriterionForJDBCDate("ExpDate =", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ExpDate <>", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ExpDate >", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ExpDate >=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThan(Date value) {
            addCriterionForJDBCDate("ExpDate <", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ExpDate <=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateIn(List<Date> values) {
            addCriterionForJDBCDate("ExpDate in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ExpDate not in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ExpDate between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ExpDate not between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("Operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("Operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("Operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("Operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("Operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("Operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("Operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("Operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("Operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("Operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("Operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("Operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("Operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("Operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLikeInsensitive(String value) {
            addCriterion("upper(Operator) like", value.toUpperCase(), "operator");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 27 15:13:46 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
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