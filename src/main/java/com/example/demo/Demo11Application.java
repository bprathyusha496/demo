package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo11Application {
@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder initializer) {
	  return initializer.sources(SpringBootThymeleafCrudExApplication.class);
		
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(Demo11Application.class, args);
		System.out.println("jenkings with github...");
	}
	

}
