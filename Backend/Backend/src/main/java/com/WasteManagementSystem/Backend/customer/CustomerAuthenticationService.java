package com.WasteManagementSystem.Backend.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WasteManagementSystem.Backend.entity.User;


@Service
public class CustomerAuthenticationService {
	@Autowired
	private CustomerAuthenticationRepository repo;
	
	public Customer saveCustomer(Customer customer) {
		return repo.save(customer);
	}
	
	public Customer fetchCustomerByEmail(String email) {
		return repo.findByEmail(email);
	}
	
	public Customer fetchCustomerByEmailAndPassword(String email,String password) {
		return repo.findByEmailAndPassword(email, password);
	}

	//public List<CustomerList> findBytermstatus(){
	//	return repo.findBytermstatus();
	
	public Customer saveUser(Customer customer) {
		return repo.save(customer);
	}
}
