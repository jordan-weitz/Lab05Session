<%-- 
    Document   : login
    Created on : 9-Jun-2021, 1:23:49 PM
    Author     : jweit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post" action="home">

            <label>Username: </label><input type="text" name="username">
            <br>
            <label>Password: </label><input type="password" name="password">
            <br>
            <br>
            <input type="submit" value="Login">
            <p>${loginMessage}</p>

        </form>
    </body>
</html>
