package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the wkt_overtime_request database table.
 * 
 */
@Entity
@Table(name="wkt_overtime_request")
@NamedQuery(name="WktOvertimeRequest.findAll", query="SELECT w FROM WktOvertimeRequest w")
public class WktOvertimeRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="request_id")
	private int requestId;

	@Column(name="appraiser_id")
	private int appraiserId;

	@Column(name="approved_by")
	private String approvedBy;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="end_date")
	private Timestamp endDate;

	@Column(name="end_time")
	private String endTime;

	@Lob
	@Column(name="reason_des")
	private String reasonDes;

	@Lob
	@Column(name="reason_reject")
	private String reasonReject;

	@Column(name="reason_title")
	private String reasonTitle;

	@Column(name="start_date")
	private Timestamp startDate;

	@Column(name="start_time")
	private String startTime;

	private int status;

	@Column(name="total_time")
	private int totalTime;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	//bi-directional many-to-one association to MasterOvertime
	@ManyToOne
	@JoinColumn(name="overtime_master_id")
	private MasterOvertime masterOvertime;

	public WktOvertimeRequest() {
	}

	public int getRequestId() {
		return this.requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
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

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public String getReasonTitle() {
		return this.reasonTitle;
	}

	public void setReasonTitle(String reasonTitle) {
		this.reasonTitle = reasonTitle;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTotalTime() {
		return this.totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
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

	public MasterOvertime getMasterOvertime() {
		return this.masterOvertime;
	}

	public void setMasterOvertime(MasterOvertime masterOvertime) {
		this.masterOvertime = masterOvertime;
	}

}