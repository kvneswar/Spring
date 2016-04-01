package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
	
    public static void main(String[] args){
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Config.xml");
    	Person person = applicationContext.getBean("person", Person.class);
    	System.out.println(person);
    }
}
