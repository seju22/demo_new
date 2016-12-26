/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.dao;


import com.test.bean.Bgw;
import com.test.bean.Vdds;
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
public class VddsDao {
    public int insert(Vdds v) throws ClassNotFoundException, SQLException {
        int i ;
        Connection con=DbConnection.getInstance().getConnection();
            String sql="insert into vdds(date,month,name,VDDS_Circuit_Search_Circuit,VDDS_WorkOrder_Search_Work_Order,VDDS_WS_Get_PVC_Changeinfo,VDDS_WS_GetCircuit_And_Pvcs_IPSM,VDDS_TDM_Order_Approve,VDDS_TDM_Order_Provisioning_Search_WorkOrder,VDDS_TDM_Order_Provisioning_Click_Submit_Provision_Button) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,v.getDate());
            ps.setString(2,v.getMonth());
            ps.setString(3, v.getName());
            ps.setString(4, v.getVDDSCircuitSearchCircuit());
            ps.setString(5, v.getVDDSWorkOrderSearchWorkOrder());
            ps.setString(6, v.getVDDSWSGetPVCChangeinfo());
            ps.setString(7, v.getVDDSWSGetCircuitAndPvcsIPSM());
            ps.setString(8, v.getVDDSTDMOrderApprove());
            ps.setString(9, v.getVDDSWorkOrderSearchWorkOrder());
            ps.setString(10, v.getVDDSTDMOrderProvisioningClickSubmitProvisionButton());
         
            i= ps.executeUpdate();
            ps.close();
            return i;
}
    
    public ArrayList<Vdds> displayVdds() throws ClassNotFoundException, SQLException{
        
        ArrayList<Vdds> list=new ArrayList<Vdds>();
        Connection con=DbConnection.getInstance().getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from vdds");
        while(rs.next()){
            Vdds d=new Vdds();
           d.setDate(rs.getString("date"));
           d.setMonth(rs.getString("month"));
           d.setName(rs.getString("name"));   
           d.setVDDSCircuitSearchCircuit("VDDS_Circuit_Search_Circuit");
           d.setVDDSWorkOrderSearchWorkOrder("VDDS_WorkOrder_Search_Work_Order");
           d.setVDDSWSGetPVCChangeinfo("VDDS_WS_Get_PVC_Changeinfo");
           d.setVDDSWSGetCircuitAndPvcsIPSM("VDDS_WS_GetCircuit_And_Pvcs_IPSM");
           d.setVDDSTDMOrderApprove("VDDS_TDM_Order_Approve");
           d.setVDDSTDMOrderProvisioningSearchWorkOrder("VDDS_TDM_Order_Provisioning_Search_WorkOrder");
           d.setVDDSTDMOrderProvisioningClickSubmitProvisionButton("VDDS_TDM_Order_Provisioning_Click_Submit_Provision_Button");
           d.setId(rs.getInt("id"));
            list.add(d);
        }
        return list;
    }
}

