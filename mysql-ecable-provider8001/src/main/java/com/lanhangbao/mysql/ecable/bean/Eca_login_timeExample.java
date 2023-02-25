package com.lanhangbao.mysql.ecable.bean;

import java.util.ArrayList;
import java.util.List;

public class Eca_login_timeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Eca_login_timeExample() {
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

        public Criteria andEcaltIdIsNull() {
            addCriterion("ecalt_id is null");
            return (Criteria) this;
        }

        public Criteria andEcaltIdIsNotNull() {
            addCriterion("ecalt_id is not null");
            return (Criteria) this;
        }

        public Criteria andEcaltIdEqualTo(Integer value) {
            addCriterion("ecalt_id =", value, "ecaltId");
            return (Criteria) this;
        }

        public Criteria andEcaltIdNotEqualTo(Integer value) {
            addCriterion("ecalt_id <>", value, "ecaltId");
            return (Criteria) this;
        }

        public Criteria andEcaltIdGreaterThan(Integer value) {
            addCriterion("ecalt_id >", value, "ecaltId");
            return (Criteria) this;
        }

        public Criteria andEcaltIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ecalt_id >=", value, "ecaltId");
            return (Criteria) this;
        }

        public Criteria andEcaltIdLessThan(Integer value) {
            addCriterion("ecalt_id <", value, "ecaltId");
            return (Criteria) this;
        }

        public Criteria andEcaltIdLessThanOrEqualTo(Integer value) {
            addCriterion("ecalt_id <=", value, "ecaltId");
            return (Criteria) this;
        }

        public Criteria andEcaltIdIn(List<Integer> values) {
            addCriterion("ecalt_id in", values, "ecaltId");
            return (Criteria) this;
        }

        public Criteria andEcaltIdNotIn(List<Integer> values) {
            addCriterion("ecalt_id not in", values, "ecaltId");
            return (Criteria) this;
        }

        public Criteria andEcaltIdBetween(Integer value1, Integer value2) {
            addCriterion("ecalt_id between", value1, value2, "ecaltId");
            return (Criteria) this;
        }

        public Criteria andEcaltIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ecalt_id not between", value1, value2, "ecaltId");
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

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Integer value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Integer value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Integer value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Integer value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Integer> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Integer> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Integer value1, Integer value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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