<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_PE"/>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.css">
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;700&display=swap" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Discos</title>
    </head>
    <body>
        <header>
            <img src="${pageContext.request.contextPath}/img/x.png" alt="logo-empresa">
        </header>
        <h1>Total de discos en el inventario</h1>
        <div class="tabla">
            <table>
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Nombre</th>
                        <th>Banda</th>
                        <th>genero</th>
                        <th>Formato</th>
                        <th>Precio</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <c:forEach var="disco" items="${discos}" varStatus="status">
                    <tr>
                        <td>${status.count}</td>
                        <td>${disco.nombre}</td>
                        <td>${disco.banda}</td>
                        <td>${disco.genero}</td>
                        <td>${disco.formato}</td>
                        <td><fmt:formatNumber value="${disco.precio}" type="currency" /></td>
                        <td>
                            <a href="${pageContext.request.contextPath}/ServletControlador?accion=editarDisco&id=${disco.id}">
                                Editar
                            </a>
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/ServletControlador?accion=eliminarDisco&id=${disco.id}">
                                Eliminar
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div class="link-inicio">
            <a href="index.jsp">Volver la inicio</a>
        </div>
    </body>
</html>
