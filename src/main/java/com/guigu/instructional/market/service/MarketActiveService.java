package com.guigu.instructional.market.service;

import java.util.List;

import com.guigu.instructional.po.EmailInfo;
import com.guigu.instructional.po.EmailInfoStaff;
import com.guigu.instructional.po.MarketActive;
import com.guigu.instructional.po.MarketActiveStaff;
import com.guigu.instructional.po.MessageInfoStaffVO;

public interface MarketActiveService {

	//发送活动
	public boolean sendMarketActive(MarketActive marketActive);
    
	//查看活动
    public boolean lookMarketActive(MarketActive marketActive);
    
//    //根据条件查询短信
//    public List<EmailInfo> getEmailInfoList(EmailInfo emailInfo);
    
    //根据电话号码查询短信
    public MarketActive getMarketActive(Integer activeId);
    
    //删除活动
    public boolean deleteMarketActive(Integer activeId);

    //更新活动数据
    public boolean updateMarketActive(MarketActive marketActive);
    
    //查询活动
    public List<MarketActiveStaff> findMarketActiveStaffList(MessageInfoStaffVO messageInfoStaffVO) throws Exception;

	
}
