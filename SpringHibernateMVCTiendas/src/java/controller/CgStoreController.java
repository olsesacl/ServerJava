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
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
            mv.addObject("mensaje","Este es un mensaje enviado desde el controlador");
            
            List<CgStore> lista = CgStoreDAO.listaTiendas();
            
            //carpeta base
            mv.addObject("cp",hsr.getContextPath());
            
            mv.addObject("lista",lista);
            
            return mv;
            
            
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    @RequestMapping(value="/borrar//{id}", method=RequestMethod.GET)
    public String borrar(@PathVariable("id") int id, ModelMap map, HttpServletRequest request){
        
        System.out.println("test");
        
        return "/borrar";
        
    }
    
}
