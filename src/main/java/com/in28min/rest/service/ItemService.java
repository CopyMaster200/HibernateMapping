package com.in28min.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28min.rest.dto.Item;
import com.in28min.rest.exception.ItemNotFoundException;
import com.in28min.rest.repository.ItemRepo;

@Service
public class ItemService {

	@Autowired
	ItemRepo itemRepo;
	
	public List<Item> getItems(){
		return itemRepo.findAll();
	}
	
	public Item getItemById(Integer id) {
		Optional<Item> item = itemRepo.findById(id);
		if(item.isPresent()) {
			return item.get();
		}
		throw new ItemNotFoundException("Id: "+id);
	}
	
	public Item createItem(Item item) {
		return itemRepo.save(item);
	}
}
