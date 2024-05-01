<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail Page</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>
	<h1>──── Detail Page ────</h1>
	<br>
		<table>
			<tr>
				<th>번호</td><td>${dto.id}</td>
			</tr>
			<tr>
				<th>제목</td><td>${dto.title}</td>
			</tr>
			<tr>
				<th>작성자</td><td>${dto.writer}</td>
			</tr>
			<tr>
				<th>내용</td><td>${dto.content}</td>
			</tr>
		</table>
        
    <a href="delete?bno=${dto.id}">삭제하기</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="list">목록보기</a><br>
</body>
</html>