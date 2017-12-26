package com.minori.hrm.services;

import com.minori.hrm.models.Notification;

public interface NotificationService {
	
	Notification insertNotification(String title,String message,String createBy, String sendBy, int type);

}
