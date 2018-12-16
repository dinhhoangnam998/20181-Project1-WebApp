<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Sale Events</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>id</td>
			<td>Begin Date</td>
			<td>End Date</td>
		</tr>

		<c:forEach var="listItem" items="${listSaleEvent}">
			<tr>
				<td>${listItem.id}</td>
				<td>${listItem.begindate}</td>
				<td>${listItem.enddate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>