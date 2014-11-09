/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelo.Procesos;
import modelo.Usuario;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Ruth
 */
public class Crear_Usuario extends SimpleFormController{
    private Procesos procesos;

    public void setProceso(Procesos proceso) {
        this.procesos = proceso;
    }
     public Crear_Usuario(){
        setCommandClass(Usuario.class);
        // SERVIRA PARA EL PATH QUE ESTA EN LA VISTA
        setCommandName("ingresar");
        setSuccessView("consulta_usuario");
        //NOMBRE DE LA VISTA
        setFormView("ingreso_usuario");
    }
    
    @Override
    protected ModelAndView onSubmit(
        Object command) throws Exception {
        /** creando un obejto de la clase usuario para poder que este
        puedA ACCEDER A LOS METODOS DE LA CLASE PROCESO**/
       Usuario datos = (Usuario) command;
        //se asignan los datos a la bd 
        procesos.crear_usuario(datos.getIdusuario(),datos.getNombreusuario(),datos.getContrasena(),datos.getTipo());
        //esto nos redirige a la paginas donde estan todos los datos ya ingresados
        return new ModelAndView(new RedirectView("consulta_Usuario.htm"));
        
    }
    
    
}
