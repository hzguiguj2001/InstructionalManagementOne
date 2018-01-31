<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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
    	<li><a href="#">班级管理</a></li>
        <li>课程表</li>
        <li>修改课程表</li>
    </ul>
</div>

<form action="${pageContext.request.contextPath }/classinfo/syllabusinfo/update.action" method="post" class="form-horizontal">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">编号</label>
                <div class="col-sm-9">
                	<input type="text" name="syllabusId" value="${syllabusInfo.syllabusId}" readonly="readonly" class="form-control input-sm" placeholder="请输入编号"/>
                </div>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">课程表名称</label>
                <div class="col-sm-9">
                	<input type="text" name="syllabusName" value="${syllabusInfo.syllabusName}" class="form-control input-sm" placeholder="请输入课程表名称"/>
                </div>
            </div>
        </div>

    </div>
    
    <div class="row">
    	<div class="col-sm-8">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">星期一</label>
                <div class="col-sm-9">
               		<input type="text" name="syllabusYi" value="${syllabusInfo.syllabusYi}" class="form-control input-sm" placeholder="请输入星期一"/>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
    	<div class="col-sm-8">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">星期二</label>
                <div class="col-sm-9">
             		<input type="text" name="syllabusEr" value="${syllabusInfo.syllabusEr}" class="form-control input-sm" placeholder="请输入星期二"/>
                </div>
            </div>
        </div>
    </div>
        <div class="row">
    	<div class="col-sm-8">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">星期三</label>
                <div class="col-sm-9">
              			<input type="text" name="syllabusSan" value="${syllabusInfo.syllabusSan}" class="form-control input-sm" placeholder="请输入星期三"/>
                </div>
            </div>
        </div>
    </div>       
    <div class="row">
    	<div class="col-sm-8">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">星期四</label>
                <div class="col-sm-9">
               		<input type="text" name="syllabusSi" value="${syllabusInfo.syllabusSi}" class="form-control input-sm" placeholder="请输入星期四"/>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
    	<div class="col-sm-8">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">星期五</label>
                <div class="col-sm-9">
               		<input type="text" name="syllabusWu" value="${syllabusInfo.syllabusWu}" class="form-control input-sm" placeholder="请输入星期五"/>
                </div>
            </div>
        </div>
    </div>    
    <div class="row">
    	<div class="col-sm-8">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">星期六</label>
                <div class="col-sm-9">
               		<input type="text" name="syllabusLiu" value="${syllabusInfo.syllabusLiu}" class="form-control input-sm" placeholder="请输入星期六"/>
                </div>
            </div>
        </div>
    </div>    
     <div class="row">
    	<div class="col-sm-8">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">星期天</label>
                <div class="col-sm-9">
               		<input type="text" name="syllabusQi" value="${syllabusInfo.syllabusQi}" class="form-control input-sm" placeholder="请输入星期天"/>
                </div>
            </div>
        </div>
    </div>    
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="保存"/>
        	<a class="btn btn-warning" href="${pageContext.request.contextPath }/classinfo/syllabusinfo/list.action">返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>
