/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Participante;
import org.hibernate.Session;

/**
 *
 * @author 2daw
 */
public class ParticipanteDAO {
    
    public static void guardar(){
        
        Participante participante = new Participante(1254, "Sergio", "Sanchis", "Oliva", "mi club");
        
        Session session = UTILS.HibernateUtil.getSessionFactory().openSession();
    }
    
}
