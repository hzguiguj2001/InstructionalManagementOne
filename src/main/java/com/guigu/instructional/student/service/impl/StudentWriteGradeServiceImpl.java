package com.guigu.instructional.student.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.StudentWriteGrade;
import com.guigu.instructional.student.mapper.StudentWriteGradeMapper;
import com.guigu.instructional.student.service.StudentWriteGradeService;

@Service("studentWriteGradeServiceImpl")
public class StudentWriteGradeServiceImpl implements StudentWriteGradeService{

	@Resource(name = "studentWriteGradeMapper")
	private StudentWriteGradeMapper studentWriteGradeMapper;

	@Override
	public boolean addStudentWriteGrade(StudentWriteGrade studentWriteGrade) {
		try {
			int i =studentWriteGradeMapper.insertSelective(studentWriteGrade);
			if(i > 0) {
				return true;
			}
		} catch (Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean deleteStudentWriteGrade(Integer writeGradeId) {
		try {
			int i = studentWriteGradeMapper.deleteByPrimaryKey(writeGradeId);
			if(i > 0) {
				return true;
			}
		} catch (Exception e){
			
		}
		return false;
	}

	@Override
	public boolean updateStudentWriteGrade(StudentWriteGrade studentWriteGrade) {
		try {
			int i = studentWriteGradeMapper.updateByPrimaryKeySelective(studentWriteGrade);
			if(i > 0) {
				return true;
			}
		} catch (Exception e){
			
		}
		return false;
	}

	@Override
	public StudentWriteGrade getStudentWriteGrade(Integer writeGradeId) {
		return studentWriteGradeMapper.selectByPrimaryKey(writeGradeId);
	}

}
