package com.guigu.instructional.classinfo.service;

import java.util.List;

import com.guigu.instructional.po.CDSCS;
import com.guigu.instructional.po.ClassInfo;

public interface CDSCSService {

	public boolean addCDSCS(ClassInfo classInfo);

	public boolean updateCDSCS(ClassInfo classInfo);

	public List<CDSCS> getCDSCSList(ClassInfo classInfo);

	public ClassInfo getClassInfo(Integer classId);
	
}
