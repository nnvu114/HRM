package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the evl_evaluation database table.
 * 
 */
@Entity
@Table(name="evl_evaluation")
@NamedQuery(name="EvlEvaluation.findAll", query="SELECT e FROM EvlEvaluation e")
public class EvlEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="evaluation_id")
	private int evaluationId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="evaluation_type")
	private int evaluationType;

	@Column(name="evl_evaluationcol")
	private String evlEvaluationcol;

	@Column(name="expiry_date")
	private Timestamp expiryDate;

	@Column(name="start_date")
	private Timestamp startDate;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	//bi-directional many-to-one association to EvlEvaluationDetail
	@OneToMany(mappedBy="evlEvaluation")
	private List<EvlEvaluationDetail> evlEvaluationDetails;

	public EvlEvaluation() {
	}

	public int getEvaluationId() {
		return this.evaluationId;
	}

	public void setEvaluationId(int evaluationId) {
		this.evaluationId = evaluationId;
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

	public int getEvaluationType() {
		return this.evaluationType;
	}

	public void setEvaluationType(int evaluationType) {
		this.evaluationType = evaluationType;
	}

	public String getEvlEvaluationcol() {
		return this.evlEvaluationcol;
	}

	public void setEvlEvaluationcol(String evlEvaluationcol) {
		this.evlEvaluationcol = evlEvaluationcol;
	}

	public Timestamp getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
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

	public List<EvlEvaluationDetail> getEvlEvaluationDetails() {
		return this.evlEvaluationDetails;
	}

	public void setEvlEvaluationDetails(List<EvlEvaluationDetail> evlEvaluationDetails) {
		this.evlEvaluationDetails = evlEvaluationDetails;
	}

	public EvlEvaluationDetail addEvlEvaluationDetail(EvlEvaluationDetail evlEvaluationDetail) {
		getEvlEvaluationDetails().add(evlEvaluationDetail);
		evlEvaluationDetail.setEvlEvaluation(this);

		return evlEvaluationDetail;
	}

	public EvlEvaluationDetail removeEvlEvaluationDetail(EvlEvaluationDetail evlEvaluationDetail) {
		getEvlEvaluationDetails().remove(evlEvaluationDetail);
		evlEvaluationDetail.setEvlEvaluation(null);

		return evlEvaluationDetail;
	}

}