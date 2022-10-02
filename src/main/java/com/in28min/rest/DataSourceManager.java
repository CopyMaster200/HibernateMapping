package com.in28min.rest;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceManager {

	@Bean("dataSource1")
	@Primary
	@ConfigurationProperties(prefix = "app.datasource1")
	public DataSource primaryDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean("dataSource2")
	@ConfigurationProperties(prefix = "app.datasource2")
	public DataSource secondaryDataSource() {
		return DataSourceBuilder.create().build();
	}
}
