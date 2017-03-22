<%-- 
    Document   : sva_mesta
    Created on : 22.11.2016
    Author     : Milos Milic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>[FON] Pregled mesta</title>
        <jsp:include page="include.jsp" />
    </head>

    <body>
        <%@include file="menu_left.jsp" %>
        <%@include file="user_login.jsp" %>
        <div class="container">
        <h1>Pregled mesta</h1>        
        <table class = "table table-striped" border="1" width="600">
            <thead>
                <tr>
                    <th>Ptt broj</th>
                    <th>Naziv</th>
                    <th>Akcija</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="mesto" items="${kolekcijaMesta}">
                    <tr>
                        <td>${mesto.ptt}</td>
                        <td>${mesto.naziv}</td>
                        <td>
                            <a href="<c:url value="../action/obrisi_mesto" >
                                   <c:param name="ptt" value="${mesto.ptt}"></c:param>
                               </c:url>">Obriši</a>

                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        </div>
    </body>
</html>
