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
@Table(name = "bgw")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bgw.findAll", query = "SELECT b FROM Bgw b"),
    @NamedQuery(name = "Bgw.findById", query = "SELECT b FROM Bgw b WHERE b.id = :id"),
    @NamedQuery(name = "Bgw.findByReldate", query = "SELECT b FROM Bgw b WHERE b.reldate = :reldate"),
    @NamedQuery(name = "Bgw.findByRelmonth", query = "SELECT b FROM Bgw b WHERE b.relmonth = :relmonth"),
    @NamedQuery(name = "Bgw.findByRelname", query = "SELECT b FROM Bgw b WHERE b.relname = :relname"),
    @NamedQuery(name = "Bgw.findByBGWOpenEquipmentPage", query = "SELECT b FROM Bgw b WHERE b.bGWOpenEquipmentPage = :bGWOpenEquipmentPage"),
    @NamedQuery(name = "Bgw.findByBGWOpenAddAislePage", query = "SELECT b FROM Bgw b WHERE b.bGWOpenAddAislePage = :bGWOpenAddAislePage"),
    @NamedQuery(name = "Bgw.findByBGWLoadRackDetails", query = "SELECT b FROM Bgw b WHERE b.bGWLoadRackDetails = :bGWLoadRackDetails"),
    @NamedQuery(name = "Bgw.findByBGWPathSelectPath", query = "SELECT b FROM Bgw b WHERE b.bGWPathSelectPath = :bGWPathSelectPath"),
    @NamedQuery(name = "Bgw.findByBGWPathOpenCircuitIdDetails", query = "SELECT b FROM Bgw b WHERE b.bGWPathOpenCircuitIdDetails = :bGWPathOpenCircuitIdDetails"),
    @NamedQuery(name = "Bgw.findByBGWPathOpenCircuitViewPage", query = "SELECT b FROM Bgw b WHERE b.bGWPathOpenCircuitViewPage = :bGWPathOpenCircuitViewPage"),
    @NamedQuery(name = "Bgw.findByBGWPathOpenPrintViewPage", query = "SELECT b FROM Bgw b WHERE b.bGWPathOpenPrintViewPage = :bGWPathOpenPrintViewPage"),
    @NamedQuery(name = "Bgw.findByBGWPathOpenCircuitPremisesPage", query = "SELECT b FROM Bgw b WHERE b.bGWPathOpenCircuitPremisesPage = :bGWPathOpenCircuitPremisesPage"),
    @NamedQuery(name = "Bgw.findByBGWPathClickModify", query = "SELECT b FROM Bgw b WHERE b.bGWPathClickModify = :bGWPathClickModify"),
    @NamedQuery(name = "Bgw.findByBGWSiteOpenAddNewSitePage", query = "SELECT b FROM Bgw b WHERE b.bGWSiteOpenAddNewSitePage = :bGWSiteOpenAddNewSitePage"),
    @NamedQuery(name = "Bgw.findByBGWViewOrderOpenViewOrderPage", query = "SELECT b FROM Bgw b WHERE b.bGWViewOrderOpenViewOrderPage = :bGWViewOrderOpenViewOrderPage"),
    @NamedQuery(name = "Bgw.findByBGWViewOrderOpenDetailsPage", query = "SELECT b FROM Bgw b WHERE b.bGWViewOrderOpenDetailsPage = :bGWViewOrderOpenDetailsPage"),
    @NamedQuery(name = "Bgw.findByBGWViewOrderOpenAuditsTab", query = "SELECT b FROM Bgw b WHERE b.bGWViewOrderOpenAuditsTab = :bGWViewOrderOpenAuditsTab"),
    @NamedQuery(name = "Bgw.findByBGWViewOrderOpenInterfaceActivityTab", query = "SELECT b FROM Bgw b WHERE b.bGWViewOrderOpenInterfaceActivityTab = :bGWViewOrderOpenInterfaceActivityTab"),
    @NamedQuery(name = "Bgw.findByBGWSearchTaskRecord", query = "SELECT b FROM Bgw b WHERE b.bGWSearchTaskRecord = :bGWSearchTaskRecord"),
    @NamedQuery(name = "Bgw.findByBGWSearchTaskOpenTaskDetailPage", query = "SELECT b FROM Bgw b WHERE b.bGWSearchTaskOpenTaskDetailPage = :bGWSearchTaskOpenTaskDetailPage")})
public class Bgw implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Test_date")
    @Temporal(TemporalType.DATE)
    private Date reldate;
    @Size(max = 20)
    @Column(name = "Rel_month")
    private String relmonth;
    @Size(max = 30)
    @Column(name = "App_name")
    private String appname;

    @Size(max = 30)
    @Column(name = "BGW_Open_Equipment_Page")
    private String bGWOpenEquipmentPage;
    @Size(max = 30)
    @Column(name = "BGW_Open_Add_Aisle_Page")
    private String bGWOpenAddAislePage;
    @Size(max = 30)
    @Column(name = "BGW_Load_Rack_Details")
    private String bGWLoadRackDetails;
    @Size(max = 30)
    @Column(name = "BGW_Path_Select_Path")
    private String bGWPathSelectPath;
    @Size(max = 30)
    @Column(name = "BGW_Path_Open_CircuitId_Details")
    private String bGWPathOpenCircuitIdDetails;
    @Size(max = 30)
    @Column(name = "BGW_Path_Open_Circuit_View_Page")
    private String bGWPathOpenCircuitViewPage;
    @Size(max = 30)
    @Column(name = "BGW_Path_Open_Print_View_Page")
    private String bGWPathOpenPrintViewPage;
    @Size(max = 30)
    @Column(name = "BGW_Path_Open_Circuit_Premises_Page")
    private String bGWPathOpenCircuitPremisesPage;
    @Size(max = 30)
    @Column(name = "BGW_Path_Click_Modify")
    private String bGWPathClickModify;
    @Size(max = 30)
    @Column(name = "BGW_Site_Open_Add_New_Site_Page")
    private String bGWSiteOpenAddNewSitePage;
    @Size(max = 30)
    @Column(name = "BGW_View_Order_OpenView_Order_Page")
    private String bGWViewOrderOpenViewOrderPage;
    @Size(max = 20)
    @Column(name = "BGW_View_Order_Open_Details_Page")
    private String bGWViewOrderOpenDetailsPage;
    @Size(max = 30)
    @Column(name = "BGW_View_Order_Open_Audits_Tab")
    private String bGWViewOrderOpenAuditsTab;
    @Size(max = 30)
    @Column(name = "BGW_View_Order_Open_Interface_Activity_Tab")
    private String bGWViewOrderOpenInterfaceActivityTab;
    @Size(max = 30)
    @Column(name = "BGW_Search_Task_Record")
    private String bGWSearchTaskRecord;
    @Size(max = 30)
    @Column(name = "BGW_Search_Task_Open_Task_Detail_Page")
    private String bGWSearchTaskOpenTaskDetailPage;
    @Column(name = "BGW_Search_View_Order_Open_SNC_CC_Info")
    private String bGWSearchViewOrderOpenSncCcInfo;
    @Column(name = "BGW_Search_View_Order_Click_Circuit_Id_Hyperlink")
    private String bGWSearchViewOrderClickCircuitIdHyperlink;

    
    public Bgw() {
    }

    public Bgw(Integer id) {
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

    public String getBGWOpenEquipmentPage() {
        return bGWOpenEquipmentPage;
    }

    public void setBGWOpenEquipmentPage(String bGWOpenEquipmentPage) {
        this.bGWOpenEquipmentPage = bGWOpenEquipmentPage;
    }

    public String getBGWOpenAddAislePage() {
        return bGWOpenAddAislePage;
    }

    public void setBGWOpenAddAislePage(String bGWOpenAddAislePage) {
        this.bGWOpenAddAislePage = bGWOpenAddAislePage;
    }

    public String getBGWLoadRackDetails() {
        return bGWLoadRackDetails;
    }

    public void setBGWLoadRackDetails(String bGWLoadRackDetails) {
        this.bGWLoadRackDetails = bGWLoadRackDetails;
    }

    public String getBGWPathSelectPath() {
        return bGWPathSelectPath;
    }

    public void setBGWPathSelectPath(String bGWPathSelectPath) {
        this.bGWPathSelectPath = bGWPathSelectPath;
    }

    public String getBGWPathOpenCircuitIdDetails() {
        return bGWPathOpenCircuitIdDetails;
    }

    public void setBGWPathOpenCircuitIdDetails(String bGWPathOpenCircuitIdDetails) {
        this.bGWPathOpenCircuitIdDetails = bGWPathOpenCircuitIdDetails;
    }

    public String getBGWPathOpenCircuitViewPage() {
        return bGWPathOpenCircuitViewPage;
    }

    public void setBGWPathOpenCircuitViewPage(String bGWPathOpenCircuitViewPage) {
        this.bGWPathOpenCircuitViewPage = bGWPathOpenCircuitViewPage;
    }

    public String getBGWPathOpenPrintViewPage() {
        return bGWPathOpenPrintViewPage;
    }

    public void setBGWPathOpenPrintViewPage(String bGWPathOpenPrintViewPage) {
        this.bGWPathOpenPrintViewPage = bGWPathOpenPrintViewPage;
    }

    public String getBGWPathOpenCircuitPremisesPage() {
        return bGWPathOpenCircuitPremisesPage;
    }

    public void setBGWPathOpenCircuitPremisesPage(String bGWPathOpenCircuitPremisesPage) {
        this.bGWPathOpenCircuitPremisesPage = bGWPathOpenCircuitPremisesPage;
    }

    public String getBGWPathClickModify() {
        return bGWPathClickModify;
    }

    public void setBGWPathClickModify(String bGWPathClickModify) {
        this.bGWPathClickModify = bGWPathClickModify;
    }

    public String getBGWSiteOpenAddNewSitePage() {
        return bGWSiteOpenAddNewSitePage;
    }

    public void setBGWSiteOpenAddNewSitePage(String bGWSiteOpenAddNewSitePage) {
        this.bGWSiteOpenAddNewSitePage = bGWSiteOpenAddNewSitePage;
    }

    public String getBGWViewOrderOpenViewOrderPage() {
        return bGWViewOrderOpenViewOrderPage;
    }

    public void setBGWViewOrderOpenViewOrderPage(String bGWViewOrderOpenViewOrderPage) {
        this.bGWViewOrderOpenViewOrderPage = bGWViewOrderOpenViewOrderPage;
    }

    public String getBGWViewOrderOpenDetailsPage() {
        return bGWViewOrderOpenDetailsPage;
    }

    public void setBGWViewOrderOpenDetailsPage(String bGWViewOrderOpenDetailsPage) {
        this.bGWViewOrderOpenDetailsPage = bGWViewOrderOpenDetailsPage;
    }

    public String getBGWViewOrderOpenAuditsTab() {
        return bGWViewOrderOpenAuditsTab;
    }

    public void setBGWViewOrderOpenAuditsTab(String bGWViewOrderOpenAuditsTab) {
        this.bGWViewOrderOpenAuditsTab = bGWViewOrderOpenAuditsTab;
    }

    public String getBGWViewOrderOpenInterfaceActivityTab() {
        return bGWViewOrderOpenInterfaceActivityTab;
    }

    public void setBGWViewOrderOpenInterfaceActivityTab(String bGWViewOrderOpenInterfaceActivityTab) {
        this.bGWViewOrderOpenInterfaceActivityTab = bGWViewOrderOpenInterfaceActivityTab;
    }

    public String getBGWSearchTaskRecord() {
        return bGWSearchTaskRecord;
    }

    public void setBGWSearchTaskRecord(String bGWSearchTaskRecord) {
        this.bGWSearchTaskRecord = bGWSearchTaskRecord;
    }

    public String getBGWSearchTaskOpenTaskDetailPage() {
        return bGWSearchTaskOpenTaskDetailPage;
    }

    public void setBGWSearchTaskOpenTaskDetailPage(String bGWSearchTaskOpenTaskDetailPage) {
        this.bGWSearchTaskOpenTaskDetailPage = bGWSearchTaskOpenTaskDetailPage;
    }
    
    public String getbGWSearchViewOrderOpenSncCcInfo() {
        return bGWSearchViewOrderOpenSncCcInfo;
    }

    public void setbGWSearchViewOrderOpenSncCcInfo(String bGWSearchViewOrderOpenSncCcInfo) {
        this.bGWSearchViewOrderOpenSncCcInfo = bGWSearchViewOrderOpenSncCcInfo;
    }

    public String getbGWSearchViewOrderClickCircuitIdHyperlink() {
        return bGWSearchViewOrderClickCircuitIdHyperlink;
    }

    public void setbGWSearchViewOrderClickCircuitIdHyperlink(String bGWSearchViewOrderClickCircuitIdHyperlink) {
        this.bGWSearchViewOrderClickCircuitIdHyperlink = bGWSearchViewOrderClickCircuitIdHyperlink;
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
        if (!(object instanceof Bgw)) {
            return false;
        }
        Bgw other = (Bgw) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.bean.Bgw[ id=" + id + " ]";
    }
    
}
