package com.homebrew.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.homebrew.management.Exception.FeignErrorDecoder;

@SpringBootApplication
@EnableFeignClients
public class HomeBrewManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeBrewManagerApplication.class, args);
	}

}
