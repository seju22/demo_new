package com.test.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.test.bean.Bgw;

import com.test.dao.Dao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MR
 */
public class BgwController extends HttpServlet {

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
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet BgwController</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet BgwController at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
    //  processRequest(request, response);
       HttpSession session = request.getSession();
        int id=Integer.parseInt(request.getParameter("id"));
        String action=request.getParameter("action");
     Dao demo=new Dao();
        if(action!=null){
            if(action.equalsIgnoreCase("edit")){
              
                try {
                  Bgw d=  demo.getById(id);
                  if(d.getName().equalsIgnoreCase("BGW")){
                       session.setAttribute("edit1", d);
                  }
                  if(d.getName().equalsIgnoreCase("IVAPP")){
                      session.setAttribute("edit2", d);
                  }
                  if(d.getName().equalsIgnoreCase("SNM")){
                       session.setAttribute("edit3", d);
                  }
                  if(d.getName().equalsIgnoreCase("IPSM")){
                      session.setAttribute("edit4", d);
                  }
                   //session.setAttribute("edit", d);
//                   System.out.print("Edit Error :"+d.getAisle());;
                   //RequestDispatcher rd=request.getRequestDispatcher("index1.jsp#3rdPage");  
                    //rd.include(request, response);
                   response.sendRedirect("index1.jsp#3rdPage");
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(BgwController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    demo.delete(id);
                    RequestDispatcher rd=request.getRequestDispatcher("index1.jsp");  
                    rd.forward(request, response);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(BgwController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
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
      //  processRequest(request, response);
   //  Demo d=new Demo();
     Bgw b=new Bgw();

            b.setDate(request.getParameter("date"));
                 System.out.println("date :"+request.getParameter("date"));
            b.setMonth(request.getParameter("month"));
            b.setName(request.getParameter("name"));  
            b.setBGWOpenEquipmentPage(request.getParameter("bGWOpenEquipmentPage"));
            b.setBGWOpenAddAislePage(request.getParameter("bGWOpenAddAislePage"));
            b.setBGWLoadRackDetails(request.getParameter("bGWLoadRackDetails"));
            b.setBGWPathSelectPath(request.getParameter("bGWPathSelectPath"));
            b.setBGWPathOpenCircuitIdDetails(request.getParameter("bGWPathOpenCircuitIdDetails"));
            b.setBGWPathOpenCircuitViewPage(request.getParameter("bGWPathOpenCircuitViewPage"));
            b.setBGWPathOpenPrintViewPage(request.getParameter("bGWPathOpenPrintViewPage"));
            b.setBGWPathOpenCircuitPremisesPage(request.getParameter("bGWPathOpenCircuitPremisesPage"));
            b.setBGWPathClickModify(request.getParameter("bGWPathClickModify"));
            b.setBGWSiteOpenAddNewSitePage(request.getParameter("bGWSiteOpenAddNewSitePage"));
            b.setBGWViewOrderOpenViewOrderPage(request.getParameter("bGWViewOrderOpenViewOrderPage"));
            b.setBGWViewOrderOpenDetailsPage(request.getParameter("bGWViewOrderOpenDetailsPage"));
            b.setBGWViewOrderOpenAuditsTab(request.getParameter("bGWViewOrderOpenAuditsTab"));
            b.setBGWViewOrderOpenInterfaceActivityTab(request.getParameter("bGWViewOrderOpenInterfaceActivityTab"));
            b.setBGWSearchTaskRecord(request.getParameter("bGWSearchTaskRecord"));
            b.setBGWSearchTaskOpenTaskDetailPage(request.getParameter("BGW_Search_Task_Open_Task_Detail_Page"));
            
           System.out.println("id is :"+request.getParameter("id"));
            String id = request.getParameter("id");
            //new code//
          Dao dao=new Dao();
//        try {
//            dao.insert(b);
            //-----//
          if( id == null || id.isEmpty()){
         try {
             //d.setId(Integer.parseInt(id));
              int result= dao.insert(b);
             System.out.print("result"+result);
            
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(BgwController.class.getName()).log(Level.SEVERE, null, ex);
         }
         response.sendRedirect("index1.jsp#4thPage");
//         RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
//                rd.forward(request, response);
          }else{
//                int id=Integer.parseInt(request.getParameter("id"));
              b.setId(Integer.parseInt(id));
         try {
             dao.update(b);
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(BgwController.class.getName()).log(Level.SEVERE, null, ex);
         }
         response.sendRedirect("index1.jsp#4thPage");
               RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
                rd.forward(request, response);
                
                //----//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(BgwController.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(BgwController.class.getName()).log(Level.SEVERE, null, ex);
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
