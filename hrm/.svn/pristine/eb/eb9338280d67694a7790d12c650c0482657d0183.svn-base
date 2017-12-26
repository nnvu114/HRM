package com.minori.hrm.exception;

import com.minori.hrm.utils.HrmStatusCode;

public class HrmException extends RuntimeException {
	
	private Integer code;
	
	public HrmException(Integer code, String message) {
		super(message);
		this.code = code;
	}
	
	public HrmException(HrmStatusCode hrmStatusCode) {
		super(hrmStatusCode.getMessage());
		this.code = hrmStatusCode.getCode();
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}	

}
