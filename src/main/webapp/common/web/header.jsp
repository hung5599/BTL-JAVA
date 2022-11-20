<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/common/taglib.jsp" %>
<head>
	<link rel="stylesheet" href='<c:url value = '/template/web/asset/CSS/header.css'/>'>
</head>
 
  <header>
    <div class="con1">
        <img id="logo" src="template/web/asset/img/logo.png" alt="">
        <span id="name">SPORTING COMPLEX</span>
    </div>
    <div class="con2">
        <ul>
            <li class="items"><a href= "<c:url value = '/trang-chu' />" >Trang chủ</a></li>

        <c:if test="${not empty usermod}">
            <li class="items"><a href= "<c:url value = '/dat-san' />">Đặt sân</a></li>
            <li class="items"><a class="getBtn" href="<c:url value = '/danh-sach-tran-dau' />" >Trận đấu</a></li>
            <li class="items"><a href="<c:url value = '/thanh-toan' />">Thanh toán</a></li>
            <li class="items"><a href='#'/>Xin chào, ${usermod.userName}</a></li>
            <li class="nav-item"><a class="nav-link" href='<c:url value="/log-out?action=logout"/>'>Thoát</a></li>
        </c:if>
         <c:if test="${empty usermod}">
            <li class="items"><a href="<c:url value = 'log-in?action=login' />">Đặt sân</a></li>
            <li class="items"><a href="<c:url value = 'log-in?action=login' />">Thanh toán</a></li>
            <li class="items js-log-in"><a href="<c:url value = 'log-in?action=login' />">Đăng nhập</a></li>
        </c:if>
        </ul>
        <!-- log-in?action=login -->
    </div>
</header>
