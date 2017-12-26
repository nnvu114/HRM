package com.minori.hrm.facade.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minori.hrm.dto.ApproveTimeOffDto;
import com.minori.hrm.dto.CreateTimeOffDto;
import com.minori.hrm.dto.EditTimeOffDto;
import com.minori.hrm.dto.EmployeeByNameDto;
import com.minori.hrm.dto.MasterLeaveReasonDto;
import com.minori.hrm.dto.MyTimeOffDto;
import com.minori.hrm.exception.HrmException;
import com.minori.hrm.form.TimeOffForm;
import com.minori.hrm.models.User;
import com.minori.hrm.services.EmployeeService;
import com.minori.hrm.services.MasterLeaveReasonService;
import com.minori.hrm.services.NotificationService;
import com.minori.hrm.services.TimeOffService;
import com.minori.hrm.services.UserService;
import com.minori.hrm.support.PushNotificationWorker;
import com.minori.hrm.utils.CommonFunction;
import com.minori.hrm.utils.Constant;
import com.minori.hrm.utils.Constant.Notification;
import com.minori.hrm.utils.Constant.TimeOffStatus;
import com.minori.hrm.utils.HrmStatusCode;
import com.minori.hrm.utils.NotificationMessage;

@Service
@Transactional
public class TimeOffFacadeService {
	
	@Autowired
	private TimeOffService timeOffService;
	
	@Autowired
	private MasterLeaveReasonService masterLeaveReasonService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private NotificationService notificationService;
	
	@Autowired
	private UserService userService;
	
	public Optional<CreateTimeOffDto> createTimeOff(TimeOffForm request) {
		Optional<CreateTimeOffDto> response = timeOffService.createTimeOff(request);
		if (response.isPresent() && response.get().getStatus() == TimeOffStatus.SUBMIT) {
			User createUser = userService.findByUserName(CommonFunction.getCurrentAcount().orElseThrow(()-> new HrmException(HrmStatusCode.ERROR)));
			User sendBy = userService.findByUserName(response.get().getApproveBy());
			new PushNotificationWorker(createUser, sendBy, Notification.REQUEST_TIME_OFF, NotificationMessage.TITLE, notificationService, response.get().getLeaveRequestId()).execute();
		}
		return response;
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
	
	public Optional<ApproveTimeOffDto> approveTimeOff(TimeOffForm request) {
		return timeOffService.approveTimeOff(request);
	}

}
