package com.minori.hrm.controllers;

import com.minori.hrm.utils.JsonResult;
import com.minori.hrm.form.LoginForm;
import com.minori.hrm.validators.LoginValidate;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VINH_IT on 12/19/2017.
 */


@RestController
@RequestMapping("/api")
public class UserController extends AbStractController {
	
	@PostMapping(value = "/login")
	public JsonResult login(@RequestBody LoginForm loginForm) {
		System.out.println("chay toi day 1");
		if(!new LoginValidate().validate(loginForm)) {
			System.out.println("chay toi day 2");
			return toFailed(loginForm);
		}
		System.out.println("chay toi day 3");
		return toSuccess();
	}
}
