package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommunicationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommunicationInfoExample() {
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

        public Criteria andCommunicationIdIsNull() {
            addCriterion("communication_id is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationIdIsNotNull() {
            addCriterion("communication_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationIdEqualTo(Integer value) {
            addCriterion("communication_id =", value, "communicationId");
            return (Criteria) this;
        }

        public Criteria andCommunicationIdNotEqualTo(Integer value) {
            addCriterion("communication_id <>", value, "communicationId");
            return (Criteria) this;
        }

        public Criteria andCommunicationIdGreaterThan(Integer value) {
            addCriterion("communication_id >", value, "communicationId");
            return (Criteria) this;
        }

        public Criteria andCommunicationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("communication_id >=", value, "communicationId");
            return (Criteria) this;
        }

        public Criteria andCommunicationIdLessThan(Integer value) {
            addCriterion("communication_id <", value, "communicationId");
            return (Criteria) this;
        }

        public Criteria andCommunicationIdLessThanOrEqualTo(Integer value) {
            addCriterion("communication_id <=", value, "communicationId");
            return (Criteria) this;
        }

        public Criteria andCommunicationIdIn(List<Integer> values) {
            addCriterion("communication_id in", values, "communicationId");
            return (Criteria) this;
        }

        public Criteria andCommunicationIdNotIn(List<Integer> values) {
            addCriterion("communication_id not in", values, "communicationId");
            return (Criteria) this;
        }

        public Criteria andCommunicationIdBetween(Integer value1, Integer value2) {
            addCriterion("communication_id between", value1, value2, "communicationId");
            return (Criteria) this;
        }

        public Criteria andCommunicationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("communication_id not between", value1, value2, "communicationId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
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

        public Criteria andCommunicationTimeIsNull() {
            addCriterion("communication_time is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationTimeIsNotNull() {
            addCriterion("communication_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationTimeEqualTo(Date value) {
            addCriterion("communication_time =", value, "communicationTime");
            return (Criteria) this;
        }

        public Criteria andCommunicationTimeNotEqualTo(Date value) {
            addCriterion("communication_time <>", value, "communicationTime");
            return (Criteria) this;
        }

        public Criteria andCommunicationTimeGreaterThan(Date value) {
            addCriterion("communication_time >", value, "communicationTime");
            return (Criteria) this;
        }

        public Criteria andCommunicationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("communication_time >=", value, "communicationTime");
            return (Criteria) this;
        }

        public Criteria andCommunicationTimeLessThan(Date value) {
            addCriterion("communication_time <", value, "communicationTime");
            return (Criteria) this;
        }

        public Criteria andCommunicationTimeLessThanOrEqualTo(Date value) {
            addCriterion("communication_time <=", value, "communicationTime");
            return (Criteria) this;
        }

        public Criteria andCommunicationTimeIn(List<Date> values) {
            addCriterion("communication_time in", values, "communicationTime");
            return (Criteria) this;
        }

        public Criteria andCommunicationTimeNotIn(List<Date> values) {
            addCriterion("communication_time not in", values, "communicationTime");
            return (Criteria) this;
        }

        public Criteria andCommunicationTimeBetween(Date value1, Date value2) {
            addCriterion("communication_time between", value1, value2, "communicationTime");
            return (Criteria) this;
        }

        public Criteria andCommunicationTimeNotBetween(Date value1, Date value2) {
            addCriterion("communication_time not between", value1, value2, "communicationTime");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentIsNull() {
            addCriterion("communication_content is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentIsNotNull() {
            addCriterion("communication_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentEqualTo(String value) {
            addCriterion("communication_content =", value, "communicationContent");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentNotEqualTo(String value) {
            addCriterion("communication_content <>", value, "communicationContent");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentGreaterThan(String value) {
            addCriterion("communication_content >", value, "communicationContent");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentGreaterThanOrEqualTo(String value) {
            addCriterion("communication_content >=", value, "communicationContent");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentLessThan(String value) {
            addCriterion("communication_content <", value, "communicationContent");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentLessThanOrEqualTo(String value) {
            addCriterion("communication_content <=", value, "communicationContent");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentLike(String value) {
            addCriterion("communication_content like", value, "communicationContent");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentNotLike(String value) {
            addCriterion("communication_content not like", value, "communicationContent");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentIn(List<String> values) {
            addCriterion("communication_content in", values, "communicationContent");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentNotIn(List<String> values) {
            addCriterion("communication_content not in", values, "communicationContent");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentBetween(String value1, String value2) {
            addCriterion("communication_content between", value1, value2, "communicationContent");
            return (Criteria) this;
        }

        public Criteria andCommunicationContentNotBetween(String value1, String value2) {
            addCriterion("communication_content not between", value1, value2, "communicationContent");
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