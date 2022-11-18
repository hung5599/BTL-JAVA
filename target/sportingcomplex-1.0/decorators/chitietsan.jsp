<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">

	<!-- CSS -->
	<link rel="stylesheet" href="<c:url value = '/template/web/asset/CSS/chitietsan.css' />">
	<link href="<c:url value = '/template/web/asset/font/fontawesome-free-6.1.2-web/css/all.css'/>" rel = "stylesheet" type = "text/css" media="all" />
	<link href="<c:url value = '/template/web/asset/CSS/main.css' />" rel = "stylesheet" type = "text/css" media="all" />
	<!-- Javascript -->
	<script type="text/javascript" src = "<c:url value = '/template/web/asset/JS/chitietsan.js' />"></script>
	
	<title>Chi tiết sân</title>
</head>
<body>

	<!-- Header -->
	<%@include file="/common/web/header.jsp"%>
	<!-- End header -->
	
	<dec:body />
</body>
</html>