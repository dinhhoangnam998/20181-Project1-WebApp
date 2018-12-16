<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    	<title>Add SaleEvent</title>
    </head>
    <body>
        <h3>Welcome to add saleEvent</h3>
        <form:form method="POST"
          action="/Project1WebApplication/admin/saleEvent/add" modelAttribute="saleEvent">
             <table>
                <tr>
                    <td><form:label path="begindate">Begin Date</form:label></td>  
                    <td><form:input path="begindate" type="date"/></td>
                </tr>
                <tr>
                    <td><form:label path="enddate">End Date</form:label></td>  
                    <td><form:input path="enddate" type="date"/></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>