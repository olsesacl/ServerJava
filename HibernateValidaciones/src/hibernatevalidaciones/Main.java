/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatevalidaciones;

import entidad.Profesor;
import entidad.Usuario;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author 2daw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*{ 
            Profesor profesor = new Profesor("CA", null, null);

            SessionFactory sessionFactory = Utils.HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

            try{

                session.beginTransaction();
                session.save(profesor);

                session.getTransaction().commit();


            } catch (ConstraintViolationException ex){

                session.getTransaction().rollback();
                System.out.println("No se ha podido realizar la inserción");

                for (ConstraintViolation e : ex.getConstraintViolations()) {
                    System.out.println("En el campo " + e.getPropertyPath() + ": " + e.getMessage());
                }

            } finally{
                session.close();
                sessionFactory.close();
            }
        }*/
        
        {
            Usuario usuario = new Usuario("pep", "Pep", "Garcia", "Garcia2", "123456789", "987654321");
            SessionFactory sessionFactory = Utils.HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

            try{

                session.beginTransaction();
                session.save(usuario);

                session.getTransaction().commit();


            } catch (ConstraintViolationException ex){

                session.getTransaction().rollback();
                System.out.println("No se ha podido realizar la inserción");

                for (ConstraintViolation e : ex.getConstraintViolations()) {
                    System.out.println("En el campo " + e.getPropertyPath() + ": " + e.getMessage());
                }

            } finally{
                session.close();
                sessionFactory.close();
            }
        }
        
    }
    
}
