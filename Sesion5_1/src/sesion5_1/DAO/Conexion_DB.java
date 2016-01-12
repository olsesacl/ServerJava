/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion5_1.DAO;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexion_DB {
    
    public Connection AbrirConexion() throws Exception
    {
        Connection con = null; //instancia una conexion
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); //Cargar el driver
            String urlObdc = "jdbc:mysql://localhost:3306/ClientesDB";
            
            con = (java.sql.DriverManager.getConnection(urlObdc, "root", "servidor")); //crear la con exion
            
            return con;
            
        } catch (Exception e){
            e.printStackTrace();
            throw  new Exception("Ha sido imposible establecer la conexion"+e.getMessage());
        }
        
        
    }
    
    public void CerrarConexion (Connection con) throws Exception
    {
        try {
            if(con != null) con.close();
     
        } catch (SQLException e){
            e.printStackTrace();
            throw new Exception("Ha sido imposible cerrar la conexion" + e.getMessage());
        }
    }
    
}
