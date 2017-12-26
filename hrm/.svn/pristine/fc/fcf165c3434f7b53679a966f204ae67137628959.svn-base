package com.minori.hrm.repositorys;

import com.minori.hrm.models.MasterRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by PC on 11/13/2017.
 */
@Repository("roleRepository")
public interface RoleRepository extends CrudRepository<MasterRole, Integer> {
	
	MasterRole findByRoleName(String name);
	
	MasterRole findByRoleMasterId(int id);

}