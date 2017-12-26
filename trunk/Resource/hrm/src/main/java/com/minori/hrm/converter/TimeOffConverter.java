package com.minori.hrm.converter;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.minori.hrm.dto.ApproveTimeOffDto;
import com.minori.hrm.dto.CreateTimeOffDto;
import com.minori.hrm.dto.EditTimeOffDto;
import com.minori.hrm.exception.HrmException;
import com.minori.hrm.form.TimeOffForm;
import com.minori.hrm.models.User;
import com.minori.hrm.models.WktLeaveRequest;
import com.minori.hrm.services.MasterLeaveReasonService;
import com.minori.hrm.utils.CommonFunction;
import com.minori.hrm.utils.Constant;
import com.minori.hrm.utils.HrmStatusCode;

@Component
public class TimeOffConverter {

	@Autowired
	private MasterLeaveReasonService masterLeaveReasonService;

	public WktLeaveRequest convertEntity(TimeOffForm request, User user, User userApprove) {
		WktLeaveRequest entity = convertEntityCommon(request, user, userApprove);
		entity.setCreatedBy(user.getUsername());
		entity.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return entity;
	}

	public Optional<CreateTimeOffDto> convertCreateTimeOffResponse(WktLeaveRequest result) {
		if (null == result) {
			Optional.empty();
		}
		CreateTimeOffDto response = convertCommonResponse(result);
		return Optional.of(response);
	}

	public WktLeaveRequest convertEditTimeOffEntity(WktLeaveRequest entity, TimeOffForm request, User user,
			User userApprove) {
		// WktLeaveRequest entity = convertEntityCommon(request, user, userApprove);
		entity.setEmployee(user.getEmployee());
		entity.setRequestType(request.getRequestType());
		entity.setMasterLeaveReason(masterLeaveReasonService.findLeaveReason(request.getRequestType())
				.orElseThrow(() -> new HrmException(HrmStatusCode.ERROR)));
		entity.setDuration(handleDurationTimeOff(request.getStartLeaveDate(), request.getEndLeaveDate()));
		entity.setReasonDes(request.getReasonDes());
		entity.setApprovedBy(null == userApprove ? null : userApprove.getUsername());
		entity.setAppraiserId(null == request.getAppraiserId() ? 0 : request.getAppraiserId());
		entity.setStatus(request.getStatus());
		entity.setStartLeaveDate(new Timestamp(request.getStartLeaveDate()));
		entity.setEndLeaveDate(new Timestamp(request.getEndLeaveDate()));
		entity.setUpdatedBy(user.getUsername());
		entity.setUpdatedDate(new Timestamp(System.currentTimeMillis()));
		return entity;
	}

	public Optional<EditTimeOffDto> convertEditTimeOffResponse(WktLeaveRequest result) {
		if (null == result) {
			Optional.empty();
		}
		EditTimeOffDto response = new EditTimeOffDto();
		response.setAppraiserId(result.getAppraiserId());
		response.setEmployeeId(result.getEmployee().getEmployeeId());
		response.setEndLeaveDate(null == result.getEndLeaveDate() ? null : result.getEndLeaveDate().getTime());
		response.setReasonDes(result.getReasonDes());
		response.setRequestType(result.getMasterLeaveReason().getLeaveReasonId());
		response.setStartLeaveDate(null == result.getStartLeaveDate() ? null : result.getStartLeaveDate().getTime());
		response.setStatus(result.getStatus());
		response.setUpdatedBy(result.getUpdatedBy());
		response.setUpdatedDate(result.getUpdatedDate());
		return Optional.of(response);
	}

	private float handleDurationTimeOff(Long timeStart, Long timeEnd) {
		int startHourTimeoff = CommonFunction.convertToHour(timeStart);
		int endHourTimeoff = CommonFunction.convertToHour(timeEnd);

		int startHourWorking = CommonFunction.convertToHour(Constant.START_TIME_WORKING);
		int endHourWorking = CommonFunction.convertToHour(Constant.END_TIME_WORKING);

		if (((endHourTimeoff < endHourWorking) || (startHourTimeoff != startHourWorking))
				&& (CommonFunction.distanceBetwenDate(timeStart, timeEnd) == 0)) {
			return Constant.HALF_DAY_OFF;
		} else if (startHourTimeoff == startHourWorking && endHourTimeoff == endHourWorking
				&& CommonFunction.distanceBetwenDate(timeStart, timeEnd) == 0) {
			return Constant.ONE_DAY_OFF;
		} else if (((startHourTimeoff != startHourWorking) || endHourWorking != endHourTimeoff)
				&& (CommonFunction.distanceBetwenDate(timeStart, timeEnd) != 0)) {
			return Constant.HALF_DAY_OFF + CommonFunction.distanceBetwenDate(timeStart, timeEnd)
					- CommonFunction.calculateNumberOfWeekendsInRange(timeStart, timeEnd);
		} else if (startHourTimeoff == startHourWorking && endHourTimeoff == endHourWorking
				&& CommonFunction.distanceBetwenDate(timeStart, timeEnd) != 0) {
			return Constant.ONE_DAY_OFF + CommonFunction.distanceBetwenDate(timeStart, timeEnd)
					- CommonFunction.calculateNumberOfWeekendsInRange(timeStart, timeEnd);
		} else {
			return CommonFunction.distanceBetwenDate(timeStart, timeEnd)
					- CommonFunction.calculateNumberOfWeekendsInRange(timeStart, timeEnd);
		}
	}
	
	public List<CreateTimeOffDto> convertMyTimeOffResponse(List<WktLeaveRequest> result){
		if (CommonFunction.isEmpty(result)) {
			return null;
		}
		return result.stream().map(this::convertCommonResponse).collect(Collectors.toList());
	}

	private WktLeaveRequest convertEntityCommon(TimeOffForm request, User user, User userApprove) {
		WktLeaveRequest entity = new WktLeaveRequest();
		entity.setEmployee(user.getEmployee());
		entity.setRequestType(request.getRequestType());
		entity.setMasterLeaveReason(masterLeaveReasonService.findLeaveReason(request.getRequestType())
				.orElseThrow(() -> new HrmException(HrmStatusCode.ERROR)));
		entity.setDuration(handleDurationTimeOff(request.getStartLeaveDate(), request.getEndLeaveDate()));
		entity.setReasonDes(request.getReasonDes());
		entity.setApprovedBy(null == userApprove ? null : userApprove.getUsername());
		entity.setAppraiserId(null == request.getAppraiserId() ? 0 : request.getAppraiserId());
		entity.setStatus(request.getStatus());
		entity.setStartLeaveDate(new Timestamp(request.getStartLeaveDate()));
		entity.setEndLeaveDate(new Timestamp(request.getEndLeaveDate()));
		return entity;
	}

	public CreateTimeOffDto convertCommonResponse(WktLeaveRequest result) {
		CreateTimeOffDto response = new CreateTimeOffDto();
		response.setAppraiserId(result.getAppraiserId());
		response.setEmployeeId(result.getEmployee().getEmployeeId());
		response.setEndLeaveDate(null == result.getEndLeaveDate() ? null : result.getEndLeaveDate().getTime());
		response.setReasonDes(result.getReasonDes());
		response.setRequestType(result.getMasterLeaveReason().getLeaveReasonId());
		response.setStartLeaveDate(null == result.getStartLeaveDate() ? null : result.getStartLeaveDate().getTime());
		response.setStatus(result.getStatus());
		response.setLeaveRequestId(result.getLeaveRequestId());
		response.setDuration(result.getDuration());
		response.setNameLeaveReason(result.getMasterLeaveReason().getName());
		response.setLeaveReasonId(result.getMasterLeaveReason().getLeaveReasonId());
		response.setApproveBy(result.getApprovedBy());
		return response;
	}
	
	public ApproveTimeOffDto convertAprroveResponse(WktLeaveRequest result) {
		if (null == result) {
			return null;
		}
		ApproveTimeOffDto response = new ApproveTimeOffDto();
		response.setLeaveRequestId(result.getLeaveRequestId());
		response.setReasonReject(result.getReasonReject());
		response.setStatus(result.getStatus());
		return response;
	}
}
