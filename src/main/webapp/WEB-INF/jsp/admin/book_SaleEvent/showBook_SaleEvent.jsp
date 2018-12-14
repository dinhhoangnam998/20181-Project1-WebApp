<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Book_SaleEvent</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Book Id</td>
			<td>Sale Event Id</td>
			<td>Sale Percent</td>
		</tr>
		
		<c:forEach var="listItem" items="${book_SaleEventList}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.book.id}</td>
				<td>${listItem.saleevent.id}</td>
				<td>${listItem.salepercent}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>