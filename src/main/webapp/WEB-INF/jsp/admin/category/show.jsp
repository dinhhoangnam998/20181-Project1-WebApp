<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>List of Categories</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Name</td>
		</tr>

		<c:forEach var="listItem" items="${listCategory}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>