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
        <li>邮件管理</li>
        <li>发送邮件</li>
    </ul>
</div>


<form action="${pageContext.request.contextPath}/marketactive/emailinfo/submit.action" class="form-horizontal">

    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">模板</label>
                <div class="col-sm-9">
                	<select name="" class="form-control input-sm">
                    	<option>邮件模板一</option>
                    	<option>邮件模板一</option>
                    	<option>邮件模板一</option>
                    	<option>邮件模板一</option>
                    </select>
                </div>
            </div>
        
        </div>
    </div>
     	<div class="row">
                <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">主题</label>
                <div class="col-sm-9">
                	<input type="text" name="emailTitle" value="${emailInfo.emailTitle}" class="form-control input-sm" placeholder="请输入主题"/>
                </div>
            </div>
        </div>
        
        </div>
        
        <div class="row">
                <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">发送人ID</label>
                <div class="col-sm-9">
                	<input type="text" name="staffId" value="${emailInfo.staffId}" class="form-control input-sm" placeholder="请输入发送人"/>
                </div>
            </div>
        </div>
        
        </div>
        
    	<div class="row">
                <div class="col-sm-5">
            <div class="form-group">
            	<label class="col-sm-3 control-label">接收人</label>
                <div class="col-sm-9">
                	<input type="text" name="emailMan" value="${emailInfo.emailMan}" class="form-control input-sm" placeholder="请输入接收人"/>
                </div>
            </div>
        </div>
        
        </div>
        
         <div class="row">
		    <div class="col-sm-5">
		        	<div class="form-group">
		            	<label class="col-sm-3 control-label">发送时间</label>
		                <div class="col-sm-9">
		                	<input type="text" name="emailTime" value="${emailInfo.emailTime}" onclick="WdatePicker()" readonly="readonly" class="form-control input-sm" placeholder="请输入发送时间"/>
		                </div>
		            </div>
		    </div>
    	</div>
       
    	<div class="row">
    	<div class="col-sm-5">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">邮件地址</label>
                <div class="col-sm-9">
                	<input type="text" name="emailAddr" value="${emailInfo.emailAddr}" class="form-control input-sm"  placeholder="请输入邮件地址"/>
                </div>
            </div>
        
        </div>


    </div>
    <h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">邮件内容信息</h5>
    	<div class="row">
    	<div class="col-sm-10">
        	<div class="form-group">
            	<label class="col-sm-3 control-label">邮件内容</label>
                <div class="col-sm-9">
                	<textarea name="emailContent"  class="form-control">${emailInfo.emailContent}</textarea>
                </div>
            </div>
        
        </div>

    </div>
 
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
        	<input  type="submit" class="btn btn-success" value="发送"/>

              <a class="btn btn-warning" href="${pageContext.request.contextPath}/marketactive/emailinfo/list.action">返回上一级</a>
        </div>
    </div>
</form>

</body>
</html>
