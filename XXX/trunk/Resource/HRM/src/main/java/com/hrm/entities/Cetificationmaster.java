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
@Table(name = "cetificationmaster")
@NamedQueries({
    @NamedQuery(name = "Cetificationmaster.findAll", query = "SELECT c FROM Cetificationmaster c")})
public class Cetificationmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CeificationMasterId")
    private Integer ceificationMasterId;
    @Basic(optional = false)
    @Column(name = "CetificationName")
    private String cetificationName;
    @Basic(optional = false)
    @Lob
    @Column(name = "CetificationDes")
    private String cetificationDes;

    public Cetificationmaster() {
    }

    public Cetificationmaster(Integer ceificationMasterId) {
        this.ceificationMasterId = ceificationMasterId;
    }

    public Cetificationmaster(Integer ceificationMasterId, String cetificationName, String cetificationDes) {
        this.ceificationMasterId = ceificationMasterId;
        this.cetificationName = cetificationName;
        this.cetificationDes = cetificationDes;
    }

    public Integer getCeificationMasterId() {
        return ceificationMasterId;
    }

    public void setCeificationMasterId(Integer ceificationMasterId) {
        this.ceificationMasterId = ceificationMasterId;
    }

    public String getCetificationName() {
        return cetificationName;
    }

    public void setCetificationName(String cetificationName) {
        this.cetificationName = cetificationName;
    }

    public String getCetificationDes() {
        return cetificationDes;
    }

    public void setCetificationDes(String cetificationDes) {
        this.cetificationDes = cetificationDes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ceificationMasterId != null ? ceificationMasterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cetificationmaster)) {
            return false;
        }
        Cetificationmaster other = (Cetificationmaster) object;
        if ((this.ceificationMasterId == null && other.ceificationMasterId != null) || (this.ceificationMasterId != null && !this.ceificationMasterId.equals(other.ceificationMasterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Cetificationmaster[ ceificationMasterId=" + ceificationMasterId + " ]";
    }
    
}
