package com.in28min.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28min.rest.dto.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
