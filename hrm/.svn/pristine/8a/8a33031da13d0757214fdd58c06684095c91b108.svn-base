package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the rcm_candidate database table.
 * 
 */
@Entity
@Table(name="rcm_candidate")
@NamedQuery(name="RcmCandidate.findAll", query="SELECT r FROM RcmCandidate r")
public class RcmCandidate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="candidate_id")
	private int candidateId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Lob
	private String description;

	private String email;

	@Column(name="link_cv")
	private String linkCv;

	private String name;

	private String phone;

	private int priority;

	private String status;

	private int step;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to RcmRecruitmentPlan
	@ManyToOne
	@JoinColumn(name="recruitment_id")
	private RcmRecruitmentPlan rcmRecruitmentPlan;

	//bi-directional many-to-one association to RcmCandidateCalendar
	@OneToMany(mappedBy="rcmCandidate")
	private List<RcmCandidateCalendar> rcmCandidateCalendars;

	public RcmCandidate() {
	}

	public int getCandidateId() {
		return this.candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLinkCv() {
		return this.linkCv;
	}

	public void setLinkCv(String linkCv) {
		this.linkCv = linkCv;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStep() {
		return this.step;
	}

	public void setStep(int step) {
		this.step = step;
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

	public RcmRecruitmentPlan getRcmRecruitmentPlan() {
		return this.rcmRecruitmentPlan;
	}

	public void setRcmRecruitmentPlan(RcmRecruitmentPlan rcmRecruitmentPlan) {
		this.rcmRecruitmentPlan = rcmRecruitmentPlan;
	}

	public List<RcmCandidateCalendar> getRcmCandidateCalendars() {
		return this.rcmCandidateCalendars;
	}

	public void setRcmCandidateCalendars(List<RcmCandidateCalendar> rcmCandidateCalendars) {
		this.rcmCandidateCalendars = rcmCandidateCalendars;
	}

	public RcmCandidateCalendar addRcmCandidateCalendar(RcmCandidateCalendar rcmCandidateCalendar) {
		getRcmCandidateCalendars().add(rcmCandidateCalendar);
		rcmCandidateCalendar.setRcmCandidate(this);

		return rcmCandidateCalendar;
	}

	public RcmCandidateCalendar removeRcmCandidateCalendar(RcmCandidateCalendar rcmCandidateCalendar) {
		getRcmCandidateCalendars().remove(rcmCandidateCalendar);
		rcmCandidateCalendar.setRcmCandidate(null);

		return rcmCandidateCalendar;
	}

}