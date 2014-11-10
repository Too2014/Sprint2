package modelo;
import java.util.HashSet;
import java.util.Set;
public class Encuesta  implements java.io.Serializable {


     private int idencuesta;
     private Usuario usuario;
     private String nombreencuesta;
     private String descripcion;
     private Set<Categoria> categorias = new HashSet<Categoria>(0);
     private Set<Archivos> archivoses = new HashSet<Archivos>(0);

    public Encuesta() {
    }

	
    public Encuesta(int idencuesta, Usuario usuario, String nombreencuesta) {
        this.idencuesta = idencuesta;
        this.usuario = usuario;
        this.nombreencuesta = nombreencuesta;
    }
    public Encuesta(int idencuesta, Usuario usuario, String nombreencuesta, String descripcion, Set<Categoria> categorias, Set<Archivos> archivoses) {
       this.idencuesta = idencuesta;
       this.usuario = usuario;
       this.nombreencuesta = nombreencuesta;
       this.descripcion = descripcion;
       this.categorias = categorias;
       this.archivoses = archivoses;
    }
   
    public int getIdencuesta() {
        return this.idencuesta;
    }
    
    public void setIdencuesta(int idencuesta) {
        this.idencuesta = idencuesta;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getNombreencuesta() {
        return this.nombreencuesta;
    }
    
    public void setNombreencuesta(String nombreencuesta) {
        this.nombreencuesta = nombreencuesta;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Categoria> getCategorias() {
        return this.categorias;
    }
    
    public void setCategorias(Set<Categoria> categorias) {
        this.categorias = categorias;
    }
    public Set<Archivos> getArchivoses() {
        return this.archivoses;
    }
    
    public void setArchivoses(Set<Archivos> archivoses) {
        this.archivoses = archivoses;
    }
}


