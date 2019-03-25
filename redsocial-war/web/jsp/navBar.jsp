<%-- 
    Document   : navBar
    Created on : 25-mar-2019, 10:46:36
    Author     : Mykex
--%>

<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <% User u = (User) request.getSession().getAttribute("user"); %>
        <table>
            <td><label>¡ Bienvenido, <%= u.getAlias() %>!</label></td>
            <td><form action="logOutServlet"><input type="submit" value="Sign Out"/></form></td>
        </table>
    </body>
</html>
