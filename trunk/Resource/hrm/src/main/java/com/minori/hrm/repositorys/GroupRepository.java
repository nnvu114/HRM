package com.minori.hrm.repositorys;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.minori.hrm.models.EpmGroup;

@Repository
public interface GroupRepository extends CrudRepository<EpmGroup, Integer> {
	
	EpmGroup findByGroupId(Integer groupId);
	
	@Query("SELECT g FROM EpmGroup g WHERE :name IS NULL OR g.name LIKE CONCAT('%',:name,'%')")
	List<EpmGroup> getListGroup(@Param("name") String name, Pageable pageable);
	
	@Query("SELECT count(g) FROM EpmGroup g WHERE :name IS NULL OR g.name LIKE CONCAT('%',:name,'%')")
	int getTotalListGroup(@Param("name") String name);
}