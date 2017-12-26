package com.minori.hrm.utils;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class CommonFunction {

	/**
	 * The get current user
	 * 
	 * @return
	 */
	public static final String getCurrentUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			String currentUserName = authentication.getName();
			return currentUserName;
		}
		return null;
	}

	public static Integer convertToHour(Long timeStamp) {
		Date date = new Date(timeStamp);
		Format format = new SimpleDateFormat("yyyyMMddHH:mm:ss:SSS");
		return Integer.valueOf(format.format(date).substring(8, 10));
	}

	public static int convertToMinute(Long timeStamp) {
		Date date = new Date(timeStamp);
		Format format = new SimpleDateFormat("yyyyMMddHH:mm:ss:SSS");
		return Integer.valueOf(format.format(date).substring(11, 13));
	}

	public static int convertToHour(String timeStart) {
		String[] list = timeStart.split(":");
		return Integer.valueOf(list[0]);
	}

	public static int convertToMinute(String timeStart) {
		String[] list = timeStart.split(":");
		return Integer.valueOf(list[1]);
	}

	public static long distanceBetwenDate(Long timeStamStart, Long timeStamEnd) {
		long diff = timeStamEnd - timeStamStart;
		long ddays = diff / (24 * 60 * 60 * 1000);
		return ddays;
	}

	public  static long calculateNumberOfWeekendsInRange(Long startDate, Long endDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(startDate);

		long counter = 0;
		while (!calendar.getTime().after(new Date(endDate))) {
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			if (dayOfWeek == 1 || dayOfWeek == 7) {
				counter++;
			}
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}
		return counter;
	}
	
	public static final Optional<String> getCurrentAcount() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			String currentUserName = authentication.getName();
			return Optional.of(currentUserName);
		}
		return Optional.empty();
	}
	
	/**
	 * Null-safe check if the specified collection is empty.
	 * <p>
	 * Null returns true.
	 * 
	 * @param coll  the collection to check, may be null
	 * @return true if empty or null
	 * @since Commons Collections 3.2
	 */
	public static final boolean isEmpty(Collection<?> collection) {
	    return (collection == null || collection.isEmpty());
	}


}
