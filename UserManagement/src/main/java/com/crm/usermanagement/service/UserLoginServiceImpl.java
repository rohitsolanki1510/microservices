package com.crm.usermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.usermanagement.entity.User;
import com.crm.usermanagement.model.LoginResponse;
import com.crm.usermanagement.model.Response;
import com.crm.usermanagement.repository.UserRepository;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Response<LoginResponse> login(String username, String password) {
		//check if user present
		User user =userRepository.findByuserNameAndPassword(username,password);
		
		System.out.println("userID="+user.getUserId());
		
		//if null 
		if(user==null) {
			LoginResponse loginResponse=null;
			return new Response<LoginResponse>(loginResponse,"01","Invalid Username/Password") ;
		}
		
		//check if userinactive
		
		//check if user locked
		
		LoginResponse loginResponse=new LoginResponse(user.getUserName());
		return new Response<LoginResponse>(loginResponse,"00","SUCCESS") ;
	}

}
