<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" 	prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 	prefix="c" 	 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>首页</title>
	<%@ include file="/view/public/common.jspf" %>
</head>

<body>
	<div style="padding:0px; margin:0px;">
		<ul class="breadcrumb" style=" margin:0px; " >
			<li><a href="#">学员管理</a></li>
			<li><a href="${pageContext.request.contextPath}/student/studentwritegrade/list.action">
					学员成绩记录</a></li>
			<li>修改学员成绩</li>
		</ul>
	</div>
	
	<c:if test="${ allErrors!=null }">
		<br/>
		<c:forEach items="${ allErrors }" var="error">
			${ error.defaultMessage }
			<br/>
		</c:forEach>
	</c:if>
	
	<form action="${ pageContext.request.contextPath }/student/studentwritegrade/update.action" 
			method="post" class="form-horizontal">
			
		<!-- 基本信息 -->
		<h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
		<!-- begin 基本信息  row 1-->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">成绩编号</label>
					<div class="col-sm-9">
						<input type="text" name="writeGradeId" 
								value="${ studentWriteGrade.writeGradeId }"
								class="form-control input-sm" readonly="readonly"/>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">学员姓名</label>
					<div class="col-sm-9">
						<select class="form-control input-sm" name="studentId" >
							<option>请选择</option>
							<c:forEach items="${studentInfoList}" var="studentInfo">
								<option value="${studentInfo.studentId}" 
										${studentInfo.studentId==studentWriteGrade.studentId?'selected':'' }>
									${studentInfo.studentName}
								</option>
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
		</div>
		<!-- end   基本信息  row 1 -->
			
		<!-- begin 基本信息  row 2 -->	
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">课程名称</label>
					<div class="col-sm-9">
						<select class="form-control input-sm" name="disciplineId" >
							<option>请选择</option>
							<c:forEach items="${disciplineInfoList}" var="disciplineInfo">
								<option value="${disciplineInfo.disciplineId}"
										${disciplineInfo.disciplineId==studentWriteGrade.disciplineId?'selected':'' }>
									${disciplineInfo.disciplineName}
								</option>
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
		
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">教师姓名</label>
					<div class="col-sm-9">
						<select class="form-control input-sm" name="staffId" >
							<option>请选择</option>
							<c:forEach items="${staffInfoList}" var="staffInfo">
								<option value="${staffInfo.staffId}" 
									${staffInfo.staffId==studentWriteGrade.staffId?'selected':''}>
									${staffInfo.staffName}
								</option>
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
					<label class="col-sm-3 control-label">成绩</label>
					<div class="col-sm-9">
						<input type="text" name="writeGrade" 
								value="${ studentWriteGrade.writeGrade }"
								class="form-control input-sm" placeholder="请输入成绩"/>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">考试时间</label>
					<div class="col-sm-9">
						<input type="text" name="writeGradeTime" onclick="WdatePicker()"
								value="<fmt:formatDate value="${studentWriteGrade.writeGradeTime}" 
										type="both" pattern="yyyy-MM-dd"/>" 
								class="form-control input-sm" placeholder="请输入考试时间"
								readonly="readonly"/>
					</div>
				</div>
			</div>
		</div>
		<!-- end   基本信息  row 3 -->
		
		<!-- 成绩备注 -->
		<h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">成绩备注</h5>    
		<!-- begin 成绩备注  row 1 -->
		<div class="row">
			<div class="col-sm-10">
				<div class="form-group">
					<label class="col-sm-3 control-label">成绩备注</label>
					<div class="col-sm-9">
						<textarea class="form-control" name="writeGradeNote">
							${ studentWriteGrade.writeGradeNote }
						</textarea>
					</div>
				</div>
			</div>
		</div>
		<!-- end   成绩备注  row 1 -->
		
		<!-- 底部按钮 -->
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="保存"/>
				<a href="${ pageContext.request.contextPath }/student/studentwritegrade/list.action"
						class="btn btn-warning">返回上一级</a>
			</div>
		</div>
	</form>
</body>
</html>
