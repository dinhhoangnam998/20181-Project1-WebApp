<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Books</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Description</td>
			<td>Language</td>
			<td>Page Number</td>
			<td>Republish No</td>
			<td>ISBN</td>
			<td>Width</td>
			<td>Height</td>
			<td>Weight</td>
			<td>Cover Price</td>
			<td>Image Url</td>
		</tr>
		
		<c:forEach var="listItem" items="${bookList}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.description}</td>
				<td>${listItem.language}</td>
				<td>${listItem.pagenumber}</td>
				<td>${listItem.republishno}</td>
				<td>${listItem.isbn}</td>
				<td>${listItem.width}</td>
				<td>${listItem.height}</td>
				<td>${listItem.weight}</td>
				<td>${listItem.coverprice}</td>
				<td>${listItem.imageurl}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>