package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the master_cetification database table.
 * 
 */
@Entity
@Table(name="master_cetification")
@NamedQuery(name="MasterCetification.findAll", query="SELECT m FROM MasterCetification m")
public class MasterCetification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ceification_master_id")
	private int ceificationMasterId;

	@Lob
	@Column(name="cetification_des")
	private String cetificationDes;

	@Column(name="cetification_name")
	private String cetificationName;

	public MasterCetification() {
	}

	public int getCeificationMasterId() {
		return this.ceificationMasterId;
	}

	public void setCeificationMasterId(int ceificationMasterId) {
		this.ceificationMasterId = ceificationMasterId;
	}

	public String getCetificationDes() {
		return this.cetificationDes;
	}

	public void setCetificationDes(String cetificationDes) {
		this.cetificationDes = cetificationDes;
	}

	public String getCetificationName() {
		return this.cetificationName;
	}

	public void setCetificationName(String cetificationName) {
		this.cetificationName = cetificationName;
	}

}