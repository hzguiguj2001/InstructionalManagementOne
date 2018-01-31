package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentPaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentPaymentExample() {
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

        public Criteria andPaymentIdIsNull() {
            addCriterion("payment_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Integer value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Integer value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Integer value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Integer value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Integer value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Integer> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Integer> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Integer value1, Integer value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_id not between", value1, value2, "paymentId");
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

        public Criteria andPaymentSitutationIsNull() {
            addCriterion("payment_situtation is null");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationIsNotNull() {
            addCriterion("payment_situtation is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationEqualTo(String value) {
            addCriterion("payment_situtation =", value, "paymentSitutation");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationNotEqualTo(String value) {
            addCriterion("payment_situtation <>", value, "paymentSitutation");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationGreaterThan(String value) {
            addCriterion("payment_situtation >", value, "paymentSitutation");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationGreaterThanOrEqualTo(String value) {
            addCriterion("payment_situtation >=", value, "paymentSitutation");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationLessThan(String value) {
            addCriterion("payment_situtation <", value, "paymentSitutation");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationLessThanOrEqualTo(String value) {
            addCriterion("payment_situtation <=", value, "paymentSitutation");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationLike(String value) {
            addCriterion("payment_situtation like", value, "paymentSitutation");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationNotLike(String value) {
            addCriterion("payment_situtation not like", value, "paymentSitutation");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationIn(List<String> values) {
            addCriterion("payment_situtation in", values, "paymentSitutation");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationNotIn(List<String> values) {
            addCriterion("payment_situtation not in", values, "paymentSitutation");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationBetween(String value1, String value2) {
            addCriterion("payment_situtation between", value1, value2, "paymentSitutation");
            return (Criteria) this;
        }

        public Criteria andPaymentSitutationNotBetween(String value1, String value2) {
            addCriterion("payment_situtation not between", value1, value2, "paymentSitutation");
            return (Criteria) this;
        }

        public Criteria andPaymentMenthodIsNull() {
            addCriterion("payment_menthod is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMenthodIsNotNull() {
            addCriterion("payment_menthod is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMenthodEqualTo(Integer value) {
            addCriterion("payment_menthod =", value, "paymentMenthod");
            return (Criteria) this;
        }

        public Criteria andPaymentMenthodNotEqualTo(Integer value) {
            addCriterion("payment_menthod <>", value, "paymentMenthod");
            return (Criteria) this;
        }

        public Criteria andPaymentMenthodGreaterThan(Integer value) {
            addCriterion("payment_menthod >", value, "paymentMenthod");
            return (Criteria) this;
        }

        public Criteria andPaymentMenthodGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_menthod >=", value, "paymentMenthod");
            return (Criteria) this;
        }

        public Criteria andPaymentMenthodLessThan(Integer value) {
            addCriterion("payment_menthod <", value, "paymentMenthod");
            return (Criteria) this;
        }

        public Criteria andPaymentMenthodLessThanOrEqualTo(Integer value) {
            addCriterion("payment_menthod <=", value, "paymentMenthod");
            return (Criteria) this;
        }

        public Criteria andPaymentMenthodIn(List<Integer> values) {
            addCriterion("payment_menthod in", values, "paymentMenthod");
            return (Criteria) this;
        }

        public Criteria andPaymentMenthodNotIn(List<Integer> values) {
            addCriterion("payment_menthod not in", values, "paymentMenthod");
            return (Criteria) this;
        }

        public Criteria andPaymentMenthodBetween(Integer value1, Integer value2) {
            addCriterion("payment_menthod between", value1, value2, "paymentMenthod");
            return (Criteria) this;
        }

        public Criteria andPaymentMenthodNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_menthod not between", value1, value2, "paymentMenthod");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentDiscountAmountIsNull() {
            addCriterion("payment_discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDiscountAmountIsNotNull() {
            addCriterion("payment_discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDiscountAmountEqualTo(Double value) {
            addCriterion("payment_discount_amount =", value, "paymentDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDiscountAmountNotEqualTo(Double value) {
            addCriterion("payment_discount_amount <>", value, "paymentDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDiscountAmountGreaterThan(Double value) {
            addCriterion("payment_discount_amount >", value, "paymentDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDiscountAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("payment_discount_amount >=", value, "paymentDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDiscountAmountLessThan(Double value) {
            addCriterion("payment_discount_amount <", value, "paymentDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDiscountAmountLessThanOrEqualTo(Double value) {
            addCriterion("payment_discount_amount <=", value, "paymentDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDiscountAmountIn(List<Double> values) {
            addCriterion("payment_discount_amount in", values, "paymentDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDiscountAmountNotIn(List<Double> values) {
            addCriterion("payment_discount_amount not in", values, "paymentDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDiscountAmountBetween(Double value1, Double value2) {
            addCriterion("payment_discount_amount between", value1, value2, "paymentDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDiscountAmountNotBetween(Double value1, Double value2) {
            addCriterion("payment_discount_amount not between", value1, value2, "paymentDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentShouldAmountIsNull() {
            addCriterion("payment_should_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaymentShouldAmountIsNotNull() {
            addCriterion("payment_should_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentShouldAmountEqualTo(Double value) {
            addCriterion("payment_should_amount =", value, "paymentShouldAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentShouldAmountNotEqualTo(Double value) {
            addCriterion("payment_should_amount <>", value, "paymentShouldAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentShouldAmountGreaterThan(Double value) {
            addCriterion("payment_should_amount >", value, "paymentShouldAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentShouldAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("payment_should_amount >=", value, "paymentShouldAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentShouldAmountLessThan(Double value) {
            addCriterion("payment_should_amount <", value, "paymentShouldAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentShouldAmountLessThanOrEqualTo(Double value) {
            addCriterion("payment_should_amount <=", value, "paymentShouldAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentShouldAmountIn(List<Double> values) {
            addCriterion("payment_should_amount in", values, "paymentShouldAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentShouldAmountNotIn(List<Double> values) {
            addCriterion("payment_should_amount not in", values, "paymentShouldAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentShouldAmountBetween(Double value1, Double value2) {
            addCriterion("payment_should_amount between", value1, value2, "paymentShouldAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentShouldAmountNotBetween(Double value1, Double value2) {
            addCriterion("payment_should_amount not between", value1, value2, "paymentShouldAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentRealAmountIsNull() {
            addCriterion("payment_real_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaymentRealAmountIsNotNull() {
            addCriterion("payment_real_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentRealAmountEqualTo(Double value) {
            addCriterion("payment_real_amount =", value, "paymentRealAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentRealAmountNotEqualTo(Double value) {
            addCriterion("payment_real_amount <>", value, "paymentRealAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentRealAmountGreaterThan(Double value) {
            addCriterion("payment_real_amount >", value, "paymentRealAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentRealAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("payment_real_amount >=", value, "paymentRealAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentRealAmountLessThan(Double value) {
            addCriterion("payment_real_amount <", value, "paymentRealAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentRealAmountLessThanOrEqualTo(Double value) {
            addCriterion("payment_real_amount <=", value, "paymentRealAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentRealAmountIn(List<Double> values) {
            addCriterion("payment_real_amount in", values, "paymentRealAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentRealAmountNotIn(List<Double> values) {
            addCriterion("payment_real_amount not in", values, "paymentRealAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentRealAmountBetween(Double value1, Double value2) {
            addCriterion("payment_real_amount between", value1, value2, "paymentRealAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentRealAmountNotBetween(Double value1, Double value2) {
            addCriterion("payment_real_amount not between", value1, value2, "paymentRealAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDebtAmountIsNull() {
            addCriterion("payment_debt_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDebtAmountIsNotNull() {
            addCriterion("payment_debt_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDebtAmountEqualTo(Double value) {
            addCriterion("payment_debt_amount =", value, "paymentDebtAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDebtAmountNotEqualTo(Double value) {
            addCriterion("payment_debt_amount <>", value, "paymentDebtAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDebtAmountGreaterThan(Double value) {
            addCriterion("payment_debt_amount >", value, "paymentDebtAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDebtAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("payment_debt_amount >=", value, "paymentDebtAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDebtAmountLessThan(Double value) {
            addCriterion("payment_debt_amount <", value, "paymentDebtAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDebtAmountLessThanOrEqualTo(Double value) {
            addCriterion("payment_debt_amount <=", value, "paymentDebtAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDebtAmountIn(List<Double> values) {
            addCriterion("payment_debt_amount in", values, "paymentDebtAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDebtAmountNotIn(List<Double> values) {
            addCriterion("payment_debt_amount not in", values, "paymentDebtAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDebtAmountBetween(Double value1, Double value2) {
            addCriterion("payment_debt_amount between", value1, value2, "paymentDebtAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentDebtAmountNotBetween(Double value1, Double value2) {
            addCriterion("payment_debt_amount not between", value1, value2, "paymentDebtAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkIsNull() {
            addCriterion("payment_remark is null");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkIsNotNull() {
            addCriterion("payment_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkEqualTo(String value) {
            addCriterion("payment_remark =", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkNotEqualTo(String value) {
            addCriterion("payment_remark <>", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkGreaterThan(String value) {
            addCriterion("payment_remark >", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("payment_remark >=", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkLessThan(String value) {
            addCriterion("payment_remark <", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkLessThanOrEqualTo(String value) {
            addCriterion("payment_remark <=", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkLike(String value) {
            addCriterion("payment_remark like", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkNotLike(String value) {
            addCriterion("payment_remark not like", value, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkIn(List<String> values) {
            addCriterion("payment_remark in", values, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkNotIn(List<String> values) {
            addCriterion("payment_remark not in", values, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkBetween(String value1, String value2) {
            addCriterion("payment_remark between", value1, value2, "paymentRemark");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarkNotBetween(String value1, String value2) {
            addCriterion("payment_remark not between", value1, value2, "paymentRemark");
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