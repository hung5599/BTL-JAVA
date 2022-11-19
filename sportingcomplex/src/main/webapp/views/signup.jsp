<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<title>dang ky</title>
	
</head>
<body>
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h2 class="text-center">Đăng ký</h2>
			</div>
			<div class="panel-body">
				<c:if test="${not empty mess}">
					<div class="alert alert-${alert}">${mess}</div>
			    </c:if>
			<form id="login-form" class="form" action="<c:url value = '/sign-up'/>" method="post">
				<div class="form-group">
				  <label for="username" class="text-info">Username:</label><br>
                  <input type="text" name="userName" id="userName" class="form-control" placeholder="username">
				</div>
				<div class="form-group">
                   <label for="password" class="text-info">Password:</label><br>
                   <input type="password" name="passWord" id="passWord" class="form-control" placeholder="password">
				</div>
				<div class="form-group">
                   <label for="password" class="text-info">rePassword:</label><br>
                   <input type="password" name="repassWord" id="repassWord" class="form-control" placeholder="Confirm-password">
				</div>		
				<button type="submit" class="btn btn-success">Đăng ký</button>
				</form>
			</div>
		</div>
	</div>
	
</body>
</htmsl>