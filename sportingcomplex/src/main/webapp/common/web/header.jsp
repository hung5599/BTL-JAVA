<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<header>
        <div class="con1">
            <img id="logo" src="template/web/img/logo.png" alt="">
            <span id="name">SPORTING COMPLEX</span>
        </div>
        <div class="con2">
            <ul>
                <li class="items"><a href= "<c:url value = '/trang-chu' />" >Trang chủ</a></li>
                <li class="items"><a href= "<c:url value = '/dat-san' />">Đặt sân</a></li>
                <li class="items"><a href="<c:url value = '/views/web/thanhtoan.jsp' />">Thanh toán</a></li>
                <c:if test="${not empty UserModel}">
	            <li class="item"><a href='#'>Wellcome, ${UserModel.FullName}</a></li>
	            <li class="items js-log-in"><a href='<c:url value="/thoat?action=logout"/>'>Thoát</a></li>
	            </c:if>
	            <c:if test="${empty UserModel}">
	              <li class="items js-log-in"><a href="<c:url value = '/dang-nhap?action=login'/>">Đăng nhập</a></li>
	              </li>
	            </c:if>
            </ul>
        </div>
</header>