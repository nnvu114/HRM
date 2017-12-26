package com.minori.hrm.services.impl;


import com.minori.hrm.models.MasterRole;
import com.minori.hrm.repositorys.RoleRepository;
import com.minori.hrm.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by PC on 11/13/2017.
 */
@Component
@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleRepository roleRepository;

	@Override
	public MasterRole saveRole(MasterRole role) {
		return roleRepository.save(role);
	}

	@Override
	public MasterRole findByName(String name) {
		return roleRepository.findByRoleName(name);
	}
	
	@Override
	public MasterRole findById(int id) {
		return roleRepository.findByRoleMasterId(id);
	}
}
