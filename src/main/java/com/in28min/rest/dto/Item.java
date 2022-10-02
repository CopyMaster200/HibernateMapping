package com.in28min.rest.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@Entity
@Table
@JsonInclude(Include.NON_NULL)
public class Item {

	@Id
	@GeneratedValue(generator="item_sequence")
	private Integer id;
	private String name;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;
}
