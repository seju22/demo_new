/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dao;

import com.test.bean.Bgw;

import java.sql.Connection;
import java.sql.Date;
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


            String sql="insert into bgw(Test_date,Rel_month,App_name,BGW_Open_Equipment_Page,BGW_Open_Add_Aisle_Page,BGW_Load_Rack_Details,BGW_Path_Select_Path,BGW_Path_Open_CircuitId_Details,BGW_Path_Open_Circuit_View_Page,BGW_Path_Open_Print_View_Page,BGW_Path_Open_Circuit_Premises_Page,BGW_Path_Click_Modify,BGW_Site_Open_Add_New_Site_Page,BGW_View_Order_OpenView_Order_Page,BGW_View_Order_Open_Details_Page,BGW_View_Order_Open_Audits_Tab,BGW_View_Order_Open_Interface_Activity_Tab,BGW_Search_Task_Record,BGW_Search_Task_Open_Task_Detail_Page,BGW_Search_View_Order_Open_SNC_CC_Info,BGW_Search_View_Order_Click_Circuit_Id_Hyperlink) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps =con.prepareStatement(sql);
              ps.setDate(1, new java.sql.Date(bgw.getReldate().getTime()));
            ps.setString(2,bgw.getRelmonth());
            ps.setString(3, bgw.getAppname());
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
            ps.setString(20, bgw.getbGWSearchViewOrderOpenSncCcInfo());
            ps.setString(21, bgw.getbGWSearchViewOrderClickCircuitIdHyperlink());


          
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
           d.setReldate(rs.getDate("Test_date"));
           d.setRelmonth(rs.getString("Rel_month"));
           d.setAppname(rs.getString("App_name"));          


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
           d.setbGWSearchViewOrderOpenSncCcInfo(rs.getString("BGW_Search_View_Order_Open_SNC_CC_Info"));
           d.setbGWSearchViewOrderClickCircuitIdHyperlink("BGW_Search_View_Order_Click_Circuit_Id_Hyperlink");

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
             d.setReldate(rs.getDate("Test_date"));
             d.setRelmonth(rs.getString("Rel_month"));
             d.setAppname(rs.getString("App_name"));          
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
           d.setbGWSearchViewOrderOpenSncCcInfo(rs.getString("BGW_Search_View_Order_Open_SNC_CC_Info"));
           d.setbGWSearchViewOrderClickCircuitIdHyperlink("BGW_Search_View_Order_Click_Circuit_Id_Hyperlink");



            
        }
        return d;
    }
    
    public void update(Bgw d) throws ClassNotFoundException, SQLException{
         Connection con=DbConnection.getInstance().getConnection();


         PreparedStatement st=con.prepareStatement("update bgw set Rel_date='"+d.getReldate()+"',Rel_month='"+d.getRelmonth()+"',App_name='"+d.getAppname()+"',BGW_Open_Equipment_Page='"+d.getBGWOpenEquipmentPage()+"',BGW_Open_Add_Aisle_Page='"+d.getBGWOpenAddAislePage()+"',BGW_Load_Rack_Details='"+d.getBGWLoadRackDetails()+"',BGW_Path_Select_Path='"+d.getBGWPathSelectPath()+"',BGW_Path_Open_CircuitId_Details='"+d.getBGWPathOpenCircuitIdDetails()+"',BGW_Path_Open_Circuit_View_Page='"+d.getBGWPathOpenCircuitViewPage()+"',BGW_Path_Open_Print_View_Page='"+d.getBGWPathOpenPrintViewPage()+"',BGW_Path_Open_Circuit_Premises_Page='"+d.getBGWPathOpenCircuitPremisesPage()+"',BGW_Path_Click_Modify='"+d.getBGWPathClickModify()+"',BGW_Site_Open_Add_New_Site_Page='"+d.getBGWSiteOpenAddNewSitePage()+"',BGW_View_Order_OpenView_Order_Page='"+d.getBGWViewOrderOpenViewOrderPage()+"',BGW_View_Order_Open_Details_Page='"+d.getBGWViewOrderOpenDetailsPage()+"',BGW_View_Order_Open_Audits_Tab='"+d.getBGWViewOrderOpenAuditsTab()+"',BGW_View_Order_Open_Interface_Activity_Tab='"+d.getBGWViewOrderOpenInterfaceActivityTab()+"',BGW_Search_Task_Record='"+d.getBGWSearchTaskRecord()+"',BGW_Search_Task_Open_Task_Detail_Page='"+d.getBGWSearchTaskOpenTaskDetailPage()+"', BGW_Search_View_Order_Open_SNC_CC_Info='"+d.getbGWSearchViewOrderOpenSncCcInfo()+"',BGW_Search_View_Order_Click_Circuit_Id_Hyperlink='"+d.getbGWSearchViewOrderClickCircuitIdHyperlink()+"' where id='"+d.getId()+"'");

         st.executeUpdate();
    }
    
    
       public void delete(int id) throws ClassNotFoundException, SQLException{
        Connection con=DbConnection.getInstance().getConnection();
        Statement st=con.createStatement();
        st.executeUpdate("delete from bgw where id='"+id+"'");       
    }
       
      public ArrayList<Bgw> displayBgwGraph(String month, String date) throws ClassNotFoundException, SQLException{
      
        System.out.println("BGW Date :"+date);
        ArrayList<Bgw> list=new ArrayList<Bgw>();
        Connection con=DbConnection.getInstance().getConnection();
        Statement st=con.createStatement();
        /* For Mysql */
        //ResultSet rs=st.executeQuery("SELECT Rel_date,App_name, SUM(BGW_Open_Equipment_Page) AS r1, SUM(BGW_Open_Add_Aisle_Page) AS r2, SUM(BGW_Load_Rack_Details) AS r3, SUM(BGW_Path_Select_Path) AS r4, SUM(BGW_Path_Open_CircuitId_Details) AS r5, SUM(BGW_Path_Open_Circuit_View_Page) AS r6, SUM(BGW_Path_Open_Print_View_Page) AS r7, SUM(BGW_Path_Open_Circuit_Premises_Page) AS r8, SUM(BGW_Path_Click_Modify) AS r9, SUM(BGW_Site_Open_Add_New_Site_Page) AS r10, SUM(BGW_View_Order_OpenView_Order_Page) AS r11, SUM(BGW_View_Order_Open_Details_Page) AS r12, SUM(BGW_View_Order_Open_Audits_Tab) AS r13, SUM(BGW_View_Order_Open_Interface_Activity_Tab) AS r14, SUM(BGW_Search_Task_Record) AS r15, SUM(BGW_Search_Task_Open_Task_Detail_Page) AS r16 FROM bgw WHERE (Rel_date BETWEEN '"+date+"' AND DATE_ADD('"+date+"', INTERVAL 5 DAY)) AND Rel_month='"+month+"' GROUP BY DATE(Rel_date)");
         /* For MSsql */
        ResultSet rs=st.executeQuery("SELECT Test_date,SUM(cast(BGW_Open_Equipment_Page as float)) AS r1, SUM(cast(BGW_Open_Add_Aisle_Page as float)) AS r2, SUM(cast(BGW_Load_Rack_Details as float)) AS r3, SUM(cast(BGW_Path_Select_Path as float)) AS r4, SUM(cast (BGW_Path_Open_CircuitId_Details as float)) AS r5, SUM(cast(BGW_Path_Open_Circuit_View_Page as float)) AS r6, SUM(cast(BGW_Path_Open_Print_View_Page as float)) AS r7, SUM(cast (BGW_Path_Open_Circuit_Premises_Page as float)) AS r8, SUM(cast(BGW_Path_Click_Modify as float)) AS r9, SUM(cast(BGW_Site_Open_Add_New_Site_Page as float)) AS r10, SUM(cast(BGW_View_Order_OpenView_Order_Page as float )) AS r11, SUM(cast(BGW_View_Order_Open_Details_Page as float)) AS r12, SUM(cast(BGW_View_Order_Open_Audits_Tab as float)) AS r13, SUM(cast(BGW_View_Order_Open_Interface_Activity_Tab as float)) AS r14, SUM(cast(BGW_Search_Task_Record as float)) AS r15, SUM(cast(BGW_Search_Task_Open_Task_Detail_Page as float)) AS r16 ,sum(cast(BGW_Search_View_Order_Open_SNC_CC_Info as float )) as r17, sum(cast(BGW_Search_View_Order_Click_Circuit_Id_Hyperlink as float)) as r18 FROM bgw\n" +
" WHERE (Test_date in ("+date+")) AND \n" +
" Rel_month='"+month+"' GROUP BY (Test_date)");
        while(rs.next()){
            Bgw b=new Bgw();
            b.setBGWOpenEquipmentPage(rs.getString("r1"));
            b.setBGWOpenAddAislePage(rs.getString("r2"));
            b.setBGWLoadRackDetails(rs.getString("r3"));
            b.setBGWPathSelectPath(rs.getString("r4"));
            b.setBGWPathOpenCircuitIdDetails(rs.getString("r5"));
            b.setBGWPathOpenCircuitViewPage(rs.getString("r6"));
            b.setBGWPathOpenPrintViewPage(rs.getString("r7"));
            b.setBGWPathOpenCircuitPremisesPage(rs.getString("r8"));
            b.setBGWPathClickModify(rs.getString("r9"));
            b.setBGWSiteOpenAddNewSitePage(rs.getString("r10"));
            b.setBGWViewOrderOpenViewOrderPage(rs.getString("r11"));
            b.setBGWViewOrderOpenDetailsPage(rs.getString("r12"));
            b.setBGWViewOrderOpenAuditsTab(rs.getString("r13"));
            b.setBGWViewOrderOpenInterfaceActivityTab(rs.getString("r14"));
            b.setBGWSearchTaskRecord(rs.getString("r15"));
            b.setBGWSearchTaskOpenTaskDetailPage(rs.getString("r16"));
            b.setbGWSearchViewOrderOpenSncCcInfo(rs.getString("r17"));
            b.setbGWSearchViewOrderClickCircuitIdHyperlink(rs.getString("r18"));
            b.setReldate(rs.getDate("Test_date"));
            list.add(b);
        }
        return list;
    }
      
       public ArrayList<String> AjaxRelMOnthDates(String AppName, String relMonth,String Table) throws ClassNotFoundException, SQLException{
      
      
        ArrayList<String> list=new ArrayList<String>();
        Connection con=DbConnection.getInstance().getConnection();
        Statement st=con.createStatement();
        /* For Mysql */
        //ResultSet rs=st.executeQuery("SELECT Rel_date,App_name, SUM(BGW_Open_Equipment_Page) AS r1, SUM(BGW_Open_Add_Aisle_Page) AS r2, SUM(BGW_Load_Rack_Details) AS r3, SUM(BGW_Path_Select_Path) AS r4, SUM(BGW_Path_Open_CircuitId_Details) AS r5, SUM(BGW_Path_Open_Circuit_View_Page) AS r6, SUM(BGW_Path_Open_Print_View_Page) AS r7, SUM(BGW_Path_Open_Circuit_Premises_Page) AS r8, SUM(BGW_Path_Click_Modify) AS r9, SUM(BGW_Site_Open_Add_New_Site_Page) AS r10, SUM(BGW_View_Order_OpenView_Order_Page) AS r11, SUM(BGW_View_Order_Open_Details_Page) AS r12, SUM(BGW_View_Order_Open_Audits_Tab) AS r13, SUM(BGW_View_Order_Open_Interface_Activity_Tab) AS r14, SUM(BGW_Search_Task_Record) AS r15, SUM(BGW_Search_Task_Open_Task_Detail_Page) AS r16 FROM bgw WHERE (Rel_date BETWEEN '"+date+"' AND DATE_ADD('"+date+"', INTERVAL 5 DAY)) AND Rel_month='"+month+"' GROUP BY DATE(Rel_date)");
         /* For MSsql */
        // System.out.println("SELECT Rel_date from "+Table+" where App_name="+AppName+"AND Rel_month="+relMonth+" size "+list.size());
        ResultSet rs=st.executeQuery("SELECT DISTINCT Test_date from "+Table+" where App_name='"+AppName+"' AND Rel_month='"+relMonth+"'");
        while(rs.next()){
           
            list.add(rs.getString("Test_date"));
           
           
        }
        
        
        return list;
    }
      
}

