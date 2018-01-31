package com.guigu.instructional.payment.mapper;

import com.guigu.instructional.po.StudentPayment;
import com.guigu.instructional.po.StudentPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentPaymentMapper {
    int countByExample(StudentPaymentExample example);

    int deleteByExample(StudentPaymentExample example);

    int deleteByPrimaryKey(Integer paymentId);

    int insert(StudentPayment record);

    int insertSelective(StudentPayment record);

    List<StudentPayment> selectByExample(StudentPaymentExample example);

    StudentPayment selectByPrimaryKey(Integer paymentId);

    int updateByExampleSelective(@Param("record") StudentPayment record, @Param("example") StudentPaymentExample example);

    int updateByExample(@Param("record") StudentPayment record, @Param("example") StudentPaymentExample example);

    int updateByPrimaryKeySelective(StudentPayment record);

    int updateByPrimaryKey(StudentPayment record);
}