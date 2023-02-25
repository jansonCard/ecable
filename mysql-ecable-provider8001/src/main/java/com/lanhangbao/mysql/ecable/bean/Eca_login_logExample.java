package com.lanhangbao.mysql.ecable.bean;

import java.util.ArrayList;
import java.util.List;

public class Eca_login_logExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Eca_login_logExample() {
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

        public Criteria andEcallIdIsNull() {
            addCriterion("ecall_id is null");
            return (Criteria) this;
        }

        public Criteria andEcallIdIsNotNull() {
            addCriterion("ecall_id is not null");
            return (Criteria) this;
        }

        public Criteria andEcallIdEqualTo(Integer value) {
            addCriterion("ecall_id =", value, "ecallId");
            return (Criteria) this;
        }

        public Criteria andEcallIdNotEqualTo(Integer value) {
            addCriterion("ecall_id <>", value, "ecallId");
            return (Criteria) this;
        }

        public Criteria andEcallIdGreaterThan(Integer value) {
            addCriterion("ecall_id >", value, "ecallId");
            return (Criteria) this;
        }

        public Criteria andEcallIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ecall_id >=", value, "ecallId");
            return (Criteria) this;
        }

        public Criteria andEcallIdLessThan(Integer value) {
            addCriterion("ecall_id <", value, "ecallId");
            return (Criteria) this;
        }

        public Criteria andEcallIdLessThanOrEqualTo(Integer value) {
            addCriterion("ecall_id <=", value, "ecallId");
            return (Criteria) this;
        }

        public Criteria andEcallIdIn(List<Integer> values) {
            addCriterion("ecall_id in", values, "ecallId");
            return (Criteria) this;
        }

        public Criteria andEcallIdNotIn(List<Integer> values) {
            addCriterion("ecall_id not in", values, "ecallId");
            return (Criteria) this;
        }

        public Criteria andEcallIdBetween(Integer value1, Integer value2) {
            addCriterion("ecall_id between", value1, value2, "ecallId");
            return (Criteria) this;
        }

        public Criteria andEcallIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ecall_id not between", value1, value2, "ecallId");
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

        public Criteria andEcaNameIsNull() {
            addCriterion("eca_name is null");
            return (Criteria) this;
        }

        public Criteria andEcaNameIsNotNull() {
            addCriterion("eca_name is not null");
            return (Criteria) this;
        }

        public Criteria andEcaNameEqualTo(String value) {
            addCriterion("eca_name =", value, "ecaName");
            return (Criteria) this;
        }

        public Criteria andEcaNameNotEqualTo(String value) {
            addCriterion("eca_name <>", value, "ecaName");
            return (Criteria) this;
        }

        public Criteria andEcaNameGreaterThan(String value) {
            addCriterion("eca_name >", value, "ecaName");
            return (Criteria) this;
        }

        public Criteria andEcaNameGreaterThanOrEqualTo(String value) {
            addCriterion("eca_name >=", value, "ecaName");
            return (Criteria) this;
        }

        public Criteria andEcaNameLessThan(String value) {
            addCriterion("eca_name <", value, "ecaName");
            return (Criteria) this;
        }

        public Criteria andEcaNameLessThanOrEqualTo(String value) {
            addCriterion("eca_name <=", value, "ecaName");
            return (Criteria) this;
        }

        public Criteria andEcaNameLike(String value) {
            addCriterion("eca_name like", value, "ecaName");
            return (Criteria) this;
        }

        public Criteria andEcaNameNotLike(String value) {
            addCriterion("eca_name not like", value, "ecaName");
            return (Criteria) this;
        }

        public Criteria andEcaNameIn(List<String> values) {
            addCriterion("eca_name in", values, "ecaName");
            return (Criteria) this;
        }

        public Criteria andEcaNameNotIn(List<String> values) {
            addCriterion("eca_name not in", values, "ecaName");
            return (Criteria) this;
        }

        public Criteria andEcaNameBetween(String value1, String value2) {
            addCriterion("eca_name between", value1, value2, "ecaName");
            return (Criteria) this;
        }

        public Criteria andEcaNameNotBetween(String value1, String value2) {
            addCriterion("eca_name not between", value1, value2, "ecaName");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIsNull() {
            addCriterion("admin_type is null");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIsNotNull() {
            addCriterion("admin_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTypeEqualTo(Integer value) {
            addCriterion("admin_type =", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotEqualTo(Integer value) {
            addCriterion("admin_type <>", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeGreaterThan(Integer value) {
            addCriterion("admin_type >", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_type >=", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLessThan(Integer value) {
            addCriterion("admin_type <", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLessThanOrEqualTo(Integer value) {
            addCriterion("admin_type <=", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIn(List<Integer> values) {
            addCriterion("admin_type in", values, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotIn(List<Integer> values) {
            addCriterion("admin_type not in", values, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeBetween(Integer value1, Integer value2) {
            addCriterion("admin_type between", value1, value2, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_type not between", value1, value2, "adminType");
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
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

        public Criteria andIpAddressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("ip_address =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("ip_address <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("ip_address >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ip_address >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("ip_address <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("ip_address <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("ip_address like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("ip_address not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("ip_address in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("ip_address not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("ip_address between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("ip_address not between", value1, value2, "ipAddress");
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