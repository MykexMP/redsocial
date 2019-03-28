<%-- 
    Document   : index
    Created on : 15-mar-2019, 1:11:05
    Author     : Mykex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/styles.css">
        <title>Login</title>
    </head>
    <body>
        <div class="formularioLogin">
            <form action="<%= request.getContextPath() %>/loginServlet">
                <label>Usuario:</label><br/>
                <input name="user" type="text"/><br/>
                <label>Contraseña:</label><br/>
                <input name="password" type="password"/><br/>
                <input type="submit" value="Entrar">
            </form>
        </div>
        <br/><label>¿No tienes cuenta?</label><br/>
        <div class="formularioRegister">
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
            <div class="errorText">
                <% if (request.getAttribute("error")!=null ) { %>
                    <label><%= request.getAttribute("error") %></label>
                <% } %>
            </div>
    </body>
</html>
