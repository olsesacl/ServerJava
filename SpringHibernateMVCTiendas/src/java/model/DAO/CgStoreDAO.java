/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.entidad.CgStore;
import model.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author 2daw
 */
public class CgStoreDAO {
    
    public static List <CgStore> listaTiendas(){
        
        List <CgStore> lista = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try{

            String hql = "SELECT t FROM CgStore t";
            
            lista = session.createQuery(hql).list();
            
            
        }catch(Exception e){
            e.printStackTrace();
        } finally{
            session.close();
        }
        
        return lista;
    }
    
    public static int eliminar(CgStore tienda){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
       try{

           session.beginTransaction();
           session.delete(tienda);
           session.getTransaction().commit();
           return 1;
           
           
       }catch(Exception e){
           
           e.printStackTrace();
           session.getTransaction().rollback();
           return 0;
           
       } finally{
           session.close();
       }
           
    }
    
    
    public static void altaModifica(CgStore tienda){
        
         Session session = HibernateUtil.getSessionFactory().openSession();
        
       try{

           session.beginTransaction();
           session.saveOrUpdate(tienda);
           session.getTransaction().commit();           
           
       }catch(Exception e){
           
           e.printStackTrace();
           session.getTransaction().rollback();
           
       } finally{
           session.close();
       }
    }
    
}
