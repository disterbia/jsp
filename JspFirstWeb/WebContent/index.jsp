<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>JSP 파일</h1>
<%

	int num = 10;
	int num2 = 20;
	int sum= num+num2;
%>

num+num2=<%=sum%>
</body>
</html>