<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Author</title>
</head>
<body>
	<h3>Welcome to add author</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/author/add"
		modelAttribute="author">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="birthday">Birth day</form:label></td>
				<td><form:input path="birthday" type="date" /></td>
			</tr>
			<tr>
				<td><form:label path="deathday">Death Day</form:label></td>
				<td><form:input path="deathday" type="date" /></td>
			</tr>

			<tr>
				<td><form:label path="description">Description</form:label></td>
				<td><form:input path="description" /></td>
			</tr>
			<tr>
				<td><form:label path="imageurl">Imageurl</form:label></td>
				<td><form:input path="imageurl" name="imageurl" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>