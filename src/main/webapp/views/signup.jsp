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
				<h2 class="text-center">ĐĂNG KÝ TÀI KHOẢN</h2>
			</div>
			<div class="panel-body">
			<c:if test="${not empty mess}">
					<div class="alert alert-${alert}">${mess}</div>
	 		    </c:if>
			<form id="login-form" class="form" action="<c:url value = '/sign-up'/>" method="post">
				<div class="form-group">
				  <label for="username">Tên đăng nhập</label><br>
                  <input type="text" name="userName" id="userName" class="form-control">
				</div>
				<div class="form-group">
				  <label for="pwd">Mật khẩu</label>
				  <input type="password" name="passWord" id="passWord" class="form-control">
				</div>
				<div class="form-group">
				  <label for="confirmation_pwd">Xác nhận lại mật khẩu</label>
				  <input type="password" name="repassWord" id="repassWord" class="form-control" >
				</div>

				<input type="checkbox" class="checkBox" id="confirm" name="confirm" value="OK">
				<label for="confirm">Đồng ý với điều khoản của chúng tôi </label>
				<a href="">Điều khoản và chính sách</a>
				<br>
				<button type="submit" id="check" class="btn btn-success" style="width: 100%;">Đăng ký</button>
			</form>
			</div>
		</div>
	</div>

	<!-- <script>
		var btn = document.querySelector("#check");
		var check = document.querySelector(".checkBox");
		while(true) {
			if(!check.checked) {
				btn.setAttribute("disabled", true)
				console.log(check.checked)
			}
			else {
				btn.setAttribute("disabled", false)
				console.log(check.checked)
				return;
			}
		}
	</script> -->
</body>
</htmsl>