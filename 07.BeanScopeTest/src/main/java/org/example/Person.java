package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean {

	private String name;
	private int age;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	/*
	 * Destroy method will not get called for Prototype beans.
	*/
	public void destroy() throws Exception {
		System.out.println("Destroid sucessfully !!!, hashcode: "+hashCode());
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialized Sucessfully !!!, hashcode: "+hashCode());
	}
	
	
}
