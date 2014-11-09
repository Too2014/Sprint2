package modelo;
public class Respuesta  implements java.io.Serializable {


     private int idrespuesta;
     private Pregunta pregunta;
     private String respuesta;

    public Respuesta() {
    }

    public Respuesta(int idrespuesta, Pregunta pregunta, String respuesta) {
       this.idrespuesta = idrespuesta;
       this.pregunta = pregunta;
       this.respuesta = respuesta;
    }
   
    public int getIdrespuesta() {
        return this.idrespuesta;
    }
    
    public void setIdrespuesta(int idrespuesta) {
        this.idrespuesta = idrespuesta;
    }
    public Pregunta getPregunta() {
        return this.pregunta;
    }
    
    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }
    public String getRespuesta() {
        return this.respuesta;
    }
    
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }




}


