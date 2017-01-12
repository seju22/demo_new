/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.controller;

import com.test.bean.Ipsm;
import com.test.dao.IpsmDao;
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
public class IpsmController extends HttpServlet {

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
            out.println("<title>Servlet IpsmController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet IpsmController at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        java.util.Date date = null;
        try {
            date = sdf.parse(request.getParameter("date"));
        } catch (ParseException ex) {
            Logger.getLogger(BgwController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Ipsm ipsm=new Ipsm();
            ipsm.setReldate(date);
            ipsm.setRelmonth(request.getParameter("month"));
            ipsm.setAppname(request.getParameter("name"));  
            ipsm.setIPSMSITESelectCloudservicesClickSearch(request.getParameter("iPSMSITESelectCloudservicesClickSearch"));
            ipsm.setIPSMSITESearchSitePartname(request.getParameter("iPSMSITESearchSitePartname"));
            ipsm.setIPSMSITESearchCircuitid(request.getParameter("iPSMSITESearchCircuitid"));
            ipsm.setIPSMVPNSelectCloudservicesClickSearch(request.getParameter("iPSMVPNSelectCloudservicesClickSearch"));
            ipsm.setIPSMWSUpdateSiteInfoInvoke(request.getParameter("iPSMWSUpdateSiteInfoInvoke"));
            
            IpsmDao i=new IpsmDao();
        try {
            i.insert(ipsm);
             response.sendRedirect("index1.jsp#4thPage");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(IpsmController.class.getName()).log(Level.SEVERE, null, ex);
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
