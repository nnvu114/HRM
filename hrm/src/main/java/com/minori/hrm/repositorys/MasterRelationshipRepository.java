package com.minori.hrm.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.minori.hrm.models.MasterRelationship;

@Repository
public interface MasterRelationshipRepository extends CrudRepository<MasterRelationship, Integer>{

}
