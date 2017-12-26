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
@Table(name = "contract")
@NamedQueries({
    @NamedQuery(name = "Contract.findAll", query = "SELECT c FROM Contract c")})
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ContractrId")
    private Integer contractrId;
    @Basic(optional = false)
    @Column(name = "ContractMasterId")
    private short contractMasterId;
    @Basic(optional = false)
    @Lob
    @Column(name = "Salary")
    private String salary;
    @Basic(optional = false)
    @Column(name = "StartDate")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Basic(optional = false)
    @Column(name = "ExpiredDate")
    @Temporal(TemporalType.DATE)
    private Date expiredDate;
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
    @JoinColumn(name = "EmployeeId", referencedColumnName = "EmployeeId")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Employee employee;

    public Contract() {
    }

    public Contract(Integer contractrId) {
        this.contractrId = contractrId;
    }

    public Contract(Integer contractrId, short contractMasterId, String salary, Date startDate, Date expiredDate, String createdBy, String updatedBy) {
        this.contractrId = contractrId;
        this.contractMasterId = contractMasterId;
        this.salary = salary;
        this.startDate = startDate;
        this.expiredDate = expiredDate;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public Integer getContractrId() {
        return contractrId;
    }

    public void setContractrId(Integer contractrId) {
        this.contractrId = contractrId;
    }

    public short getContractMasterId() {
        return contractMasterId;
    }

    public void setContractMasterId(short contractMasterId) {
        this.contractMasterId = contractMasterId;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contractrId != null ? contractrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contract)) {
            return false;
        }
        Contract other = (Contract) object;
        if ((this.contractrId == null && other.contractrId != null) || (this.contractrId != null && !this.contractrId.equals(other.contractrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Contract[ contractrId=" + contractrId + " ]";
    }
    
}
