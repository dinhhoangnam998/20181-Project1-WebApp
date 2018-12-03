<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<c:if test="${param['error'] }">Incorrect Username or PassWord</c:if>
		<form:form action="dashboard" method="POST" modelAttribute="user">
			<table>
				<tr>
					<td>
						<form:label path="username">Username</form:label>
					</td>
					<td>
						<form:input path="username" name="username" id="username"/>
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="password">Password</form:label>
					</td>
					<td>
						<form:input path="password" name="password" id="password"/>
					</td>
				</tr>
				<tr>
					<td>
					<form:button name="login" id="login">Login</form:button>
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>