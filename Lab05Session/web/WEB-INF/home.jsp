<%-- 
    Document   : home
    Created on : 9-Jun-2021, 1:32:46 PM
    Author     : jweit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <p> Hello ${user.userName}.</p>
        <br>
        <br>
        <a href="login?logout">Log Out</a>
    </body>
</html>
