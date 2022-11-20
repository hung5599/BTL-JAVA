<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
    
<!-- Danh sách trận đấu của user -->
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Danh sách trận đấu</title>
        <link href="<c:url value = '/template/web/asset/font/css/all.css'/>" rel = "stylesheet" type = "text/css" media="all" >
        
       <link rel="stylesheet" href="<c:url value = '/template/web/asset/CSS/quanlitrandau.css' />" rel = "stylesheet" type = "text/css" media="all" >
    </head>
<body>
	
	<%@ include file = "/common/web/header.jsp" %>
	
	<dec:body/>
	
	<script type="text/javascript" src = "<c:url value = '/template/web/asset/JS/quanlitrandau.js' />"></script>
</body>
</html>