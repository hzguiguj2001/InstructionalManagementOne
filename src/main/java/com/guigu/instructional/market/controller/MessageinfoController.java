package com.guigu.instructional.market.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.market.mapper.MessageInfoStaffMapper;
import com.guigu.instructional.market.service.MessageinfoService;
import com.guigu.instructional.po.EmailInfoStaff;
import com.guigu.instructional.po.MessageInfo;
import com.guigu.instructional.po.MessageInfoStaff;
import com.guigu.instructional.po.MessageInfoStaffVO;
import com.guigu.instructional.system.service.StaffInfoService;

@Controller
@RequestMapping("/marketactive/messafeinfo")
public class MessageinfoController {

	@Resource(name="staffInfoServiceImpl")
    private StaffInfoService staffInfoService;
	
	@Resource(name="messageinfoServiceImpl")
	private MessageinfoService messageinfoService ;
	
	@Resource(name="messageInfoStaffMapper")
	private MessageInfoStaffMapper messageInfoStaffMapper;
	
	@RequestMapping("list.action")
	public String list(MessageInfoStaffVO messageInfoStaffVO,Model model) {
		List<MessageInfoStaff> list =messageInfoStaffMapper.findMessageInfoStaffList(messageInfoStaffVO);
		System.out.println(list);
	    model.addAttribute("list", list);
	    return "marketactive/messafeinfo/messafeinfo_list";
	}
//    public String list(MessageInfo messageInfo,Model model) {
//        List<MessageInfo> list =messageinfoService.getMessageinfoList(messageInfo);
//        model.addAttribute("list", list);
//        return "marketactive/messafeinfo/messafeinfo_list";
//    }
	
	@RequestMapping("query.action")
	public String query(MessageInfoStaffVO messageInfoStaffVO,Model model) {
		List<MessageInfoStaff> list = messageInfoStaffMapper.queryMessageInfoStaffList(messageInfoStaffVO);
		model.addAttribute("list", list);
	    return "marketactive/messafeinfo/messafeinfo_list";
	}
	
	@RequestMapping("look.action")
    public String lookMessageInfo(Integer messageId1,Model model) {
		MessageInfo messageInfo =messageinfoService.getMessageinfo(messageId1);
        model.addAttribute("messageInfo", messageInfo);
        return "marketactive/messafeinfo/messafeinfo_show";
    }
	
	@RequestMapping("delete.action")
    public String deleteMessageInfo(MessageInfo messageInfo,Model model) {
        //状态为"0"无效
		messageInfo.setMessageState("0");
        boolean result =messageinfoService.updateMessageinfo(messageInfo);
        if(result) {
            model.addAttribute("info", "删除成功");
        }else {
            model.addAttribute("info", "删除失败");
        }
        return this.list(null, model);
    }
	
	@RequestMapping("send.action")
	public String addMessageInfo(@Validated MessageInfo messageInfo,BindingResult bindingResult,Model model) throws Exception{
		
		//获取校验错误信息
        if(bindingResult.hasErrors()) {
            //输出错误信息
            List<ObjectError> allErrors=bindingResult.getAllErrors();
            //将错误信息传递到页面
            model.addAttribute("allErrors", allErrors);
            
            //通过model对象再次传递数据
            model.addAttribute("messageInfo", messageInfo);
            
            //转发到商品修改页面
            return "marketactive/messafeinfo/messafeinfo_send";
        }
		
		
		//状态为“1”有效
		messageInfo.setMessageState("1");
		boolean result = messageinfoService.sendMessageinfo(messageInfo);
		if(result) {
			model.addAttribute("info", "发送成功");
		}else {
			model.addAttribute("info", "发送失败");
		}
		return this.list(null, model);
	}
	
}
