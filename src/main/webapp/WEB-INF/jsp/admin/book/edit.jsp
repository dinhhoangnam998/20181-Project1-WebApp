<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Book</title>
</head>
<body>
	<h3>Welcome to edit book</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/book/edit" modelAttribute="book">
		<table>
			<form:hidden path="id" value="${book.id}" />

			<tr>
				<td><form:label path="description">description</form:label></td>
				<td><form:input path="description" /></td>
			</tr>
			<tr>
				<td><form:label path="language">language</form:label></td>
				<td><form:input path="language" /></td>
			</tr>
			<tr>
				<td><form:label path="pagenumber">pagenumber</form:label></td>
				<td><form:input path="pagenumber" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="republishno">republishno</form:label></td>
				<td><form:input path="republishno" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="isbn">isbn</form:label></td>
				<td><form:input path="isbn" /></td>
			</tr>
			<tr>
				<td><form:label path="width">width</form:label></td>
				<td><form:input path="width" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="height">height</form:label></td>
				<td><form:input path="height" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="weight">weight</form:label></td>
				<td><form:input path="weight" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="coverprice">coverprice</form:label></td>
				<td><form:input path="coverprice" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="imageurl">imageurl</form:label></td>
				<td><form:input path="imageurl" /></td>
			</tr>
			<tr>
				<td><form:label path="creation.id">Creation Id</form:label></td>
				<td><form:input path="creation.id" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="type.id">Type Id</form:label></td>
				<td><form:input path="type.id" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="publisher.id">Publisher Id</form:label></td>
				<td><form:input path="publisher.id" type="number" /></td>
			</tr>


			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>