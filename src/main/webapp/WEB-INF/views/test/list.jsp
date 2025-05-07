<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 뷰, 수정, 삭제 -->
<table border="1">
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>가격</th>
	</tr>
	<c:forEach items="${list}" var="test">
	<tr>
		<td>${test.tiNum}</td>
		<td><a href="/test/view?tiNum=${test.tiNum}">${test.tiName}</a></td>
		<td>${test.tiDesc}</td>
	</tr>
	</c:forEach>
</table>
<a href="/views/test/insert">등록</a>
</body>
</html>