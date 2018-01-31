package com.guigu.instructional.student.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.StudentInfo;
import com.guigu.instructional.po.StudentInfoExample;
import com.guigu.instructional.po.StudentInfoExample.Criteria;
import com.guigu.instructional.student.mapper.StudentInfoMapper;
import com.guigu.instructional.student.service.StudentInfoService;

@Service("studentInfoServiceImpl")
public class StudentInfoServiceImpl implements StudentInfoService {

	@Resource(name = "studentInfoMapper")
	private StudentInfoMapper studentInfoMapper;
	
	@Override
	public boolean addStudent(StudentInfo studentInfo) {
		
		try {
			int i =studentInfoMapper.insertSelective(studentInfo);
			if(i > 0) {
				return true;
			}
		} catch (Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean updateStudent(StudentInfo studentInfo) {
		
		try {
			int i = studentInfoMapper.updateByPrimaryKeySelective(studentInfo);
			if(i > 0) {
				return true;
			}
		} catch (Exception e){
			
		}
		return false;
	}

	@Override
	public List<StudentInfo> getStudentInfoList(StudentInfo studentInfo) {
		
		StudentInfoExample studentInfoExample = new StudentInfoExample();
		Criteria criteria = studentInfoExample.createCriteria();
		
		if(studentInfo!=null) {
			//id
			if(studentInfo.getStudentId()!=null) {
				criteria.andStudentIdEqualTo(studentInfo.getStudentId());
			}
			
			//name
			if(studentInfo.getStudentName()!=null) {
				studentInfo.setStudentName("%"+studentInfo.getStudentName()+"%");
				criteria.andStudentNameLike(studentInfo.getStudentName());
			}
			
			// telephone
			if(studentInfo.getStudentTellphone()!=null) {
				criteria.andStudentTellphoneEqualTo(studentInfo.getStudentTellphone());
			}
		}else {
			return studentInfoMapper.selectByExample(null);
		}
		/*
		 * 查询所有正常的学员的数据
		 * 1：正常 
		 * 0：删除
		 */
		criteria.andStudentStateEqualTo(1);
		
		return studentInfoMapper.selectByExample(studentInfoExample);
		
	}

	@Override
	public StudentInfo getStudentInfo(Integer studentId) {
		
		return studentInfoMapper.selectByPrimaryKey(studentId);
	}

}
