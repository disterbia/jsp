<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String email =request.getParameter("email");
	String pswd =request.getParameter("pswd");
	String remember=request.getParameter("remember");
	
%>

<h1>���̵�� �н�����</h1>
���̵�:<%=email %><br/>
��й�ȣ:<%=pswd %><br/>
remember:<%= remember %><br/>
<hr/>
<%=request.getCharacterEncoding() %> : ���ڵ� <br/>
<%=request.getContentType() %>:ContentType<br/>
<%=request.getContextPath() %> :ContextPath <br/>
<%=request.getLocalAddr() %> : LocalAddr <br/>
<%=request.getLocalPort() %> : LocalPort<br/>
<%=request.getLocalName() %> : LocalName<br/>
<%=request.getProtocol() %> : Protocol<br/>
<%= request.getQueryString() %> : QuertString<br/>
<%= request.getRemoteAddr() %> : RemoteAddr<br/>
<%= request.getRemoteHost() %> : RemoteHost<br/>
<%= request.getRequestURI() %> : RequestURI<br/>
<%= request.getRequestURL() %> : RequestURL<br/>
<%= request.getReader() %> : Reader <br/>
</body>
</html>