/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;

/**
 *
 * @author juanje
 */
public class ConexionBD {

    public Connection abrirConexion() throws Exception {
        
        Connection con =null;
        try{
            //carregar el driver
           Class.forName("com.mysql.jdbc.Driver");
           String urlOdbc="jdbc:mysql://localhost:3306/carreras";
          con= java.sql.DriverManager.getConnection(urlOdbc,"root","");
          return con;
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("Ha sido imposible establecer la conexion"+e.getMessage());
          
    }
        
}
    
    
    public void cerrarConexion(Connection con)throws Exception {
        
        try{
            if(con!=null){
                con.close();
            }
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("Ha sido imposible cerrar la conexion"+e.getMessage());
          
        }
        
        
    }
}
