package com.guigu.instructional.payment.mapper;

import java.util.List;

import com.guigu.instructional.po.StaffSalary;
import com.guigu.instructional.po.StaffSalaryCustom;

public interface StaffSalaryCustomMapper {

	public List<StaffSalaryCustom> findStaffSalaryList(StaffSalary staffSalary);
}