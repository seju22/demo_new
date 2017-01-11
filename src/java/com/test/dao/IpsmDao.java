/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.dao;

import com.test.bean.Ipsm;
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
public class IpsmDao {
       public int insert(Ipsm ipsm) throws ClassNotFoundException, SQLException {
        int i ;
        Connection con=DbConnection.getInstance().getConnection();
            String sql="insert into ipsm(Rel_date,Rel_month,Rel_name,IPSM_SITE_Select_Cloudservices_Click_Search,IPSM_SITE_Search_Site_Partname,IPSM_SITE_Search_Circuitid,IPSM_VPN_Select_Cloudservices_Click_Search,IPSM_WS_UpdateSiteInfo_Invoke) values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(ipsm.getReldate().getTime()));
            ps.setString(2,ipsm.getRelmonth());
            ps.setString(3,ipsm.getRelname());
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
           d.setReldate(rs.getDate("Rel_date"));
           d.setRelmonth(rs.getString("Rel_month"));
           d.setRelname(rs.getString("Rel_name"));      
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
       public ArrayList<Ipsm> displayIpsmGraph(String month, String date) throws ClassNotFoundException, SQLException{
        
        ArrayList<Ipsm> list=new ArrayList<Ipsm>();
        Connection con=DbConnection.getInstance().getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT Rel_date,Rel_name, SUM(IPSM_SITE_Select_Cloudservices_Click_Search) AS r1, SUM(IPSM_SITE_Search_Site_Partname) AS r2, SUM(IPSM_SITE_Search_Circuitid) AS r3, SUM(IPSM_VPN_Select_Cloudservices_Click_Search) AS r4, SUM(IPSM_WS_UpdateSiteInfo_Invoke) AS r5 FROM ipsm WHERE (Rel_date BETWEEN '"+date+"' AND DATE_ADD('"+date+"', INTERVAL 5 DAY)) AND Rel_month='"+month+"' GROUP BY DATE(Rel_date)");
        while(rs.next()){
            Ipsm d=new Ipsm();
            d.setIPSMSITESelectCloudservicesClickSearch(rs.getString("r1"));
            d.setIPSMSITESearchSitePartname(rs.getString("r2"));
            d.setIPSMSITESearchCircuitid(rs.getString("r3"));
            d.setIPSMVPNSelectCloudservicesClickSearch(rs.getString("r4")); 
            d.setIPSMWSUpdateSiteInfoInvoke(rs.getString("r5"));
            d.setReldate(rs.getDate("Rel_date"));
            System.out.print("IPSM------------"+rs.getString("r1"));
            list.add(d);
        }
        return list;
    }
}
