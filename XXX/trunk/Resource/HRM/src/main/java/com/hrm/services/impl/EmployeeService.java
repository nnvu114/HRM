package com.hrm.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hrm.dto.employee.EmployeeDto;
import com.hrm.entities.Employee;
import com.hrm.repositories.EmployeeRepository;
import com.hrm.services.IEmployeeService;

/**
 * The employee service
 * 
 * @author Admin
 */
@Service
public class EmployeeService implements IEmployeeService {

	/** The logger */
	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	/**
	 * The find All Employee Have Condition
	 */
	@Override
	public List<EmployeeDto> findAllEmployeeHaveCondition(String name, String telephone, String email,
			Pageable pageable) {

		logger.debug("Start EmployeeService");

		List<EmployeeDto> listEmployeeDto = new ArrayList<>();

		List<Employee> listEmployees = employeeRepository.findAllEmployeeHadCondition(name, telephone, email,
				pageable);

		logger.debug("Get size list employees: ", listEmployees.size());

		for (Employee employee : listEmployees) {
			listEmployeeDto.add(new EmployeeDto(employee));
		}

		return listEmployeeDto;
	}
	
	public long getTotalEmployeeHaveCondition(String name, String telephone, String email) {
		logger.debug("Start get total employee by the conditions");
		return employeeRepository.getTotalEmployeeHadCondition(name, telephone, email);
	}

	@Override
	public EmployeeDto save(Employee employee) {
		try {
			logger.debug("Start save employee");
			Employee employeeSave = employeeRepository.save(employee);
			if (employeeSave != null) {
				logger.debug("Save employee is successfully");
				return new EmployeeDto(employeeSave);
			} else {
				logger.error("Save employee has been failed");
				return new EmployeeDto();
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new EmployeeDto();
		}
	}

	/**
	 * The check email has yet existed .
	 * 
	 * @param email
	 *            The email
	 * @return long
	 */
	@Override
	public boolean checkEmail(String email, Long employeeId) {
		boolean statusEmail = false;
		try {
			logger.debug("Start check email of employee");
			if (employeeRepository.checkEmail(email, employeeId) > 0) {
				statusEmail = true;
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
			statusEmail = true;
		}
		return statusEmail;
	}

	/**
	 * The check userName has yet existed .
	 * 
	 * @param userName
	 *            The userName
	 * @return long
	 */
	@Override
	public boolean checkUserName(String userName, Long employeeId) {
		boolean statusUserName = false;
		try {
			logger.debug("Start check username of employee");
			if (employeeRepository.checkUserName(userName, employeeId) > 0) {
				statusUserName = true;
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			statusUserName = true;
		}
		return statusUserName;
	}

}
