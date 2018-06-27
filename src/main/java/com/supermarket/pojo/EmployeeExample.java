package com.supermarket.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeExample {
    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public EmployeeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
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
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
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

        public Criteria andEmIdIsNull() {
            addCriterion("EmId is null");
            return (Criteria) this;
        }

        public Criteria andEmIdIsNotNull() {
            addCriterion("EmId is not null");
            return (Criteria) this;
        }

        public Criteria andEmIdEqualTo(Integer value) {
            addCriterion("EmId =", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdNotEqualTo(Integer value) {
            addCriterion("EmId <>", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdGreaterThan(Integer value) {
            addCriterion("EmId >", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmId >=", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdLessThan(Integer value) {
            addCriterion("EmId <", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdLessThanOrEqualTo(Integer value) {
            addCriterion("EmId <=", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdIn(List<Integer> values) {
            addCriterion("EmId in", values, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdNotIn(List<Integer> values) {
            addCriterion("EmId not in", values, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdBetween(Integer value1, Integer value2) {
            addCriterion("EmId between", value1, value2, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EmId not between", value1, value2, "emId");
            return (Criteria) this;
        }

        public Criteria andEmNameIsNull() {
            addCriterion("EmName is null");
            return (Criteria) this;
        }

        public Criteria andEmNameIsNotNull() {
            addCriterion("EmName is not null");
            return (Criteria) this;
        }

        public Criteria andEmNameEqualTo(String value) {
            addCriterion("EmName =", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotEqualTo(String value) {
            addCriterion("EmName <>", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameGreaterThan(String value) {
            addCriterion("EmName >", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameGreaterThanOrEqualTo(String value) {
            addCriterion("EmName >=", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameLessThan(String value) {
            addCriterion("EmName <", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameLessThanOrEqualTo(String value) {
            addCriterion("EmName <=", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameLike(String value) {
            addCriterion("EmName like", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotLike(String value) {
            addCriterion("EmName not like", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameIn(List<String> values) {
            addCriterion("EmName in", values, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotIn(List<String> values) {
            addCriterion("EmName not in", values, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameBetween(String value1, String value2) {
            addCriterion("EmName between", value1, value2, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotBetween(String value1, String value2) {
            addCriterion("EmName not between", value1, value2, "emName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("Age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("Age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("Age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("Age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("Age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("Age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("Age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("Age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("Age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("Age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("Age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("IdCard is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("IdCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(Integer value) {
            addCriterion("IdCard =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(Integer value) {
            addCriterion("IdCard <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(Integer value) {
            addCriterion("IdCard >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdCard >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(Integer value) {
            addCriterion("IdCard <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(Integer value) {
            addCriterion("IdCard <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<Integer> values) {
            addCriterion("IdCard in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<Integer> values) {
            addCriterion("IdCard not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(Integer value1, Integer value2) {
            addCriterion("IdCard between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(Integer value1, Integer value2) {
            addCriterion("IdCard not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(Integer value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(Integer value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(Integer value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(Integer value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<Integer> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<Integer> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(Integer value1, Integer value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andHireDateIsNull() {
            addCriterion("HireDate is null");
            return (Criteria) this;
        }

        public Criteria andHireDateIsNotNull() {
            addCriterion("HireDate is not null");
            return (Criteria) this;
        }

        public Criteria andHireDateEqualTo(Date value) {
            addCriterionForJDBCDate("HireDate =", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("HireDate <>", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateGreaterThan(Date value) {
            addCriterionForJDBCDate("HireDate >", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HireDate >=", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateLessThan(Date value) {
            addCriterionForJDBCDate("HireDate <", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("HireDate <=", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateIn(List<Date> values) {
            addCriterionForJDBCDate("HireDate in", values, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("HireDate not in", values, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HireDate between", value1, value2, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("HireDate not between", value1, value2, "hireDate");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("Post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("Post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("Post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("Post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("Post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("Post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("Post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("Post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("Post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("Post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("Post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("Post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("Post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("Post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andEmNameLikeInsensitive(String value) {
            addCriterion("upper(EmName) like", value.toUpperCase(), "emName");
            return (Criteria) this;
        }

        public Criteria andSexLikeInsensitive(String value) {
            addCriterion("upper(Sex) like", value.toUpperCase(), "sex");
            return (Criteria) this;
        }

        public Criteria andPostLikeInsensitive(String value) {
            addCriterion("upper(Post) like", value.toUpperCase(), "post");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 27 15:09:37 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
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