package com.guigu.instructional.market.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.market.mapper.MarketActiveStaffMapper;
import com.guigu.instructional.market.service.MarketActiveService;
import com.guigu.instructional.po.EmailInfo;
import com.guigu.instructional.po.EmailInfoStaff;
import com.guigu.instructional.po.MarketActive;
import com.guigu.instructional.po.MarketActiveStaff;
import com.guigu.instructional.po.MessageInfoStaffVO;

@Controller
@RequestMapping("/marketactive/marketactive")
public class MarketActiveController {

	
	@Resource(name="marketActiveServiceImpl")
	private MarketActiveService marketActiveService;
	
	@Resource(name="marketActiveStaffMapper")
	private MarketActiveStaffMapper marketActiveStaffMapper;
	
	@RequestMapping("list.action")
	public String list(MessageInfoStaffVO messageInfoStaffVO,Model model) {
		List<MarketActiveStaff> list =marketActiveStaffMapper.findMarketActiveStaffList(messageInfoStaffVO);
		System.out.println(list);
	    model.addAttribute("list", list);
	    return "marketactive/marketactive/marketactive_list";
	}
	
	@RequestMapping("query.action")
	public String query(MessageInfoStaffVO messageInfoStaffVO,Model model) {
		List<MarketActiveStaff> list = marketActiveStaffMapper.queryMarketActiveStaffList(messageInfoStaffVO);
		model.addAttribute("list", list);
	    return "marketactive/marketactive/marketactive_list";
	}
	
	@RequestMapping("look.action")
    public String lookMarketActive(Integer activeId,Model model) {
		MarketActive marketActive =marketActiveService.getMarketActive(activeId);
		System.out.println(marketActive+"--look----");
        model.addAttribute("marketActive", marketActive);
        return "marketactive/marketactive/marketactive_update";
    }
	
	@RequestMapping("delete.action")
    public String deleteMarketActive(MarketActive marketActive,Model model) {
        //状态为"0"无效
		marketActive.setActiveState(0);
        boolean result =marketActiveService.updateMarketActive(marketActive);
        if(result) {
            model.addAttribute("info", "删除成功");
        }else {
            model.addAttribute("info", "删除失败");
        }
        return this.list(null, model);
    }
	
	@RequestMapping("send.action")
	public String addMarketActive(@Validated MarketActive marketActive,BindingResult bindingResult,Model model) throws Exception{
		
		//获取校验错误信息
        if(bindingResult.hasErrors()) {
            //输出错误信息
            List<ObjectError> allErrors=bindingResult.getAllErrors();
            //将错误信息传递到页面
            model.addAttribute("allErrors", allErrors);
            
            //通过model对象再次传递数据
            model.addAttribute("marketActive", marketActive);
            
            //转发到商品修改页面
            return "marketactive/marketactive/marketactive_add";
        }
		
		
		//状态为“1”有效
		marketActive.setActiveState(1);
		boolean result = marketActiveService.sendMarketActive(marketActive);
		if(result) {
			model.addAttribute("info", "添加成功");
		}else {
			model.addAttribute("info", "添加失败");
		}
		return this.list(null, model);
	}
	
	@RequestMapping("update.action")
	public String uodateMarketActive(MarketActive marketActive,Model model) {
		boolean result=marketActiveService.updateMarketActive(marketActive);
		 if(result) {
	            model.addAttribute("info", "修改成功");
	        }else {
	            model.addAttribute("info", "修改失败");
	        }
	        return this.list(null, model);
	}
	
}
