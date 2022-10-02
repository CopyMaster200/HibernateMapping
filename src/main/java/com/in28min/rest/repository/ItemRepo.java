package com.in28min.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28min.rest.dto.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
