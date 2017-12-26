package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the evl_evaluation_result database table.
 * 
 */
@Entity
@Table(name="evl_evaluation_result")
@NamedQuery(name="EvlEvaluationResult.findAll", query="SELECT e FROM EvlEvaluationResult e")
public class EvlEvaluationResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="evaluation_result_id")
	private int evaluationResultId;

	@Lob
	private String comment;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	private int priority;

	private int result;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to EvlEvaluationDetail
	@ManyToOne
	@JoinColumn(name="evaluation_detail_id")
	private EvlEvaluationDetail evlEvaluationDetail;

	//bi-directional many-to-one association to EvlEvaluationCriteria
	@ManyToOne
	@JoinColumn(name="evaluation_criteria_id")
	private EvlEvaluationCriteria evlEvaluationCriteria;

	public EvlEvaluationResult() {
	}

	public int getEvaluationResultId() {
		return this.evaluationResultId;
	}

	public void setEvaluationResultId(int evaluationResultId) {
		this.evaluationResultId = evaluationResultId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getResult() {
		return this.result;
	}

	public void setResult(int result) {
		this.result = result;
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

	public EvlEvaluationDetail getEvlEvaluationDetail() {
		return this.evlEvaluationDetail;
	}

	public void setEvlEvaluationDetail(EvlEvaluationDetail evlEvaluationDetail) {
		this.evlEvaluationDetail = evlEvaluationDetail;
	}

	public EvlEvaluationCriteria getEvlEvaluationCriteria() {
		return this.evlEvaluationCriteria;
	}

	public void setEvlEvaluationCriteria(EvlEvaluationCriteria evlEvaluationCriteria) {
		this.evlEvaluationCriteria = evlEvaluationCriteria;
	}

}