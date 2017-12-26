package com.minori.hrm.services;

import java.util.List;
import java.util.Optional;

import com.minori.hrm.dto.MasterContractDto;
import com.minori.hrm.models.MasterContract;

public interface MasterContractService {
	public void init();
	
	public List<MasterContractDto> getAllMasterContract();
	
	public Optional<MasterContract> findMasterContract(int masterContractId);
}
