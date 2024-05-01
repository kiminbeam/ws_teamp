<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>
<h1 class="title">──── List Page ────</h1>
<br>
    <table>
    <thead>
        <tr>
	        <th>번호</th><th>제목</th><th>작성자</th>
	    </tr>
    </thead>
	<tbody>
	    <c:forEach var="dto" items="${list}">
        <tr>
            <td>${dto.id}</td>
            <td><a href="detail?id=${dto.id}">${dto.title}</a></td>
            <td>${dto.writer}</td>
        </tr>
    </c:forEach>
	</tbody>
    </table>
    
    <a href="writeForm">글 작성하기</a><br>
</body>
</html>