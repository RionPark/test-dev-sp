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
<form method="POST" action="/user/update">
	<input type="hidden" name="uiNum"  value="${user.UI_NUM}"><br>
	<input type="text" name="uiName" value="${user.UI_NAME}"><br>
	<input type="text" name="uiId" value="${user.UI_ID}"><br>
	<input type="text" name="uiPwd" value="${user.UI_PWD}"><br>
	<input type="text" name="uiDesc" value="${user.UI_DESC}"><br>
	<button>수정</button> 
</form>
</body>
</html>