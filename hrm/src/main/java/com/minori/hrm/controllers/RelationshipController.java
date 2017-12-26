package com.minori.hrm.controllers;

import java.sql.Timestamp;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.minori.hrm.form.RelationshipForm;
import com.minori.hrm.models.Employee;
import com.minori.hrm.models.EpmRelationship;
import com.minori.hrm.services.EmployeeService;
import com.minori.hrm.services.RelationshipService;
import com.minori.hrm.utils.CommonFunction;
import com.minori.hrm.utils.JsonResult;
import com.minori.hrm.validators.RelationshipValidate;

@RestController
@RequestMapping("/api")
public class RelationshipController extends AbStractController {

	@Autowired
	private RelationshipValidate relationshipValidate;

	@Autowired
	private RelationshipService relationshipService;

	@Autowired
	private EmployeeService employeeService;

	/**
	 * Create a list relationships of employee
	 * 
	 * @param employeeId
	 * @param relationshipForm
	 * @return object
	 */
	@PutMapping(value = "/update-relationship-by-employee")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public JsonResult updateRelationship(@RequestParam("employeeId") int employeeId,
			@RequestBody List<RelationshipForm> relationshipForms) {

		// validate a list object
		for (RelationshipForm relationship : relationshipForms) {
			// validate form
			if (relationshipValidate.validate(relationship)) {
				return toFailed(null);
			}
		}

		// Check has existed employee yet.
		Employee employee = employeeService.findOne(employeeId);
		if (employee == null) {
			return toFailed(employee);
		} else {
			relationshipService.deleteByEmployee(employeeId);
		}

		for (RelationshipForm relationshipTemp : relationshipForms) {
			EpmRelationship relationship = new EpmRelationship();
			relationship.setRelationshipName(relationshipTemp.getRelationshipName());
			relationship.setRelationshipType(relationshipTemp.getRelationshipType());
			relationship.setAddress(relationshipTemp.getAddress());
			relationship.setCareer(relationshipTemp.getCareer());
			relationship.setBirthday(new Timestamp(relationshipTemp.getBirthday()));
			relationship.setCreatedBy(CommonFunction.getCurrentUser());
			relationship.setEmployee(employee);
			relationshipService.saveRelationship(relationship);
		}

		return toSuccess();
	}

	/**
	 * The delete a relationship
	 *
	 * @param relationshipId
	 * @return object
	 */
	@PutMapping(value = "/update-relationship/{relationshipId}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public JsonResult updateRelationship(@PathVariable Integer relationshipId,
			@RequestBody RelationshipForm relationshipForm) {

		// validate form
		if (relationshipValidate.validate(relationshipForm)) {
			return toFailed(null);
		}

		EpmRelationship relationship = relationshipService.findOneRelationship(relationshipId);

		if (relationship == null) {
			return toFailed(relationship);
		}

		relationship.setAddress(relationshipForm.getAddress());
		relationship.setBirthday(new Timestamp(relationshipForm.getBirthday()));
		relationship.setCareer(relationshipForm.getCareer());
		relationship.setRelationshipName(relationshipForm.getRelationshipName());
		relationship.setRelationshipType(relationshipForm.getRelationshipType());
		relationship.setUpdatedDate(new Timestamp(System.currentTimeMillis()));
		relationship.setUpdatedBy(CommonFunction.getCurrentUser());

		relationshipService.saveRelationship(relationship);

		return toSuccess();
	}

	/**
	 * The delete a relationship
	 *
	 * @param relationshipId
	 * @return object
	 */
	@DeleteMapping(value = "/delete-relationship/{relationshipId}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public JsonResult deleteRelationship(@PathVariable Integer relationshipId) {

		EpmRelationship relationship = relationshipService.findOneRelationship(relationshipId);

		if (relationship == null) {
			return toFailed(relationship);
		}

		relationshipService.deleteRelationship(relationshipId);

		return toSuccess();
	}

	/**
	 * Get a list relationship by employee
	 *
	 * @param employeeId
	 * @return object
	 */
	@GetMapping(value = "/list-relationship-by-employee")
	public JsonResult getListRelationshipByEmployee(@PathParam("employeeId") Integer employeeId) {

		Employee employee = employeeService.findOne(employeeId);
		if (employee == null) {
			return toFailed(employee);
		}

		return toSuccess(relationshipService.getListRelationship(employeeId));
	}

}
