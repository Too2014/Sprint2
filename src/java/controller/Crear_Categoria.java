
package controller;

import modelo.Categoria;
import modelo.Encuesta;
import modelo.Procesos;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

public class Crear_Categoria extends SimpleFormController {
    private Procesos procesos;

    public void setProcesos(Procesos procesos) {
        this.procesos = procesos;
    }
    public Crear_Categoria() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Categoria.class);
        setCommandName("ingresarC");
        setSuccessView("consulta_categoria");
        setFormView("ingreso_categoria");
    }

    
        @Override
    protected ModelAndView onSubmit(
        Object command) throws Exception {
        /** creando un obejto de la clase usuario para poder que este
        puedA ACCEDER A LOS METODOS DE LA CLASE PROCESO**/
       Categoria datos = (Categoria) command;
        //se asignan los datos a la bd 
        procesos.crear_categoria(datos.getIdcategoria(),datos.getNombrecategoria(),datos.getDescripcioncategoria());
        //esto nos redirige a la paginas donde estan todos los datos ya ingresados
        return new ModelAndView(new RedirectView("categoria.htm"));
        
    }
}
