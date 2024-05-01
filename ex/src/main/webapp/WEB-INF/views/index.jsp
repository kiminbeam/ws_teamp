<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<h1>List Page</h1>
<hr>
    <table cellpadding="0" cellspacing="0" border="1">
    <tr>
        <th>번호</th><th>제목</th><th>작성자</th>
    </tr>
    <c:forEach var="dto" items="${list}">
        <tr>
            <td>${dto.id}</td>
            <td><a href="detail?id=${dto.id}">${dto.title}</a></td>
            <td>${dto.writer}</td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>