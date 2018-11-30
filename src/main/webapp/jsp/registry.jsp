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
	<c:if test="${param['error'] }">Username must be different Password</c:if>
		<form:form action="userRegistry" method="POST" modelAttribute="user">
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
<%-- 				<tr>
					<td>
						<form:label path="username">FullName</form:label>
					</td>
					<td>
						<form:input path="username" name="name" id="name"/>
					</td>
	 --%>			</tr>
				<%-- <tr>
					<td>
						<form:label path="age">Age</form:label>
					</td>
					<td>
						<form:input path="age" name="age" id="age"/>
					</td>
				</tr> --%>
				<tr>
					<td>
					<form:button name="register" id="register">Register</form:button>
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>