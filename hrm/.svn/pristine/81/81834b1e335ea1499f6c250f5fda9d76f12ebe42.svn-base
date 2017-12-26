package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the master_evaluation database table.
 * 
 */
@Entity
@Table(name="master_evaluation")
@NamedQuery(name="MasterEvaluation.findAll", query="SELECT m FROM MasterEvaluation m")
public class MasterEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="evaluation_master_id")
	private int evaluationMasterId;

	@Lob
	@Column(name="evaluation_des")
	private String evaluationDes;

	@Column(name="evaluation_title")
	private String evaluationTitle;

	public MasterEvaluation() {
	}

	public int getEvaluationMasterId() {
		return this.evaluationMasterId;
	}

	public void setEvaluationMasterId(int evaluationMasterId) {
		this.evaluationMasterId = evaluationMasterId;
	}

	public String getEvaluationDes() {
		return this.evaluationDes;
	}

	public void setEvaluationDes(String evaluationDes) {
		this.evaluationDes = evaluationDes;
	}

	public String getEvaluationTitle() {
		return this.evaluationTitle;
	}

	public void setEvaluationTitle(String evaluationTitle) {
		this.evaluationTitle = evaluationTitle;
	}

}