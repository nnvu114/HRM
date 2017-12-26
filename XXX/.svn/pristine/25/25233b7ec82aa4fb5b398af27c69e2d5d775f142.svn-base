/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrm.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EmployeeId")
    private Long employeeId;
    
    @Basic(optional = false)
    @Column(name = "Role")
    private int role;
    
    @Basic(optional = false)
    @Column(name = "FirstName")
    private String firstName;
    
    @Basic(optional = false)
    @Column(name = "LastName")
    private String lastName;
    
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    
    @Basic(optional = false)
    @Column(name = "Gender")
    private int gender;
    
    @Basic(optional = false)
    @Column(name = "Birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;
    
    @Basic(optional = false)
    @Lob
    @Column(name = "Address")
    private String address;
    
    @Basic(optional = false)
    @Column(name = "MarriedStatus")
    private short marriedStatus;
    
    @Basic(optional = false)
    @Column(name = "Telephone")
    private String telephone;
    
    @Basic(optional = false)
    @Column(name = "IdentificationId")
    private String identificationId;
    
    @Basic(optional = false)
    @Column(name = "UserName")
    private String userName;
    
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    
    @Basic(optional = false)
    @Column(name = "InsurranceId")
    private long insurranceId;
    
    @Basic(optional = false)
    @Column(name = "InsurranceDes")
    private String insurranceDes;
    
    @Basic(optional = false)
    @Column(name = "Status")
    private int status;
    
    @Lob
    @Column(name = "SkillDescription")
    private String skillDescription;
    
    @Column(name = "LeavePaidRemain")
    private Integer leavePaidRemain;
    
    @Column(name = "CreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    
    @Column(name = "UpdatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
    
    @Basic(optional = false)
    @Column(name = "CreatedBy")
    private String createdBy;
    
    @Basic(optional = false)
    @Column(name = "UpdatedBy")
    private String updatedBy;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Cetification> cetificationList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Contract> contractList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Leaverequest> leaverequestList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Allowance> allowanceList;
    
    @JoinColumn(name = "CountryId", referencedColumnName = "CountryId")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Country country;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Experience> experienceList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Assessment> assessmentList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Award> awardList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Employeegroup> employeegroupList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Overtimerequest> overtimerequestList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Position> positionList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Medicalrecords> medicalrecordsList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Workingtime> workingtimeList;

    public Employee() {
    }

    public Employee(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(Long employeeId, int role, String firstName, String lastName, String email, int gender, Date birthday, String address, short marriedStatus, String telephone, String identificationId, String userName, String password, int insurranceId, String insurranceDes, int status, String createdBy, String updatedBy) {
        this.employeeId = employeeId;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.marriedStatus = marriedStatus;
        this.telephone = telephone;
        this.identificationId = identificationId;
        this.userName = userName;
        this.password = password;
        this.insurranceId = insurranceId;
        this.insurranceDes = insurranceDes;
        this.status = status;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

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

    public List<Cetification> getCetificationList() {
        return cetificationList;
    }

    public void setCetificationList(List<Cetification> cetificationList) {
        this.cetificationList = cetificationList;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public List<Leaverequest> getLeaverequestList() {
        return leaverequestList;
    }

    public void setLeaverequestList(List<Leaverequest> leaverequestList) {
        this.leaverequestList = leaverequestList;
    }

    public List<Allowance> getAllowanceList() {
        return allowanceList;
    }

    public void setAllowanceList(List<Allowance> allowanceList) {
        this.allowanceList = allowanceList;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Experience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public List<Assessment> getAssessmentList() {
        return assessmentList;
    }

    public void setAssessmentList(List<Assessment> assessmentList) {
        this.assessmentList = assessmentList;
    }

    public List<Award> getAwardList() {
        return awardList;
    }

    public void setAwardList(List<Award> awardList) {
        this.awardList = awardList;
    }

    public List<Employeegroup> getEmployeegroupList() {
        return employeegroupList;
    }

    public void setEmployeegroupList(List<Employeegroup> employeegroupList) {
        this.employeegroupList = employeegroupList;
    }

    public List<Overtimerequest> getOvertimerequestList() {
        return overtimerequestList;
    }

    public void setOvertimerequestList(List<Overtimerequest> overtimerequestList) {
        this.overtimerequestList = overtimerequestList;
    }

    public List<Position> getPositionList() {
        return positionList;
    }

    public void setPositionList(List<Position> positionList) {
        this.positionList = positionList;
    }

    public List<Medicalrecords> getMedicalrecordsList() {
        return medicalrecordsList;
    }

    public void setMedicalrecordsList(List<Medicalrecords> medicalrecordsList) {
        this.medicalrecordsList = medicalrecordsList;
    }

    public List<Workingtime> getWorkingtimeList() {
        return workingtimeList;
    }

    public void setWorkingtimeList(List<Workingtime> workingtimeList) {
        this.workingtimeList = workingtimeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeId != null ? employeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.employeeId == null && other.employeeId != null) || (this.employeeId != null && !this.employeeId.equals(other.employeeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Employee[ employeeId=" + employeeId + " ]";
    }
    
}
