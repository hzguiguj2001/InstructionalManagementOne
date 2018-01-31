package com.guigu.instructional.classinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.classinfo.mapper.SyllabusInfoMapper;
import com.guigu.instructional.classinfo.service.SyllabusInfoService;
import com.guigu.instructional.po.SyllabusInfo;
import com.guigu.instructional.po.SyllabusInfoExample;
import com.guigu.instructional.po.SyllabusInfoExample.Criteria;

@Service("syllabusInfoServiceImpl")
public class SyllabusInfoServiceImpl implements SyllabusInfoService {
	
	@Resource(name="syllabusInfoMapper")
	private SyllabusInfoMapper syllabusInfoMapper;
	
	@Override
	public boolean addSyllabusInfo(SyllabusInfo syllabusInfo) {
		if(syllabusInfo!=null) {
			syllabusInfo.setSyllabusIsused("1");
		}
		try {
			int i=syllabusInfoMapper.insertSelective(syllabusInfo);
			if(i>0) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean updateSyllabusInfo(SyllabusInfo syllabusInfo) {
		try {
			int i=syllabusInfoMapper.updateByPrimaryKeySelective(syllabusInfo);
			if(i>0) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public List<SyllabusInfo> getSyllabusInfoList(SyllabusInfo syllabusInfo) {
		SyllabusInfoExample syllabusInfoExample=new SyllabusInfoExample();
		Criteria criteria=syllabusInfoExample.createCriteria();
		
		if(syllabusInfo!=null) {
			if(syllabusInfo.getSyllabusId()!=null) {
				criteria.andSyllabusIdEqualTo(syllabusInfo.getSyllabusId());
			}
			if(syllabusInfo.getSyllabusName()!=null) {
				syllabusInfo.setSyllabusName("%"+syllabusInfo.getSyllabusName()+"%");
				criteria.andSyllabusNameLike(syllabusInfo.getSyllabusName());
			}
		}
		criteria.andSyllabusIsusedEqualTo("1");
		return syllabusInfoMapper.selectByExample(syllabusInfoExample);
	}

	@Override
	public SyllabusInfo getSyllabusInfo(Integer syllabusId) {
		return syllabusInfoMapper.selectByPrimaryKey(syllabusId);
	}
	
}
