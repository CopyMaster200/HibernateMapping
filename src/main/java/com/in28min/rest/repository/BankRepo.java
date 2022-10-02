package com.in28min.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28min.rest.dto.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> {

}
