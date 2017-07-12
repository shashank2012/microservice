package com.test;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class HelloDataConfig {

	DriverManagerDataSource ds;
	
	DriverManagerDataSource createDataSource(){
		
		DriverManagerDataSource ds1= null;
		ds1.setUsername("root");
		ds1.setDriverClassName("com.mysql.jdbc.Driver");
		ds1.setPassword("root");
		ds1.setUrl("jdbc:mysql://localhost:3306/mysql");
		return ds1;
	}

}
