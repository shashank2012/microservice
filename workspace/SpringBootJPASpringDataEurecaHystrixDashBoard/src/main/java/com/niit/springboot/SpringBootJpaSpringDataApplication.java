package com.niit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootJpaSpringDataApplication {

public static void main(String[] args) {
SpringApplication.run(SpringBootJpaSpringDataApplication.class, args);
}
} 
