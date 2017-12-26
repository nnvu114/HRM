package com.minori.hrm.form;

public class TimeOffForm {

	private Integer requestType;
	
	private Long startLeaveDate;
	
	private Long endLeaveDate;
	
	private String reasonDes;
	
	private Integer appraiserId;
	
	private int status;
	
	private String userName;

	private Integer leaveRequestId;
	
	private Long fromDay;
	
	private Long toDay;
	
	private int page;
	
	private int limit;
	
	private String reasonReject;
	
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
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
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

	/**
	 * @return the leaveRequestId
	 */
	public Integer getLeaveRequestId() {
		return leaveRequestId;
	}

	/**
	 * @param leaveRequestId the leaveRequestId to set
	 */
	public void setLeaveRequestId(Integer leaveRequestId) {
		this.leaveRequestId = leaveRequestId;
	}

	/**
	 * @return the fromDay
	 */
	public Long getFromDay() {
		return fromDay;
	}

	/**
	 * @return the toDay
	 */
	public Long getToDay() {
		return toDay;
	}

	/**
	 * @return the page
	 */
	public int getPage() {
		return page;
	}

	/**
	 * @return the limit
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * @param fromDay the fromDay to set
	 */
	public void setFromDay(Long fromDay) {
		this.fromDay = fromDay;
	}

	/**
	 * @param toDay the toDay to set
	 */
	public void setToDay(Long toDay) {
		this.toDay = toDay;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * @param limit the limit to set
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}

	/**
	 * @return the reasonReject
	 */
	public String getReasonReject() {
		return reasonReject;
	}

	/**
	 * @param reasonReject the reasonReject to set
	 */
	public void setReasonReject(String reasonReject) {
		this.reasonReject = reasonReject;
	}

}
