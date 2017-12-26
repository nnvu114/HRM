package com.minori.hrm.converter;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import com.minori.hrm.models.Notification;

@Component
public class NotificationConverter {

	public Notification convertEntity(String title, String message, String createBy, String sendBy,int type) {
		Notification entity = new Notification();
		entity.setTitle(title);
		entity.setMessage(message);
		entity.setCreateBy(createBy);
		entity.setSendBy(sendBy);
		entity.setCreateTime(new Timestamp(System.currentTimeMillis()));
		entity.setType(type);
		return entity;
	}
}
