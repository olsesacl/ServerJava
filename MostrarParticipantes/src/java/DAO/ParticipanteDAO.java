/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Participante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author juanje
 */
public class ParticipanteDAO {
    
    public void inserta(Connection con,Participante participante){
        PreparedStatement stmt=null;
        try{
            String sql="INSERT INTO participantes (Dorsal,Nombre,Apellidos,Poblacion,CLUB) VALUES (?,?,?,?,?)";
            stmt=con.prepareStatement(sql);
            stmt.setInt(1, participante.getDorsal());
            stmt.setString(2, participante.getNombre());
            stmt.setString(3, participante.getApellidos());
            stmt.setString(4, participante.getPoblacion());
            stmt.setString(5, participante.getClub());
            stmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void actualitza(Connection con,Participante participante){
        PreparedStatement stmt=null;
        try{
            String sql="UPDATE participantes "
                    + "SET Nombre = ?, Apellidos = ?, Poblacion = ?, CLUB = ?"
                    + "WHERE Dorsal = ?";
            stmt=con.prepareStatement(sql);
            
            stmt.setString(1, participante.getNombre());
            stmt.setString(2, participante.getApellidos());
            stmt.setString(3, participante.getPoblacion());
            stmt.setString(4, participante.getClub());
            stmt.setInt(5, participante.getDorsal());
            
            stmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Participante> listarParticipantes(Connection con){
        
        ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        try{
            String sql="SELECT Dorsal,Nombre,Apellidos,Poblacion,CLUB FROM participantes "                   
                    + " ORDER BY Apellidos";
            stmt=con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Participante _participante = new Participante();
                _participante = new Participante();
                _participante.setDorsal(rs.getInt("Dorsal"));
                _participante.setNombre(rs.getString("Nombre"));
                _participante.setApellidos(rs.getString("Apellidos"));
                _participante.setPoblacion(rs.getString("Poblacion"));
                _participante.setClub(rs.getString("CLUB")); 
                listaParticipantes.add(_participante);
            }         
        }catch(Exception e){
            e.printStackTrace();
        }       
        return listaParticipantes;
    
    }
    
    public void elimina(Connection con,Participante participante){
        PreparedStatement stmt=null;
        try{
            String sql="DELETE FROM participantes "                   
                    + "WHERE Dorsal = ?";
            stmt=con.prepareStatement(sql);
            
            stmt.setInt(1, participante.getDorsal());
            
            stmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public Participante buscarPorDorsal(Connection con,Participante participante){
        Participante _participante = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        try{
            String sql="SELECT Dorsal,Nombre,Apellidos,Poblacion,CLUB FROM participantes "                   
                    + "WHERE Dorsal = ?";
            stmt=con.prepareStatement(sql);
            stmt.setInt(1, participante.getDorsal());
            rs = stmt.executeQuery();
            while(rs.next()){
                _participante = new Participante();
                _participante.setDorsal(participante.getDorsal());
                _participante.setNombre(rs.getString("Nombre"));
                _participante.setApellidos(rs.getString("Apellidos"));
                _participante.setPoblacion(rs.getString("Poblacion"));
                _participante.setClub(rs.getString("CLUB"));             
            }         
        }catch(Exception e){
            e.printStackTrace();
        }       
        return _participante;
    }
    
    public void mostrarParticipante(Participante participante){
        System.out.println("==========================================");
        System.out.println(" Dorsal: "+participante.getDorsal());
        System.out.println(" Nombre: "+participante.getNombre());
        System.out.println(" Apellidos: "+participante.getApellidos());
        System.out.println(" Poblacion: "+participante.getPoblacion());
        System.out.println(" CLUB: "+participante.getClub());
        System.out.println("==========================================");
    }
    
    public ArrayList<Participante> buscarPorPoblacion(Connection con,Participante participante){
        
        ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        try{
            String sql="SELECT Dorsal,Nombre,Apellidos,Poblacion,CLUB FROM participantes "                   
                    + "WHERE Poblacion = ?";
            stmt=con.prepareStatement(sql);
            stmt.setString(1, participante.getPoblacion());
            rs = stmt.executeQuery();
            while(rs.next()){
                Participante _participante = new Participante();
                _participante = new Participante();
                _participante.setDorsal(rs.getInt("Dorsal"));
                _participante.setNombre(rs.getString("Nombre"));
                _participante.setApellidos(rs.getString("Apellidos"));
                _participante.setPoblacion(rs.getString("Poblacion"));
                _participante.setClub(rs.getString("CLUB")); 
                listaParticipantes.add(_participante);
            }         
        }catch(Exception e){
            e.printStackTrace();
        }       
        return listaParticipantes;
    }
}
