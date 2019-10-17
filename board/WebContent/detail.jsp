<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시글 아이디: ${board.id} <br/>
내용:${board.content}<br/>
<a href="/board/BoardController?cmd=delete&id=${board.id}">삭제</a>
</body>
</html>