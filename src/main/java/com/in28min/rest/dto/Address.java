package com.in28min.rest.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table
public class Address {
	
	@Id
	@GeneratedValue(generator="address_sequence")
	private Integer id;
	private String country;
	private Integer pinCode;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "address")
	private Customer customer;
}
