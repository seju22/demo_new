/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.dao;

import com.test.bean.Bgw;
import com.test.bean.Snm;
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
public class SnmDao {
    
    public int insert(Snm s) throws ClassNotFoundException, SQLException {
        int i ;
        Connection con=DbConnection.getInstance().getConnection();
            String sql="insert into snm(date,month,name,SNM_Advanced_Trunk_Search_Search_Trunks,SNM_Circuit_Assign_Provision_Find_Ports_Field,SNM_Circuit_Assign_Provision_Assign,SNM_Circuit_View_Modify_Query,SNM_NNIConnection_New_Search_NNI,SNM_WS_find_Access_Cicuit_Capacity_At_Multiple_Sites,SNM_WS_find_Path_Capacity,SNM_WS_get_NNICapacity_From_SNM) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,s.getDate());
            ps.setString(2,s.getMonth());
            ps.setString(3, s.getName());
            ps.setString(4, s.getSNMAdvancedTrunkSearchSearchTrunks());
            ps.setString(5, s.getProvisionFindPortsField());
            ps.setString(6, s.getProvisionAssign());
            ps.setString(7, s.getSNMCircuitViewModifyQuery());
            ps.setString(8, s.getSNMNNIConnectionNewSearchNNI());
            ps.setString(9, s.getSNMWSfindAccessCicuitCapacityAtMultipleSites());
            ps.setString(10, s.getSNMWSfindPathCapacity());
            ps.setString(11, s.getSNMWSgetNNICapacityFromSNM());
         
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
           d.setDate(rs.getString("date"));
           d.setMonth(rs.getString("month"));
           d.setName(rs.getString("name"));     
           d.setSNMAdvancedTrunkSearchSearchTrunks("SNM_Advanced_Trunk_Search_Search_Trunks");
           d.setProvisionFindPortsField("SNM_Circuit_Assign_Provision_Find_Ports_Field");
           d.setProvisionAssign("SNM_Circuit_Assign_Provision_Assign");
           d.setSNMCircuitViewModifyQuery("SNM_Circuit_View_Modify_Query");
           d.setSNMNNIConnectionNewSearchNNI("SNM_NNIConnection_New_Search_NNI");
           d.setSNMWSfindAccessCicuitCapacityAtMultipleSites("SNM_WS_find_Access_Cicuit_Capacity_At_Multiple_Sites");
           d.setSNMWSfindPathCapacity("SNM_WS_find_Path_Capacity");
           d.setSNMWSgetNNICapacityFromSNM("SNM_WS_get_NNICapacity_From_SNM");
           d.setId(rs.getInt("id"));
            list.add(d);
        }
        return list;
    }
}
