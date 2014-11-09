package modelo;
import java.util.HashSet;
import java.util.Set;
public class Usuario  implements java.io.Serializable {
     private String idusuario;
     private String nombreusuario;
     private String contrasena;
     private String tipo;
     private Set<Encuesta> encuestas = new HashSet<Encuesta>(0);

    public Usuario() {
    }

	
    public Usuario(String idusuario, String nombreusuario, String contrasena, String tipo) {
        this.idusuario = idusuario;
        this.nombreusuario = nombreusuario;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }
    public Usuario(String idusuario, String nombreusuario, String contrasena, String tipo, Set<Encuesta> encuestas) {
       this.idusuario = idusuario;
       this.nombreusuario = nombreusuario;
       this.contrasena = contrasena;
       this.tipo = tipo;
       this.encuestas = encuestas;
    }
   
    public String getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }
    public String getNombreusuario() {
        return this.nombreusuario;
    }
    
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Set<Encuesta> getEncuestas() {
        return this.encuestas;
    }
    
    public void setEncuestas(Set<Encuesta> encuestas) {
        this.encuestas = encuestas;
    }
}


