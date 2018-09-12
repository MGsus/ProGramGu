<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Formulario</title>
    <link href="../../resources/css/programgu.css" type="text/css" rel="stylesheet">
    <link href="../../resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link rel="icon" type="image/x-icon" href="../../resources/favicon2.ico">
    <link href="../../resources/css/home.css" type="text/css" rel="stylesheet">

</head>
<body>
<div class="jumbotron text-center" id="mi_fondito">
    <h1 class="titulo1">¡Bienvenido!</h1>

    <p class="mi_aviso">El Resultado del siguiente formulario no representa la admisión o registro al programa. Su propósito es
        informar.</p>
</div>
<form id="multiphase" method="post" action="<%=request.getContextPath()%>/respuesta" class="mi_fm">
    <c:set var="fsLoop" scope="session" value="1"/>
    <c:set var="size" scope="session" value="${fn:length(listaPreguntas)}"/>
    <c:set var="idres" scope="session" value="${respuestasCliente.idrespuestas}"/>
    <fieldset>
        <h1 class="phase-title">Inicio del Formulario</h1>
        <c:forEach var="pregunta" items="${listaPreguntas}" varStatus="status">
        <c:choose>
        <c:when test="${((pregunta.idpregunta % 3) == 0) && (pregunta.idpregunta != size)}">
        <c:if test="${fsLoop == 1}">
            <label for="${pregunta.idpregunta}">${pregunta.contenido}</label>
            <input hidden name="idrespuesta" value="${idres + 1}"/>
            <c:set var="idres" scope="session" value="${idres + 1}"/>
            <input type="${pregunta.descripcion}" id="${pregunta.idpregunta}"
                   name="contenido" value="" onkeyup="this.value = this.value.toLowerCase();"/>
            <input type="button" name="next" class="next action-button" value="Siguiente"/>
        </c:if>
        <c:if test="${fsLoop!=1}">
            <label for="${pregunta.idpregunta}">${pregunta.contenido}</label>
            <input hidden name="idrespuesta" value="${idres + 1}"/>
            <c:set var="idres" scope="session" value="${idres + 1}"/>
            <input type="${pregunta.descripcion}" id="${pregunta.idpregunta}"
                   name="contenido" value="" onkeyup="this.value = this.value.toLowerCase();"/>
            <input type="button" name="previous" class="previous action-button prev-button" value="Anterior"/>
            <input type="button" name="next" class="next action-button" value="Siguiente"/>
        </c:if>
        <c:set var="fsLoop" value="0"/>
    </fieldset>
    <fieldset>
        </c:when>
        <c:when test="${pregunta.idpregunta == size}">
        <label for="${pregunta.idpregunta}">${pregunta.contenido}</label>
        <input hidden name="idrespuesta" value="${idres + 1}"/>
        <c:set var="idres" scope="session" value="${idres + 1}"/>
        <input type="${pregunta.descripcion}" id="${pregunta.idpregunta}"
               name="contenido" value="" onkeyup="this.value = this.value.toLowerCase();"/>
        <input type="button" name="previous" class="previous action-button prev-button" value="Anterior"/>
        <input type="submit" name="submit" class="submit action-button" value="Enviar"/>
    </fieldset>
    </c:when>
    <c:otherwise>
        <label for="${pregunta.idpregunta}">${pregunta.contenido}</label>
        <input hidden name="idrespuesta" value="${idres + 1}"/>
        <c:set var="idres" scope="session" value="${idres + 1}"/>
        <input type="${pregunta.descripcion}" id="${pregunta.idpregunta}" name="contenido" value=""
               onkeyup="this.value = this.value.toLowerCase();"/>
    </c:otherwise>
    </c:choose>
    </c:forEach>
</form>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="../../resources/js/bootstrap.min.js"></script>
<script src="../../resources/js/cambioFase.js"></script>
</body>
</html>