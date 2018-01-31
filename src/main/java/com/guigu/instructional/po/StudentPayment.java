package com.guigu.instructional.po;

import java.util.Date;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

public class StudentPayment {
	
	
    private Integer paymentId;

	@NotNull(message="{studentId.isNULL}")
    private Integer studentId;

	@NotNull(message="{staffId.isNULL}")
    private Integer staffId;

    @Length(min=0, max=20,message="{changdu.dayu.ershiwei}")
    private String paymentSitutation;

    private Integer paymentMenthod;
    
    @NotNull(message="{all.time.isNULL}")
    @Past(message="{all.time.past}")
    private Date paymentTime;
  
    @Min(value=0,message="{shuru.jine.dayuling}")
    @Digits(integer=10, fraction=4,message="{dui.jine.changdu.xianzhi}")
    private Double paymentDiscountAmount;
   
    @Min(value=0,message="{shuru.jine.dayuling}")
    @Digits(integer=10, fraction=4,message="{dui.jine.changdu.xianzhi}")
    private Double paymentShouldAmount;
   
    @Min(value=0,message="{shuru.jine.dayuling}")
    @Digits(integer=10, fraction=4,message="{dui.jine.changdu.xianzhi}")
    private Double paymentRealAmount;
   
    @Min(value=0,message="{shuru.jine.dayuling}")
    @Digits(integer=10, fraction=4,message="{dui.jine.changdu.xianzhi}")
    private Double paymentDebtAmount;

    private String paymentRemark;

    public Integer getPaymentId() {
        return paymentId;
    }

    @Override
	public String toString() {
		return "StudentPayment [paymentId=" + paymentId + ", studentId=" + studentId + ", staffId=" + staffId
				+ ", paymentSitutation=" + paymentSitutation + ", paymentMenthod=" + paymentMenthod + ", paymentTime="
				+ paymentTime + ", paymentDiscountAmount=" + paymentDiscountAmount + ", paymentShouldAmount="
				+ paymentShouldAmount + ", paymentRealAmount=" + paymentRealAmount + ", paymentDebtAmount="
				+ paymentDebtAmount + ", paymentRemark=" + paymentRemark + "]";
	}

	public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getPaymentSitutation() {
        return paymentSitutation;
    }

    public void setPaymentSitutation(String paymentSitutation) {
        this.paymentSitutation = paymentSitutation == null ? null : paymentSitutation.trim();
    }

    public Integer getPaymentMenthod() {
        return paymentMenthod;
    }

    public void setPaymentMenthod(Integer paymentMenthod) {
        this.paymentMenthod = paymentMenthod;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Double getPaymentDiscountAmount() {
        return paymentDiscountAmount;
    }

    public void setPaymentDiscountAmount(Double paymentDiscountAmount) {
        this.paymentDiscountAmount = paymentDiscountAmount;
    }

    public Double getPaymentShouldAmount() {
        return paymentShouldAmount;
    }

    public void setPaymentShouldAmount(Double paymentShouldAmount) {
        this.paymentShouldAmount = paymentShouldAmount;
    }

    public Double getPaymentRealAmount() {
        return paymentRealAmount;
    }

    public void setPaymentRealAmount(Double paymentRealAmount) {
        this.paymentRealAmount = paymentRealAmount;
    }

    public Double getPaymentDebtAmount() {
        return paymentDebtAmount;
    }

    public void setPaymentDebtAmount(Double paymentDebtAmount) {
        this.paymentDebtAmount = paymentDebtAmount;
    }

    public String getPaymentRemark() {
        return paymentRemark;
    }

    public void setPaymentRemark(String paymentRemark) {
        this.paymentRemark = paymentRemark == null ? null : paymentRemark.trim();
    }
}