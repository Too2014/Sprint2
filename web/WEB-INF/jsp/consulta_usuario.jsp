<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${mensaje}</title>
    </head>
    <body>
    <body bgcolor="#CEE3F6"><br><br><br><br><br><br><br>
    <font face ="jokerman" color="black"><center><h1>LISTADO DE USUARIOS DEL SISTEMA</h1></center></font>
    <h3>${mensaje}</h3>
    <br/>
    <center>
        <h3>${holaMensaje}</h3>
        <table border="2">
            <tr>
                <th> Id </th>
                <th> Nombre </th>
                <th> Contraseña </th>
                <th> Tipo </th>
                
            </tr>
            <c:forEach items="${usuarios}" var="consulta_usuario">
                <tr>
                    <td><c:out value="${consulta_usuarios.idusuario}"></c:out></td>
                    <td><c:out value="${consulta_usuarios.nombreusuario}"></c:out></td>
                    <td><c:out value="${consulta_usuarios.contrasena}"></c:out></td>
                    <td><c:out value="${consulta_usuarios.tipo}"></c:out></td>
                    </tr>
            </c:forEach>
        </table>
        <a href="ingreso_usuario.htm">Nuevo Registro</a>
        <a href="index.htm">Inicio</a>
         <a href="eliminar_usuario.htm">Eliminar</a>
            <a href="modificar_usuario.htm">Modificar</a>
    </center> 
</body>
</html>
