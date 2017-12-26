package com.minori.hrm.dto;

import java.sql.Timestamp;

import com.minori.hrm.models.EpmRelationship;
import com.minori.hrm.models.MasterRelationship;

public class RelationshipDto {
	
	private int relationshiId;

	private String address;

	private Timestamp birthday;

	private String career;
	
	private String createdBy;

	private Timestamp createdDate;

	private String relationshipName;

	private String relationshipType;

	private String updatedBy;

	private Timestamp updatedDate;

	public RelationshipDto(EpmRelationship relationship, MasterRelationship masterRelationship) {
		this.relationshiId = relationship.getRelationshiId();
		this.address = relationship.getAddress();
		this.birthday = relationship.getBirthday();
		this.career = relationship.getCareer();
		this.createdBy = relationship.getCreatedBy();
		this.createdDate = relationship.getCreatedDate();
		this.relationshipName = relationship.getRelationshipName();
		this.relationshipType = masterRelationship.getRelationshipName();
		this.updatedBy = relationship.getUpdatedBy();
		this.updatedDate = relationship.getUpdatedDate();
	}

	public int getRelationshiId() {
		return relationshiId;
	}

	public void setRelationshiId(int relationshiId) {
		this.relationshiId = relationshiId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getBirthday() {
		return birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getRelationshipName() {
		return relationshipName;
	}

	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}

	public String getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}
}
