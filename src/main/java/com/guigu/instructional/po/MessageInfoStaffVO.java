package com.guigu.instructional.po;

import java.util.List;

public class MessageInfoStaffVO {
	
//	private MessageInfoStaffVO messageInfoStaffVO;

	private MessageInfoStaff messageInfoStaff;
	
	private EmailInfoStaff emailInfoStaff;
	
	private EmailInfo emailInfo;
	
	private MarketActiveStaff marketActiveStaff;
	
//	private MessageInfo messageInfo;
	
	private StaffInfo staffInfo;
	
	private TemplateInfo templateInfo;
	
	private List<MessageInfoStaff> list;

    private String emailTitle;
	
    private String messagePhone;
    
    private String activeName;

//	public MessageInfoStaffVO getMessageInfoStaffVO() {
//		return messageInfoStaffVO;
//	}
//
//	public void setMessageInfoStaffVO(MessageInfoStaffVO messageInfoStaffVO) {
//		this.messageInfoStaffVO = messageInfoStaffVO;
//	}

	
	
	public List<MessageInfoStaff> getList() {
		return list;
	}

	public String getActiveName() {
		return activeName;
	}

	public void setActiveName(String activeName) {
		this.activeName = activeName;
	}

	public String getMessagePhone() {
		return messagePhone;
	}

	public void setMessagePhone(String messagePhone) {
		this.messagePhone = messagePhone;
	}

	public String getEmailTitle() {
		return emailTitle;
	}

	public void setEmailTitle(String emailTitle) {
		this.emailTitle = emailTitle;
	}

	public MarketActiveStaff getMarketActiveStaff() {
		return marketActiveStaff;
	}

	public void setMarketActiveStaff(MarketActiveStaff marketActiveStaff) {
		this.marketActiveStaff = marketActiveStaff;
	}

	public EmailInfo getEmailInfo() {
		return emailInfo;
	}

	public void setEmailInfo(EmailInfo emailInfo) {
		this.emailInfo = emailInfo;
	}

	public EmailInfoStaff getEmailInfoStaff() {
		return emailInfoStaff;
	}

	public void setEmailInfoStaff(EmailInfoStaff emailInfoStaff) {
		this.emailInfoStaff = emailInfoStaff;
	}

	public TemplateInfo getTemplateInfo() {
		return templateInfo;
	}

	public void setTemplateInfo(TemplateInfo templateInfo) {
		this.templateInfo = templateInfo;
	}

	public void setList(List<MessageInfoStaff> list) {
		this.list = list;
	}

	public MessageInfoStaff getMessageInfoStaff() {
		return messageInfoStaff;
	}

//	public MessageInfo getMessageInfo() {
//		return messageInfo;
//	}
//
//	public void setMessageInfo(MessageInfo messageInfo) {
//		this.messageInfo = messageInfo;
//	}

	public StaffInfo getStaffInfo() {
		return staffInfo;
	}

	public void setStaffInfo(StaffInfo staffInfo) {
		this.staffInfo = staffInfo;
	}

	public void setMessageInfoStaff(MessageInfoStaff messageInfoStaff) {
		this.messageInfoStaff = messageInfoStaff;
	}


}
