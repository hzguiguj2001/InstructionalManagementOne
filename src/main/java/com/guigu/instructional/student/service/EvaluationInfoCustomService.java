package com.guigu.instructional.student.service;

import java.util.List;

import com.guigu.instructional.po.EvaluationInfo;
import com.guigu.instructional.po.EvaluationInfoCustom;

public interface EvaluationInfoCustomService {
	
	/**
	 * getEvaluationInfoCustom:根据员工编号查询学员评价信息
	 * @param evaluationId
	 * @return
	 */
	public EvaluationInfoCustom getEvaluationInfoCustom(Integer evaluationId);
	
	/**
	 * getEvaluationInfoListCustom:根据条件查询学员评价信息
	 * @param evaluationInfo
	 * @return
	 */
	public List<EvaluationInfoCustom> getEvaluationInfoCustomList(EvaluationInfo evaluationInfo);
	
}
