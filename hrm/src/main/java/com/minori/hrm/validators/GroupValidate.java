package com.minori.hrm.validators;

import com.minori.hrm.form.GroupForm;
import com.minori.hrm.utils.Constant;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.minori.hrm.models.EpmGroup;

/**
 * The Validate for Employee
 * 
 * @author Admin
 *
 */
@Component
@ComponentScan
public class GroupValidate implements Validator {



	@Override
	public boolean supports(Class<?> aClass) {
		return EpmGroup.class.equals(aClass);
	}

	/**
	 * The validate create employee form
	 */
	@Override
	public void validate(Object o, Errors errors) {

		GroupForm employee = (GroupForm) o;
		
		if (employee.getName().length() <= 0 || employee.getName().length() > 30) {
			errors.rejectValue("name", Constant.INVALID);
		}

	}

}