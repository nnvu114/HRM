package com.hrm.services;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.hrm.dto.employee.EmployeeDto;
import com.hrm.entities.Employee;

/**
 * The interface employee service
 * 
 * @author Admin
 */
public interface IEmployeeService {

	/**
	 * The find all employee with conditions
	 * 
	 * @param name
	 *            The name
	 * @param telephone
	 *            The phone number
	 * @param email
	 *            The email
	 * @param pageable
	 *            The pagination
	 * @return List Employee
	 */
	public List<EmployeeDto> findAllEmployeeHaveCondition(String name, String telephone, String email,
			Pageable pageable);
	
	/**
	 * The find all employee with conditions
	 * 
	 * @param name
	 *            The name
	 * @param telephone
	 *            The phone number
	 * @param email
	 *            The email
	 * @return long
	 */
	public long getTotalEmployeeHaveCondition(String name, String telephone, String email);

	/**
	 * The save employee
	 * 
	 * @param employee
	 * @return
	 */
	public EmployeeDto save(Employee employee);

	/**
	 * The check email has yet existed .
	 * 
	 * @param email
	 *            The email
	 * @return boolean
	 */
	public boolean checkEmail(String email, Long employeeId);

	/**
	 * The check userName has yet existed .
	 * 
	 * @param userName
	 *            The userName
	 * @return long
	 */
	public boolean checkUserName(String userName, Long employeeId);
}
