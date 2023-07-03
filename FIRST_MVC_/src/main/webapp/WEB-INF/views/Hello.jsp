<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% session.getAttribute("user"); %>

<h1>hello soham</h1>
<h2>${msg}</h2>
<h3>${user.uname}</h3>
</body>
</html>