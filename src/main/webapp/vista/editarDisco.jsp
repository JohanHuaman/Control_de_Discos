<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.css">
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;700&display=swap" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Disco</title>
    </head>
    <body>
        <header>
            <img src="${pageContext.request.contextPath}/img/x.png" alt="logo-empresa">
        </header>
        <h1>Editar datos del disco</h1>
        <div class="formulario">
            <form action="/TiendaDiscos/ServletControlador?accion=modificarDisco&id=${disco.id}" method="POST">
                <div class="form-columna">
                    <label for="nombre">Nombre</label>
                    <input type="text" name="nombre" required value="${disco.nombre}" />
                </div>
                <div class="form-columna">
                    <label for="banda">Banda</label>
                    <input type="text" name="banda" required value="${disco.banda}" />
                </div>
                <div class="form-columna">
                    <label for="genero">Genero</label>
                    <input type="text" name="genero" required value="${disco.genero}" />
                </div>
                <div class="form-columna">
                    <label for="formato">Formato</label>
                    <input type="text" name="formato" required value="${disco.formato}" />
                </div>
                <div class="form-columna">
                    <label for="precio">Precio</label>
                    <input type="number" name="precio" required value="${disco.precio}" />
                </div>
                <div class="boton-submit">
                    <button type="submit">Guardar</button>
                </div>
                <div class="link-inicio">
                <a href="index.jsp">Volver la inicio</a>
                </div>
            </form>
        </div>
    </body>
</html>
