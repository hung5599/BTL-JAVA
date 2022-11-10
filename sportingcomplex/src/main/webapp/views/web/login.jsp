<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
</head>
<body>
    <div id="login">
        <h3 class="text-center text-white pt-5">Đăng nhập</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
						<form action="<c:url value='/dang-nhap'/>" id="formLogin" method="post">
                            <div class="form-group">
                                <label for="username" class="text-info">Tài khoản:</label><br>
                                <input type="text" class="form-control" id="userName" name="userName" placeholder="Tên đăng nhập">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Mật khẩu:</label><br>
                                <input type="password" name="passWord" id="passWord" class="form-control" placeholder="Mật khẩu">
                            </div>
                            <div class="form-group">
                                <label for="remember-me" class="text-info"><span>Nhớ mật khẩu</span> <span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>  
                            </div>
                            <input type="hidden" value="login" name="action"/>
							<button type="submit" class="btn btn-primary" >Đăng nhập</button>
                            <div id="register-link" class="text-right">
                                <a href="#" class="text-info">Đăng ký</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>


