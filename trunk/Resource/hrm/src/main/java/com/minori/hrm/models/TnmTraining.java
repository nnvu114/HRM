package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the tnm_training database table.
 * 
 */
@Entity
@Table(name="tnm_training")
@NamedQuery(name="TnmTraining.findAll", query="SELECT t FROM TnmTraining t")
public class TnmTraining implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="training_id")
	private int trainingId;

	@Column(name="approval_id")
	private int approvalId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="day_of_week")
	private String dayOfWeek;

	private int delete;

	@Column(name="end_date")
	private Timestamp endDate;

	@Column(name="end_time")
	private Time endTime;

	@Column(name="link_download")
	private String linkDownload;

	@Column(name="room_name")
	private String roomName;

	@Column(name="start_date")
	private Timestamp startDate;

	@Column(name="start_time")
	private Time startTime;

	private int status;

	@Column(name="total_time")
	private int totalTime;

	@Column(name="trainer_id")
	private int trainerId;

	@Lob
	@Column(name="training_des")
	private String trainingDes;

	@Column(name="training_name")
	private String trainingName;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to TnmInformTraining
	@OneToMany(mappedBy="tnmTraining")
	private List<TnmInformTraining> tnmInformTrainings;

	public TnmTraining() {
	}

	public int getTrainingId() {
		return this.trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public int getApprovalId() {
		return this.approvalId;
	}

	public void setApprovalId(int approvalId) {
		this.approvalId = approvalId;
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

	public String getDayOfWeek() {
		return this.dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public int getDelete() {
		return this.delete;
	}

	public void setDelete(int delete) {
		this.delete = delete;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public String getLinkDownload() {
		return this.linkDownload;
	}

	public void setLinkDownload(String linkDownload) {
		this.linkDownload = linkDownload;
	}

	public String getRoomName() {
		return this.roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTotalTime() {
		return this.totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public int getTrainerId() {
		return this.trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainingDes() {
		return this.trainingDes;
	}

	public void setTrainingDes(String trainingDes) {
		this.trainingDes = trainingDes;
	}

	public String getTrainingName() {
		return this.trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
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

	public List<TnmInformTraining> getTnmInformTrainings() {
		return this.tnmInformTrainings;
	}

	public void setTnmInformTrainings(List<TnmInformTraining> tnmInformTrainings) {
		this.tnmInformTrainings = tnmInformTrainings;
	}

	public TnmInformTraining addTnmInformTraining(TnmInformTraining tnmInformTraining) {
		getTnmInformTrainings().add(tnmInformTraining);
		tnmInformTraining.setTnmTraining(this);

		return tnmInformTraining;
	}

	public TnmInformTraining removeTnmInformTraining(TnmInformTraining tnmInformTraining) {
		getTnmInformTrainings().remove(tnmInformTraining);
		tnmInformTraining.setTnmTraining(null);

		return tnmInformTraining;
	}

}