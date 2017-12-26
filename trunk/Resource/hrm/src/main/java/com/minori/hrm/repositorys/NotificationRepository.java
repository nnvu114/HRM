package com.minori.hrm.repositorys;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;
import org.springframework.data.repository.CrudRepository;

import com.minori.hrm.models.Notification;

public interface NotificationRepository extends CrudRepository<Notification, Integer> {

}
