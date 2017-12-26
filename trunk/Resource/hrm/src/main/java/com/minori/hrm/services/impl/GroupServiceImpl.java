package com.minori.hrm.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.minori.hrm.dto.GroupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.minori.hrm.models.EpmGroup;
import com.minori.hrm.repositorys.GroupRepository;
import com.minori.hrm.services.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupRepository groupRepository;

	@Override
	public EpmGroup saveGroup(EpmGroup group) {
		return groupRepository.save(group);
	}

	@Override
	public EpmGroup findOneGroup(Integer groupId) {
		return groupRepository.findByGroupId(groupId);
	}

	@Override
	public void deleteGroup(Integer groupId) {
		  groupRepository.delete(groupId);
	}

	@Override
	public List<GroupDto> getListGroup(String name, Pageable pageable) {
		List<EpmGroup> listGroups = groupRepository.getListGroup(name, pageable);
		
		List<GroupDto> listGroupDto = new ArrayList<>();
		if(!listGroups.isEmpty()){
			for (EpmGroup group : listGroups) {
				listGroupDto.add(new GroupDto(group));
			}
		}
		return listGroupDto;
	}

	@Override
	public int getTotalListGroup(String name) {
		return groupRepository.getTotalListGroup(name);
	}

}