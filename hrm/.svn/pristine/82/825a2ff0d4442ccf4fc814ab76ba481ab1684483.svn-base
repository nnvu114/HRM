package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the wkt_working_time_request database table.
 * 
 */
@Entity
@Table(name="wkt_working_time_request")
@NamedQuery(name="WktWorkingTimeRequest.findAll", query="SELECT w FROM WktWorkingTimeRequest w")
public class WktWorkingTimeRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="working_time_request_id")
	private int workingTimeRequestId;

	@Column(name="approval_id")
	private int approvalId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="first_check_in")
	private String firstCheckIn;

	@Column(name="last_check_out")
	private String lastCheckOut;

	private int status;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to WktWorkingTime
	@ManyToOne
	@JoinColumn(name="working_time_id")
	private WktWorkingTime wktWorkingTime;

	public WktWorkingTimeRequest() {
	}

	public int getWorkingTimeRequestId() {
		return this.workingTimeRequestId;
	}

	public void setWorkingTimeRequestId(int workingTimeRequestId) {
		this.workingTimeRequestId = workingTimeRequestId;
	}

	public int getApprovalId() {
		return this.approvalId;
	}

	public void setApprovalId(int approvalId) {
		this.approvalId = approvalId;
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

	public String getFirstCheckIn() {
		return this.firstCheckIn;
	}

	public void setFirstCheckIn(String firstCheckIn) {
		this.firstCheckIn = firstCheckIn;
	}

	public String getLastCheckOut() {
		return this.lastCheckOut;
	}

	public void setLastCheckOut(String lastCheckOut) {
		this.lastCheckOut = lastCheckOut;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public WktWorkingTime getWktWorkingTime() {
		return this.wktWorkingTime;
	}

	public void setWktWorkingTime(WktWorkingTime wktWorkingTime) {
		this.wktWorkingTime = wktWorkingTime;
	}

}