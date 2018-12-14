<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    	<title>Add Author</title>
    </head>
    <body>
        <h3>Welcome to add author</h3>
        <form:form method="POST"
          action="/Project1WebApplication/admin/addAuthor" modelAttribute="author">
             <table>
                <tr>
                    <td><form:label path="name" >Name</form:label></td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td><form:label path="birthday">Birth day</form:label></td>
                    <td><form:input path="birthday" type="date"/></td>
                </tr>
                <tr>
                    <td><form:label path="deathday">Death Day</form:label></td>  
                    <td><form:input path="deathday" type="date"/></td>
                </tr>
                
                <tr>
                    <td><form:label path="description">Description</form:label></td>
                    <td><form:input path="description"/></td>
                </tr>
                <tr>
                    <td><form:label path="imageurl">Imageurl</form:label></td>
                    <td><form:input path="imageurl" name="imageurl"/></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>