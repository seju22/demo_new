/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.dao;

import com.test.bean.Ipsm;
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
public class IpsmDao {
       public int insert(Ipsm ipsm) throws ClassNotFoundException, SQLException {
        int i ;
        Connection con=DbConnection.getInstance().getConnection();
            String sql="insert into ipsm(date,month,name,IPSM_SITE_Select_Cloudservices_Click_Search,IPSM_SITE_Search_Site_Partname,IPSM_SITE_Search_Circuitid,IPSM_VPN_Select_Cloudservices_Click_Search,IPSM_WS_UpdateSiteInfo_Invoke) values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,ipsm.getDate());
            ps.setString(2,ipsm.getMonth());
            ps.setString(3, ipsm.getName());
            ps.setString(4, ipsm.getIPSMSITESelectCloudservicesClickSearch());
            ps.setString(5, ipsm.getIPSMSITESearchSitePartname());
            ps.setString(6, ipsm.getIPSMSITESearchCircuitid());
            ps.setString(7, ipsm.getIPSMVPNSelectCloudservicesClickSearch());
            ps.setString(8, ipsm.getIPSMWSUpdateSiteInfoInvoke());
         
            i= ps.executeUpdate();
            ps.close();
            return i;
}
       
       public ArrayList<Ipsm> displayIpsm() throws ClassNotFoundException, SQLException{
        
        ArrayList<Ipsm> list=new ArrayList<Ipsm>();
        Connection con=DbConnection.getInstance().getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from ipsm");
        while(rs.next()){
            Ipsm d=new Ipsm();
           d.setDate(rs.getString("date"));
           d.setMonth(rs.getString("month"));
           d.setName(rs.getString("name"));      
           d.setIPSMSITESelectCloudservicesClickSearch("IPSM_SITE_Select_Cloudservices_Click_Search");
           d.setIPSMSITESearchSitePartname("IPSM_SITE_Search_Site_Partname");
           d.setIPSMSITESearchCircuitid("IPSM_SITE_Search_Circuitid");
           d.setIPSMVPNSelectCloudservicesClickSearch("IPSM_VPN_Select_Cloudservices_Click_Search");
           d.setIPSMWSUpdateSiteInfoInvoke("IPSM_WS_UpdateSiteInfo_Invoke");
           d.setId(rs.getInt("id"));
            list.add(d);
        }
        return list;
    }
}
