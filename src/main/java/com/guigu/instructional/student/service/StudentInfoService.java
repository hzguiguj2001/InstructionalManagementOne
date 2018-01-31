package com.guigu.instructional.student.service;

import java.util.List;

import com.guigu.instructional.po.StudentInfo;

public interface StudentInfoService {

	/**
	 * addStudent:添加学员信息
	 * @param studentInfo
	 * @return
	 */
	public boolean addStudent(StudentInfo studentInfo);
	
	/**
	 * updateStudent:更新学员数据
	 * @param studentInfo
	 * @return
	 */
	public boolean updateStudent(StudentInfo studentInfo);
	
	/**
	 * getStudentInfoList:根据条件查询学员信息
	 * @param studentInfo
	 * @return
	 */
	public List<StudentInfo> getStudentInfoList(StudentInfo studentInfo);
	
	/**
	 * getStudentInfo:根据员工编号查询学员信息
	 * @param studentId
	 * @return
	 */
	public StudentInfo getStudentInfo(Integer studentId);
}
