package com.minori.hrm.services.impl;

import com.minori.hrm.dto.CreateTimeOffDto;
import com.minori.hrm.dto.EditTimeOffDto;
import com.minori.hrm.dto.MyTimeOffDto;
import com.minori.hrm.exception.HrmException;
import com.minori.hrm.form.TimeOffForm;

import org.aspectj.apache.bcel.classfile.Code;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestAttributeMethodArgumentResolver;

import com.minori.hrm.converter.TimeOffConverter;
import com.minori.hrm.models.User;
import com.minori.hrm.models.WktLeaveRequest;
import com.minori.hrm.repositorys.UserRepository;
import com.minori.hrm.repositorys.WktLeaveRequestRepository;
import com.minori.hrm.services.TimeOffService;
import com.minori.hrm.utils.CommonFunction;
import com.minori.hrm.utils.Constant;
import com.minori.hrm.utils.HrmStatusCode;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@Component
@Transactional
public class TimeOffServiceImpl implements TimeOffService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TimeOffConverter timeOffConverter;

	@Autowired
	private WktLeaveRequestRepository wktleaveRequestRepository;

	@Override
	public Optional<CreateTimeOffDto> createTimeOff(TimeOffForm request) {
		User user = userRepository.findByUsername(
				CommonFunction.getCurrentAcount().orElseThrow(() -> new HrmException(HrmStatusCode.ERROR)));
		User userApprrove = request.getStatus() == Constant.TIME_OFF_STATUS.DRAFT ? null
				: userRepository.findOne(request.getAppraiserId());
		if (null == userApprrove && request.getStatus() == Constant.TIME_OFF_STATUS.SUBMIT) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
		WktLeaveRequest result = wktleaveRequestRepository
				.save(timeOffConverter.convertEntity(request, user, userApprrove));
		Optional<CreateTimeOffDto> response = timeOffConverter.convertCreateTimeOffResponse(result);
		return response;
	}

	public Optional<EditTimeOffDto> editTimeOff(TimeOffForm request) {
		WktLeaveRequest check = wktleaveRequestRepository.findOne(request.getLeaveRequestId());
		if (null == check || check.getStatus() != Constant.TIME_OFF_STATUS.DRAFT) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
		User user = userRepository.findByUsername(
				CommonFunction.getCurrentAcount().orElseThrow(() -> new HrmException(HrmStatusCode.ERROR)));
		User userApprrove = request.getStatus() == Constant.TIME_OFF_STATUS.DRAFT ? null
				: userRepository.findOne(request.getAppraiserId());
		if (null == userApprrove && request.getStatus() == Constant.TIME_OFF_STATUS.SUBMIT) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
		WktLeaveRequest result = wktleaveRequestRepository
				.save(timeOffConverter.convertEditTimeOffEntity(check, request, user, userApprrove));
		Optional<EditTimeOffDto> response = timeOffConverter.convertEditTimeOffResponse(result);
		return response;
	}

	@Override
	public Optional<MyTimeOffDto> getListTimeOff(TimeOffForm request) {
		User user = userRepository.findByUsername(
				CommonFunction.getCurrentAcount().orElseThrow(() -> new HrmException(HrmStatusCode.ERROR)));
		Pageable pageable = new PageRequest(request.getPage() - Constant.PAGE_NUMBER_DEFAULT, request.getLimit());

		List<WktLeaveRequest> result = wktleaveRequestRepository.getListTimeOff(request.getRequestType(),
				null==request.getFromDay()?null:new Timestamp(request.getFromDay()),
				null==request.getToDay()?null:new Timestamp(request.getToDay()),
				pageable,user.getEmployee().getEmployeeId(),Constant.TIME_OFF_STATUS.DELETE);
		
		long count = wktleaveRequestRepository.countListTimeOff(request.getRequestType(),
				null==request.getFromDay()?null:new Timestamp(request.getFromDay()),
				null==request.getToDay()?null:new Timestamp(request.getToDay())
				,user.getEmployee().getEmployeeId(),Constant.TIME_OFF_STATUS.DELETE);
		List<CreateTimeOffDto> datas = timeOffConverter.convertMyTimeOffResponse(result);
		MyTimeOffDto response = new MyTimeOffDto();
		response.setData(datas);
		response.setTotal(count);
		
		return Optional.of(response);
	}
	
	@Override
	public CreateTimeOffDto getOneTimeOff(Integer leaveRequestId) {
		WktLeaveRequest entity = wktleaveRequestRepository.findTimeoff(leaveRequestId, Constant.TIME_OFF_STATUS.DELETE);
		if (null == entity) {
			return null;
		}
		return timeOffConverter.convertCommonResponse(entity);
	}

	@Override
	public int deleteTimeOff(Integer leaveRequestId) {
		WktLeaveRequest entity = wktleaveRequestRepository.findTimeoff(leaveRequestId, Constant.TIME_OFF_STATUS.DELETE);
		if (null == entity) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
		return wktleaveRequestRepository.deleteTimeOff(leaveRequestId, Constant.TIME_OFF_STATUS.DELETE);
	}

}
