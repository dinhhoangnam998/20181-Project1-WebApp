<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Sale Events</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Begin Date</td>
			<td>End Date</td>
			
		</tr>
		
		<c:forEach var="listItem" items="${saleEventList}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.begindate}</td>
				<td>${listItem.enddate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>