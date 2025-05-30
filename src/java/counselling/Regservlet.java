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
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Java
 */
@WebServlet(name = "Regservlet", urlPatterns = {"/Regservlet"})
public class Regservlet extends HttpServlet {

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
            out.println("<title>Servlet Regservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Regservlet at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        String username=request.getParameter("t1");
        String password=request.getParameter("t2");
        String age=request.getParameter("t3");
        String emailid=request.getParameter("t4");
        String mobile=request.getParameter("t5");
        String sslc=request.getParameter("t6");
        String hsc=request.getParameter("t7");
        String school=request.getParameter("t8");
        String address=request.getParameter("t9");
        String dob=request.getParameter("dob");
        String dob1=request.getParameter("dob1");
        String dob2=request.getParameter("dob2");
        String gender=request.getParameter("t10");
        
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/counselling","root","password");
          PreparedStatement ps=con.prepareStatement("Insert into user(username,password,age,email,mobile,slcmark,hsc,schoolname,address,dob,gender) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
          ps.setString(1, username);
          ps.setString(2, password);
          ps.setString(3, age);
          ps.setString(4, emailid);
          ps.setString(5, mobile);
          ps.setString(6, sslc);
          ps.setString(7, hsc);
          ps.setString(8, school);
          ps.setString(9, address);
          ps.setString(10, dob+","+dob1+","+dob2);
          ps.setString(11, gender);
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
