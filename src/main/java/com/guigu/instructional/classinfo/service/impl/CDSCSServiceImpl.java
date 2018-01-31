package com.guigu.instructional.classinfo.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.classinfo.mapper.ClassInfoMapper;
import com.guigu.instructional.classinfo.mapper.ClassroomInfoMapper;
import com.guigu.instructional.classinfo.mapper.DisciplineInfoMapper;
import com.guigu.instructional.classinfo.mapper.SyllabusInfoMapper;
import com.guigu.instructional.classinfo.service.CDSCSService;
import com.guigu.instructional.po.CDSCS;
import com.guigu.instructional.po.ClassInfo;
import com.guigu.instructional.po.ClassInfoExample;
import com.guigu.instructional.po.ClassInfoExample.Criteria;
import com.guigu.instructional.po.ClassroomInfo;
import com.guigu.instructional.po.DisciplineInfo;
import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.SyllabusInfo;
import com.guigu.instructional.system.mapper.StaffInfoMapper;

@Service("cDSCSServiceImpl")
public class CDSCSServiceImpl implements CDSCSService {

	@Resource(name="classInfoMapper")
	private ClassInfoMapper classInfoMapper;
	
	@Resource(name="disciplineInfoMapper")
	private DisciplineInfoMapper disciplineInfoMapper;
	
	@Resource(name="syllabusInfoMapper")
	private SyllabusInfoMapper syllabusInfoMapper;
	
	@Resource(name="classroomInfoMapper")
	private ClassroomInfoMapper classroomInfoMapper;
	
	@Resource(name="staffInfoMapper")
	private StaffInfoMapper staffInfoMapper;
	
	@Override
	public boolean addCDSCS(ClassInfo classInfo) {
		if(classInfo!=null) {
			classInfo.setClassIsused("1");
			classInfo.setClassState("1");
		}
		int i = classInfoMapper.insertSelective(classInfo);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateCDSCS(ClassInfo classInfo) {
		int i = classInfoMapper.updateByPrimaryKeySelective(classInfo);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<CDSCS> getCDSCSList(ClassInfo classInfo) {
		List<CDSCS> listCDSCS = new ArrayList<>(); 
		
		ClassInfoExample classInfoExample = new ClassInfoExample();
		Criteria criteria = classInfoExample.createCriteria();
		if(classInfo!=null) {
			if(classInfo.getClassName()!=null) {
				classInfo.setClassName("%"+classInfo.getClassName()+"%");
				criteria.andClassNameLike(classInfo.getClassName());
			}
		}
		criteria.andClassIsusedEqualTo("1");
		criteria.andClassStateEqualTo("1");
		List<ClassInfo> listClassInfo = classInfoMapper.selectByExample(classInfoExample);
		if(listClassInfo!=null) {
			for(ClassInfo classInfo2:listClassInfo) {
				CDSCS cdscs = new CDSCS();
				DisciplineInfo disciplineInfo = disciplineInfoMapper.selectByPrimaryKey(classInfo2.getDisciplineId());
				SyllabusInfo syllabusInfo = syllabusInfoMapper.selectByPrimaryKey(classInfo2.getSyllabusId());
				ClassroomInfo classroomInfo = classroomInfoMapper.selectByPrimaryKey(classInfo2.getClassroomId());
				StaffInfo staffInfo = staffInfoMapper.selectByPrimaryKey(classInfo2.getStaffId());
				cdscs.setClassInfo(classInfo2);
				cdscs.setDisciplineInfo(disciplineInfo);
				cdscs.setSyllabusInfo(syllabusInfo);
				cdscs.setClassroomInfo(classroomInfo);
				cdscs.setStaffInfo(staffInfo);
				listCDSCS.add(cdscs);
			}
		}
		return listCDSCS;
	}

	@Override
	public ClassInfo getClassInfo(Integer classId) {
		return classInfoMapper.selectByPrimaryKey(classId);
	}

}
