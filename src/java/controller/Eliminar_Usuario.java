package controller;




import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;
import modelo.Procesos;
import modelo.Usuario;


public class Eliminar_Usuario extends SimpleFormController {
    private Procesos procesos;
     public void setProcesos(Procesos procesos) {
        this.procesos = procesos;
    }
    public Eliminar_Usuario() {
        setCommandClass(Usuario.class);
        setCommandName("eliminar");
        setSuccessView("consulta_usuario");
        setFormView("eliminar_usuario");
    }

    @Override
    protected ModelAndView onSubmit(
            Object command) throws Exception {
        Usuario datos = (Usuario) command;
        //se asignan los datos a la bd 
        procesos.eliminar_usuario(datos.getIdusuario());
        //esto nos redirige a la paginas donde estan todos los datos ya ingresados
        return new ModelAndView(new RedirectView("consulta_usuario.htm"));
    }
    //conexion base de datos postgres
    
}
