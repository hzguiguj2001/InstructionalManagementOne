<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<%@ include file="/view/public/common.jspf"%>
</head>

<body>
	<div style="padding: 0px; margin: 0px;">
		<ul class="breadcrumb" style="margin: 0px;">
			<li><a href="#">班级管理</a></li>
			<li>教室信息</li>
		</ul>
	</div>
	<script type="text/javascript">
		function query(condition) {
			$("#keyword").attr("name", condition.value);
		}
	</script>
	
	<div class="row alert alert-info" style="margin: 0px; padding: 3px;">
		<form
			action="${pageContext.request.contextPath}/classinfo/classroominfo/list.action"
			method="post" class="form-horizontal">
			<div class="col-sm-1">查询条件:</div>
			<div class="col-sm-3">
				<select class="form-control  input-sm" onchange="query(this)" name="condition">
					<option value="">请选择</option>
					<option value="classroomId">教室编号</option>
					<option value="classroomName">教室名称</option>
					<option value="classroomMax">容纳人量</option>
				</select>
			</div>
			<div class="col-sm-3">
				<input type="text" id="keyword" class="form-control input-sm" />
			</div>
			<input type="submit" class="btn btn-danger" value="查询" />
			<input type="button" class="btn btn-success" value="添加" onClick="javascript:window.location='${pageContext.request.contextPath}/view/classinfo/classroominfo/classroominfo_add.jsp'" />
		</form>
	</div>
	<div align="center">
	<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">&times;</span>
			
		</button>
		<p align="center" style="color: red;">员工信息-${info}</p>
	</div>	
</div>
	<div class="row" style="padding: 15px; padding-top: 0px;">
		<table class="table  table-condensed table-striped"></table>
		<display:table class="table table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/classinfo/classroominfo/list.action">
			<display:column property="classroomId" title="教室编号"></display:column>
			<display:column property="classroomName" title="教室名称"></display:column>
			<display:column property="classroomMax" title="教室容量"></display:column>
			<display:column property="classroomInfo" title="设备信息"></display:column>
			<display:column href="${pageContext.request.contextPath }/classinfo/classroominfo/load.action" paramId="classroomId" paramProperty="classroomId" value="修改" title="修改"></display:column>
			<display:column href="${pageContext.request.contextPath }/classinfo/classroominfo/delete.action" paramId="classroomId" paramProperty="classroomId" value="删除" title="删除"></display:column>
		</display:table>
	</div>
</body>
</html>
