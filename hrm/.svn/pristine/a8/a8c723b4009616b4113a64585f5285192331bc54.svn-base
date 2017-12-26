package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the rcm_recruitment_plan database table.
 * 
 */
@Entity
@Table(name="rcm_recruitment_plan")
@NamedQuery(name="RcmRecruitmentPlan.findAll", query="SELECT r FROM RcmRecruitmentPlan r")
public class RcmRecruitmentPlan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="recruitment_id")
	private int recruitmentId;

	@Column(name="appraiser_id")
	private int appraiserId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Lob
	private String description;

	@Column(name="end_date")
	private Timestamp endDate;

	private String name;

	@Column(name="position_master_id")
	private int positionMasterId;

	private int quantity;

	@Column(name="start_date")
	private Timestamp startDate;

	private int status;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to RcmCandidate
	@OneToMany(mappedBy="rcmRecruitmentPlan")
	private List<RcmCandidate> rcmCandidates;

	public RcmRecruitmentPlan() {
	}

	public int getRecruitmentId() {
		return this.recruitmentId;
	}

	public void setRecruitmentId(int recruitmentId) {
		this.recruitmentId = recruitmentId;
	}

	public int getAppraiserId() {
		return this.appraiserId;
	}

	public void setAppraiserId(int appraiserId) {
		this.appraiserId = appraiserId;
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

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPositionMasterId() {
		return this.positionMasterId;
	}

	public void setPositionMasterId(int positionMasterId) {
		this.positionMasterId = positionMasterId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
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

	public List<RcmCandidate> getRcmCandidates() {
		return this.rcmCandidates;
	}

	public void setRcmCandidates(List<RcmCandidate> rcmCandidates) {
		this.rcmCandidates = rcmCandidates;
	}

	public RcmCandidate addRcmCandidate(RcmCandidate rcmCandidate) {
		getRcmCandidates().add(rcmCandidate);
		rcmCandidate.setRcmRecruitmentPlan(this);

		return rcmCandidate;
	}

	public RcmCandidate removeRcmCandidate(RcmCandidate rcmCandidate) {
		getRcmCandidates().remove(rcmCandidate);
		rcmCandidate.setRcmRecruitmentPlan(null);

		return rcmCandidate;
	}

}