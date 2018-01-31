package com.guigu.instructional.system.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.po.DataDictionary;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.system.service.DataDictionaryService;

@Controller
@RequestMapping("/system/datadictionary/")
public class DataDictionaryController {

	@Resource(name="datadictionaryserviceImpl")
	private DataDictionaryService dataDictionaryService;
	
	@RequestMapping("add.action")
	public String addDataDictionary(DataDictionary dataDictionary, Model model) {
		
		boolean result = dataDictionaryService.addDataDictionary(dataDictionary);
		if (result) {
			model.addAttribute("info", "-Addsuccess");
		} else {
			model.addAttribute("info", "-Adddefult");
		}
		return this.list(null, model);
	}
	
	
	@RequestMapping("update.action")
	public String updateDataDictionary(DataDictionary dataDictionary, Model model) {
		
		boolean result = dataDictionaryService.updateDataDictionary(dataDictionary);
		if (result) {
			model.addAttribute("info", "-Updatesuccess");
		} else {
			model.addAttribute("info", "-Updatedefult");
		}
		return this.list(null, model);
	}
	
	
	@RequestMapping("updateload.action")
	public String updateloadDataDictionary(Integer dataId,Model model) {
		DataDictionary dataDictionary =dataDictionaryService.getDataDictionary(dataId);
		model.addAttribute("dataDictionary", dataDictionary);
		return "system/datadictionary/datadictionary_update";
	}
	
	
	@RequestMapping("list.action")
	public String list(DataDictionary dataDictionary, Model model) {
		List<DataDictionary> list = dataDictionaryService.getStaffInfoList(dataDictionary);
		model.addAttribute("list", list);
		return "system/datadictionary/datadictionary_list";
	}
	
	

	@RequestMapping("addload.action")
	public String list1( Model model) {
		
		return "system/datadictionary/datadictionary_add";
	}
	
	@RequestMapping("delete.action")
	public String deleteDataDictionary(Integer dataId, Model model) {
		boolean result = dataDictionaryService.deleteDataDictionary(dataId);
		if (result) {
			model.addAttribute("info", "-Deletesuccess");
		} else {
			model.addAttribute("info", "-Deletedefult");
		}
		return this.list(null, model);
	
	
}}
