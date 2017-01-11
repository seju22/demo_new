/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.controller;

import com.test.bean.Bgw;
import com.test.bean.Ipsm;
import com.test.bean.Snm;
import com.test.bean.Vdds;
import com.test.dao.Dao;
import com.test.dao.IpsmDao;
import com.test.dao.SnmDao;
import com.test.dao.VddsDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MR
 */
public class Graphcontroller extends HttpServlet {

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
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Graphcontroller</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Graphcontroller at " + request.getContextPath() + "</h1>");
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
        String mapDate=request.getParameter("gDate");
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        java.util.Date date = null;
        String date2 = null;
        
        try {
            date = sdf.parse(request.getParameter("gDate"));
            
            // passed to dao
            date2=sdf.format(date);
            
        } catch (ParseException ex) {
            Logger.getLogger(BgwController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        String appName = request.getParameter("gName");
        String month = request.getParameter("gMonth");
        Date gDate =date;
       // String dateRel[] = date2.split("-");
       
        if(appName.equalsIgnoreCase("IPSM")){
            
             IpsmDao i=new IpsmDao();
           
            try {
                List<Ipsm> ipsm = i.displayIpsmGraph(month, mapDate);
                 
                request.setAttribute("ipsmList", ipsm);
                System.out.println("List :"+ipsm.size());
               // System.out.println("IPSM LIST ARE:"+i.displayIpsmGraph(month));
                RequestDispatcher rd = request.getRequestDispatcher("graph.jsp");
                rd.forward(request, response);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Graphcontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }else if(appName.equalsIgnoreCase("SNM")){
         
             SnmDao s=new SnmDao();
           
            try {
                List<Snm> snm = s.displaySnmGraph(month, mapDate);
                 Iterator itr=snm.iterator();
                    while(itr.hasNext()){
                        Snm d1=(Snm)itr.next();
                        Date i2 =d1.getReldate();
                        System.out.println("Iterated value is :" + i2);
                        System.out.println("Iterated value is :" + d1.getSNMAdvancedTrunkSearchSearchTrunks());
                       
                    }
                request.setAttribute("snmList", snm);
                request.setAttribute("snmMonth", month);
//                System.out.println("IPSM LIST ARE:"+s.displaySnmGraph((java.sql.Date) gDate));
                RequestDispatcher rd = request.getRequestDispatcher("graph.jsp");
                rd.forward(request, response);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Graphcontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }else if(appName.equalsIgnoreCase("VDDS")){
          System.out.println("VDDS LIST ARE:"+date);
           VddsDao v=new VddsDao();
           
            try {
                List<Vdds> vdds = v.displayVddsGraph(month, mapDate);
                 Iterator itr=vdds.iterator();
                    while(itr.hasNext()){
                        Vdds v1=(Vdds)itr.next();
                        Date i1 =v1.getReldate();
                        System.out.println("Iterated value is :" + i1);
                    }
                request.setAttribute("vddsList", vdds);
                RequestDispatcher rd = request.getRequestDispatcher("graph.jsp");
                rd.forward(request, response);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Graphcontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }else if(appName.equalsIgnoreCase("BGW")){
          System.out.println("BGW LIST ARE:"+date);
             Dao b=new Dao();
           
            try {
                List<Bgw> bgw = b.displayBgwGraph(month, mapDate);
                 Iterator itr=bgw.iterator();
                    while(itr.hasNext()){
                        Bgw d1=(Bgw)itr.next();
                        Date i1 =d1.getReldate();
                        System.out.println("Iterated value is 110:" + i1);
                    }
                request.setAttribute("bgwList", bgw);
                
                RequestDispatcher rd = request.getRequestDispatcher("graph.jsp");
                rd.forward(request, response);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Graphcontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
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
