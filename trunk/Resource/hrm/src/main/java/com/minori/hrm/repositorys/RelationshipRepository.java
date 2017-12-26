package com.minori.hrm.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.minori.hrm.models.EpmRelationship;

@Repository
public interface RelationshipRepository extends CrudRepository<EpmRelationship, Integer> {
	
	@Transactional
	@Modifying
	@Query("DELETE FROM EpmRelationship r WHERE r.employee.employeeId = :employeeId")
	void deleteByEmployee(@Param("employeeId") Integer employeeId);
	
	@Query("SELECT r FROM EpmRelationship r WHERE r.employee.employeeId = :employeeId")
	List<EpmRelationship> getListRelationship(@Param("employeeId") Integer employeeId);
}
