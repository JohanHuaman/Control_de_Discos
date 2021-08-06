<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.css">
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;700&display=swap" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tienda de Discos - X</title>
    </head>
    <body>
        <header>
            <img src="${pageContext.request.contextPath}/img/x.png" alt="logo-empresa">
        </header>
        <main class="inicio">
            <h1>Bienvenido al control de tus productos</h1>
            <h2>Elija la opción que desea realizar</h2>
        </main>
        <div class="links">
            <button class="agregar">
                <a href="${pageContext.request.contextPath}/vista/agregarDisco.jsp">Agregar disco</a>
            </button>
            <button class="listar">
                <a href="/TiendaDiscos/ServletControlador?accion=listarDiscos">Ver todos los discos</a>
            </button>
        </div>
    </body>
</html>
