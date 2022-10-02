package com.in28min.rest.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28min.rest.dto.Bank;
import com.in28min.rest.dto.Customer;
import com.in28min.rest.exception.BankNotFoundException;
import com.in28min.rest.repository.BankRepo;

@Service
public class BankService {

	@Autowired
	BankRepo bankRepo;

	public List<Bank> getBanks() {
		return bankRepo.findAll();
	}

	public Bank getBankById(Integer id) {
		Optional<Bank> item = bankRepo.findById(id);
		if (item.isPresent()) {
			return item.get();
		}
		throw new BankNotFoundException("Id: " + id);
	}

	public Bank createBank(Bank bank) {
		return bankRepo.save(bank);
	}

	public Set<Customer> getCustomerByBankId(Integer id) {
		Optional<Bank> item = bankRepo.findById(id);
		if (item.isPresent()) {
			return item.get().getCustomer();
		}
		throw new BankNotFoundException("Id: " + id);
	}
}
