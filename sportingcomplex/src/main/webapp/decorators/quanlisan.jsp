<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Quản lý sân</title>
        
       <link rel="stylesheet" href="<c:url value = '/template/admin/asset/CSS/quanlisan.css' />" rel = "stylesheet" type = "text/css" media="all" >
        <link href="<c:url value = '/template/web/asset/font/css/all.css'/>" rel = "stylesheet" type = "text/css" media="all" >
    </head>
<body>

	<%@ include file = "/common/admin/header.jsp" %>

	<dec:body/>
	
	<script type="text/javascript" src = "<c:url value = '/template/admin/asset/JS/quanlisan.js' />"></script>
</body>
</html>