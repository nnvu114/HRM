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
@Table(name = "award")
@NamedQueries({
    @NamedQuery(name = "Award.findAll", query = "SELECT a FROM Award a")})
public class Award implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AwardId")
    private Integer awardId;
    @Basic(optional = false)
    @Column(name = "AwardName")
    private int awardName;
    @Lob
    @Column(name = "AwardDes")
    private String awardDes;
    @Column(name = "AwardStatus")
    private Integer awardStatus;
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

    public Award() {
    }

    public Award(Integer awardId) {
        this.awardId = awardId;
    }

    public Award(Integer awardId, int awardName, String createdBy, String updatedBy) {
        this.awardId = awardId;
        this.awardName = awardName;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public Integer getAwardId() {
        return awardId;
    }

    public void setAwardId(Integer awardId) {
        this.awardId = awardId;
    }

    public int getAwardName() {
        return awardName;
    }

    public void setAwardName(int awardName) {
        this.awardName = awardName;
    }

    public String getAwardDes() {
        return awardDes;
    }

    public void setAwardDes(String awardDes) {
        this.awardDes = awardDes;
    }

    public Integer getAwardStatus() {
        return awardStatus;
    }

    public void setAwardStatus(Integer awardStatus) {
        this.awardStatus = awardStatus;
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
        hash += (awardId != null ? awardId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Award)) {
            return false;
        }
        Award other = (Award) object;
        if ((this.awardId == null && other.awardId != null) || (this.awardId != null && !this.awardId.equals(other.awardId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Award[ awardId=" + awardId + " ]";
    }
    
}
