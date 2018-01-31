package com.guigu.instructional.student.service;

import java.util.List;

import com.guigu.instructional.po.CommunicationInfo;
import com.guigu.instructional.po.CommunicationInfoCustom;
import com.guigu.instructional.po.StudentInfo;


public interface CommunicationInfoCustomService {

	/**
	 * addCommunication:添加学员沟通记录
	 * @param communicationInfo
	 * @return
	 */
	public boolean addCommunication(CommunicationInfo communicationInfo);
	
	/**
	 * deleteCommunication:删除学员沟通记录
	 * @param communicationId
	 * @return
	 */
	public boolean deleteCommunication(Integer communicationId);
	
	/**
	 * updateCommunication:更新学员沟通记录
	 * @param communicationInfo
	 * @return
	 */
	public boolean updateCommunication(CommunicationInfo communicationInfo);
	
	/**
	 * getCommunicationInfoCustom:根据沟通编号查询学员沟通记录
	 * @param communicationId
	 * @return
	 */
	public CommunicationInfoCustom getCommunicationInfoCustom(Integer communicationId);
	
	/**
	 * getCommunicationInfoList:根据条件查询学员沟通记录
	 * @param studentInfo
	 * @return
	 */
	public List<CommunicationInfoCustom> getCommunicationInfoCustomList(StudentInfo studentInfo);

}
