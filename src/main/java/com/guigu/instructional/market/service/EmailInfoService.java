package com.guigu.instructional.market.service;

import java.util.List;

import com.guigu.instructional.po.EmailInfo;
import com.guigu.instructional.po.EmailInfoStaff;
import com.guigu.instructional.po.MessageInfoStaffVO;

public interface EmailInfoService {

			//发送短信
			public boolean sendEmailInfo(EmailInfo emailInfo);
		    
			//查看短信
		    public boolean lookEmailInfo(EmailInfo emailInfo);
		    
		    //根据条件查询短信
		    public List<EmailInfo> getEmailInfoList(EmailInfo emailInfo);
		    
		    //根据电话号码查询短信
		    public EmailInfo getEmailInfo(Integer emailId);
		    
		    //删除短信
		    public boolean deleteEmailInfo(Integer emailId);
		
		    //更新短信数据
		    public boolean updateEmailInfo(EmailInfo emailInfo);
		    
		    public List<EmailInfoStaff> findEmailInfoStaffList(MessageInfoStaffVO messageInfoStaffVO) throws Exception;

	
}
