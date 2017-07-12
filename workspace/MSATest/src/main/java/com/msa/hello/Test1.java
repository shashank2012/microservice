package com.msa.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test1 {

	String name;
	
/*	Test1(String myName){
	  name=myName;	
	}*/
	@Bean
	PrintClass ControllerClass(){
		return new PrintClass();
	}
	
}
