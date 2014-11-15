
package controller;

import modelo.Categoria;
import modelo.Encuesta;
import modelo.Procesos;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

public class Eliminar_Categoria  extends SimpleFormController{
    
     private Procesos procesos;

    public void setProcesos(Procesos procesos) {
        this.procesos = procesos;
    }
    public Eliminar_Categoria() {
        //Initialize controller properties here or 
        //in the Web Application Context
        setCommandClass(Categoria.class);
         setCommandName("eliminarC");
        setSuccessView("consulta_categoria");
        setFormView("eliminar_categoria");
    }

    @Override
    protected ModelAndView onSubmit(
            Object command) throws Exception {
        Categoria datos = (Categoria) command;
        //se asignan los datos a la bd 
        procesos.eliminar_encuesta(datos.getIdcategoria());
        //esto nos redirige a la paginas donde estan todos los datos ya ingresados
        return new ModelAndView(new RedirectView("consulta_categoria.htm"));
    }
}
