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
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 2daw
 */
public class ParticipanteDAO {

    public void inserta(Connection con, Participante participante) throws SQLException {

        PreparedStatement stmt = null;

        try {

            String sql = "INSERT INTO participantes (Dorsal, Nombre, Apellidos, Poblacion, CLUB) VALUES (?,?,?,?,?)";
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, participante.getDorsal());
            stmt.setString(2, participante.getNombre());
            stmt.setString(3, participante.getApellidos());
            stmt.setString(4, participante.getPoblacion());
            stmt.setString(5, participante.getClub());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }

    }

    public ArrayList<Participante> listar(Connection con) throws SQLException {

        ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            String sql = "SELECT * FROM participantes ORDER BY Apellidos";

            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
            
            Participante participante = null;
            
            while(rs.next()){
                participante = new Participante();
                participante.setDorsal(rs.getInt("Dorsal"));
                participante.setNombre(rs.getString("Nombre"));
                participante.setApellidos(rs.getString("Apellidos"));
                participante.setPoblacion(rs.getString("Poblacion"));
                participante.setClub(rs.getString("CLUB"));
                
                listaParticipantes.add(participante);

                
            }

        } catch (SQLException e) {
            e.printStackTrace();
            
            throw new SQLException("Problema al listar los participantes: " + e.getMessage());
            
        }finally{
            if(rs != null){
                rs.close();
            }
            if(stmt != null){
                stmt.close();
            }
        }

        return listaParticipantes;

    }

}
