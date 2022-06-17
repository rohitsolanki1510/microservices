package com.crm.usermanagement.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.crm.usermanagement.entity.User;
import com.crm.usermanagement.model.ExternalClient;
import com.crm.usermanagement.model.GetRoleClient;
import com.crm.usermanagement.model.GetRoleResponse;
import com.crm.usermanagement.model.GetUserResponse;
import com.crm.usermanagement.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	GetRoleClient getRoleClient;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	ExternalClient externalclient;
	
	@Override
	public List<User> getUsers() {
		System.out.println("Inside service."); 
		
		return userRepository.findAll();
	}

	@Override
	public GetUserResponse getUser(String userId) {
		Optional<User> result=userRepository.findById(Integer.parseInt(userId));
		//user=null;
		GetUserResponse getUserResponse=null;
		 if(result.isPresent()) {
			 User  user=result.get();
			 getUserResponse=modelMapper.map(user, GetUserResponse.class);
			 GetRoleResponse getRoleResponse=getRoleClient.getRole(user.getRoleId().toString());
			 getUserResponse.setRole(getRoleResponse);
			 
			 System.out.println("External Client Response="+externalclient.getDummyResponse(user.getRoleId().toString()));
			 
		 }
		return getUserResponse;
	}

	@Override
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@Override
	public String deleteUser(String userId) {
		userRepository.deleteById(Integer.parseInt(userId));
		
		return "Deleted Employee : "+userId;
	}

}
