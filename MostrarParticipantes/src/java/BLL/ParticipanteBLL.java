/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.ConexionBD;
import DAO.ParticipanteDAO;
import Entidad.Participante;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanJesus
 */
public class ParticipanteBLL {
    
    public Participante buscarPorDorsal(Participante participante){
     
        try {
            
            Connection _con = null;
            ConexionBD conexion = new ConexionBD();
            _con = conexion.abrirConexion();           
            ParticipanteDAO participanteDAO = new ParticipanteDAO();
            
            Participante participanteObtenido = participanteDAO.buscarPorDorsal(_con, participante);           
            
            conexion.cerrarConexion(_con);           
            return participanteObtenido;
            
        } catch (Exception ex) {
            
            ex.getStackTrace();
            return null;
        }      
    }
    
    public ArrayList<Participante> listarParticipantes(){
              
        try {
            
            Connection _con = null;
            ConexionBD conexion = new ConexionBD();
            _con = conexion.abrirConexion();
            ParticipanteDAO participanteDAO = new ParticipanteDAO();
            
            ArrayList<Participante> listaParticipantes = new ArrayList();
            
            listaParticipantes = participanteDAO.listarParticipantes(_con);
            
            conexion.cerrarConexion(_con);            
            return listaParticipantes;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } 
    }
    
}
