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
@Table(name = "demo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Demo.findAll", query = "SELECT d FROM Demo d"),
    @NamedQuery(name = "Demo.findById", query = "SELECT d FROM Demo d WHERE d.id = :id"),
    @NamedQuery(name = "Demo.findByDate", query = "SELECT d FROM Demo d WHERE d.date = :date"),
    @NamedQuery(name = "Demo.findByMonth", query = "SELECT d FROM Demo d WHERE d.month = :month"),
    @NamedQuery(name = "Demo.findByName", query = "SELECT d FROM Demo d WHERE d.name = :name"),
    @NamedQuery(name = "Demo.findByBGWTrns1", query = "SELECT d FROM Demo d WHERE d.bGWTrns1 = :bGWTrns1"),
    @NamedQuery(name = "Demo.findByBGWTrns2", query = "SELECT d FROM Demo d WHERE d.bGWTrns2 = :bGWTrns2"),
    @NamedQuery(name = "Demo.findByBGWTrns3", query = "SELECT d FROM Demo d WHERE d.bGWTrns3 = :bGWTrns3"),
    @NamedQuery(name = "Demo.findByBGWTrns4", query = "SELECT d FROM Demo d WHERE d.bGWTrns4 = :bGWTrns4"),
    @NamedQuery(name = "Demo.findByBGWTrns5", query = "SELECT d FROM Demo d WHERE d.bGWTrns5 = :bGWTrns5"),
    @NamedQuery(name = "Demo.findByBGWTrns6", query = "SELECT d FROM Demo d WHERE d.bGWTrns6 = :bGWTrns6"),
    @NamedQuery(name = "Demo.findByBGWTrns7", query = "SELECT d FROM Demo d WHERE d.bGWTrns7 = :bGWTrns7"),
    @NamedQuery(name = "Demo.findByBGWTrns8", query = "SELECT d FROM Demo d WHERE d.bGWTrns8 = :bGWTrns8"),
    @NamedQuery(name = "Demo.findByBGWTrns9", query = "SELECT d FROM Demo d WHERE d.bGWTrns9 = :bGWTrns9"),
    @NamedQuery(name = "Demo.findByBGWTrns10", query = "SELECT d FROM Demo d WHERE d.bGWTrns10 = :bGWTrns10"),
    @NamedQuery(name = "Demo.findByBGWTrns11", query = "SELECT d FROM Demo d WHERE d.bGWTrns11 = :bGWTrns11"),
    @NamedQuery(name = "Demo.findByBGWTrns12", query = "SELECT d FROM Demo d WHERE d.bGWTrns12 = :bGWTrns12"),
    @NamedQuery(name = "Demo.findByBGWTrns13", query = "SELECT d FROM Demo d WHERE d.bGWTrns13 = :bGWTrns13"),
    @NamedQuery(name = "Demo.findByBGWTrns14", query = "SELECT d FROM Demo d WHERE d.bGWTrns14 = :bGWTrns14"),
    @NamedQuery(name = "Demo.findByBGWTrns15", query = "SELECT d FROM Demo d WHERE d.bGWTrns15 = :bGWTrns15"),
    @NamedQuery(name = "Demo.findByBGWTrns16", query = "SELECT d FROM Demo d WHERE d.bGWTrns16 = :bGWTrns16"),
    @NamedQuery(name = "Demo.findByVDDSTrns1", query = "SELECT d FROM Demo d WHERE d.vDDSTrns1 = :vDDSTrns1"),
    @NamedQuery(name = "Demo.findByVDDSTrns2", query = "SELECT d FROM Demo d WHERE d.vDDSTrns2 = :vDDSTrns2"),
    @NamedQuery(name = "Demo.findByVDDSTrns3", query = "SELECT d FROM Demo d WHERE d.vDDSTrns3 = :vDDSTrns3"),
    @NamedQuery(name = "Demo.findByVDDSTrns4", query = "SELECT d FROM Demo d WHERE d.vDDSTrns4 = :vDDSTrns4"),
    @NamedQuery(name = "Demo.findByVDDSTrns5", query = "SELECT d FROM Demo d WHERE d.vDDSTrns5 = :vDDSTrns5"),
    @NamedQuery(name = "Demo.findByVDDSTrns6", query = "SELECT d FROM Demo d WHERE d.vDDSTrns6 = :vDDSTrns6"),
    @NamedQuery(name = "Demo.findByVDDSTrns7", query = "SELECT d FROM Demo d WHERE d.vDDSTrns7 = :vDDSTrns7"),
    @NamedQuery(name = "Demo.findByIPPSTrns1", query = "SELECT d FROM Demo d WHERE d.iPPSTrns1 = :iPPSTrns1"),
    @NamedQuery(name = "Demo.findByIPPSTrns2", query = "SELECT d FROM Demo d WHERE d.iPPSTrns2 = :iPPSTrns2"),
    @NamedQuery(name = "Demo.findByIPPSTrns3", query = "SELECT d FROM Demo d WHERE d.iPPSTrns3 = :iPPSTrns3"),
    @NamedQuery(name = "Demo.findByIPPSTrns4", query = "SELECT d FROM Demo d WHERE d.iPPSTrns4 = :iPPSTrns4"),
    @NamedQuery(name = "Demo.findByIPPSTrns5", query = "SELECT d FROM Demo d WHERE d.iPPSTrns5 = :iPPSTrns5"),
    @NamedQuery(name = "Demo.findBySNMTrns1", query = "SELECT d FROM Demo d WHERE d.sNMTrns1 = :sNMTrns1"),
    @NamedQuery(name = "Demo.findBySNMTrns2", query = "SELECT d FROM Demo d WHERE d.sNMTrns2 = :sNMTrns2"),
    @NamedQuery(name = "Demo.findBySNMTrns3", query = "SELECT d FROM Demo d WHERE d.sNMTrns3 = :sNMTrns3"),
    @NamedQuery(name = "Demo.findBySNMTrns4", query = "SELECT d FROM Demo d WHERE d.sNMTrns4 = :sNMTrns4"),
    @NamedQuery(name = "Demo.findBySNMTrns5", query = "SELECT d FROM Demo d WHERE d.sNMTrns5 = :sNMTrns5"),
    @NamedQuery(name = "Demo.findBySNMTrns6", query = "SELECT d FROM Demo d WHERE d.sNMTrns6 = :sNMTrns6"),
    @NamedQuery(name = "Demo.findBySNMTrns7", query = "SELECT d FROM Demo d WHERE d.sNMTrns7 = :sNMTrns7"),
    @NamedQuery(name = "Demo.findBySNMTrns8", query = "SELECT d FROM Demo d WHERE d.sNMTrns8 = :sNMTrns8")})
public class Demo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 20)
    @Column(name = "date")
    private String date;
    @Size(max = 20)
    @Column(name = "month")
    private String month;
    @Size(max = 20)
    @Column(name = "name")
    private String name;
    @Size(max = 20)
    @Column(name = "BGW_Trns_1")
    private String bGWTrns1;
    @Size(max = 20)
    @Column(name = "BGW_Trns_2")
    private String bGWTrns2;
    @Size(max = 20)
    @Column(name = "BGW_Trns_3")
    private String bGWTrns3;
    @Size(max = 20)
    @Column(name = "BGW_Trns_4")
    private String bGWTrns4;
    @Size(max = 20)
    @Column(name = "BGW_Trns_5")
    private String bGWTrns5;
    @Size(max = 20)
    @Column(name = "BGW_Trns_6")
    private String bGWTrns6;
    @Size(max = 20)
    @Column(name = "BGW_Trns_7")
    private String bGWTrns7;
    @Size(max = 20)
    @Column(name = "BGW_Trns_8")
    private String bGWTrns8;
    @Size(max = 20)
    @Column(name = "BGW_Trns_9")
    private String bGWTrns9;
    @Size(max = 20)
    @Column(name = "BGW_Trns_10")
    private String bGWTrns10;
    @Size(max = 20)
    @Column(name = "BGW_Trns_11")
    private String bGWTrns11;
    @Size(max = 20)
    @Column(name = "BGW_Trns_12")
    private String bGWTrns12;
    @Size(max = 20)
    @Column(name = "BGW_Trns_13")
    private String bGWTrns13;
    @Size(max = 20)
    @Column(name = "BGW_Trns_14")
    private String bGWTrns14;
    @Size(max = 20)
    @Column(name = "BGW_Trns_15")
    private String bGWTrns15;
    @Size(max = 20)
    @Column(name = "BGW_Trns_16")
    private String bGWTrns16;
    @Size(max = 20)
    @Column(name = "VDDS_Trns_1")
    private String vDDSTrns1;
    @Size(max = 20)
    @Column(name = "VDDS_Trns_2")
    private String vDDSTrns2;
    @Size(max = 20)
    @Column(name = "VDDS_Trns_3")
    private String vDDSTrns3;
    @Size(max = 20)
    @Column(name = "VDDS_Trns_4")
    private String vDDSTrns4;
    @Size(max = 20)
    @Column(name = "VDDS_Trns_5")
    private String vDDSTrns5;
    @Size(max = 20)
    @Column(name = "VDDS_Trns_6")
    private String vDDSTrns6;
    @Size(max = 20)
    @Column(name = "VDDS_Trns_7")
    private String vDDSTrns7;
    @Size(max = 20)
    @Column(name = "IPPS-Trns_1")
    private String iPPSTrns1;
    @Size(max = 20)
    @Column(name = "IPPS-Trns_2")
    private String iPPSTrns2;
    @Size(max = 20)
    @Column(name = "IPPS-Trns_3")
    private String iPPSTrns3;
    @Size(max = 20)
    @Column(name = "IPPS-Trns_4")
    private String iPPSTrns4;
    @Size(max = 20)
    @Column(name = "IPPS-Trns_5")
    private String iPPSTrns5;
    @Size(max = 20)
    @Column(name = "SNM_Trns_1")
    private String sNMTrns1;
    @Size(max = 20)
    @Column(name = "SNM_Trns_2")
    private String sNMTrns2;
    @Size(max = 20)
    @Column(name = "SNM_Trns_3")
    private String sNMTrns3;
    @Size(max = 20)
    @Column(name = "SNM_Trns_4")
    private String sNMTrns4;
    @Size(max = 20)
    @Column(name = "SNM_Trns_5")
    private String sNMTrns5;
    @Size(max = 20)
    @Column(name = "SNM_Trns_6")
    private String sNMTrns6;
    @Size(max = 20)
    @Column(name = "SNM_Trns_7")
    private String sNMTrns7;
    @Size(max = 20)
    @Column(name = "SNM_Trns_8")
    private String sNMTrns8;

    public Demo() {
    }

    public Demo(Integer id) {
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

    public String getBGWTrns1() {
        return bGWTrns1;
    }

    public void setBGWTrns1(String bGWTrns1) {
        this.bGWTrns1 = bGWTrns1;
    }

    public String getBGWTrns2() {
        return bGWTrns2;
    }

    public void setBGWTrns2(String bGWTrns2) {
        this.bGWTrns2 = bGWTrns2;
    }

    public String getBGWTrns3() {
        return bGWTrns3;
    }

    public void setBGWTrns3(String bGWTrns3) {
        this.bGWTrns3 = bGWTrns3;
    }

    public String getBGWTrns4() {
        return bGWTrns4;
    }

    public void setBGWTrns4(String bGWTrns4) {
        this.bGWTrns4 = bGWTrns4;
    }

    public String getBGWTrns5() {
        return bGWTrns5;
    }

    public void setBGWTrns5(String bGWTrns5) {
        this.bGWTrns5 = bGWTrns5;
    }

    public String getBGWTrns6() {
        return bGWTrns6;
    }

    public void setBGWTrns6(String bGWTrns6) {
        this.bGWTrns6 = bGWTrns6;
    }

    public String getBGWTrns7() {
        return bGWTrns7;
    }

    public void setBGWTrns7(String bGWTrns7) {
        this.bGWTrns7 = bGWTrns7;
    }

    public String getBGWTrns8() {
        return bGWTrns8;
    }

    public void setBGWTrns8(String bGWTrns8) {
        this.bGWTrns8 = bGWTrns8;
    }

    public String getBGWTrns9() {
        return bGWTrns9;
    }

    public void setBGWTrns9(String bGWTrns9) {
        this.bGWTrns9 = bGWTrns9;
    }

    public String getBGWTrns10() {
        return bGWTrns10;
    }

    public void setBGWTrns10(String bGWTrns10) {
        this.bGWTrns10 = bGWTrns10;
    }

    public String getBGWTrns11() {
        return bGWTrns11;
    }

    public void setBGWTrns11(String bGWTrns11) {
        this.bGWTrns11 = bGWTrns11;
    }

    public String getBGWTrns12() {
        return bGWTrns12;
    }

    public void setBGWTrns12(String bGWTrns12) {
        this.bGWTrns12 = bGWTrns12;
    }

    public String getBGWTrns13() {
        return bGWTrns13;
    }

    public void setBGWTrns13(String bGWTrns13) {
        this.bGWTrns13 = bGWTrns13;
    }

    public String getBGWTrns14() {
        return bGWTrns14;
    }

    public void setBGWTrns14(String bGWTrns14) {
        this.bGWTrns14 = bGWTrns14;
    }

    public String getBGWTrns15() {
        return bGWTrns15;
    }

    public void setBGWTrns15(String bGWTrns15) {
        this.bGWTrns15 = bGWTrns15;
    }

    public String getBGWTrns16() {
        return bGWTrns16;
    }

    public void setBGWTrns16(String bGWTrns16) {
        this.bGWTrns16 = bGWTrns16;
    }

    public String getVDDSTrns1() {
        return vDDSTrns1;
    }

    public void setVDDSTrns1(String vDDSTrns1) {
        this.vDDSTrns1 = vDDSTrns1;
    }

    public String getVDDSTrns2() {
        return vDDSTrns2;
    }

    public void setVDDSTrns2(String vDDSTrns2) {
        this.vDDSTrns2 = vDDSTrns2;
    }

    public String getVDDSTrns3() {
        return vDDSTrns3;
    }

    public void setVDDSTrns3(String vDDSTrns3) {
        this.vDDSTrns3 = vDDSTrns3;
    }

    public String getVDDSTrns4() {
        return vDDSTrns4;
    }

    public void setVDDSTrns4(String vDDSTrns4) {
        this.vDDSTrns4 = vDDSTrns4;
    }

    public String getVDDSTrns5() {
        return vDDSTrns5;
    }

    public void setVDDSTrns5(String vDDSTrns5) {
        this.vDDSTrns5 = vDDSTrns5;
    }

    public String getVDDSTrns6() {
        return vDDSTrns6;
    }

    public void setVDDSTrns6(String vDDSTrns6) {
        this.vDDSTrns6 = vDDSTrns6;
    }

    public String getVDDSTrns7() {
        return vDDSTrns7;
    }

    public void setVDDSTrns7(String vDDSTrns7) {
        this.vDDSTrns7 = vDDSTrns7;
    }

    public String getIPPSTrns1() {
        return iPPSTrns1;
    }

    public void setIPPSTrns1(String iPPSTrns1) {
        this.iPPSTrns1 = iPPSTrns1;
    }

    public String getIPPSTrns2() {
        return iPPSTrns2;
    }

    public void setIPPSTrns2(String iPPSTrns2) {
        this.iPPSTrns2 = iPPSTrns2;
    }

    public String getIPPSTrns3() {
        return iPPSTrns3;
    }

    public void setIPPSTrns3(String iPPSTrns3) {
        this.iPPSTrns3 = iPPSTrns3;
    }

    public String getIPPSTrns4() {
        return iPPSTrns4;
    }

    public void setIPPSTrns4(String iPPSTrns4) {
        this.iPPSTrns4 = iPPSTrns4;
    }

    public String getIPPSTrns5() {
        return iPPSTrns5;
    }

    public void setIPPSTrns5(String iPPSTrns5) {
        this.iPPSTrns5 = iPPSTrns5;
    }

    public String getSNMTrns1() {
        return sNMTrns1;
    }

    public void setSNMTrns1(String sNMTrns1) {
        this.sNMTrns1 = sNMTrns1;
    }

    public String getSNMTrns2() {
        return sNMTrns2;
    }

    public void setSNMTrns2(String sNMTrns2) {
        this.sNMTrns2 = sNMTrns2;
    }

    public String getSNMTrns3() {
        return sNMTrns3;
    }

    public void setSNMTrns3(String sNMTrns3) {
        this.sNMTrns3 = sNMTrns3;
    }

    public String getSNMTrns4() {
        return sNMTrns4;
    }

    public void setSNMTrns4(String sNMTrns4) {
        this.sNMTrns4 = sNMTrns4;
    }

    public String getSNMTrns5() {
        return sNMTrns5;
    }

    public void setSNMTrns5(String sNMTrns5) {
        this.sNMTrns5 = sNMTrns5;
    }

    public String getSNMTrns6() {
        return sNMTrns6;
    }

    public void setSNMTrns6(String sNMTrns6) {
        this.sNMTrns6 = sNMTrns6;
    }

    public String getSNMTrns7() {
        return sNMTrns7;
    }

    public void setSNMTrns7(String sNMTrns7) {
        this.sNMTrns7 = sNMTrns7;
    }

    public String getSNMTrns8() {
        return sNMTrns8;
    }

    public void setSNMTrns8(String sNMTrns8) {
        this.sNMTrns8 = sNMTrns8;
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
        if (!(object instanceof Demo)) {
            return false;
        }
        Demo other = (Demo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.bean.Demo[ id=" + id + " ]";
    }
    
}
