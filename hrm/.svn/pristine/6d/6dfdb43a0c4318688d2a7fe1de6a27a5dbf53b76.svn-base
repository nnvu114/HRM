package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the epm_awards database table.
 * 
 */
@Entity
@Table(name="epm_awards")
@NamedQuery(name="EpmAward.findAll", query="SELECT e FROM EpmAward e")
public class EpmAward implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="award_id")
	private int awardId;

	@Lob
	@Column(name="award_des")
	private String awardDes;

	@Column(name="award_name")
	private String awardName;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	private int status;

	private int type;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to EpmAwardEmployee
	@OneToMany(mappedBy="epmAward")
	private List<EpmAwardEmployee> epmAwardEmployees;

	public EpmAward() {
	}

	public int getAwardId() {
		return this.awardId;
	}

	public void setAwardId(int awardId) {
		this.awardId = awardId;
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

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
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

	public List<EpmAwardEmployee> getEpmAwardEmployees() {
		return this.epmAwardEmployees;
	}

	public void setEpmAwardEmployees(List<EpmAwardEmployee> epmAwardEmployees) {
		this.epmAwardEmployees = epmAwardEmployees;
	}

	public EpmAwardEmployee addEpmAwardEmployee(EpmAwardEmployee epmAwardEmployee) {
		getEpmAwardEmployees().add(epmAwardEmployee);
		epmAwardEmployee.setEpmAward(this);

		return epmAwardEmployee;
	}

	public EpmAwardEmployee removeEpmAwardEmployee(EpmAwardEmployee epmAwardEmployee) {
		getEpmAwardEmployees().remove(epmAwardEmployee);
		epmAwardEmployee.setEpmAward(null);

		return epmAwardEmployee;
	}

}