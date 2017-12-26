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
@Table(name = "contractmaster")
@NamedQueries({
    @NamedQuery(name = "Contractmaster.findAll", query = "SELECT c FROM Contractmaster c")})
public class Contractmaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ContractMasterId")
    private Integer contractMasterId;
    @Basic(optional = false)
    @Column(name = "ContractName")
    private String contractName;
    @Basic(optional = false)
    @Lob
    @Column(name = "ContractDes")
    private String contractDes;

    public Contractmaster() {
    }

    public Contractmaster(Integer contractMasterId) {
        this.contractMasterId = contractMasterId;
    }

    public Contractmaster(Integer contractMasterId, String contractName, String contractDes) {
        this.contractMasterId = contractMasterId;
        this.contractName = contractName;
        this.contractDes = contractDes;
    }

    public Integer getContractMasterId() {
        return contractMasterId;
    }

    public void setContractMasterId(Integer contractMasterId) {
        this.contractMasterId = contractMasterId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractDes() {
        return contractDes;
    }

    public void setContractDes(String contractDes) {
        this.contractDes = contractDes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contractMasterId != null ? contractMasterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contractmaster)) {
            return false;
        }
        Contractmaster other = (Contractmaster) object;
        if ((this.contractMasterId == null && other.contractMasterId != null) || (this.contractMasterId != null && !this.contractMasterId.equals(other.contractMasterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Contractmaster[ contractMasterId=" + contractMasterId + " ]";
    }
    
}
