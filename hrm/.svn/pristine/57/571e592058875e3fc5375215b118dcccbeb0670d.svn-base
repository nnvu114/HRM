package com.minori.hrm.validators;

import com.minori.hrm.exception.HrmException;
import com.minori.hrm.form.TimeOffForm;
import com.minori.hrm.utils.Constant;
import com.minori.hrm.utils.HrmStatusCode;

import org.springframework.stereotype.Component;

@Component
public class TimeOffValidate {

	public void validateCreateTimeOff(TimeOffForm request) throws HrmException {
		if (request.getStatus() != Constant.TIME_OFF_STATUS.DRAFT && request.getStatus() != Constant.TIME_OFF_STATUS.SUBMIT) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
		if (request.getStatus() == Constant.TIME_OFF_STATUS.SUBMIT) {
			validateCommon(request);
		}
	}
	
	public void validateEditTimeOff(TimeOffForm request) throws HrmException {
		if ((request.getStatus() != Constant.TIME_OFF_STATUS.DRAFT && request.getStatus() != Constant.TIME_OFF_STATUS.SUBMIT) || null == request.getLeaveRequestId()) {
			throw new HrmException(HrmStatusCode.ERROR);
		}

		if (request.getStatus() == Constant.TIME_OFF_STATUS.SUBMIT) {
			validateCommon(request);
		}
	}
	
	public void validateMyTimeOff(TimeOffForm request) {
		if (request.getLimit() < Constant.PAGE_SIZE_DEFAULT || request.getPage() < Constant.PAGE_NUMBER_DEFAULT) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
	}
	
	

	public void validateCommon(TimeOffForm request) {
		if (null == request.getRequestType()) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
		if (null == request.getStartLeaveDate() || null == request.getEndLeaveDate()
				|| request.getStartLeaveDate() > request.getEndLeaveDate()) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
		if (null == request.getReasonDes() || null == request.getAppraiserId()) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
		if (null == request.getAppraiserId()) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
	}

}
