/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahibernate;

import DAO.DB;
import Entidad.Participante;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author quique
 */
public class JavaHibernate {

    public static void main(String[] args) {
        
       
        //INSERT un dorsal
        
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession(); 
        
        Participante participante = new Participante(888888,"Sergio", "Sanchis", "Oliva", "Povale");
        
        session.beginTransaction();
        session.save(participante);
        session.getTransaction().commit();
        //session.close();
        //sessionFactory.close();
    
       
       //SELECT dorsal
      // SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
      // Session session = sessionFactory.openSession();
       
       //el 888888 es el dorsal a buscar
       Participante participante2 = (Participante) session.get(Participante.class, 888888);
        System.out.println("========================================");
        System.out.println("Nombre: " + participante2.getNombre());
        System.out.println("Apellidos: " + participante2.getApellidos());
        System.out.println("Poblacion: " + participante2.getPoblacion());
        System.out.println("Club: " + participante2.getClub());
        
        
        //session.close();
        //sessionFactory.close();
       
       //UPDATE
       participante2.setNombre("Pepe");
       session.beginTransaction();
       session.update(participante2);
       session.getTransaction().commit();
       //session.close();
      // sessionFactory.close();*/
       
       //DELETE
       //SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
       //Session session = sessionFactory.openSession();
       
       Participante participante3 = (Participante) session.get(Participante.class, 888888);
       
       session.beginTransaction();
       session.delete(participante3);
       session.getTransaction().commit();
       
       session.close();
       sessionFactory.close();
       
    }
    
}
