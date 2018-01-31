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
			<li><a href="${pageContext.request.contextPath }/student/evaluationinfo/list.action">
					学员评价记录</a></li>
			<li>修改评价记录</li>
		</ul>
	</div>
	
	<c:if test="${ allErrors!=null }">
		<br/>
		<c:forEach items="${ allErrors }" var="error">
			${ error.defaultMessage }
			<br/>
		</c:forEach>
	</c:if>
	
	<form action="${ pageContext.request.contextPath }/student/evaluationinfo/update.action" 
			method="post" class="form-horizontal">
	
		<!-- 基本信息 -->
		<h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">基本信息</h5>
		<!-- begin 基本信息  row 1-->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">评价编号</label>
					<div class="col-sm-9">
						<input type="text" name="evaluationId" 
								value="${ evaluationInfo.evaluationId }" 
								class="form-control input-sm" readonly="readonly"/>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">主题</label>
					<div class="col-sm-9">
						<input type="text" name="evaluationTile" 
								value="${ evaluationInfo.evaluationTile }"
								class="form-control input-sm" placeholder="请输入主题"/>
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
										${disciplineInfo.disciplineId==evaluationInfo.disciplineId?'selected':'' }>
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
									${staffInfo.staffId==evaluationInfo.staffId?'selected':''}>
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
					<label class="col-sm-3 control-label">评价时间</label>
					<div class="col-sm-9">
						<input type="text" name="evaluationTime" 
								value="<fmt:formatDate 
										value="${ evaluationInfo.evaluationTime }" 
										type="both" pattern="yyyy-MM-dd"/>" 
								onclick="WdatePicker()" 
								class="form-control input-sm" 
								placeholder="请输入评价时间"/>
					</div>
				</div>
			</div>
						
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">学生姓名</label>				
					<div class="col-sm-9">
						<select class="form-control input-sm" name="studentId" >
							<option>请选择</option>
							<c:forEach items="${studentInfoList}" var="studentInfo">
								<option value="${studentInfo.studentId}"  
										${studentInfo.studentId==evaluationInfo.studentId?'selected':'' }>
									${studentInfo.studentName }
								</option>
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
			
		</div>
		<!-- end   基本信息  row 3 -->
	
		<!-- 评价内容 -->
		<h5 class="page-header alert-info" style="padding:10px; margin:0px; margin-bottom:5px;">评价内容</h5>
		<!-- begin 评价内容  row 1 -->
		<div class="row">
			<div class="col-sm-10">
				<div class="form-group">
					<label class="col-sm-3 control-label">评价内容</label>
					<div class="col-sm-9">
						<textarea class="form-control" name="evaluationContent">
							${ evaluationInfo.evaluationContent }
						</textarea>
					</div>
				</div>
			</div>
		</div>
		<!-- end   评价内容  row 1 -->

		<!-- 底部按钮 -->
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="保存"/>
				<a href="${pageContext.request.contextPath }/student/evaluationinfo/list.action" 
						class="btn btn-warning">返回上一级</a>
			</div>
		</div>
	</form>
</body>
</html>
