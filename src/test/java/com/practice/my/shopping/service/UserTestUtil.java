package com.practice.my.shopping.service;

import java.util.Calendar;

import com.practice.my.shopping.entity.User;
import com.practice.my.shopping.entity.UserRole;

public class UserTestUtil {

	public static User prepareUserForTesting() {
		Calendar cal = Calendar.getInstance();
		cal.set(1990, Calendar.SEPTEMBER, 21);
		
		User user = new User();
		user.setAddress("Nguyen Thai Son street");
		user.setCity("Ho Chi Minh city");
		user.setEmail("nvinh@gmail.com");
		user.setFirstName("Vinh");
		user.setLastName("Quang");
		user.setDateOfBirth(cal.getTime());
		user.setUserRole(UserRole.USER);
		return user;
		
	}
}
