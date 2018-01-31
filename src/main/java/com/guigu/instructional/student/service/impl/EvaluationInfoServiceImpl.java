package com.guigu.instructional.student.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.EvaluationInfo;
import com.guigu.instructional.student.mapper.EvaluationInfoMapper;
import com.guigu.instructional.student.service.EvaluationInfoService;

@Service("evaluationInfoServiceImpl")
public class EvaluationInfoServiceImpl implements EvaluationInfoService {

	@Resource(name = "evaluationInfoMapper")
	private EvaluationInfoMapper evaluationInfoMapper;
	
	@Override
	public boolean addEvaluation(EvaluationInfo evaluationInfo) {
		
		try {
			int i = evaluationInfoMapper.insertSelective(evaluationInfo);
			if(i > 0) {
				return true;
			}
		} catch (Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean deleteEvaluationInfo(Integer evaluationId) {
		try {
			int i = evaluationInfoMapper.deleteByPrimaryKey(evaluationId);
			if(i > 0) {
				return true;
			}
		} catch (Exception e){
			
		}
		return false;
	}
	
	@Override
	public boolean updateEvaluation(EvaluationInfo evaluationInfo) {
		
		try {
			int i = evaluationInfoMapper.updateByPrimaryKeySelective(evaluationInfo);
			if(i > 0) {
				return true;
			}
		} catch (Exception e){
			
		}
		return false;
	}

	
	@Override
	public EvaluationInfo getEvaluationInfo(Integer evaluationId) {
		
		return evaluationInfoMapper.selectByPrimaryKey(evaluationId);
	}

	
}
