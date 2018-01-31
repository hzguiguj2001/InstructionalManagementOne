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
        <li>营销活动</li>
    </ul>
</div>

<%-- <form action="${pageContext.request.contextPath }/marketactive/marketactive/query.action" class="form-inline">
     <div class="form-group">
         <label class="" >活动名称：</label>
        <input type="text" class="form-control" name="activeName" placeholder="请输入活动名称">
      </div>
      <!-- <div class="form-group">
         <label class="" for="activstate">活动状态：</label>
		 <select  class="form-control" id="activstate">
            <option>活动状态</option>
         </select>	
      </div> -->
    <input type="submit"   class="btn btn-danger"     value="查询"/>
    <a  class="btn btn-success"  href="${pageContext.request.contextPath}/view/marketactive/marketactive/marketactive_add.jsp">添加活动</a>
    </form> --%>
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >
    <form action="${pageContext.request.contextPath }/marketactive/marketactive/query.action" class="form-horizontal">
	<div class="col-sm-2">活动名称：</div>
    <div class="col-sm-3">
    	<input type="text" name="activeName" class="form-control input-sm"/>
    </div>
    <input type="submit"   class="btn btn-danger"     value="查询"/>
    <a  class="btn btn-success"  href="${pageContext.request.contextPath}/view/marketactive/marketactive/marketactive_add.jsp" >添加活动</a>
    </form>
</div>

<!-- 提示信息模块 -->
<div align="center">
	<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">&times;</span>
			
		</button>
		<p align="center" style="color: red;">活动 -${info}</p>
	</div>	
</div>


<div class="row" style="padding:15px; padding-top:0px; " align="right">
	<table class="table  table-condensed table-striped">
    </table>
    <display:table class="table table-condensed table-striped" pagesize="10" name="list" requestURI="${pageContext.request.contextPath }/marketactive/marketactive/list.action">
    	<display:column property="activeId" title="编号"></display:column>
    	<display:column property="activeName" title="活动名称" ></display:column>
    	<display:column property="staffName" title="负责人"></display:column>
    	<display:column property="activeStart" title="开始时间" format="{0,date,yyyy年MM月dd日}"></display:column>
    	<display:column property="activeEnd" title="结束时间" format="{0,date,yyyy年MM月dd日}"></display:column>
    	<display:column property="activeContent" title="描述"></display:column>
    	<display:column href="${pageContext.request.contextPath }/marketactive/marketactive/look.action" paramId="activeId" paramProperty="activeId" value="查看" title="查看"></display:column>
    	<display:column href="${pageContext.request.contextPath }/marketactive/marketactive/delete.action" paramId="activeId" paramProperty="activeId" value="删除" title="删除"></display:column>
    </display:table>
    
</div>
</body>
</html>
