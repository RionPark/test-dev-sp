<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="/test/delete">
<input type="hidden" name="tiNum" value="${test.tiNum}">
<table border="1">
	<tr>
		<th>번호</th>
		<td>${test.tiNum}</td>
	</tr>
	<tr>
		<th>이름</th>
		<td>${test.tiName}</td>
	</tr>
	<tr>
		<th>가격</th>
		<td>${test.tiPrice}</td>
	</tr>
	<tr>
		<th>설명</th>
		<td>${test.tiDesc}</td>
	</tr>
	<tr>
		<th colspan="2">
			<button type="button" onclick="location.href='/test/update?tiNum=${test.tiNum}'">수정</button>
			<button>삭제</button>
		</th>
	</tr>
</table>
</form>
</body>
</html>