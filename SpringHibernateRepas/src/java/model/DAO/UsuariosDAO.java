/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.ArrayList;
import model.Entidad.Usuarios;
import model.Util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author 2daw
 */
public class UsuariosDAO {
    
    public static ArrayList<Usuarios> getListaUsuarios(){
        
        ArrayList<Usuarios> lista = null;
        
        try{
            
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            String hql = "SELECT u FROM Usuarios u";
            Query query = session.createQuery(hql);
            
            lista = (ArrayList<Usuarios>) query.list();
            session.close();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return lista;
        
    }
    
}
