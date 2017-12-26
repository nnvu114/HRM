package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the wkt_working_time database table.
 * 
 */
@Entity
@Table(name="wkt_working_time")
@NamedQuery(name="WktWorkingTime.findAll", query="SELECT w FROM WktWorkingTime w")
public class WktWorkingTime implements Serializable {
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

	@Column(name="first_check_in")
	private String firstCheckIn;

	@Column(name="last_check_out")
	private String lastCheckOut;

	@Column(name="late_time")
	private int lateTime;

	@Column(name="overnight_total")
	private int overnightTotal;

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

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	//bi-directional many-to-one association to ConfigWorkShift
	@ManyToOne
	@JoinColumn(name="working_shift_setting_id")
	private ConfigWorkShift configWorkShift;

	//bi-directional many-to-one association to WktWorkingTimeRequest
	@OneToMany(mappedBy="wktWorkingTime")
	private List<WktWorkingTimeRequest> wktWorkingTimeRequests;

	public WktWorkingTime() {
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

	public int getOvernightTotal() {
		return this.overnightTotal;
	}

	public void setOvernightTotal(int overnightTotal) {
		this.overnightTotal = overnightTotal;
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

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public ConfigWorkShift getConfigWorkShift() {
		return this.configWorkShift;
	}

	public void setConfigWorkShift(ConfigWorkShift configWorkShift) {
		this.configWorkShift = configWorkShift;
	}

	public List<WktWorkingTimeRequest> getWktWorkingTimeRequests() {
		return this.wktWorkingTimeRequests;
	}

	public void setWktWorkingTimeRequests(List<WktWorkingTimeRequest> wktWorkingTimeRequests) {
		this.wktWorkingTimeRequests = wktWorkingTimeRequests;
	}

	public WktWorkingTimeRequest addWktWorkingTimeRequest(WktWorkingTimeRequest wktWorkingTimeRequest) {
		getWktWorkingTimeRequests().add(wktWorkingTimeRequest);
		wktWorkingTimeRequest.setWktWorkingTime(this);

		return wktWorkingTimeRequest;
	}

	public WktWorkingTimeRequest removeWktWorkingTimeRequest(WktWorkingTimeRequest wktWorkingTimeRequest) {
		getWktWorkingTimeRequests().remove(wktWorkingTimeRequest);
		wktWorkingTimeRequest.setWktWorkingTime(null);

		return wktWorkingTimeRequest;
	}

}