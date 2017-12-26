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
@Table(name = "overtimerequestdetails")
@NamedQueries({
    @NamedQuery(name = "Overtimerequestdetails.findAll", query = "SELECT o FROM Overtimerequestdetails o")})
public class Overtimerequestdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RequestDetailId")
    private Integer requestDetailId;
    @Basic(optional = false)
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
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
    @JoinColumn(name = "RequestId", referencedColumnName = "RequestId")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Overtimerequest overtimerequest;

    public Overtimerequestdetails() {
    }

    public Overtimerequestdetails(Integer requestDetailId) {
        this.requestDetailId = requestDetailId;
    }

    public Overtimerequestdetails(Integer requestDetailId, Date date, String createdBy, String updatedBy) {
        this.requestDetailId = requestDetailId;
        this.date = date;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public Integer getRequestDetailId() {
        return requestDetailId;
    }

    public void setRequestDetailId(Integer requestDetailId) {
        this.requestDetailId = requestDetailId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public Overtimerequest getOvertimerequest() {
        return overtimerequest;
    }

    public void setOvertimerequest(Overtimerequest overtimerequest) {
        this.overtimerequest = overtimerequest;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requestDetailId != null ? requestDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Overtimerequestdetails)) {
            return false;
        }
        Overtimerequestdetails other = (Overtimerequestdetails) object;
        if ((this.requestDetailId == null && other.requestDetailId != null) || (this.requestDetailId != null && !this.requestDetailId.equals(other.requestDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Overtimerequestdetails[ requestDetailId=" + requestDetailId + " ]";
    }
    
}
