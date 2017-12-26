package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the master_allowance database table.
 * 
 */
@Entity
@Table(name="master_allowance")
@NamedQuery(name="MasterAllowance.findAll", query="SELECT m FROM MasterAllowance m")
public class MasterAllowance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="allowance_master_id")
	private int allowanceMasterId;

	@Lob
	@Column(name="allowance_des")
	private String allowanceDes;

	@Column(name="allowance_name")
	private String allowanceName;

	private double amount;

	public MasterAllowance() {
	}

	public int getAllowanceMasterId() {
		return this.allowanceMasterId;
	}

	public void setAllowanceMasterId(int allowanceMasterId) {
		this.allowanceMasterId = allowanceMasterId;
	}

	public String getAllowanceDes() {
		return this.allowanceDes;
	}

	public void setAllowanceDes(String allowanceDes) {
		this.allowanceDes = allowanceDes;
	}

	public String getAllowanceName() {
		return this.allowanceName;
	}

	public void setAllowanceName(String allowanceName) {
		this.allowanceName = allowanceName;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}