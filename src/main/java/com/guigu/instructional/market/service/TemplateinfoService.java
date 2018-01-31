package com.guigu.instructional.market.service;

import java.util.List;

import com.guigu.instructional.po.TemplateInfo;

	
public interface TemplateinfoService {

	//增加模版
	public boolean addTemplate(TemplateInfo templateInfo);
    
	//修改模版
    public boolean updateTemplate(TemplateInfo templateInfo);
    
    //查询模版(根据条件查询）
    public List<TemplateInfo> getTemplateinfoList(TemplateInfo templateInfo);
    
    //根据编号查询模版
    public TemplateInfo getTemplateinfo(Integer templateId);
    
    
    public boolean deleteTemplate(Integer templateId);
    
	
}
