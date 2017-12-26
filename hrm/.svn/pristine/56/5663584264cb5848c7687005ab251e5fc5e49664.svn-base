package com.minori.hrm.services;

import com.minori.hrm.dto.CreateTimeOffDto;
import com.minori.hrm.dto.EditTimeOffDto;
import com.minori.hrm.dto.MyTimeOffDto;
import com.minori.hrm.form.TimeOffForm;

import java.util.Optional;

/**
 * 
 * @author KhanhNM
 *
 */
public interface TimeOffService {
	/**
	 * Create Time Off
	 * @param request
	 * @return
	 */
	Optional<CreateTimeOffDto> createTimeOff(TimeOffForm request);
	
	/**
	 * Edit Time Off
	 * @param request
	 * @return
	 */
	Optional<EditTimeOffDto> editTimeOff(TimeOffForm request);
	
	/**
	 * Get List Time Off.
	 * @param request
	 */
	Optional<MyTimeOffDto> getListTimeOff(TimeOffForm request);
	
	/**
	 * Get One Time Off
	 * @param leaveRequestId
	 * @return
	 */
	CreateTimeOffDto getOneTimeOff(Integer leaveRequestId);
	
	/**
	 * Delete Time Off
	 * @param leaveRequestId
	 */
	int deleteTimeOff(Integer leaveRequestId);
}
