package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageInfoExample() {
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

        public Criteria andMessageId1IsNull() {
            addCriterion("message_id1 is null");
            return (Criteria) this;
        }

        public Criteria andMessageId1IsNotNull() {
            addCriterion("message_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andMessageId1EqualTo(Integer value) {
            addCriterion("message_id1 =", value, "messageId1");
            return (Criteria) this;
        }

        public Criteria andMessageId1NotEqualTo(Integer value) {
            addCriterion("message_id1 <>", value, "messageId1");
            return (Criteria) this;
        }

        public Criteria andMessageId1GreaterThan(Integer value) {
            addCriterion("message_id1 >", value, "messageId1");
            return (Criteria) this;
        }

        public Criteria andMessageId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id1 >=", value, "messageId1");
            return (Criteria) this;
        }

        public Criteria andMessageId1LessThan(Integer value) {
            addCriterion("message_id1 <", value, "messageId1");
            return (Criteria) this;
        }

        public Criteria andMessageId1LessThanOrEqualTo(Integer value) {
            addCriterion("message_id1 <=", value, "messageId1");
            return (Criteria) this;
        }

        public Criteria andMessageId1In(List<Integer> values) {
            addCriterion("message_id1 in", values, "messageId1");
            return (Criteria) this;
        }

        public Criteria andMessageId1NotIn(List<Integer> values) {
            addCriterion("message_id1 not in", values, "messageId1");
            return (Criteria) this;
        }

        public Criteria andMessageId1Between(Integer value1, Integer value2) {
            addCriterion("message_id1 between", value1, value2, "messageId1");
            return (Criteria) this;
        }

        public Criteria andMessageId1NotBetween(Integer value1, Integer value2) {
            addCriterion("message_id1 not between", value1, value2, "messageId1");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNull() {
            addCriterion("message_content is null");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNotNull() {
            addCriterion("message_content is not null");
            return (Criteria) this;
        }

        public Criteria andMessageContentEqualTo(String value) {
            addCriterion("message_content =", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotEqualTo(String value) {
            addCriterion("message_content <>", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThan(String value) {
            addCriterion("message_content >", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThanOrEqualTo(String value) {
            addCriterion("message_content >=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThan(String value) {
            addCriterion("message_content <", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThanOrEqualTo(String value) {
            addCriterion("message_content <=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLike(String value) {
            addCriterion("message_content like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotLike(String value) {
            addCriterion("message_content not like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentIn(List<String> values) {
            addCriterion("message_content in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotIn(List<String> values) {
            addCriterion("message_content not in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentBetween(String value1, String value2) {
            addCriterion("message_content between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotBetween(String value1, String value2) {
            addCriterion("message_content not between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageManIsNull() {
            addCriterion("message_man is null");
            return (Criteria) this;
        }

        public Criteria andMessageManIsNotNull() {
            addCriterion("message_man is not null");
            return (Criteria) this;
        }

        public Criteria andMessageManEqualTo(String value) {
            addCriterion("message_man =", value, "messageMan");
            return (Criteria) this;
        }

        public Criteria andMessageManNotEqualTo(String value) {
            addCriterion("message_man <>", value, "messageMan");
            return (Criteria) this;
        }

        public Criteria andMessageManGreaterThan(String value) {
            addCriterion("message_man >", value, "messageMan");
            return (Criteria) this;
        }

        public Criteria andMessageManGreaterThanOrEqualTo(String value) {
            addCriterion("message_man >=", value, "messageMan");
            return (Criteria) this;
        }

        public Criteria andMessageManLessThan(String value) {
            addCriterion("message_man <", value, "messageMan");
            return (Criteria) this;
        }

        public Criteria andMessageManLessThanOrEqualTo(String value) {
            addCriterion("message_man <=", value, "messageMan");
            return (Criteria) this;
        }

        public Criteria andMessageManLike(String value) {
            addCriterion("message_man like", value, "messageMan");
            return (Criteria) this;
        }

        public Criteria andMessageManNotLike(String value) {
            addCriterion("message_man not like", value, "messageMan");
            return (Criteria) this;
        }

        public Criteria andMessageManIn(List<String> values) {
            addCriterion("message_man in", values, "messageMan");
            return (Criteria) this;
        }

        public Criteria andMessageManNotIn(List<String> values) {
            addCriterion("message_man not in", values, "messageMan");
            return (Criteria) this;
        }

        public Criteria andMessageManBetween(String value1, String value2) {
            addCriterion("message_man between", value1, value2, "messageMan");
            return (Criteria) this;
        }

        public Criteria andMessageManNotBetween(String value1, String value2) {
            addCriterion("message_man not between", value1, value2, "messageMan");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneIsNull() {
            addCriterion("message_phone is null");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneIsNotNull() {
            addCriterion("message_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneEqualTo(String value) {
            addCriterion("message_phone =", value, "messagePhone");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneNotEqualTo(String value) {
            addCriterion("message_phone <>", value, "messagePhone");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneGreaterThan(String value) {
            addCriterion("message_phone >", value, "messagePhone");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("message_phone >=", value, "messagePhone");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneLessThan(String value) {
            addCriterion("message_phone <", value, "messagePhone");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneLessThanOrEqualTo(String value) {
            addCriterion("message_phone <=", value, "messagePhone");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneLike(String value) {
            addCriterion("message_phone like", value, "messagePhone");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneNotLike(String value) {
            addCriterion("message_phone not like", value, "messagePhone");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneIn(List<String> values) {
            addCriterion("message_phone in", values, "messagePhone");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneNotIn(List<String> values) {
            addCriterion("message_phone not in", values, "messagePhone");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneBetween(String value1, String value2) {
            addCriterion("message_phone between", value1, value2, "messagePhone");
            return (Criteria) this;
        }

        public Criteria andMessagePhoneNotBetween(String value1, String value2) {
            addCriterion("message_phone not between", value1, value2, "messagePhone");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNull() {
            addCriterion("message_time is null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNotNull() {
            addCriterion("message_time is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeEqualTo(Date value) {
            addCriterion("message_time =", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotEqualTo(Date value) {
            addCriterion("message_time <>", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThan(Date value) {
            addCriterion("message_time >", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("message_time >=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThan(Date value) {
            addCriterion("message_time <", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThanOrEqualTo(Date value) {
            addCriterion("message_time <=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIn(List<Date> values) {
            addCriterion("message_time in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotIn(List<Date> values) {
            addCriterion("message_time not in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeBetween(Date value1, Date value2) {
            addCriterion("message_time between", value1, value2, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotBetween(Date value1, Date value2) {
            addCriterion("message_time not between", value1, value2, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageStateIsNull() {
            addCriterion("message_state is null");
            return (Criteria) this;
        }

        public Criteria andMessageStateIsNotNull() {
            addCriterion("message_state is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStateEqualTo(String value) {
            addCriterion("message_state =", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotEqualTo(String value) {
            addCriterion("message_state <>", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateGreaterThan(String value) {
            addCriterion("message_state >", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateGreaterThanOrEqualTo(String value) {
            addCriterion("message_state >=", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLessThan(String value) {
            addCriterion("message_state <", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLessThanOrEqualTo(String value) {
            addCriterion("message_state <=", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLike(String value) {
            addCriterion("message_state like", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotLike(String value) {
            addCriterion("message_state not like", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateIn(List<String> values) {
            addCriterion("message_state in", values, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotIn(List<String> values) {
            addCriterion("message_state not in", values, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateBetween(String value1, String value2) {
            addCriterion("message_state between", value1, value2, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotBetween(String value1, String value2) {
            addCriterion("message_state not between", value1, value2, "messageState");
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