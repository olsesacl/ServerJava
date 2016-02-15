/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.BlogDAO;
import entidad.GnrPost;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 2daw
 */
public class BlogController extends HttpServlet {

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
        

        String slug = request.getParameter("slug");
        String borrar = request.getParameter("borrar");
        String editar = request.getParameter("editar");
        String edited = request.getParameter("edited");
        String add = request.getParameter("add");
        
        
        
        
        
        
        if(slug == null && borrar == null && editar == null && edited == null && add == null){
            
           ArrayList<GnrPost> listaPosts = BlogDAO.getAllPosts();
            request.setAttribute("listaPosts", listaPosts);
            request.getRequestDispatcher("/index.jsp").forward(request, response); 
            
        } else if(slug != null){
            
            GnrPost Post = BlogDAO.getPostBySlug(slug);
            request.setAttribute("Post", Post);
            request.getRequestDispatcher("/BlogDetalle.jsp").forward(request, response);
            
        } else if(borrar != null){
            
            GnrPost Post = BlogDAO.getPostBySlug(borrar);
            BlogDAO.Borrar(Post);
            
            //cargamos los datos del listado para mostrarlo tambien
            ArrayList<GnrPost> listaPosts = BlogDAO.getAllPosts();
            request.setAttribute("listaPosts", listaPosts);
            request.getRequestDispatcher("/Borrado.jsp").forward(request, response);
            
        } else if(editar != null){
            GnrPost Post = BlogDAO.getPostBySlug(editar);
            request.setAttribute("Post", Post);
            request.getRequestDispatcher("/editar.jsp").forward(request, response);
            
        } else if (edited != null){
            GnrPost Post = BlogDAO.getPostBySlug(edited);
            
            Post.setPostTitle(request.getParameter("title"));
            Post.setPostSlug(request.getParameter("new_slug"));
            Post.setPostBody(request.getParameter("body"));
            
            BlogDAO.guardar(Post);
            
            //cargamos los datos del listado para mostrarlo tambien
            ArrayList<GnrPost> listaPosts = BlogDAO.getAllPosts();
            request.setAttribute("listaPosts", listaPosts);
            request.getRequestDispatcher("/edited.jsp").forward(request, response);
            
        } else if(add != null){
            
            GnrPost Post = new GnrPost();
            Post.setPostTitle(request.getParameter("title"));
            Post.setPostSlug(request.getParameter("new_slug"));
            Post.setPostBody(request.getParameter("body"));
            
            BlogDAO.guardar(Post);
            
             //cargamos los datos del listado para mostrarlo tambien
            ArrayList<GnrPost> listaPosts = BlogDAO.getAllPosts();
            request.setAttribute("listaPosts", listaPosts);
            request.getRequestDispatcher("/added.jsp").forward(request, response);
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
