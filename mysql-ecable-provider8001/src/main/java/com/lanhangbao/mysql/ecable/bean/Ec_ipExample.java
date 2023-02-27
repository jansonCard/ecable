package com.lanhangbao.mysql.ecable.bean;

import java.util.ArrayList;
import java.util.List;

public class Ec_ipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ec_ipExample() {
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

        public Criteria andEciIdIsNull() {
            addCriterion("eci_id is null");
            return (Criteria) this;
        }

        public Criteria andEciIdIsNotNull() {
            addCriterion("eci_id is not null");
            return (Criteria) this;
        }

        public Criteria andEciIdEqualTo(Long value) {
            addCriterion("eci_id =", value, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdNotEqualTo(Long value) {
            addCriterion("eci_id <>", value, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdGreaterThan(Long value) {
            addCriterion("eci_id >", value, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdGreaterThanOrEqualTo(Long value) {
            addCriterion("eci_id >=", value, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdLessThan(Long value) {
            addCriterion("eci_id <", value, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdLessThanOrEqualTo(Long value) {
            addCriterion("eci_id <=", value, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdIn(List<Long> values) {
            addCriterion("eci_id in", values, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdNotIn(List<Long> values) {
            addCriterion("eci_id not in", values, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdBetween(Long value1, Long value2) {
            addCriterion("eci_id between", value1, value2, "eciId");
            return (Criteria) this;
        }

        public Criteria andEciIdNotBetween(Long value1, Long value2) {
            addCriterion("eci_id not between", value1, value2, "eciId");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(Long value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(Long value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(Long value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(Long value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(Long value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<Long> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<Long> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(Long value1, Long value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(Long value1, Long value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartNameIsNull() {
            addCriterion("cart_name is null");
            return (Criteria) this;
        }

        public Criteria andCartNameIsNotNull() {
            addCriterion("cart_name is not null");
            return (Criteria) this;
        }

        public Criteria andCartNameEqualTo(String value) {
            addCriterion("cart_name =", value, "cartName");
            return (Criteria) this;
        }

        public Criteria andCartNameNotEqualTo(String value) {
            addCriterion("cart_name <>", value, "cartName");
            return (Criteria) this;
        }

        public Criteria andCartNameGreaterThan(String value) {
            addCriterion("cart_name >", value, "cartName");
            return (Criteria) this;
        }

        public Criteria andCartNameGreaterThanOrEqualTo(String value) {
            addCriterion("cart_name >=", value, "cartName");
            return (Criteria) this;
        }

        public Criteria andCartNameLessThan(String value) {
            addCriterion("cart_name <", value, "cartName");
            return (Criteria) this;
        }

        public Criteria andCartNameLessThanOrEqualTo(String value) {
            addCriterion("cart_name <=", value, "cartName");
            return (Criteria) this;
        }

        public Criteria andCartNameLike(String value) {
            addCriterion("cart_name like", value, "cartName");
            return (Criteria) this;
        }

        public Criteria andCartNameNotLike(String value) {
            addCriterion("cart_name not like", value, "cartName");
            return (Criteria) this;
        }

        public Criteria andCartNameIn(List<String> values) {
            addCriterion("cart_name in", values, "cartName");
            return (Criteria) this;
        }

        public Criteria andCartNameNotIn(List<String> values) {
            addCriterion("cart_name not in", values, "cartName");
            return (Criteria) this;
        }

        public Criteria andCartNameBetween(String value1, String value2) {
            addCriterion("cart_name between", value1, value2, "cartName");
            return (Criteria) this;
        }

        public Criteria andCartNameNotBetween(String value1, String value2) {
            addCriterion("cart_name not between", value1, value2, "cartName");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIsNull() {
            addCriterion("platform_type is null");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIsNotNull() {
            addCriterion("platform_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeEqualTo(Integer value) {
            addCriterion("platform_type =", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotEqualTo(Integer value) {
            addCriterion("platform_type <>", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeGreaterThan(Integer value) {
            addCriterion("platform_type >", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform_type >=", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeLessThan(Integer value) {
            addCriterion("platform_type <", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeLessThanOrEqualTo(Integer value) {
            addCriterion("platform_type <=", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIn(List<Integer> values) {
            addCriterion("platform_type in", values, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotIn(List<Integer> values) {
            addCriterion("platform_type not in", values, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeBetween(Integer value1, Integer value2) {
            addCriterion("platform_type between", value1, value2, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("platform_type not between", value1, value2, "platformType");
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(Long value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(Long value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(Long value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(Long value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(Long value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(Long value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<Long> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<Long> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(Long value1, Long value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(Long value1, Long value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpJsonIsNull() {
            addCriterion("ip_json is null");
            return (Criteria) this;
        }

        public Criteria andIpJsonIsNotNull() {
            addCriterion("ip_json is not null");
            return (Criteria) this;
        }

        public Criteria andIpJsonEqualTo(String value) {
            addCriterion("ip_json =", value, "ipJson");
            return (Criteria) this;
        }

        public Criteria andIpJsonNotEqualTo(String value) {
            addCriterion("ip_json <>", value, "ipJson");
            return (Criteria) this;
        }

        public Criteria andIpJsonGreaterThan(String value) {
            addCriterion("ip_json >", value, "ipJson");
            return (Criteria) this;
        }

        public Criteria andIpJsonGreaterThanOrEqualTo(String value) {
            addCriterion("ip_json >=", value, "ipJson");
            return (Criteria) this;
        }

        public Criteria andIpJsonLessThan(String value) {
            addCriterion("ip_json <", value, "ipJson");
            return (Criteria) this;
        }

        public Criteria andIpJsonLessThanOrEqualTo(String value) {
            addCriterion("ip_json <=", value, "ipJson");
            return (Criteria) this;
        }

        public Criteria andIpJsonLike(String value) {
            addCriterion("ip_json like", value, "ipJson");
            return (Criteria) this;
        }

        public Criteria andIpJsonNotLike(String value) {
            addCriterion("ip_json not like", value, "ipJson");
            return (Criteria) this;
        }

        public Criteria andIpJsonIn(List<String> values) {
            addCriterion("ip_json in", values, "ipJson");
            return (Criteria) this;
        }

        public Criteria andIpJsonNotIn(List<String> values) {
            addCriterion("ip_json not in", values, "ipJson");
            return (Criteria) this;
        }

        public Criteria andIpJsonBetween(String value1, String value2) {
            addCriterion("ip_json between", value1, value2, "ipJson");
            return (Criteria) this;
        }

        public Criteria andIpJsonNotBetween(String value1, String value2) {
            addCriterion("ip_json not between", value1, value2, "ipJson");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescIsNull() {
            addCriterion("obtain_ip_desc is null");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescIsNotNull() {
            addCriterion("obtain_ip_desc is not null");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescEqualTo(String value) {
            addCriterion("obtain_ip_desc =", value, "obtainIpDesc");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescNotEqualTo(String value) {
            addCriterion("obtain_ip_desc <>", value, "obtainIpDesc");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescGreaterThan(String value) {
            addCriterion("obtain_ip_desc >", value, "obtainIpDesc");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescGreaterThanOrEqualTo(String value) {
            addCriterion("obtain_ip_desc >=", value, "obtainIpDesc");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescLessThan(String value) {
            addCriterion("obtain_ip_desc <", value, "obtainIpDesc");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescLessThanOrEqualTo(String value) {
            addCriterion("obtain_ip_desc <=", value, "obtainIpDesc");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescLike(String value) {
            addCriterion("obtain_ip_desc like", value, "obtainIpDesc");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescNotLike(String value) {
            addCriterion("obtain_ip_desc not like", value, "obtainIpDesc");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescIn(List<String> values) {
            addCriterion("obtain_ip_desc in", values, "obtainIpDesc");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescNotIn(List<String> values) {
            addCriterion("obtain_ip_desc not in", values, "obtainIpDesc");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescBetween(String value1, String value2) {
            addCriterion("obtain_ip_desc between", value1, value2, "obtainIpDesc");
            return (Criteria) this;
        }

        public Criteria andObtainIpDescNotBetween(String value1, String value2) {
            addCriterion("obtain_ip_desc not between", value1, value2, "obtainIpDesc");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Long value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Long value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Long value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Long value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Long value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Long> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Long> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Long value1, Long value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Long value1, Long value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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