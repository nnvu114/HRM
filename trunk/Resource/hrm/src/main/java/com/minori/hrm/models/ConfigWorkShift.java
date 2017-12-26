package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the config_work_shift database table.
 * 
 */
@Entity
@Table(name="config_work_shift")
@NamedQuery(name="ConfigWorkShift.findAll", query="SELECT c FROM ConfigWorkShift c")
public class ConfigWorkShift implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="work_shift_setting_id")
	private int workShiftSettingId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="end_time")
	private Time endTime;

	private String name;

	@Column(name="split_rate")
	private float splitRate;

	@Column(name="start_time")
	private Time startTime;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to WktWorkingTime
	@OneToMany(mappedBy="configWorkShift")
	private List<WktWorkingTime> wktWorkingTimes;

	//bi-directional many-to-one association to WktWorkingTimeHistory
	@OneToMany(mappedBy="configWorkShift")
	private List<WktWorkingTimeHistory> wktWorkingTimeHistories;

	public ConfigWorkShift() {
	}

	public int getWorkShiftSettingId() {
		return this.workShiftSettingId;
	}

	public void setWorkShiftSettingId(int workShiftSettingId) {
		this.workShiftSettingId = workShiftSettingId;
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

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSplitRate() {
		return this.splitRate;
	}

	public void setSplitRate(float splitRate) {
		this.splitRate = splitRate;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
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

	public List<WktWorkingTime> getWktWorkingTimes() {
		return this.wktWorkingTimes;
	}

	public void setWktWorkingTimes(List<WktWorkingTime> wktWorkingTimes) {
		this.wktWorkingTimes = wktWorkingTimes;
	}

	public WktWorkingTime addWktWorkingTime(WktWorkingTime wktWorkingTime) {
		getWktWorkingTimes().add(wktWorkingTime);
		wktWorkingTime.setConfigWorkShift(this);

		return wktWorkingTime;
	}

	public WktWorkingTime removeWktWorkingTime(WktWorkingTime wktWorkingTime) {
		getWktWorkingTimes().remove(wktWorkingTime);
		wktWorkingTime.setConfigWorkShift(null);

		return wktWorkingTime;
	}

	public List<WktWorkingTimeHistory> getWktWorkingTimeHistories() {
		return this.wktWorkingTimeHistories;
	}

	public void setWktWorkingTimeHistories(List<WktWorkingTimeHistory> wktWorkingTimeHistories) {
		this.wktWorkingTimeHistories = wktWorkingTimeHistories;
	}

	public WktWorkingTimeHistory addWktWorkingTimeHistory(WktWorkingTimeHistory wktWorkingTimeHistory) {
		getWktWorkingTimeHistories().add(wktWorkingTimeHistory);
		wktWorkingTimeHistory.setConfigWorkShift(this);

		return wktWorkingTimeHistory;
	}

	public WktWorkingTimeHistory removeWktWorkingTimeHistory(WktWorkingTimeHistory wktWorkingTimeHistory) {
		getWktWorkingTimeHistories().remove(wktWorkingTimeHistory);
		wktWorkingTimeHistory.setConfigWorkShift(null);

		return wktWorkingTimeHistory;
	}

}