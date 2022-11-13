<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Đăng nhập</title>
</head>
<body>

 <div class="container">
     <div id="login-row" class="row justify-content-center align-items-center">
         <div id="login-column" class="col-md-6">
             <div id="login-box" class="col-md-12">
                 <form id="login-form" class="form" action="<c:url value = '/log-in'/>" method="post">
                     <h3 class="text-center text-info">Đăng nhập</h3>
                        <c:if test="${not empty mess}">
						<div class="alert alert-${alert}">${mess}</div>
			            </c:if>
                     <div class="form-group">
                         <label for="username" class="text-info">Username:</label><br>
                         <input type="text" name="userName" id="userName" class="form-control" placeholder="username">
                     </div>
                     <div class="form-group">
                         <label for="password" class="text-info">Password:</label><br>
                         <input type="password" name="passWord" id="passWord" class="form-control" placeholder="password">
                     </div>
                     <div class="form-group">
                         <label for="remember-me" class="text-info"><span>Nhớ mật khẩu</span><span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>
                     	 <input type = "hidden" value="login" name = "action"/>
                     	 <button type="submit" class="btn btn-info btn-md">Đăng nhập</button>
                     	
                     </div>
                     <div id="register-link" class="text-right">
                         <a href="#" class="text-info">Register here</a>
                     </div>
                 </form>
             </div>
         </div>
     </div>
 </div>
</body>
</html>