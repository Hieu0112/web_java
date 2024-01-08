/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.ClassesDAO;
import dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import entity.Students;

/**
 *
 * @author Hieu
 */
@WebServlet(name="updateServelet", urlPatterns={"/update"})
public class updateServelet extends HttpServlet {
   
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
            out.println("<title>Servlet updateServelet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateServelet at " + request.getContextPath () + "</h1>");
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
        String studentID=request.getParameter("id");
        try{
            StudentDAO cdb=new StudentDAO();
            Students c=cdb.getStudentById(studentID);
            request.setAttribute("student", c);
            request.getRequestDispatcher("update.jsp").forward(request, response);
        }catch(NumberFormatException e){
            
        }
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
        request.setCharacterEncoding("UTF-8");
//        processRequest(request, response);
        String studentID=request.getParameter("studentID");
        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        String mobilePhone=request.getParameter("mobilePhone");
        String birthday=request.getParameter("birthday");
        String classID=request.getParameter("classID");
        StudentDAO cdb= new StudentDAO();
        ClassesDAO cd= new ClassesDAO();
        try{
            Students cNew =new Students(studentID, firstName, lastName, mobilePhone, birthday, classID);
            cNew.setClasses(cd.getClassesById(classID));
            cdb.update(cNew);
            response.sendRedirect("list");
        }
        catch(NumberFormatException e){
            System.out.println(e);
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
