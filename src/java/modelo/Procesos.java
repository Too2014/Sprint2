package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Procesos {
    public void crear_usuario(String id,String nombre,String contrasena, String tipo){
        String url = "jdbc:postgresql://localhost:5432/Postgres";
        String driver ="org.postgresql.Driver";
        String user = "postgres";
        String passwor ="too2014";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwor);
            Statement consulta = con.createStatement();
            //consulta sql
            consulta.executeUpdate("insert into usuario (idusuario,nombreusuario,contrasena,tipo) values('" + id + "','" + nombre + "','" + contrasena + "'");
            consulta.executeUpdate("update usuario SET  idusuario='" + id + "',nombreusuario='" + nombre + "',contrasena='" + contrasena + "',tipo='" + tipo + "'WHERE idusuario=" + id + "");
            
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
            System.out.println("Datos guardados correctamente");
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
    
}
