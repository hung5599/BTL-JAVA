<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <header>
        <div class="con1">
            <img id="logo" src="/Front-End-BTL/img/logo.png" alt="">
            <span id="name">SPORTING COMPLEX</span>
        </div>
        <div class="con2">
            <ul>
                <li>
                    <i class="fa-sharp fa-solid fa-user"></i> 
                    <c:if test="${not empty usermod}">
						Xin chào, ${usermod.fullName}	
     				</c:if>
     				<c:if test="${empty usermod}">
						Admin
     				</c:if>
                    <i class="fa-solid fa-caret-down"></i>
                    <ul class="sub_menu">
                        <li><a href="#">Quản lý sân</a></li>
                        <li><a href="#">Quản lý trận đấu</a></li>
                        <c:if test="${not empty usermod}">
							<li class="nav-item"><a href='<c:url value="/log-out?action=logout"/>'>Thoát</a></li>
     					</c:if>
             
                    </ul>
                </li>
            </ul>
        </div>
    </header>    