/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "workingtime")
@NamedQueries({
    @NamedQuery(name = "Workingtime.findAll", query = "SELECT w FROM Workingtime w")})
public class Workingtime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "WorkingTimeId")
    private Integer workingTimeId;
    @Basic(optional = false)
    @Column(name = "WokingDate")
    @Temporal(TemporalType.DATE)
    private Date wokingDate;
    @Basic(optional = false)
    @Column(name = "FirstCheckin")
    private String firstCheckin;
    @Basic(optional = false)
    @Column(name = "LastCheckout")
    private String lastCheckout;
    @Basic(optional = false)
    @Column(name = "EarlyTime")
    private int earlyTime;
    @Basic(optional = false)
    @Column(name = "LateTime")
    private int lateTime;
    @Basic(optional = false)
    @Lob
    @Column(name = "TotalWorkingTime")
    private String totalWorkingTime;
    @Basic(optional = false)
    @Column(name = "OvertimeTotal")
    private int overtimeTotal;
    @Basic(optional = false)
    @Column(name = "OvernightTotal")
    private int overnightTotal;
    @Column(name = "CreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "UpdatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
    @Column(name = "CreatedBy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdBy;
    @Column(name = "UpdatedBy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedBy;
    @JoinColumn(name = "EmployeeId", referencedColumnName = "EmployeeId")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Employee employee;

    public Workingtime() {
    }

    public Workingtime(Integer workingTimeId) {
        this.workingTimeId = workingTimeId;
    }

    public Workingtime(Integer workingTimeId, Date wokingDate, String firstCheckin, String lastCheckout, int earlyTime, int lateTime, String totalWorkingTime, int overtimeTotal, int overnightTotal) {
        this.workingTimeId = workingTimeId;
        this.wokingDate = wokingDate;
        this.firstCheckin = firstCheckin;
        this.lastCheckout = lastCheckout;
        this.earlyTime = earlyTime;
        this.lateTime = lateTime;
        this.totalWorkingTime = totalWorkingTime;
        this.overtimeTotal = overtimeTotal;
        this.overnightTotal = overnightTotal;
    }

    public Integer getWorkingTimeId() {
        return workingTimeId;
    }

    public void setWorkingTimeId(Integer workingTimeId) {
        this.workingTimeId = workingTimeId;
    }

    public Date getWokingDate() {
        return wokingDate;
    }

    public void setWokingDate(Date wokingDate) {
        this.wokingDate = wokingDate;
    }

    public String getFirstCheckin() {
        return firstCheckin;
    }

    public void setFirstCheckin(String firstCheckin) {
        this.firstCheckin = firstCheckin;
    }

    public String getLastCheckout() {
        return lastCheckout;
    }

    public void setLastCheckout(String lastCheckout) {
        this.lastCheckout = lastCheckout;
    }

    public int getEarlyTime() {
        return earlyTime;
    }

    public void setEarlyTime(int earlyTime) {
        this.earlyTime = earlyTime;
    }

    public int getLateTime() {
        return lateTime;
    }

    public void setLateTime(int lateTime) {
        this.lateTime = lateTime;
    }

    public String getTotalWorkingTime() {
        return totalWorkingTime;
    }

    public void setTotalWorkingTime(String totalWorkingTime) {
        this.totalWorkingTime = totalWorkingTime;
    }

    public int getOvertimeTotal() {
        return overtimeTotal;
    }

    public void setOvertimeTotal(int overtimeTotal) {
        this.overtimeTotal = overtimeTotal;
    }

    public int getOvernightTotal() {
        return overnightTotal;
    }

    public void setOvernightTotal(int overnightTotal) {
        this.overnightTotal = overnightTotal;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Date createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Date updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workingTimeId != null ? workingTimeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Workingtime)) {
            return false;
        }
        Workingtime other = (Workingtime) object;
        if ((this.workingTimeId == null && other.workingTimeId != null) || (this.workingTimeId != null && !this.workingTimeId.equals(other.workingTimeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Workingtime[ workingTimeId=" + workingTimeId + " ]";
    }
    
}
