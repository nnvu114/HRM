package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the holidays_calendar database table.
 * 
 */
@Entity
@Table(name="holidays_calendar")
@NamedQuery(name="HolidaysCalendar.findAll", query="SELECT h FROM HolidaysCalendar h")
public class HolidaysCalendar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="holidays_calendar_id")
	private int holidaysCalendarId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="from_day")
	private Timestamp fromDay;

	@Lob
	@Column(name="holiday_des")
	private String holidayDes;

	@Column(name="holiday_name")
	private String holidayName;

	@Column(name="holiday_type")
	private String holidayType;

	@Column(name="to_day")
	private Timestamp toDay;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	@Temporal(TemporalType.DATE)
	private Date years;

	public HolidaysCalendar() {
	}

	public int getHolidaysCalendarId() {
		return this.holidaysCalendarId;
	}

	public void setHolidaysCalendarId(int holidaysCalendarId) {
		this.holidaysCalendarId = holidaysCalendarId;
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

	public Timestamp getFromDay() {
		return this.fromDay;
	}

	public void setFromDay(Timestamp fromDay) {
		this.fromDay = fromDay;
	}

	public String getHolidayDes() {
		return this.holidayDes;
	}

	public void setHolidayDes(String holidayDes) {
		this.holidayDes = holidayDes;
	}

	public String getHolidayName() {
		return this.holidayName;
	}

	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}

	public String getHolidayType() {
		return this.holidayType;
	}

	public void setHolidayType(String holidayType) {
		this.holidayType = holidayType;
	}

	public Timestamp getToDay() {
		return this.toDay;
	}

	public void setToDay(Timestamp toDay) {
		this.toDay = toDay;
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

	public Date getYears() {
		return this.years;
	}

	public void setYears(Date years) {
		this.years = years;
	}

}