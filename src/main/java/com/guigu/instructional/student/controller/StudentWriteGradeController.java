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
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StudentInfo;
import com.guigu.instructional.po.StudentWriteGrade;
import com.guigu.instructional.po.StudentWriteGradeCustom;
import com.guigu.instructional.student.service.StudentInfoService;
import com.guigu.instructional.student.service.StudentWriteGradeCustomService;
import com.guigu.instructional.student.service.StudentWriteGradeService;
import com.guigu.instructional.system.service.StaffInfoService;

@Controller
@RequestMapping("/student/studentwritegrade/")
public class StudentWriteGradeController {
	
	@Resource(name = "studentWriteGradeServiceImpl")
	private StudentWriteGradeService studentWriteGradeService;
	
	@Resource(name = "studentWriteGradeCustomServiceImpl")
	private StudentWriteGradeCustomService studentWriteGradeCustomService;
	
	@Resource(name = "studentInfoServiceImpl")
	private StudentInfoService studentInfoService;
	
	@Resource(name = "staffInfoServiceImpl")
	private StaffInfoService staffInfoService;
	
	@Resource(name = "disciplineInfoServiceImpl")
	private DisciplineInfoService disciplineInfoService;
	
	@RequestMapping("add.action")
	public String addStudentWriteGrade(@Validated StudentWriteGrade studentWriteGrade, BindingResult bindingResult, Model model) throws Exception {
		
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			
			//查询所有的学员信息
			List<StudentInfo> listOfStudent = studentInfoService.getStudentInfoList(null);
			model.addAttribute("studentInfoList", listOfStudent);
			
			//查询所有的职工信息
			List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
			model.addAttribute("staffInfoList", listOfStaff);
			
			//查询所有的科目信息
			List<DisciplineInfo> listOfDisciplineInfo = disciplineInfoService.getDisciplineInfoList(null);
			model.addAttribute("disciplineInfoList", listOfDisciplineInfo);
			
			return "student/studentwritegrade/studentwritegrade_add";
		}
		
		boolean result = studentWriteGradeService.addStudentWriteGrade(studentWriteGrade);
		if(result) {
			model.addAttribute("info","添加成功");
		}else {
			model.addAttribute("info","添加失败");
		}
		return this.list(null, model);
		
	}

    @RequestMapping("delete.action")
    public String deletestudentWriteGrade(StudentWriteGrade studentWriteGrade,Model model) throws Exception {
           
        boolean result =studentWriteGradeService.deleteStudentWriteGrade(studentWriteGrade.getWriteGradeId());
        if(result) {
            model.addAttribute("info", "删除成功");
        }else {
            model.addAttribute("info", "删除失败");
        }
        return this.list(null, model);
    }
    
    @RequestMapping("update.action")
	public String updatestudentWriteGrade(@Validated StudentWriteGrade studentWriteGrade, BindingResult bindingResult, Model model) throws Exception {
		
    	if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			
			//查询所有的学员信息
			List<StudentInfo> listOfStudent = studentInfoService.getStudentInfoList(null);
			model.addAttribute("studentInfoList", listOfStudent);
			
			//查询所有的职工信息
			List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
			model.addAttribute("staffInfoList", listOfStaff);
			
			//查询所有的科目信息
			List<DisciplineInfo> listOfDisciplineInfo = disciplineInfoService.getDisciplineInfoList(null);
			model.addAttribute("disciplineInfoList", listOfDisciplineInfo);
			
			return "student/studentwritegrade/studentwritegrade_add";
		}
    	boolean result=studentWriteGradeService.updateStudentWriteGrade(studentWriteGrade);
		if(result) {
			model.addAttribute("info", "修改成功");
		}else {
			model.addAttribute("info", "修改失败");
		}
		return this.list(null, model);
	}
    
	@RequestMapping("show.action")
	public String showStudentWriteGrade(Integer studentId,Model model) {
		
		StudentWriteGrade studentWriteGrade =studentWriteGradeService.getStudentWriteGrade(studentId);
		model.addAttribute("studentWriteGrade", studentWriteGrade);
		return "student/studentwritegrade/studentwritegrade_show";  
	}
    
	@RequestMapping("load.action")
	public String loadUpate(Integer writeGradeId, Model model) {
		StudentWriteGrade studentWriteGrade =studentWriteGradeService.getStudentWriteGrade(writeGradeId);
		model.addAttribute("studentWriteGrade", studentWriteGrade);
		
		//查询所有的学员信息
		List<StudentInfo> listOfStudent = studentInfoService.getStudentInfoList(null);
		model.addAttribute("studentInfoList", listOfStudent);
		
		//查询所有的职工信息
		List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
		model.addAttribute("staffInfoList", listOfStaff);
		
		//查询所有的科目信息
		List<DisciplineInfo> listOfDisciplineInfo = disciplineInfoService.getDisciplineInfoList(null);
		model.addAttribute("disciplineInfoList", listOfDisciplineInfo);
		
		return "student/studentwritegrade/studentwritegrade_update";
	}

	@RequestMapping("addload.action")
	public String loadlist(Integer writeGradeId, Model model) {
		StudentWriteGrade studentWriteGrade =studentWriteGradeService.getStudentWriteGrade(writeGradeId);
		model.addAttribute("studentWriteGrade", studentWriteGrade);
		
		//查询所有的学员信息
		List<StudentInfo> listOfStudent = studentInfoService.getStudentInfoList(null);
		model.addAttribute("studentInfoList", listOfStudent);
		
		//查询所有的职工信息
		List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
		model.addAttribute("staffInfoList", listOfStaff);
		
		//查询所有的科目信息
		List<DisciplineInfo> listOfDisciplineInfo = disciplineInfoService.getDisciplineInfoList(null);
		model.addAttribute("disciplineInfoList", listOfDisciplineInfo);
				
		return "student/studentwritegrade/studentwritegrade_add";
	}

	@RequestMapping("list.action")
	private String list(StudentInfo studentInfo, Model model) {
		
		List<StudentWriteGradeCustom> list = studentWriteGradeCustomService.getStudentWriteGradeCustomList(studentInfo);
		model.addAttribute("list",list);
		return "student/studentwritegrade/studentwritegrade_list";
	}
	
}
