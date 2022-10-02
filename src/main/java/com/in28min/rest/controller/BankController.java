package com.in28min.rest.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.rest.dto.Bank;
import com.in28min.rest.dto.Customer;
import com.in28min.rest.service.BankService;

@RestController
public class BankController {

	@Autowired
	BankService bankService;

	@GetMapping("/getBanks")
	public List<Bank> getBanks() {
		return bankService.getBanks();
	}

	@GetMapping("/getBankById/{id}")
	public Bank getBankById(@PathVariable Integer id) {
		return bankService.getBankById(id);
	}
	
	@GetMapping("/getCustomerByBankId/{id}")
	public Set<Customer> getCustomerByBankId(@PathVariable Integer id) {
		return bankService.getCustomerByBankId(id);
	}
}
