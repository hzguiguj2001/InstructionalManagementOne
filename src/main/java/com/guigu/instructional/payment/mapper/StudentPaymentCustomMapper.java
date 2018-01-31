package com.guigu.instructional.payment.mapper;

import java.util.List;

import com.guigu.instructional.po.StudentPayment;
import com.guigu.instructional.po.StudentPaymentCustom;

public interface StudentPaymentCustomMapper {
	public List<StudentPaymentCustom> findStudentPaymentList(StudentPayment studentPayment)throws Exception;
}
