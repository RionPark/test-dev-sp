<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
	<tbody id="tBody"></tbody>
</table>
<a href="/views/ajax/test/insert">등록</a>
<script>
window.addEventListener('load',async function load(){
	const res = await fetch('/test/ajax/list');
	const list = await res.json();
	let html = '';
	for(const test of list){
		html += '<tr>';
		html += '<td>' + test.tiNum + '</td>'
		html += '<td><a href="/views/ajax/test/view?tiNum=' + test.tiNum + '">' + test.tiName + '</a></td>'
		html += '<td>' + test.tiDesc + '</td>'
		html += '</tr>';
	}
	document.querySelector('#tBody').innerHTML = html;
});
</script>
</body>
</html>