/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;

/**
 *
 * @author 2daw
 */
//JDBC
public class ConexionDB {
    
    public Connection abrirConexion(){
        
        Connection con = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            String urlODBC = "jdbc:mysql://localhost:3306/carreras";
            con = java.sql.DriverManager.getConnection(urlODBC,"root", "");
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        return con;
        
    }
    
    public void cerrarConexion(Connection con){
        
        try{
            if(con!= null){
                con.close();
                
            }
        }catch(Exception e){
             e.printStackTrace();
        }
        
    }
    
}
