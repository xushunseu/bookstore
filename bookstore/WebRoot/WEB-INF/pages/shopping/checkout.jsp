<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>订单结算</title>
		<link type="text/css" rel="stylesheet" href="style/base.css" />
		<link type="text/css" rel="stylesheet" href="style/layout.css" />
		<link type="text/css" rel="stylesheet" href="style/booklist.css" />
		<link type="text/css" rel="stylesheet" href="style/order.css" />
		<link type="text/css" rel="stylesheet" href="style/form.css" />
	</head>

	<body>
		<div id="wrap">
			<jsp:include page="../header.jsp"></jsp:include>
			<div id="content">
				<jsp:include page="inputOrderInf.jsp"></jsp:include>
			</div>
			<div id="footer">
				<jsp:include page="../footer.jsp"></jsp:include>
			</div>
	</body>
</html>