<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Book_InputEvent</title>
</head>
<body>
	<h3>Welcome to edit Book_InputEvent</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/book_InputEvent/edit"
		modelAttribute="book_InputEvent">
		<table>
			<form:hidden path="id" value="${book_InputEvent.id}" />
			<tr>
				<td><form:label path="book.id">Book Id</form:label></td>
				<td><form:input path="book.id" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="inputevent.id">Input Event Id</form:label></td>
				<td><form:input path="inputevent.id" type="number" /></td>
			</tr>

			<tr>
				<td><form:label path="inputprice">Input Price</form:label></td>
				<td><form:input path="inputprice" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="quantity">Quantity</form:label></td>
				<td><form:input path="quantity" type="number" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>