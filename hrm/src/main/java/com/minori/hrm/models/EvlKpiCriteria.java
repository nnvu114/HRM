package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the evl_kpi_criteria database table.
 * 
 */
@Entity
@Table(name="evl_kpi_criteria")
@NamedQuery(name="EvlKpiCriteria.findAll", query="SELECT e FROM EvlKpiCriteria e")
public class EvlKpiCriteria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kpi_criteria_id")
	private int kpiCriteriaId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	private String name;

	@Lob
	private String note;

	private String target;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	private float weight;

	//bi-directional many-to-one association to EvlKpi
	@ManyToOne
	@JoinColumn(name="kpi_id")
	private EvlKpi evlKpi;

	public EvlKpiCriteria() {
	}

	public int getKpiCriteriaId() {
		return this.kpiCriteriaId;
	}

	public void setKpiCriteriaId(int kpiCriteriaId) {
		this.kpiCriteriaId = kpiCriteriaId;
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

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
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

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public EvlKpi getEvlKpi() {
		return this.evlKpi;
	}

	public void setEvlKpi(EvlKpi evlKpi) {
		this.evlKpi = evlKpi;
	}

}