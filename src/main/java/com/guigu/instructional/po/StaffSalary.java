package com.guigu.instructional.po;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

public class StaffSalary {
	

    private Integer staffSalaryId;

    @NotNull(message="{staffId.isNULL}")
    private Integer staffId;

    @NotNull(message="{staStaffId.isNULL}")
    private Integer staStaffId;

    @Min(value=0,message="{benyue.gongzi.dayuling}")
    @Digits(integer=10, fraction=4,message="{dui.gongzi.changdu.xianzhi}")
    private Double staffSalaryTotal;

    @Min(value=0,message="{kouchu.gongzi.dayuling}")
    @Digits(integer=10, fraction=4,message="{kouchu.gongzi.changdu.xianzhi}")
    private Double staffSalaryDeduct;

    @Digits(integer=10, fraction=4,message="{real.gongzi.changdu.xianzhi}")
    @Min(value=0,message="{real.gongzi.dayuling}")
    private Double staffSalaryReal;

    
    private String staffSalaryIsused;

    @Past(message="{all.time.past}")
    private Date staffSalaryTime;

    private String remark;

    public Integer getStaffSalaryId() {
        return staffSalaryId;
    }

    public void setStaffSalaryId(Integer staffSalaryId) {
        this.staffSalaryId = staffSalaryId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getStaStaffId() {
        return staStaffId;
    }

    public void setStaStaffId(Integer staStaffId) {
        this.staStaffId = staStaffId;
    }

    public Double getStaffSalaryTotal() {
        return staffSalaryTotal;
    }

    public void setStaffSalaryTotal(Double staffSalaryTotal) {
        this.staffSalaryTotal = staffSalaryTotal;
    }

    public Double getStaffSalaryDeduct() {
        return staffSalaryDeduct;
    }

    public void setStaffSalaryDeduct(Double staffSalaryDeduct) {
        this.staffSalaryDeduct = staffSalaryDeduct;
    }

    public Double getStaffSalaryReal() {
        return staffSalaryReal;
    }

    public void setStaffSalaryReal(Double staffSalaryReal) {
        this.staffSalaryReal = staffSalaryReal;
    }

    public String getStaffSalaryIsused() {
        return staffSalaryIsused;
    }

    public void setStaffSalaryIsused(String staffSalaryIsused) {
        this.staffSalaryIsused = staffSalaryIsused == null ? null : staffSalaryIsused.trim();
    }

    public Date getStaffSalaryTime() {
        return staffSalaryTime;
    }

    public void setStaffSalaryTime(Date staffSalaryTime) {
        this.staffSalaryTime = staffSalaryTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}