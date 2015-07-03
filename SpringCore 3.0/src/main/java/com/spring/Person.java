package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	
	public Person (String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;		
	}
	
	public Person(){
		
	}

	private String firstName;
	private String lastName;
	private List<Person> personList;
	private Set<Person> personSet;
	private Map<String, Person> personMap;
	private Properties properties;
	
	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public Set<Person> getPersonSet() {
		return personSet;
	}

	public void setPersonSet(Set<Person> personSet) {
		this.personSet = personSet;
	}

	public Map<String, Person> getPersonMap() {
		return personMap;
	}

	public void setPersonMap(Map<String, Person> personMap) {
		this.personMap = personMap;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lasttName) {
		lastName = lasttName;
	}
	
}
