<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title><dec:title default="Đăng nhập" /></title>
	 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="<c:url value='/template/web/CSS/datsan.css' />" rel="stylesheet" type="text/css" media="all"/></head>
	<link href="<c:url value='/template/web/CSS/all.css' />" rel="stylesheet" type="text/css" media="all"/></head>
<body>
    	<!-- Header -->
	<%@include file = "/common/web/header.jsp" %>
	<!-- End header -->
	
	<dec:body />
	

	<!-- webapp\template\web\asset\JS -->
	<script type="text/javascript" src = "<c:url value = '/template/web/JS/main.js' />"></script>
</body>
</html>