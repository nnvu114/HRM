package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the master_deduction database table.
 * 
 */
@Entity
@Table(name="master_deduction")
@NamedQuery(name="MasterDeduction.findAll", query="SELECT m FROM MasterDeduction m")
public class MasterDeduction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="deduction_master_id")
	private int deductionMasterId;

	private double amount;

	private String name;

	@Column(name="percent_of_salary")
	private float percentOfSalary;

	public MasterDeduction() {
	}

	public int getDeductionMasterId() {
		return this.deductionMasterId;
	}

	public void setDeductionMasterId(int deductionMasterId) {
		this.deductionMasterId = deductionMasterId;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentOfSalary() {
		return this.percentOfSalary;
	}

	public void setPercentOfSalary(float percentOfSalary) {
		this.percentOfSalary = percentOfSalary;
	}

}