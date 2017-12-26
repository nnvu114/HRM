package com.minori.hrm.form;

public class CreateTimeOffForm {

	private Integer requestType;
	
	private Long startLeaveDate;
	
	private Long endLeaveDate;
	
	private String reasonDes;
	
	private Integer appraiserId;
	
	private Integer status;
	
	private String userName;

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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
