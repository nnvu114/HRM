package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the wkt_leave_request database table.
 * 
 */
@Entity
@Table(name="wkt_leave_request")
@NamedQuery(name="WktLeaveRequest.findAll", query="SELECT w FROM WktLeaveRequest w")
public class WktLeaveRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="leave_request_id")
	private int leaveRequestId;

	@Column(name="appraiser_id")
	private int appraiserId;

	@Column(name="approved_by")
	private String approvedBy;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	private float duration;

	@Column(name="end_leave_date")
	private Timestamp endLeaveDate;

	@Lob
	@Column(name="reason_des")
	private String reasonDes;

	@Lob
	@Column(name="reason_reject")
	private String reasonReject;

	@Column(name="request_type")
	private int requestType;

	@Column(name="start_leave_date")
	private Timestamp startLeaveDate;

	private int status;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	//bi-directional many-to-one association to MasterLeaveReason
	@ManyToOne
	@JoinColumn(name="leave_reason_id")
	private MasterLeaveReason masterLeaveReason;

	public WktLeaveRequest() {
	}

	public int getLeaveRequestId() {
		return this.leaveRequestId;
	}

	public void setLeaveRequestId(int leaveRequestId) {
		this.leaveRequestId = leaveRequestId;
	}

	public int getAppraiserId() {
		return this.appraiserId;
	}

	public void setAppraiserId(int appraiserId) {
		this.appraiserId = appraiserId;
	}

	public String getApprovedBy() {
		return this.approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
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

	public float getDuration() {
		return this.duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public Timestamp getEndLeaveDate() {
		return this.endLeaveDate;
	}

	public void setEndLeaveDate(Timestamp endLeaveDate) {
		this.endLeaveDate = endLeaveDate;
	}

	public String getReasonDes() {
		return this.reasonDes;
	}

	public void setReasonDes(String reasonDes) {
		this.reasonDes = reasonDes;
	}

	public String getReasonReject() {
		return this.reasonReject;
	}

	public void setReasonReject(String reasonReject) {
		this.reasonReject = reasonReject;
	}

	public int getRequestType() {
		return this.requestType;
	}

	public void setRequestType(int requestType) {
		this.requestType = requestType;
	}

	public Timestamp getStartLeaveDate() {
		return this.startLeaveDate;
	}

	public void setStartLeaveDate(Timestamp startLeaveDate) {
		this.startLeaveDate = startLeaveDate;
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

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public MasterLeaveReason getMasterLeaveReason() {
		return this.masterLeaveReason;
	}

	public void setMasterLeaveReason(MasterLeaveReason masterLeaveReason) {
		this.masterLeaveReason = masterLeaveReason;
	}

}