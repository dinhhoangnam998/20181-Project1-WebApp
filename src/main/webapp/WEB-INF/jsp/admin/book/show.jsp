<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Books</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Language</td>
			<td>Page Number</td>
			<td>Republish No</td>
			<td>ISBN</td>
			<td>Width</td>
			<td>Height</td>
			<td>Weight</td>
			<td>Cover Price</td>
			<td>Description</td>
			<td>Image Url</td>
		</tr>

		<c:forEach var="listItem" items="${listBook}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.language}</td>
				<td>${listItem.pagenumber}</td>
				<td>${listItem.republishno}</td>
				<td>${listItem.isbn}</td>
				<td>${listItem.width}</td>
				<td>${listItem.height}</td>
				<td>${listItem.weight}</td>
				<td>${listItem.coverprice}</td>
				<td>${listItem.description}</td>
				<td>${listItem.imageurl}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>