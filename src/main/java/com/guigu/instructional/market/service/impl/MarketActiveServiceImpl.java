package com.guigu.instructional.market.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.market.mapper.MarketActiveMapper;
import com.guigu.instructional.market.mapper.MarketActiveStaffMapper;
import com.guigu.instructional.market.service.MarketActiveService;
import com.guigu.instructional.po.MarketActive;
import com.guigu.instructional.po.MarketActiveStaff;
import com.guigu.instructional.po.MessageInfoStaffVO;

@Service("marketActiveServiceImpl")
public class MarketActiveServiceImpl implements MarketActiveService{

	@Resource(name="marketActiveStaffMapper")
	private MarketActiveStaffMapper marketActiveStaffMapper;
	
	@Resource(name="marketActiveMapper")
	private MarketActiveMapper marketActiveMapper;
	
	@Override
	public boolean sendMarketActive(MarketActive marketActive) {
		int i = marketActiveMapper.insertSelective(marketActive);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean lookMarketActive(MarketActive marketActive) {
		int i = marketActiveMapper.updateByPrimaryKeySelective(marketActive);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteMarketActive(Integer activeId) {
		int i = marketActiveMapper.deleteByPrimaryKey(activeId);
		if(i>0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean updateMarketActive(MarketActive marketActive) {
		int i = marketActiveMapper.updateByPrimaryKeySelective(marketActive);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<MarketActiveStaff> findMarketActiveStaffList(MessageInfoStaffVO messageInfoStaffVO) throws Exception {
		return marketActiveStaffMapper.findMarketActiveStaffList(messageInfoStaffVO);
	}

	@Override
	public MarketActive getMarketActive(Integer activeId) {
		return marketActiveMapper.selectByPrimaryKey(activeId);
	}

	
	
}
