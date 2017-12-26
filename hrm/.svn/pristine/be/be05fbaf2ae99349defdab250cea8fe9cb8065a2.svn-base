package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the evl_kpi database table.
 * 
 */
@Entity
@Table(name="evl_kpi")
@NamedQuery(name="EvlKpi.findAll", query="SELECT e FROM EvlKpi e")
public class EvlKpi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kpi_id")
	private int kpiId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="delete_status")
	private int deleteStatus;

	private Timestamp from;

	private String name;

	private float result;

	private int status;

	private Timestamp to;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to EvlFeedbackKpi
	@OneToMany(mappedBy="evlKpi")
	private List<EvlFeedbackKpi> evlFeedbackKpis;

	//bi-directional many-to-one association to EvlKpiCriteria
	@OneToMany(mappedBy="evlKpi")
	private List<EvlKpiCriteria> evlKpiCriterias;

	//bi-directional many-to-one association to EvlKpiResult
	@OneToMany(mappedBy="evlKpi")
	private List<EvlKpiResult> evlKpiResults;

	public EvlKpi() {
	}

	public int getKpiId() {
		return this.kpiId;
	}

	public void setKpiId(int kpiId) {
		this.kpiId = kpiId;
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

	public int getDeleteStatus() {
		return this.deleteStatus;
	}

	public void setDeleteStatus(int deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public Timestamp getFrom() {
		return this.from;
	}

	public void setFrom(Timestamp from) {
		this.from = from;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getResult() {
		return this.result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Timestamp getTo() {
		return this.to;
	}

	public void setTo(Timestamp to) {
		this.to = to;
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

	public List<EvlFeedbackKpi> getEvlFeedbackKpis() {
		return this.evlFeedbackKpis;
	}

	public void setEvlFeedbackKpis(List<EvlFeedbackKpi> evlFeedbackKpis) {
		this.evlFeedbackKpis = evlFeedbackKpis;
	}

	public EvlFeedbackKpi addEvlFeedbackKpi(EvlFeedbackKpi evlFeedbackKpi) {
		getEvlFeedbackKpis().add(evlFeedbackKpi);
		evlFeedbackKpi.setEvlKpi(this);

		return evlFeedbackKpi;
	}

	public EvlFeedbackKpi removeEvlFeedbackKpi(EvlFeedbackKpi evlFeedbackKpi) {
		getEvlFeedbackKpis().remove(evlFeedbackKpi);
		evlFeedbackKpi.setEvlKpi(null);

		return evlFeedbackKpi;
	}

	public List<EvlKpiCriteria> getEvlKpiCriterias() {
		return this.evlKpiCriterias;
	}

	public void setEvlKpiCriterias(List<EvlKpiCriteria> evlKpiCriterias) {
		this.evlKpiCriterias = evlKpiCriterias;
	}

	public EvlKpiCriteria addEvlKpiCriteria(EvlKpiCriteria evlKpiCriteria) {
		getEvlKpiCriterias().add(evlKpiCriteria);
		evlKpiCriteria.setEvlKpi(this);

		return evlKpiCriteria;
	}

	public EvlKpiCriteria removeEvlKpiCriteria(EvlKpiCriteria evlKpiCriteria) {
		getEvlKpiCriterias().remove(evlKpiCriteria);
		evlKpiCriteria.setEvlKpi(null);

		return evlKpiCriteria;
	}

	public List<EvlKpiResult> getEvlKpiResults() {
		return this.evlKpiResults;
	}

	public void setEvlKpiResults(List<EvlKpiResult> evlKpiResults) {
		this.evlKpiResults = evlKpiResults;
	}

	public EvlKpiResult addEvlKpiResult(EvlKpiResult evlKpiResult) {
		getEvlKpiResults().add(evlKpiResult);
		evlKpiResult.setEvlKpi(this);

		return evlKpiResult;
	}

	public EvlKpiResult removeEvlKpiResult(EvlKpiResult evlKpiResult) {
		getEvlKpiResults().remove(evlKpiResult);
		evlKpiResult.setEvlKpi(null);

		return evlKpiResult;
	}

}