package com.supermarket.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
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
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
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

        public Criteria andProNameIsNull() {
            addCriterion("ProName is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("ProName is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("ProName =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("ProName <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("ProName >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("ProName >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("ProName <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("ProName <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("ProName like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("ProName not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("ProName in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("ProName not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("ProName between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("ProName not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProShelfIsNull() {
            addCriterion("ProShelf is null");
            return (Criteria) this;
        }

        public Criteria andProShelfIsNotNull() {
            addCriterion("ProShelf is not null");
            return (Criteria) this;
        }

        public Criteria andProShelfEqualTo(String value) {
            addCriterion("ProShelf =", value, "proShelf");
            return (Criteria) this;
        }

        public Criteria andProShelfNotEqualTo(String value) {
            addCriterion("ProShelf <>", value, "proShelf");
            return (Criteria) this;
        }

        public Criteria andProShelfGreaterThan(String value) {
            addCriterion("ProShelf >", value, "proShelf");
            return (Criteria) this;
        }

        public Criteria andProShelfGreaterThanOrEqualTo(String value) {
            addCriterion("ProShelf >=", value, "proShelf");
            return (Criteria) this;
        }

        public Criteria andProShelfLessThan(String value) {
            addCriterion("ProShelf <", value, "proShelf");
            return (Criteria) this;
        }

        public Criteria andProShelfLessThanOrEqualTo(String value) {
            addCriterion("ProShelf <=", value, "proShelf");
            return (Criteria) this;
        }

        public Criteria andProShelfLike(String value) {
            addCriterion("ProShelf like", value, "proShelf");
            return (Criteria) this;
        }

        public Criteria andProShelfNotLike(String value) {
            addCriterion("ProShelf not like", value, "proShelf");
            return (Criteria) this;
        }

        public Criteria andProShelfIn(List<String> values) {
            addCriterion("ProShelf in", values, "proShelf");
            return (Criteria) this;
        }

        public Criteria andProShelfNotIn(List<String> values) {
            addCriterion("ProShelf not in", values, "proShelf");
            return (Criteria) this;
        }

        public Criteria andProShelfBetween(String value1, String value2) {
            addCriterion("ProShelf between", value1, value2, "proShelf");
            return (Criteria) this;
        }

        public Criteria andProShelfNotBetween(String value1, String value2) {
            addCriterion("ProShelf not between", value1, value2, "proShelf");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNull() {
            addCriterion("ProPrice is null");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNotNull() {
            addCriterion("ProPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProPriceEqualTo(BigDecimal value) {
            addCriterion("ProPrice =", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotEqualTo(BigDecimal value) {
            addCriterion("ProPrice <>", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThan(BigDecimal value) {
            addCriterion("ProPrice >", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ProPrice >=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThan(BigDecimal value) {
            addCriterion("ProPrice <", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ProPrice <=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceIn(List<BigDecimal> values) {
            addCriterion("ProPrice in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotIn(List<BigDecimal> values) {
            addCriterion("ProPrice not in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProPrice between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ProPrice not between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProSizeIsNull() {
            addCriterion("ProSize is null");
            return (Criteria) this;
        }

        public Criteria andProSizeIsNotNull() {
            addCriterion("ProSize is not null");
            return (Criteria) this;
        }

        public Criteria andProSizeEqualTo(String value) {
            addCriterion("ProSize =", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeNotEqualTo(String value) {
            addCriterion("ProSize <>", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeGreaterThan(String value) {
            addCriterion("ProSize >", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeGreaterThanOrEqualTo(String value) {
            addCriterion("ProSize >=", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeLessThan(String value) {
            addCriterion("ProSize <", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeLessThanOrEqualTo(String value) {
            addCriterion("ProSize <=", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeLike(String value) {
            addCriterion("ProSize like", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeNotLike(String value) {
            addCriterion("ProSize not like", value, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeIn(List<String> values) {
            addCriterion("ProSize in", values, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeNotIn(List<String> values) {
            addCriterion("ProSize not in", values, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeBetween(String value1, String value2) {
            addCriterion("ProSize between", value1, value2, "proSize");
            return (Criteria) this;
        }

        public Criteria andProSizeNotBetween(String value1, String value2) {
            addCriterion("ProSize not between", value1, value2, "proSize");
            return (Criteria) this;
        }

        public Criteria andProCatagoryIsNull() {
            addCriterion("ProCatagory is null");
            return (Criteria) this;
        }

        public Criteria andProCatagoryIsNotNull() {
            addCriterion("ProCatagory is not null");
            return (Criteria) this;
        }

        public Criteria andProCatagoryEqualTo(String value) {
            addCriterion("ProCatagory =", value, "proCatagory");
            return (Criteria) this;
        }

        public Criteria andProCatagoryNotEqualTo(String value) {
            addCriterion("ProCatagory <>", value, "proCatagory");
            return (Criteria) this;
        }

        public Criteria andProCatagoryGreaterThan(String value) {
            addCriterion("ProCatagory >", value, "proCatagory");
            return (Criteria) this;
        }

        public Criteria andProCatagoryGreaterThanOrEqualTo(String value) {
            addCriterion("ProCatagory >=", value, "proCatagory");
            return (Criteria) this;
        }

        public Criteria andProCatagoryLessThan(String value) {
            addCriterion("ProCatagory <", value, "proCatagory");
            return (Criteria) this;
        }

        public Criteria andProCatagoryLessThanOrEqualTo(String value) {
            addCriterion("ProCatagory <=", value, "proCatagory");
            return (Criteria) this;
        }

        public Criteria andProCatagoryLike(String value) {
            addCriterion("ProCatagory like", value, "proCatagory");
            return (Criteria) this;
        }

        public Criteria andProCatagoryNotLike(String value) {
            addCriterion("ProCatagory not like", value, "proCatagory");
            return (Criteria) this;
        }

        public Criteria andProCatagoryIn(List<String> values) {
            addCriterion("ProCatagory in", values, "proCatagory");
            return (Criteria) this;
        }

        public Criteria andProCatagoryNotIn(List<String> values) {
            addCriterion("ProCatagory not in", values, "proCatagory");
            return (Criteria) this;
        }

        public Criteria andProCatagoryBetween(String value1, String value2) {
            addCriterion("ProCatagory between", value1, value2, "proCatagory");
            return (Criteria) this;
        }

        public Criteria andProCatagoryNotBetween(String value1, String value2) {
            addCriterion("ProCatagory not between", value1, value2, "proCatagory");
            return (Criteria) this;
        }

        public Criteria andSalesDayIsNull() {
            addCriterion("SalesDay is null");
            return (Criteria) this;
        }

        public Criteria andSalesDayIsNotNull() {
            addCriterion("SalesDay is not null");
            return (Criteria) this;
        }

        public Criteria andSalesDayEqualTo(Integer value) {
            addCriterion("SalesDay =", value, "salesDay");
            return (Criteria) this;
        }

        public Criteria andSalesDayNotEqualTo(Integer value) {
            addCriterion("SalesDay <>", value, "salesDay");
            return (Criteria) this;
        }

        public Criteria andSalesDayGreaterThan(Integer value) {
            addCriterion("SalesDay >", value, "salesDay");
            return (Criteria) this;
        }

        public Criteria andSalesDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("SalesDay >=", value, "salesDay");
            return (Criteria) this;
        }

        public Criteria andSalesDayLessThan(Integer value) {
            addCriterion("SalesDay <", value, "salesDay");
            return (Criteria) this;
        }

        public Criteria andSalesDayLessThanOrEqualTo(Integer value) {
            addCriterion("SalesDay <=", value, "salesDay");
            return (Criteria) this;
        }

        public Criteria andSalesDayIn(List<Integer> values) {
            addCriterion("SalesDay in", values, "salesDay");
            return (Criteria) this;
        }

        public Criteria andSalesDayNotIn(List<Integer> values) {
            addCriterion("SalesDay not in", values, "salesDay");
            return (Criteria) this;
        }

        public Criteria andSalesDayBetween(Integer value1, Integer value2) {
            addCriterion("SalesDay between", value1, value2, "salesDay");
            return (Criteria) this;
        }

        public Criteria andSalesDayNotBetween(Integer value1, Integer value2) {
            addCriterion("SalesDay not between", value1, value2, "salesDay");
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

        public Criteria andSafeStockIsNull() {
            addCriterion("SafeStock is null");
            return (Criteria) this;
        }

        public Criteria andSafeStockIsNotNull() {
            addCriterion("SafeStock is not null");
            return (Criteria) this;
        }

        public Criteria andSafeStockEqualTo(Integer value) {
            addCriterion("SafeStock =", value, "safeStock");
            return (Criteria) this;
        }

        public Criteria andSafeStockNotEqualTo(Integer value) {
            addCriterion("SafeStock <>", value, "safeStock");
            return (Criteria) this;
        }

        public Criteria andSafeStockGreaterThan(Integer value) {
            addCriterion("SafeStock >", value, "safeStock");
            return (Criteria) this;
        }

        public Criteria andSafeStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("SafeStock >=", value, "safeStock");
            return (Criteria) this;
        }

        public Criteria andSafeStockLessThan(Integer value) {
            addCriterion("SafeStock <", value, "safeStock");
            return (Criteria) this;
        }

        public Criteria andSafeStockLessThanOrEqualTo(Integer value) {
            addCriterion("SafeStock <=", value, "safeStock");
            return (Criteria) this;
        }

        public Criteria andSafeStockIn(List<Integer> values) {
            addCriterion("SafeStock in", values, "safeStock");
            return (Criteria) this;
        }

        public Criteria andSafeStockNotIn(List<Integer> values) {
            addCriterion("SafeStock not in", values, "safeStock");
            return (Criteria) this;
        }

        public Criteria andSafeStockBetween(Integer value1, Integer value2) {
            addCriterion("SafeStock between", value1, value2, "safeStock");
            return (Criteria) this;
        }

        public Criteria andSafeStockNotBetween(Integer value1, Integer value2) {
            addCriterion("SafeStock not between", value1, value2, "safeStock");
            return (Criteria) this;
        }

        public Criteria andProNameLikeInsensitive(String value) {
            addCriterion("upper(ProName) like", value.toUpperCase(), "proName");
            return (Criteria) this;
        }

        public Criteria andProShelfLikeInsensitive(String value) {
            addCriterion("upper(ProShelf) like", value.toUpperCase(), "proShelf");
            return (Criteria) this;
        }

        public Criteria andProSizeLikeInsensitive(String value) {
            addCriterion("upper(ProSize) like", value.toUpperCase(), "proSize");
            return (Criteria) this;
        }

        public Criteria andProCatagoryLikeInsensitive(String value) {
            addCriterion("upper(ProCatagory) like", value.toUpperCase(), "proCatagory");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 27 15:10:53 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
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