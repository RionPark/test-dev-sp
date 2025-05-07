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
<input type="hidden" name="tiNum" value="${test.TI_NUM}">
<table border="1">
	<tr>
		<th>번호</th>
		<td>${test.TI_NUM}</td>
	</tr>
	<tr>
		<th>이름</th>
		<td>${test.TI_NAME}</td>
	</tr>
	<tr>
		<th>가격</th>
		<td>${test.TI_PRICE}</td>
	</tr>
	<tr>
		<th>설명</th>
		<td>${test.TI_DESC}</td>
	</tr>
	<tr>
		<th colspan="2">
			<button type="button" onclick="location.href='/test/update?tiNum=${test.TI_NUM}'">수정</button>
			<button>삭제</button>
		</th>
	</tr>
</table>
</form>
</body>
</html>