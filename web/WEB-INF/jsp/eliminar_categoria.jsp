
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar categoria </title>
    </head>
    <body bgcolor="#CEE3F6"><br><br><br><br><br><br><br>
    <font face ="jokerman" color="black"><center><h1>ELIMINAR CATEGORIA</h1></center></font>
    <spring:nestedPath path="eliminarC">

        <form action=""  method="post">

            <center>         
                <table border="2">
                    <tr>
                        <th>ID</th>
                        <td><spring:bind path="idcategoria">
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
          
            <a  href="consulta_categoria.htm">Consultar</a>
            <a href="ingreso_categoria.htm">Registrar</a>
            <a href="categoria.htm">Inicio</a>
            <a href="modificar_categoria.htm">Modificar</a>
        </center>
    </spring:nestedPath>
</body>
</html>
