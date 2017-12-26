package com.minori.hrm.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.minori.hrm.converter.NotificationConverter;
import com.minori.hrm.models.Notification;
import com.minori.hrm.repositorys.NotificationRepository;
import com.minori.hrm.services.NotificationService;

@Component
public class NotificationServiceImpl implements NotificationService {
	
	@Autowired
	private NotificationConverter notificationConverter;
	
	@Autowired
	private NotificationRepository notificationRepository;

	@Override
	public Notification insertNotification(String title, String message, String createBy, String sendBy, int type) {
		Notification entity = notificationConverter.convertEntity(title, message, createBy, sendBy, type);
		Notification result = notificationRepository.save(entity);
		return result;
	}

}
