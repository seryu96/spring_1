<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>QnA List</h1>
	
	<div>
		<h3>Title : ${view.title}</h3>
		<h3>Writer : ${view.writer}</h3>
		<h3>Age : ${view.age}</h3>
	</div>
	
	<a href="./qnaView">View</a>
	<a href="./qnaWrite">Write</a>
	<a href="../">Home</a>
</body>
</html>