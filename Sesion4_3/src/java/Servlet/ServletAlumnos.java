package Servlet;

import Entidades.AlumnoBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.runtime.ListAdapter;

/**
 *
 * @author sergi
 */
@WebServlet(name = "ServletAlumnos", urlPatterns = {"/ServletAlumnos"})
public class ServletAlumnos extends HttpServlet {
    
     ArrayList <AlumnoBean> lista = new ArrayList<AlumnoBean>();

    @Override
    public void init() throws ServletException {
        AlumnoBean alumno1 = new AlumnoBean("Pepe", "Gonzalez", "Marti", "73987412W");
        AlumnoBean alumno2 = new AlumnoBean("Paco", "Sanchez", "Moreno", "73545124E");
        AlumnoBean alumno3 = new AlumnoBean("Maria", "Alemany", "Blasco", "20541214T");
        
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        
        super.init(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        AlumnoBean alumno = null;
        String dni = request.getParameter("dni");
        
        for(AlumnoBean alumnoList:lista){
            if(alumnoList.getDNI().equalsIgnoreCase(dni)){
                alumno = alumnoList;
            }
        }
       /*     if(dni.equalsIgnoreCase(lista.get(i).getDNI())){
                alumno = lista.get(i);
            }
        }*/
        if(alumno != null){
            
           request.setAttribute("alumno", alumno);
            RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/MuestraDatosAlumno.jsp");
            rd.forward(request, response);
        
        } else {
            
            PrintWriter out = response.getWriter();
            out.println("No se ha encontrado el DNI");
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
