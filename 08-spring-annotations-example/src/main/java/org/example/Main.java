package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(org.example.Config.class);
		System.out.println(applicationContext.getBean(Person.class).getName());
		
	}

}
