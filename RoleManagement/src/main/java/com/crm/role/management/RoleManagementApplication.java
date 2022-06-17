package com.crm.role.management;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class RoleManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleManagementApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}

	 @Bean 
	  public Logger logger() { 
		  return LoggerFactory.getLogger("Role-WS"); 
	  }

}
