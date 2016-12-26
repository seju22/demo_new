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
@Table(name = "vdds")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vdds.findAll", query = "SELECT v FROM Vdds v"),
    @NamedQuery(name = "Vdds.findById", query = "SELECT v FROM Vdds v WHERE v.id = :id"),
    @NamedQuery(name = "Vdds.findByDate", query = "SELECT v FROM Vdds v WHERE v.date = :date"),
    @NamedQuery(name = "Vdds.findByMonth", query = "SELECT v FROM Vdds v WHERE v.month = :month"),
    @NamedQuery(name = "Vdds.findByName", query = "SELECT v FROM Vdds v WHERE v.name = :name"),
    @NamedQuery(name = "Vdds.findByVDDSCircuitSearchCircuit", query = "SELECT v FROM Vdds v WHERE v.vDDSCircuitSearchCircuit = :vDDSCircuitSearchCircuit"),
    @NamedQuery(name = "Vdds.findByVDDSWorkOrderSearchWorkOrder", query = "SELECT v FROM Vdds v WHERE v.vDDSWorkOrderSearchWorkOrder = :vDDSWorkOrderSearchWorkOrder"),
    @NamedQuery(name = "Vdds.findByVDDSWSGetPVCChangeinfo", query = "SELECT v FROM Vdds v WHERE v.vDDSWSGetPVCChangeinfo = :vDDSWSGetPVCChangeinfo"),
    @NamedQuery(name = "Vdds.findByVDDSWSGetCircuitAndPvcsIPSM", query = "SELECT v FROM Vdds v WHERE v.vDDSWSGetCircuitAndPvcsIPSM = :vDDSWSGetCircuitAndPvcsIPSM"),
    @NamedQuery(name = "Vdds.findByVDDSTDMOrderApprove", query = "SELECT v FROM Vdds v WHERE v.vDDSTDMOrderApprove = :vDDSTDMOrderApprove"),
    @NamedQuery(name = "Vdds.findByVDDSTDMOrderProvisioningSearchWorkOrder", query = "SELECT v FROM Vdds v WHERE v.vDDSTDMOrderProvisioningSearchWorkOrder = :vDDSTDMOrderProvisioningSearchWorkOrder"),
    @NamedQuery(name = "Vdds.findByVDDSTDMOrderProvisioningClickSubmitProvisionButton", query = "SELECT v FROM Vdds v WHERE v.vDDSTDMOrderProvisioningClickSubmitProvisionButton = :vDDSTDMOrderProvisioningClickSubmitProvisionButton")})
public class Vdds implements Serializable {
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
    @Column(name = "VDDS_Circuit_Search_Circuit")
    private String vDDSCircuitSearchCircuit;
    @Size(max = 20)
    @Column(name = "VDDS_WorkOrder_Search_Work_Order")
    private String vDDSWorkOrderSearchWorkOrder;
    @Size(max = 20)
    @Column(name = "VDDS_WS_Get_PVC_Changeinfo")
    private String vDDSWSGetPVCChangeinfo;
    @Size(max = 20)
    @Column(name = "VDDS_WS_GetCircuit_And_Pvcs_IPSM")
    private String vDDSWSGetCircuitAndPvcsIPSM;
    @Size(max = 20)
    @Column(name = "VDDS_TDM_Order_Approve")
    private String vDDSTDMOrderApprove;
    @Size(max = 20)
    @Column(name = "VDDS_TDM_Order_Provisioning_Search_WorkOrder")
    private String vDDSTDMOrderProvisioningSearchWorkOrder;
    @Size(max = 20)
    @Column(name = "VDDS_TDM_Order_Provisioning_Click_Submit_Provision_Button")
    private String vDDSTDMOrderProvisioningClickSubmitProvisionButton;

    public Vdds() {
    }

    public Vdds(Integer id) {
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

    public String getVDDSCircuitSearchCircuit() {
        return vDDSCircuitSearchCircuit;
    }

    public void setVDDSCircuitSearchCircuit(String vDDSCircuitSearchCircuit) {
        this.vDDSCircuitSearchCircuit = vDDSCircuitSearchCircuit;
    }

    public String getVDDSWorkOrderSearchWorkOrder() {
        return vDDSWorkOrderSearchWorkOrder;
    }

    public void setVDDSWorkOrderSearchWorkOrder(String vDDSWorkOrderSearchWorkOrder) {
        this.vDDSWorkOrderSearchWorkOrder = vDDSWorkOrderSearchWorkOrder;
    }

    public String getVDDSWSGetPVCChangeinfo() {
        return vDDSWSGetPVCChangeinfo;
    }

    public void setVDDSWSGetPVCChangeinfo(String vDDSWSGetPVCChangeinfo) {
        this.vDDSWSGetPVCChangeinfo = vDDSWSGetPVCChangeinfo;
    }

    public String getVDDSWSGetCircuitAndPvcsIPSM() {
        return vDDSWSGetCircuitAndPvcsIPSM;
    }

    public void setVDDSWSGetCircuitAndPvcsIPSM(String vDDSWSGetCircuitAndPvcsIPSM) {
        this.vDDSWSGetCircuitAndPvcsIPSM = vDDSWSGetCircuitAndPvcsIPSM;
    }

    public String getVDDSTDMOrderApprove() {
        return vDDSTDMOrderApprove;
    }

    public void setVDDSTDMOrderApprove(String vDDSTDMOrderApprove) {
        this.vDDSTDMOrderApprove = vDDSTDMOrderApprove;
    }

    public String getVDDSTDMOrderProvisioningSearchWorkOrder() {
        return vDDSTDMOrderProvisioningSearchWorkOrder;
    }

    public void setVDDSTDMOrderProvisioningSearchWorkOrder(String vDDSTDMOrderProvisioningSearchWorkOrder) {
        this.vDDSTDMOrderProvisioningSearchWorkOrder = vDDSTDMOrderProvisioningSearchWorkOrder;
    }

    public String getVDDSTDMOrderProvisioningClickSubmitProvisionButton() {
        return vDDSTDMOrderProvisioningClickSubmitProvisionButton;
    }

    public void setVDDSTDMOrderProvisioningClickSubmitProvisionButton(String vDDSTDMOrderProvisioningClickSubmitProvisionButton) {
        this.vDDSTDMOrderProvisioningClickSubmitProvisionButton = vDDSTDMOrderProvisioningClickSubmitProvisionButton;
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
        if (!(object instanceof Vdds)) {
            return false;
        }
        Vdds other = (Vdds) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.bean.Vdds[ id=" + id + " ]";
    }
    
}
