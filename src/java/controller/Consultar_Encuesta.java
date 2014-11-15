
package controller;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.HibernateUtil;
import org.hibernate.Session;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Consultar_Encuesta implements Controller{

    @Override
     public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
       //nombre de la vista = consulta_usuario
        ModelAndView mv = new ModelAndView("consulta_encuesta");
        String out = "RegistroEncuestas";
        try { 
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            //nombre de la tabla de la base de datos
            List result = session.createQuery("from encuesta").list();
            //se utilizará para el 
            mv.addObject("encuestas", result);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        mv.addObject("message", out);
        return mv;
    }
    
}

    
