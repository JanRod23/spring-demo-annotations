package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// Read Spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from Spring Container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach boxCoach = context.getBean("boxingCoach", Coach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(boxCoach.getDailyWorkout());
		
		// Close the context
		context.close();
	}

}
