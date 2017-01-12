/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MR
 */
@Entity
@Table(name = "ipsm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ipsm.findAll", query = "SELECT i FROM Ipsm i"),
    @NamedQuery(name = "Ipsm.findById", query = "SELECT i FROM Ipsm i WHERE i.id = :id"),
    @NamedQuery(name = "Ipsm.findByReldate", query = "SELECT i FROM Ipsm i WHERE i.reldate = :reldate"),
    @NamedQuery(name = "Ipsm.findByRelmonth", query = "SELECT i FROM Ipsm i WHERE i.relmonth = :relmonth"),
    @NamedQuery(name = "Ipsm.findByRelname", query = "SELECT i FROM Ipsm i WHERE i.relname = :relname"),
    @NamedQuery(name = "Ipsm.findByIPSMSITESelectCloudservicesClickSearch", query = "SELECT i FROM Ipsm i WHERE i.iPSMSITESelectCloudservicesClickSearch = :iPSMSITESelectCloudservicesClickSearch"),
    @NamedQuery(name = "Ipsm.findByIPSMSITESearchSitePartname", query = "SELECT i FROM Ipsm i WHERE i.iPSMSITESearchSitePartname = :iPSMSITESearchSitePartname"),
    @NamedQuery(name = "Ipsm.findByIPSMSITESearchCircuitid", query = "SELECT i FROM Ipsm i WHERE i.iPSMSITESearchCircuitid = :iPSMSITESearchCircuitid"),
    @NamedQuery(name = "Ipsm.findByIPSMVPNSelectCloudservicesClickSearch", query = "SELECT i FROM Ipsm i WHERE i.iPSMVPNSelectCloudservicesClickSearch = :iPSMVPNSelectCloudservicesClickSearch"),
    @NamedQuery(name = "Ipsm.findByIPSMWSUpdateSiteInfoInvoke", query = "SELECT i FROM Ipsm i WHERE i.iPSMWSUpdateSiteInfoInvoke = :iPSMWSUpdateSiteInfoInvoke")})
public class Ipsm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Rel_date")
    @Temporal(TemporalType.DATE)
    private Date reldate;
    @Size(max = 20)
    @Column(name = "Rel_month")
    private String relmonth;
    @Size(max = 20)
    @Column(name = "App_name")
    private String appname;

    @Size(max = 20)
    @Column(name = "IPSM_SITE_Select_Cloudservices_Click_Search")
    private String iPSMSITESelectCloudservicesClickSearch;
    @Size(max = 20)
    @Column(name = "IPSM_SITE_Search_Site_Partname")
    private String iPSMSITESearchSitePartname;
    @Size(max = 20)
    @Column(name = "IPSM_SITE_Search_Circuitid")
    private String iPSMSITESearchCircuitid;
    @Size(max = 20)
    @Column(name = "IPSM_VPN_Select_Cloudservices_Click_Search")
    private String iPSMVPNSelectCloudservicesClickSearch;
    @Size(max = 20)
    @Column(name = "IPSM_WS_UpdateSiteInfo_Invoke")
    private String iPSMWSUpdateSiteInfoInvoke;

    public Ipsm() {
    }

    public Ipsm(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getReldate() {
        return reldate;
    }

    public void setReldate(Date reldate) {
        this.reldate = reldate;
    }

    public String getRelmonth() {
        return relmonth;
    }

    public void setRelmonth(String relmonth) {
        this.relmonth = relmonth;
    }

    
    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getIPSMSITESelectCloudservicesClickSearch() {
        return iPSMSITESelectCloudservicesClickSearch;
    }

    public void setIPSMSITESelectCloudservicesClickSearch(String iPSMSITESelectCloudservicesClickSearch) {
        this.iPSMSITESelectCloudservicesClickSearch = iPSMSITESelectCloudservicesClickSearch;
    }

    public String getIPSMSITESearchSitePartname() {
        return iPSMSITESearchSitePartname;
    }

    public void setIPSMSITESearchSitePartname(String iPSMSITESearchSitePartname) {
        this.iPSMSITESearchSitePartname = iPSMSITESearchSitePartname;
    }

    public String getIPSMSITESearchCircuitid() {
        return iPSMSITESearchCircuitid;
    }

    public void setIPSMSITESearchCircuitid(String iPSMSITESearchCircuitid) {
        this.iPSMSITESearchCircuitid = iPSMSITESearchCircuitid;
    }

    public String getIPSMVPNSelectCloudservicesClickSearch() {
        return iPSMVPNSelectCloudservicesClickSearch;
    }

    public void setIPSMVPNSelectCloudservicesClickSearch(String iPSMVPNSelectCloudservicesClickSearch) {
        this.iPSMVPNSelectCloudservicesClickSearch = iPSMVPNSelectCloudservicesClickSearch;
    }

    public String getIPSMWSUpdateSiteInfoInvoke() {
        return iPSMWSUpdateSiteInfoInvoke;
    }

    public void setIPSMWSUpdateSiteInfoInvoke(String iPSMWSUpdateSiteInfoInvoke) {
        this.iPSMWSUpdateSiteInfoInvoke = iPSMWSUpdateSiteInfoInvoke;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ipsm)) {
            return false;
        }
        Ipsm other = (Ipsm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.bean.Ipsm[ id=" + id + " ]";
    }
    
}
