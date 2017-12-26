package com.minori.hrm.form;

/**
 * Created by VINH_IT on 12/19/2017.
 */
public class LoginForm {
	private String username;
	private String password;
	private String deviceToken;
	
	public LoginForm() {}
	
	public LoginForm(String username, String password, String deviceToken) {
		this.username = username;
		this.password = password;
		this.deviceToken = deviceToken;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDeviceToken() {
		return deviceToken;
	}
	
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}
}
