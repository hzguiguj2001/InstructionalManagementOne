<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>

<%@ include file="/view/public/common.jspf" %>

</head>

<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">系统管理</a></li>
        <li>教师管理</li>
        <li>查看教师信息</li>
    </ul>
</div>

<form action="" class="form-horizontal">
   	<div class="row">
    	<div class="col-sm-5 col-sm-offset-4">
        	<a href="${pageContext.request.contextPath }/system/staffinfo/load.action?staffId=${staffInfo.staffId}" class="btn btn-success" >修改</a>
        	<a href="${pageContext.request.contextPath }/system/staffinfo/delete.action?staffId=${staffInfo.staffId}" class="btn btn-success" >删除</a>
        	<a href="${pageContext.request.contextPath }/system/staffinfo/teacherlist.action" class="btn btn-waring" >返回上一级</a>
        </div>
    </div>
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">编号</label>
                <div class="col-sm-9">
                	<p class="form-control-static">${staffInfo.staffId}</p>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">姓名</label>
                <div class="col-sm-9">
                	<p class="form-control-static">${staffInfo.staffName}</p>
                </div>
            </div>
        </div>

    </div>
    <!-- 开始2 -->
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">年龄</label>
                <div class="col-sm-5">
                	<p class="form-control-static">${staffInfo.staffAge}</p>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">性别</label>
                <div class="col-sm-4">
                	<p class="form-control-static">${staffInfo.staffSex}</p>
                </div>
            </div>
        </div>
    </div>
    <!-- 结束2 -->
    <!-- 开始3 -->
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">籍贯</label>
                <div class="col-sm-6">
                	<p class="form-control-static">${staffInfo.staffNativePlace}</p>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">身份证</label>
                <div class="col-sm-9">
               <p class="form-control-static">${staffInfo.staffIdcard}</p>
                </div>
            </div>
        </div>
    </div>
    <!-- 结束3 -->
        <!-- 开始4 -->
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">出生日期</label>
                <div class="col-sm-9">
                	 <p class="form-control-static">
                	 	<fmt:formatDate value="${staffInfo.staffBirthday}" pattern="yyyy年MM月dd日" type="both"/>
                	 </p>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">办公电话</label>
                <div class="col-sm-9">
                 <p class="form-control-static">${staffInfo.staffOfficePhone}</p>
                </div>
            </div>
        </div>
    </div>
    <!-- 结束4 -->
    <!-- 开始4 -->
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">电子邮件</label>
                <div class="col-sm-9">
                	  <p class="form-control-static">${staffInfo.staffEmail}</p>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">移动电话</label>
                <div class="col-sm-9">
               	 <p class="form-control-static">${staffInfo.staffOfficePhone}</p>
                </div>
            </div>
        </div>
    </div>
    <!-- 结束4 -->    
    <!-- 开始5 -->
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">家庭住址</label>
                <div class="col-sm-9">
                	<p class="form-control-static">${staffInfo.staffAddr}</p>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">QQ</label>
                <div class="col-sm-9">
              		 <p class="form-control-static">${staffInfo.staffQq}</p>
                </div>
            </div>
        </div>
    </div>
    <!-- 结束5 -->    
    <!-- 开始6 -->
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">入职时间</label>
                <div class="col-sm-9">
                	 <p class="form-control-static">
                	 		<fmt:formatDate value="${staffInfo.staffEntryTime}" pattern="yyyy年MM月dd日" type="both"/>
                	 </p>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">教育水平</label>
                <div class="col-sm-6">
                		<p class="form-control-static">${staffInfo.staffEducationLevel}</p>
                </div>
            </div>
        </div>
    </div>
    <!-- 结束6 -->   
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">备注信息</h5>
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">备注</label>
                <div class="col-sm-9">
                		<p class="form-control-static">
                			${staffInfo.staffRemark}
                		</p>
                </div>
            </div>
        
        </div>

    </div>
        <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">账号信息</h5>
    	<div class="row">
        	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">账号</label>
                <div class="col-sm-9">
                	<p class="form-control-static">
                		${staffInfo.staffNumber}
                	</p>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">密码</label>
                <div class="col-sm-9">
                	<p class="form-control-static">
                		${staffInfo.staffPassword}
                	</p>
                </div>
            </div>
        </div>
    </div>
   	<div class="row">
    	<div class="col-sm-5 col-sm-offset-4">
          <a href="${pageContext.request.contextPath }/system/staffinfo/load.action?staffId=${staffInfo.staffId}" class="btn btn-success" >修改</a>
        	<a href="${pageContext.request.contextPath }/system/staffinfo/delete.action?staffId=${staffInfo.staffId}" class="btn btn-success" >删除</a>
        	<a href="${pageContext.request.contextPath }/system/staffinfo/teacherlist.action" class="btn btn-waring" >返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>
