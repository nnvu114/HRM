package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the master_relationship database table.
 * 
 */
@Entity
@Table(name="master_relationship")
@NamedQuery(name="MasterRelationship.findAll", query="SELECT m FROM MasterRelationship m")
public class MasterRelationship implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="relationship_master_id")
	private int relationshipMasterId;

	@Lob
	@Column(name="relationship_des")
	private String relationshipDes;

	@Column(name="relationship_name")
	private String relationshipName;

	public MasterRelationship() {
	}

	public int getRelationshipMasterId() {
		return this.relationshipMasterId;
	}

	public void setRelationshipMasterId(int relationshipMasterId) {
		this.relationshipMasterId = relationshipMasterId;
	}

	public String getRelationshipDes() {
		return this.relationshipDes;
	}

	public void setRelationshipDes(String relationshipDes) {
		this.relationshipDes = relationshipDes;
	}

	public String getRelationshipName() {
		return this.relationshipName;
	}

	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}

}