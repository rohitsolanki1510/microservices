package com.crm.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.usermanagement.model.LoginRequest;
import com.crm.usermanagement.model.LoginResponse;
import com.crm.usermanagement.model.Response;
import com.crm.usermanagement.service.UserLoginService;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@RestController
@RequestMapping("/login")
public class UserLoginController {
	
	@Autowired
	UserLoginService userLoginService;
	
	@PostMapping
	public ResponseEntity<Response<LoginResponse>> login(@RequestBody LoginRequest loginRequest){
		
		System.out.println("username:"+loginRequest.getUserName()+",passord:"+loginRequest.getPassword());
		
		Response response=userLoginService.login(loginRequest.getUserName(), loginRequest.getPassword());
		return new ResponseEntity<Response<LoginResponse>>(response,HttpStatus.OK);
	}

}
