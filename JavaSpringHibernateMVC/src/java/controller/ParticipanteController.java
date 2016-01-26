/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.ParticipanteDAO;
import model.entidad.Participantes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author 2daw
 */
public class ParticipanteController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        
        //cridem a la vista participantes.jsp
        ModelAndView mv = new ModelAndView("participantes");
        
        try{
            List<Participantes> listaParticipantes = null;
            listaParticipantes = ParticipanteDAO.llistaParticipants();
            
            //afegim un parametro per a enviar a la vista
            mv.addObject("listaParticipantes",listaParticipantes);
            
            
        }catch (Exception e){
            
        }
        
        return mv;
    }
    
   
    
}
