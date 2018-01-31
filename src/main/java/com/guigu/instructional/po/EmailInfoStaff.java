package com.guigu.instructional.po;

public class EmailInfoStaff extends EmailInfo{
	
	private String staffName;

	
	
	public EmailInfoStaff() {
		super();
	}

	public EmailInfoStaff(String staffName) {
		super();
		this.staffName = staffName;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	

}
