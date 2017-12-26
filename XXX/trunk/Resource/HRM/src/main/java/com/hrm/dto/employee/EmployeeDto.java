package com.hrm.dto.employee;

import java.util.Date;

import com.hrm.commons.GenderEnum;
import com.hrm.commons.MarriedStatusEnum;
import com.hrm.commons.UserEnum;
import com.hrm.entities.Employee;

/**
 * The employee dto had convert to entity
 * 
 * @author Admin
 */
public class EmployeeDto {

	private Long employeeId;

	private String role;

	private String firstName;

	private String lastName;

	private String email;

	private String gender;

	private Date birthday;

	private String address;

	private String marriedStatus;

	private String telephone;

	private String identificationId;

	private String userName;

	/**
	 * Constructors
	 */
	public EmployeeDto() {
		// do nothing
	}

	/**
	 * Constructors
	 * 
	 * @param employee
	 *            The entity
	 */
	public EmployeeDto(Employee employee) {
		this.employeeId = employee.getEmployeeId();
		this.role = UserEnum.getEnumByCode(employee.getRole());
		this.firstName = employee.getFirstName();
		this.lastName = employee.getLastName();
		this.email = employee.getEmail();
		this.gender = GenderEnum.getEnumByCode(employee.getGender());
		this.birthday = employee.getBirthday();
		this.address = employee.getAddress();
		this.marriedStatus = MarriedStatusEnum.getEnumByCode(employee.getMarriedStatus());
		this.telephone = employee.getTelephone();
		this.identificationId = employee.getIdentificationId();
		this.userName = employee.getUserName();
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
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

	public String getMarriedStatus() {
		return marriedStatus;
	}

	public void setMarriedStatus(String marriedStatus) {
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
}
