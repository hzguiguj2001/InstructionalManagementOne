package com.guigu.instructional.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.StaffInfo;
import com.guigu.instructional.po.StaffInfoExample;
import com.guigu.instructional.po.StaffTeachers;
import com.guigu.instructional.po.StaffInfoExample.Criteria;
import com.guigu.instructional.system.mapper.StaffInfoMapper;
import com.guigu.instructional.system.mapper.StaffTeachersMapper;
import com.guigu.instructional.system.service.StaffTeacherService;

@Service("staffTeacherServiceImpl")
public class StaffTeacherServiceImpl implements StaffTeacherService {

	@Resource(name = "staffTeachersMapper")
	private StaffTeachersMapper staffTeachersMapper;
	@Resource(name = "staffInfoMapper")
	private StaffInfoMapper staffInfoMapper;

	@Override
	public List<StaffTeachers> findStaffTeachers(StaffInfo staffInfo) throws Exception {

		
		return staffTeachersMapper.findStaffTeachers(staffInfo);
	}
	

	@Override
	public boolean addStaff(StaffInfo staffInfo) {
		try {
			int i = staffInfoMapper.insertSelective(staffInfo);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public boolean updateStaff(StaffInfo staffInfo) {
		try {
			int i = staffInfoMapper.updateByPrimaryKeySelective(staffInfo);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public StaffInfo getStaffInfo(Integer staffId) {

		return staffInfoMapper.selectByPrimaryKey(staffId);
	}

}
