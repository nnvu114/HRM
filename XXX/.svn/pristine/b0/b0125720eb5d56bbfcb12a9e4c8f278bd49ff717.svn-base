/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "leavereason")
@NamedQueries({
    @NamedQuery(name = "Leavereason.findAll", query = "SELECT l FROM Leavereason l")})
public class Leavereason implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LeaveReasonId")
    private Integer leaveReasonId;
    @Column(name = "Name")
    private String name;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "leavereason", fetch = FetchType.LAZY)
    private List<Leaverequest> leaverequestList;

    public Leavereason() {
    }

    public Leavereason(Integer leaveReasonId) {
        this.leaveReasonId = leaveReasonId;
    }

    public Leavereason(Integer leaveReasonId, String createdBy, String updatedBy) {
        this.leaveReasonId = leaveReasonId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public Integer getLeaveReasonId() {
        return leaveReasonId;
    }

    public void setLeaveReasonId(Integer leaveReasonId) {
        this.leaveReasonId = leaveReasonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Leaverequest> getLeaverequestList() {
        return leaverequestList;
    }

    public void setLeaverequestList(List<Leaverequest> leaverequestList) {
        this.leaverequestList = leaverequestList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (leaveReasonId != null ? leaveReasonId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Leavereason)) {
            return false;
        }
        Leavereason other = (Leavereason) object;
        if ((this.leaveReasonId == null && other.leaveReasonId != null) || (this.leaveReasonId != null && !this.leaveReasonId.equals(other.leaveReasonId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Leavereason[ leaveReasonId=" + leaveReasonId + " ]";
    }
    
}
