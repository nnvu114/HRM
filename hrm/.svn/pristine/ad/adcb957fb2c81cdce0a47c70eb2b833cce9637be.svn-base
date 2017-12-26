package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the evl_kpi_result database table.
 * 
 */
@Entity
@Table(name="evl_kpi_result")
@NamedQuery(name="EvlKpiResult.findAll", query="SELECT e FROM EvlKpiResult e")
public class EvlKpiResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kpi_result_id")
	private int kpiResultId;

	@Lob
	private String comment;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	private float result;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	//bi-directional many-to-one association to EvlKpi
	@ManyToOne
	@JoinColumn(name="kpi_id")
	private EvlKpi evlKpi;

	public EvlKpiResult() {
	}

	public int getKpiResultId() {
		return this.kpiResultId;
	}

	public void setKpiResultId(int kpiResultId) {
		this.kpiResultId = kpiResultId;
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

	public float getResult() {
		return this.result;
	}

	public void setResult(float result) {
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

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EvlKpi getEvlKpi() {
		return this.evlKpi;
	}

	public void setEvlKpi(EvlKpi evlKpi) {
		this.evlKpi = evlKpi;
	}

}