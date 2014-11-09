package modelo;
import java.util.HashSet;
import java.util.Set;
public class Pregunta  implements java.io.Serializable {


     private int idpregunta;
     private Categoria categoria;
     private String pregunta;
     private Set<Respuesta> respuestas = new HashSet<Respuesta>(0);

    public Pregunta() {
    }

	
    public Pregunta(int idpregunta, Categoria categoria, String pregunta) {
        this.idpregunta = idpregunta;
        this.categoria = categoria;
        this.pregunta = pregunta;
    }
    public Pregunta(int idpregunta, Categoria categoria, String pregunta, Set<Respuesta> respuestas) {
       this.idpregunta = idpregunta;
       this.categoria = categoria;
       this.pregunta = pregunta;
       this.respuestas = respuestas;
    }
   
    public int getIdpregunta() {
        return this.idpregunta;
    }
    
    public void setIdpregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getPregunta() {
        return this.pregunta;
    }
    
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    public Set<Respuesta> getRespuestas() {
        return this.respuestas;
    }
    
    public void setRespuestas(Set<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }




}


