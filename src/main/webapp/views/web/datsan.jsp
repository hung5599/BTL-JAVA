<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đặt sân</title>
    <link rel="stylesheet" href="<c:url value = '/template/web/asset/CSS/datsan.css' />" >
    <!-- "<c:url value = '/trang-chu' />"  -->
    <!-- /font/css/all.css -->
    <link rel="stylesheet" href="<c:url value = '/template/web/asset/font/css/all.css' />">
</head>
<body>
    <div class="middle">
        <div class="con">
            <div class="pic">
                 <img src="/img/ball2.png" alt="">
            </div>
            <h1> SÂN BÓNG ĐÁ </h1>
            <ul>
                <li><i class="fa-solid fa-check"></i> Giá thuê sân bình dân chỉ từ 250k/sân   </li>
                <li><i class="fa-solid fa-check"></i> 9 sân đấu bao gồm sân 7 và 11 </li>
                <li><i class="fa-solid fa-check"></i> Sân cỏ nhân tạo 100% được bảo dưỡng định kỳ </li>
                <li><i class="fa-solid fa-check"></i> Cung cấp đầy đủ nhu cầu của người chơi thể thao</li>
            </ul>
            <button > <a href="<c:url value = '/views/web/chitietsan.jsp' />"> ĐẶT NGAY </a></button>
        </div>
        <div class="con">
            <div class="pic">
                 <img src="/img/caulong.png" alt="">
            </div>
            <h1> SÂN CẦU LÔNG </h1>
            <ul>
                <li><i class="fa-solid fa-check"></i> Giá thuê sân bình dân chỉ từ 100k/sân   </li>
                <li><i class="fa-solid fa-check"></i> 11 sân cầu lông đạt chuẩn quốc tế WBF </li>
                <li><i class="fa-solid fa-check"></i> Kho dụng cụ tiện lợi cho người chơi </li>
                <li><i class="fa-solid fa-check"></i> Cung cấp đầy đủ nhu cầu của người chơi thể thao</li>
            </ul>
            <button > <a href="#"> ĐẶT NGAY </a></button>
        </div>
        <div class="con">
            <div class="pic">
                 <img src="/img/tenis.png" alt="">
            </div>
            <h1> SÂN TENNIS </h1>
            <ul>
                <li><i class="fa-solid fa-check"></i> Giá thuê sân chỉ từ 150k/sân   </li>
                <li><i class="fa-solid fa-check"></i> Sở hữu 3 sân trong nhà 5 sân ngoài trời  </li>
                <li><i class="fa-solid fa-check"></i> Có đầy đủ thiết bị hiện đại dành cho người tập  </li>
                <li><i class="fa-solid fa-check"></i> Cung cấp đầy đủ nhu cầu của người chơi thể thao</li>
            </ul>
            <button > <a href="#"> ĐẶT NGAY </a></button>
        </div>
    </div>

    
</body>
</html>