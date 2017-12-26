package com.minori.hrm.listeners;


import com.minori.hrm.models.Employee;
import com.minori.hrm.models.MasterRole;
import com.minori.hrm.models.User;
import com.minori.hrm.services.EmployeeService;
import com.minori.hrm.services.RoleService;
import com.minori.hrm.services.UserService;

import com.minori.hrm.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;
	
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		// Insert roles into DB
		if (roleService.findByName(Constant.AppRole.ROLE_ADMIN) == null) {
			roleService.saveRole(new MasterRole(Constant.AppRole.ROLE_ADMIN, "x"));
		}
		if (roleService.findByName(Constant.AppRole.ROLE_EMPLOYEE) == null) {
			roleService.saveRole(new MasterRole(Constant.AppRole.ROLE_EMPLOYEE, "x"));
		}
		if (roleService.findByName(Constant.AppRole.ROLE_HR) == null) {
			roleService.saveRole(new MasterRole(Constant.AppRole.ROLE_HR, "x"));
		}
		if (roleService.findByName(Constant.AppRole.ROLE_LEADER) == null) {
			roleService.saveRole(new MasterRole(Constant.AppRole.ROLE_LEADER, "x"));
		}
		if (roleService.findByName(Constant.AppRole.ROLE_MANAGER) == null) {
			roleService.saveRole(new MasterRole(Constant.AppRole.ROLE_MANAGER, "x"));
		}
		if (roleService.findByName(Constant.AppRole.ROLE_TRAINER) == null) {
			roleService.saveRole(new MasterRole(Constant.AppRole.ROLE_TRAINER, "x"));
		}

		// Admin account
		if (employeeService.findByIdentificationId("123") == null) {
			Employee employee = new Employee();
			employee.setFirstName("Admin");
			employee.setLastName("Admin");
			employee.setEmail("admin@gmail.com");
			employee.setGender(1);
			employee.setIdentificationId("123");
			employee.setAddress("Da Nang");
			employee.setBirthday(new Timestamp(new java.util.Date().getTime()));
			employee.setMarriedStatus((byte)1);
			employee.setCreatedBy("KhanhSo");
			employee.setIdentificationId("123");
			employee.setTelephone("09090909");
			employee.setCountryId(123);
			employeeService.saveEmployee(employee);
			
			if(userService.findByUserName("admin") == null) {
				User admin = new User();
				admin.setUsername("admin");
				admin.setPassword(passwordEncoder.encode("admin"));
				admin.setStatus(1);
				admin.setEmployee(employee);
				admin.setCreatedBy("admin");
				admin.setRoleId(roleService.findByName(Constant.AppRole.ROLE_ADMIN).getRoleMasterId());
				userService.saveUser(admin);
			}
		}
	}
}