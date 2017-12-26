package com.minori.hrm.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;

import com.minori.hrm.exception.HrmException;
import com.minori.hrm.support.RunHrm;
import com.minori.hrm.support.RunNotValidateHrm;
import com.minori.hrm.support.ValidateHrm;
import com.minori.hrm.utils.Constant;
import com.minori.hrm.utils.JsonResult;

public abstract class AbStractController {
	
	public JsonResult buildJsonResult(int code, String message, Object data) {
		JsonResult jsonResult = new JsonResult();
		jsonResult.setCode(code);
		jsonResult.setMessage(message);
		jsonResult.setData(data);
		return jsonResult;
	}
	
	public<T> JsonResult toSuccess(T data) {
		return buildJsonResult(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), data);
	}
	
	public<T> JsonResult toFailed(T data) {
		return buildJsonResult(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), data);
	}
	
	public JsonResult toSuccess() {
		return buildJsonResult(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), null);
	}
	
	
	public JsonResult toError(HrmException ex) {
		return buildJsonResult(ex.getCode(), ex.getMessage(), null);
	}
	
	public <T, R> JsonResult runService(T request, RunHrm<T, R> runHrm, ValidateHrm<T> validate) {
		try {
			validate.validate(request);
			Optional<R> result = runHrm.run(request);
			if (!result.isPresent()) {
				return toSuccess();
			}
			return toSuccess(result.get());
		} catch (HrmException e) {
			return toError(e);
		} catch (Exception e) {
			return toFailed(null);
		}
	}
	
	public <T,R> JsonResult runService(T request, RunNotValidateHrm<T, R> run) {
		try {
			R result = run.runService(request);
			return toSuccess(result);
		} catch (HrmException e) {
			return toError(e);
		} catch (Exception e) {
			return toFailed(Constant.EMPTY);
		}
	}

}
