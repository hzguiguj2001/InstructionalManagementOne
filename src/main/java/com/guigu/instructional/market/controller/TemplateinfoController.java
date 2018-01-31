package com.guigu.instructional.market.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.market.service.TemplateinfoService;
import com.guigu.instructional.po.TemplateInfo;

@Controller
@RequestMapping("/marketactive/template")
public class TemplateinfoController {

	@Resource(name="templateinfoServiceImpl")
	private TemplateinfoService templateinfoService;
	
	@RequestMapping("delete.action")
    public String deleteTemplateinfo(Integer templateId,Model model) {
        
        boolean result =templateinfoService.deleteTemplate(templateId);
        if(result) {
            model.addAttribute("info", "删除成功");
        }else {
            model.addAttribute("info", "删除失败");
        }
        return this.list(null, model);
    }
	
	@RequestMapping("load.action")
    public String loadUpateTemplateinfo(Integer templateId,Model model) {
		TemplateInfo templateInfo =templateinfoService.getTemplateinfo(templateId);
        model.addAttribute("templateInfo", templateInfo);
        return "marketactive/template/template_update";
    }
	
	@RequestMapping("update.action")
    public String updateTemplateinfo(TemplateInfo templateInfo,Model model) {
        boolean result=templateinfoService.updateTemplate(templateInfo);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
    }
	
	
	@RequestMapping("add.action")
	public String addTemplateinfo(TemplateInfo templateInfo,Model model) {
		boolean result = templateinfoService.addTemplate(templateInfo);
		if(result) {
			model.addAttribute("info", "添加成功");
		}else {
			model.addAttribute("info", "添加失败");

		}
		
		return this.list(null, model);
	}
	
	@RequestMapping("list.action")
	public String list(TemplateInfo templateInfo,Model model) {
		
		List<TemplateInfo> list = templateinfoService.getTemplateinfoList(templateInfo);
//		System.out.println(list);
		model.addAttribute("list",list);
//		System.out.println(list);
		
		return "marketactive/template/template_list";
		
	}
	
	
}
