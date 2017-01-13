/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.dao;

import com.test.bean.Bgw;
import com.test.bean.Snm;
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
public class SnmDao {
    
    public int insert(Snm s) throws ClassNotFoundException, SQLException {
        int i ;
        Connection con=DbConnection.getInstance().getConnection();
            String sql="insert into snm(Test_date,Rel_month,App_name,SNM_Advanced_Trunk_Search_Search_Trunks,SNM_Circuit_Assign_Provision_Find_Ports_Field,SNM_Circuit_Assign_Provision_Assign,SNM_Circuit_View_Modify_Query,SNM_WS_find_Access_Cicuit_Capacity_At_Multiple_Sites,SNM_WS_find_Path_Capacity,SNM_WS_get_NNICapacity_From_SNM) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps =con.prepareStatement(sql);
              ps.setDate(1, new java.sql.Date(s.getReldate().getTime()));
            ps.setString(2,s.getRelmonth());
            ps.setString(3, s.getAppname());
            ps.setString(4, s.getSNMAdvancedTrunkSearchSearchTrunks());
            ps.setString(5, s.getSNMCircuitAssignProvisionFindPortsField());
            ps.setString(6, s.getSNMCircuitAssignProvisionAssign());
            ps.setString(7, s.getSNMCircuitViewModifyQuery());
//            ps.setString(8, s.getSNMNNIConnectionNewSearchNNI());
            ps.setString(8, s.getSNMWSfindAccessCicuitCapacityAtMultipleSites());
            ps.setString(9, s.getSNMWSfindPathCapacity());
            ps.setString(10, s.getSNMWSgetNNICapacityFromSNM());
         
            i= ps.executeUpdate();
            ps.close();
            return i;
}
    
    public ArrayList<Snm> displaySnm() throws ClassNotFoundException, SQLException{
        
        ArrayList<Snm> list=new ArrayList<Snm>();
        Connection con=DbConnection.getInstance().getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from snm");
        while(rs.next()){
            Snm d=new Snm();
           d.setReldate(rs.getDate("Test_date"));
           d.setRelmonth(rs.getString("Rel_month"));
           d.setAppname(rs.getString("App_name"));     
           d.setSNMAdvancedTrunkSearchSearchTrunks("SNM_Advanced_Trunk_Search_Search_Trunks");
           d.setSNMCircuitAssignProvisionFindPortsField("SNM_Circuit_Assign_Provision_Find_Ports_Field");
           d.setSNMCircuitAssignProvisionAssign("SNM_Circuit_Assign_Provision_Assign");
           d.setSNMCircuitViewModifyQuery("SNM_Circuit_View_Modify_Query");
//           d.setSNMNNIConnectionNewSearchNNI("SNM_NNIConnection_New_Search_NNI");
           d.setSNMWSfindAccessCicuitCapacityAtMultipleSites("SNM_WS_find_Access_Cicuit_Capacity_At_Multiple_Sites");
           d.setSNMWSfindPathCapacity("SNM_WS_find_Path_Capacity");
           d.setSNMWSgetNNICapacityFromSNM("SNM_WS_get_NNICapacity_From_SNM");
           d.setId(rs.getInt("id"));
            list.add(d);
        }
        return list;
    }
      public ArrayList<Snm> displaySnmGraph(String month, String date) throws ClassNotFoundException, SQLException{
        
        ArrayList<Snm> list=new ArrayList<Snm>();
        Connection con=DbConnection.getInstance().getConnection();
        Statement st=con.createStatement();
        // for mysql 
    //    ResultSet rs=st.executeQuery("SELECT Rel_date,App_name, SUM(SNM_Advanced_Trunk_Search_Search_Trunks) AS r1, SUM(SNM_Circuit_Assign_Provision_Find_Ports_Field) AS r2,SUM(SNM_Circuit_Assign_Provision_Assign) AS r3,SUM(SNM_Circuit_View_Modify_Query) AS r4,SUM(SNM_WS_find_Access_Cicuit_Capacity_At_Multiple_Sites) AS r5,SUM(SNM_WS_find_Path_Capacity) AS r6,SUM(SNM_WS_get_NNICapacity_From_SNM) AS r7 FROM snm WHERE (Rel_date BETWEEN '"+date+"' AND DATE_ADD('"+date+"', INTERVAL 5 DAY)) AND Rel_month='"+month+"' GROUP BY DATE(Rel_date)");
        // for ms sql
         ResultSet rs=st.executeQuery("SELECT Test_date, SUM(cast(SNM_Advanced_Trunk_Search_Search_Trunks as float)) AS r1, \n" +
"   SUM(cast(SNM_Circuit_Assign_Provision_Find_Ports_Field as float)) AS r2,\n" +
"   SUM(cast(SNM_Circuit_Assign_Provision_Assign as float)) AS r3,SUM(cast(SNM_Circuit_View_Modify_Query as  float)) AS r4,\n" +
"   SUM(cast(SNM_WS_find_Access_Cicuit_Capacity_At_Multiple_Sites as float)) AS r5,SUM(cast(SNM_WS_find_Path_Capacity as float )) AS r6,\n" +
"   SUM(cast(SNM_WS_get_NNICapacity_From_SNM as float)) AS r7 FROM snm WHERE (Test_date in ("+date+")) AND Rel_month='"+month+"' GROUP BY (Test_date)");
        while(rs.next()){
            Snm s=new Snm();
            s.setSNMAdvancedTrunkSearchSearchTrunks(rs.getString("r1"));
            s.setSNMCircuitAssignProvisionFindPortsField(rs.getString("r2"));
            s.setSNMCircuitAssignProvisionAssign(rs.getString("r3"));
            s.setSNMCircuitViewModifyQuery(rs.getString("r4")); 
//            s.setSNMNNIConnectionNewSearchNNI(rs.getString("r5")); 
            s.setSNMWSfindAccessCicuitCapacityAtMultipleSites(rs.getString("r5"));
            s.setSNMWSfindPathCapacity(rs.getString("r6")); 
            s.setSNMWSgetNNICapacityFromSNM(rs.getString("r7"));
          //  s.setAppname(rs.getString("App_name"));
            s.setReldate(rs.getDate("Test_date"));
            list.add(s);
        }
        return list;
    }
      
}


