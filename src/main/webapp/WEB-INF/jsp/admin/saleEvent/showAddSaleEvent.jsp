<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    	<title>Add SaleEvent</title>
    </head>
    <body>
        <h3>Welcome to add saleEvent</h3>
        <form:form method="POST"
          action="/Project1WebApplication/admin/addSaleEvent" modelAttribute="saleEvent">
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