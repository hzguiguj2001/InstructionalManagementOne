package com.guigu.instructional.system.service;

import java.util.List;

import com.guigu.instructional.po.DataDictionary;

public interface DataDictionaryService {
	
	public boolean addDataDictionary(DataDictionary dataDictionary);
	
	public boolean deleteDataDictionary(Integer id);
    
    public boolean updateDataDictionary(DataDictionary dataDictionary);
    
    public List<DataDictionary> getStaffInfoList(DataDictionary dataDictionary);
    
    public DataDictionary getDataDictionary(Integer dataId);
    
	  	
}
