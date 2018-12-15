<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of BillDetails</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Bill Id</td>
			<td>Book Id</td>
			<td>Book_SaleEvent Id</td>
			<td>Book_InputEvent Id</td>
			<td>Quantity</td>
		</tr>
		
		<c:forEach var="listItem" items="${billDetailList}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.bill.id}</td>
				<td>${listItem.book.id}</td>
				<td>${listItem.book_saleevent.id}</td>
				<td>${listItem.book_inputevent.id}</td>
				<td>${listItem.quantity}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>