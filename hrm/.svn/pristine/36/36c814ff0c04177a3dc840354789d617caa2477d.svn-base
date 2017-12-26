package com.minori.hrm.controllers;


import com.minori.hrm.form.GroupForm;
import com.minori.hrm.utils.JsonResult;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VINH_IT on 12/13/2017.
 */

@RestController
@RequestMapping("/api")
public class EmployeeController extends AbStractController {
	
	@PostMapping(value = "/create-emp")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public JsonResult createEmployee(@RequestBody GroupForm groupForm, BindingResult bindingResult) {
		return null;
	}
}
