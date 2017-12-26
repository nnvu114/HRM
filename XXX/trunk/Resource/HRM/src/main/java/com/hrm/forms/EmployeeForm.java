package com.hrm.forms;

import java.util.Date;

/**
 * The form employee
 * @author Admin
 *
 */
public class EmployeeForm {
	private Long employeeId;

	private int role;

	private String firstName;

	private String lastName;

	private String email;

	private int gender;

	private Date birthday;

	private String address;

	private short marriedStatus;

	private String telephone;

	private String identificationId;

	private String userName;

	private String password;

	private long insurranceId;

	private String insurranceDes;

	private int status;

	private String skillDescription;

	private Integer leavePaidRemain;

	private Date createdDate;

	private Date updatedDate;

	private String createdBy;

	private String updatedBy;
	
	private long country;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public short getMarriedStatus() {
		return marriedStatus;
	}

	public void setMarriedStatus(short marriedStatus) {
		this.marriedStatus = marriedStatus;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getIdentificationId() {
		return identificationId;
	}

	public void setIdentificationId(String identificationId) {
		this.identificationId = identificationId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getInsurranceId() {
		return insurranceId;
	}

	public void setInsurranceId(long insurranceId) {
		this.insurranceId = insurranceId;
	}

	public String getInsurranceDes() {
		return insurranceDes;
	}

	public void setInsurranceDes(String insurranceDes) {
		this.insurranceDes = insurranceDes;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public Integer getLeavePaidRemain() {
		return leavePaidRemain;
	}

	public void setLeavePaidRemain(Integer leavePaidRemain) {
		this.leavePaidRemain = leavePaidRemain;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public long getCountry() {
		return country;
	}

	public void setCountry(long country) {
		this.country = country;
	}
	
}
