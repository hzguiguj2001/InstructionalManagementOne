package com.guigu.instructional.market.mapper;

import java.util.List;

import com.guigu.instructional.po.MarketActiveStaff;
import com.guigu.instructional.po.MessageInfoStaffVO;

public interface MarketActiveStaffMapper {
	
	public List<MarketActiveStaff> findMarketActiveStaffList(MessageInfoStaffVO messageInfoStaffVO);
	
	public List<MarketActiveStaff> queryMarketActiveStaffList(MessageInfoStaffVO messageInfoStaffVO);
	
	
}
