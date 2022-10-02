package com.in28min.rest.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Data
@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Bank {

	@Id
	@GeneratedValue(generator="bank_sequence")
	private Integer id;
	private String bankName;
	private Double balance;
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Customer> customer;
}
