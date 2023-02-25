package com.lanhangbao.mysql.ecable.bean;

import java.util.ArrayList;
import java.util.List;

public class Ec_adminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ec_adminExample() {
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

        public Criteria andEcaPhoneIsNull() {
            addCriterion("eca_phone is null");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneIsNotNull() {
            addCriterion("eca_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneEqualTo(String value) {
            addCriterion("eca_phone =", value, "ecaPhone");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneNotEqualTo(String value) {
            addCriterion("eca_phone <>", value, "ecaPhone");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneGreaterThan(String value) {
            addCriterion("eca_phone >", value, "ecaPhone");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("eca_phone >=", value, "ecaPhone");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneLessThan(String value) {
            addCriterion("eca_phone <", value, "ecaPhone");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneLessThanOrEqualTo(String value) {
            addCriterion("eca_phone <=", value, "ecaPhone");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneLike(String value) {
            addCriterion("eca_phone like", value, "ecaPhone");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneNotLike(String value) {
            addCriterion("eca_phone not like", value, "ecaPhone");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneIn(List<String> values) {
            addCriterion("eca_phone in", values, "ecaPhone");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneNotIn(List<String> values) {
            addCriterion("eca_phone not in", values, "ecaPhone");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneBetween(String value1, String value2) {
            addCriterion("eca_phone between", value1, value2, "ecaPhone");
            return (Criteria) this;
        }

        public Criteria andEcaPhoneNotBetween(String value1, String value2) {
            addCriterion("eca_phone not between", value1, value2, "ecaPhone");
            return (Criteria) this;
        }

        public Criteria andEcaPwdIsNull() {
            addCriterion("eca_pwd is null");
            return (Criteria) this;
        }

        public Criteria andEcaPwdIsNotNull() {
            addCriterion("eca_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andEcaPwdEqualTo(String value) {
            addCriterion("eca_pwd =", value, "ecaPwd");
            return (Criteria) this;
        }

        public Criteria andEcaPwdNotEqualTo(String value) {
            addCriterion("eca_pwd <>", value, "ecaPwd");
            return (Criteria) this;
        }

        public Criteria andEcaPwdGreaterThan(String value) {
            addCriterion("eca_pwd >", value, "ecaPwd");
            return (Criteria) this;
        }

        public Criteria andEcaPwdGreaterThanOrEqualTo(String value) {
            addCriterion("eca_pwd >=", value, "ecaPwd");
            return (Criteria) this;
        }

        public Criteria andEcaPwdLessThan(String value) {
            addCriterion("eca_pwd <", value, "ecaPwd");
            return (Criteria) this;
        }

        public Criteria andEcaPwdLessThanOrEqualTo(String value) {
            addCriterion("eca_pwd <=", value, "ecaPwd");
            return (Criteria) this;
        }

        public Criteria andEcaPwdLike(String value) {
            addCriterion("eca_pwd like", value, "ecaPwd");
            return (Criteria) this;
        }

        public Criteria andEcaPwdNotLike(String value) {
            addCriterion("eca_pwd not like", value, "ecaPwd");
            return (Criteria) this;
        }

        public Criteria andEcaPwdIn(List<String> values) {
            addCriterion("eca_pwd in", values, "ecaPwd");
            return (Criteria) this;
        }

        public Criteria andEcaPwdNotIn(List<String> values) {
            addCriterion("eca_pwd not in", values, "ecaPwd");
            return (Criteria) this;
        }

        public Criteria andEcaPwdBetween(String value1, String value2) {
            addCriterion("eca_pwd between", value1, value2, "ecaPwd");
            return (Criteria) this;
        }

        public Criteria andEcaPwdNotBetween(String value1, String value2) {
            addCriterion("eca_pwd not between", value1, value2, "ecaPwd");
            return (Criteria) this;
        }

        public Criteria andStartTypeIsNull() {
            addCriterion("start_type is null");
            return (Criteria) this;
        }

        public Criteria andStartTypeIsNotNull() {
            addCriterion("start_type is not null");
            return (Criteria) this;
        }

        public Criteria andStartTypeEqualTo(Boolean value) {
            addCriterion("start_type =", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotEqualTo(Boolean value) {
            addCriterion("start_type <>", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeGreaterThan(Boolean value) {
            addCriterion("start_type >", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("start_type >=", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeLessThan(Boolean value) {
            addCriterion("start_type <", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("start_type <=", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeIn(List<Boolean> values) {
            addCriterion("start_type in", values, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotIn(List<Boolean> values) {
            addCriterion("start_type not in", values, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("start_type between", value1, value2, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("start_type not between", value1, value2, "startType");
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