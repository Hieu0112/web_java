/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Hieu
 */
@WebServlet(name="TinhServelet", urlPatterns={"/tinh"})
public class TinhServelet extends HttpServlet {
   
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
            out.println("<title>Servlet TinhServelet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TinhServelet at " + request.getContextPath () + "</h1>");
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
////        processRequest(request, response);
//        String money_raw=request.getParameter("money");
//        String change=request.getParameter("change");
//        
//        String usds=getServletContext().getInitParameter("usd");
//        String yens=getServletContext().getInitParameter("yen");
//        double money,usd,yen;
////        PrintWriter out =response.getWriter();
//        try{
//            money=Double.parseDouble(money_raw);
//            usd=Double.parseDouble(usds);
//            yen=Double.parseDouble(yens);
//            double money_change;
//            if(change.endsWith("0")){
//                money_change=money/usd;
//            }
//            else{
//                money_change=money/yen;
//            }
//            request.setAttribute("money", money_change);
//            request.getRequestDispatcher("tinh.jsp").forward(request, response);
////            out.println("Tien quy doi :" +money_change);
//        }catch(NumberFormatException e){
////            out.println("KHONG PHAI SO!!!");
//            request.setAttribute("error","Khong phai la so hay nhap lai");
//            request.getRequestDispatcher("tinh.jsp").forward(request, response);
//        }
        request.getRequestDispatcher("tinh.jsp").forward(request, response);
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
        String money_raw=request.getParameter("money");
        String change=request.getParameter("change");
//        checkbox
//        String[] change= request.getParameterValues("change");
        
        String usds=getServletContext().getInitParameter("usd");
        String yens=getServletContext().getInitParameter("yen");
        double money,usd,yen;
//        PrintWriter out =response.getWriter();
        try{
            money=Double.parseDouble(money_raw);
            usd=Double.parseDouble(usds);
            yen=Double.parseDouble(yens);
            String mess="";
//            double money_change;
            if(change.equals("0")){
                mess="QUY DOI USD: "+money/usd;
            }
            else{
                mess="QUY DOI YEN: "+money/yen;
            }
//            if(change==null){
//                mess="Ban chua chon loai quy doi";
//            }
//            else if(change.length==1){
//               if(change[0].equals("0")){
//                   mess="Quy doi USD"+money/usd;
//               }
//               else
//                   mess="QUY DOI YEN"+money/yen;
//            }
//            else{
//                mess="QUY DOI USD:"+money/usd;
//                mess+="<br/>";
//                mess+="QUY DOI YEN:"+money/yen;
//            }  
//            request.setAttribute("money", mess);
            request.setAttribute("money", mess);
            request.getRequestDispatcher("tinh.jsp").forward(request, response);
//            out.println("Tien quy doi :" +money_change);
        }catch(NumberFormatException e){
//            out.println("KHONG PHAI SO!!!");
            request.setAttribute("error","Khong phai la so hay nhap lai");
            request.getRequestDispatcher("tinh.jsp").forward(request, response);
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
