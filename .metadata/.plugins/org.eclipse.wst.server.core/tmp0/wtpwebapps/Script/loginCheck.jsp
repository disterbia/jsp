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

<h1>아이디와 패스워드</h1>
아이디:<%=email %><br/>
비밀번호:<%=pswd %><br/>
remember:<%= remember %><br/>
<hr/>
<%=request.getCharacterEncoding() %> : 인코딩 <br/>
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