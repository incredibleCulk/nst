<%-- 
    Document   : unos_novog_mesta
    Created on : 22.11.2016
    Author     : Milos Milic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>[FON] Unos mesta</title>
        <jsp:include page="include.jsp" />
    </head>
    <body>
        <%@include file="menu_left.jsp" %>
        <%@include file="user_login.jsp" %>
        <div class="container">
        <h1>Unos mesta</h1>
        <form action="../action/sacuvaj_mesto" method="POST">
            <table border="0">                
                <tbody>
                    <tr>
                        <td>Ptt</td>
                        <td><input class="form-control" type="text" name="ptt" value="" size="40" /></td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                            Naziv
                        </td>
                        <td>
                            <br>
                            <input class="form-control" type="text" name="naziv" value="" size="80" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <br>
                            <input class = "btn btn-primary" type="submit" value="Sačuvaj mesto" />
                        </td>
                    </tr>
                </tbody>
            </table>

        </form>
        </div>
    </body>
</html>
