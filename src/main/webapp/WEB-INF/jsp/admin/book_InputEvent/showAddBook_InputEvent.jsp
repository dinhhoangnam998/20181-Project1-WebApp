<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Add Book_InputEvent</title>
</head>
<body>
	<h3>Welcome to add Book_InputEvent</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/addBook_InputEvent"
		modelAttribute="book_InputEvent">
		<table>

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