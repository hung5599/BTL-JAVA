<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
	<title><dec:title default="Trang chủ" /></title>
	<!-- Css -->
	<link href="<c:url value = '/template/web/asset/CSS/main.css' />" rel = "stylesheet" type = "text/css" media="all" />
	<link href="<c:url value = '/template/web/asset/font/fontawesome-free-6.1.2-web/css/all.css'/>" rel = "stylesheet" type = "text/css" media="all" />
	<link href="<c:url value = 'https://fonts.googleapis.com/css?family=Dancing+Script|Itim|Lobster
				|Montserrat:500|Noto+Serif|Nunito|Patrick+Hand|Roboto+Mono:100,100i,300,300i,400,400i,
				500,500i,700,700i|Roboto+Slab|Saira'/>" rel = "stylesheet" type = "text/css" media="all" />
	<link href = "<c:url value = 'https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css'/>"rel = "stylesheet" type = "text/css" media="all" />
	
</head>
<body>

	<%@include file = "/common/web/header.jsp" %>
	<dec:body />
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" > </script>
	<script type="text/javascript" src = "<c:url value = '/template/web/asset/JS/main.js' />"></script>

</body>
</html>