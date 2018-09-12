<%@page contentType="text/html; UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>ProGramGu</title>
    <link href="../../resources/css/home.css" type="text/css" rel="stylesheet">
    <link href="../../resources/css/programgu.css" type="text/css" rel="stylesheet">
    <link href="../../resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link rel="icon" type="image/x-icon" href="../../resources/favicon2.ico">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css"
          integrity="sha384-OHBBOqpYHNsIqQy8hL1U+8OXf9hH6QRxi0+EODezv82DfnZoV7qoHAZDwMwEJvSw" crossorigin="anonymous">
</head>
<body>
<div class="jumbotron text-center" id="fondo_home">

    <img src="../../resources/img/logo1.PNG" class="img-responsive center-block" id="logo" alt="Cinque Terre">

    <h1 class="animated fadeInLeft" id="mi_tituloo">PROGRAMGU</h1>
    <a class="Button" id="mi_btn" href="<%=request.getContextPath()%>/formulario">Ir formulario</a>
</div>

<div id="portfolio">
    <h1 class="animated fadeInRight" id="mitituloinfo">Informacion en tus manos<br>con ProgramGu</h1>

    <div id="items">
        <div class="item" id="simon">
            <a href="https://goo.gl/Pgjh8e">
                <div class="infoItem">
                    <h1>Encuentra programas gubernamentales</h1>

                    <p>Existen programas gubernamentales que ofrece el gobierno<br>
                        para que las personas se beneficien de los servicios ofrecidos</p>
                    <i class="fa fa-link" aria-hidden="true"></i>
                </div>
            </a>
        </div>

        <div class="item" id="iwata">
            <a href="#">
                <div class="infoItem">
                    <h1>Formularios disponibles</h1>

                    <p>Encuentra formularios e ingresa tu información para participar en los<br>
                        cientos de programa gubernamental disponibles</p>
                    <i class="fa fa-link" aria-hidden="true"></i>
                </div>
            </a>
        </div>

        <div class="item" id="majoras">
            <a href="#">
                <div class="infoItem">
                    <h1>Clientes</h1>

                    <p>ProgramGu está enfocado a toda la población Bumanguesa</p>
                    <i class="fa fa-link" aria-hidden="true"></i>
                </div>
            </a>
        </div>

        <div class="item" id="msfa">
            <a href="https://goo.gl/3gznsE">
                <div class="infoItem">
                    <h1>Más Familias en Acción</h1>

                    <p>Programa de Prosperidad Social que ofrece a todas? aquellas familias con
                        niños, niñas y adolescentes menores de 18 años que requieren un apoyo económico para tener una
                        alimentación saludable, controles de crecimiento y desarrollo a tiempo y permanencia en el sistema
                        escolar.</p>
                    <i class="fa fa-link" aria-hidden="true"></i>
                </div>
            </a>
        </div>

        <div class="item" id="programa2">
            <a href="#">
                <div class="infoItem">
                    <h1>Ingreso para la Prosperidad Social</h1>

                    <p>Programa del Gobierno Nacional que otorga incentivos para que las familias de la Red
                        UNIDOS adquieran capacidades y competencias para la generación de ingresos.</p>
                    <i class="fa fa-link" aria-hidden="true"></i>
                </div>
            </a>
        </div>
        <div class="item" id="programa3">
            <a href="https://goo.gl/nKESF2">
                <div class="infoItem">
                    <h1>Jóvenes en Acción</h1>

                    <p> Programa de Prosperidad Social que apoya a los jóvenes en condición de pobreza y vulnerabilidad, con la
                        entrega de transferencias monetarias condicionadas –TMC-, para que puedan continuar sus estudios técnicos,
                        tecnológicos y profesionales?.</p>
                    <i class="fa fa-link" aria-hidden="true"></i>
                </div>
            </a>
        </div>
    </div>
</div>
<div>
    <footer class="Container-fluid">
        <p>ProgramGu! Todos los derechos reservados</p>
    </footer>
</div>
</body>
</html>