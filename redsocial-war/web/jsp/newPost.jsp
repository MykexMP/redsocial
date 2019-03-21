<%-- 
    Document   : newPost
    Created on : 21-mar-2019, 17:00:19
    Author     : Mykex
--%>

<%@page import="entity.Visibility"%>
<%@page import="java.util.List"%>
<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your new post, <%= ((User) request.getSession().getAttribute("user")).getAlias() %></title>
    </head>
    <body>
        <% List<Visibility> visibilities = (List<Visibility>) request.getAttribute("visibilities"); %>
        <form action="<%= request.getContextPath() %>/saveNewPostServlet">
            <label>Pon aquí tu nuevo post:</label><br/>
            <textarea name="post"></textarea><br/>
            <select name="visibility">
                <% for (Visibility v : visibilities) { %>
                    <option value="<%= v %>"><%= v.getTypeVis() %></option> <!-- puedo pasarlo asi el v? -->
                <% } %>
                
            </select>
            <input type="submit" value="Subir">
        </form>
    </body>
</html>
