/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dao;

import com.test.bean.Bgw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MR
 */
public class Dao {
       
    public int insert(Bgw bgw) throws ClassNotFoundException, SQLException {
        int i ;
        Connection con=DbConnection.getInstance().getConnection();


            String sql="insert into bgw(date,month,name,BGW_Open_Equipment_Page,BGW_Open_Add_Aisle_Page,BGW_Load_Rack_Details,BGW_Path_Select_Path,BGW_Path_Open_CircuitId_Details,BGW_Path_Open_Circuit_View_Page,BGW_Path_Open_Print_View_Page,BGW_Path_Open_Circuit_Premises_Page,BGW_Path_Click_Modify,BGW_Site_Open_Add_New_Site_Page,BGW_View_Order_OpenView_Order_Page,BGW_View_Order_Open_Details_Page,BGW_View_Order_Open_Audits_Tab,BGW_View_Order_Open_Interface_Activity_Tab,BGW_Search_Task_Record,BGW_Search_Task_Open_Task_Detail_Page) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,bgw.getDate());
            ps.setString(2,bgw.getMonth());
            ps.setString(3, bgw.getName());
            ps.setString(4, bgw.getBGWOpenEquipmentPage());
            ps.setString(5, bgw.getBGWOpenAddAislePage());
            ps.setString(6, bgw.getBGWLoadRackDetails());
            ps.setString(7, bgw.getBGWPathSelectPath());
            ps.setString(8, bgw.getBGWPathOpenCircuitIdDetails());
            ps.setString(9, bgw.getBGWPathOpenCircuitViewPage());
            ps.setString(10, bgw.getBGWPathOpenPrintViewPage());
            ps.setString(11, bgw.getBGWPathOpenCircuitPremisesPage());
            ps.setString(12,bgw.getBGWPathClickModify());
            ps.setString(13, bgw.getBGWSiteOpenAddNewSitePage());
            ps.setString(14, bgw.getBGWViewOrderOpenViewOrderPage());
            ps.setString(15, bgw.getBGWViewOrderOpenDetailsPage());
            ps.setString(16, bgw.getBGWViewOrderOpenAuditsTab());
            ps.setString(17, bgw.getBGWViewOrderOpenInterfaceActivityTab());
            ps.setString(18, bgw.getBGWSearchTaskRecord());
            ps.setString(19, bgw.getBGWSearchTaskOpenTaskDetailPage());


          
            i= ps.executeUpdate();
            ps.close();
            return i;
}
    
    public ArrayList<Bgw> display() throws ClassNotFoundException, SQLException{
        
        ArrayList<Bgw> list=new ArrayList<Bgw>();
        Connection con=DbConnection.getInstance().getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from bgw");
        while(rs.next()){
            Bgw d=new Bgw();
           d.setDate(rs.getString("date"));
           d.setMonth(rs.getString("month"));
           d.setName(rs.getString("name"));          


           d.setBGWOpenEquipmentPage(rs.getString("BGW_Open_Equipment_Page"));
           d.setBGWOpenAddAislePage(rs.getString("BGW_Open_Add_Aisle_Page"));
           d.setBGWLoadRackDetails(rs.getString("BGW_Load_Rack_Details"));
           d.setBGWPathSelectPath(rs.getString("BGW_Path_Select_Path"));
           d.setBGWPathOpenCircuitIdDetails(rs.getString("BGW_Path_Open_CircuitId_Details"));
           d.setBGWPathOpenCircuitViewPage(rs.getString("BGW_Path_Open_Circuit_View_Page"));
           d.setBGWPathOpenPrintViewPage(rs.getString("BGW_Path_Open_Print_View_Page"));
           d.setBGWPathOpenCircuitPremisesPage(rs.getString("BGW_Path_Open_Circuit_Premises_Page"));
           d.setBGWPathClickModify(rs.getString("BGW_Path_Click_Modify"));
           d.setBGWSiteOpenAddNewSitePage(rs.getString("BGW_Site_Open_Add_New_Site_Page"));
           d.setBGWViewOrderOpenViewOrderPage(rs.getString("BGW_View_Order_OpenView_Order_Page"));
           d.setBGWViewOrderOpenDetailsPage(rs.getString("BGW_View_Order_Open_Details_Page"));
           d.setBGWViewOrderOpenAuditsTab(rs.getString("BGW_View_Order_Open_Audits_Tab"));
           d.setBGWViewOrderOpenInterfaceActivityTab(rs.getString("BGW_View_Order_Open_Interface_Activity_Tab"));
           d.setBGWSearchTaskRecord(rs.getString("BGW_Search_Task_Record"));
           d.setBGWSearchTaskOpenTaskDetailPage(rs.getString("BGW_Search_Task_Open_Task_Detail_Page"));

           d.setId(rs.getInt("id"));
            list.add(d);
        }
        return list;
    }
     public Bgw getById(int id) throws ClassNotFoundException, SQLException{
        
        Connection con=DbConnection.getInstance().getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from bgw where id='"+id+"'");
        Bgw d=new Bgw();
        while(rs.next()){                      
               d.setId(rs.getInt("id"));
               d.setDate(rs.getString("date"));
               d.setMonth(rs.getString("month"));


               d.setName(rs.getString("name"));        
           d.setBGWOpenEquipmentPage(rs.getString("BGW_Open_Equipment_Page"));
           d.setBGWOpenAddAislePage(rs.getString("BGW_Open_Add_Aisle_Page"));
           d.setBGWLoadRackDetails(rs.getString("BGW_Load_Rack_Details"));
           d.setBGWPathSelectPath(rs.getString("BGW_Path_Select_Path"));
           d.setBGWPathOpenCircuitIdDetails(rs.getString("BGW_Path_Open_CircuitId_Details"));
           d.setBGWPathOpenCircuitViewPage(rs.getString("BGW_Path_Open_Circuit_View_Page"));
           d.setBGWPathOpenPrintViewPage(rs.getString("BGW_Path_Open_Print_View_Page"));
           d.setBGWPathOpenCircuitPremisesPage(rs.getString("BGW_Path_Open_Circuit_Premises_Page"));
           d.setBGWPathClickModify(rs.getString("BGW_Path_Click_Modify"));
           d.setBGWSiteOpenAddNewSitePage(rs.getString("BGW_Site_Open_Add_New_Site_Page"));
           d.setBGWViewOrderOpenViewOrderPage(rs.getString("BGW_View_Order_OpenView_Order_Page"));
           d.setBGWViewOrderOpenDetailsPage(rs.getString("BGW_View_Order_Open_Details_Page"));
           d.setBGWViewOrderOpenAuditsTab(rs.getString("BGW_View_Order_Open_Audits_Tab"));
           d.setBGWViewOrderOpenInterfaceActivityTab(rs.getString("BGW_View_Order_Open_Interface_Activity_Tab"));
           d.setBGWSearchTaskRecord(rs.getString("BGW_Search_Task_Record"));
           d.setBGWSearchTaskOpenTaskDetailPage(rs.getString("BGW_Search_Task_Open_Task_Detail_Page"));



            
        }
        return d;
    }
    
    public void update(Bgw d) throws ClassNotFoundException, SQLException{
         Connection con=DbConnection.getInstance().getConnection();


         PreparedStatement st=con.prepareStatement("update bgw set date='"+d.getDate()+"',month='"+d.getMonth()+"',name='"+d.getName()+"',BGW_Open_Equipment_Page='"+d.getBGWOpenEquipmentPage()+"',BGW_Open_Add_Aisle_Page='"+d.getBGWOpenAddAislePage()+"',BGW_Load_Rack_Details='"+d.getBGWLoadRackDetails()+"',BGW_Path_Select_Path='"+d.getBGWPathSelectPath()+"',BGW_Path_Open_CircuitId_Details='"+d.getBGWPathOpenCircuitIdDetails()+"',BGW_Path_Open_Circuit_View_Page='"+d.getBGWPathOpenCircuitViewPage()+"',BGW_Path_Open_Print_View_Page='"+d.getBGWPathOpenPrintViewPage()+"',BGW_Path_Open_Circuit_Premises_Page='"+d.getBGWPathOpenCircuitPremisesPage()+"',BGW_Path_Click_Modify='"+d.getBGWPathClickModify()+"',BGW_Site_Open_Add_New_Site_Page='"+d.getBGWSiteOpenAddNewSitePage()+"',BGW_View_Order_OpenView_Order_Page='"+d.getBGWViewOrderOpenViewOrderPage()+"',BGW_View_Order_Open_Details_Page='"+d.getBGWViewOrderOpenDetailsPage()+"',BGW_View_Order_Open_Audits_Tab='"+d.getBGWViewOrderOpenAuditsTab()+"',BGW_View_Order_Open_Interface_Activity_Tab='"+d.getBGWViewOrderOpenInterfaceActivityTab()+"',BGW_Search_Task_Record='"+d.getBGWSearchTaskRecord()+"',BGW_Search_Task_Open_Task_Detail_Page='"+d.getBGWSearchTaskOpenTaskDetailPage()+"' where id='"+d.getId()+"'");

         st.executeUpdate();
    }
    
    
       public void delete(int id) throws ClassNotFoundException, SQLException{
        Connection con=DbConnection.getInstance().getConnection();
        Statement st=con.createStatement();
        st.executeUpdate("delete from bgw where id='"+id+"'");       
    }
}

