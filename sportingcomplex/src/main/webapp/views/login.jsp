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
<body>
 <div class="container cont">
     <div id="login-row" class="row justify-content-center align-items-center">
         <div id="login-column" class="col-md-6 cont1">
                 <form id="login-form" class="form form1" action="<c:url value = '/log-in'/>" method="post">
                     <h1 class="text-center text-info title ">Đăng nhập</h1>
                        <c:if test="${not empty mess}">
						<div class="${alert}">${mess}</div>
			            </c:if>
                     <div class="form-group form-group1">
                         <label for="username" class="text-info">Username:</label><br>
                         <input type="text" name="userName" id="userName" class="form-control inp" placeholder="username">
                     </div>
                     <div class="form-group form-group1">
                         <label for="password" class="text-info">Password:</label><br>
                         <input type="password" name="passWord" id="passWord" class="form-control inp" placeholder="password">
                     </div>
                     <div class="form-group form-group1">
                         <label for="remember-me" class="text-info"><span>Nhớ mật khẩu</span><span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>
                     	 <input type = "hidden" value="login" name = "action"/>
                     	 <button type="submit" class="btn btn-info btn-md submit-btn">Đăng nhập</button>                  	
                     </div>
                     <div id="register-link" class="text-right link">
                         <a href="<c:url value = '/sign-up'/>" class="text-info">Đăng ký tại đây</a>
                     </div>
                 </form>
             </div>
         </div>
     </div>
 </div>
</body>
</html>
</html>