<%-- 
    Document   : main
    Created on : 15-mar-2019, 1:28:20
    Author     : Mykex
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main</title>
    </head>
    <body>
        <%// List<Mensaje> listaMensajes = request.getAttribute("listaMensajes"); %>
        <div class="listaMensajes">
            <table>
                <tr>
                    <th>Propietario</th>
                    <th>Mensaje</th>
                </tr>
                <% //for (Mensaje m : listaMensajes) { %>
                    <td><% // m.getPropietario(); %></td>
                    <td><% // m.getText(); %></td>
                <% //} %>
            </table>
        </div>
    </body>
</html>
