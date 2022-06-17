package com.crm.usermanagement.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.usermanagement.entity.User;
import com.crm.usermanagement.model.GetUserResponse;
import com.crm.usermanagement.service.UserService;

@RestController
@RequestMapping("/user")
public class UserCRUDController {
	
	@Autowired
	public Environment env;
	
	@Autowired
	UserService userService;
	
	@Autowired
	Logger logger;
	
	@GetMapping("/")
	private ResponseEntity<List<User>> getUsers() {
		/*
		 * List<User> users=Arrays.asList( new User("roger","roger1510"), new
		 * User("dino","dinoDon123") );
		 */
		System.out.println("getUsers");
		 List<User> users=userService.getUsers();
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	@GetMapping("/{userId}")
	private ResponseEntity<GetUserResponse> getUser(@PathVariable String userId) {
		logger.info("Port:"+env.getProperty("local.server.port"));
		logger.info("TimeOut:"+env.getProperty("token.timeout"));
		logger.info("Before Calling");
		GetUserResponse getUserResponse=userService.getUser(userId);
		logger.info("After Calling");
		//System.out.println("getUser:"+userId);
		return new ResponseEntity<GetUserResponse>(getUserResponse,HttpStatus.OK);
	}

}
