<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글쓰기</h1>
<hr/>
<form action="/board/BoardController?cmd=write" method="POST">
	<input type="text" name="title" placeholder="제목"><br/>
	<textarea rows="5" cols="50" name="content" placeholder="내용"></textarea><br/>
	<input type="submit" value="글쓰기 완료">
</form>
</body>
</html>