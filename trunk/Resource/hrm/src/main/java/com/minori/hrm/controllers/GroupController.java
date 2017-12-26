package com.minori.hrm.controllers;

import java.sql.Timestamp;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minori.hrm.form.GroupForm;
import com.minori.hrm.models.EpmGroup;
import com.minori.hrm.services.GroupService;
import com.minori.hrm.utils.CommonFunction;
import com.minori.hrm.utils.CommonResponse;
import com.minori.hrm.utils.Constant;
import com.minori.hrm.utils.JsonResult;
import com.minori.hrm.validators.GroupValidate;

@RestController
@RequestMapping("/api")
public class GroupController extends AbStractController {

	@Autowired
	private GroupValidate groupValidator;

	@Autowired
	private GroupService groupService;

	/**
	 * Create a group
	 * 
	 * @param groupForm
	 * @param bindingResult
	 * @return object
	 */
	@PostMapping(value = "/create-group")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public JsonResult createGroup(@RequestBody GroupForm groupForm, BindingResult bindingResult) {

		groupValidator.validate(groupForm, bindingResult);

		if (bindingResult.hasErrors()) {
			return toFailed(Constant.EMPTY);
		}

		EpmGroup group = new EpmGroup();
		group.setName(groupForm.getName());
		group.setLeaderId(groupForm.getLeaderId());
		group.setDescription(groupForm.getDescription());
		group.setCreatedBy(CommonFunction.getCurrentUser());
		group.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		return toSuccess(groupService.saveGroup(group));
	}

	/**
	 * Update a group
	 * 
	 * @param groupForm
	 * @param bindingResult
	 * @return object
	 */
	@PutMapping(value = "/update-group/{groupId}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public JsonResult updateGroup(@PathVariable Integer groupId, @RequestBody GroupForm groupForm,
			BindingResult bindingResult) {

		EpmGroup group = groupService.findOneGroup(groupId);

		if (group == null) {
			return toFailed(Constant.EMPTY);
		}

		groupValidator.validate(groupForm, bindingResult);

		if (bindingResult.hasErrors()) {
			return toFailed(Constant.EMPTY);
		}

		group.setName(groupForm.getName());
		group.setDescription(groupForm.getDescription());
		group.setLeaderId(groupForm.getLeaderId());
		group.setUpdatedBy(CommonFunction.getCurrentUser());
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		group.setUpdatedDate(timestamp);
		return toSuccess(groupService.saveGroup(group));
	}

	/**
	 * The delete a group
	 * 
	 * @param groupId
	 * @return object
	 */
	@DeleteMapping(value = "/delete-group/{groupId}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public JsonResult deleteGroup(@PathVariable Integer groupId) {

		EpmGroup group = groupService.findOneGroup(groupId);

		if (group == null) {
			return toFailed(Constant.EMPTY);
		}

		groupService.deleteGroup(groupId);

		return toSuccess(Constant.EMPTY);
	}

	/**
	 * Get a list group by the conditions
	 * 
	 * @param name
	 * @param limit
	 * @param page
	 * @return object
	 */
	@GetMapping(value = "/list-group")
	public JsonResult getListGroups(@PathParam("name") String name, @PathParam("limit") int limit,
			@PathParam("page") int page) {

		// Page size must not be less than one!
		if (page <= 0 || limit <= 0) {
			return toFailed(Constant.EMPTY);
		}
		Pageable pageable = new PageRequest(page - Constant.PAGE_NUMBER_DEFAULT, limit);

		return toSuccess(
				new CommonResponse(groupService.getListGroup(name, pageable), groupService.getTotalListGroup(name)));
	}

}