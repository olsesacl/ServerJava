/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahibernatehql;

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
public class JavaHibernateHQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        {
            System.out.println("Uso de list");
            System.out.println("=========================");

            //es un select sobre la clase Participante, no sobre la tabla de la base de datos
            Query query = session.createQuery("SELECT p FROM Participante p");
            List<Participante> participantes = query.list();

            for (Participante participante : participantes) {
                System.out.println("-------------------------");
                System.out.println(participante.toString());
                System.out.println("-------------------------");
            }

       
        }
        {
            /***
             * Uso de list con datos escalares
             */
            
            System.out.println("Uso de list con datos escalares");
            System.out.println("=========================");

            //es un select sobre la clase Participante, no sobre la tabla de la base de datos
            Query query = session.createQuery("SELECT p.dorsal, p.nombre, p.apellidos, p.poblacion, p.club FROM Participante p");

            List<Object[]> listDatos = query.list();
            
            for (Object[] datos : listDatos) {
                System.out.println("-------------------------");
                System.out.println(datos[0] + "--" + datos[1]);
                System.out.println("-------------------------");
            }
        
        }
        
        {
            /***
             * Uso de list con un unico dato escalar
             */
            
            System.out.println("Uso de list con un unico dato escalar");
            System.out.println("=========================");

            //es un select sobre la clase Participante, no sobre la tabla de la base de datos
            Query query = session.createQuery("SELECT p.nombre FROM Participante p");

            List<Object> listDatos = query.list();
            
            for (Object dato : listDatos) {
                System.out.println("-------------------------");
                System.out.println(dato);
                System.out.println("-------------------------");
            }
        
        }
        
        
        {
            /***
             * Uso de unique result
             */
            
            System.out.println("Uso de unique result");
            System.out.println("=========================");
            
            String hql = "SELECT p FROM Participante p WHERE p.dorsal=656";
            
            Participante participante = (Participante) session.createQuery(hql).uniqueResult();
            
            System.out.println("Participante con dorsal 656:");
            System.out.println(participante.toString());
        }
        
        
        session.close();
        sessionFactory.close();
    }
    
}
