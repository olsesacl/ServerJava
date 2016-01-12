
import DAO.ConexionBD;
import DAO.ParticipanteDAO;
import Entidad.Participante;
import java.sql.Connection;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ConexionBD conexion=new ConexionBD();
            System.out.println("Abrir conexion");
            Connection con =conexion.abrirConexion();
            System.out.println("Conexion abierta");            
            
            //Instanciar DAO
            ParticipanteDAO participanteDAO = new ParticipanteDAO();
            Participante participante = new Participante();
            
            //Insertar participante
            /*           
            participante.setDorsal(999999999);
            participante.setNombre("Juanje");
            participante.setApellidos("Gregori Peiro");
            participante.setPoblacion("Gandia");
            participante.setClub("C.A. SundayRunners");
            */
            
            //insertar participante
            //participanteDAO.inserta(con, participante);
            
            //Actualitzar participante   
            /*
            participante.setDorsal(999999999);
            participante.setNombre("Juan jesus");
            participante.setApellidos("Gregori");
            participante.setPoblacion("Gandi");
            participante.setClub("SundayRunners");
            */
            
            //participanteDAO.actualitza(con, participante);
            
            //Borrar participante
            //participante.setDorsal(999999999);
            //participanteDAO.elimina(con, participante);
            
            //Buscar por dorsal
            participante.setDorsal(6);
            participante = participanteDAO.buscarPorDorsal(con, participante);
            //participanteDAO.mostrarParticipante(participante);
            
            //Buscar por poblacion
            participante.setPoblacion("DENIA");
            ArrayList<Participante> listaParticipantes = participanteDAO.buscarPorPoblacion(con, participante);
            for(int i = 0; i < listaParticipantes.size(); i++){
                
                participanteDAO.mostrarParticipante(listaParticipantes.get(i));
                
            }
            
            System.out.println("Cerrar conexion");
            conexion.cerrarConexion(con);
            System.out.println("Conexion cerrada");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
