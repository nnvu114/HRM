package com.minori.hrm.utils;

/**
 * Created by VINH_IT on 12/11/2017.
 */
public final class Constant {
	public final class AppRole {
		public static final String ROLE_ADMIN = "ROLE_ADMIN";
		public static final String ROLE_HR = "ROLE_HR";
		public static final String ROLE_MANAGER = "ROLE_MANAGER";
		public static final String ROLE_TRAINER = "ROLE_TRAINER";
		public static final String ROLE_LEADER = "ROLE_LEADER";
		public static final String ROLE_EMPLOYEE = "ROLE_EMPLOYEE";
	}
	
	public static final class TimeOffStatus {
		public static final int DRAFT = 0;
		public static final int SUBMIT = 1;
		public static final int APPROVE = 2;
		public static final int REJECT = 3;
		public static final int DELETE = 4;
	}
	
	public static final class Notification {
		public static final int REQUEST_TIME_OFF = 1;
	}
	
	public static final String MSG_SUCCESS = "success";
	
	// Please use between 0 and 30 characters.
	public static final String INVALID = "001";
	
	public static final String MSG_BAD_REQUEST = "Bad request";
	
	public static final String EMPTY = "";
	 
	public static final int PAGE_NUMBER_DEFAULT = 1;
	
	public static final String START_TIME_WORKING = "8:00";
	
	public static final String END_TIME_WORKING = "17:00";
	
	public static final String START_TIME_BREAK = "12:00";
	
	public static final String END_TIME_BREAK = "13:00";
	
	public static final float ONE_DAY_OFF = 1f;
	
	public static final float HALF_DAY_OFF = 0.5f;

	public static final int PAGE_SIZE_DEFAULT = 1;

}
