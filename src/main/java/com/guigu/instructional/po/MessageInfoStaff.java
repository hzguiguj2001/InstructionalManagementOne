package com.guigu.instructional.po;

public class MessageInfoStaff extends MessageInfo{

//	private StaffInfo staffInfo;
	
    private String staffName;
    
    private String templateContent; 
	
	public MessageInfoStaff() {
	super();
}

	public MessageInfoStaff(String staffName) {
	super();
	this.staffName = staffName;
}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getTemplateContent() {
		return templateContent;
	}

	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}

	
//	public StaffInfo getStaffInfo() {
//		return staffInfo;
//	}
//
//	public void setStaffInfo(StaffInfo staffInfo) {
//		this.staffInfo = staffInfo;
//	}
	
}
