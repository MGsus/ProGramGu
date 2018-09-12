<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Resultado</title>
    <link href="../../resources/css/programgu.css" type="text/css" rel="stylesheet">
    <link href="../../resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css"
          integrity="sha384-OHBBOqpYHNsIqQy8hL1U+8OXf9hH6QRxi0+EODezv82DfnZoV7qoHAZDwMwEJvSw" crossorigin="anonymous">
    <link rel="icon" type="image/x-icon" href="../../resources/favicon2.ico">
</head>
<body>
<c:set var="repetido" value="" scope="session"/>
<c:if test="${fn:length(programaList)>0}">
    <c:forEach var="programa" items="${programaList}">
        <c:if test="${programa.nombre.compareTo(repetido)!=0}">
            <div class="Container-fluid-result text-center">
                <h1 class="animated fadeInLeft"><c:out value="${programa.nombre}"/></h1>
                <a class="Button" href="${programa.link}">Página Web</a>
            </div>
            <c:set var="repetido" value="${programa.nombre}"/>
        </c:if>
    </c:forEach>
</c:if>
<c:if test="${fn:length(programaList)==0}">
    <div class="Container Page404Cn">
        <div class="Page404">
            <figure><img src="../../resources/img/bad-res.png"></figure>
            <div class="Title">Lo sentimos</div>
            <div class="SubTitle">No hemos podido encontrarte un programa</div>
            <a class="Button" href="/">REGRESAR AL INICIO</a>
        </div>
    </div>
</c:if>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="../../resources/js/bootstrap.min.js"></script>
</body>
</html>
