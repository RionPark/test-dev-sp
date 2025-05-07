<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>유저등록</h3>
<form method="POST" action="/user/insert">
	<input type="text" name="uiName"><br>
	<input type="text" name="uiId"><br>
	<input type="text" name="uiPwd"><br>
	<input type="text" name="uiDesc"><br>
	<button>등록</button>
</form>
</body>
</html>