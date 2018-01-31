package com.guigu.instructional.market.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guigu.instructional.market.mapper.EmailInfoStaffMapper;
import com.guigu.instructional.market.service.EmailInfoService;
import com.guigu.instructional.po.EmailInfo;
import com.guigu.instructional.po.EmailInfoStaff;
import com.guigu.instructional.po.MessageInfoStaffVO;
import com.guigu.instructional.system.service.StaffInfoService;

@Controller
@RequestMapping("/marketactive/emailinfo")
public class EmailInfoController {

	@Resource(name="staffInfoServiceImpl")
    private StaffInfoService staffInfoService;
	
	@Resource(name="emailInfoServiceImpl")
	private EmailInfoService emailInfoService ;
	
	@Resource(name="emailInfoStaffMapper")
	private EmailInfoStaffMapper emailInfoStaffMapper;
	
	@RequestMapping("list.action")
	public String list(MessageInfoStaffVO messageInfoStaffVO,Model model) {
		List<EmailInfoStaff> list =emailInfoStaffMapper.findEmailInfoStaffList(messageInfoStaffVO);
		System.out.println(list);
	    model.addAttribute("list", list);
	    return "marketactive/emailinfo/emailinfo_list";
	}
	
	@RequestMapping("query.action")
	public String query(MessageInfoStaffVO messageInfoStaffVO,Model model) {
		List<EmailInfoStaff> list = emailInfoStaffMapper.queryEmailInfoStaff(messageInfoStaffVO);
		model.addAttribute("list", list);
	    return "marketactive/emailinfo/emailinfo_list";
	}
	
	@RequestMapping("look.action")
    public String lookEmailInfo(Integer emailId,Model model) {
		EmailInfo emailInfo =emailInfoService.getEmailInfo(emailId);
        model.addAttribute("emailInfo", emailInfo);
        return "marketactive/emailinfo/emailinfo_show";
    }
	
	@RequestMapping("delete.action")
    public String deleteEmailInfo(EmailInfo emailInfo,Model model) {
        //状态为"0"无效
		emailInfo.setEmailState("0");
        boolean result =emailInfoService.updateEmailInfo(emailInfo);
        if(result) {
            model.addAttribute("info", "删除成功");
        }else {
            model.addAttribute("info", "删除失败");
        }
        return this.list(null, model);
    }
	
	@RequestMapping("send.action")
	public  String addEmailInfo( EmailInfo emailInfo,Model model) {
		
		//状态为“1”有效
		emailInfo.setEmailState("1");
		boolean result = emailInfoService.sendEmailInfo(emailInfo);
		if(result) {
			model.addAttribute("info", "发送成功");
		}else {
			model.addAttribute("info", "发送失败");
		}
		return this.list(null, model);
	}
	
	@RequestMapping("submit.action")
	public  String submitEmailInfo(@Validated EmailInfo emailInfo,BindingResult bindingResult,Model model)  throws Exception {
		
		//获取校验错误信息
        if(bindingResult.hasErrors()) {
            //输出错误信息
            List<ObjectError> allErrors=bindingResult.getAllErrors();
            //将错误信息传递到页面
            model.addAttribute("allErrors", allErrors);
            
            //通过model对象再次传递数据
            model.addAttribute("emailInfo", emailInfo);
            
            //转发到商品修改页面
            return "marketactive/emailinfo/emailinfo_send";
        }
        
        	//状态为“1”有效
      		emailInfo.setEmailState("1");
      		boolean result = emailInfoService.sendEmailInfo(emailInfo);
      		if(result) {
      			model.addAttribute("info", "发送成功");
      		}else {
      			model.addAttribute("info", "发送失败");
      		}
      		return this.list(null, model);
	}
	
}
