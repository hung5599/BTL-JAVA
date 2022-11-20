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
           <li class="items"><a href= "<c:url value = '/dat-san' />">Đặt sân</a></li>
           <li class="items"><a href="<c:url value = '/danh-sach-tran-dau' />" >Trận đấu</a></li>
           <li class="items"><a href="<c:url value = '/thanh-toan' />">Thanh toán</a></li>
           <li class="items"><a href='#'/>Xin chào, ${usermod.fullName}</a></li>
           <li class="nav-item"><a class="nav-link" href='<c:url value="/log-out?action=logout"/>'>Thoát</a></li>
      		 </c:if>
               <c:if test="${not empty usermod}">
           Xin chào, ${uermod.fullName }z
       		</c:if>
                <i class="fa-solid fa-caret-down"></i>
                <ul class="sub_menu">
                    <li><a href="#">Quản lý sân</a></li>
                    <li><a href="#">Quản lý trận đấu</a></li>
                    
                    <li href='<c:url value="/log-out?action=logout"/>'>Thoát</a></li>
                </ul>
            </li>
        </ul>
    </div>
</header>	