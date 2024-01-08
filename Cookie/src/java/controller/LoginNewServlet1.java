/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Admin;

/**
 *
 * @author Hieu
 */
@WebServlet(name="LoginNewServlet1", urlPatterns={"/login"})
public class LoginNewServlet1 extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
            out.println("<title>Servlet LoginNewServlet1</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginNewServlet1 at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        processRequest(request, response);
        request.getRequestDispatcher("login.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        processRequest(request, response);
        String u=request.getParameter("user");
        String p=request.getParameter("pass");
        String r=request.getParameter("rem");
        // tao 3 cookie luu username,pass,remember
        Cookie cu=new Cookie("cuser", u);
        Cookie cp=new Cookie("cpass", p);
        Cookie cr=new Cookie("crem", r);
        if(r!=null){
//            co chon
            cu.setMaxAge(60*60*24*7);//7 ngay
            cp.setMaxAge(60*60*24*7);//7 ngay
            cr.setMaxAge(60*60*24*7);//7 ngay
        }else{
            //Khong chon
            cu.setMaxAge(0);//7 ngay
            cp.setMaxAge(0);//7 ngay
            cr.setMaxAge(0);//7 ngay
        }
        // luu vao browser
        response.addCookie(cu);
        response.addCookie(cp);
        response.addCookie(cr);
        
        DAO d =new DAO();
        Admin a=d.check(u, p);
        HttpSession session=request.getSession();
        if(a==null){
            request.setAttribute("error", "Username or password invalid!!!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        else{
            session.setAttribute("account", a);
            response.sendRedirect("index.jsp");
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
