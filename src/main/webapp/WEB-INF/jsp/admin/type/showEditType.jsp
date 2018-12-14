<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Add Type</title>
</head>
<body>
	<h3>Welcome to add type</h3>
	<form:form method="POST" action="/Project1WebApplication/admin/addType"
		modelAttribute="type">
		<table>
			<form:hidden path="id" value="${type.id}" />
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