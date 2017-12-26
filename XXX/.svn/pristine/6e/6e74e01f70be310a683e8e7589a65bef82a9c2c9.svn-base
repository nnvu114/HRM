package com.hrm.configs;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hrm.commons.UserEnum;
import com.hrm.entities.Employee;
import com.hrm.repositories.EmployeeRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {

	/** The logger */
	private static final Logger logger = LoggerFactory.getLogger(AppUserDetailsService.class);
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		/** The find one employee by userName*/
		Employee employee = employeeRepository.findByUserName(userName);

		logger.debug("authentication {}", employee);

		GrantedAuthority authority = new SimpleGrantedAuthority(UserEnum.getEnumByCode(employee.getRole()));
		UserDetails userDetails = (UserDetails) new User(employee.getUserName(), employee.getPassword(),
				Arrays.asList(authority));

		return userDetails;
	}
}
