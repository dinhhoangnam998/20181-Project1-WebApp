<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book_SaleEvent</title>
</head>
<body>
	<h3>Welcome to add Book_SaleEvent</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/book_SaleEvent/add"
		modelAttribute="book_SaleEvent">
		<table>

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