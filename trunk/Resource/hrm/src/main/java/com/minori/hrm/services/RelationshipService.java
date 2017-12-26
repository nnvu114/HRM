package com.minori.hrm.services;

import java.util.List;

import com.minori.hrm.dto.RelationshipDto;
import com.minori.hrm.models.EpmRelationship;

public interface RelationshipService {

	EpmRelationship saveRelationship(EpmRelationship relationship);

	void deleteByEmployee(Integer employeeId);

	EpmRelationship findOneRelationship(Integer relationshipId);

	void deleteRelationship(Integer relationshipId);

	List<RelationshipDto> getListRelationship(Integer employeeId);

}
