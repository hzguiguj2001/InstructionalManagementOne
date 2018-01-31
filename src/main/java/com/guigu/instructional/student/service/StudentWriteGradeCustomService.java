package com.guigu.instructional.student.service;

import java.util.List;

import com.guigu.instructional.po.StudentInfo;
import com.guigu.instructional.po.StudentWriteGradeCustom;

public interface StudentWriteGradeCustomService {

	/**
	 * getStudentWriteGradeCustom:查询学员成绩信息
	 * @param writeGradeId
	 * @return
	 */
	public StudentWriteGradeCustom getStudentWriteGradeCustom(Integer writeGradeId);

	/**
	 * getStudentWriteGradeCustomList:查询学员成绩信息
	 * @param studentInfo
	 * @return
	 */
	public List<StudentWriteGradeCustom> getStudentWriteGradeCustomList(StudentInfo studentInfo);
	 
}
