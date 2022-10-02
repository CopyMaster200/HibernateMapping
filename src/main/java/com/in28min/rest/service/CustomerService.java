package com.in28min.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.in28min.rest.dto.Customer;
import com.in28min.rest.exception.CustomerNotFoundException;
import com.in28min.rest.repository.CustomerRepo;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;
	
	public Customer createCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
	
	public List<Customer> getCustomers(){
		return customerRepo.findAll();
	}
	
	public Customer getCustomerById(Integer id) {
		Optional<Customer> cust = customerRepo.findById(id);
		if(cust.isPresent()) {
			return cust.get();
		}
		throw new CustomerNotFoundException("id: "+id);
	}
	
	public Customer updateCustomer(Customer customer) {
//		System.out.println("***********"+customer);
//		Customer cust = customerRepo.getById(customer.getId());
//		System.out.println("***********"+cust);
//		cust.setAddress(customer.getAddress());
//		cust.setBank(customer.getBank());
//		cust.setItems(customer.getItems());
//		cust.setName(customer.getName());
		return customerRepo.save(customer);
	}
}
