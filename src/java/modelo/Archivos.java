package modelo;
public class Archivos  implements java.io.Serializable {


     private int idarchivos;
     private Encuesta encuesta;
     private String nombrearchivo;
     private String archivo;

    public Archivos() {
    }

    public Archivos(int idarchivos, Encuesta encuesta, String nombrearchivo, String archivo) {
       this.idarchivos = idarchivos;
       this.encuesta = encuesta;
       this.nombrearchivo = nombrearchivo;
       this.archivo = archivo;
    }
   
    public int getIdarchivos() {
        return this.idarchivos;
    }
    
    public void setIdarchivos(int idarchivos) {
        this.idarchivos = idarchivos;
    }
    public Encuesta getEncuesta() {
        return this.encuesta;
    }
    
    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }
    public String getNombrearchivo() {
        return this.nombrearchivo;
    }
    
    public void setNombrearchivo(String nombrearchivo) {
        this.nombrearchivo = nombrearchivo;
    }
    public String getArchivo() {
        return this.archivo;
    }
    
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }




}


