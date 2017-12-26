package com.minori.hrm.services.impl;

import com.minori.hrm.models.UserDeviceToken;
import com.minori.hrm.repositorys.UserDeviceTokenRepository;
import com.minori.hrm.services.UserDeviceTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by VINH_IT on 12/19/2017.
 */
@Service
public class UserDeviceTokenServiceImpl implements UserDeviceTokenService {
	@Autowired
	UserDeviceTokenRepository userDeviceTokenRepository;
	
	@Override
	public UserDeviceToken save(UserDeviceToken userDeviceToken) {
		return userDeviceTokenRepository.save(userDeviceToken);
	}
}
