package org.example.beaninstatiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App{
	
	
    public static void main(String[] args){
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"Spring-Config.xml"});
    	Person person = applicationContext.getBean("person", Person.class);
    	System.out.println(person);
    	
    	Person staticPerson = applicationContext.getBean("staticFactoryInstatiation", Person.class);
    	System.out.println(staticPerson);
    	
    	Person nonStaticPerson = applicationContext.getBean("nonStaticFactoryInstantiation", Person.class);
    	System.out.println(nonStaticPerson);
    	
    }
    
}
