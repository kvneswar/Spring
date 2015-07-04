package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("customerAlias")
//@Service("customerAlias")
public class Customer {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	@Override
	public String toString() {
		return "Customer";
	}

}
