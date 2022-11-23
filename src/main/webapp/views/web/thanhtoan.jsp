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
        <h1 style = "margin-top: 65px">ĐẶT CỌC </h1>
        <div class="text1">Để sử dụng tính năng đặt sân trực tuyến người dùng hãy thực hiện theo các bước sau :</div>
        <div class="list">
            <ul>
                <li>Vào ứng dụng ngân hàng của bạn trên điện thoại và chọn chức năng quét mã QR trong đó</li>
                <li>Quét mã QR bên dưới</li>
                <li>Nhập số tiền cọc ( tối thiểu 50% ) </li>
                <li>Nội dung chuyển tiền: Ngày giờ đặt_ Người đặt_ Số sân </li>
                <li>Hoàn tất quá trình chuyển tiền ( tên người nhận tiền là Nguyễn Trọng Huong  ) </li>
                <li>Sau khi thanh toán người dùng chụp lại màn hình rồi up file ảnh bên dưới</li>
            </ul>
        </div>
        <!-- <img id="img2" src="/Front-End-BTL/img/qr.png" alt=""> -->
        <img id="img2" src="<c:url value = 'template/web/asset/img/qr.png'/>" alt="">
        <div class="input-file">
            <label for="">
                <input type="file" title="Chọn file ảnh">
                <br>
                <button type="submit"> Submit</button>
            </label>
        </div>
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