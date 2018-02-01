package com.guigu.instructional.student.controller;

import java.text.ParseException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.classinfo.service.ClassInfoService;
import com.guigu.instructional.po.ClassInfo;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StudentInfo;
import com.guigu.instructional.student.service.StudentInfoService;
import com.guigu.instructional.system.service.StaffInfoService;


@Controller
@RequestMapping("/student/studentinfo/")
public class StudentInfoController {
	
	@Resource(name = "studentInfoServiceImpl")
	private StudentInfoService studentInfoService;
	
	@Resource(name = "staffInfoServiceImpl")
	private StaffInfoService staffInfoService;
	
	@Resource(name = "classInfoServiceImpl")
	private ClassInfoService classInfoService;
	
	@RequestMapping("add.action")
	public String addStudentInfo(@Validated StudentInfo studentInfo, BindingResult bindingResult, Model model) 
				throws ParseException{
		
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			
			//��ѯ���е�ְ����Ϣ
			List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
			model.addAttribute("staffInfoList", listOfStaff);
			
			//��ѯ���еİ༶��Ϣ
			List<ClassInfo> listOfClass = classInfoService.getClassInfoList(null);
			model.addAttribute("classInfoList", listOfClass);
			
			model.addAttribute("studentInfo", studentInfo);
			return "student/student/student_add";
		}
		studentInfo.setStudentState(1);
		boolean result = studentInfoService.addStudent(studentInfo);
		if(result) {
			model.addAttribute("info","��ӳɹ�");
		}else {
			model.addAttribute("info","���ʧ��");
		}
		return this.list(null, model);
	}

	@RequestMapping("delete.action")
	public String deletestudentInfo(StudentInfo studentInfo,Model model) {
	    
		//����Ա��Ϊ 0   ������Ч
		studentInfo.setStudentState(0);
		
		boolean result =studentInfoService.updateStudent(studentInfo);
		if(result) {
		    model.addAttribute("info", "ɾ���ɹ�");
		}else {
		    model.addAttribute("info", "ɾ��ʧ��");
		}
		return this.list(null, model);
	}
	
	@RequestMapping("update.action")
	public String updatestudentInfo(@Validated StudentInfo studentInfo, BindingResult bindingResult, Model model) 
				throws ParseException {
		
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			
			//��ѯ���е�ְ����Ϣ
			List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
			model.addAttribute("staffInfoList", listOfStaff);
			
			//��ѯ���еİ༶��Ϣ
			List<ClassInfo> listOfClass = classInfoService.getClassInfoList(null);
			model.addAttribute("classInfoList", listOfClass);
			
			model.addAttribute("studentInfo", studentInfo);
			return "student/student/student_update";
		}
		
		boolean result=studentInfoService.updateStudent(studentInfo);
		if(result) {
		    model.addAttribute("info", "�޸ĳɹ�");
		}else {
		model.addAttribute("info", "�޸�ʧ��");
		}
		return this.list(null, model);
	}
		
	@RequestMapping("list.action")
	private String list(StudentInfo studentInfo, Model model) {
		
		List<StudentInfo> list = studentInfoService.getStudentInfoList(studentInfo);
		model.addAttribute("list",list);
		return "student/student/student_list";
	}
	
	@RequestMapping("show.action")
    public String showStudentInfo(Integer studentId,Model model) {
        StudentInfo studentInfo =studentInfoService.getStudentInfo(studentId);
        model.addAttribute("studentInfo", studentInfo);
        
        //��ѯ���е�ְ����Ϣ
		List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
		model.addAttribute("staffInfoList", listOfStaff);
		
		//��ѯ���еİ༶��Ϣ
		List<ClassInfo> listOfClass = classInfoService.getClassInfoList(null);
		model.addAttribute("classInfoList", listOfClass);
      		
        return "student/student/student_show";
    }
    
	@RequestMapping("load.action")
	public String loadUpate(Integer studentId,Model model) {
		StudentInfo studentInfo =studentInfoService.getStudentInfo(studentId);
		model.addAttribute("studentInfo", studentInfo);
		
		//��ѯ���е�ְ����Ϣ
		List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
		model.addAttribute("staffInfoList", listOfStaff);
		
		//��ѯ���еİ༶��Ϣ
		List<ClassInfo> listOfClass = classInfoService.getClassInfoList(null);
		model.addAttribute("classInfoList", listOfClass);
		
		return "student/student/student_update";
	}
    
	@RequestMapping("addload.action")
	public String loadAddStudentInfo(Integer studentId,Model model) {
		StudentInfo studentInfo =studentInfoService.getStudentInfo(studentId);
		model.addAttribute("studentInfo", studentInfo);
		
		//��ѯ���е�ְ����Ϣ
		List<StaffInfo> listOfStaff = staffInfoService.getStaffInfoList(null);
		model.addAttribute("staffInfoList", listOfStaff);
		
		//��ѯ���еİ༶��Ϣ
		List<ClassInfo> listOfClass = classInfoService.getClassInfoList(null);
		model.addAttribute("classInfoList", listOfClass);
		
		return "student/student/student_add";
	}
	
    
	
    

}
