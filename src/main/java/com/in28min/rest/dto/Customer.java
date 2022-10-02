package com.in28min.rest.dto;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Data
@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Customer {
	@Id
	@GeneratedValue(generator="customer_sequence")
	private Integer id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private List<Item> items;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable( name = "bank_customer",
//		joinColumns = {@JoinColumn(name = "fk_customer")},
//		inverseJoinColumns = {@JoinColumn(name="fk_bank")}
//			)
	private Set<Bank> bank;
}
