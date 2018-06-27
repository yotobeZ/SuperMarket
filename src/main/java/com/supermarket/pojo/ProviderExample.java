package com.supermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProviderExample {
    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    public ProviderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
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
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
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

        public Criteria andProvideNameIsNull() {
            addCriterion("ProvideName is null");
            return (Criteria) this;
        }

        public Criteria andProvideNameIsNotNull() {
            addCriterion("ProvideName is not null");
            return (Criteria) this;
        }

        public Criteria andProvideNameEqualTo(String value) {
            addCriterion("ProvideName =", value, "provideName");
            return (Criteria) this;
        }

        public Criteria andProvideNameNotEqualTo(String value) {
            addCriterion("ProvideName <>", value, "provideName");
            return (Criteria) this;
        }

        public Criteria andProvideNameGreaterThan(String value) {
            addCriterion("ProvideName >", value, "provideName");
            return (Criteria) this;
        }

        public Criteria andProvideNameGreaterThanOrEqualTo(String value) {
            addCriterion("ProvideName >=", value, "provideName");
            return (Criteria) this;
        }

        public Criteria andProvideNameLessThan(String value) {
            addCriterion("ProvideName <", value, "provideName");
            return (Criteria) this;
        }

        public Criteria andProvideNameLessThanOrEqualTo(String value) {
            addCriterion("ProvideName <=", value, "provideName");
            return (Criteria) this;
        }

        public Criteria andProvideNameLike(String value) {
            addCriterion("ProvideName like", value, "provideName");
            return (Criteria) this;
        }

        public Criteria andProvideNameNotLike(String value) {
            addCriterion("ProvideName not like", value, "provideName");
            return (Criteria) this;
        }

        public Criteria andProvideNameIn(List<String> values) {
            addCriterion("ProvideName in", values, "provideName");
            return (Criteria) this;
        }

        public Criteria andProvideNameNotIn(List<String> values) {
            addCriterion("ProvideName not in", values, "provideName");
            return (Criteria) this;
        }

        public Criteria andProvideNameBetween(String value1, String value2) {
            addCriterion("ProvideName between", value1, value2, "provideName");
            return (Criteria) this;
        }

        public Criteria andProvideNameNotBetween(String value1, String value2) {
            addCriterion("ProvideName not between", value1, value2, "provideName");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("Contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("Contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("Contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("Contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("Contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("Contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("Contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("Contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("Contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("Contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("Contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("Contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("Contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("Contact not between", value1, value2, "contact");
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

        public Criteria andProvideAddIsNull() {
            addCriterion("ProvideAdd is null");
            return (Criteria) this;
        }

        public Criteria andProvideAddIsNotNull() {
            addCriterion("ProvideAdd is not null");
            return (Criteria) this;
        }

        public Criteria andProvideAddEqualTo(String value) {
            addCriterion("ProvideAdd =", value, "provideAdd");
            return (Criteria) this;
        }

        public Criteria andProvideAddNotEqualTo(String value) {
            addCriterion("ProvideAdd <>", value, "provideAdd");
            return (Criteria) this;
        }

        public Criteria andProvideAddGreaterThan(String value) {
            addCriterion("ProvideAdd >", value, "provideAdd");
            return (Criteria) this;
        }

        public Criteria andProvideAddGreaterThanOrEqualTo(String value) {
            addCriterion("ProvideAdd >=", value, "provideAdd");
            return (Criteria) this;
        }

        public Criteria andProvideAddLessThan(String value) {
            addCriterion("ProvideAdd <", value, "provideAdd");
            return (Criteria) this;
        }

        public Criteria andProvideAddLessThanOrEqualTo(String value) {
            addCriterion("ProvideAdd <=", value, "provideAdd");
            return (Criteria) this;
        }

        public Criteria andProvideAddLike(String value) {
            addCriterion("ProvideAdd like", value, "provideAdd");
            return (Criteria) this;
        }

        public Criteria andProvideAddNotLike(String value) {
            addCriterion("ProvideAdd not like", value, "provideAdd");
            return (Criteria) this;
        }

        public Criteria andProvideAddIn(List<String> values) {
            addCriterion("ProvideAdd in", values, "provideAdd");
            return (Criteria) this;
        }

        public Criteria andProvideAddNotIn(List<String> values) {
            addCriterion("ProvideAdd not in", values, "provideAdd");
            return (Criteria) this;
        }

        public Criteria andProvideAddBetween(String value1, String value2) {
            addCriterion("ProvideAdd between", value1, value2, "provideAdd");
            return (Criteria) this;
        }

        public Criteria andProvideAddNotBetween(String value1, String value2) {
            addCriterion("ProvideAdd not between", value1, value2, "provideAdd");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("Account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("Account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(Integer value) {
            addCriterion("Account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(Integer value) {
            addCriterion("Account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(Integer value) {
            addCriterion("Account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(Integer value) {
            addCriterion("Account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(Integer value) {
            addCriterion("Account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<Integer> values) {
            addCriterion("Account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<Integer> values) {
            addCriterion("Account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(Integer value1, Integer value2) {
            addCriterion("Account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("Account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andProviderankIsNull() {
            addCriterion("Providerank is null");
            return (Criteria) this;
        }

        public Criteria andProviderankIsNotNull() {
            addCriterion("Providerank is not null");
            return (Criteria) this;
        }

        public Criteria andProviderankEqualTo(Integer value) {
            addCriterion("Providerank =", value, "providerank");
            return (Criteria) this;
        }

        public Criteria andProviderankNotEqualTo(Integer value) {
            addCriterion("Providerank <>", value, "providerank");
            return (Criteria) this;
        }

        public Criteria andProviderankGreaterThan(Integer value) {
            addCriterion("Providerank >", value, "providerank");
            return (Criteria) this;
        }

        public Criteria andProviderankGreaterThanOrEqualTo(Integer value) {
            addCriterion("Providerank >=", value, "providerank");
            return (Criteria) this;
        }

        public Criteria andProviderankLessThan(Integer value) {
            addCriterion("Providerank <", value, "providerank");
            return (Criteria) this;
        }

        public Criteria andProviderankLessThanOrEqualTo(Integer value) {
            addCriterion("Providerank <=", value, "providerank");
            return (Criteria) this;
        }

        public Criteria andProviderankIn(List<Integer> values) {
            addCriterion("Providerank in", values, "providerank");
            return (Criteria) this;
        }

        public Criteria andProviderankNotIn(List<Integer> values) {
            addCriterion("Providerank not in", values, "providerank");
            return (Criteria) this;
        }

        public Criteria andProviderankBetween(Integer value1, Integer value2) {
            addCriterion("Providerank between", value1, value2, "providerank");
            return (Criteria) this;
        }

        public Criteria andProviderankNotBetween(Integer value1, Integer value2) {
            addCriterion("Providerank not between", value1, value2, "providerank");
            return (Criteria) this;
        }

        public Criteria andProvideNameLikeInsensitive(String value) {
            addCriterion("upper(ProvideName) like", value.toUpperCase(), "provideName");
            return (Criteria) this;
        }

        public Criteria andContactLikeInsensitive(String value) {
            addCriterion("upper(Contact) like", value.toUpperCase(), "contact");
            return (Criteria) this;
        }

        public Criteria andProvideAddLikeInsensitive(String value) {
            addCriterion("upper(ProvideAdd) like", value.toUpperCase(), "provideAdd");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 27 15:11:28 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:11:28 CST 2018
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