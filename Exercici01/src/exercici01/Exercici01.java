/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici01;

import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 2daw
 */
public class Exercici01 {

     private static SessionFactory factory; 
    public static void main(String[] args) {
      try{
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      } 
      long now = System.currentTimeMillis();
      
        exerciciHibernate1.Seguro seguro = new exerciciHibernate1.Seguro(2, "73037041T", "Paco", "Sanchis", "Climent", 32, 0, new Date(now));
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(seguro);
        session.getTransaction().commit();
        
        exerciciHibernate1.Seguro seguro2=(exerciciHibernate1.Seguro) session.get(exerciciHibernate1.Seguro.class,2);
        System.out.println(seguro.toString());
        
        seguro2.setNombre("Pepe");
        session.beginTransaction();
        session.update(seguro2);
        session.getTransaction().commit();
        
        exerciciHibernate1.Seguro seguro3 = (exerciciHibernate1.Seguro) session.get(exerciciHibernate1.Seguro.class, 2);
       
        session.beginTransaction();
        session.delete(seguro3);
        session.getTransaction().commit();
        
        session.close(); 
        factory.close();
    }
    
}
