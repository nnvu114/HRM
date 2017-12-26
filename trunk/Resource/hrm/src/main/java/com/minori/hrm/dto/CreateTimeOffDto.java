package com.minori.hrm.dto;

import java.sql.Timestamp;

public class CreateTimeOffDto {

	private Integer employeeId;

	private Integer requestType;

	private Long startLeaveDate;

	private Long endLeaveDate;

	private String reasonDes;

	private Integer status;

	private Integer appraiserId;

	private Timestamp createdDate;

	private String createdBy;

	private Integer leaveRequestId;

	private float duration;

	private String nameLeaveReason;

	private Integer leaveReasonId;
	
	private String approveBy;

	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the requestType
	 */
	public Integer getRequestType() {
		return requestType;
	}

	/**
	 * @param requestType
	 *            the requestType to set
	 */
	public void setRequestType(Integer requestType) {
		this.requestType = requestType;
	}

	/**
	 * @return the startLeaveDate
	 */
	public Long getStartLeaveDate() {
		return startLeaveDate;
	}

	/**
	 * @param startLeaveDate
	 *            the startLeaveDate to set
	 */
	public void setStartLeaveDate(Long startLeaveDate) {
		this.startLeaveDate = startLeaveDate;
	}

	/**
	 * @return the endLeaveDate
	 */
	public Long getEndLeaveDate() {
		return endLeaveDate;
	}

	/**
	 * @param endLeaveDate
	 *            the endLeaveDate to set
	 */
	public void setEndLeaveDate(Long endLeaveDate) {
		this.endLeaveDate = endLeaveDate;
	}

	/**
	 * @return the reasonDes
	 */
	public String getReasonDes() {
		return reasonDes;
	}

	/**
	 * @param reasonDes
	 *            the reasonDes to set
	 */
	public void setReasonDes(String reasonDes) {
		this.reasonDes = reasonDes;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the appraiserId
	 */
	public Integer getAppraiserId() {
		return appraiserId;
	}

	/**
	 * @param appraiserId
	 *            the appraiserId to set
	 */
	public void setAppraiserId(Integer appraiserId) {
		this.appraiserId = appraiserId;
	}

	/**
	 * @return the createdDate
	 */
	public Timestamp getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the leaveRequestId
	 */
	public Integer getLeaveRequestId() {
		return leaveRequestId;
	}

	/**
	 * @return the duration
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * @return the nameLeaveReason
	 */
	public String getNameLeaveReason() {
		return nameLeaveReason;
	}

	/**
	 * @param leaveRequestId
	 *            the leaveRequestId to set
	 */
	public void setLeaveRequestId(Integer leaveRequestId) {
		this.leaveRequestId = leaveRequestId;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(float duration) {
		this.duration = duration;
	}

	/**
	 * @param nameLeaveReason
	 *            the nameLeaveReason to set
	 */
	public void setNameLeaveReason(String nameLeaveReason) {
		this.nameLeaveReason = nameLeaveReason;
	}

	/**
	 * @return the leaveReasonId
	 */
	public Integer getLeaveReasonId() {
		return leaveReasonId;
	}

	/**
	 * @param leaveReasonId
	 *            the leaveReasonId to set
	 */
	public void setLeaveReasonId(Integer leaveReasonId) {
		this.leaveReasonId = leaveReasonId;
	}

	/**
	 * @return the approveBy
	 */
	public String getApproveBy() {
		return approveBy;
	}

	/**
	 * @param approveBy the approveBy to set
	 */
	public void setApproveBy(String approveBy) {
		this.approveBy = approveBy;
	}

}
