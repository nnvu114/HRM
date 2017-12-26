package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the evl_evaluation_details database table.
 * 
 */
@Entity
@Table(name="evl_evaluation_details")
@NamedQuery(name="EvlEvaluationDetail.findAll", query="SELECT e FROM EvlEvaluationDetail e")
public class EvlEvaluationDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="evaluation_detail_id")
	private int evaluationDetailId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Lob
	@Column(name="evaluation_des")
	private String evaluationDes;

	@Column(name="evaluation_result")
	private String evaluationResult;

	private String evaluator;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to EvlEvaluation
	@ManyToOne
	@JoinColumn(name="evaluation_id")
	private EvlEvaluation evlEvaluation;

	//bi-directional many-to-one association to EvlEvaluationResult
	@OneToMany(mappedBy="evlEvaluationDetail")
	private List<EvlEvaluationResult> evlEvaluationResults;

	public EvlEvaluationDetail() {
	}

	public int getEvaluationDetailId() {
		return this.evaluationDetailId;
	}

	public void setEvaluationDetailId(int evaluationDetailId) {
		this.evaluationDetailId = evaluationDetailId;
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

	public String getEvaluationDes() {
		return this.evaluationDes;
	}

	public void setEvaluationDes(String evaluationDes) {
		this.evaluationDes = evaluationDes;
	}

	public String getEvaluationResult() {
		return this.evaluationResult;
	}

	public void setEvaluationResult(String evaluationResult) {
		this.evaluationResult = evaluationResult;
	}

	public String getEvaluator() {
		return this.evaluator;
	}

	public void setEvaluator(String evaluator) {
		this.evaluator = evaluator;
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

	public EvlEvaluation getEvlEvaluation() {
		return this.evlEvaluation;
	}

	public void setEvlEvaluation(EvlEvaluation evlEvaluation) {
		this.evlEvaluation = evlEvaluation;
	}

	public List<EvlEvaluationResult> getEvlEvaluationResults() {
		return this.evlEvaluationResults;
	}

	public void setEvlEvaluationResults(List<EvlEvaluationResult> evlEvaluationResults) {
		this.evlEvaluationResults = evlEvaluationResults;
	}

	public EvlEvaluationResult addEvlEvaluationResult(EvlEvaluationResult evlEvaluationResult) {
		getEvlEvaluationResults().add(evlEvaluationResult);
		evlEvaluationResult.setEvlEvaluationDetail(this);

		return evlEvaluationResult;
	}

	public EvlEvaluationResult removeEvlEvaluationResult(EvlEvaluationResult evlEvaluationResult) {
		getEvlEvaluationResults().remove(evlEvaluationResult);
		evlEvaluationResult.setEvlEvaluationDetail(null);

		return evlEvaluationResult;
	}

}