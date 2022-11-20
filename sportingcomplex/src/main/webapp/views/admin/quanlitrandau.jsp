<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">
<body>
<header>
	    <div class="con1">
	        <img id="logo" src="template/web/asset/img/logo.png" alt="">
	        <span id="name">SPORTING COMPLEX</span>
	    </div>
	    <div class="con2">
	        <ul>
	            <li>
	                <i class="fa-sharp fa-solid fa-user"></i> 
	            	<c:if test="${not empty usermod}">
	           			Xin chào, ${usermod.fullName }
	       			</c:if>
	                <i class="fa-solid fa-caret-down"></i>
	                <ul class="sub_menu">
	                    <li><a href="<c:url value = '/admin-quan-li-san' />">Quản lý sân</a></li>
	                    <li><a href="<c:url value = '/admin-quan-li-tran-dau' />">Quản lý trận đấu</a></li>
	 					<c:if test="${not empty usermod}">               
	                    	<li class="nav-item"><a class="nav-link" href='<c:url value="/log-out?action=logout"/>'>Thoát</a></li>
	                    </c:if>
	                </ul>
	            </li>
	        </ul>
	    </div>
	</header>
	<div class="title">
		<h2>Danh sách các sân đã đặt</h2>
	</div>
	<div class="content">
		<div class="manage_table football_table">
			<h3>
				User Name : <span></span>
			</h3>
			<table class="table1">
				<tr>
					<th>Sân đặt</th>
					<th>Loại sân</th>
					<th>Ngày</th>
					<th>Khung giờ</th>
					<th>Hủy sân</th>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>