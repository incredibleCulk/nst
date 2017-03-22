<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%-- 
    Document   : svi_kupci
    Created on : 22.11.2016
    Author     : Milos Milic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>[FON] Pregled kupaca</title>
        <jsp:include page="include.jsp" />
    </head>
    <body>
        <%@include file="menu_left.jsp" %>
        <%@include file="user_login.jsp" %>
        <div class ="container">
            <h1>Pregled kupaca</h1>  

            <table class = "table table-responsive" border="1" width="700">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Naziv</th>                    
                        <th>Adresa</th>
                        <th>Mesto</th>
                        <th>Akcija</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="k" items="${kupacList}">
                        <tr>
                            <td>${k.kupacId}</td>
                            <td>${k.naziv}</td>                        
                            <td>${k.adresa}</td>
                            <td>${k.mesto.naziv}</td>
                            <td><a href="../action/obrisi_kupca?kupacId=${k.kupacId}">Obriši</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
