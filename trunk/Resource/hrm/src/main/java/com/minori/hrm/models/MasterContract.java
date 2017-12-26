package com.minori.hrm.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the master_contract database table.
 * 
 */
@Entity
@Table(name="master_contract")
@NamedQuery(name="MasterContract.findAll", query="SELECT m FROM MasterContract m")
public class MasterContract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="contract_master_id")
	private int contractMasterId;

	@Lob
	@Column(name="contract_des")
	private String contractDes;

	@Column(name="contract_name")
	private String contractName;

	public MasterContract() {
	}

	public int getContractMasterId() {
		return this.contractMasterId;
	}

	public void setContractMasterId(int contractMasterId) {
		this.contractMasterId = contractMasterId;
	}

	public String getContractDes() {
		return this.contractDes;
	}

	public void setContractDes(String contractDes) {
		this.contractDes = contractDes;
	}

	public String getContractName() {
		return this.contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

}