package com.minori.hrm.validators;

import com.minori.hrm.form.LoginForm;

/**
 * Created by VINH_IT on 12/19/2017.
 */
public class LoginValidate {
	public LoginValidate() {}
	
	public boolean validate(LoginForm loginForm) {
		if(loginForm.getPassword() == null || loginForm.getPassword().equals("")) {
			return false;
		}
		if(loginForm.getUsername() == null || loginForm.getUsername().equals("")) {
			return false;
		}
		if(loginForm.getDeviceToken() == null || loginForm.getDeviceToken().equals("")) {
			return false;
		}
		
		return true;
	}
}
