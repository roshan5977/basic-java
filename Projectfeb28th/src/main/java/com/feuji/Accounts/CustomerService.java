package com.feuji.Accounts;

import java.util.List;

public class CustomerService {

	public void insert(Customer1 customer1) {
		CustomerDAO customerDAO = new CustomerDAO();
		customerDAO.insertCustomer(customer1);
	}
	public List<Customer1> retrieve() {
		CustomerDAO customerDAO = new CustomerDAO();
		List<Customer1> lists= customerDAO.retrieve();
		return lists;
	}
}
