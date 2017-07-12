package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test1 {

	String name;
	
/*	Test1(String myName){
	  name=myName;	
	}*/
	@Bean
	com.test.PrintClass ControllerClass(){
		return new PrintClass();
	}
	
}
