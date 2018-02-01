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
			<li><a href="#">学员管理</a></li>
			<li><a href="${pageContext.request.contextPath }/student/studentinfo/list.action">
					学员信息列表</a></li>
			<li>修改学员信息</li>
		</ul>
	</div>

	<c:if test="${ allErrors!=null }">
		<br/>
		<c:forEach items="${ allErrors }" var="error">
			${ error.defaultMessage }
			<br/>
		</c:forEach>
	</c:if>
	
	<form action="${ pageContext.request.contextPath }/student/studentinfo/update.action" 
			method="post" class="form-horizontal">
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input  type="submit" class="btn btn-success" value="修改"/>
				<a href="${pageContext.request.contextPath }/student/studentinfo/list.action" 
						class="btn btn-waring" >返回上一级</a>
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
						<input type="text" name="studentId" value="${ studentInfo.studentId }" 
								class="form-control input-sm" placeholder="编号将会自动生成" 
								readonly="readonly"/>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">学员姓名</label>
					<div class="col-sm-9">
						<input type="text" name="studentName" value="${ studentInfo.studentName }" 
								class="form-control input-sm" placeholder="请输入姓名"/>
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
						<select class="form-control input-sm" name="classId" >
							<option>请选择班级</option>
							<c:forEach items="${classInfoList}" var="classInfo">
								<option value="${classInfo.classId}"
										${classInfo.classId==studentInfo.classId?'selected':''}>
									${classInfo.className}</option>
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">负责老师</label>
					<div class="col-sm-9">
						<select class="form-control input-sm" name="staffId" >
							<option>请选择负责教师</option>
							<c:forEach items="${staffInfoList}" var="staffInfo">
								<option value="${staffInfo.staffId}"
										${staffInfo.staffId==studentInfo.staffId?'selected':''}>
									${staffInfo.staffName}</option>
							</c:forEach>
						</select>
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
						<select name="studentSex" class="form-control input-sm" >
							<option>保密</option>
							<option ${studentInfo.studentSex=='男'?'selected':''}>男</option>
							<option ${studentInfo.studentSex=='女'?'selected':''}>女</option>
						</select>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">身份证号</label>
					<div class="col-sm-9">
						<input type="text" name="studentIdcard" value="${ studentInfo.studentIdcard }"
								class="form-control input-sm" placeholder="请输入身份证"/>
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
						<input type="text" name="studentBirthday" onclick="WdatePicker()" 
								value="<fmt:formatDate value="${studentInfo.studentBirthday}" 
										type="both" pattern="yyyy-MM-dd"/>" 
								class="form-control input-sm" placeholder="请输入出生日期" 
								readonly="readonly"/>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">学员年龄</label>
					<div class="col-sm-9">
						<input type="text" name="studentAge" value="${ studentInfo.studentAge }"
								class="form-control input-sm" placeholder="请输入年龄"/>
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
						<input type="text" name="studentTellphone" value="${ studentInfo.studentTellphone }"
								class="form-control input-sm" placeholder="请输入手机号码"/>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">电子邮件</label>
					<div class="col-sm-9">
						<input type="text" name="studentEmail" value="${ studentInfo.studentEmail }"
								class="form-control input-sm" placeholder="请输入电子邮件"/>
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
						<input type="text" name="studentQq" value="${ studentInfo.studentQq }"
								class="form-control input-sm" placeholder="请输入QQ号码"/>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">所在院校</label>
					<div class="col-sm-9">
						<input type="text" name="studentSchool" value="${ studentInfo.studentSchool }"
								class="form-control input-sm" placeholder="请输入所在院校"/>
					</div>
				</div>
			</div>
		</div>
		<!-- end   基本信息  row 6 -->
		
		<!-- begin 基本信息  row 7 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">居住省份</label>
					<div class="col-sm-9">
						<input type="text" name="studentPro" value="${ studentInfo.studentPro }"
								class="form-control input-sm" placeholder="请输入省份"/>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">居住城市</label>
					<div class="col-sm-9">
						<input type="text" name="studentProCity" value="${ studentInfo.studentProCity }"
								class="form-control input-sm" placeholder="请输入城市"/>
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
						<input type="text" name="studentParentsName" value="${ studentInfo.studentParentsName }"
								class="form-control input-sm" placeholder="请输入家长姓名"/>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">家长电话</label>
					<div class="col-sm-9">
						<input type="text" name="studentParentsPhone" value="${ studentInfo.studentParentsPhone }"
								class="form-control input-sm" placeholder="请输入家长电话"/>
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
						<input type="text" name="studentAddress" value="${ studentInfo.studentAddress }"
								class="form-control input-sm" placeholder="请输入家庭地址"/>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">意向状态</label>
					<div class="col-sm-9">
						<select name="studentType" class="form-control input-sm">
							<option ${studentInfo.studentType=='无意向'?'selected':''}>无意向</option>
							<option ${studentInfo.studentType=='意向低'?'selected':''}>意向低</option>
							<option ${studentInfo.studentType=='意向中'?'selected':''}>意向中</option>
							<option ${studentInfo.studentType=='意向高'?'selected':''}>意向高</option>
						</select>
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
						<textarea name="studentDesc" class="form-control">
							${ studentInfo.studentDesc }
						</textarea>
					</div>
				</div>
			</div>
		</div>
		<!-- end   描述信息  row 1 -->
 
	 	<!-- 底部按钮 -->
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input  type="submit" class="btn btn-success" value="修改"/>
				<a href="${pageContext.request.contextPath }/student/studentinfo/list.action" 
						class="btn btn-waring" >返回上一级</a>
			</div>
		</div>
	</form>
</body>
</html>
