<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Disco</title>
    </head>
    <body>
        <h1>Editar datos del disco</h1>
        <form action="/TiendaDiscos/ServletControlador?accion=modificarDisco&id=${disco.id}" method="POST">
            <div class="formulario">
                <div>
                    <label for="nombre">Nombre</label>
                    <input type="text" name="nombre" required value="${disco.nombre}" />
                </div>
                <div>
                    <label for="banda">Banda</label>
                    <input type="text" name="banda" required value="${disco.banda}" />
                </div>
                <div>
                    <label for="genero">Genero</label>
                    <input type="text" name="genero" required value="${disco.genero}" />
                </div>
                <div>
                    <label for="formato">Formato</label>
                    <input type="text" name="formato" required value="${disco.formato}" />
                </div>
                <div>
                    <label for="precio">Precio</label>
                    <input type="number" name="precio" required value="${disco.precio}" />
                </div>
            </div>
            <div class="boton-submit">
                <button type="submit">Guardar</button>
            </div>
            <a href="index.jsp">Volver la inicio</a>
        </form>
    </body>
</html>