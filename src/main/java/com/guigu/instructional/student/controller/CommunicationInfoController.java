package com.guigu.instructional.student.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.po.CommunicationInfo;
import com.guigu.instructional.po.CommunicationInfoCustom;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StudentInfo;
import com.guigu.instructional.student.service.CommunicationInfoCustomService;
import com.guigu.instructional.student.service.CommunicationInfoService;
import com.guigu.instructional.student.service.StudentInfoService;
import com.guigu.instructional.system.service.StaffInfoService;

@Controller
@RequestMapping("/student/communicationinfo/")
public class CommunicationInfoController {
	
	@Resource(name = "communicationInfoServiceImpl")
	private CommunicationInfoService communicationInfoService;
	
	@Resource(name = "communicationInfoCustomServiceImpl")
	private CommunicationInfoCustomService communicationInfoCustomService;
	
	@Resource(name = "studentInfoServiceImpl")
	private StudentInfoService studentInfoService;
	
	@Resource(name = "staffInfoServiceImpl")
	private StaffInfoService staffInfoService;
	
	@RequestMapping("add.action")
	public String addCommunicationInfo(@Validated CommunicationInfo communicationInfo, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			
			//查询所有的学员信息
			List<StudentInfo> listOfStudent = studentInfoService.getStudentInfoList(null);
			model.addAttribute("studentInfolist", listOfStudent);
			
			//查询所有的职工信息
			List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
			model.addAttribute("staffInfolist", listOfStaff);
			
	        return "student/communicateinfo/communicateinfo_add";
		}
		
		boolean result = communicationInfoService.addCommunication(communicationInfo);
		if(result) {
			model.addAttribute("info","添加成功");
		}else {
			model.addAttribute("info","添加失败");
		}
		return this.list(null, model);
	}

	 @RequestMapping("update.action")
	    public String updateCommunicationInfo(@Validated CommunicationInfo communicationInfo, BindingResult bindingResult, Model model) {
	        
			if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			
			//查询所有的学员信息
			List<StudentInfo> listOfStudent = studentInfoService.getStudentInfoList(null);
			model.addAttribute("studentInfolist", listOfStudent);
			
			//查询所有的职工信息
			List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
			model.addAttribute("staffInfolist", listOfStaff);
			
			return "student/communicateinfo/communicateinfo_add";
			}
		 
		 	boolean result=communicationInfoService.updateCommunication(communicationInfo);
	        if(result) {
	            model.addAttribute("info", "修改成功");
	        }else {
	            model.addAttribute("info", "修改失败");
	        }
	        return this.list(null, model);
	    }
	    
	    @RequestMapping("delete.action")
	    public String deleteCommunicationInfo(Integer communicationId,Model model) {
	        
	        boolean result =communicationInfoCustomService.deleteCommunication(communicationId);
	        if(result) {
	            model.addAttribute("info", "删除成功");
	        }else {
	            model.addAttribute("info", "删除失败");
	        }
	        return this.list(null, model);
	    }
	@RequestMapping("list.action")
	private String list(StudentInfo studentInfo, Model model) {
		
		List<CommunicationInfoCustom> list = communicationInfoCustomService.getCommunicationInfoCustomList(studentInfo);
		model.addAttribute("list",list);
		return "student/communicateinfo/communicateinfo_list";
	}
	
	@RequestMapping("show.action")
    public String showStudentInfoCustom(Integer communicationId,Model model) {
		CommunicationInfo communicationInfo =communicationInfoService.getCommunicationInfo(communicationId);
        model.addAttribute("communicationInfo", communicationInfo);
        return "student/communicateinfo/communicateinfo_show";
        
    }
    
    @RequestMapping("load.action")
    public String loadUpate(Integer communicationId,Model model) {
    	CommunicationInfo communicationInfo = communicationInfoService.getCommunicationInfo(communicationId);
        model.addAttribute("communicationInfo", communicationInfo);
        
        //查询所有的学员信息
		List<StudentInfo> listOfStudent = studentInfoService.getStudentInfoList(null);
		model.addAttribute("studentInfolist", listOfStudent);
		
		//查询所有的职工信息
		List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
		model.addAttribute("staffInfolist", listOfStaff);
		
        return "student/communicateinfo/communicateinfo_update";
    }
    
    @RequestMapping("addload.action")
    public String listaddCommunicationInfo(Integer communicationId, Model model) {
		CommunicationInfo communicationInfo = communicationInfoService.getCommunicationInfo(communicationId);
		model.addAttribute("communicationInfo", communicationInfo);
		
		//查询所有的学员信息
		List<StudentInfo> listOfStudent = studentInfoService.getStudentInfoList(null);
		model.addAttribute("studentInfolist", listOfStudent);
		
		//查询所有的职工信息
		List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
		model.addAttribute("staffInfolist", listOfStaff);
		
		return "student/communicateinfo/communicateinfo_add";
    }
    
   
    
}
