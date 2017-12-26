package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tnm_inform_training database table.
 * 
 */
@Entity
@Table(name="tnm_inform_training")
@NamedQuery(name="TnmInformTraining.findAll", query="SELECT t FROM TnmInformTraining t")
public class TnmInformTraining implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="inform_training_id")
	private int informTrainingId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Lob
	@Column(name="evaluation_of_employee")
	private String evaluationOfEmployee;

	@Lob
	@Column(name="evaluation_of_trainer")
	private String evaluationOfTrainer;

	private String result;

	private int status;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	//bi-directional many-to-one association to TnmTraining
	@ManyToOne
	@JoinColumn(name="training_id")
	private TnmTraining tnmTraining;

	public TnmInformTraining() {
	}

	public int getInformTrainingId() {
		return this.informTrainingId;
	}

	public void setInformTrainingId(int informTrainingId) {
		this.informTrainingId = informTrainingId;
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

	public String getEvaluationOfEmployee() {
		return this.evaluationOfEmployee;
	}

	public void setEvaluationOfEmployee(String evaluationOfEmployee) {
		this.evaluationOfEmployee = evaluationOfEmployee;
	}

	public String getEvaluationOfTrainer() {
		return this.evaluationOfTrainer;
	}

	public void setEvaluationOfTrainer(String evaluationOfTrainer) {
		this.evaluationOfTrainer = evaluationOfTrainer;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public TnmTraining getTnmTraining() {
		return this.tnmTraining;
	}

	public void setTnmTraining(TnmTraining tnmTraining) {
		this.tnmTraining = tnmTraining;
	}

}