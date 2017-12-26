package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the master_position database table.
 * 
 */
@Entity
@Table(name="master_position")
@NamedQuery(name="MasterPosition.findAll", query="SELECT m FROM MasterPosition m")
public class MasterPosition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="position_master_id")
	private int positionMasterId;

	@Lob
	@Column(name="position_des")
	private String positionDes;

	@Column(name="position_name")
	private String positionName;

	public MasterPosition() {
	}

	public int getPositionMasterId() {
		return this.positionMasterId;
	}

	public void setPositionMasterId(int positionMasterId) {
		this.positionMasterId = positionMasterId;
	}

	public String getPositionDes() {
		return this.positionDes;
	}

	public void setPositionDes(String positionDes) {
		this.positionDes = positionDes;
	}

	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

}