package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int employeeId;

	@Lob
	private String address;

	private Timestamp birthday;

	@Column(name="blood_group")
	private String bloodGroup;

	@Column(name="country_id")
	private int countryId;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="day_enjoy")
	private Timestamp dayEnjoy;

	private String email;

	@Column(name="first_name")
	private String firstName;

	private int gender;

	@Column(name="identification_id")
	private String identificationId;

	@Column(name="identity_card")
	private String identityCard;

	@Column(name="last_name")
	private String lastName;

	@Column(name="leave_paid_remain")
	private int leavePaidRemain;

	@Column(name="married_status")
	private byte marriedStatus;

	private String national;

	@Lob
	private String photo;

	@Lob
	@Column(name="place_of_birth")
	private String placeOfBirth;

	@Lob
	@Column(name="skill_description")
	private String skillDescription;

	private int status;

	private String telephone;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	//bi-directional many-to-one association to EpmGroup
	@ManyToOne
	@JoinColumn(name="group_id")
	private EpmGroup epmGroup;

	//bi-directional many-to-one association to EpmAllowance
	@OneToMany(mappedBy="employee")
	private List<EpmAllowance> epmAllowances;

	//bi-directional many-to-one association to EpmAwardEmployee
	@OneToMany(mappedBy="employee")
	private List<EpmAwardEmployee> epmAwardEmployees;

	//bi-directional many-to-one association to EpmCetification
	@OneToMany(mappedBy="employee")
	private List<EpmCetification> epmCetifications;

	//bi-directional many-to-one association to EpmContract
	@OneToMany(mappedBy="employee")
	private List<EpmContract> epmContracts;

	//bi-directional many-to-one association to EpmDeduction
	@OneToMany(mappedBy="employee")
	private List<EpmDeduction> epmDeductions;

	//bi-directional many-to-one association to EpmExperience
	@OneToMany(mappedBy="employee")
	private List<EpmExperience> epmExperiences;

	//bi-directional many-to-one association to EpmMedicalRecord
	@OneToMany(mappedBy="employee")
	private List<EpmMedicalRecord> epmMedicalRecords;

	//bi-directional many-to-one association to EpmPosition
	@OneToMany(mappedBy="employee")
	private List<EpmPosition> epmPositions;

	//bi-directional many-to-one association to EpmRelationship
	@OneToMany(mappedBy="employee")
	private List<EpmRelationship> epmRelationships;

	//bi-directional many-to-one association to EvlEvaluation
	@OneToMany(mappedBy="employee")
	private List<EvlEvaluation> evlEvaluations;

	//bi-directional many-to-one association to EvlKpiResult
	@OneToMany(mappedBy="employee")
	private List<EvlKpiResult> evlKpiResults;

	//bi-directional many-to-one association to PrmPayroll
	@OneToMany(mappedBy="employee")
	private List<PrmPayroll> prmPayrolls;

	//bi-directional many-to-one association to PrmPayrollHistory
	@OneToMany(mappedBy="employee")
	private List<PrmPayrollHistory> prmPayrollHistories;

	//bi-directional many-to-one association to RcmCandidateCalendar
	@OneToMany(mappedBy="employee")
	private List<RcmCandidateCalendar> rcmCandidateCalendars;

	//bi-directional many-to-one association to TnmInformTraining
	@OneToMany(mappedBy="employee")
	private List<TnmInformTraining> tnmInformTrainings;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="employee")
	private List<User> users;

	//bi-directional many-to-one association to WktLeaveRequest
	@OneToMany(mappedBy="employee")
	private List<WktLeaveRequest> wktLeaveRequests;

	//bi-directional many-to-one association to WktOvertimeRequest
	@OneToMany(mappedBy="employee")
	private List<WktOvertimeRequest> wktOvertimeRequests;

	//bi-directional many-to-one association to WktWorkingTime
	@OneToMany(mappedBy="employee")
	private List<WktWorkingTime> wktWorkingTimes;

	public Employee() {
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
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

	public Timestamp getDayEnjoy() {
		return this.dayEnjoy;
	}

	public void setDayEnjoy(Timestamp dayEnjoy) {
		this.dayEnjoy = dayEnjoy;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getGender() {
		return this.gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getIdentificationId() {
		return this.identificationId;
	}

	public void setIdentificationId(String identificationId) {
		this.identificationId = identificationId;
	}

	public String getIdentityCard() {
		return this.identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getLeavePaidRemain() {
		return this.leavePaidRemain;
	}

	public void setLeavePaidRemain(int leavePaidRemain) {
		this.leavePaidRemain = leavePaidRemain;
	}

	public byte getMarriedStatus() {
		return this.marriedStatus;
	}

	public void setMarriedStatus(byte marriedStatus) {
		this.marriedStatus = marriedStatus;
	}

	public String getNational() {
		return this.national;
	}

	public void setNational(String national) {
		this.national = national;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPlaceOfBirth() {
		return this.placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getSkillDescription() {
		return this.skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

	public EpmGroup getEpmGroup() {
		return this.epmGroup;
	}

	public void setEpmGroup(EpmGroup epmGroup) {
		this.epmGroup = epmGroup;
	}

	public List<EpmAllowance> getEpmAllowances() {
		return this.epmAllowances;
	}

	public void setEpmAllowances(List<EpmAllowance> epmAllowances) {
		this.epmAllowances = epmAllowances;
	}

	public EpmAllowance addEpmAllowance(EpmAllowance epmAllowance) {
		getEpmAllowances().add(epmAllowance);
		epmAllowance.setEmployee(this);

		return epmAllowance;
	}

	public EpmAllowance removeEpmAllowance(EpmAllowance epmAllowance) {
		getEpmAllowances().remove(epmAllowance);
		epmAllowance.setEmployee(null);

		return epmAllowance;
	}

	public List<EpmAwardEmployee> getEpmAwardEmployees() {
		return this.epmAwardEmployees;
	}

	public void setEpmAwardEmployees(List<EpmAwardEmployee> epmAwardEmployees) {
		this.epmAwardEmployees = epmAwardEmployees;
	}

	public EpmAwardEmployee addEpmAwardEmployee(EpmAwardEmployee epmAwardEmployee) {
		getEpmAwardEmployees().add(epmAwardEmployee);
		epmAwardEmployee.setEmployee(this);

		return epmAwardEmployee;
	}

	public EpmAwardEmployee removeEpmAwardEmployee(EpmAwardEmployee epmAwardEmployee) {
		getEpmAwardEmployees().remove(epmAwardEmployee);
		epmAwardEmployee.setEmployee(null);

		return epmAwardEmployee;
	}

	public List<EpmCetification> getEpmCetifications() {
		return this.epmCetifications;
	}

	public void setEpmCetifications(List<EpmCetification> epmCetifications) {
		this.epmCetifications = epmCetifications;
	}

	public EpmCetification addEpmCetification(EpmCetification epmCetification) {
		getEpmCetifications().add(epmCetification);
		epmCetification.setEmployee(this);

		return epmCetification;
	}

	public EpmCetification removeEpmCetification(EpmCetification epmCetification) {
		getEpmCetifications().remove(epmCetification);
		epmCetification.setEmployee(null);

		return epmCetification;
	}

	public List<EpmContract> getEpmContracts() {
		return this.epmContracts;
	}

	public void setEpmContracts(List<EpmContract> epmContracts) {
		this.epmContracts = epmContracts;
	}

	public EpmContract addEpmContract(EpmContract epmContract) {
		getEpmContracts().add(epmContract);
		epmContract.setEmployee(this);

		return epmContract;
	}

	public EpmContract removeEpmContract(EpmContract epmContract) {
		getEpmContracts().remove(epmContract);
		epmContract.setEmployee(null);

		return epmContract;
	}

	public List<EpmDeduction> getEpmDeductions() {
		return this.epmDeductions;
	}

	public void setEpmDeductions(List<EpmDeduction> epmDeductions) {
		this.epmDeductions = epmDeductions;
	}

	public EpmDeduction addEpmDeduction(EpmDeduction epmDeduction) {
		getEpmDeductions().add(epmDeduction);
		epmDeduction.setEmployee(this);

		return epmDeduction;
	}

	public EpmDeduction removeEpmDeduction(EpmDeduction epmDeduction) {
		getEpmDeductions().remove(epmDeduction);
		epmDeduction.setEmployee(null);

		return epmDeduction;
	}

	public List<EpmExperience> getEpmExperiences() {
		return this.epmExperiences;
	}

	public void setEpmExperiences(List<EpmExperience> epmExperiences) {
		this.epmExperiences = epmExperiences;
	}

	public EpmExperience addEpmExperience(EpmExperience epmExperience) {
		getEpmExperiences().add(epmExperience);
		epmExperience.setEmployee(this);

		return epmExperience;
	}

	public EpmExperience removeEpmExperience(EpmExperience epmExperience) {
		getEpmExperiences().remove(epmExperience);
		epmExperience.setEmployee(null);

		return epmExperience;
	}

	public List<EpmMedicalRecord> getEpmMedicalRecords() {
		return this.epmMedicalRecords;
	}

	public void setEpmMedicalRecords(List<EpmMedicalRecord> epmMedicalRecords) {
		this.epmMedicalRecords = epmMedicalRecords;
	}

	public EpmMedicalRecord addEpmMedicalRecord(EpmMedicalRecord epmMedicalRecord) {
		getEpmMedicalRecords().add(epmMedicalRecord);
		epmMedicalRecord.setEmployee(this);

		return epmMedicalRecord;
	}

	public EpmMedicalRecord removeEpmMedicalRecord(EpmMedicalRecord epmMedicalRecord) {
		getEpmMedicalRecords().remove(epmMedicalRecord);
		epmMedicalRecord.setEmployee(null);

		return epmMedicalRecord;
	}

	public List<EpmPosition> getEpmPositions() {
		return this.epmPositions;
	}

	public void setEpmPositions(List<EpmPosition> epmPositions) {
		this.epmPositions = epmPositions;
	}

	public EpmPosition addEpmPosition(EpmPosition epmPosition) {
		getEpmPositions().add(epmPosition);
		epmPosition.setEmployee(this);

		return epmPosition;
	}

	public EpmPosition removeEpmPosition(EpmPosition epmPosition) {
		getEpmPositions().remove(epmPosition);
		epmPosition.setEmployee(null);

		return epmPosition;
	}

	public List<EpmRelationship> getEpmRelationships() {
		return this.epmRelationships;
	}

	public void setEpmRelationships(List<EpmRelationship> epmRelationships) {
		this.epmRelationships = epmRelationships;
	}

	public EpmRelationship addEpmRelationship(EpmRelationship epmRelationship) {
		getEpmRelationships().add(epmRelationship);
		epmRelationship.setEmployee(this);

		return epmRelationship;
	}

	public EpmRelationship removeEpmRelationship(EpmRelationship epmRelationship) {
		getEpmRelationships().remove(epmRelationship);
		epmRelationship.setEmployee(null);

		return epmRelationship;
	}

	public List<EvlEvaluation> getEvlEvaluations() {
		return this.evlEvaluations;
	}

	public void setEvlEvaluations(List<EvlEvaluation> evlEvaluations) {
		this.evlEvaluations = evlEvaluations;
	}

	public EvlEvaluation addEvlEvaluation(EvlEvaluation evlEvaluation) {
		getEvlEvaluations().add(evlEvaluation);
		evlEvaluation.setEmployee(this);

		return evlEvaluation;
	}

	public EvlEvaluation removeEvlEvaluation(EvlEvaluation evlEvaluation) {
		getEvlEvaluations().remove(evlEvaluation);
		evlEvaluation.setEmployee(null);

		return evlEvaluation;
	}

	public List<EvlKpiResult> getEvlKpiResults() {
		return this.evlKpiResults;
	}

	public void setEvlKpiResults(List<EvlKpiResult> evlKpiResults) {
		this.evlKpiResults = evlKpiResults;
	}

	public EvlKpiResult addEvlKpiResult(EvlKpiResult evlKpiResult) {
		getEvlKpiResults().add(evlKpiResult);
		evlKpiResult.setEmployee(this);

		return evlKpiResult;
	}

	public EvlKpiResult removeEvlKpiResult(EvlKpiResult evlKpiResult) {
		getEvlKpiResults().remove(evlKpiResult);
		evlKpiResult.setEmployee(null);

		return evlKpiResult;
	}

	public List<PrmPayroll> getPrmPayrolls() {
		return this.prmPayrolls;
	}

	public void setPrmPayrolls(List<PrmPayroll> prmPayrolls) {
		this.prmPayrolls = prmPayrolls;
	}

	public PrmPayroll addPrmPayroll(PrmPayroll prmPayroll) {
		getPrmPayrolls().add(prmPayroll);
		prmPayroll.setEmployee(this);

		return prmPayroll;
	}

	public PrmPayroll removePrmPayroll(PrmPayroll prmPayroll) {
		getPrmPayrolls().remove(prmPayroll);
		prmPayroll.setEmployee(null);

		return prmPayroll;
	}

	public List<PrmPayrollHistory> getPrmPayrollHistories() {
		return this.prmPayrollHistories;
	}

	public void setPrmPayrollHistories(List<PrmPayrollHistory> prmPayrollHistories) {
		this.prmPayrollHistories = prmPayrollHistories;
	}

	public PrmPayrollHistory addPrmPayrollHistory(PrmPayrollHistory prmPayrollHistory) {
		getPrmPayrollHistories().add(prmPayrollHistory);
		prmPayrollHistory.setEmployee(this);

		return prmPayrollHistory;
	}

	public PrmPayrollHistory removePrmPayrollHistory(PrmPayrollHistory prmPayrollHistory) {
		getPrmPayrollHistories().remove(prmPayrollHistory);
		prmPayrollHistory.setEmployee(null);

		return prmPayrollHistory;
	}

	public List<RcmCandidateCalendar> getRcmCandidateCalendars() {
		return this.rcmCandidateCalendars;
	}

	public void setRcmCandidateCalendars(List<RcmCandidateCalendar> rcmCandidateCalendars) {
		this.rcmCandidateCalendars = rcmCandidateCalendars;
	}

	public RcmCandidateCalendar addRcmCandidateCalendar(RcmCandidateCalendar rcmCandidateCalendar) {
		getRcmCandidateCalendars().add(rcmCandidateCalendar);
		rcmCandidateCalendar.setEmployee(this);

		return rcmCandidateCalendar;
	}

	public RcmCandidateCalendar removeRcmCandidateCalendar(RcmCandidateCalendar rcmCandidateCalendar) {
		getRcmCandidateCalendars().remove(rcmCandidateCalendar);
		rcmCandidateCalendar.setEmployee(null);

		return rcmCandidateCalendar;
	}

	public List<TnmInformTraining> getTnmInformTrainings() {
		return this.tnmInformTrainings;
	}

	public void setTnmInformTrainings(List<TnmInformTraining> tnmInformTrainings) {
		this.tnmInformTrainings = tnmInformTrainings;
	}

	public TnmInformTraining addTnmInformTraining(TnmInformTraining tnmInformTraining) {
		getTnmInformTrainings().add(tnmInformTraining);
		tnmInformTraining.setEmployee(this);

		return tnmInformTraining;
	}

	public TnmInformTraining removeTnmInformTraining(TnmInformTraining tnmInformTraining) {
		getTnmInformTrainings().remove(tnmInformTraining);
		tnmInformTraining.setEmployee(null);

		return tnmInformTraining;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setEmployee(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setEmployee(null);

		return user;
	}

	public List<WktLeaveRequest> getWktLeaveRequests() {
		return this.wktLeaveRequests;
	}

	public void setWktLeaveRequests(List<WktLeaveRequest> wktLeaveRequests) {
		this.wktLeaveRequests = wktLeaveRequests;
	}

	public WktLeaveRequest addWktLeaveRequest(WktLeaveRequest wktLeaveRequest) {
		getWktLeaveRequests().add(wktLeaveRequest);
		wktLeaveRequest.setEmployee(this);

		return wktLeaveRequest;
	}

	public WktLeaveRequest removeWktLeaveRequest(WktLeaveRequest wktLeaveRequest) {
		getWktLeaveRequests().remove(wktLeaveRequest);
		wktLeaveRequest.setEmployee(null);

		return wktLeaveRequest;
	}

	public List<WktOvertimeRequest> getWktOvertimeRequests() {
		return this.wktOvertimeRequests;
	}

	public void setWktOvertimeRequests(List<WktOvertimeRequest> wktOvertimeRequests) {
		this.wktOvertimeRequests = wktOvertimeRequests;
	}

	public WktOvertimeRequest addWktOvertimeRequest(WktOvertimeRequest wktOvertimeRequest) {
		getWktOvertimeRequests().add(wktOvertimeRequest);
		wktOvertimeRequest.setEmployee(this);

		return wktOvertimeRequest;
	}

	public WktOvertimeRequest removeWktOvertimeRequest(WktOvertimeRequest wktOvertimeRequest) {
		getWktOvertimeRequests().remove(wktOvertimeRequest);
		wktOvertimeRequest.setEmployee(null);

		return wktOvertimeRequest;
	}

	public List<WktWorkingTime> getWktWorkingTimes() {
		return this.wktWorkingTimes;
	}

	public void setWktWorkingTimes(List<WktWorkingTime> wktWorkingTimes) {
		this.wktWorkingTimes = wktWorkingTimes;
	}

	public WktWorkingTime addWktWorkingTime(WktWorkingTime wktWorkingTime) {
		getWktWorkingTimes().add(wktWorkingTime);
		wktWorkingTime.setEmployee(this);

		return wktWorkingTime;
	}

	public WktWorkingTime removeWktWorkingTime(WktWorkingTime wktWorkingTime) {
		getWktWorkingTimes().remove(wktWorkingTime);
		wktWorkingTime.setEmployee(null);

		return wktWorkingTime;
	}

}