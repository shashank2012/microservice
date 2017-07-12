package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class FirstClass {
	
	  /*@Autowired
	  ControllerClass cClass;*/
	 @Autowired
	 Test1 test;
	
	  
  public static void main(String[] args) {

		 ApplicationContext appContext = new AnnotationConfigApplicationContext(Test1.class);
		 PrintClass b1= appContext.getBean(PrintClass.class);
		 b1.printName();
         
		
	  
      
	}

  
void Test() {
	//cClass.printName();
}
  
}
