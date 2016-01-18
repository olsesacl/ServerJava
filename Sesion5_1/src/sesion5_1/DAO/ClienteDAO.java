/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion5_1.DAO;
import Entidad.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2daw
 */
public class ClienteDAO {
    public void actualizar (Connection con, Cliente cliente) throws Exception
    {
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE cliente SET Nombre=?, Ape1=?, Ape2=?, Nick=?, Passwd=?, Saldo=?, Moroso=? WHERE DNI=?");
            
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido1());
            stmt.setString(3, cliente.getApellido2());
            stmt.setString(4, cliente.getNick());
            stmt.setString(5, cliente.getPassword());
            stmt.setFloat(6, cliente.getSaldo());
            if(cliente.isMoroso()) stmt.setInt(7, 1);
            else stmt.setInt(7, 0);
            stmt.setInt(8, cliente.getDNI());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex){
            ex.printStackTrace();
            throw new Exception("Ha habido un problema al actualizar el cliente"+ex.getMessage());
        } finally{
            if(stmt != null) stmt.close();
        }
    }
    
    public void elimina (Connection con,Cliente cliente) throws Exception{
        PreparedStatement stmt = null;
        
        try{
            
            stmt = con.prepareStatement("DELETE FROM cliente WHERE DNI=?");
            stmt.setInt(1, cliente.getDNI());
            stmt.executeUpdate();
            
        } catch (SQLException ex){
            ex.printStackTrace();
            throw new Exception("Ha habido un problema al eliminar el cliente"+ex.getMessage());
        } finally{
            if(stmt != null) stmt.close();
        }
    }
    
    public void inserta (Connection con, Cliente cliente) throws Exception{
        PreparedStatement stmt = null;
        
        try{
            
            stmt = con.prepareStatement("INSERT INTO cliente (DNI, Nombre, Ape1, Ape2, Nick, Passwd, Saldo, Moroso) VALUES (?,?,?,?,?,?,?,?)");
            
            stmt.setInt(1, cliente.getDNI());
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getApellido1());
            stmt.setString(4, cliente.getApellido2());
            stmt.setString(5, cliente.getNick());
            stmt.setString(6, cliente.getPassword());
            stmt.setFloat(7, cliente.getSaldo());
            if(cliente.isMoroso()) stmt.setInt(8, 1);
            else stmt.setInt(8, 0);
            
            stmt.executeUpdate();
            
        } catch (SQLException ex){
            ex.printStackTrace();
            throw new Exception("Ha habido un problema al insertar el cliente"+ex.getMessage());
        } finally{
            if(stmt != null) stmt.close();
        }
    }
    
    private void obtenClienteFila(ResultSet rs, Cliente cliente) throws Exception{
        cliente.setDNI(rs.getInt("DNI"));
        cliente.setNombre(rs.getString("Nombre"));
        cliente.setApellido1(rs.getString("Ape1"));
        cliente.setApellido2(rs.getString("Ape2"));
        cliente.setNick(rs.getString("Nick"));
        cliente.setPassword(rs.getString("Passwd"));
        cliente.setSaldo(rs.getFloat("Saldo"));
        if(rs.getInt("Moroso") == 0) cliente.setMoroso(false);
        else cliente.setMoroso(true);
        
    }
    
    public Cliente findByDNI(Connection con, Cliente cliente) throws Exception{
        Cliente _cliente = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE DNI=?");
            
            stmt.setInt(1, cliente.getDNI());
            rs = stmt.executeQuery();
            
            while(rs.next()){
                _cliente = new Cliente();
                obtenClienteFila(rs, _cliente);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Ha habido un problema al buscar el cliente por DNI" +ex.getMessage());
        } finally{
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
        }
        
        return _cliente;
    }
    
    
    public Cliente findByNick(Connection con, Cliente cliente) throws Exception{
        Cliente _cliente = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE Nick=?");
            
            stmt.setString(1, cliente.getNick());
            rs = stmt.executeQuery();
            
            while(rs.next()){
                _cliente = new Cliente();
                obtenClienteFila(rs, _cliente);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Ha habido un problema al buscar el cliente por Nick" +ex.getMessage());
        } finally{
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
        }
        
        return _cliente;
    }
    
    public List<Cliente> findByDNIStart(Connection con, int numero) throws Exception{
        List<Cliente> _listaClientes = new ArrayList();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE DNI like ?");
            
            stmt.setString(1, numero+"%");
            rs = stmt.executeQuery();
            Cliente _cliente = null;
            
            while(rs.next()){
                _cliente = new Cliente();
                obtenClienteFila(rs, _cliente);
                _listaClientes.add(_cliente);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Ha habido un problema al buscar el cliente por initio de DNI" +ex.getMessage());
        } finally{
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
        }
        
        return _listaClientes;
    }
    
    public Cliente findByMayorGasto (Connection con) throws Exception{
        Cliente _cliente = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT Cliente_DNI AS DNI, SUM(Precio*Numero) AS GASTO "+
                    "FROM articulo_factura af, articulo a, factura f "+
                    "WHERE af.Atricuto_idArticulo = a.idArticulo "+
                    "AND af.Factura_idFactura = f.idFactura "+
                    "GROUP BY(Cliente_DNI)");
            
            rs = stmt.executeQuery();
            float _gastoAnterior = 0;
            
            while(rs.next()){
                float gasto = rs.getFloat("GASTO");
                if(gasto>_gastoAnterior){
                    _cliente = new Cliente();
                    _cliente.setDNI(rs.getInt("DNI"));
                    _gastoAnterior = gasto;
                }
            }
            
        } catch(SQLException ex){
            ex.printStackTrace();
            throw new Exception("Ha habido un problema al buscar el cliente"+ex.getMessage());
        } finally{
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
        }
        
        if(_cliente != null) _cliente = findByDNI(con, _cliente);
        return _cliente;
    }
}
