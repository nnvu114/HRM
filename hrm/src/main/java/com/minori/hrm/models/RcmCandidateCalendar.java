package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the rcm_candidate_calendar database table.
 * 
 */
@Entity
@Table(name="rcm_candidate_calendar")
@NamedQuery(name="RcmCandidateCalendar.findAll", query="SELECT r FROM RcmCandidateCalendar r")
public class RcmCandidateCalendar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="candidate_calendar_id")
	private int candidateCalendarId;

	private String address;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Lob
	private String description;

	@Column(name="interview_date")
	private Timestamp interviewDate;

	private int priority;

	private int result;

	private String room;

	private int status;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	@Column(name="work_day_expected")
	private Timestamp workDayExpected;

	//bi-directional many-to-one association to RcmCandidate
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private RcmCandidate rcmCandidate;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="interviewer_id")
	private Employee employee;

	public RcmCandidateCalendar() {
	}

	public int getCandidateCalendarId() {
		return this.candidateCalendarId;
	}

	public void setCandidateCalendarId(int candidateCalendarId) {
		this.candidateCalendarId = candidateCalendarId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getInterviewDate() {
		return this.interviewDate;
	}

	public void setInterviewDate(Timestamp interviewDate) {
		this.interviewDate = interviewDate;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getResult() {
		return this.result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getRoom() {
		return this.room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public Timestamp getWorkDayExpected() {
		return this.workDayExpected;
	}

	public void setWorkDayExpected(Timestamp workDayExpected) {
		this.workDayExpected = workDayExpected;
	}

	public RcmCandidate getRcmCandidate() {
		return this.rcmCandidate;
	}

	public void setRcmCandidate(RcmCandidate rcmCandidate) {
		this.rcmCandidate = rcmCandidate;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}