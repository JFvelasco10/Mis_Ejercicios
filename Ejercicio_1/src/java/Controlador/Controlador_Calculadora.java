/* Autor: Julian Felipe Velasco Lopez*/
package Controlador;

import Clases.Calculadora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Controlador_Calculadora extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            Calculadora Cal = new Calculadora();
            Cal.Valor1 = Float.parseFloat(request.getParameter("Valor1"));
            Cal.Valor2 = Float.parseFloat(request.getParameter("Valor2"));
            Cal.Resultado = Cal.Valor1 + Cal.Valor2;
            out.print("El resultado es: " + Cal.Resultado);
        }
    }

}