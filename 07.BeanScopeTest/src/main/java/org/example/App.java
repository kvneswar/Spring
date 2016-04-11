package org.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
	
    public static void main(String[] args) {
       ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Config.xml");
       Person singletonPerson = applicationContext.getBean("singletonPerson", Person.class);
       System.out.println(singletonPerson);
       System.out.println("Hashcode:" +singletonPerson.hashCode());
       
       System.out.println("===============");
       
       Person prototypePerson = applicationContext.getBean("prototypePerson", Person.class);
       System.out.println(prototypePerson);
       System.out.println("Hashcode:" +prototypePerson.hashCode());
       
       applicationContext.close();
    }
}
