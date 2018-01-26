package com.guigu.instructional.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.instructional.po.RoleInfo;
import com.guigu.instructional.po.RoleInfoExample;
import com.guigu.instructional.po.RoleInfoExample.Criteria;
import com.guigu.instructional.system.mapper.RoleInfoMapper;
import com.guigu.instructional.system.service.RoleInfoService;

/**       
 * <p>project_name:InstructionalManagement</p>
 * <p>package_name:com.guigu.instructional.system.service.impl.RoleInfoServiceImpl</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月26日下午1:20:47 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */
@Service(value = "roleInfoServiceImpl")
public class RoleInfoServiceImpl implements RoleInfoService {

    @Resource(name = "roleInfoMapper")
    private RoleInfoMapper roleInfoMapper;

    @Override
    public boolean addRole(RoleInfo roleInfo) {
        if (roleInfo != null) {
            // 1 是有效 0是无效
            roleInfo.setRoleState("1");
        }
        int i = roleInfoMapper.insertSelective(roleInfo);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateRole(RoleInfo roleInfo) {
        
        int i=roleInfoMapper.updateByPrimaryKeySelective(roleInfo);
        if(i>0) {
            return true;
        }
        return false;
    }

    @Override
    public List<RoleInfo> getRoleInfoList(RoleInfo roleInfo) {
        RoleInfoExample roleInfoExample =new RoleInfoExample();
        Criteria criteria =roleInfoExample.createCriteria();
        
        if(roleInfo!=null && roleInfo.getRoleName()!=null) {
            roleInfo.setRoleName("%"+roleInfo.getRoleName()+"%");
            criteria.andRoleNameLike(roleInfo.getRoleName());
        }
        
        criteria.andRoleStateEqualTo("1");
        return roleInfoMapper.selectByExample(roleInfoExample);
    }

    @Override
    public RoleInfo getRoleInfo(Integer roleId) {
        return roleInfoMapper.selectByPrimaryKey(roleId);
    }

}
