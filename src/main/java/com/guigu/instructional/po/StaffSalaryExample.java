package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffSalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffSalaryExample() {
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

        public Criteria andStaffSalaryIdIsNull() {
            addCriterion("staff_salary_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdIsNotNull() {
            addCriterion("staff_salary_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdEqualTo(Integer value) {
            addCriterion("staff_salary_id =", value, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdNotEqualTo(Integer value) {
            addCriterion("staff_salary_id <>", value, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdGreaterThan(Integer value) {
            addCriterion("staff_salary_id >", value, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_salary_id >=", value, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdLessThan(Integer value) {
            addCriterion("staff_salary_id <", value, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_salary_id <=", value, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdIn(List<Integer> values) {
            addCriterion("staff_salary_id in", values, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdNotIn(List<Integer> values) {
            addCriterion("staff_salary_id not in", values, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_salary_id between", value1, value2, "staffSalaryId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_salary_id not between", value1, value2, "staffSalaryId");
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

        public Criteria andStaStaffIdIsNull() {
            addCriterion("sta_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdIsNotNull() {
            addCriterion("sta_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdEqualTo(Integer value) {
            addCriterion("sta_staff_id =", value, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdNotEqualTo(Integer value) {
            addCriterion("sta_staff_id <>", value, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdGreaterThan(Integer value) {
            addCriterion("sta_staff_id >", value, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sta_staff_id >=", value, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdLessThan(Integer value) {
            addCriterion("sta_staff_id <", value, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("sta_staff_id <=", value, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdIn(List<Integer> values) {
            addCriterion("sta_staff_id in", values, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdNotIn(List<Integer> values) {
            addCriterion("sta_staff_id not in", values, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("sta_staff_id between", value1, value2, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sta_staff_id not between", value1, value2, "staStaffId");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTotalIsNull() {
            addCriterion("staff_salary_total is null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTotalIsNotNull() {
            addCriterion("staff_salary_total is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTotalEqualTo(Double value) {
            addCriterion("staff_salary_total =", value, "staffSalaryTotal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTotalNotEqualTo(Double value) {
            addCriterion("staff_salary_total <>", value, "staffSalaryTotal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTotalGreaterThan(Double value) {
            addCriterion("staff_salary_total >", value, "staffSalaryTotal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("staff_salary_total >=", value, "staffSalaryTotal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTotalLessThan(Double value) {
            addCriterion("staff_salary_total <", value, "staffSalaryTotal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTotalLessThanOrEqualTo(Double value) {
            addCriterion("staff_salary_total <=", value, "staffSalaryTotal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTotalIn(List<Double> values) {
            addCriterion("staff_salary_total in", values, "staffSalaryTotal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTotalNotIn(List<Double> values) {
            addCriterion("staff_salary_total not in", values, "staffSalaryTotal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTotalBetween(Double value1, Double value2) {
            addCriterion("staff_salary_total between", value1, value2, "staffSalaryTotal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTotalNotBetween(Double value1, Double value2) {
            addCriterion("staff_salary_total not between", value1, value2, "staffSalaryTotal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryDeductIsNull() {
            addCriterion("staff_salary_deduct is null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryDeductIsNotNull() {
            addCriterion("staff_salary_deduct is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryDeductEqualTo(Double value) {
            addCriterion("staff_salary_deduct =", value, "staffSalaryDeduct");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryDeductNotEqualTo(Double value) {
            addCriterion("staff_salary_deduct <>", value, "staffSalaryDeduct");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryDeductGreaterThan(Double value) {
            addCriterion("staff_salary_deduct >", value, "staffSalaryDeduct");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryDeductGreaterThanOrEqualTo(Double value) {
            addCriterion("staff_salary_deduct >=", value, "staffSalaryDeduct");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryDeductLessThan(Double value) {
            addCriterion("staff_salary_deduct <", value, "staffSalaryDeduct");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryDeductLessThanOrEqualTo(Double value) {
            addCriterion("staff_salary_deduct <=", value, "staffSalaryDeduct");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryDeductIn(List<Double> values) {
            addCriterion("staff_salary_deduct in", values, "staffSalaryDeduct");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryDeductNotIn(List<Double> values) {
            addCriterion("staff_salary_deduct not in", values, "staffSalaryDeduct");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryDeductBetween(Double value1, Double value2) {
            addCriterion("staff_salary_deduct between", value1, value2, "staffSalaryDeduct");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryDeductNotBetween(Double value1, Double value2) {
            addCriterion("staff_salary_deduct not between", value1, value2, "staffSalaryDeduct");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryRealIsNull() {
            addCriterion("staff_salary_real is null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryRealIsNotNull() {
            addCriterion("staff_salary_real is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryRealEqualTo(Double value) {
            addCriterion("staff_salary_real =", value, "staffSalaryReal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryRealNotEqualTo(Double value) {
            addCriterion("staff_salary_real <>", value, "staffSalaryReal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryRealGreaterThan(Double value) {
            addCriterion("staff_salary_real >", value, "staffSalaryReal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryRealGreaterThanOrEqualTo(Double value) {
            addCriterion("staff_salary_real >=", value, "staffSalaryReal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryRealLessThan(Double value) {
            addCriterion("staff_salary_real <", value, "staffSalaryReal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryRealLessThanOrEqualTo(Double value) {
            addCriterion("staff_salary_real <=", value, "staffSalaryReal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryRealIn(List<Double> values) {
            addCriterion("staff_salary_real in", values, "staffSalaryReal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryRealNotIn(List<Double> values) {
            addCriterion("staff_salary_real not in", values, "staffSalaryReal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryRealBetween(Double value1, Double value2) {
            addCriterion("staff_salary_real between", value1, value2, "staffSalaryReal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryRealNotBetween(Double value1, Double value2) {
            addCriterion("staff_salary_real not between", value1, value2, "staffSalaryReal");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedIsNull() {
            addCriterion("staff_salary_isused is null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedIsNotNull() {
            addCriterion("staff_salary_isused is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedEqualTo(String value) {
            addCriterion("staff_salary_isused =", value, "staffSalaryIsused");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedNotEqualTo(String value) {
            addCriterion("staff_salary_isused <>", value, "staffSalaryIsused");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedGreaterThan(String value) {
            addCriterion("staff_salary_isused >", value, "staffSalaryIsused");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedGreaterThanOrEqualTo(String value) {
            addCriterion("staff_salary_isused >=", value, "staffSalaryIsused");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedLessThan(String value) {
            addCriterion("staff_salary_isused <", value, "staffSalaryIsused");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedLessThanOrEqualTo(String value) {
            addCriterion("staff_salary_isused <=", value, "staffSalaryIsused");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedLike(String value) {
            addCriterion("staff_salary_isused like", value, "staffSalaryIsused");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedNotLike(String value) {
            addCriterion("staff_salary_isused not like", value, "staffSalaryIsused");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedIn(List<String> values) {
            addCriterion("staff_salary_isused in", values, "staffSalaryIsused");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedNotIn(List<String> values) {
            addCriterion("staff_salary_isused not in", values, "staffSalaryIsused");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedBetween(String value1, String value2) {
            addCriterion("staff_salary_isused between", value1, value2, "staffSalaryIsused");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryIsusedNotBetween(String value1, String value2) {
            addCriterion("staff_salary_isused not between", value1, value2, "staffSalaryIsused");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeIsNull() {
            addCriterion("staff_salary_time is null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeIsNotNull() {
            addCriterion("staff_salary_time is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeEqualTo(Date value) {
            addCriterion("staff_salary_time =", value, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeNotEqualTo(Date value) {
            addCriterion("staff_salary_time <>", value, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeGreaterThan(Date value) {
            addCriterion("staff_salary_time >", value, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("staff_salary_time >=", value, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeLessThan(Date value) {
            addCriterion("staff_salary_time <", value, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeLessThanOrEqualTo(Date value) {
            addCriterion("staff_salary_time <=", value, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeIn(List<Date> values) {
            addCriterion("staff_salary_time in", values, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeNotIn(List<Date> values) {
            addCriterion("staff_salary_time not in", values, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeBetween(Date value1, Date value2) {
            addCriterion("staff_salary_time between", value1, value2, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andStaffSalaryTimeNotBetween(Date value1, Date value2) {
            addCriterion("staff_salary_time not between", value1, value2, "staffSalaryTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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