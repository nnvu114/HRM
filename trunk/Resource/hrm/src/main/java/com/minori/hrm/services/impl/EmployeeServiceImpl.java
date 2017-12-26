package com.minori.hrm.services.impl;


import com.minori.hrm.dto.EmployeeByNameDto;
import com.minori.hrm.models.Employee;
import com.minori.hrm.repositorys.EmployeeRepository;
import com.minori.hrm.services.EmployeeService;
import com.minori.hrm.utils.CommonFunction;
import com.minori.hrm.utils.Constant;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	 @Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee findByIdentificationId(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.findByIdentificationId(id);
	}

	@Override
	public Employee findOne(int employeeId) {
		return employeeRepository.findOne(employeeId);
	}
	
	public List<EmployeeByNameDto> getListEmployeeByName(String name) {
		if (null == name) {
			return null;
		}
		List<Employee> employees = employeeRepository.getListEmployeeByName(name);
		if (CommonFunction.isEmpty(employees)) {
			return null;
		}
		List<EmployeeByNameDto> responses = employees.stream().map(this::convertEmployeeByNameResponse).collect(Collectors.toList());
		return responses;
	}
	
	private EmployeeByNameDto convertEmployeeByNameResponse(Employee employee) {
		EmployeeByNameDto response = new EmployeeByNameDto();
		response.setEmployeeId(employee.getEmployeeId());
		response.setFirstName(employee.getFirstName());
		response.setLastName(employee.getLastName());
		return response;
	}
}