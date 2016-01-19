/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahibernateparametros;

import Entidad.Participante;
import Utils.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author 2daw
 */
public class JavaHibernateParametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        {
            System.out.println("Parametro posicionar");
            System.out.println("=====================");
            
            Query query = session.createQuery("SELECT p FROM Participante p WHERE p.club=? AND p.poblacion=?");
            
            query.setString(0, "ATLETAS NUCLEO DURO DENIA");
            query.setString(1, "DENIA");
            
            List<Participante> participantes = query.list();
            
            for (Object participante : participantes) {
                System.out.println(participante.toString());
            }
        
        }
        
        {
            System.out.println("\nParametro con nombre");
            System.out.println("=====================");
            
            String club = "ATLETAS NUCLEO DURO DENIA";
            String poblacion = "DENIA";
            
            Query query = session.createQuery("SELECT p FROM Participante p WHERE p.club=:clubhql AND p.poblacion=:poblacionhql");
            
            //Depende del tipo de dato se deberia de usar setInteger
            query.setString("clubhql", club);
            
            //siempre se puede usar setParameter.
            query.setParameter("poblacionhql", poblacion);
            
            List<Participante> participantes = query.list();
            
            for (Object participante : participantes) {
                System.out.println(participante.toString());
            }
        
        }
        
        {
            System.out.println("\nParametros por metodos encadenados");
            System.out.println("=====================");
            
            String club = "ATLETAS NUCLEO DURO DENIA";
            String poblacion = "DENIA";
            
            Query query = session.createQuery("SELECT p FROM Participante p WHERE p.club=:clubhql AND p.poblacion=:poblacionhql")
                    .setParameter("clubhql", club)
                    .setParameter("poblacionhql", poblacion);
            
            
            List<Participante> participantes = query.list();
            
            for (Object participante : participantes) {
                System.out.println(participante.toString());
            }
        
        }
       
        
        session.close();
        sessionFactory.close();
        
    }
    
}
