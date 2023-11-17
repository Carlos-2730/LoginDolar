/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ServletsDolar extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
          String user = request.getParameter ("usuario");
        String pass = request.getParameter ("clave");
        
            
        if (user.equals("admin") && pass.equals("1234"))
        {
            processRequest(request,response, "Registro Exitoso");
        }else{
                processRequest(request,response,"Registro Declinado");
            }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             processRequest(request, response);
    }

    /**
     *
     * @return
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void processRequest(HttpServletRequest request, HttpServletResponse response, String registro_Declinado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
