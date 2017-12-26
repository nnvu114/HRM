package com.minori.hrm.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.minori.hrm.dto.MasterLeaveReasonDto;
import com.minori.hrm.models.MasterLeaveReason;
import com.minori.hrm.repositorys.MasterLeaveReasonRepository;
import com.minori.hrm.services.MasterLeaveReasonService;

@Component
public class MasterLeaveReasonServiceImpl implements MasterLeaveReasonService {

	@Autowired
	private MasterLeaveReasonRepository masterLeaveReasonRepository;
	
	private List<MasterLeaveReason> masterLeaveReasons = new ArrayList<>();
	
	@Override
	public void init() {
		masterLeaveReasons = (List<MasterLeaveReason>) masterLeaveReasonRepository.findAll();
	}

	@Override
	public List<MasterLeaveReasonDto> getAllLeaveReason() {
		return masterLeaveReasons.stream().map(this::convert).collect(Collectors.toList());
	}

	@Override
	public Optional<MasterLeaveReason> findLeaveReason(int leaveReasonId) {
		Optional<MasterLeaveReason> masterLeaveReason = masterLeaveReasons.stream().filter(x -> x.getLeaveReasonId() == leaveReasonId).findFirst();
		return masterLeaveReason;
	}

	private MasterLeaveReasonDto convert(MasterLeaveReason entity) {
		MasterLeaveReasonDto dto = new MasterLeaveReasonDto();
		dto.setDescription(entity.getDescription());
		dto.setLeaveReasonId(entity.getLeaveReasonId());
		dto.setLeaveType(entity.getLeaveType());
		dto.setName(entity.getName());
		dto.setTotalOffDay(entity.getTotalOffDay());
		return dto;
	}

}
