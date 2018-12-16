<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Authors</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Name</td>
			<td>Birth Day</td>
			<td>Death Day</td>
			<td>Description</td>
			<td>Image Url</td>
		</tr>

		<c:forEach var="listItem" items="${listAuthor}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.name}</td>
				<td>${listItem.birthday}</td>
				<td>${listItem.deathday}</td>
				<td>${listItem.description}</td>
				<td>${listItem.imageurl}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>