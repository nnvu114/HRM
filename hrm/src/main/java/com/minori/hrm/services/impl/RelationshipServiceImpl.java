package com.minori.hrm.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minori.hrm.dto.RelationshipDto;
import com.minori.hrm.exception.HrmException;
import com.minori.hrm.models.EpmRelationship;
import com.minori.hrm.models.MasterRelationship;
import com.minori.hrm.repositorys.RelationshipRepository;
import com.minori.hrm.services.MasterRelationshipService;
import com.minori.hrm.services.RelationshipService;
import com.minori.hrm.utils.HrmStatusCode;

@Service
public class RelationshipServiceImpl implements RelationshipService {

	@Autowired
	private RelationshipRepository relationshipRepository;

	@Autowired
	private MasterRelationshipService masterRelationshipService;

	@Override
	public EpmRelationship saveRelationship(EpmRelationship relationship) {
		return relationshipRepository.save(relationship);
	}

	@Override
	public void deleteByEmployee(Integer employeeId) {
		relationshipRepository.deleteByEmployee(employeeId);
	}

	@Override
	public EpmRelationship findOneRelationship(Integer relationshipId) {
		return relationshipRepository.findOne(relationshipId);
	}

	@Override
	public void deleteRelationship(Integer relationshipId) {
		relationshipRepository.delete(relationshipId);
	}

	@Override
	public List<RelationshipDto> getListRelationship(Integer employeeId) {

		List<EpmRelationship> relationshipList = relationshipRepository.getListRelationship(employeeId);

		List<RelationshipDto> relationshipDtoList = new ArrayList<>();
		if (!relationshipList.isEmpty()) {
			for (EpmRelationship epmRelationship : relationshipList) {
				MasterRelationship masterRelationship = masterRelationshipService
						.findMasterRelationship(epmRelationship.getRelationshipType())
						.orElseThrow(() -> new HrmException(HrmStatusCode.ERROR));
				relationshipDtoList.add(new RelationshipDto(epmRelationship, masterRelationship));
			}
		}
		return relationshipDtoList;
	}

}