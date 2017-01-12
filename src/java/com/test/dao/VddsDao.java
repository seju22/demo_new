/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.dao;


import com.test.bean.Bgw;
import com.test.bean.Vdds;
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
public class VddsDao {
    public int insert(Vdds v) throws ClassNotFoundException, SQLException {
        int i ;
        Connection con=DbConnection.getInstance().getConnection();
            String sql="insert into vdds(Rel_date,Rel_month,App_name,VDDS_Circuit_Search_Circuit,VDDS_WorkOrder_Search_Work_Order,VDDS_WS_Get_PVC_Changeinfo,VDDS_WS_GetCircuit_And_Pvcs_IPSM,VDDS_TDM_Order_Approve,VDDS_TDM_Order_Provisioning_Search_WorkOrder) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps =con.prepareStatement(sql);
              ps.setDate(1, new java.sql.Date(v.getReldate().getTime()));
            ps.setString(2,v.getRelmonth());
            ps.setString(3, v.getAppname());
            ps.setString(4, v.getVDDSCircuitSearchCircuit());
            ps.setString(5, v.getVDDSWorkOrderSearchWorkOrder());
            ps.setString(6, v.getVDDSWSGetPVCChangeinfo());
            ps.setString(7, v.getVDDSWSGetCircuitAndPvcsIPSM());
            ps.setString(8, v.getVDDSTDMOrderApprove());
            ps.setString(9, v.getVDDSWorkOrderSearchWorkOrder());
//            ps.setString(10, v.getVDDSTDMOrderProvisioningClickSubmitProvisionButton());
         
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
           d.setReldate(rs.getDate("Rel_date"));
           d.setRelmonth(rs.getString("Rel_month"));
           d.setAppname(rs.getString("App_name"));    
           d.setVDDSCircuitSearchCircuit("VDDS_Circuit_Search_Circuit");
           d.setVDDSWorkOrderSearchWorkOrder("VDDS_WorkOrder_Search_Work_Order");
           d.setVDDSWSGetPVCChangeinfo("VDDS_WS_Get_PVC_Changeinfo");
           d.setVDDSWSGetCircuitAndPvcsIPSM("VDDS_WS_GetCircuit_And_Pvcs_IPSM");
           d.setVDDSTDMOrderApprove("VDDS_TDM_Order_Approve");
           d.setVDDSTDMOrderProvisioningSearchWorkOrder("VDDS_TDM_Order_Provisioning_Search_WorkOrder");
//           d.setVDDSTDMOrderProvisioningClickSubmitProvisionButton("VDDS_TDM_Order_Provisioning_Click_Submit_Provision_Button");
           d.setId(rs.getInt("id"));
            list.add(d);
        }
        return list;
    }
      public ArrayList<Vdds> displayVddsGraph(String month, String date, String days) throws ClassNotFoundException, SQLException{
        
        ArrayList<Vdds> list=new ArrayList<Vdds>();
        Connection con=DbConnection.getInstance().getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT Rel_date, SUM(VDDS_Circuit_Search_Circuit) AS r1, SUM(VDDS_WorkOrder_Search_Work_Order) AS r2, SUM(VDDS_WS_Get_PVC_Changeinfo) AS r3, SUM(VDDS_WS_GetCircuit_And_Pvcs_IPSM) AS r4, SUM(VDDS_TDM_Order_Approve) AS r5, SUM(VDDS_TDM_Order_Provisioning_Search_WorkOrder) AS r6 FROM vdds where (Rel_date BETWEEN '"+date+"' AND DATE_ADD('"+date+"', INTERVAL 5 DAY)) AND Rel_month='"+month+"' GROUP BY DATE(Rel_date)");
        while(rs.next()){
            Vdds v=new Vdds();
            v.setVDDSCircuitSearchCircuit(rs.getString("r1"));
            v.setVDDSWorkOrderSearchWorkOrder(rs.getString("r2"));
            v.setVDDSWSGetPVCChangeinfo(rs.getString("r3"));
            v.setVDDSWSGetCircuitAndPvcsIPSM(rs.getString("r4"));
            v.setVDDSTDMOrderApprove(rs.getString("r5"));
            v.setVDDSTDMOrderProvisioningSearchWorkOrder(rs.getString("r6"));
            v.setReldate(rs.getDate("Rel_date"));
//            v.setVDDSTDMOrderProvisioningClickSubmitProvisionButton(rs.getString("r7"));
            list.add(v);
        }
        return list;
    }
}


