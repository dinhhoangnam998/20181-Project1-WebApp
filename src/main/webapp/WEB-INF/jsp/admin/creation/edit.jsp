<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Creation</title>
</head>
<body>
	<h3>Welcome to edit creation</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/creation/edit"
		modelAttribute="creation">
		<table>
			<form:hidden path="id" value="${creation.id}" />
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="description">Description</form:label></td>
				<td><form:input path="description" /></td>
			</tr>
			<tr>
				<td><form:label path="releasedate">Release Date</form:label></td>
				<td><form:input path="releasedate" type="date" /></td>
			</tr>
			<tr>
				<td><form:label path="category.id">Category</form:label></td>
				<td><form:select path="category.id">
						<form:options items="${listCategory}" itemValue="id"
							itemLabel="name" />
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="author.id">Author</form:label></td>
				<td><form:select path="author.id">
						<form:options items="${listAuthor}" itemValue="id"
							itemLabel="name" />
					</form:select></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>