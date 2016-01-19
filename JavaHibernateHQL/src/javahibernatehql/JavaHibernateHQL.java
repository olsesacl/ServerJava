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
            
            System.out.println("\nUso de list con datos escalares");
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
            
            System.out.println("\nUso de list con un unico dato escalar");
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
            
            System.out.println("\nUso de unique result");
            System.out.println("=========================");
            
            String hql = "SELECT p FROM Participante p WHERE p.dorsal=656";
            
            Participante participante = (Participante) session.createQuery(hql).uniqueResult();
            
            System.out.println("Participante con dorsal 656:");
            System.out.println(participante.toString());
        }
        
        
        {
            /***
             * Mostrar una pagina
             */
            
            System.out.println("\nMostrar una pagina");
            System.out.println("=========================");
            
            int tamanyoPagina = 10;
            int paginaMostrar = 7;
            
            String hql = "SELECT p FROM Participante p ORDER BY p.dorsal";
            
            Query query = session.createQuery(hql);
            query.setMaxResults(tamanyoPagina);
            query.setFirstResult(paginaMostrar*tamanyoPagina);
            
            List<Participante> listaParticipantes = query.list();
            
            for (Participante participante : listaParticipantes) {
                System.out.println("-------------------------");
                System.out.println(participante.toString());
                System.out.println("-------------------------");
            }
           
        }
        
        {
            /***
             * Calcular el numero de paginas
             */
            
            System.out.println("\nCalcular el numero de paginas");
            System.out.println("=========================");
            
            int tamanyoPagina = 10;
            
            long numTotalObjetos = (long)session.createQuery("SELECT COUNT(*) FROM Participante p").uniqueResult();
            
            //Math.ceil es para hacer el redondeo al alza
            //se pone lo de double porque sino al hacer la operacion lo transforma a int redondeando como no queremos
            int numPaginas = (int) Math.ceil(numTotalObjetos/(double)tamanyoPagina);
            
            System.out.println("El numero total de paginas es: " + numPaginas);
            
            
        }
        
        
        session.close();
        sessionFactory.close();
    }
    
}
