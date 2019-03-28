<%-- 
    Document   : main
    Created on : 15-mar-2019, 1:28:20
    Author     : Mykex
--%>

<%@page import="entity.Post"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main</title>
    </head>
    <body>
        <jsp:include page='navBar.jsp'/>
        
        <% List<Post> listaPost = (List<Post>) request.getAttribute("listaPost"); %>
        <div class="listaMensajes">
            <table>
                <tr>
                    <th>Propietario</th>
                    <th>Mensaje</th>
                </tr>
                <% for (Post p : listaPost) { %>
                <tr>
                    <td><%= p.getCreator().getAlias() %></td>
                    <td><%= p.getTextPost() %></td>
                </tr>
                <% } %>
            </table>
        </div>
            <form action="<%= request.getContextPath() %>/newPostServlet"><input type="submit" value="Nuevo Post"></form>
    </body>
</html>
