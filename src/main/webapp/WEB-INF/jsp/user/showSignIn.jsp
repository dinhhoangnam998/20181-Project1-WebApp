<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    	<title>Sign In</title>
    </head>
    <body>
        <h3>Welcome to Sign In</h3>
        <form:form method="POST"
          action="/Project1WebApplication/user/signIn">
             <table>
                <tr>
                    <td>username</td>
                    <td><input name="username" /></td>
                </tr>
                <tr>
                    <td>password</td>
                    <td><input name="password" type="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>