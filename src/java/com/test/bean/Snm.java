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
@Table(name = "snm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Snm.findAll", query = "SELECT s FROM Snm s"),
    @NamedQuery(name = "Snm.findById", query = "SELECT s FROM Snm s WHERE s.id = :id"),
    @NamedQuery(name = "Snm.findByReldate", query = "SELECT s FROM Snm s WHERE s.reldate = :reldate"),
    @NamedQuery(name = "Snm.findByRelmonth", query = "SELECT s FROM Snm s WHERE s.relmonth = :relmonth"),
    @NamedQuery(name = "Snm.findByRelname", query = "SELECT s FROM Snm s WHERE s.relname = :relname"),
    @NamedQuery(name = "Snm.findBySNMAdvancedTrunkSearchSearchTrunks", query = "SELECT s FROM Snm s WHERE s.sNMAdvancedTrunkSearchSearchTrunks = :sNMAdvancedTrunkSearchSearchTrunks"),
    @NamedQuery(name = "Snm.findBySNMCircuitAssignProvisionFindPortsField", query = "SELECT s FROM Snm s WHERE s.sNMCircuitAssignProvisionFindPortsField = :sNMCircuitAssignProvisionFindPortsField"),
    @NamedQuery(name = "Snm.findBySNMCircuitAssignProvisionAssign", query = "SELECT s FROM Snm s WHERE s.sNMCircuitAssignProvisionAssign = :sNMCircuitAssignProvisionAssign"),
    @NamedQuery(name = "Snm.findBySNMCircuitViewModifyQuery", query = "SELECT s FROM Snm s WHERE s.sNMCircuitViewModifyQuery = :sNMCircuitViewModifyQuery"),
    @NamedQuery(name = "Snm.findBySNMWSfindAccessCicuitCapacityAtMultipleSites", query = "SELECT s FROM Snm s WHERE s.sNMWSfindAccessCicuitCapacityAtMultipleSites = :sNMWSfindAccessCicuitCapacityAtMultipleSites"),
    @NamedQuery(name = "Snm.findBySNMWSfindPathCapacity", query = "SELECT s FROM Snm s WHERE s.sNMWSfindPathCapacity = :sNMWSfindPathCapacity"),
    @NamedQuery(name = "Snm.findBySNMWSgetNNICapacityFromSNM", query = "SELECT s FROM Snm s WHERE s.sNMWSgetNNICapacityFromSNM = :sNMWSgetNNICapacityFromSNM")})
public class Snm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Rel_date")
    @Temporal(TemporalType.DATE)
    private Date reldate;
    @Size(max = 30)
    @Column(name = "Rel_month")
    private String relmonth;
    @Size(max = 20)
    @Column(name = "Rel_name")
    private String relname;
    @Size(max = 20)
    @Column(name = "SNM_Advanced_Trunk_Search_Search_Trunks")
    private String sNMAdvancedTrunkSearchSearchTrunks;
    @Size(max = 20)
    @Column(name = "SNM_Circuit_Assign_Provision_Find_Ports_Field")
    private String sNMCircuitAssignProvisionFindPortsField;
    @Size(max = 20)
    @Column(name = "SNM_Circuit_Assign_Provision_Assign")
    private String sNMCircuitAssignProvisionAssign;
    @Size(max = 20)
    @Column(name = "SNM_Circuit_View_Modify_Query")
    private String sNMCircuitViewModifyQuery;
    @Size(max = 20)
    @Column(name = "SNM_WS_find_Access_Cicuit_Capacity_At_Multiple_Sites")
    private String sNMWSfindAccessCicuitCapacityAtMultipleSites;
    @Size(max = 20)
    @Column(name = "SNM_WS_find_Path_Capacity")
    private String sNMWSfindPathCapacity;
    @Size(max = 20)
    @Column(name = "SNM_WS_get_NNICapacity_From_SNM")
    private String sNMWSgetNNICapacityFromSNM;

    public Snm() {
    }

    public Snm(Integer id) {
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

    public String getRelname() {
        return relname;
    }

    public void setRelname(String relname) {
        this.relname = relname;
    }

    public String getSNMAdvancedTrunkSearchSearchTrunks() {
        return sNMAdvancedTrunkSearchSearchTrunks;
    }

    public void setSNMAdvancedTrunkSearchSearchTrunks(String sNMAdvancedTrunkSearchSearchTrunks) {
        this.sNMAdvancedTrunkSearchSearchTrunks = sNMAdvancedTrunkSearchSearchTrunks;
    }

    public String getSNMCircuitAssignProvisionFindPortsField() {
        return sNMCircuitAssignProvisionFindPortsField;
    }

    public void setSNMCircuitAssignProvisionFindPortsField(String sNMCircuitAssignProvisionFindPortsField) {
        this.sNMCircuitAssignProvisionFindPortsField = sNMCircuitAssignProvisionFindPortsField;
    }

    public String getSNMCircuitAssignProvisionAssign() {
        return sNMCircuitAssignProvisionAssign;
    }

    public void setSNMCircuitAssignProvisionAssign(String sNMCircuitAssignProvisionAssign) {
        this.sNMCircuitAssignProvisionAssign = sNMCircuitAssignProvisionAssign;
    }

    public String getSNMCircuitViewModifyQuery() {
        return sNMCircuitViewModifyQuery;
    }

    public void setSNMCircuitViewModifyQuery(String sNMCircuitViewModifyQuery) {
        this.sNMCircuitViewModifyQuery = sNMCircuitViewModifyQuery;
    }

    public String getSNMWSfindAccessCicuitCapacityAtMultipleSites() {
        return sNMWSfindAccessCicuitCapacityAtMultipleSites;
    }

    public void setSNMWSfindAccessCicuitCapacityAtMultipleSites(String sNMWSfindAccessCicuitCapacityAtMultipleSites) {
        this.sNMWSfindAccessCicuitCapacityAtMultipleSites = sNMWSfindAccessCicuitCapacityAtMultipleSites;
    }

    public String getSNMWSfindPathCapacity() {
        return sNMWSfindPathCapacity;
    }

    public void setSNMWSfindPathCapacity(String sNMWSfindPathCapacity) {
        this.sNMWSfindPathCapacity = sNMWSfindPathCapacity;
    }

    public String getSNMWSgetNNICapacityFromSNM() {
        return sNMWSgetNNICapacityFromSNM;
    }

    public void setSNMWSgetNNICapacityFromSNM(String sNMWSgetNNICapacityFromSNM) {
        this.sNMWSgetNNICapacityFromSNM = sNMWSgetNNICapacityFromSNM;
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
        if (!(object instanceof Snm)) {
            return false;
        }
        Snm other = (Snm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.bean.Snm[ id=" + id + " ]";
    }
    
}
