
package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;
import modelo.Procesos;
import modelo.Usuario;


public class Modificar_Usuario extends SimpleFormController {
    private Procesos procesos;
     public void setProcesos(Procesos procesos) {
        this.procesos = procesos;
    }
    public Modificar_Usuario() {
        setCommandClass(Usuario.class);
        setCommandName("modificar");
        setSuccessView("consulta_usuario");
        setFormView("modificar_usuario");
    }

    @Override
    protected ModelAndView onSubmit(
            Object command) throws Exception {
        Usuario datos = (Usuario) command;
        //se asignan los datos a la bd 
        procesos.modificar_usuario(datos.getIdusuario(), datos.getNombreusuario(), datos.getContrasena(),datos.getTipo());
        //esto nos redirige a la paginas donde estan todos los datos ya ingresados
        return new ModelAndView(new RedirectView("consulta_usuario.htm"));

    }
    //conexion base de datos postgres

    
}


