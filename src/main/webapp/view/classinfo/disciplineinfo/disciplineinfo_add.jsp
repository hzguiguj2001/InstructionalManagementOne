<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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
        <li><a href="${pageContext.request.contextPath }/classinfo/disciplineinfo/list.action">学科信息</a></li>
        <li>添加信息</li>
    </ul>
</div>

<form action="${pageContext.request.contextPath}/classinfo/disciplineinfo/add.action" class="form-horizontal">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">学科名称</label>
                <div class="col-sm-9">
                	<input type="text" name="disciplineName" class="form-control input-sm" placeholder="请输入学科名称"/>
                </div>
            </div>
        </div>
		<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">学科课时</label>
                <div class="col-sm-9">
               		 <input type="text" name="disciplineBring" class="form-control input-sm" placeholder="请输入学科课时"/>
                </div>
            </div>
        
        </div>
    </div>
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">学科费用</label>
                <div class="col-sm-9">
               			<input type="text" name="disciplineTuition" class="form-control input-sm" placeholder="请输入学科费用"/>
                </div>
            </div>
        </div>
    	

    </div>

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">描述</h5>
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">描述</label>
                <div class="col-sm-9">
                	<textarea class="form-control" name="disciplineDesc"></textarea>
                </div>
            </div>
        
        </div>

    </div>
 
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success"  value="保存"/>
            <a class="btn btn-warning" href="${pageContext.request.contextPath }/classinfo/disciplineinfo/list.action" >返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>
