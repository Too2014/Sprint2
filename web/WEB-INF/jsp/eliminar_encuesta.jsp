
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Encuesta</title>
    </head>
    <body bgcolor="#CEE3F6"><br><br><br><br><br><br><br>
    <font face ="jokerman" color="black"><center><h1>ELIMINAR ENCUESTA</h1></center></font>
    <spring:nestedPath path="eliminarE">

        <form action=""  method="post">

            <center>         
                <table border="2">
                    <tr>
                        <th>ID</th>
                        <td><spring:bind path="idencuesta">
                                <input type="tex" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                    <tr>       
                        <td colspan="2">
                    <center><input type="submit" value="Eliminar" > </center>    
                    </td>
                    </tr>
                </table></center>
        </form>
          <center>
          
            <a  href="consulta_encuesta.htm">Consultar</a>
            <a href="ingreso_encuesta.htm">Registrar</a>
            <a href="index.htm">Inicio</a>
            <a href="modificar_encuesta.htm">Modificar</a>
        </center>
    </spring:nestedPath>
</body>
</html>
