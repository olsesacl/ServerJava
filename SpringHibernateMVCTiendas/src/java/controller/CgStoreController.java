/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO.CgStoreDAO;
import model.entidad.CgStore;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author 2daw
 */
public class CgStoreController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        
        //aqui decimos la vista que cargara
        ModelAndView mv = new ModelAndView("tiendas");
        
        try{
            //Arrepleguem les dades del model i les enviem a la vista
            mv.addObject("Titulo","Listado de tiendas");
            
            List<CgStore> lista = CgStoreDAO.listaTiendas();
            
            mv.addObject(lista);
            
            return mv;
            
            
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
