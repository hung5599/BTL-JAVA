<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Điền thông tin</title>
</head>
<body> 
    <div class="contain">
        <form>
            <h1>Thông tin cá nhân </h1>
            <div class="inp">
                <label id="nameLabel"class="label" for="name" > Họ và tên  </label>
                <div class="inpcontain">
                    <input type="text" title="name" name="name" onfocus="setLbColor('nameLabel')">
                </div>
            </div>
            <div class="inp">
                <label class="label" for="gender"> Giới tính </label>
                <select  id="gender" title="gender">
                    <option> Nam </option>
                    <option> Nữ </option>
                    <option > Khác </option>
                </select>
            </div>
            <div class="inp">
                <label id="dobLabel" class="label" for="dob" > Ngày sinh  </label>
                <div class="inpcontain">
                    <input type="text" title="dob" name="dob" onfocus="setLbColor('dobLabel')">
                </div>
            </div>
            <div class="inp">
                <label id="phoneLabel" class="label" for="phonenumber" > Số điện thoại </label>
                <div class="inpcontain">
                    <input type="text" title="phonenumber" name="phonenumber" onfocus="setLbColor('phoneLabel')">
                </div>
            </div>
            <div class="inp">
                <label id="addressLabel" class="label" for="address" > Địa chỉ </label>
                <div class="inpcontain">
                    <input type="text" title="address" name="address" onfocus="setLbColor('addressLabel')">  
                </div>
            </div>
            <div class="submitcontain">
                <button class = "btn" id="1" type="button">Cap nhat thong tin</button>
            </div>
             
        </form>
    </div>
   
    
</body>
</html>