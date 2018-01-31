package com.guigu.instructional.student.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.CommunicationInfo;
import com.guigu.instructional.po.CommunicationInfoCustom;
import com.guigu.instructional.po.CommunicationInfoExample;
import com.guigu.instructional.po.CommunicationInfoExample.Criteria;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StudentInfo;
import com.guigu.instructional.po.StudentInfoExample;
import com.guigu.instructional.student.mapper.CommunicationInfoMapper;
import com.guigu.instructional.student.mapper.StudentInfoMapper;
import com.guigu.instructional.student.service.CommunicationInfoCustomService;
import com.guigu.instructional.system.mapper.StaffInfoMapper;

@Service("communicationInfoCustomServiceImpl")
public class CommunicationInfoCustomServiceImpl implements CommunicationInfoCustomService {

	@Resource(name = "communicationInfoMapper")
	private CommunicationInfoMapper communicationInfoMapper;

	@Resource(name = "studentInfoMapper")
	private StudentInfoMapper studentInfoMapper;
	
	@Resource(name = "staffInfoMapper")
	private StaffInfoMapper staffInfoMapper;
	
	@Override
	public boolean addCommunication(CommunicationInfo communicationInfo) {
		
		try {
			int i =communicationInfoMapper.insertSelective(communicationInfo);
			if(i > 0) {
				return true;
			}
		} catch (Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean deleteCommunication(Integer communicationId) {
		try {
			int i = communicationInfoMapper.deleteByPrimaryKey(communicationId);
			if(i > 0) {
				return true;
			}
		} catch (Exception e){
			
		}
		return false;
	}
	
	@Override
	public boolean updateCommunication(CommunicationInfo communicationInfo) {

		try {
			int i = communicationInfoMapper.updateByPrimaryKeySelective(communicationInfo);
			if(i > 0) {
				return true;
			}
		} catch (Exception e){
			
		}
		return false;

	}


	@Override
	public CommunicationInfoCustom getCommunicationInfoCustom(Integer communicationId) {
		
		CommunicationInfo communicationInfo = communicationInfoMapper.selectByPrimaryKey(communicationId);
		
		//查询与学生编号对应的学生姓名
		Integer studentId = communicationInfo.getStudentId();
		StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(studentId);
		String studentName = studentInfo.getStudentName();
		
		//查询与员工编号对应的员工姓名
		Integer staffId = communicationInfo.getStaffId();
		StaffInfo staffInfo = staffInfoMapper.selectByPrimaryKey(staffId);
		String staffName = staffInfo.getStaffName();
		
		//赋值封装类的对象
		CommunicationInfoCustom communicationInfoCustom = new CommunicationInfoCustom();
		communicationInfoCustom.setCommunicationInfo(communicationInfo);
		communicationInfoCustom.setStudentName(studentName);
		communicationInfoCustom.setStaffName(staffName);
		
		return communicationInfoCustom;
	}
	
	@Override
	public List<CommunicationInfoCustom> getCommunicationInfoCustomList(StudentInfo studentInfo) {
		
		CommunicationInfoExample communicationInfoExample = new CommunicationInfoExample();
		Criteria criteriaOfCommunication = communicationInfoExample.createCriteria();
		
		StudentInfoExample studentInfoExample = new StudentInfoExample();
		com.guigu.instructional.po.StudentInfoExample.Criteria criteriaStudentInfo = studentInfoExample.createCriteria();
		criteriaStudentInfo.andStudentStateEqualTo(1);
		
		if(studentInfo!=null) {
			if(studentInfo.getStudentName()!=null && !studentInfo.getStudentName().equals("")) {
				//学生姓名模糊查询
				studentInfo.setStudentName("%"+studentInfo.getStudentName()+"%");
				criteriaStudentInfo.andStudentNameLike(studentInfo.getStudentName());
				//把查询到的学生姓名数据放入列表
				List<StudentInfo> listOfAll = studentInfoMapper.selectByExample(studentInfoExample); 
				List<Integer> listOfStudentId = new ArrayList<>();
				for (StudentInfo student : listOfAll) {
					listOfStudentId.add(student.getStudentId());
				}
				if(listOfStudentId.isEmpty()) {
					return null;
				}else {
					criteriaOfCommunication.andStudentIdIn(listOfStudentId);
				}
			}
			if(studentInfo.getStudentId()!=null && !studentInfo.getStudentId().equals("")) {
				criteriaOfCommunication.andStudentIdEqualTo(studentInfo.getStudentId());
			}
		}
		
		List<CommunicationInfo> listCommunicationInfo = communicationInfoMapper.selectByExample(communicationInfoExample);
		if(listCommunicationInfo!=null){
			List<CommunicationInfoCustom> listCommunicationInfoCustom = new ArrayList<>();
			for(CommunicationInfo communication:listCommunicationInfo) {
				
				CommunicationInfoCustom communicationInfoCustom = this.getCommunicationInfoCustom(communication.getCommunicationId());
				listCommunicationInfoCustom.add(communicationInfoCustom);
				
			}
			return listCommunicationInfoCustom;			
		}
		return null;
	}
	
}
