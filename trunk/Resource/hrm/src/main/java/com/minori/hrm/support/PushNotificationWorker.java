package com.minori.hrm.support;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingWorker;

import org.json.JSONObject;
import org.springframework.http.HttpMethod;

import com.minori.hrm.models.User;
import com.minori.hrm.services.NotificationService;
import com.minori.hrm.utils.CommonFunction;
import com.minori.hrm.utils.Constant;
import com.minori.hrm.utils.Constant.Notification;
import com.minori.hrm.utils.NotificationMessage;

public class PushNotificationWorker extends SwingWorker<Integer, Void>{
	
	private static final String FCM_API_SERVER_KEY = "AAAAATUz-0s:APA91bF81PYhkUtCGV8eN_O3-1J2vow7sSNGNqbZG43HOmDRBvIyln4dIg0E09pkfsAgGaoFsYSroV-lsWHoyKg2FP-As_eFjuvw-bMl-MGLVwrlftLm90ihq84qecdbChJZRVBC6ObW";
	private static final String FIREBASE_API_URL = "https://fcm.googleapis.com/fcm/send";
	private static final String CHARSET_UTF_8 = StandardCharsets.UTF_8.toString();

	private String fcm_title;
	private String fcm_body;
	private User createUser;
	private User sendBy;
	private int type;
	private NotificationService notificationService;
	private int leaveRequestId;
	
	public PushNotificationWorker(User createUser, User sendBy, int type,String fcm_title, NotificationService notificationService, int leaveRequestId) {
		this.createUser = createUser;
		this.sendBy = sendBy;
		this.type = type;
		this.fcm_title = fcm_title;
		this.notificationService = notificationService;
		this.leaveRequestId = leaveRequestId;
	}
	

	@Override
	protected Integer doInBackground() throws Exception {
		List<String> deviceTokens = new ArrayList<>();
		deviceTokens.add("d9QPvN7wCbQ:APA91bH5izQj_sD6oIwtdjS_7sy1Wk3pF3Vmdm2c5DsWMv5wm8vxBt5z8N37PHSdQC5gRcx6NuQFDYEuz2QTYAXnpw_F-34zgwGNQlcag_5QtAZbJ2I-W5cTpe7U354ipNfolgtZ1nCm");
		switch (type) {
		case Constant.Notification.REQUEST_TIME_OFF:
			fcm_body = String.format(NotificationMessage.REQUEST_TIME_OFF, createUser.getEmployee().getFirstName()+""+createUser.getEmployee().getLastName());
			notificationService.insertNotification(fcm_title, fcm_body, createUser.getUsername(), sendBy.getUsername(),type);
			break;
		default:
			break;
		}
		pushNotification(deviceTokens, fcm_body, fcm_title);
		return 0;
	}
	
	public void pushNotification (List<String> deviceTokens, String body, String title) throws Exception {
		if (CommonFunction.isEmpty(deviceTokens)) {
			return;
		}
		URL url = new URL(FIREBASE_API_URL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setUseCaches(false);
		conn.setDoInput(true);
		conn.setDoOutput(true);
		
		conn.setRequestMethod(HttpMethod.POST.toString());
		conn.setRequestProperty("Authorization", String.format("key=%s", FCM_API_SERVER_KEY));
		conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		
		JSONObject object = new JSONObject();
		JSONObject info = new JSONObject().put("title", title).put("body", body);
		object.put("notification", info);
		object.put("data", initNotificationBody());
		
		if (deviceTokens.size() > 1) {
			// to multiple devices
			object.put("registration_ids", deviceTokens.toArray(new String[0]));
		} else {
			object.put("to", deviceTokens.get(0)); // to single device
		}

		System.out.println(JSONObject.valueToString(object).replaceAll("\\\\", ""));
		OutputStream outputStream = conn.getOutputStream();
		outputStream.write(object.toString().getBytes(CHARSET_UTF_8));
		outputStream.flush();
		conn.getInputStream();
		
	}
	
	private JSONObject initNotificationBody() throws Exception {
		JSONObject data = new JSONObject();
		data.put("type", type);
		data.put("user", initUserResponse(createUser));
		switch (type) {
		case Notification.REQUEST_TIME_OFF:
			data.put("value", leaveRequestId);
			break;

		default:
			break;
		}
		return data;
	}
	
	private JSONObject initUserResponse(User user) throws Exception {
		String fullName = user.getEmployee().getFirstName() + " " + user.getEmployee().getLastName();
		return new JSONObject().put("userId", user.getUserId()).put("userName", user.getUsername())
				.put("fullName", fullName);

	}

}
