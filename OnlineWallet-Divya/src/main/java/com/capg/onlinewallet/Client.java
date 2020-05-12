package com.capg.onlinewallet;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;



/*@ComponentScan(basePackages= {"com.capg.onlinewallet"}) 

@Configuration

@EntityScan("com.capg.onlinewallet.entities") */

@SpringBootApplication 

public class Client {

	public static void main(String[] args) {
		SpringApplication.run(Client.class, args);
		System.out.println("Spring Boot Application started..");
	}

	 
}
