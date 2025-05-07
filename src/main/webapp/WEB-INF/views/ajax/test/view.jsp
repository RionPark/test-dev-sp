<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>번호</th>
		<td data-col="tiNum"></td>
	</tr>
	<tr>
		<th>이름</th>
		<td data-col="tiName"></td>
	</tr>
	<tr>
		<th>가격</th>
		<td data-col="tiPrice"></td>
	</tr>
	<tr>
		<th>설명</th>
		<td data-col="tiDesc"></td>
	</tr>
	<tr>
		<th colspan="2">
			<button onclick="location.href='/views/ajax/test/update?tiNum=${param.tiNum}'">수정</button>
			<button onclick="deleteTest()">삭제</button>
		</th>
	</tr>
</table>
<script>
window.addEventListener('load', async function(){
	const res = await fetch('/test/ajax/view?tiNum=${param.tiNum}');
	const test = await res.json();
	for(const key in test){
		if(document.querySelector('[data-col=' + key + ']')){
			document.querySelector('[data-col=' + key + ']').innerHTML = test[key];
		}
	}
})
async function deleteTest(){
	const res = await fetch('/test/ajax/delete/${param.tiNum}',{
		method:'DELETE'
	});
	const result = await res.json();
	if(result===1){
		alert('삭제 성공');
		location.href='/views/ajax/test/list';
	}
}
</script>
</body>
</html>