<%-- 
    Document   : index
    Created on : 01/03/2017, 14:05:12
    Author     : igor
--%>

<%@page import="java.util.List"%>
<%@page import="br.ufms.model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Servlet?acao=listar" method="post">
            <input type="submit" value="Listar Dados">
        </form>
        
        <%
            if(session.getAttribute("lista")!=null){
            List<Aluno> lista = (List<Aluno>) session.getAttribute("lista");
            for(int i = 0; i<lista.size();i++){
        %>
    <tr>
        <td><%=lista.get(i).getCodigo()%></td>
        <td><%=lista.get(i).getNome()%></td> 
        <td><%=lista.get(i).getRga()%></td>
    </tr>
    <%}}%>
        
    </body>
</html>
