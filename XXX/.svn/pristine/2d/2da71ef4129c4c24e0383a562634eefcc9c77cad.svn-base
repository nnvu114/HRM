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
@Table(name = "positionmaster")
@NamedQueries({
    @NamedQuery(name = "Positionmaster.findAll", query = "SELECT p FROM Positionmaster p")})
public class Positionmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PositionMasterId")
    private Integer positionMasterId;
    @Basic(optional = false)
    @Column(name = "PositionName")
    private String positionName;
    @Basic(optional = false)
    @Lob
    @Column(name = "PositionDes")
    private String positionDes;

    public Positionmaster() {
    }

    public Positionmaster(Integer positionMasterId) {
        this.positionMasterId = positionMasterId;
    }

    public Positionmaster(Integer positionMasterId, String positionName, String positionDes) {
        this.positionMasterId = positionMasterId;
        this.positionName = positionName;
        this.positionDes = positionDes;
    }

    public Integer getPositionMasterId() {
        return positionMasterId;
    }

    public void setPositionMasterId(Integer positionMasterId) {
        this.positionMasterId = positionMasterId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionDes() {
        return positionDes;
    }

    public void setPositionDes(String positionDes) {
        this.positionDes = positionDes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (positionMasterId != null ? positionMasterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Positionmaster)) {
            return false;
        }
        Positionmaster other = (Positionmaster) object;
        if ((this.positionMasterId == null && other.positionMasterId != null) || (this.positionMasterId != null && !this.positionMasterId.equals(other.positionMasterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Positionmaster[ positionMasterId=" + positionMasterId + " ]";
    }
    
}
