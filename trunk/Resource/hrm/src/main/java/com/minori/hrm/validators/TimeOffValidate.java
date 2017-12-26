package com.minori.hrm.validators;

import com.minori.hrm.exception.HrmException;
import com.minori.hrm.form.TimeOffForm;
import com.minori.hrm.utils.Constant;
import com.minori.hrm.utils.HrmStatusCode;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class TimeOffValidate {

	public void validateCreateTimeOff(TimeOffForm request) throws HrmException {
		if (request.getStatus() != Constant.TimeOffStatus.DRAFT && request.getStatus() != Constant.TimeOffStatus.SUBMIT) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
		if (request.getStatus() == Constant.TimeOffStatus.SUBMIT) {
			validateCommon(request);
		}
	}
	
	public void validateEditTimeOff(TimeOffForm request) throws HrmException {
		if ((request.getStatus() != Constant.TimeOffStatus.DRAFT && request.getStatus() != Constant.TimeOffStatus.SUBMIT) || null == request.getLeaveRequestId()) {
			throw new HrmException(HrmStatusCode.ERROR);
		}

		if (request.getStatus() == Constant.TimeOffStatus.SUBMIT) {
			validateCommon(request);
		}
	}
	
	public void validateMyTimeOff(TimeOffForm request) {
		if (request.getLimit() < Constant.PAGE_SIZE_DEFAULT || request.getPage() < Constant.PAGE_NUMBER_DEFAULT) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
	}
	
	public void validateApproveTimeOff(TimeOffForm request) {
		if (request.getStatus() != Constant.TimeOffStatus.APPROVE && request.getStatus() != Constant.TimeOffStatus.REJECT) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
		if (null == request.getLeaveRequestId()) {
			throw new HrmException(HrmStatusCode.ERROR);
		}
		if (StringUtils.isBlank(request.getReasonReject()) && request.getStatus() == Constant.TimeOffStatus.REJECT) {
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
