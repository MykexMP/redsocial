<%-- 
    Document   : register
    Created on : 15-mar-2019, 1:32:26
    Author     : Mykex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <div class="registerServlet">
            <form action="<%= request.getContextPath() %>/registerServlet">
                <label>Email:</label><br/>
                <input name="email" type="text"/><br/>
                <label>Usuario:</label><br/>
                <input name="user" type="text"/><br/>
                <label>Contraseña:</label><br/>
                <input name="password" type="password"/><br/>
                <label>Repita su Contraseña:</label><br/>
                <input name="secondPassword" type="password"/><br/>
                <input type="submit" value="Registrarse">
            </form>
        </div>
            <% if (request.getAttribute("error")!=null ) { %>
                <label><%= request.getAttribute("error") %></label>
            <% } %>
    </body>
</html>
