<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail Page</title>
</head>
<body>
	<h1>Detail Page</h1>
	<hr>
		<div>
            <p>번호 : ${dto.id}</p>
            <p>제목 : ${dto.title}</p>
            <p>작성자 : ${dto.writer}</p>
            <p>내용 : ${dto.content}</p>
        </div>
        
    <a href="delete?bno=${dto.id}">삭제하기</a><br>
    <a href="list">목록보기</a><br>
</body>
</html>