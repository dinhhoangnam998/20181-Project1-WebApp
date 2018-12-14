<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Edit Creation</title>
</head>
<body>
	<h3>Welcome to edit creation</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/editCreation"
		modelAttribute="creation">
		<table>
			<form:hidden path="id" value="${creation.id}" />
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="releasedate">Release Date</form:label></td>
				<td><form:input path="releasedate" type="date" /></td>
			</tr>
			<tr>
				<td><form:label path="category.id">Category Id</form:label></td>
				<td><form:input path="category.id" type="number" /></td>
			</tr>

			<tr>
				<td><form:label path="author.id">Author Id</form:label></td>
				<td><form:input path="author.id" type="number" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>