package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the conmonconfig database table.
 * 
 */
@Entity
@NamedQuery(name="Conmonconfig.findAll", query="SELECT c FROM Conmonconfig c")
public class Conmonconfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int conmonConfigId;

	private String createdBy;

	private Timestamp createdDate;

	@Lob
	private String description;

	private float number;

	private int numberOfAnnualLeave;

	private String updatedBy;

	private Timestamp updatedDate;

	public Conmonconfig() {
	}

	public int getConmonConfigId() {
		return this.conmonConfigId;
	}

	public void setConmonConfigId(int conmonConfigId) {
		this.conmonConfigId = conmonConfigId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getNumber() {
		return this.number;
	}

	public void setNumber(float number) {
		this.number = number;
	}

	public int getNumberOfAnnualLeave() {
		return this.numberOfAnnualLeave;
	}

	public void setNumberOfAnnualLeave(int numberOfAnnualLeave) {
		this.numberOfAnnualLeave = numberOfAnnualLeave;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

}