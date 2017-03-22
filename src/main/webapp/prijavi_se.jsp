<%-- 
    Document   : prijavi_se
    Created on : 22.11.2016
    Author     : Milos Milic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>[FON] Prijava</title>
        <jsp:include page="WEB-INF/include.jsp" />
        
         <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Datepicker - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>
    </head>
    <body>

        <div class = "container">
            <h1>Prijavite se na sistem</h1>
            <form action="/action/prijavi_se" method="POST">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>Korisničko ime:</td>
                            <td><input class = "form-control" type="text" name="korisnickoIme" value="" size="80" /></td>
                        </tr>
                        <tr>
                            <td>
                                <br>
                                Korisnička šifra:
                            </td>
                            <td>
                                <br>
                                <input class = "form-control" type="password" name="korisnickaSifra" value="" size="40" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <br>
                                <input class = "btn btn-primary" type="submit" value="Prijavi se na sistem" />
                            </td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>

            </form>
            
            <p>Date: <input type="text" id="datepicker"/></p>
            <div>
                
                
                </body>
                </html>
