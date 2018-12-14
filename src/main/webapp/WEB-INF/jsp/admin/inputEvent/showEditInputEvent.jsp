<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    	<title>Edit InputEvent</title>
    </head>
    <body>
        <h3>Welcome to edit inputEvent</h3>
	<form:form method="POST"
		action="/Project1WebApplication/admin/editInputEvent"
		modelAttribute="inputEvent">
		<table>
			<form:hidden path="id" value="${inputEvent.id}" />

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