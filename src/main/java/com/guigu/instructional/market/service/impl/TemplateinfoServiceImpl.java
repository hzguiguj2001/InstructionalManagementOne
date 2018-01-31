package com.guigu.instructional.market.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.market.mapper.TemplateInfoMapper;
import com.guigu.instructional.market.service.TemplateinfoService;
import com.guigu.instructional.po.TemplateInfo;
import com.guigu.instructional.po.TemplateInfoExample;
import com.guigu.instructional.po.TemplateInfoExample.Criteria;

@Service("templateinfoServiceImpl")
public class TemplateinfoServiceImpl implements TemplateinfoService{

	@Resource(name="templateInfoMapper")
	private TemplateInfoMapper templateInfoMapper;
	
	
	
	@Override
	public boolean addTemplate(TemplateInfo templateInfo) {
		int i = templateInfoMapper.insertSelective(templateInfo);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateTemplate(TemplateInfo templateInfo) {
		
		
		try {
			int i = templateInfoMapper.updateByPrimaryKeySelective(templateInfo);
			if(i>0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public TemplateInfo getTemplateinfo(Integer templateId) {
		
		return templateInfoMapper.selectByPrimaryKey(templateId);
	}

	@Override
	public List<TemplateInfo> getTemplateinfoList(TemplateInfo templateInfo) {
		TemplateInfoExample templateInfoExample =new TemplateInfoExample();
	    Criteria criteria =templateInfoExample.createCriteria();
	        
	    if(templateInfo!=null && templateInfo.getTemplateTitle()!=null) {
	    	templateInfo.setTemplateTitle("%"+templateInfo.getTemplateTitle()+"%");
            criteria.andTemplateTitleLike(templateInfo.getTemplateTitle());
        }
        
	    return templateInfoMapper.selectByExample(templateInfoExample);
	}

	@Override
	public boolean deleteTemplate(Integer templateId) {
		
		int i = templateInfoMapper.deleteByPrimaryKey(templateId);
		if(i>0) {
			return true;
		}
		
		return false;
	}

}
