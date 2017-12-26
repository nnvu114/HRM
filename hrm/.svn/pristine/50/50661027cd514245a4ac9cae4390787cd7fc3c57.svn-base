package com.minori.hrm.validators;

import org.springframework.stereotype.Component;

import com.minori.hrm.form.RelationshipForm;

@Component
public class RelationshipValidate {

	public boolean validate(RelationshipForm relationship) {
		
		if (relationship.getRelationshipName().length() == 0) {
			return true;
		}

		if (relationship.getCareer().length() == 0) {
			return true;
		}

		if (relationship.getBirthday() > System.currentTimeMillis()) {
			return true;
		}

		if (relationship.getRelationshipType() < 0) {
			return true;
		}

		if (relationship.getAddress().length() == 0) {
			return true;
		}

		return false;
	}
}
