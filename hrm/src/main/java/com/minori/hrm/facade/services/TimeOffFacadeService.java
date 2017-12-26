package com.minori.hrm.facade.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minori.hrm.dto.CreateTimeOffDto;
import com.minori.hrm.dto.EditTimeOffDto;
import com.minori.hrm.dto.EmployeeByNameDto;
import com.minori.hrm.dto.MasterLeaveReasonDto;
import com.minori.hrm.dto.MyTimeOffDto;
import com.minori.hrm.form.TimeOffForm;
import com.minori.hrm.services.EmployeeService;
import com.minori.hrm.services.MasterLeaveReasonService;
import com.minori.hrm.services.TimeOffService;

@Service
@Transactional
public class TimeOffFacadeService {
	
	@Autowired
	private TimeOffService timeOffService;
	
	@Autowired
	private MasterLeaveReasonService masterLeaveReasonService;
	
	@Autowired
	private EmployeeService employeeService;
	
	public Optional<CreateTimeOffDto> createTimeOff(TimeOffForm request) {
		return timeOffService.createTimeOff(request);
	}

	public Optional<EditTimeOffDto> editTimeOff(TimeOffForm request) {
		return timeOffService.editTimeOff(request);
	}
	
	public List<MasterLeaveReasonDto> getTypeOfLeave() {
		return masterLeaveReasonService.getAllLeaveReason();
	}

	public Optional<MyTimeOffDto> getListTimeOff(TimeOffForm request) {
		return timeOffService.getListTimeOff(request);
	}
	
	public List<EmployeeByNameDto> getListEmployeeByName(String name) {
		return employeeService.getListEmployeeByName(name);
	}
	
	public CreateTimeOffDto getOneTimeOff(Integer leaveRequestId) {
		return timeOffService.getOneTimeOff(leaveRequestId);
	}
	
	public int deleteTimeOff(Integer leaveRequestId) {
		return timeOffService.deleteTimeOff(leaveRequestId);
	}

}
