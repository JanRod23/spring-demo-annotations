package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Throw 300 jabs, 300 hooks, and 300 upper-cuts";
	}

}
