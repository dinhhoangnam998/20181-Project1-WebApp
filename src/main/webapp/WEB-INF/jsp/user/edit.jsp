<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit profile</title>
</head>
<body>
	<h3>Welcome to edit profile</h3>
	<form:form method="POST"
		action="/Project1WebApplication/user/edit"
		modelAttribute="user">
		<table>

			<form:hidden path="id" value="${user.id}" />

			<tr>
				<td><form:label path="username">username</form:label></td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">password</form:label></td>
				<td><form:input path="password" type="password" /></td>
			</tr>
			<tr>
				<td><form:label path="confirmpassword">confirmpassword</form:label></td>
				<td><form:input path="confirmpassword" type="password" /></td>
			</tr>
			<tr>
				<td><form:label path="email">email</form:label></td>
				<td><form:input path="email" type="email" /></td>
			</tr>

			<tr>
				<td><form:label path="fullname">fullname</form:label></td>
				<td><form:input path="fullname" /></td>
			</tr>
			<tr>
				<td><form:label path="gender">gender: 0 female, 1 male, 2 other</form:label></td>
				<td><form:input path="gender" type="number" /></td>
			</tr>
			<tr>
				<td><form:label path="birthday">birthday</form:label></td>
				<td><form:input path="birthday" type="date" /></td>
			</tr>
			<tr>
				<td><form:label path="address">address</form:label></td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td><form:label path="phone">phone</form:label></td>
				<td><form:input path="phone" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>