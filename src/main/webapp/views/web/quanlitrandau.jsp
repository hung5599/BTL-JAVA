<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sách trận đấu</title>
</head>
<body>
    <div class="title">
        <h2>Danh sách các sân đã đặt</h2>
    </div>
    <div class="content">
        <div class="manage_table football_table">
            <h3> User Name : <span></span> </h3>
            <table class="table1">
                <tr>
                    <th>Sân đặt</th>
                    <th>Loại sân</th>
                    <th>Ngày</th>
                    <th>Khung giờ</th>
                    <th>Giá</th>
                    <th>Hủy sân</th>
                </tr>
            </table>
        </div>
    </div>

    <!--tong-->
    <div class="total">
        <div class="text">Tổng tiền : </div>
        <div class="sum"><span class="total__price"></span></div>
    </div>
</body>
</html>