<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>List of Book_InputEvent</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Book Id</td>
			<td>Input Event Id</td>
			<td>Input Price</td>
			<td>Quantity</td>
			<td>Remain</td>
		</tr>

		<c:forEach var="listItem" items="${listBook_InputEvent}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.book.id}</td>
				<td>${listItem.inputevent.id}</td>
				<td>${listItem.inputprice}</td>
				<td>${listItem.quantity}</td>
				<td>${listItem.remain}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>