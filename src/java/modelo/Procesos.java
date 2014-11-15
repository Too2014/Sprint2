package modelo;

import java.awt.image.ImageObserver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;

public class Procesos {
    public void crear_usuario(String id,String nombre,String contrasena, String tipo){
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String driver ="org.postgresql.Driver";
        String user = "postgres";
        String passwor ="too2014";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwor);
            Statement consulta = con.createStatement();
            //consulta sql
            consulta.executeUpdate("insert into usuario(idusuario, nombreusuario, contrasena, tipo) values('" + id + "','" + nombre + "','" + contrasena + "','"+tipo+"'");
            consulta.executeUpdate("update usuario SET  idusuario='" + id + "',nombreusuario='" + nombre + "',contrasena='" + contrasena + "',tipo='" + tipo + "'WHERE idusuario=" + id + "");
            JOptionPane.showMessageDialog(null,"se insertó con éxito ");
            consulta.close();
            con.close();
        } catch (Exception e) {
            
        }
    }
    
    public void eliminar_usuario(String id) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String passwor = "too2014";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwor);
            Statement consulta = con.createStatement();
            consulta.executeUpdate("delete from usuario where idusuario =" + id + "");
            System.out.println("Usuario eliminado correctamente");
            consulta.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error en la conexion");
        }
    }
    public void modificar_usuario(String id, String nombre, String contrasena,String tipo) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String passwor = "too2014";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwor);
            Statement consulta = con.createStatement();
            //consulta sql
            consulta.executeUpdate("update usuario SET  nombreusuario='" + nombre + "',contrasena='" + contrasena + "',tipo='" + tipo + "' where id=" + id + "");
            //consulta.execute("END");
            System.out.println("Datos guardados correctamente");
            consulta.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error en la conexion");
        }
    }
    
    
    // Procesos del CRUD para Encuestas 
    
     public void crear_encuesta(Integer id,String nombre,String descripcion){
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String driver ="org.postgresql.Driver";
        String user = "postgres";
        String passwor ="too2014";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwor);
            Statement consulta = con.createStatement();
            //consulta sql
            consulta.executeUpdate("insert into encuesta (idencuesta,nombreencuesta,descripcion) values('" + id + "','" + nombre + "','" + descripcion+ "'");
            consulta.executeUpdate("update encuesta SET  idencuesta='" + id + "',nombreencuesta='" + nombre + "',descripcion='"+ descripcion + "'WHERE idencuesta=" + id + "");
            JOptionPane.showMessageDialog(null,"se insertó con éxito "); 
            consulta.close();
            con.close();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"no se puedo Insertar ");  
        }
    }
    
    public void eliminar_encuesta(Integer id) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String passwor = "too2014";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwor);
            Statement consulta = con.createStatement();
            consulta.executeUpdate("delete from encuesta where idencuesta =" + id + "");
            System.out.println("Datos Eliminados correctamente");
            consulta.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error en la conexion");
        }
    }
    public void modificar_encuesta(Integer id, String nombre, String descripcion) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String passwor = "too2014";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwor);
            Statement consulta = con.createStatement();
            //consulta sql
            consulta.executeUpdate("update encuesta SET  nombreencuesta='" + nombre + "',descripcion='" + descripcion +  "' where idencuesta=" + id + "");
            //consulta.execute("END");
            System.out.println("Encuesta Actualizada correctamente");
            consulta.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error en la conexion");
        }
    }
//CRUD PARA CATEGORIA
public void eliminar_categoria(Integer id) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String passwor = "too2014";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwor);
            Statement consulta = con.createStatement();
            consulta.executeUpdate("delete from categoria where idcategoria =" + id + "");
            System.out.println("Datos Eliminados correctamente");
            consulta.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error en la conexion");
        }
    }
    public void modificar_categoria(Integer id, String nombre, String descripcion) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String driver = "org.postgresql.Driver";
        String user = "postgres";
        String passwor = "too2014";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwor);
            Statement consulta = con.createStatement();
            //consulta sql
            consulta.executeUpdate("update categoria SET  nombrecategoria='" + nombre + "',descripcion='" + descripcion +  "' where idcategoria=" + id + "");
            //consulta.execute("END");
            System.out.println("Categoria Actualizada correctamente");
            consulta.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error en la conexion");
        }
    }
    public void crear_categoria(Integer id,String nombre,String descripcionC){
     String url = "jdbc:postgresql://localhost:5432/postgres";
        String driver ="org.postgresql.Driver";
        String user = "postgres";
        String passwor ="too2014";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwor);
            Statement consulta = con.createStatement();
            //consulta sql
            consulta.executeUpdate("insert into categoria (idcategoria,nombrecategoria,descripcioncategoria) values('" + id + "','" + nombre + "','" + descripcionC+ "'");
            consulta.executeUpdate("update encuesta SET  idencuesta='" + id + "',nombreencuesta='" + nombre + "',descripcion='"+ descripcionC + "'WHERE idencuesta=" + id + "");
            JOptionPane.showMessageDialog(null,"se insertó con éxito "); 
            consulta.close();
            con.close();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"no se puedo Insertar ");  
        }
    } 
}
