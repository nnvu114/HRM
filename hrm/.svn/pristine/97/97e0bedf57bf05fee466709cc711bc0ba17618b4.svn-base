package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the evl_feedback_kpi database table.
 * 
 */
@Entity
@Table(name="evl_feedback_kpi")
@NamedQuery(name="EvlFeedbackKpi.findAll", query="SELECT e FROM EvlFeedbackKpi e")
public class EvlFeedbackKpi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="feedback_kpi_id")
	private int feedbackKpiId;

	@Lob
	private String content;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	private String feedbacker;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to EvlKpi
	@ManyToOne
	@JoinColumn(name="kpi_id")
	private EvlKpi evlKpi;

	public EvlFeedbackKpi() {
	}

	public int getFeedbackKpiId() {
		return this.feedbackKpiId;
	}

	public void setFeedbackKpiId(int feedbackKpiId) {
		this.feedbackKpiId = feedbackKpiId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public String getFeedbacker() {
		return this.feedbacker;
	}

	public void setFeedbacker(String feedbacker) {
		this.feedbacker = feedbacker;
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

	public EvlKpi getEvlKpi() {
		return this.evlKpi;
	}

	public void setEvlKpi(EvlKpi evlKpi) {
		this.evlKpi = evlKpi;
	}

}