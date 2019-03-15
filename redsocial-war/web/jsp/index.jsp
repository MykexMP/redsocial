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
        <title>Login</title>
    </head>
    <body>
        <div class="formularioLogin">
            <form action="loginServlet">
                <label>Usuario:</label><br/>
                <input name="user" type="text"/><br/>
                <label>Contraseña:</label><br/>
                <input name="password" type="password"/><br/>
                <label>Contraseña:</label><br/>
                <input type="submit" value="Entrar">
            </form>
        </div>
            <form action="jsp/register.jsp">
                <label>¿No tienes cuenta? Haz click en registrarse.</label><br/>
                <input type="submit" value="Registrarse">
            </form>
    </body>
</html>
