/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici02;

import java.sql.Date;
import java.util.Calendar;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 2daw
 */
public class Exercici02 {
     private static SessionFactory factory; 
    public static void main(String[] args) {
      try{
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      } 
      long now = System.currentTimeMillis();
      
        Seguro seguro = new Seguro(5, "73037041T", "Paco", "Sanchis", "Climent", 32, 0, new Date(now));
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(seguro);
        session.getTransaction().commit();
        
        Seguro seguro2=(Seguro) session.get(Seguro.class,5);
        System.out.println(seguro.toString());
        
        seguro2.setNombre("Pepe");
        session.beginTransaction();
        session.update(seguro2);
        session.getTransaction().commit();
        
        Seguro seguro3 = (Seguro) session.get(Seguro.class, 5);
       
        session.beginTransaction();
        session.delete(seguro3);
        session.getTransaction().commit();
        
        session.close(); 
        factory.close();
    }
    
}
