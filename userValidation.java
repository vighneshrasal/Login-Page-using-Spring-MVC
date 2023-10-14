package com.spring.masterclass.springmvc;

import org.springframework.stereotype.Service;

@Service
public class userValidation {
	public boolean isUserValid(String name, String password) {
		if(name.equals("vighneshrasal") && password.equals("vighnesh050101")) {
			return true;
		}
		return false;
	}
}
