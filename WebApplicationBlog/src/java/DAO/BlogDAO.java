/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidad.GnrPost;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import utils.HibernateUtil;

/**
 *
 * @author 2daw
 */
public class BlogDAO {
    
    public static ArrayList<GnrPost> getAllPosts(){
         Session session=HibernateUtil.getSessionFactory().openSession();
         
         String hql="SELECT p FROM GnrPost p ORDER BY postDate DESC";
         Query query=session.createQuery(hql);
         
         ArrayList<GnrPost> listaPosts=null;
         listaPosts=(ArrayList<GnrPost>) query.list();
         session.close();
         
        return listaPosts;
    }
    
    public static GnrPost getPostBySlug(String slug){
         Session session=HibernateUtil.getSessionFactory().openSession();
         
         String hql="SELECT p FROM GnrPost p WHERE postSlug = '"+ slug + "'";
         Query query=session.createQuery(hql);
         
         GnrPost Post=null;
         Post= (GnrPost) query.uniqueResult();
         session.close();
         
        return Post;
    }
    
    public static void Borrar(GnrPost Post){
         Session session=HibernateUtil.getSessionFactory().openSession();
        
        try {
         session.beginTransaction();
        session.delete(Post);
        session.getTransaction().commit();
        } catch (Exception e) {
               session.getTransaction().rollback();
         
        }finally{
            session.close();
        }
         
    }
    
    public static void guardar(GnrPost Post){
     
        Session session=HibernateUtil.getSessionFactory().openSession();
        
        try {
         session.beginTransaction();
        session.saveOrUpdate(Post);
        session.getTransaction().commit();
        } catch (Exception e) {
          
               session.getTransaction().rollback();
           
            
        }finally{
            session.close();
        }
       
    }
    
    
 
    
    
    
}
