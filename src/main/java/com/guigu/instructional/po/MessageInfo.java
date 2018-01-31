package com.guigu.instructional.po;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;


public class MessageInfo {
    private Integer messageId1;

    private Integer staffId;

    private String messageContent;

    @NotEmpty(message="{messageInfo.messageMan.isNULL}")
    private String messageMan;

    @NotEmpty(message="{messageInfo.messagePhone.isNULL}")
    private String messagePhone;

    @Past(message="{messageInfo.messageTime.isPAST}")
    private Date messageTime;

    private String messageState;

    public Integer getMessageId1() {
        return messageId1;
    }

    public void setMessageId1(Integer messageId1) {
        this.messageId1 = messageId1;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    public String getMessageMan() {
        return messageMan;
    }

    public void setMessageMan(String messageMan) {
        this.messageMan = messageMan == null ? null : messageMan.trim();
    }

    public String getMessagePhone() {
        return messagePhone;
    }

    public void setMessagePhone(String messagePhone) {
        this.messagePhone = messagePhone == null ? null : messagePhone.trim();
    }

    public Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public String getMessageState() {
        return messageState;
    }

    public void setMessageState(String messageState) {
        this.messageState = messageState == null ? null : messageState.trim();
    }
}