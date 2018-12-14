<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Creations</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Name</td>
			<td>Release Date</td>
			<td>Category Id</td>
			<td>Author Id</td>
		</tr>
		
		<c:forEach var="listItem" items="${creationList}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.name}</td>
				<td>${listItem.releasedate}</td>
				<td>${listItem.category.id}</td>
				<td>${listItem.author.id}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>