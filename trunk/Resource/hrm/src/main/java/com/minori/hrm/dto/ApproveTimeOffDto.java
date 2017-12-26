package com.minori.hrm.dto;

/**
 * 
 * @author KhanhNM
 *
 */
public class ApproveTimeOffDto {

	private int leaveRequestId;
	
	private String reasonReject;
	
	private int status;

	/**
	 * @return the leaveRequestId
	 */
	public int getLeaveRequestId() {
		return leaveRequestId;
	}

	/**
	 * @param leaveRequestId the leaveRequestId to set
	 */
	public void setLeaveRequestId(int leaveRequestId) {
		this.leaveRequestId = leaveRequestId;
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
}
