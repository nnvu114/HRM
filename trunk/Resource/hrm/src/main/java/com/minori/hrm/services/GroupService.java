package com.minori.hrm.services;

import java.util.List;

import com.minori.hrm.dto.GroupDto;
import org.springframework.data.domain.Pageable;

import com.minori.hrm.models.EpmGroup;

public interface GroupService {

	EpmGroup saveGroup(EpmGroup group);

	EpmGroup findOneGroup(Integer groupId);
	
	void deleteGroup(Integer groupId);
	
	List<GroupDto> getListGroup(String name, Pageable pageable);
	
	int getTotalListGroup(String name);
}
