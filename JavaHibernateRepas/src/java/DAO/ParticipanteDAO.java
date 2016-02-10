/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Participante;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 2daw
 */
public class ParticipanteDAO {
    
    public static void guardar(Participante participante){
        
        //Participante participante = new Participante(1254, "Sergio", "Sanchis", "Oliva", "mi club");
        
        Session session = UTILS.HibernateUtil.getSessionFactory().openSession();
        
        try{
            session.beginTransaction();
            
            session.save(participante);
            
            
        } catch(Exception e){
            
            session.getTransaction().rollback();
            
        } finally{
            
            session.close();
        }
        
    }
    
    public static ArrayList<Participante> getAllParticipantes(){
        
        Session session = UTILS.HibernateUtil.getSessionFactory().openSession();
        
        String hql = "SELECT p FROM Participante p ORDER BY apellidos";
        
        Query query = session.createQuery(hql);
        
        ArrayList<Participante> listaParticipantes = null;
        
        listaParticipantes = (ArrayList<Participante>) query.list();
        
        session.close();
        
        
        return listaParticipantes;
    }
    
    public static Participante getParticipanteByDorsal(int dorsal){
        
        Session session = UTILS.HibernateUtil.getSessionFactory().openSession();
        
        Participante participante = null;
       
        
        String hql = "SELECT p FROM Participante p WHERE dorsal=:dorsal";
        Query query = session.createQuery(hql).setParameter(dorsal, dorsal);
        
        participante = (Participante) query.uniqueResult();
        
        
        return participante;
        
    }
    
}
