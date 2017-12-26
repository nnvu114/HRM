package com.minori.hrm.repositorys;

import com.minori.hrm.models.UserDeviceToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by VINH_IT on 12/19/2017.
 */
@Repository
public interface UserDeviceTokenRepository extends CrudRepository<UserDeviceToken, Integer> {
	UserDeviceToken save(UserDeviceToken userDeviceToken);
}
