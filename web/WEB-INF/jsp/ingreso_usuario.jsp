<%@taglib  uri="http://www.springframework.org/tags" prefix="spring" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo usuario.</title>
    </head>
    <body bgcolor="#CEE3F6"><br><br><br><br><br><br><br>
    <font face ="jokerman" color="black"><center><h1>REGISTROS DE NUEVOS USUARIOS</h1></center></font>
    <spring:nestedPath path="ingresar">
        <form action=""  method="post">
            <center>         
                <table border="2">
                    <tr>
                        <th>ID</th>
                        <td><spring:bind path="idusuario">
                                <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                    <tr>
                        <th>NOMBRE</th>
                        <td>
                            <spring:bind path="nombreusuario">
                                <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                    <tr>
                        <th>CONTRASENA</th>
                        <td>
                            <spring:bind path="contrasena">
                                <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind><br>
                        </td>
                    </tr>
                     <tr>
                        <th>TIPO DE USUARIO</th>
                        <td>
                            <spring:bind path="tipo">
                                <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind><br>
                        </td>
                    </tr>
                    
                   <tr>       
                        <td colspan="2">
                    <center><input type="submit" value="Registrar" > </center>    
                    </td>
                    </tr>
                </table></center>
        </form>
        <center>
         <a  href="consulta_usuario.htm">Consultar</a>
            <a href="eliminar_usuario.htm">Eliminar</a>
            <a href="index.htm">Inicio</a>
            <a href="modificar_usuario.htm">Modificar</a>
            </center>
    </spring:nestedPath>
</body>
</html>
