package com.guigu.instructional.po;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

public class EmailInfo {
	
    private Integer emailId;

    private Integer staffId;

    @NotEmpty(message="{emailInfo.emailTitle.isNULL}")
    private String emailTitle;

//    @Size(min=20,max=2000,message="{emailInfo.emailContent.isMAX}")
//    @NotEmpty(message="{emailInfo.emailContent.isNULL}")
    private String emailContent;

    @Past(message="{emailInfo.emailTime.isPAST}")
    private Date emailTime;

    @NotEmpty(message="{emailInfo.emailMan.isNULL}")
    private String emailMan;

    @Email(message="{emailInfo.emailAddr.isNOTEMAIL}")
    private String emailAddr;

    
    private String emailState;

    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle == null ? null : emailTitle.trim();
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent == null ? null : emailContent.trim();
    }

    public Date getEmailTime() {
        return emailTime;
    }

    public void setEmailTime(Date emailTime) {
        this.emailTime = emailTime;
    }

    public String getEmailMan() {
        return emailMan;
    }

    public void setEmailMan(String emailMan) {
        this.emailMan = emailMan == null ? null : emailMan.trim();
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr == null ? null : emailAddr.trim();
    }

    public String getEmailState() {
        return emailState;
    }

    public void setEmailState(String emailState) {
        this.emailState = emailState == null ? null : emailState.trim();
    }
}