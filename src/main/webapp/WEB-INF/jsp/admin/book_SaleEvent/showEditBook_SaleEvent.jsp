<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Edit Book_SaleEvent</title>
</head>
<body>
	<h3>Welcome to edit Book_SaleEvent</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/editBook_SaleEvent"
		modelAttribute="book_SaleEvent">
		<table>
			<form:hidden path="id" value="${book_SaleEvent.id}" />

			<tr>
				<td><form:label path="book.id">Book Id</form:label></td>
				<td><form:input path="book.id" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="saleevent.id">Sale Event Id</form:label></td>
				<td><form:input path="saleevent.id" type="number" /></td>
			</tr>

			<tr>
				<td><form:label path="salepercent">Sale Percent</form:label></td>
				<td><form:input path="salepercent" type="number" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>