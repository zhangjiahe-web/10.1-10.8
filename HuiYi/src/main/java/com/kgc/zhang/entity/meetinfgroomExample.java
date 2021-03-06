package com.kgc.zhang.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class meetinfgroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public meetinfgroomExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIsNull() {
            addCriterion("meeting_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIsNotNull() {
            addCriterion("meeting_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingNameEqualTo(String value) {
            addCriterion("meeting_name =", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotEqualTo(String value) {
            addCriterion("meeting_name <>", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameGreaterThan(String value) {
            addCriterion("meeting_name >", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_name >=", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLessThan(String value) {
            addCriterion("meeting_name <", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLessThanOrEqualTo(String value) {
            addCriterion("meeting_name <=", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLike(String value) {
            addCriterion("meeting_name like", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotLike(String value) {
            addCriterion("meeting_name not like", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIn(List<String> values) {
            addCriterion("meeting_name in", values, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotIn(List<String> values) {
            addCriterion("meeting_name not in", values, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameBetween(String value1, String value2) {
            addCriterion("meeting_name between", value1, value2, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotBetween(String value1, String value2) {
            addCriterion("meeting_name not between", value1, value2, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingOrderIsNull() {
            addCriterion("meeting_order is null");
            return (Criteria) this;
        }

        public Criteria andMeetingOrderIsNotNull() {
            addCriterion("meeting_order is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingOrderEqualTo(Date value) {
            addCriterion("meeting_order =", value, "meetingOrder");
            return (Criteria) this;
        }

        public Criteria andMeetingOrderNotEqualTo(Date value) {
            addCriterion("meeting_order <>", value, "meetingOrder");
            return (Criteria) this;
        }

        public Criteria andMeetingOrderGreaterThan(Date value) {
            addCriterion("meeting_order >", value, "meetingOrder");
            return (Criteria) this;
        }

        public Criteria andMeetingOrderGreaterThanOrEqualTo(Date value) {
            addCriterion("meeting_order >=", value, "meetingOrder");
            return (Criteria) this;
        }

        public Criteria andMeetingOrderLessThan(Date value) {
            addCriterion("meeting_order <", value, "meetingOrder");
            return (Criteria) this;
        }

        public Criteria andMeetingOrderLessThanOrEqualTo(Date value) {
            addCriterion("meeting_order <=", value, "meetingOrder");
            return (Criteria) this;
        }

        public Criteria andMeetingOrderIn(List<Date> values) {
            addCriterion("meeting_order in", values, "meetingOrder");
            return (Criteria) this;
        }

        public Criteria andMeetingOrderNotIn(List<Date> values) {
            addCriterion("meeting_order not in", values, "meetingOrder");
            return (Criteria) this;
        }

        public Criteria andMeetingOrderBetween(Date value1, Date value2) {
            addCriterion("meeting_order between", value1, value2, "meetingOrder");
            return (Criteria) this;
        }

        public Criteria andMeetingOrderNotBetween(Date value1, Date value2) {
            addCriterion("meeting_order not between", value1, value2, "meetingOrder");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameIsNull() {
            addCriterion("advance_name is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameIsNotNull() {
            addCriterion("advance_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameEqualTo(String value) {
            addCriterion("advance_name =", value, "advanceName");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameNotEqualTo(String value) {
            addCriterion("advance_name <>", value, "advanceName");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameGreaterThan(String value) {
            addCriterion("advance_name >", value, "advanceName");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameGreaterThanOrEqualTo(String value) {
            addCriterion("advance_name >=", value, "advanceName");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameLessThan(String value) {
            addCriterion("advance_name <", value, "advanceName");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameLessThanOrEqualTo(String value) {
            addCriterion("advance_name <=", value, "advanceName");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameLike(String value) {
            addCriterion("advance_name like", value, "advanceName");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameNotLike(String value) {
            addCriterion("advance_name not like", value, "advanceName");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameIn(List<String> values) {
            addCriterion("advance_name in", values, "advanceName");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameNotIn(List<String> values) {
            addCriterion("advance_name not in", values, "advanceName");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameBetween(String value1, String value2) {
            addCriterion("advance_name between", value1, value2, "advanceName");
            return (Criteria) this;
        }

        public Criteria andAdvanceNameNotBetween(String value1, String value2) {
            addCriterion("advance_name not between", value1, value2, "advanceName");
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