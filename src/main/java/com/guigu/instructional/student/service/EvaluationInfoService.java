package com.guigu.instructional.student.service;

import com.guigu.instructional.po.EvaluationInfo;

public interface EvaluationInfoService {

	/**
	 * addStudent:添加学员评价信息
	 * @param evaluationInfo
	 * @return
	 */
	public boolean addEvaluation(EvaluationInfo evaluationInfo);
	
	/**
	 * deleteEvaluationInfo:删除学员评价信息
	 * @param evaluationId
	 * @return
	 */
	public boolean deleteEvaluationInfo(Integer evaluationId);
	
	/**
	 * updateStudent:更新学员评价信息
	 * @param evaluationInfo
	 * @return
	 */
	public boolean updateEvaluation(EvaluationInfo evaluationInfo);
	
	/**
	 * getStudentInfo:查询学员评价信息
	 * @param evaluationId
	 * @return
	 */
	public EvaluationInfo getEvaluationInfo(Integer evaluationId);
	
	
}
