package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the master_overtime database table.
 * 
 */
@Entity
@Table(name="master_overtime")
@NamedQuery(name="MasterOvertime.findAll", query="SELECT m FROM MasterOvertime m")
public class MasterOvertime implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="overtime_master_id")
	private int overtimeMasterId;

	private float coefficients;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Lob
	@Column(name="overtime_des")
	private String overtimeDes;

	@Column(name="overtime_name")
	private String overtimeName;

	@Column(name="overtime_type")
	private int overtimeType;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to WktOvertimeRequest
	@OneToMany(mappedBy="masterOvertime")
	private List<WktOvertimeRequest> wktOvertimeRequests;

	public MasterOvertime() {
	}

	public int getOvertimeMasterId() {
		return this.overtimeMasterId;
	}

	public void setOvertimeMasterId(int overtimeMasterId) {
		this.overtimeMasterId = overtimeMasterId;
	}

	public float getCoefficients() {
		return this.coefficients;
	}

	public void setCoefficients(float coefficients) {
		this.coefficients = coefficients;
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

	public String getOvertimeDes() {
		return this.overtimeDes;
	}

	public void setOvertimeDes(String overtimeDes) {
		this.overtimeDes = overtimeDes;
	}

	public String getOvertimeName() {
		return this.overtimeName;
	}

	public void setOvertimeName(String overtimeName) {
		this.overtimeName = overtimeName;
	}

	public int getOvertimeType() {
		return this.overtimeType;
	}

	public void setOvertimeType(int overtimeType) {
		this.overtimeType = overtimeType;
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

	public List<WktOvertimeRequest> getWktOvertimeRequests() {
		return this.wktOvertimeRequests;
	}

	public void setWktOvertimeRequests(List<WktOvertimeRequest> wktOvertimeRequests) {
		this.wktOvertimeRequests = wktOvertimeRequests;
	}

	public WktOvertimeRequest addWktOvertimeRequest(WktOvertimeRequest wktOvertimeRequest) {
		getWktOvertimeRequests().add(wktOvertimeRequest);
		wktOvertimeRequest.setMasterOvertime(this);

		return wktOvertimeRequest;
	}

	public WktOvertimeRequest removeWktOvertimeRequest(WktOvertimeRequest wktOvertimeRequest) {
		getWktOvertimeRequests().remove(wktOvertimeRequest);
		wktOvertimeRequest.setMasterOvertime(null);

		return wktOvertimeRequest;
	}

}