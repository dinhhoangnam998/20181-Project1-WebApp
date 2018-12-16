<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add InputEvent</title>
</head>
<body>
	<h3>Welcome to add inputEvent</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/inputEvent/add"
		modelAttribute="inputEvent">
		<table>
			<tr>
				<td><form:label path="inputdate">Input Date</form:label></td>
				<td><form:input path="inputdate" type="date" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>