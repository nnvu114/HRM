/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "assessmentmaster")
@NamedQueries({
    @NamedQuery(name = "Assessmentmaster.findAll", query = "SELECT a FROM Assessmentmaster a")})
public class Assessmentmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AssessmentMasterId")
    private Integer assessmentMasterId;
    @Basic(optional = false)
    @Column(name = "AssessmentTitle")
    private String assessmentTitle;
    @Basic(optional = false)
    @Lob
    @Column(name = "AssessmentDes")
    private String assessmentDes;

    public Assessmentmaster() {
    }

    public Assessmentmaster(Integer assessmentMasterId) {
        this.assessmentMasterId = assessmentMasterId;
    }

    public Assessmentmaster(Integer assessmentMasterId, String assessmentTitle, String assessmentDes) {
        this.assessmentMasterId = assessmentMasterId;
        this.assessmentTitle = assessmentTitle;
        this.assessmentDes = assessmentDes;
    }

    public Integer getAssessmentMasterId() {
        return assessmentMasterId;
    }

    public void setAssessmentMasterId(Integer assessmentMasterId) {
        this.assessmentMasterId = assessmentMasterId;
    }

    public String getAssessmentTitle() {
        return assessmentTitle;
    }

    public void setAssessmentTitle(String assessmentTitle) {
        this.assessmentTitle = assessmentTitle;
    }

    public String getAssessmentDes() {
        return assessmentDes;
    }

    public void setAssessmentDes(String assessmentDes) {
        this.assessmentDes = assessmentDes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assessmentMasterId != null ? assessmentMasterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assessmentmaster)) {
            return false;
        }
        Assessmentmaster other = (Assessmentmaster) object;
        if ((this.assessmentMasterId == null && other.assessmentMasterId != null) || (this.assessmentMasterId != null && !this.assessmentMasterId.equals(other.assessmentMasterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Assessmentmaster[ assessmentMasterId=" + assessmentMasterId + " ]";
    }
    
}
