package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	Customer customer = (Customer)applicationContext.getBean("customer");
    	System.out.println(customer + ", "+ customer.getCustomerDAO());
    	
    
    }
}
