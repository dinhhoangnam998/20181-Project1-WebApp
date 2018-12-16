<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Profile</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>${user.id}</td>
		</tr>
		<tr>
			<td>username</td>
			<td>${user.username}</td>
		</tr>
		<tr>
			<td>email</td>
			<td>${user.email}</td>
		</tr>
		<tr>
			<td>fullname</td>
			<td>${user.fullname}</td>
		</tr>
		<tr>
			<td>gender</td>
			<td>${user.gender}</td>
		</tr>
		<tr>
			<td>birthday</td>
			<td>${user.birthday}</td>
		</tr>
		<tr>
			<td>address</td>
			<td>${user.address}</td>
		</tr>
		<tr>
			<td>phone</td>
			<td>${user.phone}</td>
		</tr>
		
		
	</table>
	<a href="<%=request.getContextPath()%>/user/signIn">Sign In</a>
	
</body>
</html>