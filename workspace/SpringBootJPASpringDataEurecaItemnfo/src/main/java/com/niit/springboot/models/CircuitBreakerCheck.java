package com.niit.springboot.models;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


public class CircuitBreakerCheck {
	
	/*@HystrixCommand(fallbackMethod = "FallBack",
	        commandProperties = {
	                @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000"),
	                @HystrixProperty(name = "execution.isolation.strategy", value = "SEMAPHORE")
	        })*/
	
	@HystrixCommand(fallbackMethod = "FallBack")
	public String Check(){
		String retVal="No Error";
		try {
			Thread.sleep(60000);
			if (true){
				throw new RuntimeException("Sleep:---");
			};
		} catch (InterruptedException e) {
			retVal="*************Time Out Error*********************";
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return retVal;
	}
	
	public String FallBack(){
		String retVal="No Error";
		
		 return "From FallBack";
	}

}
