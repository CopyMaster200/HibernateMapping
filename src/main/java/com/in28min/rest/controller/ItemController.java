package com.in28min.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.rest.dto.Item;
import com.in28min.rest.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;

	@GetMapping("/getItems")
	public List<Item> getItems() {
		return itemService.getItems();
	}

	@GetMapping("/getItemById/{id}")
	public Item getItemById(@PathVariable Integer id) {
		return itemService.getItemById(id);
	}

	@PostMapping("/createItem")
	public Item createItem(@RequestBody Item item) {
		return itemService.createItem(item);
	}
}
