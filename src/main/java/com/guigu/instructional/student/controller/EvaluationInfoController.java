package com.guigu.instructional.student.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.classinfo.service.DisciplineInfoService;
import com.guigu.instructional.po.DisciplineInfo;
import com.guigu.instructional.po.EvaluationInfo;
import com.guigu.instructional.po.EvaluationInfoCustom;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StudentInfo;
import com.guigu.instructional.student.service.EvaluationInfoCustomService;
import com.guigu.instructional.student.service.EvaluationInfoService;
import com.guigu.instructional.student.service.StudentInfoService;
import com.guigu.instructional.system.service.StaffInfoService;

@Controller
@RequestMapping("/student/evaluationinfo/")
public class EvaluationInfoController {
	
	@Resource(name = "evaluationInfoServiceImpl")
	private EvaluationInfoService evaluationInfoService;
	
	@Resource(name = "evaluationInfoCustomServiceImpl")
	private EvaluationInfoCustomService evaluationInfoCustomService;
	
	@Resource(name = "studentInfoServiceImpl")
	private StudentInfoService studentInfoService;
	
	@Resource(name = "staffInfoServiceImpl")
	private StaffInfoService staffInfoService;
	
	@Resource(name = "disciplineInfoServiceImpl")
	private DisciplineInfoService disciplineInfoService;
	
	@RequestMapping("add.action")
	public String addEvaluationInfo(@Validated EvaluationInfo evaluationInfo, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			
			model.addAttribute("evaluationInfo", evaluationInfo);
			//查询所有的学员信息
			List<StudentInfo> list =studentInfoService.getStudentInfoList(null);
			model.addAttribute("studentInfoList", list);
			//查询所有的职工信息
			List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
			model.addAttribute("staffInfoList", listOfStaff);
			//查询所有的科目信息
			List<DisciplineInfo> listOfDisciplineInfo = disciplineInfoService.getDisciplineInfoList(null);
			model.addAttribute("disciplineInfoList", listOfDisciplineInfo);
			
			return "student/evaluationinfo/evaluationinfo_add";
		}
		boolean result = evaluationInfoService.addEvaluation(evaluationInfo);
		if(result) {
			model.addAttribute("info","添加成功");
		}else {
			model.addAttribute("info","添加失败");
		}
		return this.list(null, model);
	}

	@RequestMapping("delete.action")
    public String deletestudentInfo(Integer evaluationId, Model model) {
        
        boolean result =evaluationInfoService.deleteEvaluationInfo(evaluationId);
        if(result) {
            model.addAttribute("info", "删除成功");
        }else {
            model.addAttribute("info", "删除失败");
        }
        return this.list(null, model);
    }
	
	@RequestMapping("update.action")
    public String updatestudentInfo(@Validated EvaluationInfo evaluationInfo, BindingResult bindingResult, Model model) {
        
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			
			model.addAttribute("evaluationInfo", evaluationInfo);
			//查询所有的学员信息
			List<StudentInfo> list =studentInfoService.getStudentInfoList(null);
			model.addAttribute("studentInfoList", list);
			//查询所有的职工信息
			List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
			model.addAttribute("staffInfoList", listOfStaff);
			//查询所有的科目信息
			List<DisciplineInfo> listOfDisciplineInfo = disciplineInfoService.getDisciplineInfoList(null);
			model.addAttribute("disciplineInfoList", listOfDisciplineInfo);
			
			return "student/evaluationinfo/evaluationinfo_update";
		}
		
		boolean result=evaluationInfoService.updateEvaluation(evaluationInfo);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
    }
	
	@RequestMapping("list.action")
	private String list(EvaluationInfo evaluationInfo, Model model) {
		
		List<EvaluationInfoCustom> list = evaluationInfoCustomService.getEvaluationInfoCustomList(evaluationInfo);
		model.addAttribute("list",list);
		return "student/evaluationinfo/evaluationinfo_list";
	}
	
	@RequestMapping("show.action")
    public String showStudentInfo(Integer evaluationId, Model model) {
		EvaluationInfoCustom evaluationInfoCustom = evaluationInfoCustomService.getEvaluationInfoCustom(evaluationId);
        model.addAttribute("evaluationInfoCustom", evaluationInfoCustom);
        return "student/evaluationinfo/evaluationinfo_show";
        
    }
    
	@RequestMapping("load.action")
	public String loadUpate(Integer evaluationId, Model model) {
		
		EvaluationInfo evaluationInfo = evaluationInfoService.getEvaluationInfo(evaluationId);
		model.addAttribute("evaluationInfo", evaluationInfo);
		//查询所有的学员信息
		List<StudentInfo> list =studentInfoService.getStudentInfoList(null);
		model.addAttribute("studentInfoList", list);
		//查询所有的职工信息
		List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
		model.addAttribute("staffInfoList", listOfStaff);
		//查询所有的科目信息
		List<DisciplineInfo> listOfDisciplineInfo = disciplineInfoService.getDisciplineInfoList(null);
		model.addAttribute("disciplineInfoList", listOfDisciplineInfo);
		
		return "student/evaluationinfo/evaluationinfo_update";
	}
	
	@RequestMapping("addload.action")
	public String listaddEvaluationInfoInfo(Integer evaluationId, Model model) {
		
		EvaluationInfo evaluationInfo = evaluationInfoService.getEvaluationInfo(evaluationId);
		model.addAttribute("evaluationInfo", evaluationInfo);
		//查询所有的学员信息
		List<StudentInfo> studentInfolist =studentInfoService.getStudentInfoList(null);
		model.addAttribute("studentInfoList", studentInfolist);
		//查询所有的职工信息
		List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
		model.addAttribute("staffInfoList", listOfStaff);
		//查询所有的学科信息
		List<DisciplineInfo> listOfDisciplineInfo = disciplineInfoService.getDisciplineInfoList(null);
		model.addAttribute("disciplineInfoList", listOfDisciplineInfo);
		
		return "student/evaluationinfo/evaluationinfo_add";
	} 
    
    

}
