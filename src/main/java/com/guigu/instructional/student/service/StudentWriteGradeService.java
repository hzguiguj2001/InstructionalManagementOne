package com.guigu.instructional.student.service;

import com.guigu.instructional.po.StudentWriteGrade;

public interface StudentWriteGradeService {

	/**
	 * addStudentWriteGrade:添加学员成绩信息
	 * @param studentWriteGrade
	 * @return
	 */
	public boolean addStudentWriteGrade(StudentWriteGrade studentWriteGrade);
	
	/**
	 * deleteStudentWriteGrade:删除学员成绩信息
	 * @param writeGradeId
	 * @return
	 */
	public boolean deleteStudentWriteGrade(Integer writeGradeId);
	
	/** 
	 * updateStudentWriteGrade:更新学员成绩信息
	 * @param studentWriteGrade
	 * @return
	 */
	public boolean updateStudentWriteGrade(StudentWriteGrade studentWriteGrade);

	/**
	 * getStudenWriteGrade:查找学员成绩信息
	 * @param writeGradeId
	 * @return
	 */
	public StudentWriteGrade getStudentWriteGrade(Integer writeGradeId);
}

