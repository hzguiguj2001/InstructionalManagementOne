package com.guigu.instructional.system.service;

import java.util.List;

import com.guigu.instructional.po.RoleInfo;

/**       
 * <p>project_name:InstructionalManagement</p>
 * <p>package_name:com.guigu.instructional.system.service.RoleInfoService</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月26日下午1:17:26 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public interface RoleInfoService {
    
    /**
     * addRole:添加角色
     * @author 刘老师
     * @param roleInfo
     * @return  <br/>
     * @since JDK 1.8
     */
    public boolean addRole(RoleInfo roleInfo);
    
    /**
     * 
     * updateRole:更新角色
     * @author 刘老师
     * @param roleInfo
     * @return  <br/>
     * @since JDK 1.8
     */
    public boolean updateRole(RoleInfo roleInfo);
    
    /**
     * getRoleInfoList:根据条件查询所有的角色
     * @author 刘老师
     * @param roleInfo
     * @return  <br/>
     * @since JDK 1.8
     */
    public List<RoleInfo> getRoleInfoList(RoleInfo roleInfo);
    
    /**
     * getRoleInfo:根据编号查询角色信息
     * @author 刘老师
     * @param roleId
     * @return  <br/>
     * @since JDK 1.8
     */
    public RoleInfo getRoleInfo(Integer roleId);
}


