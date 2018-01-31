<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>

<%@ include file="/view/public/common.jspf" %>

</head>

<body>

<!-- 显示错误信息 -->
		<c:if test="${allErrors!=null }">
			 <c:forEach items="${allErrors}" var="error">
			 	${error.defaultMessage }<br/>
			 </c:forEach>
		</c:if>

<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">营销管理</a></li>
        <li>短信管理</li>
        <li>发送信息</li>
    </ul>
</div>

<form action="${pageContext.request.contextPath}/marketactive/messafeinfo/send.action" class="form-horizontal">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">模板</label>
                <div class="col-sm-9">
                	<select name="" class="form-control input-sm">
                    	<option>短信模板一</option>
                        <option>短信模板一</option>
                        <option>短信模板一</option>
                        <option>短信模板一</option>
                    </select>
                </div>
            </div>
        
        </div>
    </div>
    
    <div class="row">
                <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">发送人ID</label>
                <div class="col-sm-9">
                	<input type="text" name="staffId" value="${messageInfo.staffId}" class="form-control input-sm" placeholder="请输入发送人"/>
                </div>
            </div>
        </div>
        
        </div>
    
    	<div class="row">
                <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">接收人</label>
                <div class="col-sm-9">
                	<input type="text" name="messageMan" value="${messageInfo.messageMan}" class="form-control input-sm" placeholder="请输入接收人"/>
                </div>
            </div>
        </div>
        
        </div>
    
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">电话号码</label>
                <div class="col-sm-9">
                	<input type="text" name="messagePhone" value="${messageInfo.messagePhone}" class="form-control input-sm"  placeholder="请输入电话号码"/>
                </div>
            </div>
        
        </div>

    </div>
    <div class="row">
	    <div class="col-sm-5">
	        	<div class="form-group">
	            	<label class="col-sm-3 control-label">发送时间</label>
	                <div class="col-sm-9">
	                	<input type="text" name="messageTime" value="${messageInfo.messageTime}" onclick="WdatePicker()" readonly="readonly" class="form-control input-sm" placeholder="请输入发送时间"/>
	                </div>
	            </div>
	    </div>
    </div>
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">短信内容信息</h5>
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">短信内容</label>
                <div class="col-sm-9">
                	<textarea class="form-control" name="messageContent">${messageInfo.messageContent}</textarea>
                </div>
            </div>
        
        </div>

    </div>
 
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="发送"/>

              <a class="btn btn-warning" href="${pageContext.request.contextPath}/marketactive/messafeinfo/list.action">返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>
