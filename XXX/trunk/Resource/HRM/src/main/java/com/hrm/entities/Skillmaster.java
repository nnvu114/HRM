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
@Table(name = "skillmaster")
@NamedQueries({
    @NamedQuery(name = "Skillmaster.findAll", query = "SELECT s FROM Skillmaster s")})
public class Skillmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SkillMasterId")
    private Integer skillMasterId;
    @Basic(optional = false)
    @Column(name = "SkillName")
    private String skillName;
    @Basic(optional = false)
    @Lob
    @Column(name = "SkillDes")
    private String skillDes;

    public Skillmaster() {
    }

    public Skillmaster(Integer skillMasterId) {
        this.skillMasterId = skillMasterId;
    }

    public Skillmaster(Integer skillMasterId, String skillName, String skillDes) {
        this.skillMasterId = skillMasterId;
        this.skillName = skillName;
        this.skillDes = skillDes;
    }

    public Integer getSkillMasterId() {
        return skillMasterId;
    }

    public void setSkillMasterId(Integer skillMasterId) {
        this.skillMasterId = skillMasterId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillDes() {
        return skillDes;
    }

    public void setSkillDes(String skillDes) {
        this.skillDes = skillDes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (skillMasterId != null ? skillMasterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Skillmaster)) {
            return false;
        }
        Skillmaster other = (Skillmaster) object;
        if ((this.skillMasterId == null && other.skillMasterId != null) || (this.skillMasterId != null && !this.skillMasterId.equals(other.skillMasterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Skillmaster[ skillMasterId=" + skillMasterId + " ]";
    }
    
}
