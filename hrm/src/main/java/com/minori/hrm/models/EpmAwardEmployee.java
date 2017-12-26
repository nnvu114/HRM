package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the epm_award_employee database table.
 * 
 */
@Entity
@Table(name="epm_award_employee")
@NamedQuery(name="EpmAwardEmployee.findAll", query="SELECT e FROM EpmAwardEmployee e")
public class EpmAwardEmployee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="award_detail_id")
	private int awardDetailId;

	private double amount;

	@Column(name="award_status")
	private int awardStatus;

	@Column(name="award_type")
	private int awardType;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="leave_day")
	private float leaveDay;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	//bi-directional many-to-one association to EpmAward
	@ManyToOne
	@JoinColumn(name="award_id")
	private EpmAward epmAward;

	public EpmAwardEmployee() {
	}

	public int getAwardDetailId() {
		return this.awardDetailId;
	}

	public void setAwardDetailId(int awardDetailId) {
		this.awardDetailId = awardDetailId;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getAwardStatus() {
		return this.awardStatus;
	}

	public void setAwardStatus(int awardStatus) {
		this.awardStatus = awardStatus;
	}

	public int getAwardType() {
		return this.awardType;
	}

	public void setAwardType(int awardType) {
		this.awardType = awardType;
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

	public float getLeaveDay() {
		return this.leaveDay;
	}

	public void setLeaveDay(float leaveDay) {
		this.leaveDay = leaveDay;
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

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EpmAward getEpmAward() {
		return this.epmAward;
	}

	public void setEpmAward(EpmAward epmAward) {
		this.epmAward = epmAward;
	}

}