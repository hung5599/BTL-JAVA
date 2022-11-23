<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thanh toan</title>
</head>
<body>
    <div class="center">
        <h1 style = "margin-top: 65px">Thanh Toán </h1>
        <div class="text1">Có thể thực hiện thanh toán trực tiếp trên website hoặc thanh toán trực tiếp khi đến nhận sân</div>
        <div class="list">
            <ul>
                <li>Vào ứng dụng ngân hàng của bạn trên điện thoại và chọn chức năng quét mã QR trong đó</li>
                <li>Quét mã QR bên dưới</li>
                <li>Nhập số tiền cần thanh toán</li>
                <li>Nội dung chuyển tiền: Ngày giờ đặt-Người đặt-Số sân-Loại sân </li>
            </ul>
        </div>
        <!-- <img id="img2" src="/Front-End-BTL/img/qr.png" alt=""> -->
        <img id="img2" src="<c:url value = 'template/web/asset/img/qr.png'/>" alt="">
        
    </div>
    <div class="backimg">
        <!--./asset/img/Sports.png-->
        <!--/template/web/asset/img/Sports.png-->
        <img id="img1" src="<c:url value = '/template/web/asset/img/Sports.png'/>" alt="">
        <img id="img3" src="<c:url value = '/template/web/asset/img/Sports.png'/>" alt="">
    </div> 
</body>
</body>
</html>