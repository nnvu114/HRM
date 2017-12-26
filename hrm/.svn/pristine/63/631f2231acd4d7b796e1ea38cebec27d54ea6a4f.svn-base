package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the evl_evaluation_criteria database table.
 * 
 */
@Entity
@Table(name="evl_evaluation_criteria")
@NamedQuery(name="EvlEvaluationCriteria.findAll", query="SELECT e FROM EvlEvaluationCriteria e")
public class EvlEvaluationCriteria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="evaluation_criteria_id")
	private int evaluationCriteriaId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	private String name;

	private String type;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to EvlEvaluationResult
	@OneToMany(mappedBy="evlEvaluationCriteria")
	private List<EvlEvaluationResult> evlEvaluationResults;

	public EvlEvaluationCriteria() {
	}

	public int getEvaluationCriteriaId() {
		return this.evaluationCriteriaId;
	}

	public void setEvaluationCriteriaId(int evaluationCriteriaId) {
		this.evaluationCriteriaId = evaluationCriteriaId;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
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

	public List<EvlEvaluationResult> getEvlEvaluationResults() {
		return this.evlEvaluationResults;
	}

	public void setEvlEvaluationResults(List<EvlEvaluationResult> evlEvaluationResults) {
		this.evlEvaluationResults = evlEvaluationResults;
	}

	public EvlEvaluationResult addEvlEvaluationResult(EvlEvaluationResult evlEvaluationResult) {
		getEvlEvaluationResults().add(evlEvaluationResult);
		evlEvaluationResult.setEvlEvaluationCriteria(this);

		return evlEvaluationResult;
	}

	public EvlEvaluationResult removeEvlEvaluationResult(EvlEvaluationResult evlEvaluationResult) {
		getEvlEvaluationResults().remove(evlEvaluationResult);
		evlEvaluationResult.setEvlEvaluationCriteria(null);

		return evlEvaluationResult;
	}

}