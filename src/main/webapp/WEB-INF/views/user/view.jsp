<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="/user/delete">
<input type="hidden" value="${user.UI_NUM}" name="uiNum">
<table border="1">
	<tr>
		<th>번호</th>
		<td>${user.UI_NUM}</td>
	</tr>
	<tr>
		<th>아이디</th>
		<td>${user.UI_ID}</td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td>${user.UI_PWD}</td>
	</tr>
	<tr>
		<th>소개</th>
		<td>${user.UI_DESC}</td>
	</tr>
	<tr>
		<th colspan="2">
			<button type="button" onclick="location.href='/user/update?uiNum=${user.UI_NUM}'">수정</button>
			<button>삭제</button>
		</th>
	</tr>
</table>
</form>
</body>
</html>