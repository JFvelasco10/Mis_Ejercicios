/* Autor: Julian Felipe Velasco Lopez */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entidades.Estudiante;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Con_Estudiante extends HttpServlet {
    Estudiante Est;
    ArrayList<Estudiante> Lista_Estudiante=new ArrayList<Estudiante>();;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* imprime tu página aquí. Puede usar el siguiente código de muestra. */
        if (request.getParameter("Operacion").equals("Registrar"))
        {
            Est = new Estudiante();
            Est.setNombre(request.getParameter("Nomb"));
            Est.setNota1(Float.parseFloat(request.getParameter("N1")));
            Est.setNota2(Float.parseFloat(request.getParameter("N2")));
            Est.setNota3(Float.parseFloat(request.getParameter("N3")));
            Est.setDefinitiva((Est.getNota1()+Est.getNota2()+Est.getNota3())/3);
            Lista_Estudiante.add(Est);
             
            out.print("<center><h3 class='msj'>Se registró el estudiante: "+Est.getNombre()+"</h3></center>"); 
        }
        if(request.getParameter("Operacion").equals("Listar"))
        {
            for(int i = 0; i < Lista_Estudiante.size(); i++)
            {
                out.println("<tr><td id='txt2'>"+i+"</td>");
                out.println("<td id='txt2'>"+Lista_Estudiante.get(i).getNombre()+"</td>");
                out.println("<td id='txt2'>"+Lista_Estudiante.get(i).getNota1()+"</td>");
                out.println("<td id='txt2'>"+Lista_Estudiante.get(i).getNota2()+"</td>");
                out.println("<td id='txt2'>"+Lista_Estudiante.get(i).getNota3()+"</td>");
                out.println("<td id='txt2'>"+Lista_Estudiante.get(i).getDefinitiva()+"</td>");
                out.println("<td><a href ='javascript:Eliminar_Estudiante("+ i +");'>Eliminar</a></td></tr>");
            }
        }
        
        if (request.getParameter("Operacion").equals("Eliminar")){
                int id = Integer.parseInt(request.getParameter("id"));
                Lista_Estudiante.remove(id);
                out.println("<p>Estudiante eliminado</p>");
            }
           if (request.getParameter("Operacion").equals("Listar_Json")){
                String json = new Gson().toJson(Lista_Estudiante); 
                out.println(json);
            }
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