package com.minori.hrm.controllers;

import com.minori.hrm.exception.HrmException;
import com.minori.hrm.facade.services.TimeOffFacadeService;
import com.minori.hrm.form.TimeOffForm;
import com.minori.hrm.models.AccountCredentials;
import com.minori.hrm.utils.Constant;
import com.minori.hrm.utils.JsonResult;
import com.minori.hrm.services.TimeOffService;
import com.minori.hrm.validators.TimeOffValidate;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/time-off")
public class TimeOffController extends AbStractController {

	@Autowired
	private TimeOffFacadeService timeOffFacadeService;

	@Autowired
	private TimeOffValidate timeOffValidate;

	@PostMapping(value = "/create")
	@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_USER')")
	public JsonResult create(@RequestBody TimeOffForm request, Authentication auth) {
		return runService(request, timeOffFacadeService::createTimeOff, timeOffValidate::validateCreateTimeOff);
	}

	@PostMapping(value = "/update")
	@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_USER')")
	public JsonResult updateTimeOff(@RequestBody TimeOffForm request, AccountCredentials auth) {
		return runService(request, timeOffFacadeService::editTimeOff, timeOffValidate::validateEditTimeOff);
	}

	@GetMapping(value = "/getTypeOfLeave")
	@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_USER')")
	public JsonResult getTypeOfLeave() {
		return toSuccess(timeOffFacadeService.getTypeOfLeave());
	}

	@PostMapping(value = "/getMyTimeOffs")
	@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_USER')")
	public JsonResult getListTimeOff(@RequestBody TimeOffForm request) {
		return runService(request, timeOffFacadeService::getListTimeOff, timeOffValidate::validateMyTimeOff);
	}

	@GetMapping(value = "/getEmployeeByName/{name}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_USER')")
	public JsonResult getListEmployeeByName(@PathVariable("name") String name) {
		return toSuccess(timeOffFacadeService.getListEmployeeByName(name));
	}

	@GetMapping(value = "/getMyTimeOff/{leaveRequestId}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_USER')")
	public JsonResult getOneTimeOff(@PathVariable("leaveRequestId") Integer leaveRequestId) {
		return toSuccess(timeOffFacadeService.getOneTimeOff(leaveRequestId));
	}

	@DeleteMapping(value = "/delete/{leaveRequestId}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_USER')")
	public JsonResult deleteTimeOff(@PathVariable("leaveRequestId") Integer leaveRequestId) {
		return runService(leaveRequestId, timeOffFacadeService::deleteTimeOff);
	}
	
	@PostMapping(value="/approve")
	@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_USER')")
	public JsonResult approveTimeOff(@RequestBody TimeOffForm request) {
		return runService(request, timeOffFacadeService::approveTimeOff, timeOffValidate::validateApproveTimeOff);
	}
}

