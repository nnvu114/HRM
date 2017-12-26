package com.hrm.dto.common;

public class FieldErrorDTO {

	/** The field of value */
	private String field;

	/** The message of value when has occurred error */
	private String message;

	/**
	 * Constructor
	 * 
	 * @param field
	 *            The field
	 * @param message
	 *            The message
	 */
	public FieldErrorDTO(String field, String message) {
		this.field = field;
		this.message = message;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
