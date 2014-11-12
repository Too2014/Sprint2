/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelo.Encuesta;
import modelo.Procesos;
import modelo.Usuario;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Ruth
 */
public class Crear_Encuesta extends SimpleFormController {
    
     private Procesos procesos;

    public void setProceso(Procesos proceso) {
        this.procesos = proceso;
    }
     public Crear_Encuesta(){
        setCommandClass(Encuesta.class);
        // SERVIRA PARA EL PATH QUE ESTA EN LA VISTA
        setCommandName("ingresarE");
        setSuccessView("consulta_encuesta");
        //NOMBRE DE LA VISTA
        setFormView("ingreso_encuesta");
    }
    
    @Override
    protected ModelAndView onSubmit(
        Object command) throws Exception {
        /** creando un obejto de la clase usuario para poder que este
        puedA ACCEDER A LOS METODOS DE LA CLASE PROCESO**/
       Encuesta datos = (Encuesta) command;
        //se asignan los datos a la bd 
        procesos.crear_encuesta(datos.getIdencuesta(),datos.getNombreencuesta(),datos.getDescripcion());
        //esto nos redirige a la paginas donde estan todos los datos ya ingresados
        return new ModelAndView(new RedirectView("consulta_encuesta.htm"));
        
    }
}
