<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
My HomePage

<%! //��������
	String makeItLower(String data){
	return data.toLowerCase();
}
%>

<% //�޼����
	int count = 34;
%>
<h1>���� ���̴� <%=count %>�Դϴ�.</h1>
<h2> HELLO WORLD�� �ҹ��ڷ� �����ϸ� <%=makeItLower("HELLO WORLD") %></h2>
</body>
</html>