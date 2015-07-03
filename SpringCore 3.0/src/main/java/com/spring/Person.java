package com.spring;

public class Person {
	
	public Person (String firstName, String lastName){
		this.firstName=firstName;
		this.LastName=lastName;		
	}

	private String firstName;
	private String LastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lasttName) {
		LastName = lasttName;
	}
	
}
