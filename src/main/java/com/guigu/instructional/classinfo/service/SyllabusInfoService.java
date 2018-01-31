package com.guigu.instructional.classinfo.service;

import java.util.List;

import com.guigu.instructional.po.SyllabusInfo;

public interface SyllabusInfoService {

	public boolean addSyllabusInfo(SyllabusInfo syllabusInfo);

	public boolean updateSyllabusInfo(SyllabusInfo syllabusInfo);

	public List<SyllabusInfo> getSyllabusInfoList(SyllabusInfo syllabusInfo);

	public SyllabusInfo getSyllabusInfo(Integer syllabusId);
}
