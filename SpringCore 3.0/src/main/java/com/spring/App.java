package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world ! 
 *
 */

public class App 
{
    public static void main( String[] args ){
    
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	Person person = (Person)applicationContext.getBean("person");
    	System.out.println("First Name: "+person.getFirstName()+", Last Name:"+person.getLastName());
    	person.setFirstName("Lakshmi");
    	person = (Person)applicationContext.getBean("person");
    	System.out.println(person.getFirstName());
    	
    }
}
