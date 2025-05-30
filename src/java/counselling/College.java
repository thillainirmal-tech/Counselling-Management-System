/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counselling;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Java
 */
@WebServlet(name = "College", urlPatterns = {"/College"})
public class College extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet College</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet College at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
       // processRequest(request, response);
        int count=0;
        String s0=request.getParameter("t0");
        String s1=request.getParameter("t1");
        String s2=request.getParameter("t2");
        String s3=request.getParameter("t3");
        String s4=request.getParameter("t4");
        String s5=request.getParameter("t5");
        String s6=request.getParameter("t6");
        String s7=request.getParameter("t7");
        String s8=request.getParameter("t8");
        String count1=Integer.toString(count);
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/counselling","root","password");
            PreparedStatement ps=con.prepareStatement("insert into college(cid,cname,grade,cutoffmini,cutoffmax,location,type,underofcollege,information,count) values(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, s0);
            ps.setString(2, s1);
            ps.setString(3, s2);
            ps.setString(4, s3);
            ps.setString(5, s4);
            ps.setString(6, s5);
            ps.setString(7, s6);
            ps.setString(8, s7);
            ps.setString(9, s8);
            ps.setString(10, count1);
            ps.executeUpdate();
            response.sendRedirect("Welcome.jsp");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
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
