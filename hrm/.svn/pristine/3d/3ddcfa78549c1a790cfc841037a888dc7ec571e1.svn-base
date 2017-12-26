package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the master_leave_reason database table.
 * 
 */
@Entity
@Table(name="master_leave_reason")
@NamedQuery(name="MasterLeaveReason.findAll", query="SELECT m FROM MasterLeaveReason m")
public class MasterLeaveReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="leave_reason_id")
	private int leaveReasonId;

	@Lob
	private String description;

	@Column(name="leave_type")
	private int leaveType;

	private String name;

	@Column(name="total_off_day")
	private String totalOffDay;

	//bi-directional many-to-one association to WktLeaveRequest
	@OneToMany(mappedBy="masterLeaveReason")
	private List<WktLeaveRequest> wktLeaveRequests;

	public MasterLeaveReason() {
	}

	public int getLeaveReasonId() {
		return this.leaveReasonId;
	}

	public void setLeaveReasonId(int leaveReasonId) {
		this.leaveReasonId = leaveReasonId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLeaveType() {
		return this.leaveType;
	}

	public void setLeaveType(int leaveType) {
		this.leaveType = leaveType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTotalOffDay() {
		return this.totalOffDay;
	}

	public void setTotalOffDay(String totalOffDay) {
		this.totalOffDay = totalOffDay;
	}

	public List<WktLeaveRequest> getWktLeaveRequests() {
		return this.wktLeaveRequests;
	}

	public void setWktLeaveRequests(List<WktLeaveRequest> wktLeaveRequests) {
		this.wktLeaveRequests = wktLeaveRequests;
	}

	public WktLeaveRequest addWktLeaveRequest(WktLeaveRequest wktLeaveRequest) {
		getWktLeaveRequests().add(wktLeaveRequest);
		wktLeaveRequest.setMasterLeaveReason(this);

		return wktLeaveRequest;
	}

	public WktLeaveRequest removeWktLeaveRequest(WktLeaveRequest wktLeaveRequest) {
		getWktLeaveRequests().remove(wktLeaveRequest);
		wktLeaveRequest.setMasterLeaveReason(null);

		return wktLeaveRequest;
	}

}