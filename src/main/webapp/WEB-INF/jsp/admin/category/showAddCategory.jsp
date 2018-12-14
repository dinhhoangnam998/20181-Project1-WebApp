<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    	<title>Add Category</title>
    </head>
    <body>
        <h3>Welcome to add category</h3>
        <form:form method="POST"
          action="/Project1WebApplication/admin/addCategory" modelAttribute="category">
             <table>
                <tr>
                    <td><form:label path="name" >Name</form:label></td>
                    <td><form:input path="name" /></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>