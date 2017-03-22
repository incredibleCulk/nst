<%-- 
    Document   : unos_pravnog_lica
    Created on : 22.11.2016
    Author     : Milos Milic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>[FON] Unos pravnog lica</title>
        <jsp:include page="include.jsp" />
    </head>
    <body>
        <%@include file="menu_left.jsp" %>
        <%@include file="user_login.jsp" %>
        <div class ="container">
        <h1>Unos pravnog lica</h1>
        <form action="../action/sacuvaj_pravno_lice" method="POST">
            <table border="0" width="700">
                <tbody>
                    <tr>
                        <td>Naziv</td>
                        <td><input class="form-control" type="text" name="naziv" value="" size="40"/></td>
                    </tr>
                    <tr>
                        <td>PIB</td>
                        <td><input class="form-control" type="text" name="pib" value="" size="40"/></td>
                    </tr>
                    <tr>
                        <td>Adresa</td>
                        <td><input class="form-control" type="text" name="adresa" value="" size="40"/></td>
                    </tr>
                    <tr>
                        <td>Mesto</td>
                        <td>
                            <select class="form-control" name="mestoPtt">
                                <c:forEach var="mesto" items="${kolekcijaMesta}">
                                    <option value="${mesto.ptt}">${mesto.naziv}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    
                </tbody>
            </table>
            <input class = "btn btn-primary" type="submit" value="Sačuvaj" />

        </form>
        </div>
    </body>
</html>
