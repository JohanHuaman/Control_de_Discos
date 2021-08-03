<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Disco</title>
    </head>
    <body>
        <h1>Ingrese los datos el nuevo disco</h1>
        <form action="/TiendaDiscos/ServletControlador?accion=agregarDisco" method="POST">
            <div class="formulario">
                <div>
                    <label for="nombre">Nombre</label>
                    <input type="text" name="nombre" required />
                </div>
                <div>
                    <label for="banda">Banda</label>
                    <input type="text" name="banda" required />
                </div>
                <div>
                    <label for="genero">Genero</label>
                    <input type="text" name="genero" required />
                </div>
                <div>
                    <label for="formato">Formato</label>
                    <input type="text" name="formato" required />
                </div>
                <div>
                    <label for="precio">Precio</label>
                    <input type="number" name="precio" required />
                </div>
            </div>
            <div class="boton-submit">
                <button type="submit">Guardar</button>
            </div>
            <a href="index.jsp">Volver la inicio</a>
        </form>
    </body>
</html>
