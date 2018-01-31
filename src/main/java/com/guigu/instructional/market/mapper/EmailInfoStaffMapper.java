package com.guigu.instructional.market.mapper;

import java.util.List;

import com.guigu.instructional.po.EmailInfoStaff;
import com.guigu.instructional.po.MessageInfoStaffVO;

public interface EmailInfoStaffMapper {

	public List<EmailInfoStaff> findEmailInfoStaffList(MessageInfoStaffVO messageInfoStaffVO);
	
	public List<EmailInfoStaff> queryEmailInfoStaff(MessageInfoStaffVO messageInfoStaffVO);
	
}
