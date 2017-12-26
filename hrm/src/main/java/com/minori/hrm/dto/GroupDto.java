package com.minori.hrm.dto;

import java.sql.Timestamp;

import com.minori.hrm.models.EpmGroup;

public class GroupDto {

	private int groupId;

	private String createdBy;

	private Timestamp createdDate;

	private String description;

	private int leaderId;

	private String name;

	private String updatedBy;

	private Timestamp updatedDate;

	public GroupDto(EpmGroup group) {
		this.groupId = group.getGroupId();
		this.createdBy = group.getCreatedBy();
		this.createdDate = group.getCreatedDate();
		this.description = group.getDescription();
		this.leaderId = group.getLeaderId();
		this.name = group.getName();
		this.updatedBy = group.getUpdatedBy();
		this.updatedDate = group.getUpdatedDate();
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(int leaderId) {
		this.leaderId = leaderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
