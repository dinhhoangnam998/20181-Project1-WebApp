<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit category</title>
</head>
<body>
	<h3>Welcome to edit category</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/editCategory"
		modelAttribute="category">
		<table>

			<form:hidden path="id" value="${category.id}" />

			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>