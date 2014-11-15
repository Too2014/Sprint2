<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${message}</title>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver_Encuestas</title>
    </head>
    <body>
    <body bgcolor="#CEE3F6"><br><br><br><br><br><br><br>
    <font face ="jokerman" color="black"><center><h1>LISTADO DE CATEGORIAS EXISTENTES</h1></center></font>
    <h3>${menssage}</h3>
    <br/>
    <center>
        <h3>${holaMensaje}</h3>
        <table border="2">
            <tr>
                <th> Id </th>
                <th> Nombre </th>
                <th> Descripcion </th>
             
                
            </tr>
            <c:forEach items="${categorias}" var="consulta_categoria">
                <tr>
                    <td><c:out value="${consulta_categoria.idcategoria}"></c:out></td>
                    <td><c:out value="${consulta_categoria.nombrecategoria}"></c:out></td>
                    <td><c:out value="${consulta_categoria.descripcion}"></c:out></td>
                    
                    </tr>
            </c:forEach>
        </table>
        <a href="ingreso_categoria.htm">Crear una categoria</a>
        <a href="ingreso_encuesta.htm">Regresar a Ingreso de Encuesta</a>
         <a href="eliminar_categoria.htm">Eliminar</a>
            <a href="modificar_categoria.htm">Modificar</a>
    </center> 
</body>
</html>
