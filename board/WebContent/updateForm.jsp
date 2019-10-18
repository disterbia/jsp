<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>수정화면</h1>
<hr/>
<form action="/board/BoardController?cmd=update" method="POST">
	<input type="hidden" name="id" value= "${board.id }"/>
	<input type="text" name="title" value="${board.title}"/><br/>
	<textarea rows="5" cols="50" name="content" placeholder="내용">
	${board.content}</textarea><br/>
	<input type="submit" value="수정 완료"/>
</form>
</body>
</html>