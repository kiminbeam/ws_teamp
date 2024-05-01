<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>
<h1>──── WriteForm Page ────</h1>
<br>
	<table>
            <form action="write" method="post" class="writeform" name="inputForm" onsubmit="return checkField();">
            <tr class="formhead">
                <th>제목</th>
                <td><input type="text" name="title" placeholder="제목을 입력하세요."></td>
                <th>작성자</th>
                <td><input type="text" name="writer" placeholder="이름을 입력하세요."></td>
            </tr>
            <tr class="formbody">
                <th>내용</th>
                <td colspan="3"><input type="text" name="content" class="content" placeholder="내용을 입력하세요.">
            </tr>
            <tr>
                <td colspan="4">
                    <input type="submit" value="입력" class="btn">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <button type="button" onclick="location.href='list'" class="btn">목록보기</button>
                </td>
            </tr>
        	</form>
	</table>


	<script>
		function checkField(){
			let inputs = document.inputForm;
			if(!inputs.title.value){
				alert("제목을 입력하세요.");
				return false;
			}
			if(!inputs.writer.value){	
				alert("이름을 입력하세요.");
				return false;
			}
			if(!inputs.content.value){
				alert("내용을 입력하세요.");
				return false;
			}		
		}
	</script>
</body>
</html>