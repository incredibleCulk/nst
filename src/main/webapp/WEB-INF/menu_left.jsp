<%-- 
    Document   : menu_left
    Created on : 22.11.2016
    Author     : Milos Milic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Meni</title>
        <jsp:include page="include.jsp" />
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="../action/sva_mesta">Pregled svih mesta</a></li>
            <li><a href="/action/sacuvaj_mesto">Sačuvaj mesto</a></li>
            <li><a href="/action/svi_kupci">Pregled kupaca</a></li>
            <li><a href="/action/sacuvaj_pravno_lice">Sačuvaj pravno lice</a></li>
          </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/action/izloguj_se">Izloguj se <span class="sr-only">(current)</span></a></li>
            </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
    </body>
</html>
