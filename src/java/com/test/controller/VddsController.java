/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.controller;


import com.test.bean.Vdds;
import com.test.dao.VddsDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MR
 */
public class VddsController extends HttpServlet {

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
            out.println("<title>Servlet IvappController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet IvappController at " + request.getContextPath() + "</h1>");
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
      //  processRequest(request, response);
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        java.util.Date date = null;
        try {
            date = sdf.parse(request.getParameter("date"));
        } catch (ParseException ex) {
            Logger.getLogger(BgwController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Vdds i=new Vdds();
            i.setReldate(date);
            i.setRelmonth(request.getParameter("month"));
            i.setAppname(request.getParameter("name"));  
            i.setVDDSCircuitSearchCircuit(request.getParameter("vDDSCircuitSearchCircuit"));
            i.setVDDSWorkOrderSearchWorkOrder(request.getParameter("vDDSWorkOrderSearchWorkOrder"));
            i.setVDDSWSGetPVCChangeinfo(request.getParameter("vDDSWSGetPVCChangeinfo"));
            i.setVDDSWSGetCircuitAndPvcsIPSM(request.getParameter("vDDSWSGetCircuitAndPvcsIPSM"));
            i.setVDDSTDMOrderApprove(request.getParameter("vDDSTDMOrderApprove"));
            i.setVDDSTDMOrderProvisioningSearchWorkOrder(request.getParameter("vDDSTDMOrderProvisioningSearchWorkOrder"));
//            i.setVDDSTDMOrderProvisioningClickSubmitProvisionButton(request.getParameter("vDDSTDMOrderProvisioningClickSubmitProvisionButton"));
            
            VddsDao d=new VddsDao();
        try {
            d.insert(i);
             response.sendRedirect("index1.jsp#4thPage");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VddsController.class.getName()).log(Level.SEVERE, null, ex);
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
