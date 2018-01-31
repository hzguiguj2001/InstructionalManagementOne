package com.guigu.instructional.po;

public class MarketActiveStaff  extends MarketActive{
	
    private String staffName;

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public MarketActiveStaff(String staffName) {
		super();
		this.staffName = staffName;
	}

	public MarketActiveStaff() {
		super();
	}
    
    

}
