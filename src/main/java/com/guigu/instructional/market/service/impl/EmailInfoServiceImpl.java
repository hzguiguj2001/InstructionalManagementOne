package com.guigu.instructional.market.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.market.mapper.EmailInfoMapper;
import com.guigu.instructional.market.mapper.EmailInfoStaffMapper;
import com.guigu.instructional.market.service.EmailInfoService;
import com.guigu.instructional.po.EmailInfo;
import com.guigu.instructional.po.EmailInfoExample;
import com.guigu.instructional.po.EmailInfoExample.Criteria;
import com.guigu.instructional.po.EmailInfoStaff;
import com.guigu.instructional.po.MessageInfoStaffVO;

@Service("emailInfoServiceImpl")
public class EmailInfoServiceImpl implements EmailInfoService{

	@Resource(name="emailInfoMapper")
	private EmailInfoMapper emailInfoMapper;
	
	@Resource(name="emailInfoStaffMapper")
	private EmailInfoStaffMapper emailInfoStaffMapper;

	@Override
	public boolean sendEmailInfo(EmailInfo emailInfo) {
		int i = emailInfoMapper.insertSelective(emailInfo);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean lookEmailInfo(EmailInfo emailInfo) {
		int i = emailInfoMapper.updateByPrimaryKeySelective(emailInfo);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<EmailInfo> getEmailInfoList(EmailInfo emailInfo) {
		EmailInfoExample emailInfoExample =new EmailInfoExample();
	    Criteria criteria =emailInfoExample.createCriteria();
	        
	    if(emailInfo!=null && emailInfo.getEmailTitle()!=null) {
	    	emailInfo.setEmailTitle("%"+emailInfo.getEmailTitle()+"%");
            criteria.andEmailTitleLike(emailInfo.getEmailTitle());
        }
	    criteria.andEmailStateEqualTo("1");
	    return emailInfoMapper.selectByExample(emailInfoExample);
	}

	@Override
	public EmailInfo getEmailInfo(Integer emailId) {
		return emailInfoMapper.selectByPrimaryKey(emailId);
	}

	@Override
	public boolean deleteEmailInfo(Integer emailId) {
		int i = emailInfoMapper.deleteByPrimaryKey(emailId);
		if(i>0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean updateEmailInfo(EmailInfo emailInfo) {
		int i = emailInfoMapper.updateByPrimaryKeySelective(emailInfo);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<EmailInfoStaff> findEmailInfoStaffList(MessageInfoStaffVO messageInfoStaffVO) throws Exception {
		return emailInfoStaffMapper.findEmailInfoStaffList(messageInfoStaffVO);
	}
	

	

}
