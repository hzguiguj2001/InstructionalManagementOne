package com.guigu.instructional.classinfo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.classinfo.service.CDSCSService;
import com.guigu.instructional.classinfo.service.ClassroomInfoService;
import com.guigu.instructional.classinfo.service.DisciplineInfoService;
import com.guigu.instructional.classinfo.service.SyllabusInfoService;
import com.guigu.instructional.po.CDSCS;
import com.guigu.instructional.po.ClassInfo;
import com.guigu.instructional.po.ClassroomInfo;
import com.guigu.instructional.po.DisciplineInfo;
import com.guigu.instructional.po.StaffTeachers;
import com.guigu.instructional.po.SyllabusInfo;
import com.guigu.instructional.system.service.StaffTeacherService;

@Controller
@RequestMapping("/classinfo/classinfo/")
public class CDSCSController {

	@Resource(name = "cDSCSServiceImpl")
	private CDSCSService cDSCSService;

	@Resource(name = "disciplineInfoServiceImpl")
	private DisciplineInfoService disciplineInfoService;

	@Resource(name = "classroomInfoServiceImpl")
	private ClassroomInfoService classroomInfoService;

	@Resource(name = "syllabusInfoServiceImpl")
	private SyllabusInfoService syllabusInfoService;

	@Resource(name = "staffTeacherServiceImpl")
	private StaffTeacherService staffTeacherService;

	@RequestMapping("add.action")
	public String addClassInfo(ClassInfo classInfo, Model model) {
		classInfo.setClassIsused("1");
		classInfo.setClassState("1");
		boolean result = cDSCSService.addCDSCS(classInfo);
		if (result) {
			model.addAttribute("info", "添加成功");
		} else {
			model.addAttribute("info", "添加失败");
		}
		return this.listCDSCS(null, model);

	}

	@RequestMapping("loadCDSCS.action")
	public String loadCSSD(Integer classId, Model model) throws Exception {
		List<DisciplineInfo> disciplineInfoList = disciplineInfoService.getDisciplineInfoList(null);
		List<ClassroomInfo> classroomInfoList = classroomInfoService.getClassroomInfoList(null);
		List<SyllabusInfo> syllabusInfoList = syllabusInfoService.getSyllabusInfoList(null);
		List<StaffTeachers> teacherList = staffTeacherService.findStaffTeachers(null);
		model.addAttribute("disciplineInfoList", disciplineInfoList);
		model.addAttribute("classroomInfoList", classroomInfoList);
		model.addAttribute("syllabusInfoList", syllabusInfoList);
		model.addAttribute("teacherList", teacherList);
		return "classinfo/classinfo/classinfo_add";
	}

	@RequestMapping("loadCDSCS1.action")
	public String loadCSSD1(Integer classId, Model model) throws Exception {
		ClassInfo classInfo = cDSCSService.getClassInfo(classId);
		List<DisciplineInfo> disciplineInfoList = disciplineInfoService.getDisciplineInfoList(null);
		List<ClassroomInfo> classroomInfoList = classroomInfoService.getClassroomInfoList(null);
		List<SyllabusInfo> syllabusInfoList = syllabusInfoService.getSyllabusInfoList(null);
		List<StaffTeachers> teacherList = staffTeacherService.findStaffTeachers(null);
		
		model.addAttribute("classInfo", classInfo);
		model.addAttribute("disciplineInfoList", disciplineInfoList);
		model.addAttribute("classroomInfoList", classroomInfoList);
		model.addAttribute("syllabusInfoList", syllabusInfoList);
		model.addAttribute("teacherList", teacherList);
		return "classinfo/classinfo/classinfo_update";
	}

	@RequestMapping("update.action")
	public String updateClassInfo(ClassInfo classInfo, Model model) {
		boolean result = cDSCSService.updateCDSCS(classInfo);
		if (result) {
			model.addAttribute("info", "变更成功");
		} else {
			model.addAttribute("info", "变更失败");
		}
		return this.listCDSCS(null, model);
	}

	@RequestMapping("listCDSCS.action")
	public String listCDSCS(ClassInfo classInfo, Model model) {
		List<CDSCS> list = cDSCSService.getCDSCSList(classInfo);
		model.addAttribute("list", list);
		return "classinfo/classinfo/classinfo_list";
	}

	@RequestMapping("delete.action")
	public String deleteClassInfo(ClassInfo classInfo, Model model) {
		classInfo.setClassIsused("0");
		boolean reuslt = cDSCSService.updateCDSCS(classInfo);
		if (reuslt) {
			model.addAttribute("info", "删除成功");
		} else {
			model.addAttribute("info", "删除失败");
		}
		return this.listCDSCS(null, model);
	}
}
