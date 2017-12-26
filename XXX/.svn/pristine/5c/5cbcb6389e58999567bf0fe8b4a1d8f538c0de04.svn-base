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
@Table(name = "assessment")
@NamedQueries({
    @NamedQuery(name = "Assessment.findAll", query = "SELECT a FROM Assessment a")})
public class Assessment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AssessmentId")
    private Integer assessmentId;
    @Basic(optional = false)
    @Column(name = "AssessmentDate")
    @Temporal(TemporalType.DATE)
    private Date assessmentDate;
    @Basic(optional = false)
    @Lob
    @Column(name = "AssessmentDes")
    private String assessmentDes;
    @Basic(optional = false)
    @Column(name = "Discipline")
    private int discipline;
    @Basic(optional = false)
    @Lob
    @Column(name = "DisciplineDes")
    private String disciplineDes;
    @Basic(optional = false)
    @Column(name = "Productivity")
    private int productivity;
    @Basic(optional = false)
    @Lob
    @Column(name = "ProductivityDes")
    private String productivityDes;
    @Basic(optional = false)
    @Column(name = "Skillup")
    private int skillup;
    @Basic(optional = false)
    @Lob
    @Column(name = "SkillupDes")
    private String skillupDes;
    @Basic(optional = false)
    @Column(name = "Quality")
    private int quality;
    @Basic(optional = false)
    @Lob
    @Column(name = "QualityDes")
    private String qualityDes;
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

    public Assessment() {
    }

    public Assessment(Integer assessmentId) {
        this.assessmentId = assessmentId;
    }

    public Assessment(Integer assessmentId, Date assessmentDate, String assessmentDes, int discipline, String disciplineDes, int productivity, String productivityDes, int skillup, String skillupDes, int quality, String qualityDes, String createdBy, String updatedBy) {
        this.assessmentId = assessmentId;
        this.assessmentDate = assessmentDate;
        this.assessmentDes = assessmentDes;
        this.discipline = discipline;
        this.disciplineDes = disciplineDes;
        this.productivity = productivity;
        this.productivityDes = productivityDes;
        this.skillup = skillup;
        this.skillupDes = skillupDes;
        this.quality = quality;
        this.qualityDes = qualityDes;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public Integer getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Integer assessmentId) {
        this.assessmentId = assessmentId;
    }

    public Date getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(Date assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public String getAssessmentDes() {
        return assessmentDes;
    }

    public void setAssessmentDes(String assessmentDes) {
        this.assessmentDes = assessmentDes;
    }

    public int getDiscipline() {
        return discipline;
    }

    public void setDiscipline(int discipline) {
        this.discipline = discipline;
    }

    public String getDisciplineDes() {
        return disciplineDes;
    }

    public void setDisciplineDes(String disciplineDes) {
        this.disciplineDes = disciplineDes;
    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }

    public String getProductivityDes() {
        return productivityDes;
    }

    public void setProductivityDes(String productivityDes) {
        this.productivityDes = productivityDes;
    }

    public int getSkillup() {
        return skillup;
    }

    public void setSkillup(int skillup) {
        this.skillup = skillup;
    }

    public String getSkillupDes() {
        return skillupDes;
    }

    public void setSkillupDes(String skillupDes) {
        this.skillupDes = skillupDes;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getQualityDes() {
        return qualityDes;
    }

    public void setQualityDes(String qualityDes) {
        this.qualityDes = qualityDes;
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
        hash += (assessmentId != null ? assessmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assessment)) {
            return false;
        }
        Assessment other = (Assessment) object;
        if ((this.assessmentId == null && other.assessmentId != null) || (this.assessmentId != null && !this.assessmentId.equals(other.assessmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Assessment[ assessmentId=" + assessmentId + " ]";
    }
    
}
