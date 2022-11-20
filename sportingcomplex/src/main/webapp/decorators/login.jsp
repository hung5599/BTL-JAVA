<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
	<title><dec:title default="Đăng nhập" /></title>
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<style>
    .cont{
        margin: 0;
        padding: 0;
        height: 100vh;
        background-color: #3B3486;
    }
    .cont1{
        margin: 0;
        padding: 0;
        height: 100vh;
    }
    .form1{
        width: 30%;
        background-color: aliceblue;
        position: absolute;
        top:50%;
        left: 50%;
        transform: translate(-50%,-50%);
        border-radius: 10px;
    }
    .title{
        text-align: center;
    }
    .form-group1{
        padding:0 20px;
        margin: 10px 0;
        font-size: larger;
    }
    .inp{
        height: 35px;
        width: 100%;
        font-size: large;
    }
    .submit-btn{
        position: absolute;
        left: 50%;
        transform: translateX(-50%);
    }
    .link{
        margin: 30px 0;
        display: flex;
        justify-content: center;
    }
</style>
</head>
<body>
	<div id="login">
		<dec:body/>
	</div>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</body>
</html>