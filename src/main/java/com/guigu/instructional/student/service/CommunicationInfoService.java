package com.guigu.instructional.student.service;

import java.util.List;

import com.guigu.instructional.po.CommunicationInfo;


public interface CommunicationInfoService {

	/**
	 * addStudent:添加学员信息
	 * @param communicationInfo
	 * @return
	 */
	public boolean addCommunication(CommunicationInfo communicationInfo);
	
	/**
	 * updateStudent:更新学员数据
	 * @param communicationInfo
	 * @return
	 */
	public boolean updateCommunication(CommunicationInfo communicationInfo);
	
	/**
	 * getStudentInfoList:根据条件查询学员信息
	 * @param communicationInfo
	 * @return
	 */
	public List<CommunicationInfo> getCommunicationInfoList(CommunicationInfo communicationInfo);
	
	/**
	 * getStudentInfo:根据员工编号查询学员信息
	 * @param communicationId
	 * @return
	 */
	public CommunicationInfo getCommunicationInfo(Integer communicationId);
}
