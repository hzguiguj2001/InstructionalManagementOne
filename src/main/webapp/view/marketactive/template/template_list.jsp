<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
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
    	<li><a href="#">营销管理</a></li>
        <li>短信邮件模板</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >
<form action="${pageContext.request.contextPath }/marketactive/template/list.action" class="form-horizontal">
	<div class="col-sm-2">标题:</div>
    <div class="col-sm-3">
    	<input type="text" name="templateTitle" class="form-control input-sm"/>
    </div>
    <input type="submit"   class="btn btn-danger"     value="查询"/>
    <a  class="btn btn-success"  href="${pageContext.request.contextPath}/view/marketactive/template/template_add.jsp" >添加模板</a>
    </form>
</div>

<!-- 提示信息模块 -->
<div align="center">
	<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">&times;</span>
			
		</button>
		<p align="center" style="color: red;">模板信息-${info}</p>
	</div>	
</div>

<div class="row" style="padding:15px; padding-top:0px; " align="right">
	<table class="table  table-condensed table-striped">
    </table>
    <display:table class="table table-condensed table-striped" pagesize="10" name="list" requestURI="${pageContext.request.contextPath }/marketactive/template/list.action">
    	<display:column property="templateId" title="编号"></display:column>
    	<display:column property="templateTitle" title="标题" ></display:column>
    	<display:column property="templateContent" title="内容"></display:column>
    	<display:column property="templateType" title="类别"></display:column>
    	<display:column href="${pageContext.request.contextPath }/marketactive/template/load.action" paramId="templateId" paramProperty="templateId" value="修改" title="修改"></display:column>
    	<display:column href="${pageContext.request.contextPath }/marketactive/template/delete.action" paramId="templateId" paramProperty="templateId" value="删除" title="删除"></display:column>
    </display:table>
    
</div>

</body>
</html>
