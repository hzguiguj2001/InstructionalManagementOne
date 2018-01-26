package com.guigu.instructional.system.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.instructional.po.RoleInfo;
import com.guigu.instructional.system.service.RoleInfoService;
import com.guigu.instructional.system.service.StaffInfoService;

/**       
 * <p>project_name:InstructionalManagement</p>
 * <p>package_name:com.guigu.instructional.system.controller.RoleInfoController</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月26日下午1:28:00 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

@Controller
@RequestMapping("/system/roleinfo")
public class RoleInfoController {
    
    @Resource(name="roleInfoServiceImpl")
    private RoleInfoService roleInfoService;
    
    @Resource(name="staffInfoServiceImpl")
    private StaffInfoService staffInfoService;
    
    @RequestMapping("list.action")
    public String list(RoleInfo roleInfo,Model model) {
        List<RoleInfo> list =roleInfoService.getRoleInfoList(roleInfo);
        model.addAttribute("list", list);
        return "system/roleinfo/roleinfo_list";
    }
    
    @RequestMapping("add.action")
    public String add(RoleInfo roleInfo,Model model) {
        boolean reuslt = roleInfoService.addRole(roleInfo);
        if(reuslt) {
            model.addAttribute("info", "添加成功");
        }else {
            model.addAttribute("info", "添加失败");
        }
        return this.list(null, model);
                
    }
    
    @RequestMapping("delete.action")
    public String delete(RoleInfo roleInfo,Model model) {
        roleInfo.setRoleState("0");
        
        boolean reuslt = roleInfoService.updateRole(roleInfo);
        if(reuslt) {
            model.addAttribute("info", "删除成功");
        }else {
            model.addAttribute("info", "删除失败");
        }
        return this.list(null, model);
    }
    
    @RequestMapping("load.action")
    public String load(Integer roleId,Model model) {
        RoleInfo roleInfo =roleInfoService.getRoleInfo(roleId);
        model.addAttribute("roleInfo", roleInfo);
        return "system/roleinfo/roleinfo_update";
        
    }
    
    @RequestMapping("update.action")
    public String update(RoleInfo roleInfo,Model model) {
        boolean result=roleInfoService.updateRole(roleInfo);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
    }
    
    
}


