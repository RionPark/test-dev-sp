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
<input type="hidden" id="tiNum" >
<input type="text" id="tiName" ><br>
<input type="text" id="tiPrice"><br>
<input type="text" id="tiDesc"><br>
<button onclick="updateTest()">수정</button>
<script>
window.addEventListener('load',async function(){
	const res = await fetch('/test/ajax/view?tiNum=${param.tiNum}');
	const test = await res.json();
	for(const key in test){
		if(document.querySelector('#' + key)){
			document.querySelector('#' + key).value = test[key];
		}
	}
})

async function updateTest(){
	const param = {
			tiNum : document.querySelector('#tiNum').value,
			tiName : document.querySelector('#tiName').value,
			tiPrice : document.querySelector('#tiPrice').value,
			tiDesc : document.querySelector('#tiDesc').value
	}
	
	const res = await fetch('/test/ajax/update',{
		method : 'POST',
		headers : {
			'Content-Type':'application/json'
		},
		body : JSON.stringify(param)
	})
	const result = await res.json();
	if(result==1){
		alert('정상 수정');
		location.href='/views/ajax/test/view?tiNum=${param.tiNum}';
	}
}
</script>
</body>
</html>