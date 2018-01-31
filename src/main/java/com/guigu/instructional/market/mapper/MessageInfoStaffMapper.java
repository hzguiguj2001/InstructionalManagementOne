package com.guigu.instructional.market.mapper;

import java.util.List;

import com.guigu.instructional.po.MessageInfoStaff;
import com.guigu.instructional.po.MessageInfoStaffVO;

public interface MessageInfoStaffMapper {

	public List<MessageInfoStaff> findMessageInfoStaffList(MessageInfoStaffVO messageInfoStaffVO);
	
	public List<MessageInfoStaff> queryMessageInfoStaffList(MessageInfoStaffVO messageInfoStaffVO);
}
