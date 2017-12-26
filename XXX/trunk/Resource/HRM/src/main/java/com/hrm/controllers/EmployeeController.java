package com.hrm.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrm.commons.CommonFunction;
import com.hrm.commons.CommonResponse;
import com.hrm.commons.Constands;
import com.hrm.dto.common.FieldErrorDTO;
import com.hrm.dto.employee.EmployeeDto;
import com.hrm.entities.Employee;
import com.hrm.forms.EmployeeForm;
import com.hrm.repositories.CountryRepository;
import com.hrm.repositories.EmployeeRepository;
import com.hrm.services.IEmployeeService;
import com.hrm.validators.EmployeeValidator;

@RestController
@RequestMapping("api")
public class EmployeeController {

	/** The logger */
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Value("${HRM.NotEmpty}")
	private String notEmpty;

	@Autowired
	private IEmployeeService employeeService;

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

	@Autowired
	private EmployeeValidator employeeValidator;

	/**
	 * The get list staff has condition
	 * 
	 * @param limit
	 * @param pages
	 * @param name
	 * @param telephone
	 * @param email
	 * @return list employee
	 */
	@GetMapping("get-employees")
	public CommonResponse getfindAllEmployeeHasCondition(@RequestParam("limit") Integer limit,
			@RequestParam("pages") Integer pages, @RequestParam("name") String name,
			@RequestParam("telephone") String telephone, @RequestParam("email") String email) {

		logger.debug("The parameters :", limit, pages, name, telephone, email);
		CommonResponse response = new CommonResponse();
		
		/** The validate limit and pages*/
		List<FieldErrorDTO> listError = new ArrayList<>();
		if (limit == null) {
			listError.add(new FieldErrorDTO("limit", notEmpty));
		} else if (pages == null) {
			listError.add(new FieldErrorDTO("pages", notEmpty));
		}
		
		/** Response when has occurred error*/
		if (!listError.isEmpty()) {
			response.setStatus(false);
			response.setMessageValidate(listError);
			response.setStatusCode(Constands.STATUS_BAD_REQUEST);
			return response;
		}

		try {
			logger.info("get list employees");

			// The set pagination
			Pageable pageable = new PageRequest(pages, limit);

			// The get list employee
			List<EmployeeDto> list = employeeService.findAllEmployeeHaveCondition(name, telephone, email, pageable);

			/** The get total all employee */
			long total = employeeService.getTotalEmployeeHaveCondition(name, telephone, email);

			// Set data response
			response.setStatus(true);
			response.setStatusCode(Constands.STATUS_OK);
			response.setData(list);
			response.setTotal(total);
			return response;
		} catch (Exception e) {
			logger.error(e.getMessage());
			response.setStatus(false);
			response.setMessage(e.getMessage());
			response.setStatusCode(Constands.STATUS_INTERNAL_SERVER_ERROR);
			return response;
		}

	}

	/**
	 * The create a employee
	 * 
	 * @param employeeForm
	 * @param errors
	 * @return
	 */
	@PostMapping("save-employees")
	public CommonResponse saveEmployee(@Valid @RequestBody EmployeeForm employeeForm, BindingResult bindingResult) {
		/** New object common */
		CommonResponse response = new CommonResponse();
		try {
			logger.info("Start save employee");
			employeeValidator.validate(employeeForm, bindingResult);

			if (bindingResult.hasErrors()) {
				List<FieldErrorDTO> listError = new ArrayList<>();
				for (ObjectError object : bindingResult.getAllErrors()) {
					if (object instanceof FieldError) {
						FieldError fieldError = (FieldError) object;
						// Set list errors
						listError.add(new FieldErrorDTO(fieldError.getField(), fieldError.getCode()));
					}
				}
				response.setStatus(false);
				response.setMessageValidate(listError);
				response.setStatusCode(Constands.STATUS_BAD_REQUEST);

				return response;
			}

			/** Set info employee */
			Employee employee = new Employee();
			employee.setRole(employeeForm.getRole());
			employee.setFirstName(employeeForm.getFirstName());
			employee.setLastName(employeeForm.getLastName());
			employee.setEmail(employeeForm.getEmail());
			employee.setGender(employeeForm.getGender());
			employee.setBirthday(employeeForm.getBirthday());
			employee.setAddress(employeeForm.getAddress());
			employee.setMarriedStatus(employeeForm.getMarriedStatus());
			employee.setTelephone(employeeForm.getTelephone());
			employee.setIdentificationId(employeeForm.getIdentificationId());
			employee.setUserName(employeeForm.getUserName());
			employee.setPassword(bCryptPasswordEncoder.encode(employeeForm.getPassword()));
			employee.setInsurranceId(employeeForm.getInsurranceId());
			employee.setInsurranceDes(employeeForm.getInsurranceDes());
			employee.setStatus(employeeForm.getStatus());
			employee.setSkillDescription(employeeForm.getSkillDescription());
			employee.setLeavePaidRemain(employeeForm.getLeavePaidRemain());
			employee.setStatus(employeeForm.getStatus());
			employee.setCreatedBy(CommonFunction.getCurrentUser());
			employee.setUpdatedBy(CommonFunction.getCurrentUser());
			employee.setCreatedDate(new Date());
			employee.setUpdatedDate(new Date());
			employee.setCountry(countryRepository.findOne(employeeForm.getCountry()));
			logger.debug("The employee {}", employee);

			EmployeeDto employeeResult = employeeService.save(employee);
			if (employeeResult != null) {
				response.setStatus(true);
				response.setStatusCode(Constands.STATUS_OK);
			}

		} catch (Exception e) {
			logger.debug(e.getMessage());
			response.setStatus(false);
			response.setStatusCode(Constands.STATUS_INTERNAL_SERVER_ERROR);
		}
		return response;
	}

	/**
	 * The update a employee
	 * 
	 * @param employeeForm
	 * @param errors
	 * @return
	 */
	@PutMapping("update-employees")
	public CommonResponse updateEmployee(@Valid @RequestBody EmployeeForm employeeForm, BindingResult bindingResult) {
		CommonResponse response = new CommonResponse();
		try {
			logger.debug("Start save employee");
			/** The check must exist employeeId */
			if (employeeForm.getEmployeeId() == null) {
				response.setStatus(false);
				response.setStatusCode(Constands.STATUS_BAD_REQUEST);
			}

			/** Get employee by employeeId */
			Employee employee = employeeRepository.findOne(employeeForm.getEmployeeId());
			if (employee == null) {
				response.setStatus(false);
				response.setStatusCode(Constands.STATUS_BAD_REQUEST);
				return response;
			} else {
				employeeForm.setUserName(employee.getUserName());
			}

			/** The validate update employee */
			employeeValidator.validate(employeeForm, bindingResult);

			if (bindingResult.hasErrors()) {
				List<FieldErrorDTO> listError = new ArrayList<>();
				for (ObjectError object : bindingResult.getAllErrors()) {
					if (object instanceof FieldError) {
						FieldError fieldError = (FieldError) object;
						// Set list errors
						listError.add(new FieldErrorDTO(fieldError.getField(), fieldError.getCode()));
					}
				}
				response.setStatus(false);
				response.setMessageValidate(listError);
				response.setStatusCode(Constands.STATUS_BAD_REQUEST);

				return response;
			}

			employee.setEmployeeId(employeeForm.getEmployeeId());
			employee.setRole(employeeForm.getRole());
			employee.setFirstName(employeeForm.getFirstName());
			employee.setLastName(employeeForm.getLastName());
			employee.setEmail(employeeForm.getEmail());
			employee.setGender(employeeForm.getGender());
			employee.setBirthday(employeeForm.getBirthday());
			employee.setAddress(employeeForm.getAddress());
			employee.setMarriedStatus(employeeForm.getMarriedStatus());
			employee.setTelephone(employeeForm.getTelephone());
			employee.setIdentificationId(employeeForm.getIdentificationId());
			employee.setPassword(bCryptPasswordEncoder.encode(employeeForm.getPassword()));
			employee.setInsurranceId(employeeForm.getInsurranceId());
			employee.setInsurranceDes(employeeForm.getInsurranceDes());
			employee.setStatus(employeeForm.getStatus());
			employee.setSkillDescription(employeeForm.getSkillDescription());
			employee.setLeavePaidRemain(employeeForm.getLeavePaidRemain());
			employee.setStatus(employeeForm.getStatus());
			employee.setCreatedBy(CommonFunction.getCurrentUser());
			employee.setUpdatedBy(CommonFunction.getCurrentUser());
			employee.setCreatedDate(new Date());
			employee.setUpdatedDate(new Date());
			employee.setCountry(countryRepository.findOne(employeeForm.getCountry()));
			logger.debug("The employee {}", employee);

			/** The update a employee */
			EmployeeDto employeeResult = employeeService.save(employee);
			if (employeeResult != null) {
				response.setStatus(true);
				response.setStatusCode(Constands.STATUS_OK);
			} else {
				response.setStatus(false);
				response.setStatusCode(Constands.STATUS_INTERNAL_SERVER_ERROR);
			}

		} catch (Exception e) {
			logger.debug(e.getMessage());
			response.setStatus(false);
			response.setStatusCode(Constands.STATUS_INTERNAL_SERVER_ERROR);
			response.setMessage(e.getMessage());
		}
		return response;
	}
	
	@DeleteMapping("delete-employees")
	public CommonResponse deleteEmployee(@RequestParam(value="employeeId", required=true) Long employeeId) {
		CommonResponse response = new CommonResponse();
		
		/** The validate employee*/
		Employee employee = employeeRepository.findOne(employeeId);
		if(employee == null){
			response.setStatus(false);
			response.setStatusCode(Constands.STATUS_BAD_REQUEST);
			return response;
		}
		
		employee.setStatus(Constands.STATUS_INACTIVE);
		employee.setUpdatedBy(CommonFunction.getCurrentUser());
		employee.setUpdatedDate(new Date());
		
		if(employeeService.save(employee) != null){
			response.setStatus(true);
			response.setStatusCode(Constands.STATUS_OK);
		} else{
			response.setStatus(false);
			response.setStatusCode(Constands.STATUS_INTERNAL_SERVER_ERROR);
		}
		
		return response;
	}
}
