<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" 	prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 	prefix="c"   %>
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
			<li><a href="#">招生管理</a></li>
			<li>学员池</li>
			<li>查看学员信息</li>
		</ul>
	</div>

	<form action=" " class="form-horizontal">
		<div class="row">
			<div class="col-sm-5 col-sm-offset-4">
				<a href="${pageContext.request.contextPath }/student/studentinfo/load.action?studentId=${studentInfo.studentId}"   class="btn btn-success" >修改</a>
				<a href="${pageContext.request.contextPath }/student/studentinfo/delete.action?studentId=${studentInfo.studentId}" class="btn btn-success" >删除</a>
				<a href="${pageContext.request.contextPath }/student/studentinfo/list.action" class="btn btn-waring" >返回上一级</a>
			</div>
		</div>
    
		<!-- 基本信息 -->
		<h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
		<!-- begin 基本信息  row 1-->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">学员编号</label>
					<div class="col-sm-9">
						<p class="form-control-static">${studentInfo.studentId}</p>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">学员姓名</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentName }</p>
					</div>
				</div>
			</div>
		</div>
	    <!-- end   基本信息  row 1 -->
	    
		<!-- begin 基本信息  row 2 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">班级名称</label>
					<div class="col-sm-9">
						<c:forEach items="${classInfoList}" var="classInfo">
							<c:if test="${classInfo.classId==studentInfo.classId}">
								<p>${classInfo.className}</p>
							</c:if>
						</c:forEach>
						
					</div>
				</div>
			</div>
			
			<<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">负责老师</label>
					<div class="col-sm-9">	
						<c:forEach items="${staffInfoList}" var="staffInfo">
							<c:if test="${staffInfo.staffId==studentInfo.staffId}">
								<p>${staffInfo.staffName}</p>
							</c:if>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
		<!-- end   基本信息  row 2 -->
		
		<!-- begin 基本信息  row 3 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">学员性别</label>
					<div class="col-sm-9">
						<p class="form-control-static">${studentInfo.studentSex}</p>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">身份证号</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentIdcard }</p>
					</div>
				</div>
			</div>
		</div>
		<!-- end   基本信息  row 3 -->
		
	    <!-- begin 基本信息  row 4 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">出生日期</label>
					<div class="col-sm-9">
						<p class="form-control-static">
                	 		<fmt:formatDate value="${ studentInfo.studentBirthday }" pattern="yyyy年MM月dd日" type="both"/>
                	 	</p>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">年龄</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentAge }</p>
					</div>
				</div>
			</div>
		</div>
		<!-- end   基本信息  row 4 -->
	
	    <!-- begin 基本信息  row 5 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">手机号码</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentTellphone }</p>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">电子邮件</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentEmail }</p>
					</div>
				</div>
			</div>
		</div>
		<!-- end   基本信息  row 5 -->
	
		<!-- begin 基本信息  row 6 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">QQ号码</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentQq }</p>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">所在院校</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentSchool }</p>
					</div>
				</div>
			</div>
		</div>
		<!-- end   基本信息  row 6 -->
		
		<!-- begin 基本信息  row 7 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">省份</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentPro }</p>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">城市</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentProCity }</p>
					</div>
				</div>
			</div>
		</div>
		<!-- end   基本信息  row 7 -->
	
		<!-- begin 基本信息  row 8 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">家长姓名</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentParentsName }</p>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">家长电话</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentParentsPhone }</p>
					</div>
				</div>
			</div>
			
		</div>
		<!-- end   基本信息  row 8 -->
		
		<!-- begin 基本信息  row 9 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">家庭地址</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentAddress }</p>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">意向状态</label>
					<div class="col-sm-9">
						<p class="form-control-static">${ studentInfo.studentType }</p>
					</div>
				</div>
			</div>
		</div>
		<!-- end   基本信息  row 9 -->
	
		<!-- 描述信息 -->
		<h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">描述信息</h5>
		<!-- begin 描述信息  row 1 -->
		<div class="row">
			<div class="col-sm-10">
				<div class="form-group">
					<label class="col-sm-3 control-label">描述信息</label>
					<div class="col-sm-9">
						<p class="form-control-static">
                			${studentInfo.studentDesc}
                		</p>
					</div>
				</div>
			</div>
		</div>
		<!-- end   描述信息  row 1 -->
 
	 	<!-- 底部按钮 -->
		<div class="row">
			<div class="col-sm-5 col-sm-offset-4">
				<a href="${pageContext.request.contextPath }/student/studentinfo/load.action?studentId=${studentInfo.studentId}"   class="btn btn-success" >修改</a>
				<a href="${pageContext.request.contextPath }/student/studentinfo/delete.action?studentId=${studentInfo.studentId}" class="btn btn-success" >删除</a>
				<a href="${pageContext.request.contextPath }/student/studentinfo/list.action" class="btn btn-waring" >返回上一级</a>
			</div>
		</div>
	</form>
</body>
</html>
