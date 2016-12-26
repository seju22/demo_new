/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
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
    @NamedQuery(name = "Snm.findByDate", query = "SELECT s FROM Snm s WHERE s.date = :date"),
    @NamedQuery(name = "Snm.findByMonth", query = "SELECT s FROM Snm s WHERE s.month = :month"),
    @NamedQuery(name = "Snm.findByName", query = "SELECT s FROM Snm s WHERE s.name = :name"),
    @NamedQuery(name = "Snm.findBySNMAdvancedTrunkSearchSearchTrunks", query = "SELECT s FROM Snm s WHERE s.sNMAdvancedTrunkSearchSearchTrunks = :sNMAdvancedTrunkSearchSearchTrunks"),
    @NamedQuery(name = "Snm.findByProvisionFindPortsField", query = "SELECT s FROM Snm s WHERE s.provisionFindPortsField = :provisionFindPortsField"),
    @NamedQuery(name = "Snm.findByProvisionAssign", query = "SELECT s FROM Snm s WHERE s.provisionAssign = :provisionAssign"),
    @NamedQuery(name = "Snm.findBySNMCircuitViewModifyQuery", query = "SELECT s FROM Snm s WHERE s.sNMCircuitViewModifyQuery = :sNMCircuitViewModifyQuery"),
    @NamedQuery(name = "Snm.findBySNMNNIConnectionNewSearchNNI", query = "SELECT s FROM Snm s WHERE s.sNMNNIConnectionNewSearchNNI = :sNMNNIConnectionNewSearchNNI"),
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
    @Size(max = 30)
    @Column(name = "date")
    private String date;
    @Size(max = 30)
    @Column(name = "month")
    private String month;
    @Size(max = 20)
    @Column(name = "name")
    private String name;
    @Size(max = 20)
    @Column(name = "SNM_Advanced_Trunk_Search_Search_Trunks")
    private String sNMAdvancedTrunkSearchSearchTrunks;
    @Size(max = 20)
    @Column(name = "Provision_Find_Ports_Field")
    private String provisionFindPortsField;
    @Size(max = 20)
    @Column(name = "Provision_Assign")
    private String provisionAssign;
    @Size(max = 20)
    @Column(name = "SNM_Circuit_View_Modify_Query")
    private String sNMCircuitViewModifyQuery;
    @Size(max = 20)
    @Column(name = "SNM_NNIConnection_New_Search_NNI")
    private String sNMNNIConnectionNewSearchNNI;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSNMAdvancedTrunkSearchSearchTrunks() {
        return sNMAdvancedTrunkSearchSearchTrunks;
    }

    public void setSNMAdvancedTrunkSearchSearchTrunks(String sNMAdvancedTrunkSearchSearchTrunks) {
        this.sNMAdvancedTrunkSearchSearchTrunks = sNMAdvancedTrunkSearchSearchTrunks;
    }

    public String getProvisionFindPortsField() {
        return provisionFindPortsField;
    }

    public void setProvisionFindPortsField(String provisionFindPortsField) {
        this.provisionFindPortsField = provisionFindPortsField;
    }

    public String getProvisionAssign() {
        return provisionAssign;
    }

    public void setProvisionAssign(String provisionAssign) {
        this.provisionAssign = provisionAssign;
    }

    public String getSNMCircuitViewModifyQuery() {
        return sNMCircuitViewModifyQuery;
    }

    public void setSNMCircuitViewModifyQuery(String sNMCircuitViewModifyQuery) {
        this.sNMCircuitViewModifyQuery = sNMCircuitViewModifyQuery;
    }

    public String getSNMNNIConnectionNewSearchNNI() {
        return sNMNNIConnectionNewSearchNNI;
    }

    public void setSNMNNIConnectionNewSearchNNI(String sNMNNIConnectionNewSearchNNI) {
        this.sNMNNIConnectionNewSearchNNI = sNMNNIConnectionNewSearchNNI;
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
