<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/common/taglib.jsp" %>
<header>
        <div class="con1">
            <img id="logo" src="template/web/asset/img/Shutterstock_Lisa_Kolbasa.png" alt="">
            <span id="name">SPORTING COMPLEX</span>
        </div>
        <div class="con2">
            <ul>
                <li class="items"><a href= "<c:url value = '/trang-chu' />" >Trang chủ</a></li>
                <li class="items"><a href= "<c:url value = '/dat-san' />">Đặt sân</a></li>
                <li class="items"><a href="<c:url value = '/thanh-toan' />">Thanh toán</a></li>
                <li class="items js-log-in"><a href="#">Đăng nhập</a></li>
            </ul>
        </div>
</header>