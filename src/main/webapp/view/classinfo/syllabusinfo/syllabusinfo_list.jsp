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
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">班级管理</a></li>
        <li>课程表</li>
    </ul>
</div>
<script type="text/javascript">
		function query(condition) {
			$("#keyword").attr("name", condition.value);
		}
	</script>
	<div class="row alert alert-info"  style="margin:0px; padding:3px;" >
		<form action="${pageContext.request.contextPath}/classinfo/syllabusinfo/list.action"
				method="post" class="form-horizontal">
				<div class="col-sm-1">查询条件:</div>
				<div class="col-sm-3">
					<select class="form-control  input-sm" onchange="query(this)" name="condition">
						<option value="">请选择</option>
						<option value="syllabusId">课程表编号</option>
						<option value="syllabusName">课程表名称</option>
					</select>
				</div>
				<div class="col-sm-3">
					<input type="text" id="keyword" class="form-control input-sm" />
				</div>
				<input type="submit" class="btn btn-danger" value="查询" />
				<input type="button" class="btn btn-success" value="添加" onClick="javascript:window.location='${pageContext.request.contextPath}/view/classinfo/syllabusinfo/syllabusinfo_add.jsp'" />
			</form>
	</div>
	<div class="row" style="padding: 15px; padding-top: 0px;">
		<table class="table  table-condensed table-striped"></table>
		<display:table class="table table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/classinfo/syllabusinfo/list.action">
			<display:column property="syllabusId" title="课程编号"></display:column>
			<display:column property="syllabusName" title="课程名称"></display:column>
			<display:column property="syllabusYi" title="星期一"></display:column>
			<display:column property="syllabusEr" title="星期二"></display:column>
			<display:column property="syllabusSan" title="星期三"></display:column>
			<display:column property="syllabusSi" title="星期四"></display:column>
			<display:column property="syllabusWu" title="星期五"></display:column>
			<display:column property="syllabusLiu" title="星期六"></display:column>
			<display:column property="syllabusQi" title="星期七"></display:column>
			<display:column href="${pageContext.request.contextPath }/classinfo/syllabusinfo/load.action" paramId="syllabusId" paramProperty="syllabusId" value="修改" title="修改"></display:column>
			<display:column href="${pageContext.request.contextPath }/classinfo/syllabusinfo/delete.action" paramId="syllabusId" paramProperty="syllabusId" value="删除" title="删除"></display:column>
		</display:table>
	</div>
</body>
</html>
