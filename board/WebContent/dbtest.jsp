<%@page import="dao.DBConn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	DBConn.getConnection();
%>
<h2>DBTest페이지 입니다.</h2>
</body>
</html>