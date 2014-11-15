<%@taglib  uri="http://www.springframework.org/tags" prefix="spring" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva Categoria.</title>
    </head>
    <body bgcolor="#CEE3F6"><br><br><br><br><br><br><br>
    <font face ="jokerman" color="black"><center><h1> Ingresar Nueva Categoria</h1></center></font>
    <spring:nestedPath path="ingresarE">
        <form action=""  method="post">
            <center>         
                <table border="2">
                    <tr>
                        <th>ID</th>
                        <td><spring:bind path="idcategoria">
                                <input type="number" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                    <tr>
                        <th>NOMBRE</th>
                        <td>
                            <spring:bind path="nombrecategoria">
                                <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                    <tr>
                        <th>Descripción</th>
                        <td>
                            <spring:bind path="descripcioncategoria">
                                <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind><br>
                        </td>
                    </tr>
                                     
                   <tr>       
                        <td colspan="2">
                    <center><input type="submit" value="Crear Nueva" > </center>    
                    </td>
                    </tr>
                </table></center>
        </form>
        <center>
         <a  href="modificar_categoria.htm">  Modificar Categoria</a>
            
            </center>
    </spring:nestedPath>
</body>
</html>

