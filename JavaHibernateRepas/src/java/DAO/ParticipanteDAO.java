/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Participante;
import Utils.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author isaa
 */
public class ParticipanteDAO {
    
    
    public static void guardar(Participante participante){
     //   Participante participante=new Participante(13456,"isa","hibernate manual","gata","club");
        Session session=HibernateUtil.getSessionFactory().openSession();
        
        try {
         session.beginTransaction();
        session.saveOrUpdate(participante);
        session.getTransaction().commit();
        } catch (Exception e) {
          
               session.getTransaction().rollback();
           
            
        }finally{
            session.close();
        }
       
    }
    
    
    
    
     public static void borrar(Participante participante){
     //   Participante participante=new Participante(13456,"isa","hibernate manual","gata","club");
        Session session=HibernateUtil.getSessionFactory().openSession();
        
        try {
         session.beginTransaction();
        session.delete(participante);
        session.getTransaction().commit();
        } catch (Exception e) {
          
               session.getTransaction().rollback();
           
            
        }finally{
            session.close();
        }
       
    }
    
    
    
    
    public static ArrayList<Participante> getAllParticipantes(){
         Session session=HibernateUtil.getSessionFactory().openSession();
         String hql="SELECT p FROM Participante p ORDER BY apellidos"; //el select es sobre la clase, los nombres son los mismos que hay en la clase y no la BD
         Query query=session.createQuery(hql);
         ArrayList<Participante> listaParticipantes=null;
         listaParticipantes=(ArrayList<Participante>) query.list();
         session.close();
        return listaParticipantes;
    }
    
    public static Participante getParticipanteByDorsal(int dorsal){
         Session session=HibernateUtil.getSessionFactory().openSession();
         Participante participante=null;
         String hql="SELECT p FROM Participante p WHERE dorsal=:dorsal";
         Query query=session.createQuery(hql);
         query.setParameter("dorsal", dorsal);
         participante=(Participante) query.uniqueResult();
         session.close();
         
        return participante;
    }
}
