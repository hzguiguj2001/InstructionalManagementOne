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
        <li><a href="${pageContext.request.contextPath }/classinfo/disciplineinfo/list.action">学科信息</a></li>
        <li>查看学科信息</li>
    </ul>
</div>

<form action="" class="form-horizontal">
   	<div class="row">
    	<div class="col-sm-5 col-sm-offset-4">
        	<a href="${pageContext.request.contextPath }/classinfo/disciplineinfo/load.action?disciplineId=${disciplineInfo.disciplineId}" class="btn btn-success" >修改</a>
        	<a href="${pageContext.request.contextPath }/classinfo/disciplineinfo/delete.action?disciplineId=${disciplineInfo.disciplineId}" class="btn btn-success" >删除</a>
        	<a href="${pageContext.request.contextPath }/classinfo/disciplineinfo/list.action" class="btn btn-waring" >返回上一级</a>
        </div>
    </div>
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">学科编号</label>
                <div class="col-sm-9">
                	<p class="form-control-static">${disciplineInfo.disciplineId}</p>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">学科名称</label>
                <div class="col-sm-9">
                	<p class="form-control-static">${disciplineInfo.disciplineName}</p>
                </div>
            </div>
        </div>

    </div>
    <!-- 开始2 -->
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">学科费用</label>
                <div class="col-sm-5">
                	<p class="form-control-static">${disciplineInfo.disciplineTuition}</p>
                </div>
            </div>
        
        </div>
        <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">学科课时</label>
                <div class="col-sm-4">
                	<p class="form-control-static">${disciplineInfo.disciplineBring}</p>
                </div>
            </div>
        </div>
    </div>
    <!-- 结束2 -->
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">备注信息</h5>
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">备注</label>
                <div class="col-sm-9">
                		<p class="form-control-static">
                			${disciplineInfo.disciplineDesc}
                		</p>
                </div>
            </div>
        
        </div>

    </div>
</form>

</body>
</html>
