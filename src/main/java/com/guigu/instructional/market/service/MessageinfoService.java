package com.guigu.instructional.market.service;

import java.util.List;

import com.guigu.instructional.po.MessageInfo;
import com.guigu.instructional.po.MessageInfoStaff;
import com.guigu.instructional.po.MessageInfoStaffVO;

public interface MessageinfoService {

		//发送短信
		public boolean sendMessageinfo(MessageInfo messageInfo);
	    
		//查看短信
	    public boolean lookMessageinfo(MessageInfo messageInfo);
	    
	    //根据条件查询短信
	    public List<MessageInfo> getMessageinfoList(MessageInfo messageInfo);
	    
	    //根据电话号码查询短信
	    public MessageInfo getMessageinfo(Integer messageId1);
	    
	    //删除短信
	    public boolean deleteMessageinfo(Integer messageId1);
	
	    //更新短信数据
	    public boolean updateMessageinfo(MessageInfo messageInfo);
	    
	    public List<MessageInfoStaff> findMessageInfoStaffList(MessageInfoStaffVO messageInfoStaffVO) throws Exception;

	    
//	    //根据条件查询短信
//	    public List<MessageInfoStaff> getMessageinfoStaffList(MessageInfoStaff messageInfoStaff);
}
