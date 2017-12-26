package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the master_award database table.
 * 
 */
@Entity
@Table(name="master_award")
@NamedQuery(name="MasterAward.findAll", query="SELECT m FROM MasterAward m")
public class MasterAward implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="award_master_id")
	private int awardMasterId;

	@Lob
	@Column(name="award_des")
	private String awardDes;

	@Column(name="award_name")
	private String awardName;

	public MasterAward() {
	}

	public int getAwardMasterId() {
		return this.awardMasterId;
	}

	public void setAwardMasterId(int awardMasterId) {
		this.awardMasterId = awardMasterId;
	}

	public String getAwardDes() {
		return this.awardDes;
	}

	public void setAwardDes(String awardDes) {
		this.awardDes = awardDes;
	}

	public String getAwardName() {
		return this.awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

}