<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Type</title>
</head>
<body>
	<h3>Welcome to edit type</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/type/edit" modelAttribute="type">
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