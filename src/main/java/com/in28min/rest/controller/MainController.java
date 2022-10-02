package com.in28min.rest.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	@Qualifier("dataSource1")
	DataSource dataSource1;
	
	@Autowired
	@Qualifier("dataSource2")
	DataSource dataSource2;

	@GetMapping("/showUser")
	public String showUser() throws SQLException {
		Connection con = dataSource1.getConnection();
		ResultSet rs = con.prepareStatement("select * from user").executeQuery();
		StringBuilder sb = new StringBuilder();
		while (rs.next()) {
			sb.append(rs.getString(1) + " " + rs.getString(2)).append("\n");
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	@GetMapping("/showBank")
	public String showBank() throws SQLException {
		Connection con = dataSource2.getConnection();
		ResultSet rs = con.prepareStatement("select * from bank ").executeQuery();
		StringBuilder sb = new StringBuilder();
		while (rs.next()) {
			sb.append(rs.getString(1) + " " + rs.getString(2)).append("\n");
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
}