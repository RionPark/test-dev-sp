<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>등록</h3>
<form method="POST" action="/test/update">
	<input type="hidden" name="tiNum" value="${test.tiNum}">
	<input type="text" name="tiName" value="${test.tiName}"><br>
	<input type="text" name="tiPrice" value="${test.tiPrice}"><br>
	<input type="text" name="tiDesc" value="${test.tiDesc}"><br>
	<button>수정</button>
</form>
</body>
</html>