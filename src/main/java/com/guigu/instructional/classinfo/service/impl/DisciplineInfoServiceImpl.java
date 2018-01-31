package com.guigu.instructional.classinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.classinfo.mapper.DisciplineInfoMapper;
import com.guigu.instructional.classinfo.service.DisciplineInfoService;
import com.guigu.instructional.po.DisciplineInfo;
import com.guigu.instructional.po.DisciplineInfoExample;
import com.guigu.instructional.po.DisciplineInfoExample.Criteria;

@Service("disciplineInfoServiceImpl")
public class DisciplineInfoServiceImpl implements DisciplineInfoService{
	
	@Resource(name="disciplineInfoMapper")
	private DisciplineInfoMapper disciplineInfoMapper;
	
	@Override
	public boolean addDisciplineInfo(DisciplineInfo disciplineInfo) {
		if(disciplineInfo!=null) {
			disciplineInfo.setDisciplineIsused("1");
		}
		try {
            int i = disciplineInfoMapper.insertSelective(disciplineInfo);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {

        }
		return false;
	}

	@Override
	public boolean updateDisciplineInfo(DisciplineInfo disciplineInfo) {
		try {
            int i = disciplineInfoMapper.updateByPrimaryKeySelective(disciplineInfo);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {

        }
		return false;
	}

	@Override
	public List<DisciplineInfo> getDisciplineInfoList(DisciplineInfo disciplineInfo) {
		DisciplineInfoExample disciplineInfoExample=new DisciplineInfoExample();
		Criteria criteria=disciplineInfoExample.createCriteria();
		
		if(disciplineInfo!=null) {
			if(disciplineInfo.getDisciplineId()!=null) {
				criteria.andDisciplineIdEqualTo(disciplineInfo.getDisciplineId());
			}
			if(disciplineInfo.getDisciplineName()!=null) {
				disciplineInfo.setDisciplineName("%"+disciplineInfo.getDisciplineName()+"%");
				criteria.andDisciplineNameLike(disciplineInfo.getDisciplineName());
			}
			if(disciplineInfo.getDisciplineTuition()!=null) {
				criteria.andDisciplineTuitionLessThanOrEqualTo(disciplineInfo.getDisciplineTuition());
			}
		}
		criteria.andDisciplineIsusedEqualTo("1");
		
		return disciplineInfoMapper.selectByExample(disciplineInfoExample);
	}

	@Override
	public DisciplineInfo getDisciplineInfo(Integer disciplineId) {
		return disciplineInfoMapper.selectByPrimaryKey(disciplineId);
	}

}
