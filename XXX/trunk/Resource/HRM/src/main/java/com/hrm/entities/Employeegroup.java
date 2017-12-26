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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
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
@Table(name = "employeegroup")
@NamedQueries({
    @NamedQuery(name = "Employeegroup.findAll", query = "SELECT e FROM Employeegroup e")})
public class Employeegroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmployeegroupPK employeegroupPK;
    @Column(name = "CreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "UpdatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
    @Basic(optional = false)
    @Column(name = "CreatedBy")
    private String createdBy;
    @Basic(optional = false)
    @Column(name = "UpdatedBy")
    private String updatedBy;
    @JoinColumn(name = "EmployeeId", referencedColumnName = "EmployeeId", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Employee employee;
    @JoinColumn(name = "GroupId", referencedColumnName = "GroupId", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Group1 group1;

    public Employeegroup() {
    }

    public Employeegroup(EmployeegroupPK employeegroupPK) {
        this.employeegroupPK = employeegroupPK;
    }

    public Employeegroup(EmployeegroupPK employeegroupPK, String createdBy, String updatedBy) {
        this.employeegroupPK = employeegroupPK;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public Employeegroup(int groupId, int employeeId) {
        this.employeegroupPK = new EmployeegroupPK(groupId, employeeId);
    }

    public EmployeegroupPK getEmployeegroupPK() {
        return employeegroupPK;
    }

    public void setEmployeegroupPK(EmployeegroupPK employeegroupPK) {
        this.employeegroupPK = employeegroupPK;
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Group1 getGroup1() {
        return group1;
    }

    public void setGroup1(Group1 group1) {
        this.group1 = group1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeegroupPK != null ? employeegroupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employeegroup)) {
            return false;
        }
        Employeegroup other = (Employeegroup) object;
        if ((this.employeegroupPK == null && other.employeegroupPK != null) || (this.employeegroupPK != null && !this.employeegroupPK.equals(other.employeegroupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Employeegroup[ employeegroupPK=" + employeegroupPK + " ]";
    }
    
}
