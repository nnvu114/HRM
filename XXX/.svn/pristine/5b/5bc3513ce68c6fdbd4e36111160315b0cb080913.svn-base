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
@Table(name = "medicalrecords")
@NamedQueries({
    @NamedQuery(name = "Medicalrecords.findAll", query = "SELECT m FROM Medicalrecords m")})
public class Medicalrecords implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MedicalRecordId")
    private Integer medicalRecordId;
    @Basic(optional = false)
    @Lob
    @Column(name = "Place")
    private String place;
    @Basic(optional = false)
    @Column(name = "Cost")
    private double cost;
    @Basic(optional = false)
    @Column(name = "ExaminationDay")
    @Temporal(TemporalType.DATE)
    private Date examinationDay;
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

    public Medicalrecords() {
    }

    public Medicalrecords(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public Medicalrecords(Integer medicalRecordId, String place, double cost, Date examinationDay, String createdBy, String updatedBy) {
        this.medicalRecordId = medicalRecordId;
        this.place = place;
        this.cost = cost;
        this.examinationDay = examinationDay;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getExaminationDay() {
        return examinationDay;
    }

    public void setExaminationDay(Date examinationDay) {
        this.examinationDay = examinationDay;
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
        hash += (medicalRecordId != null ? medicalRecordId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicalrecords)) {
            return false;
        }
        Medicalrecords other = (Medicalrecords) object;
        if ((this.medicalRecordId == null && other.medicalRecordId != null) || (this.medicalRecordId != null && !this.medicalRecordId.equals(other.medicalRecordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Medicalrecords[ medicalRecordId=" + medicalRecordId + " ]";
    }
    
}
