package com.minori.hrm.dto;

import java.sql.Timestamp;

public class EditTimeOffDto {

	private Integer employeeId;
	
	private Integer requestType;
	
	private Long startLeaveDate;
	
	private Long endLeaveDate;
	
	private String reasonDes;
	
	private Integer status;
	
	private Integer appraiserId;
	
	private Timestamp updatedDate;
	
	private String updatedBy;

	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
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
	 * @param requestType the requestType to set
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
	 * @param startLeaveDate the startLeaveDate to set
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
	 * @param endLeaveDate the endLeaveDate to set
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
	 * @param reasonDes the reasonDes to set
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
	 * @param status the status to set
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
	 * @param appraiserId the appraiserId to set
	 */
	public void setAppraiserId(Integer appraiserId) {
		this.appraiserId = appraiserId;
	}

	/**
	 * @return the updatedDate
	 */
	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}