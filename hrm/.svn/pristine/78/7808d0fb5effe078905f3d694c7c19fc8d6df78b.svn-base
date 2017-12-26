package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the wkt_working_time_history database table.
 * 
 */
@Entity
@Table(name="wkt_working_time_history")
@NamedQuery(name="WktWorkingTimeHistory.findAll", query="SELECT w FROM WktWorkingTimeHistory w")
public class WktWorkingTimeHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="working_time_id")
	private int workingTimeId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="early_time")
	private int earlyTime;

	@Column(name="employee_id")
	private int employeeId;

	@Column(name="first_check_in")
	private String firstCheckIn;

	@Column(name="last_check_out")
	private String lastCheckOut;

	@Column(name="late_time")
	private int lateTime;

	@Column(name="overtime_total")
	private int overtimeTotal;

	@Lob
	@Column(name="total_working_time")
	private String totalWorkingTime;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	@Temporal(TemporalType.DATE)
	@Column(name="woking_date")
	private Date wokingDate;

	//bi-directional many-to-one association to ConfigWorkShift
	@ManyToOne
	@JoinColumn(name="working_shift_setting_id")
	private ConfigWorkShift configWorkShift;

	public WktWorkingTimeHistory() {
	}

	public int getWorkingTimeId() {
		return this.workingTimeId;
	}

	public void setWorkingTimeId(int workingTimeId) {
		this.workingTimeId = workingTimeId;
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

	public int getEarlyTime() {
		return this.earlyTime;
	}

	public void setEarlyTime(int earlyTime) {
		this.earlyTime = earlyTime;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public int getLateTime() {
		return this.lateTime;
	}

	public void setLateTime(int lateTime) {
		this.lateTime = lateTime;
	}

	public int getOvertimeTotal() {
		return this.overtimeTotal;
	}

	public void setOvertimeTotal(int overtimeTotal) {
		this.overtimeTotal = overtimeTotal;
	}

	public String getTotalWorkingTime() {
		return this.totalWorkingTime;
	}

	public void setTotalWorkingTime(String totalWorkingTime) {
		this.totalWorkingTime = totalWorkingTime;
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

	public Date getWokingDate() {
		return this.wokingDate;
	}

	public void setWokingDate(Date wokingDate) {
		this.wokingDate = wokingDate;
	}

	public ConfigWorkShift getConfigWorkShift() {
		return this.configWorkShift;
	}

	public void setConfigWorkShift(ConfigWorkShift configWorkShift) {
		this.configWorkShift = configWorkShift;
	}

}