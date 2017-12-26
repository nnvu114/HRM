package com.minori.hrm.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.minori.hrm.models.MasterRelationship;
import com.minori.hrm.repositorys.MasterRelationshipRepository;
import com.minori.hrm.services.MasterRelationshipService;

@Component
public class MasterRelationshipServiceImpl implements MasterRelationshipService {

	@Autowired
	private MasterRelationshipRepository masterRelationshipRepository;
	
	private List<MasterRelationship> masterRelationships = new ArrayList<>();
	
	@Override
	public void init() {
		masterRelationships = (List<MasterRelationship>) masterRelationshipRepository.findAll();
	}

	@Override
	public List<MasterRelationship> getAllMasterRelationship() {
		return masterRelationships;
	}

	@Override
	public Optional<MasterRelationship> findMasterRelationship(int masterRelationshipId) {
		Optional<MasterRelationship> masterRelationship = masterRelationships.stream().filter(x -> x.getRelationshipMasterId() == masterRelationshipId).findFirst();
		return masterRelationship;
	}

}
