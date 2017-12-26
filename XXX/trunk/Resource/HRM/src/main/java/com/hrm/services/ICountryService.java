package com.hrm.services;

import com.hrm.entities.Country;

/**
 * The interface country service
 * 
 * @author Admin
 *
 */
public interface ICountryService {

	/**
	 * The find one country by countryId
	 * 
	 * @param contryId
	 * @return The object
	 */
	public Country findOne(Long contryId);
}
