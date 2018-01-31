package com.guigu.instructional.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.DataDictionary;
import com.guigu.instructional.po.DataDictionaryExample;
import com.guigu.instructional.po.DataDictionaryExample.Criteria;
import com.guigu.instructional.system.mapper.DataDictionaryMapper;
import com.guigu.instructional.system.service.DataDictionaryService;

@Service(value="datadictionaryserviceImpl")
public class DataDictionaryServiceImpl implements DataDictionaryService {

	  @Resource(name = "dataDictionaryMapper")
	  private DataDictionaryMapper dataDictionaryMapper;
	    
	@Override
	public boolean addDataDictionary(DataDictionary dataDictionary) {
		  try {
	            int i = dataDictionaryMapper.insertSelective(dataDictionary);
	            if (i > 0) {
	                return true;
	            }
	        } catch (Exception e) {

	        }

	        return false;
	}

	@Override
	public boolean updateDataDictionary(DataDictionary dataDictionary) {
		 try {
	            int i = dataDictionaryMapper.updateByPrimaryKeySelective(dataDictionary);
	            if (i > 0) {
	                return true;
	            }
	        } catch (Exception e) {

	        }

	        return false;
	}

	@Override
	public List<DataDictionary> getStaffInfoList(DataDictionary dataDictionary) {
		 DataDictionaryExample dataDictionaryExample =new DataDictionaryExample();
	        Criteria criteria =dataDictionaryExample.createCriteria();
	        if(dataDictionary!=null) {
	            if(dataDictionary.getDataId()!=null) {
	                criteria.andDataIdEqualTo(dataDictionary.getDataId());
	            } if(dataDictionary.getDataType()!=null) {
	                criteria.andDataTypeEqualTo(dataDictionary.getDataType());
	            }
	            
	        }
	        else{
	        	return dataDictionaryMapper.selectByExample(null);
	        		}
	        
	        return dataDictionaryMapper.selectByExample(dataDictionaryExample);
	}

	@Override
	public DataDictionary getDataDictionary(Integer dataId) {

        return dataDictionaryMapper.selectByPrimaryKey(dataId);
	}

	@Override
	public boolean deleteDataDictionary(Integer id) {
		
		try {
            int i =dataDictionaryMapper.deleteByPrimaryKey(id);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {

        }

        return false;
	
	}

}
