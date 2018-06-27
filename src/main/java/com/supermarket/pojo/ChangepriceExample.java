package com.supermarket.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChangepriceExample {
    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public ChangepriceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
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
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
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

        public Criteria andOldImpPriceIsNull() {
            addCriterion("OldImpPrice is null");
            return (Criteria) this;
        }

        public Criteria andOldImpPriceIsNotNull() {
            addCriterion("OldImpPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOldImpPriceEqualTo(BigDecimal value) {
            addCriterion("OldImpPrice =", value, "oldImpPrice");
            return (Criteria) this;
        }

        public Criteria andOldImpPriceNotEqualTo(BigDecimal value) {
            addCriterion("OldImpPrice <>", value, "oldImpPrice");
            return (Criteria) this;
        }

        public Criteria andOldImpPriceGreaterThan(BigDecimal value) {
            addCriterion("OldImpPrice >", value, "oldImpPrice");
            return (Criteria) this;
        }

        public Criteria andOldImpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OldImpPrice >=", value, "oldImpPrice");
            return (Criteria) this;
        }

        public Criteria andOldImpPriceLessThan(BigDecimal value) {
            addCriterion("OldImpPrice <", value, "oldImpPrice");
            return (Criteria) this;
        }

        public Criteria andOldImpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OldImpPrice <=", value, "oldImpPrice");
            return (Criteria) this;
        }

        public Criteria andOldImpPriceIn(List<BigDecimal> values) {
            addCriterion("OldImpPrice in", values, "oldImpPrice");
            return (Criteria) this;
        }

        public Criteria andOldImpPriceNotIn(List<BigDecimal> values) {
            addCriterion("OldImpPrice not in", values, "oldImpPrice");
            return (Criteria) this;
        }

        public Criteria andOldImpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OldImpPrice between", value1, value2, "oldImpPrice");
            return (Criteria) this;
        }

        public Criteria andOldImpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OldImpPrice not between", value1, value2, "oldImpPrice");
            return (Criteria) this;
        }

        public Criteria andNewImpPriceIsNull() {
            addCriterion("NewImpPrice is null");
            return (Criteria) this;
        }

        public Criteria andNewImpPriceIsNotNull() {
            addCriterion("NewImpPrice is not null");
            return (Criteria) this;
        }

        public Criteria andNewImpPriceEqualTo(BigDecimal value) {
            addCriterion("NewImpPrice =", value, "newImpPrice");
            return (Criteria) this;
        }

        public Criteria andNewImpPriceNotEqualTo(BigDecimal value) {
            addCriterion("NewImpPrice <>", value, "newImpPrice");
            return (Criteria) this;
        }

        public Criteria andNewImpPriceGreaterThan(BigDecimal value) {
            addCriterion("NewImpPrice >", value, "newImpPrice");
            return (Criteria) this;
        }

        public Criteria andNewImpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NewImpPrice >=", value, "newImpPrice");
            return (Criteria) this;
        }

        public Criteria andNewImpPriceLessThan(BigDecimal value) {
            addCriterion("NewImpPrice <", value, "newImpPrice");
            return (Criteria) this;
        }

        public Criteria andNewImpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NewImpPrice <=", value, "newImpPrice");
            return (Criteria) this;
        }

        public Criteria andNewImpPriceIn(List<BigDecimal> values) {
            addCriterion("NewImpPrice in", values, "newImpPrice");
            return (Criteria) this;
        }

        public Criteria andNewImpPriceNotIn(List<BigDecimal> values) {
            addCriterion("NewImpPrice not in", values, "newImpPrice");
            return (Criteria) this;
        }

        public Criteria andNewImpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NewImpPrice between", value1, value2, "newImpPrice");
            return (Criteria) this;
        }

        public Criteria andNewImpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NewImpPrice not between", value1, value2, "newImpPrice");
            return (Criteria) this;
        }

        public Criteria andOldSalePriceIsNull() {
            addCriterion("OldSalePrice is null");
            return (Criteria) this;
        }

        public Criteria andOldSalePriceIsNotNull() {
            addCriterion("OldSalePrice is not null");
            return (Criteria) this;
        }

        public Criteria andOldSalePriceEqualTo(BigDecimal value) {
            addCriterion("OldSalePrice =", value, "oldSalePrice");
            return (Criteria) this;
        }

        public Criteria andOldSalePriceNotEqualTo(BigDecimal value) {
            addCriterion("OldSalePrice <>", value, "oldSalePrice");
            return (Criteria) this;
        }

        public Criteria andOldSalePriceGreaterThan(BigDecimal value) {
            addCriterion("OldSalePrice >", value, "oldSalePrice");
            return (Criteria) this;
        }

        public Criteria andOldSalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OldSalePrice >=", value, "oldSalePrice");
            return (Criteria) this;
        }

        public Criteria andOldSalePriceLessThan(BigDecimal value) {
            addCriterion("OldSalePrice <", value, "oldSalePrice");
            return (Criteria) this;
        }

        public Criteria andOldSalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OldSalePrice <=", value, "oldSalePrice");
            return (Criteria) this;
        }

        public Criteria andOldSalePriceIn(List<BigDecimal> values) {
            addCriterion("OldSalePrice in", values, "oldSalePrice");
            return (Criteria) this;
        }

        public Criteria andOldSalePriceNotIn(List<BigDecimal> values) {
            addCriterion("OldSalePrice not in", values, "oldSalePrice");
            return (Criteria) this;
        }

        public Criteria andOldSalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OldSalePrice between", value1, value2, "oldSalePrice");
            return (Criteria) this;
        }

        public Criteria andOldSalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OldSalePrice not between", value1, value2, "oldSalePrice");
            return (Criteria) this;
        }

        public Criteria andNewSalePriceIsNull() {
            addCriterion("NewSalePrice is null");
            return (Criteria) this;
        }

        public Criteria andNewSalePriceIsNotNull() {
            addCriterion("NewSalePrice is not null");
            return (Criteria) this;
        }

        public Criteria andNewSalePriceEqualTo(BigDecimal value) {
            addCriterion("NewSalePrice =", value, "newSalePrice");
            return (Criteria) this;
        }

        public Criteria andNewSalePriceNotEqualTo(BigDecimal value) {
            addCriterion("NewSalePrice <>", value, "newSalePrice");
            return (Criteria) this;
        }

        public Criteria andNewSalePriceGreaterThan(BigDecimal value) {
            addCriterion("NewSalePrice >", value, "newSalePrice");
            return (Criteria) this;
        }

        public Criteria andNewSalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NewSalePrice >=", value, "newSalePrice");
            return (Criteria) this;
        }

        public Criteria andNewSalePriceLessThan(BigDecimal value) {
            addCriterion("NewSalePrice <", value, "newSalePrice");
            return (Criteria) this;
        }

        public Criteria andNewSalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NewSalePrice <=", value, "newSalePrice");
            return (Criteria) this;
        }

        public Criteria andNewSalePriceIn(List<BigDecimal> values) {
            addCriterion("NewSalePrice in", values, "newSalePrice");
            return (Criteria) this;
        }

        public Criteria andNewSalePriceNotIn(List<BigDecimal> values) {
            addCriterion("NewSalePrice not in", values, "newSalePrice");
            return (Criteria) this;
        }

        public Criteria andNewSalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NewSalePrice between", value1, value2, "newSalePrice");
            return (Criteria) this;
        }

        public Criteria andNewSalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NewSalePrice not between", value1, value2, "newSalePrice");
            return (Criteria) this;
        }

        public Criteria andAlterTimeIsNull() {
            addCriterion("AlterTime is null");
            return (Criteria) this;
        }

        public Criteria andAlterTimeIsNotNull() {
            addCriterion("AlterTime is not null");
            return (Criteria) this;
        }

        public Criteria andAlterTimeEqualTo(Date value) {
            addCriterionForJDBCDate("AlterTime =", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("AlterTime <>", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("AlterTime >", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AlterTime >=", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeLessThan(Date value) {
            addCriterionForJDBCDate("AlterTime <", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AlterTime <=", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeIn(List<Date> values) {
            addCriterionForJDBCDate("AlterTime in", values, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("AlterTime not in", values, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AlterTime between", value1, value2, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AlterTime not between", value1, value2, "alterTime");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 27 15:10:05 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
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