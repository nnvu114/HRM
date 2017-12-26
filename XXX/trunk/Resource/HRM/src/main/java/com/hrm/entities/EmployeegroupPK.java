/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Admin
 */
@Embeddable
public class EmployeegroupPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "GroupId")
    private int groupId;
    @Basic(optional = false)
    @Column(name = "EmployeeId")
    private int employeeId;

    public EmployeegroupPK() {
    }

    public EmployeegroupPK(int groupId, int employeeId) {
        this.groupId = groupId;
        this.employeeId = employeeId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) groupId;
        hash += (int) employeeId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeegroupPK)) {
            return false;
        }
        EmployeegroupPK other = (EmployeegroupPK) object;
        if (this.groupId != other.groupId) {
            return false;
        }
        if (this.employeeId != other.employeeId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.EmployeegroupPK[ groupId=" + groupId + ", employeeId=" + employeeId + " ]";
    }
    
}
