package org.example.beaninstatiation;

public class Person {
	
	public Person(){
		super();
	}

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
		return name+", "+age+", "+address.addressLine1+", "+address.addressLine2+", "+address.city+", "+address.state+", "+address.zipCode;
	}
	
	public static Person instantiateMe(){
		return new Person();
	}
	
	public Person instantiateMeInNonStaticWay(){
		return new Person();
		
	}

	public static class Address{
		
		public Address(){
			super();
		}
		
		private String addressLine1;
		private String addressLine2;
		private String city;
		private String state;
		private int zipCode;
		
		public String getAddressLine1() {
			return addressLine1;
		}
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		public String getAddressLine2() {
			return addressLine2;
		}
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getZipCode() {
			return zipCode;
		}
		public void setZipCode(int zipCode) {
			this.zipCode = zipCode;
		}
	}

}
