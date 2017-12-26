package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the master_role database table.
 * 
 */
@Entity
@Table(name="master_role")
@NamedQuery(name="MasterRole.findAll", query="SELECT m FROM MasterRole m")
public class MasterRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_master_id")
	private int roleMasterId;

	@Lob
	@Column(name="role_des")
	private String roleDes;

	@Column(name="role_name")
	private String roleName;

	public MasterRole() {
	}
	
	public MasterRole(String roleName, String roleDes) {
		this.roleDes = roleDes;
		this.roleName = roleName;
	}

	public int getRoleMasterId() {
		return this.roleMasterId;
	}

	public void setRoleMasterId(int roleMasterId) {
		this.roleMasterId = roleMasterId;
	}

	public String getRoleDes() {
		return this.roleDes;
	}

	public void setRoleDes(String roleDes) {
		this.roleDes = roleDes;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}