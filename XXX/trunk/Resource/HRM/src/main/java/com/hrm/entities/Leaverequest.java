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
@Table(name = "leaverequest")
@NamedQueries({
    @NamedQuery(name = "Leaverequest.findAll", query = "SELECT l FROM Leaverequest l")})
public class Leaverequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LeaveRequestId")
    private Integer leaveRequestId;
    @Basic(optional = false)
    @Column(name = "RequestType")
    private int requestType;
    @Basic(optional = false)
    @Column(name = "StartLeaveDate")
    @Temporal(TemporalType.DATE)
    private Date startLeaveDate;
    @Basic(optional = false)
    @Column(name = "EndLeaveDate")
    @Temporal(TemporalType.DATE)
    private Date endLeaveDate;
    @Basic(optional = false)
    @Column(name = "Duration")
    private float duration;
    @Basic(optional = false)
    @Lob
    @Column(name = "ReasonDes")
    private String reasonDes;
    @Basic(optional = false)
    @Column(name = "ApproveBy")
    private String approveBy;
    @Basic(optional = false)
    @Column(name = "Status")
    private int status;
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
    @JoinColumn(name = "LeaveReasonId", referencedColumnName = "LeaveReasonId")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Leavereason leavereason;

    public Leaverequest() {
    }

    public Leaverequest(Integer leaveRequestId) {
        this.leaveRequestId = leaveRequestId;
    }

    public Leaverequest(Integer leaveRequestId, int requestType, Date startLeaveDate, Date endLeaveDate, float duration, String reasonDes, String approveBy, int status, String createdBy, String updatedBy) {
        this.leaveRequestId = leaveRequestId;
        this.requestType = requestType;
        this.startLeaveDate = startLeaveDate;
        this.endLeaveDate = endLeaveDate;
        this.duration = duration;
        this.reasonDes = reasonDes;
        this.approveBy = approveBy;
        this.status = status;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public Integer getLeaveRequestId() {
        return leaveRequestId;
    }

    public void setLeaveRequestId(Integer leaveRequestId) {
        this.leaveRequestId = leaveRequestId;
    }

    public int getRequestType() {
        return requestType;
    }

    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }

    public Date getStartLeaveDate() {
        return startLeaveDate;
    }

    public void setStartLeaveDate(Date startLeaveDate) {
        this.startLeaveDate = startLeaveDate;
    }

    public Date getEndLeaveDate() {
        return endLeaveDate;
    }

    public void setEndLeaveDate(Date endLeaveDate) {
        this.endLeaveDate = endLeaveDate;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getReasonDes() {
        return reasonDes;
    }

    public void setReasonDes(String reasonDes) {
        this.reasonDes = reasonDes;
    }

    public String getApproveBy() {
        return approveBy;
    }

    public void setApproveBy(String approveBy) {
        this.approveBy = approveBy;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public Leavereason getLeavereason() {
        return leavereason;
    }

    public void setLeavereason(Leavereason leavereason) {
        this.leavereason = leavereason;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (leaveRequestId != null ? leaveRequestId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Leaverequest)) {
            return false;
        }
        Leaverequest other = (Leaverequest) object;
        if ((this.leaveRequestId == null && other.leaveRequestId != null) || (this.leaveRequestId != null && !this.leaveRequestId.equals(other.leaveRequestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Leaverequest[ leaveRequestId=" + leaveRequestId + " ]";
    }
    
}
