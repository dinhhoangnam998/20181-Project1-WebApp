<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>List of InputEvents</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Input Date</td>
		</tr>

		<c:forEach var="listItem" items="${listInputEvent}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.inputdate}</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>