/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion5_1;
import java.sql.Connection;
import sesion5_1.DAO.Conexion_DB;
import sesion5_1.DAO.ClienteDAO;
import Entidad.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args){
        /*
        comprobar conexion
        try{
            Conexion_DB conexion_DB = new Conexion_DB();
            System.out.println("Abrir Conexión");
            Connection con = conexion_DB.AbrirConexion();
            System.out.println("Conexión abierta");
            
            System.out.println("Cerrar conexión");
            conexion_DB.CerrarConexion(con);
            System.out.println("Conexión cerrada");
            
        } catch (Exception ex){
            ex.printStackTrace();
        }*/
        
        Conexion_DB _conexion_DB = new Conexion_DB();
        Connection _con = null;
        
        try{
            _con = _conexion_DB.AbrirConexion();
            ClienteDAO _clienteDAO = new ClienteDAO();
            
            //insertar nuevo cliente
            Cliente _cliente1 = new Cliente();
            _cliente1.setDNI(8977);
            _cliente1.setNombre("Alejandro");
            _cliente1.setApellido1("Martinez");
            _cliente1.setNick("alex");
            _cliente1.setPassword("ale1");
            _cliente1.setSaldo(1000);
            _cliente1.setMoroso(false);
            
            _clienteDAO.inserta(_con, _cliente1);
            System.out.println("Nuevo cliente insertado");
            
            //Actualizar anterior cliente
            _cliente1.setNombre("Juan");
            _clienteDAO.actualizar(_con, _cliente1);
            System.out.println("Cliente actualizado");
            
            //Eliminar cliente cuyo DNI es 25
            
            Cliente _cliente3 = new Cliente();
            _cliente3.setDNI(25);
            _clienteDAO.elimina(_con, _cliente3);
            System.out.println("Cliente eliminado");
            
        } catch (Exception ex){
            ex.printStackTrace();
        } finally{
            try {
                _conexion_DB.CerrarConexion(_con);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
