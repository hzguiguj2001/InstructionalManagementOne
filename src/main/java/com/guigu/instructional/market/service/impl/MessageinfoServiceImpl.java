package com.guigu.instructional.market.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.market.mapper.MessageInfoMapper;
import com.guigu.instructional.market.mapper.MessageInfoStaffMapper;
import com.guigu.instructional.market.service.MessageinfoService;
import com.guigu.instructional.po.MessageInfo;
import com.guigu.instructional.po.MessageInfoExample;
import com.guigu.instructional.po.MessageInfoExample.Criteria;
import com.guigu.instructional.po.MessageInfoStaff;
import com.guigu.instructional.po.MessageInfoStaffVO;

@Service("messageinfoServiceImpl")
public class MessageinfoServiceImpl implements MessageinfoService{

	@Resource(name="messageInfoMapper")
	private MessageInfoMapper messageInfoMapper;
	
	@Resource(name="messageInfoStaffMapper")
	private MessageInfoStaffMapper messageInfoStaffMapper;
	
	@Override
	public boolean sendMessageinfo(MessageInfo messageInfo) {
		int i = messageInfoMapper.insertSelective(messageInfo);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean lookMessageinfo(MessageInfo messageInfo) {
		int i = messageInfoMapper.updateByPrimaryKeySelective(messageInfo);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<MessageInfo> getMessageinfoList(MessageInfo messageInfo) {
		MessageInfoExample messageInfoExample =new MessageInfoExample();
	    Criteria criteria =messageInfoExample.createCriteria();
	        
	    if(messageInfo!=null && messageInfo.getMessagePhone()!=null) {
	    	messageInfo.setMessagePhone("%"+messageInfo.getMessagePhone()+"%");
            criteria.andMessagePhoneLike(messageInfo.getMessagePhone());
        }
	    criteria.andMessageStateEqualTo("1");
	    return messageInfoMapper.selectByExample(messageInfoExample);
	}

	@Override
	public MessageInfo getMessageinfo(Integer messageId1) {
		return messageInfoMapper.selectByPrimaryKey(messageId1);
	}

	@Override
	public boolean deleteMessageinfo(Integer messageId1) {
		int i = messageInfoMapper.deleteByPrimaryKey(messageId1);
		if(i>0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean updateMessageinfo(MessageInfo messageInfo) {
		int i = messageInfoMapper.updateByPrimaryKeySelective(messageInfo);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<MessageInfoStaff> findMessageInfoStaffList(MessageInfoStaffVO messageInfoStaffVO) throws Exception{
//		System.out.println(messageInfoStaffMapper.findMessageInfoStaffList(messageInfoStaff));
		return messageInfoStaffMapper.findMessageInfoStaffList(messageInfoStaffVO);
	}

//	@Override
//	public List<MessageInfoStaff> getMessageinfoStaffList(MessageInfoStaff messageInfoStaff) {
//		MessageInfoExample messageInfoExample =new MessageInfoExample();
//	    Criteria criteria =messageInfoExample.createCriteria();
//	        
//	    if(messageInfoStaff!=null && messageInfoStaff.getMessagePhone()!=null) {
//	    	messageInfoStaff.setMessagePhone("%"+messageInfoStaff.getMessagePhone()+"%");
//            criteria.andMessagePhoneLike(messageInfoStaff.getMessagePhone());
//        }
//	    criteria.andMessageStateEqualTo("1");
//	    return (List<MessageInfoStaff>)messageInfoMapper.selectByExample(messageInfoExample);
//	}
	
	


}
