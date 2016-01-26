/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.entidad.Participantes;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author 2daw
 */
public class ParticipanteDAO {
    
    public static List<Participantes> llistaParticipants(){
        
        try{
            
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            String hql = "SELECT p FROM Participantes p";
            Query q = session.createQuery(hql);
            return q.list();
            
        }catch (Exception e){
            
        } finally{
            HibernateUtil.getSessionFactory().close();
        }
        
        return null;
    }
    
}
