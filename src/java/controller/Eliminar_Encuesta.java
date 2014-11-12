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

public class Eliminar_Encuesta extends SimpleFormController {
    private Procesos procesos;

    public void setProcesos(Procesos procesos) {
        this.procesos = procesos;
    }
    public Eliminar_Encuesta() {
        //Initialize controller properties here or 
        //in the Web Application Context
        setCommandClass(Encuesta.class);
         setCommandName("eliminarE");
        setSuccessView("consulta_encuesta");
        setFormView("eliminar_encuesta");
    }

    @Override
    protected ModelAndView onSubmit(
            Object command) throws Exception {
        Encuesta datos = (Encuesta) command;
        //se asignan los datos a la bd 
        procesos.eliminar_encuesta(datos.getIdencuesta());
        //esto nos redirige a la paginas donde estan todos los datos ya ingresados
        return new ModelAndView(new RedirectView("consulta_encuesta.htm"));
    }
    //conexion base de datos postgres
    
    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    /*
     @Override
     protected ModelAndView onSubmit(
     HttpServletRequest request, 
     HttpServletResponse response, 
     Object command, 
     BindException errors) throws Exception {
     ModelAndView mv = new ModelAndView(getSuccessView());
     //Do something...
     return mv;
     }
     */
}
