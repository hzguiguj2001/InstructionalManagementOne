package com.guigu.instructional.classinfo.service;

import java.util.List;

import com.guigu.instructional.po.DisciplineInfo;

public interface DisciplineInfoService {

	public boolean addDisciplineInfo(DisciplineInfo disciplineInfo);

	public boolean updateDisciplineInfo(DisciplineInfo disciplineInfo);

	public List<DisciplineInfo> getDisciplineInfoList(DisciplineInfo disciplineInfo);

	public DisciplineInfo getDisciplineInfo(Integer disciplineId);
}
