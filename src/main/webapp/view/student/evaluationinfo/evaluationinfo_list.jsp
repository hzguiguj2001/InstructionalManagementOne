<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>首页</title>
	<%@ include file="/view/public/common.jspf" %>
</head>

<body>
	<div style="padding:0px; margin:0px;">
		<ul class="breadcrumb" style="  margin:0px; " >
			<li><a href="#">学员管理</a></li>
			<li>学员评价记录</li>
		</ul>
	</div>

	<script type="text/javascript">
		function query(condition){
			$("#keyword").attr("name",condition.value);
		}
	</script>
	
	<div class="row alert alert-info" style="margin:0px; padding:3px;" >
		<form action="${pageContext.request.contextPath}/student/evaluationinfo/list.action" 
				method="post" class="form-inline">
			<div class="col-sm-1" >条件:</div>
			<div class="col-sm-3">
				<select class="form-control  input-sm" onchange="query(this)" name="condition">
		        	<option value="">请选择</option>
		        	<option value="evaluationTile">主题</option>
		        </select>
			</div>

			<div class="col-sm-3">
				<input type="text"  id="keyword"  class="form-control input-sm"/>
			</div>
			
			<input type="submit" class="btn btn-danger" value="查询"/>
			<input type="button" class="btn btn-success" value="添加评价信息" 
					onClick="javascript:window.location='${pageContext.request.contextPath}/student/evaluationinfo/addload.action'"/>
		</form>
	</div>
	
	<div align="center">
		<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
			<button type="button" class="close" data-dismiss="alert">
				<span aria-hidden="true">&times;</span>	
			</button>
			<p align="center" style="color: red;">评价信息-${info}</p>
		</div>	
	</div>
	
	<div class="row" style="padding:15px; padding-top:0px; ">
		<table class="table  table-condensed table-striped"></table>
		<display:table class="table table-condensed table-striped" name="list" pagesize="10" 
				requestURI="${pageContext.request.contextPath }/student/evaluationinfo/list.action">
			<display:column property="evaluationInfo.evaluationId" 
					title="评价编号"		></display:column>
			<display:column property="studentName" 
					title="学员姓名"	></display:column>
			<display:column property="evaluationInfo.evaluationTile" 
					title="评价主题"		></display:column>
			<display:column property="evaluationInfo.evaluationContent" 
					title="评价内容"	></display:column>
			<display:column property="disciplineName" 
					title="科目名称"		></display:column>
			<display:column property="staffName" 
					title="负责教师"	></display:column>
			<display:column property="evaluationInfo.evaluationTime" 
					format="{0,date,yyyy年MM月dd日}"
					title="科目名称"		></display:column>
			<display:column href="${ pageContext.request.contextPath }/student/evaluationinfo/load.action" 
					paramId="evaluationId" paramProperty="evaluationInfo.evaluationId" value="修改" title="修改"></display:column>
			<display:column href="${ pageContext.request.contextPath }/student/evaluationinfo/delete.action" 
					paramId="evaluationId" paramProperty="evaluationInfo.evaluationId" value="删除" title="删除"></display:column>
		</display:table>
	</div>
</body>
</html>
