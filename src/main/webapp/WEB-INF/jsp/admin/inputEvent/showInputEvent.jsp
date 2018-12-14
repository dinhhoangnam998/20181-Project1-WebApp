<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of InputEvents</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Input Date</td>
		</tr>
		
		<c:forEach var="listItem" items="${inputEventList}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.inputdate}</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>