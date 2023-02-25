package com.lanhangbao.mysql.ecable.bean;

import java.util.ArrayList;
import java.util.List;

public class Eca_loginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Eca_loginExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andEcalIdIsNull() {
            addCriterion("ecal_id is null");
            return (Criteria) this;
        }

        public Criteria andEcalIdIsNotNull() {
            addCriterion("ecal_id is not null");
            return (Criteria) this;
        }

        public Criteria andEcalIdEqualTo(Integer value) {
            addCriterion("ecal_id =", value, "ecalId");
            return (Criteria) this;
        }

        public Criteria andEcalIdNotEqualTo(Integer value) {
            addCriterion("ecal_id <>", value, "ecalId");
            return (Criteria) this;
        }

        public Criteria andEcalIdGreaterThan(Integer value) {
            addCriterion("ecal_id >", value, "ecalId");
            return (Criteria) this;
        }

        public Criteria andEcalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ecal_id >=", value, "ecalId");
            return (Criteria) this;
        }

        public Criteria andEcalIdLessThan(Integer value) {
            addCriterion("ecal_id <", value, "ecalId");
            return (Criteria) this;
        }

        public Criteria andEcalIdLessThanOrEqualTo(Integer value) {
            addCriterion("ecal_id <=", value, "ecalId");
            return (Criteria) this;
        }

        public Criteria andEcalIdIn(List<Integer> values) {
            addCriterion("ecal_id in", values, "ecalId");
            return (Criteria) this;
        }

        public Criteria andEcalIdNotIn(List<Integer> values) {
            addCriterion("ecal_id not in", values, "ecalId");
            return (Criteria) this;
        }

        public Criteria andEcalIdBetween(Integer value1, Integer value2) {
            addCriterion("ecal_id between", value1, value2, "ecalId");
            return (Criteria) this;
        }

        public Criteria andEcalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ecal_id not between", value1, value2, "ecalId");
            return (Criteria) this;
        }

        public Criteria andEcaIdIsNull() {
            addCriterion("eca_id is null");
            return (Criteria) this;
        }

        public Criteria andEcaIdIsNotNull() {
            addCriterion("eca_id is not null");
            return (Criteria) this;
        }

        public Criteria andEcaIdEqualTo(Integer value) {
            addCriterion("eca_id =", value, "ecaId");
            return (Criteria) this;
        }

        public Criteria andEcaIdNotEqualTo(Integer value) {
            addCriterion("eca_id <>", value, "ecaId");
            return (Criteria) this;
        }

        public Criteria andEcaIdGreaterThan(Integer value) {
            addCriterion("eca_id >", value, "ecaId");
            return (Criteria) this;
        }

        public Criteria andEcaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eca_id >=", value, "ecaId");
            return (Criteria) this;
        }

        public Criteria andEcaIdLessThan(Integer value) {
            addCriterion("eca_id <", value, "ecaId");
            return (Criteria) this;
        }

        public Criteria andEcaIdLessThanOrEqualTo(Integer value) {
            addCriterion("eca_id <=", value, "ecaId");
            return (Criteria) this;
        }

        public Criteria andEcaIdIn(List<Integer> values) {
            addCriterion("eca_id in", values, "ecaId");
            return (Criteria) this;
        }

        public Criteria andEcaIdNotIn(List<Integer> values) {
            addCriterion("eca_id not in", values, "ecaId");
            return (Criteria) this;
        }

        public Criteria andEcaIdBetween(Integer value1, Integer value2) {
            addCriterion("eca_id between", value1, value2, "ecaId");
            return (Criteria) this;
        }

        public Criteria andEcaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eca_id not between", value1, value2, "ecaId");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("client_type is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("client_type is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(Integer value) {
            addCriterion("client_type =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(Integer value) {
            addCriterion("client_type <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(Integer value) {
            addCriterion("client_type >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_type >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(Integer value) {
            addCriterion("client_type <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(Integer value) {
            addCriterion("client_type <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<Integer> values) {
            addCriterion("client_type in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<Integer> values) {
            addCriterion("client_type not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(Integer value1, Integer value2) {
            addCriterion("client_type between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("client_type not between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNull() {
            addCriterion("login_type is null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNotNull() {
            addCriterion("login_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeEqualTo(Integer value) {
            addCriterion("login_type =", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotEqualTo(Integer value) {
            addCriterion("login_type <>", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThan(Integer value) {
            addCriterion("login_type >", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_type >=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThan(Integer value) {
            addCriterion("login_type <", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThanOrEqualTo(Integer value) {
            addCriterion("login_type <=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIn(List<Integer> values) {
            addCriterion("login_type in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotIn(List<Integer> values) {
            addCriterion("login_type not in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeBetween(Integer value1, Integer value2) {
            addCriterion("login_type between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("login_type not between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andTokenNameIsNull() {
            addCriterion("token_name is null");
            return (Criteria) this;
        }

        public Criteria andTokenNameIsNotNull() {
            addCriterion("token_name is not null");
            return (Criteria) this;
        }

        public Criteria andTokenNameEqualTo(String value) {
            addCriterion("token_name =", value, "tokenName");
            return (Criteria) this;
        }

        public Criteria andTokenNameNotEqualTo(String value) {
            addCriterion("token_name <>", value, "tokenName");
            return (Criteria) this;
        }

        public Criteria andTokenNameGreaterThan(String value) {
            addCriterion("token_name >", value, "tokenName");
            return (Criteria) this;
        }

        public Criteria andTokenNameGreaterThanOrEqualTo(String value) {
            addCriterion("token_name >=", value, "tokenName");
            return (Criteria) this;
        }

        public Criteria andTokenNameLessThan(String value) {
            addCriterion("token_name <", value, "tokenName");
            return (Criteria) this;
        }

        public Criteria andTokenNameLessThanOrEqualTo(String value) {
            addCriterion("token_name <=", value, "tokenName");
            return (Criteria) this;
        }

        public Criteria andTokenNameLike(String value) {
            addCriterion("token_name like", value, "tokenName");
            return (Criteria) this;
        }

        public Criteria andTokenNameNotLike(String value) {
            addCriterion("token_name not like", value, "tokenName");
            return (Criteria) this;
        }

        public Criteria andTokenNameIn(List<String> values) {
            addCriterion("token_name in", values, "tokenName");
            return (Criteria) this;
        }

        public Criteria andTokenNameNotIn(List<String> values) {
            addCriterion("token_name not in", values, "tokenName");
            return (Criteria) this;
        }

        public Criteria andTokenNameBetween(String value1, String value2) {
            addCriterion("token_name between", value1, value2, "tokenName");
            return (Criteria) this;
        }

        public Criteria andTokenNameNotBetween(String value1, String value2) {
            addCriterion("token_name not between", value1, value2, "tokenName");
            return (Criteria) this;
        }

        public Criteria andTokenStringIsNull() {
            addCriterion("token_string is null");
            return (Criteria) this;
        }

        public Criteria andTokenStringIsNotNull() {
            addCriterion("token_string is not null");
            return (Criteria) this;
        }

        public Criteria andTokenStringEqualTo(String value) {
            addCriterion("token_string =", value, "tokenString");
            return (Criteria) this;
        }

        public Criteria andTokenStringNotEqualTo(String value) {
            addCriterion("token_string <>", value, "tokenString");
            return (Criteria) this;
        }

        public Criteria andTokenStringGreaterThan(String value) {
            addCriterion("token_string >", value, "tokenString");
            return (Criteria) this;
        }

        public Criteria andTokenStringGreaterThanOrEqualTo(String value) {
            addCriterion("token_string >=", value, "tokenString");
            return (Criteria) this;
        }

        public Criteria andTokenStringLessThan(String value) {
            addCriterion("token_string <", value, "tokenString");
            return (Criteria) this;
        }

        public Criteria andTokenStringLessThanOrEqualTo(String value) {
            addCriterion("token_string <=", value, "tokenString");
            return (Criteria) this;
        }

        public Criteria andTokenStringLike(String value) {
            addCriterion("token_string like", value, "tokenString");
            return (Criteria) this;
        }

        public Criteria andTokenStringNotLike(String value) {
            addCriterion("token_string not like", value, "tokenString");
            return (Criteria) this;
        }

        public Criteria andTokenStringIn(List<String> values) {
            addCriterion("token_string in", values, "tokenString");
            return (Criteria) this;
        }

        public Criteria andTokenStringNotIn(List<String> values) {
            addCriterion("token_string not in", values, "tokenString");
            return (Criteria) this;
        }

        public Criteria andTokenStringBetween(String value1, String value2) {
            addCriterion("token_string between", value1, value2, "tokenString");
            return (Criteria) this;
        }

        public Criteria andTokenStringNotBetween(String value1, String value2) {
            addCriterion("token_string not between", value1, value2, "tokenString");
            return (Criteria) this;
        }

        public Criteria andPhoneStrIsNull() {
            addCriterion("phone_str is null");
            return (Criteria) this;
        }

        public Criteria andPhoneStrIsNotNull() {
            addCriterion("phone_str is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneStrEqualTo(String value) {
            addCriterion("phone_str =", value, "phoneStr");
            return (Criteria) this;
        }

        public Criteria andPhoneStrNotEqualTo(String value) {
            addCriterion("phone_str <>", value, "phoneStr");
            return (Criteria) this;
        }

        public Criteria andPhoneStrGreaterThan(String value) {
            addCriterion("phone_str >", value, "phoneStr");
            return (Criteria) this;
        }

        public Criteria andPhoneStrGreaterThanOrEqualTo(String value) {
            addCriterion("phone_str >=", value, "phoneStr");
            return (Criteria) this;
        }

        public Criteria andPhoneStrLessThan(String value) {
            addCriterion("phone_str <", value, "phoneStr");
            return (Criteria) this;
        }

        public Criteria andPhoneStrLessThanOrEqualTo(String value) {
            addCriterion("phone_str <=", value, "phoneStr");
            return (Criteria) this;
        }

        public Criteria andPhoneStrLike(String value) {
            addCriterion("phone_str like", value, "phoneStr");
            return (Criteria) this;
        }

        public Criteria andPhoneStrNotLike(String value) {
            addCriterion("phone_str not like", value, "phoneStr");
            return (Criteria) this;
        }

        public Criteria andPhoneStrIn(List<String> values) {
            addCriterion("phone_str in", values, "phoneStr");
            return (Criteria) this;
        }

        public Criteria andPhoneStrNotIn(List<String> values) {
            addCriterion("phone_str not in", values, "phoneStr");
            return (Criteria) this;
        }

        public Criteria andPhoneStrBetween(String value1, String value2) {
            addCriterion("phone_str between", value1, value2, "phoneStr");
            return (Criteria) this;
        }

        public Criteria andPhoneStrNotBetween(String value1, String value2) {
            addCriterion("phone_str not between", value1, value2, "phoneStr");
            return (Criteria) this;
        }

        public Criteria andEffectTimeIsNull() {
            addCriterion("effect_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectTimeIsNotNull() {
            addCriterion("effect_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectTimeEqualTo(Long value) {
            addCriterion("effect_time =", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotEqualTo(Long value) {
            addCriterion("effect_time <>", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeGreaterThan(Long value) {
            addCriterion("effect_time >", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("effect_time >=", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeLessThan(Long value) {
            addCriterion("effect_time <", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeLessThanOrEqualTo(Long value) {
            addCriterion("effect_time <=", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeIn(List<Long> values) {
            addCriterion("effect_time in", values, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotIn(List<Long> values) {
            addCriterion("effect_time not in", values, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeBetween(Long value1, Long value2) {
            addCriterion("effect_time between", value1, value2, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotBetween(Long value1, Long value2) {
            addCriterion("effect_time not between", value1, value2, "effectTime");
            return (Criteria) this;
        }
    }

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