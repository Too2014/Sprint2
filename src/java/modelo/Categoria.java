package modelo;
import java.util.HashSet;
import java.util.Set;
public class Categoria  implements java.io.Serializable {


     private int idcategoria;
     private Encuesta encuesta;
     private String nombrecategoria;
     private String descripcioncategoria;
     private Set<Pregunta> preguntas = new HashSet<Pregunta>(0);

    public Categoria() {
    }

	
    public Categoria(int idcategoria, Encuesta encuesta, String nombrecategoria, String descripcioncategoria) {
        this.idcategoria = idcategoria;
        this.encuesta = encuesta;
        this.nombrecategoria = nombrecategoria;
        this.descripcioncategoria = descripcioncategoria;
    }
    public Categoria(int idcategoria, Encuesta encuesta, String nombrecategoria, String descripcioncategoria, Set<Pregunta> preguntas) {
       this.idcategoria = idcategoria;
       this.encuesta = encuesta;
       this.nombrecategoria = nombrecategoria;
       this.descripcioncategoria = descripcioncategoria;
       this.preguntas = preguntas;
    }
   
    public int getIdcategoria() {
        return this.idcategoria;
    }
    
    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }
    public Encuesta getEncuesta() {
        return this.encuesta;
    }
    
    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }
    public String getNombrecategoria() {
        return this.nombrecategoria;
    }
    
    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }
    public String getDescripcioncategoria() {
        return this.descripcioncategoria;
    }
    
    public void setDescripcioncategoria(String descripcioncategoria) {
        this.descripcioncategoria = descripcioncategoria;
    }
    public Set<Pregunta> getPreguntas() {
        return this.preguntas;
    }
    
    public void setPreguntas(Set<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }




}


