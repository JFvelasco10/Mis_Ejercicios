/* Autor: Julian Felipe Velasco Lopez */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entidades.UProductiva;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Con_UProductiva extends HttpServlet {
       UProductiva UPro;
       ArrayList<UProductiva> Lista_UProductiva=new ArrayList<UProductiva>();;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                        /* imprime tu página aquí. Puede usar el siguiente código de muestra. */
        
 if (request.getParameter("Operacion").equals("Registrar"))
        {
            UPro = new UProductiva();
            UPro.setCodigo(Float.parseFloat("Cod"));
            UPro.setNombre(request.getParameter("Nom"));
            UPro.setProducto(request.getParameter("Pro"));
            UPro.setCantidad(Float.parseFloat("Can"));
            UPro.setPrecio(Float.parseFloat(request.getParameter("Pre")));
            UPro.setFecha(request.getParameter("Fec"));
            UPro.setTotalProduccion (UPro.getCantidad() * UPro.getPrecio());
            Lista_UProductiva.add(UPro);
                
            out.print("<center><h3 class='msj'><mark>Se registró el Estudiante:</mark>"+UPro.getNombre()+" <mark>y el producto:</mark> "+UPro.getProducto()+"</h3></center>");
        }
        if(request.getParameter("Operacion").equals("Listar"))
        {
            for(int i = 0; i < Lista_UProductiva.size(); i++)
            {
                out.println("<tr><td id='txt2'>"+i+"</td>");
                out.println("<td id='txt2'>"+Lista_UProductiva.get(i).getCodigo()+"</td>");
                out.println("<td id='txt2'>"+Lista_UProductiva.get(i).getNombre()+"</td>");
                out.println("<td id='txt2'>"+Lista_UProductiva.get(i).getProducto()+"</td>");
                out.println("<td id='txt2'>"+Lista_UProductiva.get(i).getCantidad()+"</td>");
                out.println("<td id='txt2'>"+Lista_UProductiva.get(i).getFecha()+"</td>");
                out.println("<td id='txt2'>"+Lista_UProductiva.get(i).getTotalProduccion()+"</td>");
                out.println("<td><a href ='javascript:Eliminar_UProductiva("+ i +");'>Eliminar</a></td></tr>");
            }
        }
        
        if (request.getParameter("Operacion").equals("Eliminar")){
                int id = Integer.parseInt(request.getParameter("id"));
                Lista_UProductiva.remove(id);
                out.println("<p>Estudiante eliminado</p>");
            }
           if (request.getParameter("Operacion").equals("Listar_Json")){
                String json = new Gson().toJson(Lista_UProductiva); 
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
