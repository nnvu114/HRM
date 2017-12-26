package com.minori.hrm.services;

import java.util.List;
import java.util.Optional;

import com.minori.hrm.models.MasterRelationship;

public interface MasterRelationshipService {

	public void init();

	public List<MasterRelationship> getAllMasterRelationship();

	public Optional<MasterRelationship> findMasterRelationship(int masterRelationshipId);

}
