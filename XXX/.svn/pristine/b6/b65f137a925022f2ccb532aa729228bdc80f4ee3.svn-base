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
@Table(name = "rolemaster")
@NamedQueries({
    @NamedQuery(name = "Rolemaster.findAll", query = "SELECT r FROM Rolemaster r")})
public class Rolemaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RoleMasterId")
    private Integer roleMasterId;
    @Basic(optional = false)
    @Column(name = "RoleName")
    private String roleName;
    @Basic(optional = false)
    @Lob
    @Column(name = "RoleDes")
    private String roleDes;

    public Rolemaster() {
    }

    public Rolemaster(Integer roleMasterId) {
        this.roleMasterId = roleMasterId;
    }

    public Rolemaster(Integer roleMasterId, String roleName, String roleDes) {
        this.roleMasterId = roleMasterId;
        this.roleName = roleName;
        this.roleDes = roleDes;
    }

    public Integer getRoleMasterId() {
        return roleMasterId;
    }

    public void setRoleMasterId(Integer roleMasterId) {
        this.roleMasterId = roleMasterId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDes() {
        return roleDes;
    }

    public void setRoleDes(String roleDes) {
        this.roleDes = roleDes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleMasterId != null ? roleMasterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolemaster)) {
            return false;
        }
        Rolemaster other = (Rolemaster) object;
        if ((this.roleMasterId == null && other.roleMasterId != null) || (this.roleMasterId != null && !this.roleMasterId.equals(other.roleMasterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Rolemaster[ roleMasterId=" + roleMasterId + " ]";
    }
    
}
