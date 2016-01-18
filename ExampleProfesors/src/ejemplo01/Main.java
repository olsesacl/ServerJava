/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

 

import org.hibernate.LockMode;
import org.hibernate.Session; 
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author vicente
 */
public class Main {
     private static SessionFactory factory; 
    public static void main(String[] args) {
      try{
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      } 
        Profesor profesor=new Profesor(101,"Juan","Perez","Garcia");
        Session session = factory.openSession();
//        session.beginTransaction();
//        session.save(profesor);
//        session.getTransaction().commit();
        Profesor profesor2=(Profesor) session.get(Profesor.class,1);
        System.out.println(profesor.toString());
        profesor2.setNombre("Pepe");
        session.beginTransaction();
        session.update(profesor2);
        session.getTransaction().commit();
        session.close(); 
        factory.close();
    }
    
}
