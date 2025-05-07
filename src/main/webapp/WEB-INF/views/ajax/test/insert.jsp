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
<input type="text" id="tiName"><br>
<input type="text" id="tiPrice"><br>
<input type="text" id="tiDesc"><br>
<button onclick="insertTest()">등록</button>
<script>
async function insertTest(){
	const param = {
			tiName : document.querySelector('#tiName').value,
			tiPrice : document.querySelector('#tiPrice').value,
			tiDesc : document.querySelector('#tiDesc').value
	}
	
	const res = await fetch('/test/ajax/insert',{
		method : 'POST',
		headers : {
			'Content-Type':'application/json'
		},
		body : JSON.stringify(param)
	})
	const result = await res.json();
	if(result==1){
		alert('정상 입력');
		location.href='/views/ajax/test/list';
	}
}

</script>
</body>
</html>