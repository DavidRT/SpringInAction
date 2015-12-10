package com.pizza.service;

import com.pizza.domain.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	public CustomerServiceImpl() {}
	
	@Override
	public Customer lookupCustomer(String phoneNumber)
			throws CustomerNotFoundException {
		 if("1111111".equals(phoneNumber)) {
		      Customer customer = new Customer();
		      customer.setId(23);
		      customer.setName("David Rod");
		      customer.setAddress("123 Du du du");
		      customer.setCity("Santiago");
		      customer.setState("RM");
		      customer.setZipCode("1234567");
		      customer.setPhoneNumber(phoneNumber);
		      return customer;
		    } else {
		      throw new CustomerNotFoundException();
		    }
	}
	
	

}
