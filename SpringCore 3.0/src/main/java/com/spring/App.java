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
    	System.out.println("First Name: "+person.getFirstName()+", Last Name:"+person.getLastName()+", Date of Birth"+person.getDateOfBirth());
    	
    	Person personBean = (Person)applicationContext.getBean("personBean");
    	System.out.println(personBean.getPersonList().size());
    	System.out.println(personBean.getPersonSet().size());
    	System.out.println(personBean.getPersonMap().size());
    	System.out.println(personBean.getProperties().size());
    	
    }
}
