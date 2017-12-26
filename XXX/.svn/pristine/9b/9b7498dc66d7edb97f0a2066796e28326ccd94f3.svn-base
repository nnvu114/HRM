package com.hrm.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hrm.entities.Employee;
import com.hrm.forms.EmployeeForm;
import com.hrm.services.IEmployeeService;

/**
 * The Validate for Employee
 * 
 * @author Admin
 *
 */
@Component
@ComponentScan
public class EmployeeValidator implements Validator {

	@Autowired
	private IEmployeeService employeeService;

	@Value("${HRM.Size.employeeForm.userName}")
	private String sizeUserName;

	@Value("${HRM.NotEmpty}")
	private String notEmpty;

	@Value("${HRM.Duplicate.employeeForm.userName}")
	private String duplicateUserName;
	
	@Value("${HRM.Size.employeeForm.password}")
	private String sizePassword;
	
	@Value("${HRM.Duplicate.employeeForm.email}")
	private String duplicateEmail;

	@Override
	public boolean supports(Class<?> aClass) {
		return Employee.class.equals(aClass);
	}

	/**
	 * The validate create employee form
	 */
	@Override
	public void validate(Object o, Errors errors) {

		EmployeeForm employee = (EmployeeForm) o;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", notEmpty);
		if (employee.getUserName().length() < 6 || employee.getUserName().length() > 32) {
			errors.rejectValue("userName", sizeUserName);
		}
		
		/** Validate userName has existed*/
		if (employeeService.checkUserName(employee.getUserName(), employee.getEmployeeId())) {
			errors.rejectValue("userName", duplicateUserName);
		}
		
		/** Validate email has existed*/
		if (employeeService.checkEmail(employee.getEmail(), employee.getEmployeeId())) {
			errors.rejectValue("email", duplicateEmail);
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", notEmpty);
		if (employee.getPassword().length() < 6 || employee.getPassword().length() > 32) {
			errors.rejectValue("password", sizePassword);
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", notEmpty);
		if(employee.getCountry() == 0){
			errors.rejectValue("country", notEmpty);
		}
	}

}
