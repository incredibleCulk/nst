<%-- 
    Document   : user_login
    Created on : 22.11.2016
    Author     : Milos Milic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>[FON] Dobrodošli</title>
        <jsp:include page="include.jsp" />
    </head>
    <jsp:useBean id="ulogovan_korisnik" scope="session" class="com.mm.domen.User" />
    
    <body>     
        <div class="container">
            <p class="navbar-text"> Trenutno ulogovani korisnik: </p>
            <div class="navbar-text">
        <jsp:getProperty name="ulogovan_korisnik" property="firstName" /> 
        <jsp:getProperty name="ulogovan_korisnik" property="lastName" />
            </div>
            </div>
        </body>
</html>
