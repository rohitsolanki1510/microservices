package com.crm.usermanagement;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserManagementApplication {
/*
 * Pending implementations:
 * 1.Manual Routing in API Gateway
 * 2.Spring Security JWT,OAUTH,role based service access
 * 3.RabbitMq Dynamic properties update
 * 4.Retry resilience4j
 * 5.Encryption/Decryption for credentials in properties file
 * 6.Custom Filter & Global filter
 * 7.Docker Deployment
 * 8.PAginationrepository
 * */
	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	
	  @Bean 
	  public Logger logger() { 
		  return LoggerFactory.getLogger("User-WS"); 
	  }
	 

}
