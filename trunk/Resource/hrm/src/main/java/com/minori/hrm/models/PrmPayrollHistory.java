package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the prm_payroll_history database table.
 * 
 */
@Entity
@Table(name="prm_payroll_history")
@NamedQuery(name="PrmPayrollHistory.findAll", query="SELECT p FROM PrmPayrollHistory p")
public class PrmPayrollHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="payroll_detail_id")
	private int payrollDetailId;

	@Column(name="allowance_total")
	private double allowanceTotal;

	@Column(name="amount_ot")
	private double amountOt;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="deduction_total")
	private double deductionTotal;

	private String month;

	@Column(name="salary_basic")
	private double salaryBasic;

	@Column(name="standard_date")
	private int standardDate;

	private int status;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	@Column(name="work_day")
	private int workDay;

	private String year;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	public PrmPayrollHistory() {
	}

	public int getPayrollDetailId() {
		return this.payrollDetailId;
	}

	public void setPayrollDetailId(int payrollDetailId) {
		this.payrollDetailId = payrollDetailId;
	}

	public double getAllowanceTotal() {
		return this.allowanceTotal;
	}

	public void setAllowanceTotal(double allowanceTotal) {
		this.allowanceTotal = allowanceTotal;
	}

	public double getAmountOt() {
		return this.amountOt;
	}

	public void setAmountOt(double amountOt) {
		this.amountOt = amountOt;
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

	public double getDeductionTotal() {
		return this.deductionTotal;
	}

	public void setDeductionTotal(double deductionTotal) {
		this.deductionTotal = deductionTotal;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public double getSalaryBasic() {
		return this.salaryBasic;
	}

	public void setSalaryBasic(double salaryBasic) {
		this.salaryBasic = salaryBasic;
	}

	public int getStandardDate() {
		return this.standardDate;
	}

	public void setStandardDate(int standardDate) {
		this.standardDate = standardDate;
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

	public int getWorkDay() {
		return this.workDay;
	}

	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}